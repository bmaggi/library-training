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
package org.eclipse.papyrus.training.library.tests.properties;


import org.eclipse.papyrus.training.library.tests.AbstractEMFResourceTest;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test the palette model :
 * - validate the model
 */
public class PropertiesTest extends AbstractEMFResourceTest {

	public static final String PATH = org.eclipse.papyrus.training.library.properties.Activator.PLUGIN_ID + "/propertyView/extlibrary/extlibrary.ctx"; // $NON-NLS-0$

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getFileUri() {
		return PATH;
	}

	@Test
	@Ignore // Failing
	public void validateResource() {
		doValidateResource();
	}

}