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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.uml2.internal.impl.UMLDiffImpl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.training.library.compare.library.BookTheftDiff;
import org.eclipse.papyrus.training.library.compare.library.LibraryComparePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book Theft Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.training.library.compare.library.impl.BookTheftDiffImpl#getBorrowerName <em>Borrower Name</em>}</li>
 *   <li>{@link org.eclipse.papyrus.training.library.compare.library.impl.BookTheftDiffImpl#getBookName <em>Book Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookTheftDiffImpl extends UMLDiffImpl implements BookTheftDiff {
	/**
	 * The default value of the '{@link #getBorrowerName() <em>Borrower Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowerName()
	 * @generated
	 * @ordered
	 */
	protected static final String BORROWER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorrowerName() <em>Borrower Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowerName()
	 * @generated
	 * @ordered
	 */
	protected String borrowerName = BORROWER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookName() <em>Book Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookName()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookName() <em>Book Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookName()
	 * @generated
	 * @ordered
	 */
	protected String bookName = BOOK_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookTheftDiffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryComparePackage.Literals.BOOK_THEFT_DIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorrowerName() {
		return borrowerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorrowerName(String newBorrowerName) {
		String oldBorrowerName = borrowerName;
		borrowerName = newBorrowerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryComparePackage.BOOK_THEFT_DIFF__BORROWER_NAME, oldBorrowerName, borrowerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookName(String newBookName) {
		String oldBookName = bookName;
		bookName = newBookName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryComparePackage.BOOK_THEFT_DIFF__BOOK_NAME, oldBookName, bookName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryComparePackage.BOOK_THEFT_DIFF__BORROWER_NAME:
				return getBorrowerName();
			case LibraryComparePackage.BOOK_THEFT_DIFF__BOOK_NAME:
				return getBookName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryComparePackage.BOOK_THEFT_DIFF__BORROWER_NAME:
				setBorrowerName((String)newValue);
				return;
			case LibraryComparePackage.BOOK_THEFT_DIFF__BOOK_NAME:
				setBookName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LibraryComparePackage.BOOK_THEFT_DIFF__BORROWER_NAME:
				setBorrowerName(BORROWER_NAME_EDEFAULT);
				return;
			case LibraryComparePackage.BOOK_THEFT_DIFF__BOOK_NAME:
				setBookName(BOOK_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibraryComparePackage.BOOK_THEFT_DIFF__BORROWER_NAME:
				return BORROWER_NAME_EDEFAULT == null ? borrowerName != null : !BORROWER_NAME_EDEFAULT.equals(borrowerName);
			case LibraryComparePackage.BOOK_THEFT_DIFF__BOOK_NAME:
				return BOOK_NAME_EDEFAULT == null ? bookName != null : !BOOK_NAME_EDEFAULT.equals(bookName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (borrowerName: "); //$NON-NLS-1$
		result.append(borrowerName);
		result.append(", bookName: "); //$NON-NLS-1$
		result.append(bookName);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public Match getMatch() {
		if (eContainer() instanceof Match) {
			return (Match) eContainer();
		}
		return super.getMatch();
	}

} //BookTheftDiffImpl
