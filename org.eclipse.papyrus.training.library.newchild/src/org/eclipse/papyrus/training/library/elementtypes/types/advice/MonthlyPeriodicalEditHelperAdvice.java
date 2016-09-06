/*****************************************************************************
 * Copyright (c) 2014 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  CEA LIST - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.training.library.elementtypes.types.advice;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.ConfigureElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.papyrus.uml.tools.utils.NamedElementUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Advice to set the period for the Periodical to '12'
 */
public class MonthlyPeriodicalEditHelperAdvice extends AbstractEditHelperAdvice {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ICommand getAfterConfigureCommand(final ConfigureRequest request) {

		ICommand command = new ConfigureElementCommand(request) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				EObject elementToConfigure = request.getElementToConfigure();
				if (!(elementToConfigure instanceof Class)) {
					return CommandResult.newErrorCommandResult("Element to configure was not a Class: " + elementToConfigure);
				}
				
				// retrieve stereotype 
				Stereotype st = ((Class)elementToConfigure).getAppliedStereotype("extlibrary::Periodical");
				if (st == null) {
					return CommandResult.newErrorCommandResult("Element to configure did not have required stereotype");
				}
				((Class) elementToConfigure).setValue(st, "issuesPerYear", 12);

				// change name
				String name = NamedElementUtil.getDefaultNameWithIncrementFromBase("Monthly", elementToConfigure.eContainer().eContents());
				((Class) elementToConfigure).setName(name);

				return CommandResult.newOKCommandResult(elementToConfigure);
			}
		};

		return command.compose(super.getAfterConfigureCommand(request));
	}
}
