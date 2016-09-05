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
package org.eclipse.papyrus.training.library.profile.extlibraryprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Visual Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem#getMinutesLength <em>Minutes Length</em>}</li>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem#isDamaged <em>Damaged</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage#getAudioVisualItem()
 * @model abstract="true"
 * @generated
 */
public interface AudioVisualItem extends CirculatingItem {
	/**
	 * Returns the value of the '<em><b>Minutes Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Minutes Length</em>' attribute.
	 * @see #setMinutesLength(int)
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage#getAudioVisualItem_MinutesLength()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMinutesLength();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem#getMinutesLength <em>Minutes Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Minutes Length</em>' attribute.
	 * @see #getMinutesLength()
	 * @generated
	 */
	void setMinutesLength(int value);

	/**
	 * Returns the value of the '<em><b>Damaged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damaged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Damaged</em>' attribute.
	 * @see #setDamaged(boolean)
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage#getAudioVisualItem_Damaged()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDamaged();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem#isDamaged <em>Damaged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Damaged</em>' attribute.
	 * @see #isDamaged()
	 * @generated
	 */
	void setDamaged(boolean value);

} // AudioVisualItem
