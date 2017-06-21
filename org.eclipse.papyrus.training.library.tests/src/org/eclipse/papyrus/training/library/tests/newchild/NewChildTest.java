/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.training.library.tests.newchild;


import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.CreationMenu;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test the new child model :
 * - validate the model
 */
@SuppressWarnings("nls")
public class NewChildTest {

	public static final String NEW_CHILD_MENU_PATH = org.eclipse.papyrus.training.library.newchild.Activator.PLUGIN_ID + "/resources/newChild.creationmenumodel";

	@BeforeClass
	public static void loadElementTypeSet(){
		ElementTypeSetConfigurationRegistry.getInstance();
	}

	/**
	 * Check that referenced element type are in the registry
	 */
	@Test
	public void checkMenuNewChildElementTypeIdRefs() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(NEW_CHILD_MENU_PATH, true);
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		Resource resource = resourceSetImpl.getResource(createPlatformPluginURI, true);

		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = (EObject) allContents.next();
			if (eObject instanceof CreationMenu) {
				String iconPath = ((CreationMenu) eObject).getIcon();
				 if (iconPath != null && !"".equals(iconPath)){
						try {
							Assert.assertNotNull("The icon "+iconPath+" can't be found", FileLocator.find(new URL(iconPath)));
						} catch (MalformedURLException e) {
							Assert.fail("The new child menu is refering to a malformed url "+iconPath);
						}
				 }
			}
		}
	}
	
}