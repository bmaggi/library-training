/*******************************************************************************
 * Copyright (c) 2015 EclipseSource Services GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Philip Langer - initial API and implementation
 *******************************************************************************/
package org.eclipse.papyrus.training.library.compare;

import org.eclipse.emf.compare.uml2.internal.provider.decorator.StereotypedElementItemProviderDecorator;
import org.eclipse.emf.compare.uml2.internal.provider.decorator.UMLProfileItemProviderAdapterFactoryDecorator;
import org.eclipse.emf.edit.provider.IItemProviderDecorator;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;

import com.google.common.base.Optional;

@SuppressWarnings("restriction")
public class AdapterFactory extends UMLProfileItemProviderAdapterFactoryDecorator {

	private static final String EXTLIBRARY_BORROWS = "extlibrary::Borrows";

	@Override
	protected IItemProviderDecorator createStereotypeElementItemProvider() {
		return new StereotypedElementItemProviderDecorator(this) {
			@Override
			public String getText(Object object) {
				final String text = super.getText(object);
				if (isBorrowsDependency(object)) {
					final Dependency dependency = (Dependency) object;
					return "<Borrows> " + getDependencyTargetName(dependency).or("");
				}
				return text;
			}
		};
	}

	private boolean isBorrowsDependency(Object object) {
		if (object instanceof Dependency) {
			final Dependency dependency = (Dependency) object;
			return dependency.getAppliedStereotype(EXTLIBRARY_BORROWS) != null;
		}
		return false;
	}

	private Optional<String> getDependencyTargetName(Dependency dependency) {
		if (dependency.getTargets().size() > 0 && dependency.getTargets().get(0) instanceof NamedElement) {
			final NamedElement element = (NamedElement) dependency.getTargets().get(0);
			return Optional.of(element.getName());
		}
		return Optional.absent();
	}

}
