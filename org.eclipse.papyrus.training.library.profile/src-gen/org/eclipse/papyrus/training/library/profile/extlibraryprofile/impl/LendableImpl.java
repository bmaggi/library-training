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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Lendable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lendable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.LendableImpl#getCopies <em>Copies</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LendableImpl extends MinimalEObjectImpl.Container implements Lendable {
	/**
	 * The default value of the '{@link #getCopies() <em>Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCopies()
	 * @generated
	 * @ordered
	 */
	protected static final int COPIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCopies() <em>Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCopies()
	 * @generated
	 * @ordered
	 */
	protected int copies = COPIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LendableImpl() {
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
		return ExtLibraryProfilePackage.Literals.LENDABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getCopies() {
		return copies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCopies(int newCopies) {
		int oldCopies = copies;
		copies = newCopies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtLibraryProfilePackage.LENDABLE__COPIES, oldCopies, copies));
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
		case ExtLibraryProfilePackage.LENDABLE__COPIES:
			return getCopies();
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
		case ExtLibraryProfilePackage.LENDABLE__COPIES:
			setCopies((Integer) newValue);
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
		case ExtLibraryProfilePackage.LENDABLE__COPIES:
			setCopies(COPIES_EDEFAULT);
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
		case ExtLibraryProfilePackage.LENDABLE__COPIES:
			return copies != COPIES_EDEFAULT;
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
		result.append(" (copies: ");
		result.append(copies);
		result.append(')');
		return result.toString();
	}

} // LendableImpl
