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

import org.eclipse.emf.compare.uml2.internal.UMLDiff;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Theft Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.training.library.compare.library.BookTheftDiff#getBorrowerName <em>Borrower Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.training.library.compare.library.BookTheftDiff#getBookName <em>Book Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.training.library.compare.library.LibraryComparePackage#getBookTheftDiff()
 * @model
 * @generated
 */
public interface BookTheftDiff extends UMLDiff {
	/**
	 * Returns the value of the '<em><b>Borrower Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrower Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrower Name</em>' attribute.
	 * @see #setBorrowerName(String)
	 * @see org.eclipse.papyrus.training.library.compare.library.LibraryComparePackage#getBookTheftDiff_BorrowerName()
	 * @model
	 * @generated
	 */
	String getBorrowerName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.training.library.compare.library.BookTheftDiff#getBorrowerName <em>Borrower Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borrower Name</em>' attribute.
	 * @see #getBorrowerName()
	 * @generated
	 */
	void setBorrowerName(String value);

	/**
	 * Returns the value of the '<em><b>Book Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book Name</em>' attribute.
	 * @see #setBookName(String)
	 * @see org.eclipse.papyrus.training.library.compare.library.LibraryComparePackage#getBookTheftDiff_BookName()
	 * @model
	 * @generated
	 */
	String getBookName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.training.library.compare.library.BookTheftDiff#getBookName <em>Book Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Name</em>' attribute.
	 * @see #getBookName()
	 * @generated
	 */
	void setBookName(String value);

} // BookTheftDiff
