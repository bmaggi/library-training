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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.ExtLibraryProfileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='extlibrary'"
 * @generated
 */
public interface ExtLibraryProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "extlibraryprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://Papyrus/ExtLibraryProfile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "ExtLibraryProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ExtLibraryProfilePackage eINSTANCE = org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ItemImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM__PUBLICATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM__BASE_CLASS = 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.CirculatingItemImpl <em>Circulating Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.CirculatingItemImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getCirculatingItem()
	 * @generated
	 */
	int CIRCULATING_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCULATING_ITEM__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCULATING_ITEM__PUBLICATION_DATE = ITEM__PUBLICATION_DATE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCULATING_ITEM__BASE_CLASS = ITEM__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCULATING_ITEM__COPIES = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Circulating Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCULATING_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Circulating Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CIRCULATING_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BookImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = CIRCULATING_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK__PUBLICATION_DATE = CIRCULATING_ITEM__PUBLICATION_DATE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK__BASE_CLASS = CIRCULATING_ITEM__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK__COPIES = CIRCULATING_ITEM__COPIES;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK__PAGES = CIRCULATING_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK__CATEGORY = CIRCULATING_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = CIRCULATING_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = CIRCULATING_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.LendableImpl <em>Lendable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.LendableImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getLendable()
	 * @generated
	 */
	int LENDABLE = 3;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LENDABLE__COPIES = 0;

	/**
	 * The number of structural features of the '<em>Lendable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LENDABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Lendable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LENDABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AddressableImpl <em>Addressable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AddressableImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getAddressable()
	 * @generated
	 */
	int ADDRESSABLE = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Addressable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Addressable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADDRESSABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.LibraryImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ADDRESS = ADDRESSABLE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = ADDRESSABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BASE_PACKAGE = ADDRESSABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = ADDRESSABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = ADDRESSABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PersonImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 7;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESS = ADDRESSABLE__ADDRESS;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = ADDRESSABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = ADDRESSABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Video Cassete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__VIDEO_CASSETE = ADDRESSABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Book On Tape1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__BOOK_ON_TAPE1 = ADDRESSABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON__BASE_CLASS = ADDRESSABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = ADDRESSABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = ADDRESSABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.WriterImpl <em>Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.WriterImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getWriter()
	 * @generated
	 */
	int WRITER = 6;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Video Cassete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER__VIDEO_CASSETE = PERSON__VIDEO_CASSETE;

	/**
	 * The feature id for the '<em><b>Book On Tape1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER__BOOK_ON_TAPE1 = PERSON__BOOK_ON_TAPE1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER__BASE_CLASS = PERSON__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER__NAME = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Book On Tape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER__BOOK_ON_TAPE = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WRITER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AudioVisualItemImpl <em>Audio Visual Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AudioVisualItemImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getAudioVisualItem()
	 * @generated
	 */
	int AUDIO_VISUAL_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_VISUAL_ITEM__TITLE = CIRCULATING_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_VISUAL_ITEM__PUBLICATION_DATE = CIRCULATING_ITEM__PUBLICATION_DATE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_VISUAL_ITEM__BASE_CLASS = CIRCULATING_ITEM__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_VISUAL_ITEM__COPIES = CIRCULATING_ITEM__COPIES;

	/**
	 * The feature id for the '<em><b>Minutes Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_VISUAL_ITEM__MINUTES_LENGTH = CIRCULATING_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Damaged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_VISUAL_ITEM__DAMAGED = CIRCULATING_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Audio Visual Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_VISUAL_ITEM_FEATURE_COUNT = CIRCULATING_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Audio Visual Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AUDIO_VISUAL_ITEM_OPERATION_COUNT = CIRCULATING_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.VideoCasseteImpl <em>Video Cassete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.VideoCasseteImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getVideoCassete()
	 * @generated
	 */
	int VIDEO_CASSETE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIDEO_CASSETE__TITLE = AUDIO_VISUAL_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIDEO_CASSETE__PUBLICATION_DATE = AUDIO_VISUAL_ITEM__PUBLICATION_DATE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIDEO_CASSETE__BASE_CLASS = AUDIO_VISUAL_ITEM__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIDEO_CASSETE__COPIES = AUDIO_VISUAL_ITEM__COPIES;

	/**
	 * The feature id for the '<em><b>Minutes Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIDEO_CASSETE__MINUTES_LENGTH = AUDIO_VISUAL_ITEM__MINUTES_LENGTH;

	/**
	 * The feature id for the '<em><b>Damaged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIDEO_CASSETE__DAMAGED = AUDIO_VISUAL_ITEM__DAMAGED;

	/**
	 * The number of structural features of the '<em>Video Cassete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIDEO_CASSETE_FEATURE_COUNT = AUDIO_VISUAL_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video Cassete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VIDEO_CASSETE_OPERATION_COUNT = AUDIO_VISUAL_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BookOnTapeImpl <em>Book On Tape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BookOnTapeImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getBookOnTape()
	 * @generated
	 */
	int BOOK_ON_TAPE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_ON_TAPE__TITLE = AUDIO_VISUAL_ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_ON_TAPE__PUBLICATION_DATE = AUDIO_VISUAL_ITEM__PUBLICATION_DATE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_ON_TAPE__BASE_CLASS = AUDIO_VISUAL_ITEM__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_ON_TAPE__COPIES = AUDIO_VISUAL_ITEM__COPIES;

	/**
	 * The feature id for the '<em><b>Minutes Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_ON_TAPE__MINUTES_LENGTH = AUDIO_VISUAL_ITEM__MINUTES_LENGTH;

	/**
	 * The feature id for the '<em><b>Damaged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_ON_TAPE__DAMAGED = AUDIO_VISUAL_ITEM__DAMAGED;

	/**
	 * The number of structural features of the '<em>Book On Tape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_ON_TAPE_FEATURE_COUNT = AUDIO_VISUAL_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Book On Tape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_ON_TAPE_OPERATION_COUNT = AUDIO_VISUAL_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PeriodicalImpl <em>Periodical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PeriodicalImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getPeriodical()
	 * @generated
	 */
	int PERIODICAL = 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__PUBLICATION_DATE = ITEM__PUBLICATION_DATE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__BASE_CLASS = ITEM__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Issues Per Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__ISSUES_PER_YEAR = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Periodical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERIODICAL_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Periodical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PERIODICAL_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BorrowerImpl <em>Borrower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BorrowerImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getBorrower()
	 * @generated
	 */
	int BORROWER = 12;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWER__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWER__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWER__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Video Cassete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWER__VIDEO_CASSETE = PERSON__VIDEO_CASSETE;

	/**
	 * The feature id for the '<em><b>Book On Tape1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWER__BOOK_ON_TAPE1 = PERSON__BOOK_ON_TAPE1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWER__BASE_CLASS = PERSON__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Borrower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Borrower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.EmployeeImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 13;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ADDRESS = PERSON__ADDRESS;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Video Cassete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__VIDEO_CASSETE = PERSON__VIDEO_CASSETE;

	/**
	 * The feature id for the '<em><b>Book On Tape1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BOOK_ON_TAPE1 = PERSON__BOOK_ON_TAPE1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BASE_CLASS = PERSON__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BorrowsImpl <em>Borrows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BorrowsImpl
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getBorrows()
	 * @generated
	 */
	int BORROWS = 14;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWS__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Borrows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Borrows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BORROWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see java.util.Date
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getDate()
	 * @generated
	 */
	int DATE = 15;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Book</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book#getPages()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Pages();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Book#getCategory()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Category();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.CirculatingItem <em>Circulating Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Circulating Item</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.CirculatingItem
	 * @generated
	 */
	EClass getCirculatingItem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Item#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Item#getTitle()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Item#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Publication Date</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Item#getPublicationDate()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_PublicationDate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Item#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Item#getBase_Class()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Lendable <em>Lendable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Lendable</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Lendable
	 * @generated
	 */
	EClass getLendable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Lendable#getCopies <em>Copies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Copies</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Lendable#getCopies()
	 * @see #getLendable()
	 * @generated
	 */
	EAttribute getLendable_Copies();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Library#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Library#getBase_Package()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Addressable <em>Addressable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Addressable</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Addressable
	 * @generated
	 */
	EClass getAddressable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Addressable#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Addressable#getAddress()
	 * @see #getAddressable()
	 * @generated
	 */
	EAttribute getAddressable_Address();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Writer <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Writer</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Writer
	 * @generated
	 */
	EClass getWriter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Writer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Writer#getName()
	 * @see #getWriter()
	 * @generated
	 */
	EAttribute getWriter_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Writer#getBookOnTape <em>Book On Tape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Book On Tape</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Writer#getBookOnTape()
	 * @see #getWriter()
	 * @generated
	 */
	EReference getWriter_BookOnTape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getVideoCassete <em>Video Cassete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Video Cassete</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getVideoCassete()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_VideoCassete();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getBookOnTape1 <em>Book On Tape1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Book On Tape1</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getBookOnTape1()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_BookOnTape1();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Person#getBase_Class()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.VideoCassete <em>Video Cassete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Video Cassete</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.VideoCassete
	 * @generated
	 */
	EClass getVideoCassete();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem <em>Audio Visual Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Audio Visual Item</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem
	 * @generated
	 */
	EClass getAudioVisualItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem#getMinutesLength <em>Minutes Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Minutes Length</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem#getMinutesLength()
	 * @see #getAudioVisualItem()
	 * @generated
	 */
	EAttribute getAudioVisualItem_MinutesLength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem#isDamaged <em>Damaged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Damaged</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.AudioVisualItem#isDamaged()
	 * @see #getAudioVisualItem()
	 * @generated
	 */
	EAttribute getAudioVisualItem_Damaged();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.BookOnTape <em>Book On Tape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Book On Tape</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.BookOnTape
	 * @generated
	 */
	EClass getBookOnTape();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Periodical <em>Periodical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Periodical</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Periodical
	 * @generated
	 */
	EClass getPeriodical();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Periodical#getIssuesPerYear <em>Issues Per Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Issues Per Year</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Periodical#getIssuesPerYear()
	 * @see #getPeriodical()
	 * @generated
	 */
	EAttribute getPeriodical_IssuesPerYear();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Borrower <em>Borrower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Borrower</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Borrower
	 * @generated
	 */
	EClass getBorrower();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Borrows <em>Borrows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Borrows</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Borrows
	 * @generated
	 */
	EClass getBorrows();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.Borrows#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.Borrows#getBase_Dependency()
	 * @see #getBorrows()
	 * @generated
	 */
	EReference getBorrows_Base_Dependency();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtLibraryProfileFactory getExtLibraryProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BookImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOOK__PAGES = eINSTANCE.getBook_Pages();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOOK__CATEGORY = eINSTANCE.getBook_Category();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.CirculatingItemImpl <em>Circulating Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.CirculatingItemImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getCirculatingItem()
		 * @generated
		 */
		EClass CIRCULATING_ITEM = eINSTANCE.getCirculatingItem();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ItemImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ITEM__TITLE = eINSTANCE.getItem_Title();

		/**
		 * The meta object literal for the '<em><b>Publication Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ITEM__PUBLICATION_DATE = eINSTANCE.getItem_PublicationDate();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITEM__BASE_CLASS = eINSTANCE.getItem_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.LendableImpl <em>Lendable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.LendableImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getLendable()
		 * @generated
		 */
		EClass LENDABLE = eINSTANCE.getLendable();

		/**
		 * The meta object literal for the '<em><b>Copies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LENDABLE__COPIES = eINSTANCE.getLendable_Copies();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.LibraryImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LIBRARY__BASE_PACKAGE = eINSTANCE.getLibrary_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AddressableImpl <em>Addressable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AddressableImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getAddressable()
		 * @generated
		 */
		EClass ADDRESSABLE = eINSTANCE.getAddressable();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ADDRESSABLE__ADDRESS = eINSTANCE.getAddressable_Address();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.WriterImpl <em>Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.WriterImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getWriter()
		 * @generated
		 */
		EClass WRITER = eINSTANCE.getWriter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute WRITER__NAME = eINSTANCE.getWriter_Name();

		/**
		 * The meta object literal for the '<em><b>Book On Tape</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference WRITER__BOOK_ON_TAPE = eINSTANCE.getWriter_BookOnTape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PersonImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Video Cassete</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PERSON__VIDEO_CASSETE = eINSTANCE.getPerson_VideoCassete();

		/**
		 * The meta object literal for the '<em><b>Book On Tape1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PERSON__BOOK_ON_TAPE1 = eINSTANCE.getPerson_BookOnTape1();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PERSON__BASE_CLASS = eINSTANCE.getPerson_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.VideoCasseteImpl <em>Video Cassete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.VideoCasseteImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getVideoCassete()
		 * @generated
		 */
		EClass VIDEO_CASSETE = eINSTANCE.getVideoCassete();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AudioVisualItemImpl <em>Audio Visual Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.AudioVisualItemImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getAudioVisualItem()
		 * @generated
		 */
		EClass AUDIO_VISUAL_ITEM = eINSTANCE.getAudioVisualItem();

		/**
		 * The meta object literal for the '<em><b>Minutes Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute AUDIO_VISUAL_ITEM__MINUTES_LENGTH = eINSTANCE.getAudioVisualItem_MinutesLength();

		/**
		 * The meta object literal for the '<em><b>Damaged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute AUDIO_VISUAL_ITEM__DAMAGED = eINSTANCE.getAudioVisualItem_Damaged();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BookOnTapeImpl <em>Book On Tape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BookOnTapeImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getBookOnTape()
		 * @generated
		 */
		EClass BOOK_ON_TAPE = eINSTANCE.getBookOnTape();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PeriodicalImpl <em>Periodical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.PeriodicalImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getPeriodical()
		 * @generated
		 */
		EClass PERIODICAL = eINSTANCE.getPeriodical();

		/**
		 * The meta object literal for the '<em><b>Issues Per Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PERIODICAL__ISSUES_PER_YEAR = eINSTANCE.getPeriodical_IssuesPerYear();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BorrowerImpl <em>Borrower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BorrowerImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getBorrower()
		 * @generated
		 */
		EClass BORROWER = eINSTANCE.getBorrower();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.EmployeeImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BorrowsImpl <em>Borrows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.BorrowsImpl
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getBorrows()
		 * @generated
		 */
		EClass BORROWS = eINSTANCE.getBorrows();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BORROWS__BASE_DEPENDENCY = eINSTANCE.getBorrows_Base_Dependency();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see java.util.Date
		 * @see org.eclipse.papyrus.training.library.profile.extlibraryprofile.impl.ExtLibraryProfilePackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} // ExtLibraryProfilePackage
