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


import org.eclipse.papyrus.training.library.tests.AbstractEMFResourceTest;
import org.junit.Test;

/**
 * Test the new child model :
 * - validate the model
 */
@SuppressWarnings("nls")
public class NewChildTest extends AbstractEMFResourceTest {

	public static final String PATH = org.eclipse.papyrus.training.library.newchild.Activator.PLUGIN_ID + "/resources/newChild.creationmenumodel";

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getFileUri() {
		return PATH;
	}

	@Test
	public void validateResource() {
		doValidateResource();
	}

}