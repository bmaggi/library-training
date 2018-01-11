/**
 * Copyright (c) 2016 EclipseSource Services GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Martin Fleck (EclipseSource) - Initial API and implementation
 * Benoit Maggi (CEA LIST) - Change for training library example
 */
package org.eclipse.papyrus.training.library.newchild.internal;

import org.eclipse.papyrus.infra.newchild.CreationMenuRegistry;
import org.eclipse.papyrus.infra.newchild.elementcreationmenumodel.Folder;

/**
 * Cleans the creation edge menu.
 * 
 * The code in HideNewChildEdgeUtil is a _trick_ to hide the UML menu when
 * creating an Enterprise Product. You may also hide the menus using the
 * preferences, some people also used home made code to switch these preferences
 * when changing viewpoints but nothing is currently integrated in Papyrus core.
 */
public final class HideNewChildEdgeUtil {

	private static final String UML_NEW_RELATIONSHIP_MENU = "/resource/UMLEdges.creationmenumodel"; //$NON-NLS-1$

	private static final String[] DEACTIVATED_CHILD_MENUS = new String[] { UML_NEW_RELATIONSHIP_MENU };

	private HideNewChildEdgeUtil() {
		// hidden constructor.
	}

	/**
	 * Cleans the creation menu.
	 */
	public static void clean() {
		CreationMenuRegistry instance = org.eclipse.papyrus.infra.newchild.CreationMenuRegistry.getInstance();
		for (Folder folder : instance.getRootFolder()) {
			for (String childMenuPath : DEACTIVATED_CHILD_MENUS) {
				if (folder.eResource().getURI().toString().endsWith(childMenuPath)) {
					instance.setCreationMenuVisibility(folder, false);
				}
			}
		}
	}
}
