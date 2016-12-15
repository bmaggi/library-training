/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Library;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * Check that a library has a minimum of books
 */
public class MinimumBooksInLibraryModelConstraint extends AbstractModelConstraint {

	private static final int LIBRARY_MINIMUM_BOOK_NUMBER = 2;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.
	 * emf.validation.IValidationContext)
	 */
	@Override
	public IStatus validate(IValidationContext context) {
		Library library = (Library) context.getTarget();
		Package pakage = library.getBase_Package();
		if (pakage != null) {
			int countBooks = countBooks(pakage.getOwnedElements());
			if (countBooks < LIBRARY_MINIMUM_BOOK_NUMBER) {
				return context.createFailureStatus(pakage.getName());
			}
		}
		return context.createSuccessStatus();
	}

	private int countBooks(EList<Element> elementList) {
		int numberOfBooks = 0;
		for (Element element : elementList) {
			if (UMLUtil.getStereotypeApplication(element, Book.class) != null) {
				numberOfBooks++;
			}
		}
		return numberOfBooks;
	}

}
