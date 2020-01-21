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
package enum_;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see enum_.EnumFactory
 * @model kind="package"
 * @generated
 */
public interface EnumPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enum";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/tmtcif/enum";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tmtcif";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumPackage eINSTANCE = enum_.impl.EnumPackageImpl.init();

	/**
	 * The meta object id for the '{@link enum_.impl.TMTCIFEnumImpl <em>TMTCIF Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enum_.impl.TMTCIFEnumImpl
	 * @see enum_.impl.EnumPackageImpl#getTMTCIFEnum()
	 * @generated
	 */
	int TMTCIF_ENUM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_ENUM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_ENUM__VALUES = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_ENUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link enum_.impl.TMTCIFEnumValueImpl <em>TMTCIF Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see enum_.impl.TMTCIFEnumValueImpl
	 * @see enum_.impl.EnumPackageImpl#getTMTCIFEnumValue()
	 * @generated
	 */
	int TMTCIF_ENUM_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_ENUM_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Raw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_ENUM_VALUE__RAW = 1;

	/**
	 * The number of structural features of the '<em>TMTCIF Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_ENUM_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TMTCIF Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMTCIF_ENUM_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link enum_.TMTCIFEnum <em>TMTCIF Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Enum</em>'.
	 * @see enum_.TMTCIFEnum
	 * @generated
	 */
	EClass getTMTCIFEnum();

	/**
	 * Returns the meta object for the attribute '{@link enum_.TMTCIFEnum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enum_.TMTCIFEnum#getName()
	 * @see #getTMTCIFEnum()
	 * @generated
	 */
	EAttribute getTMTCIFEnum_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link enum_.TMTCIFEnum#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see enum_.TMTCIFEnum#getValues()
	 * @see #getTMTCIFEnum()
	 * @generated
	 */
	EReference getTMTCIFEnum_Values();

	/**
	 * Returns the meta object for class '{@link enum_.TMTCIFEnumValue <em>TMTCIF Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMTCIF Enum Value</em>'.
	 * @see enum_.TMTCIFEnumValue
	 * @generated
	 */
	EClass getTMTCIFEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link enum_.TMTCIFEnumValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see enum_.TMTCIFEnumValue#getName()
	 * @see #getTMTCIFEnumValue()
	 * @generated
	 */
	EAttribute getTMTCIFEnumValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link enum_.TMTCIFEnumValue#getRaw <em>Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw</em>'.
	 * @see enum_.TMTCIFEnumValue#getRaw()
	 * @see #getTMTCIFEnumValue()
	 * @generated
	 */
	EAttribute getTMTCIFEnumValue_Raw();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumFactory getEnumFactory();

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
		 * The meta object literal for the '{@link enum_.impl.TMTCIFEnumImpl <em>TMTCIF Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enum_.impl.TMTCIFEnumImpl
		 * @see enum_.impl.EnumPackageImpl#getTMTCIFEnum()
		 * @generated
		 */
		EClass TMTCIF_ENUM = eINSTANCE.getTMTCIFEnum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_ENUM__NAME = eINSTANCE.getTMTCIFEnum_Name();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMTCIF_ENUM__VALUES = eINSTANCE.getTMTCIFEnum_Values();

		/**
		 * The meta object literal for the '{@link enum_.impl.TMTCIFEnumValueImpl <em>TMTCIF Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see enum_.impl.TMTCIFEnumValueImpl
		 * @see enum_.impl.EnumPackageImpl#getTMTCIFEnumValue()
		 * @generated
		 */
		EClass TMTCIF_ENUM_VALUE = eINSTANCE.getTMTCIFEnumValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_ENUM_VALUE__NAME = eINSTANCE.getTMTCIFEnumValue_Name();

		/**
		 * The meta object literal for the '<em><b>Raw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMTCIF_ENUM_VALUE__RAW = eINSTANCE.getTMTCIFEnumValue_Raw();

	}

} //EnumPackage
