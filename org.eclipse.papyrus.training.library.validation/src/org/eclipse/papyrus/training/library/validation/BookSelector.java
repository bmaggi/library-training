/*****************************************************************************
 * Copyright (c) 2016 CEA LIST and others.
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
package org.eclipse.papyrus.training.library.validation;


import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book;

public class BookSelector implements IClientSelector {

	@Override
	public boolean selects(Object stereoApplicationObj) {
		return stereoApplicationObj instanceof Book;
	}
}
