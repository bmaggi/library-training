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
package org.eclipse.papyrus.training.library.compare.postprocessor;

import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.postprocessor.IPostProcessor;

public class BookTheftDiffPostProcessor implements IPostProcessor {
	
	private BookTheftDiffFactory factory = new BookTheftDiffFactory();
	
	@Override
	public void postComparison(Comparison comparison, Monitor monitor) {
		for (Diff difference : comparison.getDifferences()) {
			if (factory.handles(difference)) {
				Diff diffExtension = factory.create(difference);
				if (!diffExtension.getRefinedBy().isEmpty()) {
					final Match match = factory.getParentMatch(difference);
					if (match != null) {
						match.getDifferences().add(diffExtension);
					}
				}
			}
		}
	}

	@Override
	public void postMatch(Comparison comparison, Monitor monitor) {
	}

	@Override
	public void postDiff(Comparison comparison, Monitor monitor) {
	}

	@Override
	public void postRequirements(Comparison comparison, Monitor monitor) {
	}

	@Override
	public void postEquivalences(Comparison comparison, Monitor monitor) {
	}

	@Override
	public void postConflicts(Comparison comparison, Monitor monitor) {
	}

}
