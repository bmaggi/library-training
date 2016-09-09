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
package org.eclipse.papyrus.training.library.compare.groups;

import java.util.Collection;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.rcp.ui.internal.structuremergeviewer.groups.impl.BasicDifferenceGroupImpl;
import org.eclipse.emf.compare.rcp.ui.structuremergeviewer.groups.AbstractDifferenceGroupProvider;
import org.eclipse.emf.compare.rcp.ui.structuremergeviewer.groups.IDifferenceGroup;
import org.eclipse.emf.compare.uml2.internal.StereotypeAttributeChange;
import org.eclipse.emf.compare.uml2.internal.StereotypedElementChange;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.training.library.profile.library.BookCategory;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public class BookChangesByCategory extends AbstractDifferenceGroupProvider {

	private static final String EXTLIBRARY_BOOK = "extlibrary::Book";
	private static final String EXTLIBRARY_CATEGORY = "category";

	@Override
	protected Collection<? extends IDifferenceGroup> buildGroups(Comparison comparison) {
		final Builder<IDifferenceGroup> listBuilder = ImmutableList.builder();
		for (BookCategory category : BookCategory.values()) {
			listBuilder.add(createCategoryGroup(category.getName()));
		}
		return asListOfNonEmptyGroups(buildSubtrees(listBuilder.build()));
	}

	private BasicDifferenceGroupImpl createCategoryGroup(String category) {
		return new BasicDifferenceGroupImpl(getComparison(), concernsBookWithCategory(category), category,
				getCrossReferenceAdapter());
	}

	private Predicate<? super Diff> concernsBookWithCategory(final String category) {
		return new Predicate<Diff>() {
			public boolean apply(Diff input) {
				final EObject eObject = getAffectedElement(input);
				return eObject != null && isBookOfCategory(eObject, category);
			}
		};
	}

	private EObject getAffectedElement(Diff input) {
		final EObject affectedElement;
		if (input instanceof StereotypedElementChange) {
			affectedElement = ((StereotypedElementChange) input).getDiscriminant();
		} else if (input instanceof StereotypeAttributeChange) {
			affectedElement = ((StereotypeAttributeChange) input).getMatch().getLeft();
		} else if (input instanceof ReferenceChange) {
			affectedElement = ((ReferenceChange) input).getValue();
		} else {
			affectedElement = null;
		}
		return affectedElement;
	}

	private boolean isBookOfCategory(EObject value, String category) {
		if (value instanceof Class) {
			final Class umlClass = (Class) value;
			final Stereotype stereotype = umlClass.getAppliedStereotype(EXTLIBRARY_BOOK);
			if (stereotype != null) {
				final BookCategory categoryValue = (BookCategory) umlClass.getValue(stereotype, EXTLIBRARY_CATEGORY);
				return category.equals(categoryValue.getName());
			}
		}
		return false;
	}

	private ImmutableList<IDifferenceGroup> buildSubtrees(ImmutableList<IDifferenceGroup> groups) {
		for (IDifferenceGroup group : groups) {
			if (group instanceof BasicDifferenceGroupImpl) {
				BasicDifferenceGroupImpl groupImpl = (BasicDifferenceGroupImpl) group;
				groupImpl.buildSubTree();
			}
		}
		return groups;
	}

	private Collection<? extends IDifferenceGroup> asListOfNonEmptyGroups(Collection<IDifferenceGroup> groups) {
		Collection<IDifferenceGroup> nonEmptyGroups = Lists.newArrayList();
		for (IDifferenceGroup group : groups) {
			if (!group.getChildren().isEmpty()) {
				nonEmptyGroups.add(group);
			}
		}
		return ImmutableList.copyOf(nonEmptyGroups);
	}

}
