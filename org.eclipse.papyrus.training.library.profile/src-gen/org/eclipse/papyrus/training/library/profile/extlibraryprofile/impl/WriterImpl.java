/**
 * Copyright (c) 2015 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     CEA LIST - Initial API and implementation
 */
package org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.training.library.profile.extlibraryprofile.BookOnTape;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Writer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Writer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.WriterImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.WriterImpl#getBookOnTape <em>Book On Tape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriterImpl extends PersonImpl implements Writer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookOnTape() <em>Book On Tape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBookOnTape()
	 * @generated
	 * @ordered
	 */
	protected BookOnTape bookOnTape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtLibraryProfilePackage.Literals.WRITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtLibraryProfilePackage.WRITER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BookOnTape getBookOnTape() {
		if (bookOnTape != null && bookOnTape.eIsProxy()) {
			InternalEObject oldBookOnTape = (InternalEObject) bookOnTape;
			bookOnTape = (BookOnTape) eResolveProxy(oldBookOnTape);
			if (bookOnTape != oldBookOnTape) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtLibraryProfilePackage.WRITER__BOOK_ON_TAPE, oldBookOnTape, bookOnTape));
			}
		}
		return bookOnTape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BookOnTape basicGetBookOnTape() {
		return bookOnTape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBookOnTape(BookOnTape newBookOnTape) {
		BookOnTape oldBookOnTape = bookOnTape;
		bookOnTape = newBookOnTape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtLibraryProfilePackage.WRITER__BOOK_ON_TAPE, oldBookOnTape, bookOnTape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExtLibraryProfilePackage.WRITER__NAME:
			return getName();
		case ExtLibraryProfilePackage.WRITER__BOOK_ON_TAPE:
			if (resolve)
				return getBookOnTape();
			return basicGetBookOnTape();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtLibraryProfilePackage.WRITER__NAME:
			setName((String) newValue);
			return;
		case ExtLibraryProfilePackage.WRITER__BOOK_ON_TAPE:
			setBookOnTape((BookOnTape) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ExtLibraryProfilePackage.WRITER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ExtLibraryProfilePackage.WRITER__BOOK_ON_TAPE:
			setBookOnTape((BookOnTape) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ExtLibraryProfilePackage.WRITER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ExtLibraryProfilePackage.WRITER__BOOK_ON_TAPE:
			return bookOnTape != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // WriterImpl
