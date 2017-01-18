/*****************************************************************************
 * Copyright (c) 2017 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Benoit Maggi (CEA LIST) benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.training.library.navigation;

import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.services.labelprovider.service.LabelProviderService;
import org.eclipse.papyrus.infra.services.navigation.service.ExtendedNavigableElement;
import org.eclipse.papyrus.infra.widgets.util.IRevealSemanticElement;
import org.eclipse.papyrus.infra.widgets.util.NavigationTarget;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Navigates from a NamedElementdElement to its NamedElement declaration
 * 
 */
//TODO : open api in GenericNavigableElement to allow change menu text 
//       then remove this class
public class SameCategoryNavigableElement implements ExtendedNavigableElement {

	protected Element element;

	/**
	 *
	 * @param element
	 *            The NamedElement to navigate to. May be null.
	 */
	public SameCategoryNavigableElement(Element element) {
		this.element = element;
	}

	@Override
	public String getLabel() {
		return "This book "+getElementLabel() + " is in the same category";
	}

	@Override
	public String getDescription() {
		return "This book "+getElementLabel() + " is in the same category";
	}

	protected String getElementLabel() {
		if (element == null) {
			return " (Undefined)";
		} else if (element instanceof NamedElement) {
			if (((NamedElement) element).getName() == null || ((NamedElement) element).getName().isEmpty()) {
				return " (Unnamed)"; // Often happens for Associations, as their
										// name is derived in the UI
			} else {
				return ((NamedElement) element).getName();
			}
		} else {
			return " (Unnamed)";
		}
	}

	@Deprecated
	public void navigate(IRevealSemanticElement navigationContext) {
		throw new UnsupportedOperationException("Don't use deprecated methods"); //$NON-NLS-1$
	}

	@Override
	public Image getImage() {
		if (element != null) {
			try {
				return ServiceUtilsForEObject.getInstance().getServiceRegistry(element)
						.getService(LabelProviderService.class).getLabelProvider().getImage(element);
			} catch (ServiceException e) {
				// TODO the exception should be logged
			}			
		}

		return null;
	}

	/**
	 * Enabled when the element is defined
	 */
	@Override
	public boolean isEnabled() {
		return element != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean navigate(NavigationTarget navigationContext) {
		if (!isEnabled()) {
			return false;
		}
		return navigationContext.revealElement(element);
	}


	/**
	 * @see org.eclipse.papyrus.infra.services.navigation.service.NavigableElement#getSemanticElement()
	 *
	 * @return
	 */
	@Override
	public Object getSemanticElement() {
		return element;
	}
}
