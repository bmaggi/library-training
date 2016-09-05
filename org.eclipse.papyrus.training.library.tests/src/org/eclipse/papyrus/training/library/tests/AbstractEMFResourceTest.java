/*****************************************************************************
 * Copyright (c) 2015 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.training.library.tests;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;

/**
 * Abstract test class for all EMF-based configuration models (property view, palettes, etc.)
 */
public abstract class AbstractEMFResourceTest{

	/**
	 * URI of the EMF resource to test
	 * 
	 * @return
	 */
	public abstract String getFileUri();

	/**
	 * do the validation checks on the EMF resource
	 */
	protected void doValidateResource() {
		URI createPlatformPluginURI = URI.createPlatformPluginURI(getFileUri(), true);
		Resource resource = new ResourceSetImpl().getResource(createPlatformPluginURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The constraint model is not valid: " + printDiagnostic(diagnostic), Diagnostic.OK, diagnostic.getSeverity());
	}

	// FIXME : Something should exist in API to do that
	protected String printDiagnostic(Diagnostic diagnostic) {
		String message = diagnostic.getMessage();
		List<Diagnostic> children = diagnostic.getChildren();
		for (Diagnostic diagnostic2 : children) {
			message += "\n" + diagnostic2.getMessage();
		}
		return message;
	}
}
