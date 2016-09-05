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

import org.eclipse.papyrus.training.library.profile.library.BookCategory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book#getPages <em>Pages</em>}</li>
 * <li>{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage#getBook()
 * @model
 * @generated
 */
public interface Book extends CirculatingItem {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pages</em>' attribute.
	 * @see #setPages(int)
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage#getBook_Pages()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPages();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Pages</em>' attribute.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(int value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.training.library.profile.library.BookCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.papyrus.training.library.profile.library.BookCategory
	 * @see #setCategory(BookCategory)
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfilePackage#getBook_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookCategory getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.papyrus.training.library.profile.library.BookCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BookCategory value);

} // Book
