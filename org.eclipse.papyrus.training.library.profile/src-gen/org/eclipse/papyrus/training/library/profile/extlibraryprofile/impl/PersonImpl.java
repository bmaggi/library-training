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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.training.library.profile.extlibraryprofile.BookOnTape;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person;
import org.eclipse.papyrus.training.library.profile.extlibraryprofile.VideoCassete;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PersonImpl#getVideoCassete <em>Video Cassete</em>}</li>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PersonImpl#getBookOnTape1 <em>Book On Tape1</em>}</li>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PersonImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends AddressableImpl implements Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVideoCassete() <em>Video Cassete</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getVideoCassete()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoCassete> videoCassete;

	/**
	 * The cached value of the '{@link #getBookOnTape1() <em>Book On Tape1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBookOnTape1()
	 * @generated
	 * @ordered
	 */
	protected BookOnTape bookOnTape1;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PersonImpl() {
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
		return ExtLibraryProfilePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtLibraryProfilePackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtLibraryProfilePackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<VideoCassete> getVideoCassete() {
		if (videoCassete == null) {
			videoCassete = new EObjectResolvingEList<VideoCassete>(VideoCassete.class, this, ExtLibraryProfilePackage.PERSON__VIDEO_CASSETE);
		}
		return videoCassete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BookOnTape getBookOnTape1() {
		if (bookOnTape1 != null && bookOnTape1.eIsProxy()) {
			InternalEObject oldBookOnTape1 = (InternalEObject) bookOnTape1;
			bookOnTape1 = (BookOnTape) eResolveProxy(oldBookOnTape1);
			if (bookOnTape1 != oldBookOnTape1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtLibraryProfilePackage.PERSON__BOOK_ON_TAPE1, oldBookOnTape1, bookOnTape1));
			}
		}
		return bookOnTape1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BookOnTape basicGetBookOnTape1() {
		return bookOnTape1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBookOnTape1(BookOnTape newBookOnTape1) {
		BookOnTape oldBookOnTape1 = bookOnTape1;
		bookOnTape1 = newBookOnTape1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtLibraryProfilePackage.PERSON__BOOK_ON_TAPE1, oldBookOnTape1, bookOnTape1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject) base_Class;
			base_Class = (org.eclipse.uml2.uml.Class) eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtLibraryProfilePackage.PERSON__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtLibraryProfilePackage.PERSON__BASE_CLASS, oldBase_Class, base_Class));
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
		case ExtLibraryProfilePackage.PERSON__FIRST_NAME:
			return getFirstName();
		case ExtLibraryProfilePackage.PERSON__LAST_NAME:
			return getLastName();
		case ExtLibraryProfilePackage.PERSON__VIDEO_CASSETE:
			return getVideoCassete();
		case ExtLibraryProfilePackage.PERSON__BOOK_ON_TAPE1:
			if (resolve)
				return getBookOnTape1();
			return basicGetBookOnTape1();
		case ExtLibraryProfilePackage.PERSON__BASE_CLASS:
			if (resolve)
				return getBase_Class();
			return basicGetBase_Class();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExtLibraryProfilePackage.PERSON__FIRST_NAME:
			setFirstName((String) newValue);
			return;
		case ExtLibraryProfilePackage.PERSON__LAST_NAME:
			setLastName((String) newValue);
			return;
		case ExtLibraryProfilePackage.PERSON__VIDEO_CASSETE:
			getVideoCassete().clear();
			getVideoCassete().addAll((Collection<? extends VideoCassete>) newValue);
			return;
		case ExtLibraryProfilePackage.PERSON__BOOK_ON_TAPE1:
			setBookOnTape1((BookOnTape) newValue);
			return;
		case ExtLibraryProfilePackage.PERSON__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) newValue);
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
		case ExtLibraryProfilePackage.PERSON__FIRST_NAME:
			setFirstName(FIRST_NAME_EDEFAULT);
			return;
		case ExtLibraryProfilePackage.PERSON__LAST_NAME:
			setLastName(LAST_NAME_EDEFAULT);
			return;
		case ExtLibraryProfilePackage.PERSON__VIDEO_CASSETE:
			getVideoCassete().clear();
			return;
		case ExtLibraryProfilePackage.PERSON__BOOK_ON_TAPE1:
			setBookOnTape1((BookOnTape) null);
			return;
		case ExtLibraryProfilePackage.PERSON__BASE_CLASS:
			setBase_Class((org.eclipse.uml2.uml.Class) null);
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
		case ExtLibraryProfilePackage.PERSON__FIRST_NAME:
			return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
		case ExtLibraryProfilePackage.PERSON__LAST_NAME:
			return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
		case ExtLibraryProfilePackage.PERSON__VIDEO_CASSETE:
			return videoCassete != null && !videoCassete.isEmpty();
		case ExtLibraryProfilePackage.PERSON__BOOK_ON_TAPE1:
			return bookOnTape1 != null;
		case ExtLibraryProfilePackage.PERSON__BASE_CLASS:
			return base_Class != null;
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(')');
		return result.toString();
	}

} // PersonImpl
