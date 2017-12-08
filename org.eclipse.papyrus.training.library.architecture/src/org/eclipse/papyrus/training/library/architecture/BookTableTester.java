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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.papyrus.infra.nattable.tester.ITableTester;
import org.eclipse.papyrus.training.library.profile.library.LibraryPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.util.UMLUtil;

public class BookTableTester implements ITableTester {

	/**
	 *
	 * @see org.eclipse.papyrus.infra.nattable.tester.ITableTester#isAllowed(java.lang.Object)
	 *
	 * @param context
	 * @return
	 */
	@Override
	public IStatus isAllowed(Object context) {	
		if (context instanceof Element) {
			Element el = (Element) context;
			ISpecializationType type = (ISpecializationType) ElementTypeRegistry.getInstance().getType("org.eclipse.papyrus.training.library.profile.extlibrary.Book");
			IElementMatcher matcher = type.getMatcher();
			if (context instanceof Package || matcher.matches(el)) {
				Profile profile = UMLUtil.getProfile(LibraryPackage.eINSTANCE, el);
				if (profile != null){
					final String packageQN = profile.getQualifiedName();
					if (el.getNearestPackage().getAppliedProfile(packageQN, true) != null) {
						return new Status(IStatus.OK, Activator.PLUGIN_ID, "The context allowed to create a Book Table"); //$NON-NLS-1$
					} else {
						return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The profile "+packageQN+" is not applied on the model"); //$NON-NLS-1$ //$NON-NLS-2$
					}					
				}

			}
		}
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "The context is not an UML Element"); //$NON-NLS-1$
	}
}
