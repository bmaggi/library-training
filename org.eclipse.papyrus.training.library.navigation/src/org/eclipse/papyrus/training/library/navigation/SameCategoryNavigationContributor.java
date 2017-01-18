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
package org.eclipse.papyrus.training.library.navigation;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.infra.services.navigation.service.NavigableElement;
import org.eclipse.papyrus.infra.services.navigation.service.NavigationContributor;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book;
import org.eclipse.papyrus.training.library.profile.library.BookCategory;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

public class SameCategoryNavigationContributor implements NavigationContributor {

	/* 
	 * Get all other books that have the same category
	 * 
	 * @see org.eclipse.papyrus.infra.services.navigation.service.NavigationContributor#getNavigableElements(java.lang.Object)
	 */
	@Override
	public List<NavigableElement> getNavigableElements(Object fromElement) {
		List<NavigableElement> result = new LinkedList<>();
		Element element = org.eclipse.papyrus.uml.tools.utils.UMLUtil.resolveUMLElement(fromElement);
		if (element instanceof Class){
			final Book book = UMLUtil.getStereotypeApplication(element, Book.class);
			if (book != null) {
				final BookCategory category = book.getCategory();
				Resource eResource = book.eResource();
				EList<EObject> contents = eResource.getContents();
				result = 
						contents.stream()
						.filter(l -> !l.equals(book))		
						.filter(l -> l instanceof Book)
						.map(l -> (Book) l)
						.filter(l -> category.equals(l.getCategory()))
						.map(l -> l.getBase_Class())
						.map(clazz -> new SameCategoryNavigableElement(clazz))
						.collect(Collectors.toList());
			}
		}
		return result;
	}
}
