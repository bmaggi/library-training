/**
 * Copyright (c) 2015 EclipseSource Services GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Philip Langer - initial API and implementation
 */
package org.eclipse.papyrus.training.library.compare.library.impl;

import org.eclipse.emf.compare.uml2.internal.UMLComparePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.training.library.compare.library.BookTheftDiff;
import org.eclipse.papyrus.training.library.compare.library.LibraryCompareFactory;
import org.eclipse.papyrus.training.library.compare.library.LibraryComparePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryComparePackageImpl extends EPackageImpl implements LibraryComparePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookTheftDiffEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.training.library.compare.library.LibraryComparePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LibraryComparePackageImpl() {
		super(eNS_URI, LibraryCompareFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LibraryComparePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LibraryComparePackage init() {
		if (isInited) return (LibraryComparePackage)EPackage.Registry.INSTANCE.getEPackage(LibraryComparePackage.eNS_URI);

		// Obtain or create and register package
		LibraryComparePackageImpl theLibraryComparePackage = (LibraryComparePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LibraryComparePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LibraryComparePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLComparePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLibraryComparePackage.createPackageContents();

		// Initialize created meta-data
		theLibraryComparePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLibraryComparePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LibraryComparePackage.eNS_URI, theLibraryComparePackage);
		return theLibraryComparePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookTheftDiff() {
		return bookTheftDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookTheftDiff_BorrowerName() {
		return (EAttribute)bookTheftDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookTheftDiff_BookName() {
		return (EAttribute)bookTheftDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryCompareFactory getLibraryCompareFactory() {
		return (LibraryCompareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bookTheftDiffEClass = createEClass(BOOK_THEFT_DIFF);
		createEAttribute(bookTheftDiffEClass, BOOK_THEFT_DIFF__BORROWER_NAME);
		createEAttribute(bookTheftDiffEClass, BOOK_THEFT_DIFF__BOOK_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLComparePackage theUMLComparePackage = (UMLComparePackage)EPackage.Registry.INSTANCE.getEPackage(UMLComparePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bookTheftDiffEClass.getESuperTypes().add(theUMLComparePackage.getUMLDiff());

		// Initialize classes and features; add operations and parameters
		initEClass(bookTheftDiffEClass, BookTheftDiff.class, "BookTheftDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBookTheftDiff_BorrowerName(), ecorePackage.getEString(), "borrowerName", null, 0, 1, BookTheftDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBookTheftDiff_BookName(), ecorePackage.getEString(), "bookName", null, 0, 1, BookTheftDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //LibraryComparePackageImpl
