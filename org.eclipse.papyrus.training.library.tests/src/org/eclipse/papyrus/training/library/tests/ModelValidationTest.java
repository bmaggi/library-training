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

package org.eclipse.papyrus.training.library.tests;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.papyrus.infra.types.core.registries.ElementTypeSetConfigurationRegistry;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * This is a parameterized test to validate all model in training library
 * 
 * @author Benoit Maggi
 */
@SuppressWarnings("nls")
@RunWith(Parameterized.class)
public class ModelValidationTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			//{"org.eclipse.papyrus.training.library.newchild/resources/extLibrary.elementtypesconfigurations"}, FIXME 2 warnings due to Periodical weekly with UML Literal		
			{"org.eclipse.papyrus.training.library.newchild/resources/newChild.creationmenumodel"},
			// {"org.eclipse.papyrus.training.library.properties/resources/extlibrary/extlibrary.ctx"},// FIXME missing org.eclipse.papyrus.customization.properties.model.xwt;bundle-version="[1.1.0,2.0.0)" dependency in oxygen
			{"org.eclipse.papyrus.training.library.palette/resources/library.paletteconfiguration"},
			{"org.eclipse.papyrus.training.library.palette/resources/extlibrarydi.elementtypesconfigurations"},
			{"org.eclipse.papyrus.training.library.architecture/resources/library.architecture"}
		});
	}

	private String modelPath; 
	    
	public ModelValidationTest(String modelPath) {
		this.modelPath = modelPath;
	}

	@BeforeClass
	public static void loadElementTypeSet(){
		ElementTypeSetConfigurationRegistry.getInstance();
	}	
	
	/**
	 * Validate the model with the rules defined in the meta-model tooling
	 */
	@Test
	public void validateModel() {
		URI modelPlatformURI = URI.createPlatformPluginURI(this.modelPath, true);
		Resource resource = new ResourceSetImpl().getResource(modelPlatformURI, true);
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
		Assert.assertEquals("The "+modelPath+" model is invalid ", Diagnostic.OK, diagnostic.getSeverity());
	}

}
