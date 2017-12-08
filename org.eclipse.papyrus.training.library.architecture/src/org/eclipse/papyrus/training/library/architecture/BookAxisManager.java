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
package org.eclipse.papyrus.training.library.architecture;

import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage;
import org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;



/**
 * AxisManager for Book
 */
public class BookAxisManager extends AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager<Book> {

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.manager.axis.AbstractAxisManager#canCreateAxisElement(java.lang.String)
	 *
	 * @param elementId
	 * @return
	 */
	@Override
	public boolean canCreateAxisElement(String elementId) {
		return "org.eclipse.papyrus.training.library.profile.extlibrary.Book".equals(elementId);
	}


	/**
	 *
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#getStereotypeApplication(org.eclipse.uml2.uml.Element)
	 *
	 * @param el
	 * @return
	 */
	@Override
	protected Book getStereotypeApplication(Element el) {
		return UMLUtil.getStereotypeApplication(el, Book.class);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#isInstanceOfRequiredStereotypeApplication(java.lang.Object)
	 *
	 * @param object
	 * @return
	 */
	@Override
	protected boolean isInstanceOfRequiredStereotypeApplication(final Object object) {
		return object instanceof Book;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#getStereotypeBaseElement(org.eclipse.emf.ecore.EObject)
	 *
	 * @param stereotypeApplication
	 * @return
	 */
	@Override
	protected Element getStereotypeBaseElement(final Book stereotypeApplication) {
		return stereotypeApplication.getBase_Class();
	}

	/**
	 *
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#isAllowedAsBaseElement(org.eclipse.uml2.uml.Element)
	 *
	 * @param element
	 * @return
	 */
	@Override
	protected boolean isAllowedAsBaseElement(final Element element) {
		return element instanceof Class;
	}


	/**
	 *
	 * @see org.eclipse.papyrus.uml.nattable.manager.axis.AbstractStereotypedElementUMLSynchronizedOnFeatureAxisManager#getStereotypeApplicationBasePropertyName()
	 *
	 * @return
	 */
	@Override
	protected String getStereotypeApplicationBasePropertyName() {
		return ExtLibraryProfilePackage.eINSTANCE.getItem_Base_Class().getName();
	}

}
