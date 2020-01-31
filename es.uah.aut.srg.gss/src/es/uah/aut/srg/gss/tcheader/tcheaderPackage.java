/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.tcheader;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.tcheader.tcheaderFactory
 * @model kind="package"
 * @generated
 */
public interface tcheaderPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tcheader";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/tcheader";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tcheaderPackage eINSTANCE = es.uah.aut.srg.gss.tcheader.impl.tcheaderPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tcheader.impl.GSSTCHeaderImpl <em>GSSTC Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tcheader.impl.GSSTCHeaderImpl
	 * @see es.uah.aut.srg.gss.tcheader.impl.tcheaderPackageImpl#getGSSTCHeader()
	 * @generated
	 */
	int GSSTC_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER__NAME = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER__FIELDS = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER__FIELDS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER__FORMAT = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gss Header Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER__GSS_HEADER_FIELDS = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSSTC Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_FEATURE_COUNT = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSSTC Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_OPERATION_COUNT = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tcheader.impl.GSSTCHeaderFieldImpl <em>GSSTC Header Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tcheader.impl.GSSTCHeaderFieldImpl
	 * @see es.uah.aut.srg.gss.tcheader.impl.tcheaderPackageImpl#getGSSTCHeaderField()
	 * @generated
	 */
	int GSSTC_HEADER_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_FIELD__NAME = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Field Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_FIELD__FIELD_VALUE = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE;

	/**
	 * The feature id for the '<em><b>Gss Header Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_FIELD__GSS_HEADER_FIELD = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSSTC Header Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_FIELD_FEATURE_COUNT = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSSTC Header Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_FIELD_OPERATION_COUNT = es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.TMTCIFTC_HEADER_FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tcheader.GSSTCHeader <em>GSSTC Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTC Header</em>'.
	 * @see es.uah.aut.srg.gss.tcheader.GSSTCHeader
	 * @generated
	 */
	EClass getGSSTCHeader();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcheader.GSSTCHeader#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Format</em>'.
	 * @see es.uah.aut.srg.gss.tcheader.GSSTCHeader#getFormat()
	 * @see #getGSSTCHeader()
	 * @generated
	 */
	EReference getGSSTCHeader_Format();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tcheader.GSSTCHeader#getGssHeaderFields <em>Gss Header Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gss Header Fields</em>'.
	 * @see es.uah.aut.srg.gss.tcheader.GSSTCHeader#getGssHeaderFields()
	 * @see #getGSSTCHeader()
	 * @generated
	 */
	EReference getGSSTCHeader_GssHeaderFields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tcheader.GSSTCHeaderField <em>GSSTC Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTC Header Field</em>'.
	 * @see es.uah.aut.srg.gss.tcheader.GSSTCHeaderField
	 * @generated
	 */
	EClass getGSSTCHeaderField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcheader.GSSTCHeaderField#getGssHeaderField <em>Gss Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gss Header Field</em>'.
	 * @see es.uah.aut.srg.gss.tcheader.GSSTCHeaderField#getGssHeaderField()
	 * @see #getGSSTCHeaderField()
	 * @generated
	 */
	EReference getGSSTCHeaderField_GssHeaderField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tcheaderFactory gettcheaderFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tcheader.impl.GSSTCHeaderImpl <em>GSSTC Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tcheader.impl.GSSTCHeaderImpl
		 * @see es.uah.aut.srg.gss.tcheader.impl.tcheaderPackageImpl#getGSSTCHeader()
		 * @generated
		 */
		EClass GSSTC_HEADER = eINSTANCE.getGSSTCHeader();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_HEADER__FORMAT = eINSTANCE.getGSSTCHeader_Format();

		/**
		 * The meta object literal for the '<em><b>Gss Header Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_HEADER__GSS_HEADER_FIELDS = eINSTANCE.getGSSTCHeader_GssHeaderFields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tcheader.impl.GSSTCHeaderFieldImpl <em>GSSTC Header Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tcheader.impl.GSSTCHeaderFieldImpl
		 * @see es.uah.aut.srg.gss.tcheader.impl.tcheaderPackageImpl#getGSSTCHeaderField()
		 * @generated
		 */
		EClass GSSTC_HEADER_FIELD = eINSTANCE.getGSSTCHeaderField();

		/**
		 * The meta object literal for the '<em><b>Gss Header Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_HEADER_FIELD__GSS_HEADER_FIELD = eINSTANCE.getGSSTCHeaderField_GssHeaderField();

	}

} //tcheaderPackage
