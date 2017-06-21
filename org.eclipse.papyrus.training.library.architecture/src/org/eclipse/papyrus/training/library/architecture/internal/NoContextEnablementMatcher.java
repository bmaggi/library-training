/*****************************************************************************
 * Copyright (c) 2017 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 * 		Maged Elaasar - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.training.library.architecture.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;

/**
 * A no context matcher used to register element type bindings in the extension points  
 */
public class NoContextEnablementMatcher implements IElementMatcher {

	@Override
	public boolean matches(EObject eObject) {
		return false;
	}
}
