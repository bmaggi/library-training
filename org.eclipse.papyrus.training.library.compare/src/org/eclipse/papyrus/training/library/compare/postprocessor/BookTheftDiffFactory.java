/*******************************************************************************
 * Copyright (c) 2015 EclipseSource Services GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Philip Langer - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.training.library.compare.postprocessor;

import static org.eclipse.emf.compare.utils.EMFComparePredicates.ofKind;

import java.util.Set;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.internal.utils.ComparisonUtil;
import org.eclipse.emf.compare.uml2.internal.DirectedRelationshipChange;
import org.eclipse.emf.compare.uml2.internal.StereotypeApplicationChange;
import org.eclipse.emf.compare.uml2.internal.postprocessor.AbstractUMLChangeFactory;
import org.eclipse.emf.compare.utils.IEqualityHelper;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.papyrus.training.library.compare.library.BookTheftDiff;
import org.eclipse.papyrus.training.library.compare.library.LibraryCompareFactory;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;

@SuppressWarnings("restriction")
public class BookTheftDiffFactory extends AbstractUMLChangeFactory {

	private static final EClass DEPENDENCY = UMLPackage.eINSTANCE.getDependency();
	private static final String EXTLIBRARY_BORROWS = "extlibrary::Borrows";

	@Override
	public java.lang.Class<? extends Diff> getExtensionKind() {
		return BookTheftDiff.class;
	}

	@Override
	public boolean handles(Diff input) {
		if (input instanceof StereotypeApplicationChange && ofKind(DifferenceKind.DELETE).apply(input)) {
			final StereotypeApplicationChange stereotypeApplicationChange = (StereotypeApplicationChange) input;
			final EObject discriminant = stereotypeApplicationChange.getDiscriminant();
			return discriminant instanceof Book && hasIncomingBorrowsDependency((Book) discriminant);
		}
		return false;
	}

	private boolean hasIncomingBorrowsDependency(Book book) {
		final Class umlClass = book.getBase_Class();
		if (umlClass.getTargetDirectedRelationships(DEPENDENCY).size() > 0) {
			return isBorrowsDependency(umlClass.getTargetDirectedRelationships(DEPENDENCY).get(0));
		}
		return false;
	}

	private boolean isBorrowsDependency(DirectedRelationship directedRelationship) {
		if (directedRelationship instanceof Dependency) {
			final Dependency dependency = (Dependency) directedRelationship;
			return dependency.getAppliedStereotype(EXTLIBRARY_BORROWS) != null;
		}
		return false;
	}

	@Override
	public Diff create(Diff input) {
		final BookTheftDiff extension = (BookTheftDiff) super.create(input);
		final StereotypeApplicationChange stereotypeApplicationChange = (StereotypeApplicationChange) input;
		final Book book = (Book) stereotypeApplicationChange.getDiscriminant();
		final Class umlClass = book.getBase_Class();
		final Dependency dependency = (Dependency) umlClass.getTargetDirectedRelationships(DEPENDENCY).get(0);
		final NamedElement borrowerBase = (NamedElement) dependency.getSources().get(0);

		extension.setBookName(book.getTitle());
		extension.setBorrowerName(borrowerBase.getName());
		extension.setKind(DifferenceKind.DELETE);

		return extension;
	}

	@Override
	public void setRefiningChanges(Diff extension, DifferenceKind extensionKind, Diff refiningDiff) {
		if (refiningDiff instanceof StereotypeApplicationChange) {
			final StereotypeApplicationChange stereotypeApplicationChange = (StereotypeApplicationChange) refiningDiff;
			final Book book = (Book) stereotypeApplicationChange.getDiscriminant();
			final Class umlClass = book.getBase_Class();
			final Dependency dependency = (Dependency) umlClass.getTargetDirectedRelationships(DEPENDENCY).get(0);

			// add refining dif or the refining diffs of refining diffs
			// if refining diff is already a refining diff
			if (refiningDiff.getRefines().isEmpty()) {
				extension.getRefinedBy().add(refiningDiff);
			} else {
				extension.getRefinedBy().addAll(refiningDiff.getRefines());
			}

			// add deletion of dependency
			final Comparison comparison = ComparisonUtil.getComparison(refiningDiff);
			final IEqualityHelper equalityHelper = comparison.getEqualityHelper();

			for (Diff diff : comparison.getMatch(dependency.getOwner()).getDifferences()) {
				if (diff instanceof DirectedRelationshipChange
						&& ofKind(DifferenceKind.DELETE).apply(diff)
						&& equalityHelper.matchingValues(dependency,
								((DirectedRelationshipChange) diff).getDiscriminant())) {
					extension.getRefinedBy().add(diff);
				}
			}
		}
	}

	@Override
	protected EObject getDiscriminant(Diff input) {
		final Book book = (Book) ((StereotypeApplicationChange) input).getDiscriminant();
		return book.getBase_Class();
	}

	@Override
	public Match getParentMatch(Diff input) {
		final Book book = (Book) ((StereotypeApplicationChange) input).getDiscriminant();
		return ComparisonUtil.getComparison(input).getMatch(book.getBase_Class().getPackage());
	}

	@Override
	public Diff createExtension() {
		return LibraryCompareFactory.eINSTANCE.createBookTheftDiff();
	}

	@Override
	protected Switch<Set<EObject>> getDiscriminantsGetter() {
		// Empty implementation
		return null;
	}

}
