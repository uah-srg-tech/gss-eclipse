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
package es.uah.aut.srg.gss.tcinput;

import es.uah.aut.srg.tmtcif.tc.tcPackage;
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
 * @see es.uah.aut.srg.gss.tcinput.tcinputFactory
 * @model kind="package"
 * @generated
 */
public interface tcinputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tcinput";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/tcinput";

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
	tcinputPackage eINSTANCE = es.uah.aut.srg.gss.tcinput.impl.tcinputPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tcinput.impl.GSSTCInputImpl <em>GSSTC Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tcinput.impl.GSSTCInputImpl
	 * @see es.uah.aut.srg.gss.tcinput.impl.tcinputPackageImpl#getGSSTCInput()
	 * @generated
	 */
	int GSSTC_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__NAME = tcPackage.TMTCIFTC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__TYPE = tcPackage.TMTCIFTC__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__SUBTYPE = tcPackage.TMTCIFTC__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__FIELDS = tcPackage.TMTCIFTC__FIELDS;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__LEVELS = tcPackage.TMTCIFTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To level3 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__TO_LEVEL3_EXPORT = tcPackage.TMTCIFTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level3 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__LEVEL3_FORMAT = tcPackage.TMTCIFTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To level2 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__TO_LEVEL2_EXPORT = tcPackage.TMTCIFTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level2 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__LEVEL2_FORMAT = tcPackage.TMTCIFTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To level1 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__TO_LEVEL1_EXPORT = tcPackage.TMTCIFTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Level1 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__LEVEL1_FORMAT = tcPackage.TMTCIFTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>To level0 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__TO_LEVEL0_EXPORT = tcPackage.TMTCIFTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Level0 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__LEVEL0_FORMAT = tcPackage.TMTCIFTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gss Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT__GSS_FIELDS = tcPackage.TMTCIFTC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>GSSTC Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT_FEATURE_COUNT = tcPackage.TMTCIFTC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>GSSTC Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT_OPERATION_COUNT = tcPackage.TMTCIFTC_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tcinput.impl.GSSTCInputFieldImpl <em>GSSTC Input Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tcinput.impl.GSSTCInputFieldImpl
	 * @see es.uah.aut.srg.gss.tcinput.impl.tcinputPackageImpl#getGSSTCInputField()
	 * @generated
	 */
	int GSSTC_INPUT_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT_FIELD__NAME = tcPackage.TMTCIFTC_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Enum Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT_FIELD__ENUM_REF = tcPackage.TMTCIFTC_FIELD__ENUM_REF;

	/**
	 * The feature id for the '<em><b>Gss Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT_FIELD__GSS_FIELD = tcPackage.TMTCIFTC_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSSTC Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT_FIELD_FEATURE_COUNT = tcPackage.TMTCIFTC_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSSTC Input Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_INPUT_FIELD_OPERATION_COUNT = tcPackage.TMTCIFTC_FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput <em>GSSTC Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTC Input</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput
	 * @generated
	 */
	EClass getGSSTCInput();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Levels</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevels()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EAttribute getGSSTCInput_Levels();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getTo_level3_export <em>To level3 export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To level3 export</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getTo_level3_export()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EReference getGSSTCInput_To_level3_export();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevel3_format <em>Level3 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 format</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevel3_format()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EReference getGSSTCInput_Level3_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getTo_level2_export <em>To level2 export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To level2 export</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getTo_level2_export()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EReference getGSSTCInput_To_level2_export();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevel2_format <em>Level2 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 format</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevel2_format()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EReference getGSSTCInput_Level2_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getTo_level1_export <em>To level1 export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To level1 export</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getTo_level1_export()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EReference getGSSTCInput_To_level1_export();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevel1_format <em>Level1 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 format</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevel1_format()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EReference getGSSTCInput_Level1_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getTo_level0_export <em>To level0 export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To level0 export</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getTo_level0_export()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EReference getGSSTCInput_To_level0_export();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevel0_format <em>Level0 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0 format</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getLevel0_format()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EReference getGSSTCInput_Level0_format();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tcinput.GSSTCInput#getGssFields <em>Gss Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gss Fields</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInput#getGssFields()
	 * @see #getGSSTCInput()
	 * @generated
	 */
	EReference getGSSTCInput_GssFields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tcinput.GSSTCInputField <em>GSSTC Input Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTC Input Field</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInputField
	 * @generated
	 */
	EClass getGSSTCInputField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tcinput.GSSTCInputField#getGssField <em>Gss Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gss Field</em>'.
	 * @see es.uah.aut.srg.gss.tcinput.GSSTCInputField#getGssField()
	 * @see #getGSSTCInputField()
	 * @generated
	 */
	EReference getGSSTCInputField_GssField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tcinputFactory gettcinputFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tcinput.impl.GSSTCInputImpl <em>GSSTC Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tcinput.impl.GSSTCInputImpl
		 * @see es.uah.aut.srg.gss.tcinput.impl.tcinputPackageImpl#getGSSTCInput()
		 * @generated
		 */
		EClass GSSTC_INPUT = eINSTANCE.getGSSTCInput();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSSTC_INPUT__LEVELS = eINSTANCE.getGSSTCInput_Levels();

		/**
		 * The meta object literal for the '<em><b>To level3 export</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT__TO_LEVEL3_EXPORT = eINSTANCE.getGSSTCInput_To_level3_export();

		/**
		 * The meta object literal for the '<em><b>Level3 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT__LEVEL3_FORMAT = eINSTANCE.getGSSTCInput_Level3_format();

		/**
		 * The meta object literal for the '<em><b>To level2 export</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT__TO_LEVEL2_EXPORT = eINSTANCE.getGSSTCInput_To_level2_export();

		/**
		 * The meta object literal for the '<em><b>Level2 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT__LEVEL2_FORMAT = eINSTANCE.getGSSTCInput_Level2_format();

		/**
		 * The meta object literal for the '<em><b>To level1 export</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT__TO_LEVEL1_EXPORT = eINSTANCE.getGSSTCInput_To_level1_export();

		/**
		 * The meta object literal for the '<em><b>Level1 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT__LEVEL1_FORMAT = eINSTANCE.getGSSTCInput_Level1_format();

		/**
		 * The meta object literal for the '<em><b>To level0 export</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT__TO_LEVEL0_EXPORT = eINSTANCE.getGSSTCInput_To_level0_export();

		/**
		 * The meta object literal for the '<em><b>Level0 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT__LEVEL0_FORMAT = eINSTANCE.getGSSTCInput_Level0_format();

		/**
		 * The meta object literal for the '<em><b>Gss Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT__GSS_FIELDS = eINSTANCE.getGSSTCInput_GssFields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tcinput.impl.GSSTCInputFieldImpl <em>GSSTC Input Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tcinput.impl.GSSTCInputFieldImpl
		 * @see es.uah.aut.srg.gss.tcinput.impl.tcinputPackageImpl#getGSSTCInputField()
		 * @generated
		 */
		EClass GSSTC_INPUT_FIELD = eINSTANCE.getGSSTCInputField();

		/**
		 * The meta object literal for the '<em><b>Gss Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_INPUT_FIELD__GSS_FIELD = eINSTANCE.getGSSTCInputField_GssField();

	}

} //tcinputPackage
