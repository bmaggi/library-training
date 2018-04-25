/*****************************************************************************
 * Copyright (c) 2018 CEA.
 *
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
package org.eclipse.papyrus.training.library.tests;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.UMLPlugin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Basic test for profile
 * 
 */
@SuppressWarnings("nls")
@RunWith(Parameterized.class)
public class ProfileTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ "http://Papyrus/ExtLibraryProfile"},
				{ "http://Papyrus/ExtLibraryProfile/Library"},
		});
	}

	private String uri;

	public ProfileTest(String uri) {
		this.uri = uri;
	}

	/**
	 * Check that we have a location for the uri
	 * and that the location point to some existing EObject
	 */
	@Test
	public void testProfilRegistration() {
		URI location = UMLPlugin.getEPackageNsURIToProfileLocationMap().get(uri);
		assertNotNull("Location missing for this uri :"+uri, location);
		assertNotNull("Location is refering to a non existing EObject :"+location, new ResourceSetImpl().getEObject(location,true));
	}

}
