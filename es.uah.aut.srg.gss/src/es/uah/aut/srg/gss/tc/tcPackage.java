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
package es.uah.aut.srg.gss.tc;

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
 * @see es.uah.aut.srg.gss.tc.tcFactory
 * @model kind="package"
 * @generated
 */
public interface tcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/tc";

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
	tcPackage eINSTANCE = es.uah.aut.srg.gss.tc.impl.tcPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl <em>GSSTC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tc.impl.GSSTCImpl
	 * @see es.uah.aut.srg.gss.tc.impl.tcPackageImpl#getGSSTC()
	 * @generated
	 */
	int GSSTC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__NAME = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__TYPE = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__SUBTYPE = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__FIELDS = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC__FIELDS;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__LEVELS = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To level3 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__TO_LEVEL3_EXPORT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level3 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__LEVEL3_FORMAT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To level2 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__TO_LEVEL2_EXPORT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level2 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__LEVEL2_FORMAT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>To level1 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__TO_LEVEL1_EXPORT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Level1 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__LEVEL1_FORMAT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>To level0 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__TO_LEVEL0_EXPORT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Level0 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC__LEVEL0_FORMAT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>GSSTC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_FEATURE_COUNT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>GSSTC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_OPERATION_COUNT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tc.impl.GSSTCFieldImpl <em>GSSTC Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tc.impl.GSSTCFieldImpl
	 * @see es.uah.aut.srg.gss.tc.impl.tcPackageImpl#getGSSTCField()
	 * @generated
	 */
	int GSSTC_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_FIELD__NAME = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Enum Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_FIELD__ENUM_REF = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FIELD__ENUM_REF;

	/**
	 * The feature id for the '<em><b>Gss Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_FIELD__GSS_FIELD = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSSTC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_FIELD_FEATURE_COUNT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSSTC Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTC_FIELD_OPERATION_COUNT = es.uah.aut.srg.tmtcif.tc.tcPackage.TMTCIFTC_FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tc.GSSTC <em>GSSTC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTC</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC
	 * @generated
	 */
	EClass getGSSTC();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Levels</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC#getLevels()
	 * @see #getGSSTC()
	 * @generated
	 */
	EAttribute getGSSTC_Levels();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level3_export <em>To level3 export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To level3 export</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC#getTo_level3_export()
	 * @see #getGSSTC()
	 * @generated
	 */
	EReference getGSSTC_To_level3_export();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel3_format <em>Level3 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 format</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC#getLevel3_format()
	 * @see #getGSSTC()
	 * @generated
	 */
	EReference getGSSTC_Level3_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level2_export <em>To level2 export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To level2 export</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC#getTo_level2_export()
	 * @see #getGSSTC()
	 * @generated
	 */
	EReference getGSSTC_To_level2_export();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel2_format <em>Level2 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 format</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC#getLevel2_format()
	 * @see #getGSSTC()
	 * @generated
	 */
	EReference getGSSTC_Level2_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level1_export <em>To level1 export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To level1 export</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC#getTo_level1_export()
	 * @see #getGSSTC()
	 * @generated
	 */
	EReference getGSSTC_To_level1_export();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel1_format <em>Level1 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 format</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC#getLevel1_format()
	 * @see #getGSSTC()
	 * @generated
	 */
	EReference getGSSTC_Level1_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level0_export <em>To level0 export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To level0 export</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC#getTo_level0_export()
	 * @see #getGSSTC()
	 * @generated
	 */
	EReference getGSSTC_To_level0_export();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel0_format <em>Level0 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0 format</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTC#getLevel0_format()
	 * @see #getGSSTC()
	 * @generated
	 */
	EReference getGSSTC_Level0_format();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tc.GSSTCField <em>GSSTC Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTC Field</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTCField
	 * @generated
	 */
	EClass getGSSTCField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tc.GSSTCField#getGssField <em>Gss Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gss Field</em>'.
	 * @see es.uah.aut.srg.gss.tc.GSSTCField#getGssField()
	 * @see #getGSSTCField()
	 * @generated
	 */
	EReference getGSSTCField_GssField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tcFactory gettcFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tc.impl.GSSTCImpl <em>GSSTC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tc.impl.GSSTCImpl
		 * @see es.uah.aut.srg.gss.tc.impl.tcPackageImpl#getGSSTC()
		 * @generated
		 */
		EClass GSSTC = eINSTANCE.getGSSTC();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSSTC__LEVELS = eINSTANCE.getGSSTC_Levels();

		/**
		 * The meta object literal for the '<em><b>To level3 export</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC__TO_LEVEL3_EXPORT = eINSTANCE.getGSSTC_To_level3_export();

		/**
		 * The meta object literal for the '<em><b>Level3 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC__LEVEL3_FORMAT = eINSTANCE.getGSSTC_Level3_format();

		/**
		 * The meta object literal for the '<em><b>To level2 export</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC__TO_LEVEL2_EXPORT = eINSTANCE.getGSSTC_To_level2_export();

		/**
		 * The meta object literal for the '<em><b>Level2 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC__LEVEL2_FORMAT = eINSTANCE.getGSSTC_Level2_format();

		/**
		 * The meta object literal for the '<em><b>To level1 export</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC__TO_LEVEL1_EXPORT = eINSTANCE.getGSSTC_To_level1_export();

		/**
		 * The meta object literal for the '<em><b>Level1 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC__LEVEL1_FORMAT = eINSTANCE.getGSSTC_Level1_format();

		/**
		 * The meta object literal for the '<em><b>To level0 export</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC__TO_LEVEL0_EXPORT = eINSTANCE.getGSSTC_To_level0_export();

		/**
		 * The meta object literal for the '<em><b>Level0 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC__LEVEL0_FORMAT = eINSTANCE.getGSSTC_Level0_format();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tc.impl.GSSTCFieldImpl <em>GSSTC Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tc.impl.GSSTCFieldImpl
		 * @see es.uah.aut.srg.gss.tc.impl.tcPackageImpl#getGSSTCField()
		 * @generated
		 */
		EClass GSSTC_FIELD = eINSTANCE.getGSSTCField();

		/**
		 * The meta object literal for the '<em><b>Gss Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTC_FIELD__GSS_FIELD = eINSTANCE.getGSSTCField_GssField();

	}

} //tcPackage
