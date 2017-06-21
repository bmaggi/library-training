/*****************************************************************************
 * Copyright (c) 2016 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.training.library.tests.palette;


import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ChildConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.DrawerConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.IconDescriptor;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.PaletteConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ToolConfiguration;
import org.eclipse.papyrus.infra.gmfdiag.paletteconfiguration.ToolKind;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the palette model :
 * - validate that ids are following the pattern
 */
@SuppressWarnings("nls")
public class PaletteTest {

	public static final String PALETTE_PATH = org.eclipse.papyrus.training.library.palette.Activator.PLUGIN_ID+"/resources/extlibrary.classdiagram.paletteconfiguration";
	

	public static final String NODE = "node"; 

	public static final String EDGE = "edge"; 

	private String rootPath = "org.eclipse.papyrus.training.library"; 
	
	@Before
	public void loadElementTypeRegistry(){
		ElementTypeSetConfigurationRegistry.getInstance();
	}
	
	public boolean assertPaletteId(String id) {
		return id != null && (id.startsWith(rootPath + "." + NODE) || id.startsWith(rootPath + "." + EDGE));
	}
	
	
	/**
	 * Check palette ids and element type reference
	 */
	@Test
	public void checkPaletteIds() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(PALETTE_PATH, true);
		ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
		Resource resource = resourceSetImpl.getResource(createPlatformPluginURI, true);

		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject eObject = (EObject) allContents.next();

			if (eObject instanceof PaletteConfiguration) {
				PaletteConfiguration p = (PaletteConfiguration) eObject;
				EList<DrawerConfiguration> drawerConfigurations = p.getDrawerConfigurations();
				for (DrawerConfiguration drawerConfiguration : drawerConfigurations) {
					EList<ChildConfiguration> ownedConfigurations = drawerConfiguration.getOwnedConfigurations();
					for (ChildConfiguration childConfiguration : ownedConfigurations) {

						// check id
						String id = childConfiguration.getId();
						Assert.assertTrue("Malformed palette id : " + id, assertPaletteId(id));

						if (childConfiguration instanceof ToolConfiguration) {
							ToolConfiguration toolConfiguration = (ToolConfiguration) childConfiguration;

							// check icon file
							IconDescriptor icon = toolConfiguration.getIcon();
							String iconPath = "platform:/plugin/" + icon.getPluginID() + "/" + icon.getIconPath();
							if (iconPath != null && !"".equals(iconPath)) {
								try {
									URL url = new URL(iconPath);
									Assert.assertNotNull("The icon " + iconPath + "(for : " + toolConfiguration.getId()
											+ ") can't be found", FileLocator.find(url));
								} catch (MalformedURLException e) {
									Assert.fail("The new child menu is refering to a malformed url " + iconPath);
								}
							}

							ToolKind kind = toolConfiguration.getKind();
							if (ToolKind.CONNECTION_TOOL.equals(kind)) {
								Assert.assertTrue(
										"An edge element " + toolConfiguration.getId()
												+ " should always be in an edge Drawer " + drawerConfiguration.getId(),
										drawerConfiguration.getId().contains(EDGE));
							} else {
								Assert.assertTrue(
										"An node element " + toolConfiguration.getId()
												+ " should always be in an node Drawer " + drawerConfiguration.getId(),
										drawerConfiguration.getId().contains(NODE));
							}
						}
					}
				}
			}
		}
	}

}