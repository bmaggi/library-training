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
package org.eclipse.papyrus.training.library.compare.library;

import org.eclipse.emf.compare.uml2.internal.UMLComparePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.training.library.compare.library.LibraryCompareFactory
 * @model kind="package"
 * @generated
 */
public interface LibraryComparePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/compare/uml2/library/1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "librarycompare"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryComparePackage eINSTANCE = org.eclipse.papyrus.training.library.compare.library.impl.LibraryComparePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.compare.library.impl.BookTheftDiffImpl <em>Book Theft Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.training.library.compare.library.impl.BookTheftDiffImpl
	 * @see org.eclipse.papyrus.training.library.compare.library.impl.LibraryComparePackageImpl#getBookTheftDiff()
	 * @generated
	 */
	int BOOK_THEFT_DIFF = 0;

	/**
	 * The feature id for the '<em><b>Match</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__MATCH = UMLComparePackage.UML_DIFF__MATCH;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__REQUIRES = UMLComparePackage.UML_DIFF__REQUIRES;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__REQUIRED_BY = UMLComparePackage.UML_DIFF__REQUIRED_BY;

	/**
	 * The feature id for the '<em><b>Implies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__IMPLIES = UMLComparePackage.UML_DIFF__IMPLIES;

	/**
	 * The feature id for the '<em><b>Implied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__IMPLIED_BY = UMLComparePackage.UML_DIFF__IMPLIED_BY;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__REFINES = UMLComparePackage.UML_DIFF__REFINES;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__REFINED_BY = UMLComparePackage.UML_DIFF__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Prime Refining</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__PRIME_REFINING = UMLComparePackage.UML_DIFF__PRIME_REFINING;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__KIND = UMLComparePackage.UML_DIFF__KIND;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__SOURCE = UMLComparePackage.UML_DIFF__SOURCE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__STATE = UMLComparePackage.UML_DIFF__STATE;

	/**
	 * The feature id for the '<em><b>Equivalence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__EQUIVALENCE = UMLComparePackage.UML_DIFF__EQUIVALENCE;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__CONFLICT = UMLComparePackage.UML_DIFF__CONFLICT;

	/**
	 * The feature id for the '<em><b>Discriminant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__DISCRIMINANT = UMLComparePackage.UML_DIFF__DISCRIMINANT;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__EREFERENCE = UMLComparePackage.UML_DIFF__EREFERENCE;

	/**
	 * The feature id for the '<em><b>Borrower Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__BORROWER_NAME = UMLComparePackage.UML_DIFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Book Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF__BOOK_NAME = UMLComparePackage.UML_DIFF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Book Theft Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_THEFT_DIFF_FEATURE_COUNT = UMLComparePackage.UML_DIFF_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.compare.library.BookTheftDiff <em>Book Theft Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Theft Diff</em>'.
	 * @see org.eclipse.papyrus.training.library.compare.library.BookTheftDiff
	 * @generated
	 */
	EClass getBookTheftDiff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.compare.library.BookTheftDiff#getBorrowerName <em>Borrower Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borrower Name</em>'.
	 * @see org.eclipse.papyrus.training.library.compare.library.BookTheftDiff#getBorrowerName()
	 * @see #getBookTheftDiff()
	 * @generated
	 */
	EAttribute getBookTheftDiff_BorrowerName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.compare.library.BookTheftDiff#getBookName <em>Book Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Book Name</em>'.
	 * @see org.eclipse.papyrus.training.library.compare.library.BookTheftDiff#getBookName()
	 * @see #getBookTheftDiff()
	 * @generated
	 */
	EAttribute getBookTheftDiff_BookName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibraryCompareFactory getLibraryCompareFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.compare.library.impl.BookTheftDiffImpl <em>Book Theft Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.training.library.compare.library.impl.BookTheftDiffImpl
		 * @see org.eclipse.papyrus.training.library.compare.library.impl.LibraryComparePackageImpl#getBookTheftDiff()
		 * @generated
		 */
		EClass BOOK_THEFT_DIFF = eINSTANCE.getBookTheftDiff();

		/**
		 * The meta object literal for the '<em><b>Borrower Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_THEFT_DIFF__BORROWER_NAME = eINSTANCE.getBookTheftDiff_BorrowerName();

		/**
		 * The meta object literal for the '<em><b>Book Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_THEFT_DIFF__BOOK_NAME = eINSTANCE.getBookTheftDiff_BookName();

	}

} //LibraryComparePackage
