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
package org.eclipse.papyrus.training.library.compare.filters;

import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.rcp.ui.structuremergeviewer.filters.AbstractDifferenceFilter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.tree.TreeNode;
import org.eclipse.gmf.runtime.notation.NotationPackage;

import com.google.common.base.Predicate;

public class InvisibleShapesAndConnectorsFilter extends AbstractDifferenceFilter {

	private static final Predicate<? super EObject> PREDICATE_WHEN_SELECTED = new Predicate<EObject>() {
		@Override
		public boolean apply(EObject input) {
			if (input instanceof TreeNode) {
				final EObject data = ((TreeNode) input).getData();
				if (data instanceof ReferenceChange) {
					final EReference reference = ((ReferenceChange) data).getReference();
					return NotationPackage.eINSTANCE.getView_PersistedChildren().equals(reference)
							|| NotationPackage.eINSTANCE.getDiagram_PersistedEdges().equals(reference);
				}
			}
			return false;
		}
	};

	@Override
	public Predicate<? super EObject> getPredicateWhenSelected() {
		return PREDICATE_WHEN_SELECTED;
	}

}
