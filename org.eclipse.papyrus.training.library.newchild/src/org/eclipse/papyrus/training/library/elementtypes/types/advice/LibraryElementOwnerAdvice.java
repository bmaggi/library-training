/*****************************************************************************
 * Copyright (c) 2015 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Remi Schnekenburger (CEA LIST) remi.schnekenburger@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.training.library.elementtypes.types.advice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.papyrus.infra.types.ElementTypeConfiguration;
import org.eclipse.papyrus.infra.types.core.impl.ConfiguredHintedSpecializationElementType;

// org.eclipse.papyrus.infra.types.rulebased.AndRuleConfiguration

//Migration of the InvariantTypes
//
//InvariantTypeConfiguration metaclass is now RuleBasedTypeConfiguration
//
//import org.eclipse.papyrus.infra.elementtypesconfigurations.invarianttypeconfiguration.AndInvariantRuleConfiguration;
//import org.eclipse.papyrus.infra.elementtypesconfigurations.invarianttypeconfiguration.CompositeInvariantRuleConfiguration;
//import org.eclipse.papyrus.infra.elementtypesconfigurations.invarianttypeconfiguration.InvariantRuleConfiguration;
//import org.eclipse.papyrus.infra.elementtypesconfigurations.invarianttypeconfiguration.InvariantTypeConfiguration;
//import org.eclipse.papyrus.infra.elementtypesconfigurations.invarianttypeconfiguration.NotInvariantRuleConfiguration;
//import org.eclipse.papyrus.infra.elementtypesconfigurations.invarianttypeconfiguration.OrInvariantRuleConfiguration;
//import org.eclipse.papyrus.infra.elementtypesconfigurations.invarianttypes.invarianttypeconfiguration.IInvariantRule;
//import org.eclipse.papyrus.infra.elementtypesconfigurations.invarianttypes.invarianttypeconfiguration.InvariantRuleConfigurationTypeRegistry;
import org.eclipse.papyrus.training.library.elementtypes.Activator;
//import org.eclipse.papyrus.uml.tools.elementtypesconfigurations.invariantstereotyperuleconfiguration.InvariantStereotypeRuleConfiguration;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

/**
 * Advice for potential owners of UMLRT based Element Types. This advice will help to the pre/post validation for the creation of child element which is
 * describe by any element type based on UML-RT profile.
 */
public class LibraryElementOwnerAdvice extends AbstractEditHelperAdvice {

	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		List<ConfiguredHintedSpecializationElementType> types = getInvariantTypes(request);

		// Must approve from the whole hierarchy
		for (ConfiguredHintedSpecializationElementType configuredHintedSpecializationElementType : types) {
			if (!approveRequest(configuredHintedSpecializationElementType, request)) {
				return false;
			}
		}

		return true;	
	}

	/**
	 * @param request
	 * 
	 */
	protected List<ConfiguredHintedSpecializationElementType> getInvariantTypes(IEditCommandRequest request) {
		List<ConfiguredHintedSpecializationElementType> result = new ArrayList<ConfiguredHintedSpecializationElementType>();
		if (request instanceof CreateElementRequest) {
			IElementType typeToCreate = ((CreateElementRequest) request).getElementType();
			List<ConfiguredHintedSpecializationElementType> superConfiguredTypes = getAllInvariantTypes(typeToCreate);
			result.addAll(superConfiguredTypes);
		} else if (request instanceof SetRequest) {
			// check the feature to set is a containment feature and element to move is an extended element type
			EStructuralFeature feature = ((SetRequest) request).getFeature();
			if (feature instanceof EReference) {
				if (((EReference) feature).isContainment()) {

					// containment. Check the kind of element to edit
					Object value = ((SetRequest) request).getValue();
					List<Object> values = new ArrayList<Object>();
					// value = single object or list ?
					if (value instanceof EObject) {
						values.add(value);
					} else if (value instanceof List) {
						values.addAll((List<Object>) value);
					}

					for (Object object : values) {
						if (object instanceof EObject) {
							IElementType[] types = ElementTypeRegistry.getInstance().getAllTypesMatching((EObject) object, request.getClientContext());
							for (IElementType type : types) {
								if (type instanceof ConfiguredHintedSpecializationElementType) {
//									if (((ConfiguredHintedSpecializationElementType) type).getConfiguration() instanceof InvariantTypeConfiguration) {
//										result.add((ConfiguredHintedSpecializationElementType) type);
//
//										List<ConfiguredHintedSpecializationElementType> superConfiguredTypes = getAllSuperConfiguredTypes((ConfiguredHintedSpecializationElementType) type);
//										result.addAll(superConfiguredTypes);
//									}
								}
							}
						}
					}
				}
			}
		} else if (request instanceof MoveRequest) {
			// check the feature to set is a containment feature and element to move is an extended element type
			Map<EObject, EReference> objectsToMove = ((MoveRequest) request).getElementsToMove();
			for (Entry<EObject, EReference> movedElement : objectsToMove.entrySet()) {
				// do not compute with reference, this can be null. This could be interesting to check...
				IElementType[] types = ElementTypeRegistry.getInstance().getAllTypesMatching(movedElement.getKey(), request.getClientContext());
				for (IElementType type : types) {
					if (type instanceof ConfiguredHintedSpecializationElementType) {
//						if (((ConfiguredHintedSpecializationElementType) type).getConfiguration() instanceof InvariantTypeConfiguration) {
//							result.add((ConfiguredHintedSpecializationElementType) type);
//
//							List<ConfiguredHintedSpecializationElementType> superConfiguredTypes = getAllSuperConfiguredTypes((ConfiguredHintedSpecializationElementType) type);
//							result.addAll(superConfiguredTypes);
//						}
					}
				}
			}
		}

		return result;

	}

	/**
	 * Returns the list of types (this one and supers) that are configuredTypes.
	 * 
	 * @param type
	 *            the type from which all invariants are retrieved
	 * @return the list of invariant types in the hierarchy of specified type, including type itself if matching. Returns an empty list if none is matching
	 */
	protected List<ConfiguredHintedSpecializationElementType> getAllInvariantTypes(IElementType type) {
		List<ConfiguredHintedSpecializationElementType> result = new ArrayList<ConfiguredHintedSpecializationElementType>();

		if (!(type instanceof ConfiguredHintedSpecializationElementType)) {
			// no need to take care of metamodel types yet
			return result;
		}

//		if (((ConfiguredHintedSpecializationElementType) type).getConfiguration() instanceof InvariantTypeConfiguration) {
//			result.add((ConfiguredHintedSpecializationElementType) type);
//		}

		IElementType[] superTypes = type.getAllSuperTypes();
		if (superTypes.length == 0) {
			return result;
		}
		// get the reverse order
		for (int i = superTypes.length - 1; i >= 0; i--) {
			if (superTypes[i] instanceof ConfiguredHintedSpecializationElementType) {
//				if (((ConfiguredHintedSpecializationElementType) superTypes[i]).getConfiguration() instanceof InvariantTypeConfiguration) {
//					result.add((ConfiguredHintedSpecializationElementType) superTypes[i]);
//				}
			}
		}

		return result;
	}

	protected List<ConfiguredHintedSpecializationElementType> getAllSuperConfiguredTypes(ConfiguredHintedSpecializationElementType type) {
		IElementType[] superTypes = type.getAllSuperTypes();
		if (superTypes.length == 0) {
			return Collections.emptyList();
		}
		List<ConfiguredHintedSpecializationElementType> superExtendedTypes = new ArrayList<ConfiguredHintedSpecializationElementType>();
		// get the reverse order
		for (int i = superTypes.length - 1; i >= 0; i--) {
			if (superTypes[i] instanceof ConfiguredHintedSpecializationElementType) {
//				if (((ConfiguredHintedSpecializationElementType) superTypes[i]).getConfiguration() instanceof InvariantTypeConfiguration) {
//					superExtendedTypes.add((ConfiguredHintedSpecializationElementType) superTypes[i]);
//				}
			}
		}
		return superExtendedTypes;
	}


//	protected boolean processCompositeRule(CompositeInvariantRuleConfiguration compositeRule, IEditCommandRequest request) {
//		Iterator<InvariantRuleConfiguration> iterator = compositeRule.getComposedRules().iterator();
//		InvariantRuleConfiguration nextComposedRuleConfiguration = iterator.next();
//		boolean result = processInvariantRule(nextComposedRuleConfiguration, request);
//
//		while (iterator.hasNext()) {
//			nextComposedRuleConfiguration = iterator.next();
//
//			boolean resultNextComposedRuleConfiguration = processInvariantRule(nextComposedRuleConfiguration, request);
//
//			if (compositeRule instanceof OrInvariantRuleConfiguration) {
//				if (result == false && resultNextComposedRuleConfiguration) {
//					result = true;
//				}
//			} else if (compositeRule instanceof AndInvariantRuleConfiguration) {
//				if (result == true && !resultNextComposedRuleConfiguration) {
//					result = false;
//				}
//			}
//		}
//
//		return result;
//	}

//	protected boolean processInvariantRule(InvariantRuleConfiguration invariantRuleConfiguration, IEditCommandRequest request) {
//		if (invariantRuleConfiguration instanceof CompositeInvariantRuleConfiguration) {
//			return processCompositeRule((CompositeInvariantRuleConfiguration) invariantRuleConfiguration, request);
//		} else if (invariantRuleConfiguration instanceof NotInvariantRuleConfiguration) {
//			InvariantRuleConfiguration composedRule = ((NotInvariantRuleConfiguration) invariantRuleConfiguration).getComposedRule();
//			return !processInvariantRule(composedRule, request);
//		} else {
//			if (invariantRuleConfiguration instanceof InvariantStereotypeRuleConfiguration) {
//				return processStereotypeInvariantRuleConfiguration((InvariantStereotypeRuleConfiguration) invariantRuleConfiguration, request);
//			}
//			IInvariantRule<? extends InvariantRuleConfiguration> rule = InvariantRuleConfigurationTypeRegistry.getInstance().getInvariantRule(invariantRuleConfiguration);
//			return rule.approveRequest(request);
//		}
//	}


	/**
	 * Patch method for invariant stereotype rules, for Papyrus Mars between SR0 and SR1
	 * 
	 * @param rule
	 *            the rule to check for approve status
	 * @param request
	 */
//	protected boolean processStereotypeInvariantRuleConfiguration(InvariantStereotypeRuleConfiguration ruleConfiguration, IEditCommandRequest req) {
//		if (req instanceof CreateElementRequest) {
//			CreateElementRequest request = (CreateElementRequest) req;
//			String requiredProfileName = ruleConfiguration.getRequiredProfile();
//			if (requiredProfileName != null) {
//				// check target
//				EObject container = request.getContainer();
//				if (!(container instanceof Element)) {
//					return false;
//				}
//				Package nearestPackage = ((Element) container).getNearestPackage();
//				if (nearestPackage == null) {
//					return false;
//				}
//				Profile appliedProfile = nearestPackage.getAppliedProfile(requiredProfileName, true);
//				return appliedProfile != null;
//			}
//
//			return true;
//		} else {
//			IInvariantRule<? extends InvariantRuleConfiguration> rule = InvariantRuleConfigurationTypeRegistry.getInstance().getInvariantRule(ruleConfiguration);
//			return rule.approveRequest(req);
//		}
//	}

	protected boolean approveRequest(ConfiguredHintedSpecializationElementType elementType, IEditCommandRequest request) {
//
//		ElementTypeConfiguration configuration = ((ConfiguredHintedSpecializationElementType) elementType).getConfiguration();
//		if (configuration instanceof InvariantTypeConfiguration) {
//			InvariantRuleConfiguration invariantRuleConfiguration = ((InvariantTypeConfiguration) configuration).getInvariantRuleConfiguration();
//
//			return processInvariantRule(invariantRuleConfiguration, request);
//		} else {
//			Activator.log.warn("Expected InvariantRuleConfiguration as configuration type for : " + elementType);
//		}

		return true;
	}



}
