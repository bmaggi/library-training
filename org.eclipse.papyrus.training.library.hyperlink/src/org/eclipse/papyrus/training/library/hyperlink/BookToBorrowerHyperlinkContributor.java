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
package org.eclipse.papyrus.training.library.hyperlink;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.infra.hyperlink.object.HyperLinkObject;
import org.eclipse.papyrus.infra.hyperlink.object.HyperLinkSpecificObject;
import org.eclipse.papyrus.infra.hyperlink.service.HyperlinkContributor;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Borrows;
import org.eclipse.papyrus.uml.diagram.common.util.CrossReferencerUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

public class BookToBorrowerHyperlinkContributor implements HyperlinkContributor {

	/**
	 * @see org.eclipse.papyrus.infra.hyperlink.service.HyperlinkContributor#getHyperlinks(java.lang.Object)
	 *
	 * @param object
	 * @return
	 */
	@Override
	public List<HyperLinkObject> getHyperlinks(Object object) {
		List<HyperLinkObject> hyperlinks = new ArrayList<>();
		if (object instanceof Class) {
			Class clazz = (Class) object;
			if (UMLUtil.getStereotypeApplication(clazz, Book.class) != null) {
				// TODO: extract a method to get the borrower from a book in the
				// java implementation of the profile
				EList<DirectedRelationship> targetDirectedRelationships = clazz.getTargetDirectedRelationships();
				for (DirectedRelationship dependency : targetDirectedRelationships) {
					if (UMLUtil.getStereotypeApplication(dependency, Borrows.class) != null) {
						EList<Element> targets = dependency.getSources();
						for (Element element : targets) {
							Set<View> crossReferencingViews = CrossReferencerUtil.getCrossReferencingViews(element,null);
							// we take the first available view
							Object firstView = crossReferencingViews.toArray()[0];
							HyperLinkSpecificObject hyperlink = new HyperLinkSpecificObject((EObject) firstView);
							hyperlinks.add(hyperlink);
						}
					}
				}
			}
		}
		return hyperlinks;
	}
}
