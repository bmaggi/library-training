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

import org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Visual Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AudioVisualItemImpl#getMinutesLength <em>Minutes Length</em>}</li>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AudioVisualItemImpl#isDamaged <em>Damaged</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AudioVisualItemImpl extends CirculatingItemImpl implements AudioVisualItem {
	/**
	 * The default value of the '{@link #getMinutesLength() <em>Minutes Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMinutesLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTES_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinutesLength() <em>Minutes Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMinutesLength()
	 * @generated
	 * @ordered
	 */
	protected int minutesLength = MINUTES_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isDamaged() <em>Damaged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isDamaged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAMAGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDamaged() <em>Damaged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isDamaged()
	 * @generated
	 * @ordered
	 */
	protected boolean damaged = DAMAGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AudioVisualItemImpl() {
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
		return ExtLibraryProfilePackage.Literals.AUDIO_VISUAL_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getMinutesLength() {
		return minutesLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMinutesLength(int newMinutesLength) {
		int oldMinutesLength = minutesLength;
		minutesLength = newMinutesLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH, oldMinutesLength, minutesLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isDamaged() {
		return damaged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDamaged(boolean newDamaged) {
		boolean oldDamaged = damaged;
		damaged = newDamaged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__DAMAGED, oldDamaged, damaged));
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
		case ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH:
			return getMinutesLength();
		case ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__DAMAGED:
			return isDamaged();
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
		case ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH:
			setMinutesLength((Integer) newValue);
			return;
		case ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__DAMAGED:
			setDamaged((Boolean) newValue);
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
		case ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH:
			setMinutesLength(MINUTES_LENGTH_EDEFAULT);
			return;
		case ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__DAMAGED:
			setDamaged(DAMAGED_EDEFAULT);
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
		case ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH:
			return minutesLength != MINUTES_LENGTH_EDEFAULT;
		case ExtLibraryProfilePackage.AUDIO_VISUAL_ITEM__DAMAGED:
			return damaged != DAMAGED_EDEFAULT;
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
		result.append(" (minutesLength: ");
		result.append(minutesLength);
		result.append(", damaged: ");
		result.append(damaged);
		result.append(')');
		return result.toString();
	}

} // AudioVisualItemImpl
