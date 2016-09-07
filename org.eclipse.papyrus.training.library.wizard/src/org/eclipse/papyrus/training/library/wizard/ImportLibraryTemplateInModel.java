/*****************************************************************************
 * Copyright (c) 2016 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Benoit Maggi benoit.maggi@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.training.library.wizard;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.uml.diagram.wizards.transformation.IGenerator;
import org.eclipse.papyrus.uml.tools.model.UmlUtils;
import org.eclipse.uml2.uml.PackageImport;


/**
 * 
 * Utility class to provide template model in the new model wizard
 */
public class ImportLibraryTemplateInModel implements IGenerator {

	public static final String EXAMPLE_PATH = "platform:/plugin/"+Activator.PLUGIN_ID+"/resources/LibraryTemplateModel.uml"; //$NON-NLS-1$ //$NON-NLS-2$	
	
	public static final String EXAMPLE_ROOT_ID = "_RCL_gFOeEeSxY9vSiiRRZQ";//$NON-NLS-1$
	
	private ModelSet modelSet;

	private org.eclipse.uml2.uml.Package root;

	private org.eclipse.uml2.uml.Package libraryPackage;

	public void execute() {

		// Get its resource
		Resource umlResource = UmlUtils.getUmlModel(modelSet).getResource();

		// Select the root element to add the wanted imports
		root = (org.eclipse.uml2.uml.Package) umlResource.getContents().get(0);
			
		URI templatelibraryURI = URI.createURI(EXAMPLE_PATH).appendFragment(EXAMPLE_ROOT_ID);
		libraryPackage = (org.eclipse.uml2.uml.Package) modelSet.getEObject(templatelibraryURI, true);

		// Creates the import packages at the root of the model (elements of type packageImport)
		this.getCommandStack(modelSet).execute(new RecordingCommand(modelSet.getTransactionalEditingDomain()) {

			@Override
			protected void doExecute() {
				PackageImport importPrimitivePack = root.createPackageImport(libraryPackage);
				if (!root.getPackageImports().contains(importPrimitivePack)) {
					root.getPackageImports().add(importPrimitivePack);
				}

				try {
					root.eResource().save(Collections.EMPTY_MAP);
				} catch (IOException e) {
					//TODO : log error
				}
			}
		});

	}

	/**
	 * @see org.eclipse.papyrus.uml.diagram.wizards.transformation.IGenerator#setModelSet(org.eclipse.papyrus.uml.diagram.wizards.transformation.ModelSet)
	 *
	 * @param modelSet
	 */
	public void setModelSet(ModelSet modelSet) {
		this.modelSet = modelSet;
	}

	protected final CommandStack getCommandStack(ModelSet modelSet) {
		return modelSet.getTransactionalEditingDomain().getCommandStack();
	}

	public ModelSet getModelSet() {
		return this.modelSet;
	}

}
