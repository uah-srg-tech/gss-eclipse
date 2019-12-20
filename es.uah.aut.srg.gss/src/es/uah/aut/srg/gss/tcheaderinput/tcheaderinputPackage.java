/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.tcheaderinput;

import es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage;

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
 * @see es.uah.aut.srg.gss.tcheaderinput.tcheaderinputFactory
 * @model kind="package"
 * @generated
 */
public interface tcheaderinputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tcheaderinput";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/tcheaderinput";

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
	tcheaderinputPackage eINSTANCE = es.uah.aut.srg.gss.tcheaderinput.impl.tcheaderinputPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputImpl <em>GSSTC Header Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputImpl
	 * @see es.uah.aut.srg.gss.tcheaderinput.impl.tcheaderinputPackageImpl#getGSSTCHeaderInput()
	 * @generated
	 */
	int GSSTC_HEADER_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT__NAME = tcheaderPackage.TMTCIFTC_HEADER__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT__FIELDS = tcheaderPackage.TMTCIFTC_HEADER__FIELDS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT__FORMAT = tcheaderPackage.TMTCIFTC_HEADER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gss Header Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT__GSS_HEADER_FIELDS = tcheaderPackage.TMTCIFTC_HEADER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSSTC Header Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT_FEATURE_COUNT = tcheaderPackage.TMTCIFTC_HEADER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSSTC Header Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT_OPERATION_COUNT = tcheaderPackage.TMTCIFTC_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputFieldImpl <em>GSSTC Header Input Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputFieldImpl
	 * @see es.uah.aut.srg.gss.tcheaderinput.impl.tcheaderinputPackageImpl#getGSSTCHeaderInputField()
	 * @generated
	 */
	int GSSTC_HEADER_INPUT_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT_FIELD__NAME = tcheaderPackage.TMTCIFTC_HEADER_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Field Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT_FIELD__FIELD_VALUE = tcheaderPackage.TMTCIFTC_HEADER_FIELD__FIELD_VALUE;

	/**
	 * The feature id for the '<em><b>Gss Header Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT_FIELD__GSS_HEADER_FIELD = tcheaderPackage.TMTCIFTC_HEADER_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSSTC Header Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT_FIELD_FEATURE_COUNT = tcheaderPackage.TMTCIFTC_HEADER_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSSTC Header Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_HEADER_INPUT_FIELD_OPERATION_COUNT = tcheaderPackage.TMTCIFTC_HEADER_FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput <em>GSSTC Header Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTC Header Input</em>'.
	 * @see es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput
	 * @generated
	 */
	EClass getGSSTCHeaderInput();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Format</em>'.
	 * @see es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput#getFormat()
	 * @see #getGSSTCHeaderInput()
	 * @generated
	 */
	EReference getGSSTCHeaderInput_Format();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput#getGssHeaderFields <em>Gss Header Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gss Header Fields</em>'.
	 * @see es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput#getGssHeaderFields()
	 * @see #getGSSTCHeaderInput()
	 * @generated
	 */
	EReference getGSSTCHeaderInput_GssHeaderFields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField <em>GSSTC Header Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTC Header Input Field</em>'.
	 * @see es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField
	 * @generated
	 */
	EClass getGSSTCHeaderInputField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField#getGssHeaderField <em>Gss Header Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gss Header Field</em>'.
	 * @see es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField#getGssHeaderField()
	 * @see #getGSSTCHeaderInputField()
	 * @generated
	 */
	EReference getGSSTCHeaderInputField_GssHeaderField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tcheaderinputFactory gettcheaderinputFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputImpl <em>GSSTC Header Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputImpl
		 * @see es.uah.aut.srg.gss.tcheaderinput.impl.tcheaderinputPackageImpl#getGSSTCHeaderInput()
		 * @generated
		 */
		EClass GSSTC_HEADER_INPUT = eINSTANCE.getGSSTCHeaderInput();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_HEADER_INPUT__FORMAT = eINSTANCE.getGSSTCHeaderInput_Format();

		/**
		 * The meta object literal for the '<em><b>Gss Header Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_HEADER_INPUT__GSS_HEADER_FIELDS = eINSTANCE.getGSSTCHeaderInput_GssHeaderFields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputFieldImpl <em>GSSTC Header Input Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputFieldImpl
		 * @see es.uah.aut.srg.gss.tcheaderinput.impl.tcheaderinputPackageImpl#getGSSTCHeaderInputField()
		 * @generated
		 */
		EClass GSSTC_HEADER_INPUT_FIELD = eINSTANCE.getGSSTCHeaderInputField();

		/**
		 * The meta object literal for the '<em><b>Gss Header Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_HEADER_INPUT_FIELD__GSS_HEADER_FIELD = eINSTANCE.getGSSTCHeaderInputField_GssHeaderField();

	}

} //tcheaderinputPackage
