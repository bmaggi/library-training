/*****************************************************************************
 * Copyright (c) 2017 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *   
 *****************************************************************************/
package org.eclipse.papyrus.training.library.validation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmf.runtime.emf.core.util.CrossReferenceAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Element;

/**
 * The same book shouldn't be displayed twice in the same diagram
 */
public class NoBookTwiceOneShellModelConstraint extends AbstractModelConstraint {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		EObject target = context.getTarget();
		if (target instanceof Element) {
			Element element = (Element) target;
			Set<View> crossReferencingViews = getCrossReferencingViews(element);
			if (crossReferencingViews.size() > 1) {
				return context.createFailureStatus(target);
			}
		}
		return context.createSuccessStatus();
	}

	public static Set<View> getCrossReferencingViews(EObject referencedObject) {
		Set<View> referencingObjects = new HashSet<>();
		CrossReferenceAdapter crossReferenceAdapter = getCrossReferenceAdapter(referencedObject);
		if (crossReferenceAdapter != null) {
			// Retrieve all views referencing the referencedObject
			Iterator<?> views = crossReferenceAdapter.getInverseReferencers(referencedObject,
					NotationPackage.eINSTANCE.getView_Element(), NotationPackage.eINSTANCE.getView()).iterator();
			while (views.hasNext()) {
				View view = (View) views.next();
				if (!(view instanceof Diagram)) { 
					referencingObjects.add(view);
				}
			}
		}
		return referencingObjects;
	}

	public static CrossReferenceAdapter getCrossReferenceAdapter(EObject element) {
		CrossReferenceAdapter crossReferenceAdapter = CrossReferenceAdapter.getExistingCrossReferenceAdapter(element);
		if (crossReferenceAdapter == null) {
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(element);
			if (domain != null) {
				crossReferenceAdapter = CrossReferenceAdapter.getCrossReferenceAdapter(domain.getResourceSet());
			}
		}
		return crossReferenceAdapter;
	}

}
