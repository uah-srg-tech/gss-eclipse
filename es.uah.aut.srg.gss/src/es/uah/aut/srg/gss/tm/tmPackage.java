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
package es.uah.aut.srg.gss.tm;

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
 * @see es.uah.aut.srg.gss.tm.tmFactory
 * @model kind="package"
 * @generated
 */
public interface tmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/tm";

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
	tmPackage eINSTANCE = es.uah.aut.srg.gss.tm.impl.tmPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl <em>GSSTM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm.impl.GSSTMImpl
	 * @see es.uah.aut.srg.gss.tm.impl.tmPackageImpl#getGSSTM()
	 * @generated
	 */
	int GSSTM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__NAME = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__TYPE = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__SUBTYPE = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Pi1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__PI1 = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM__PI1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__FIELDS = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM__FIELDS;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__LEVELS = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level3 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__LEVEL3_FILTER = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level3 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__LEVEL3_FORMAT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From level2 import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__FROM_LEVEL2_IMPORT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level2 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__LEVEL2_FILTER = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level2 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__LEVEL2_FORMAT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From level1 import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__FROM_LEVEL1_IMPORT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level1 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__LEVEL1_FILTER = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Level1 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__LEVEL1_FORMAT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>From level0 import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__FROM_LEVEL0_IMPORT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__LEVEL0_FILTER = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Level0 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__LEVEL0_FORMAT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Gss Pi1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__GSS_PI1 = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Gss Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM__GSS_FIELDS = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>GSSTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_FEATURE_COUNT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>GSSTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OPERATION_COUNT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm.impl.GSSTMPi1Impl <em>GSSTM Pi1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm.impl.GSSTMPi1Impl
	 * @see es.uah.aut.srg.gss.tm.impl.tmPackageImpl#getGSSTMPi1()
	 * @generated
	 */
	int GSSTM_PI1 = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_PI1__NAME = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFPI1__NAME;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_PI1__VAL = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFPI1__VAL;

	/**
	 * The feature id for the '<em><b>Gss Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_PI1__GSS_FIELD = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFPI1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSSTM Pi1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_PI1_FEATURE_COUNT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFPI1_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSSTM Pi1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_PI1_OPERATION_COUNT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFPI1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tm.impl.GSSTMFieldImpl <em>GSSTM Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tm.impl.GSSTMFieldImpl
	 * @see es.uah.aut.srg.gss.tm.impl.tmPackageImpl#getGSSTMField()
	 * @generated
	 */
	int GSSTM_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_FIELD__NAME = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Enum Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_FIELD__ENUM_REF = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FIELD__ENUM_REF;

	/**
	 * The feature id for the '<em><b>Gss Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_FIELD__GSS_FIELD = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSSTM Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_FIELD_FEATURE_COUNT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSSTM Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_FIELD_OPERATION_COUNT = es.uah.aut.srg.tmtcif.tm.tmPackage.TMTCIFTM_FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm.GSSTM <em>GSSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTM</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM
	 * @generated
	 */
	EClass getGSSTM();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Levels</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getLevels()
	 * @see #getGSSTM()
	 * @generated
	 */
	EAttribute getGSSTM_Levels();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel3_filter <em>Level3 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 filter</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getLevel3_filter()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_Level3_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel3_format <em>Level3 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 format</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getLevel3_format()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_Level3_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getFrom_level2_import <em>From level2 import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From level2 import</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getFrom_level2_import()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_From_level2_import();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel2_filter <em>Level2 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 filter</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getLevel2_filter()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_Level2_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel2_format <em>Level2 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 format</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getLevel2_format()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_Level2_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getFrom_level1_import <em>From level1 import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From level1 import</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getFrom_level1_import()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_From_level1_import();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel1_filter <em>Level1 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 filter</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getLevel1_filter()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_Level1_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel1_format <em>Level1 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 format</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getLevel1_format()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_Level1_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getFrom_level0_import <em>From level0 import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From level0 import</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getFrom_level0_import()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_From_level0_import();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getLevel0_filter()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_Level0_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel0_format <em>Level0 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0 format</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getLevel0_format()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_Level0_format();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tm.GSSTM#getGssPi1 <em>Gss Pi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss Pi1</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getGssPi1()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_GssPi1();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tm.GSSTM#getGssFields <em>Gss Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gss Fields</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTM#getGssFields()
	 * @see #getGSSTM()
	 * @generated
	 */
	EReference getGSSTM_GssFields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm.GSSTMPi1 <em>GSSTM Pi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTM Pi1</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTMPi1
	 * @generated
	 */
	EClass getGSSTMPi1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTMPi1#getGssField <em>Gss Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gss Field</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTMPi1#getGssField()
	 * @see #getGSSTMPi1()
	 * @generated
	 */
	EReference getGSSTMPi1_GssField();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tm.GSSTMField <em>GSSTM Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTM Field</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTMField
	 * @generated
	 */
	EClass getGSSTMField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tm.GSSTMField#getGssField <em>Gss Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gss Field</em>'.
	 * @see es.uah.aut.srg.gss.tm.GSSTMField#getGssField()
	 * @see #getGSSTMField()
	 * @generated
	 */
	EReference getGSSTMField_GssField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tmFactory gettmFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm.impl.GSSTMImpl <em>GSSTM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm.impl.GSSTMImpl
		 * @see es.uah.aut.srg.gss.tm.impl.tmPackageImpl#getGSSTM()
		 * @generated
		 */
		EClass GSSTM = eINSTANCE.getGSSTM();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSSTM__LEVELS = eINSTANCE.getGSSTM_Levels();

		/**
		 * The meta object literal for the '<em><b>Level3 filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__LEVEL3_FILTER = eINSTANCE.getGSSTM_Level3_filter();

		/**
		 * The meta object literal for the '<em><b>Level3 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__LEVEL3_FORMAT = eINSTANCE.getGSSTM_Level3_format();

		/**
		 * The meta object literal for the '<em><b>From level2 import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__FROM_LEVEL2_IMPORT = eINSTANCE.getGSSTM_From_level2_import();

		/**
		 * The meta object literal for the '<em><b>Level2 filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__LEVEL2_FILTER = eINSTANCE.getGSSTM_Level2_filter();

		/**
		 * The meta object literal for the '<em><b>Level2 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__LEVEL2_FORMAT = eINSTANCE.getGSSTM_Level2_format();

		/**
		 * The meta object literal for the '<em><b>From level1 import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__FROM_LEVEL1_IMPORT = eINSTANCE.getGSSTM_From_level1_import();

		/**
		 * The meta object literal for the '<em><b>Level1 filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__LEVEL1_FILTER = eINSTANCE.getGSSTM_Level1_filter();

		/**
		 * The meta object literal for the '<em><b>Level1 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__LEVEL1_FORMAT = eINSTANCE.getGSSTM_Level1_format();

		/**
		 * The meta object literal for the '<em><b>From level0 import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__FROM_LEVEL0_IMPORT = eINSTANCE.getGSSTM_From_level0_import();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__LEVEL0_FILTER = eINSTANCE.getGSSTM_Level0_filter();

		/**
		 * The meta object literal for the '<em><b>Level0 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__LEVEL0_FORMAT = eINSTANCE.getGSSTM_Level0_format();

		/**
		 * The meta object literal for the '<em><b>Gss Pi1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__GSS_PI1 = eINSTANCE.getGSSTM_GssPi1();

		/**
		 * The meta object literal for the '<em><b>Gss Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM__GSS_FIELDS = eINSTANCE.getGSSTM_GssFields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm.impl.GSSTMPi1Impl <em>GSSTM Pi1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm.impl.GSSTMPi1Impl
		 * @see es.uah.aut.srg.gss.tm.impl.tmPackageImpl#getGSSTMPi1()
		 * @generated
		 */
		EClass GSSTM_PI1 = eINSTANCE.getGSSTMPi1();

		/**
		 * The meta object literal for the '<em><b>Gss Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_PI1__GSS_FIELD = eINSTANCE.getGSSTMPi1_GssField();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tm.impl.GSSTMFieldImpl <em>GSSTM Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tm.impl.GSSTMFieldImpl
		 * @see es.uah.aut.srg.gss.tm.impl.tmPackageImpl#getGSSTMField()
		 * @generated
		 */
		EClass GSSTM_FIELD = eINSTANCE.getGSSTMField();

		/**
		 * The meta object literal for the '<em><b>Gss Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_FIELD__GSS_FIELD = eINSTANCE.getGSSTMField_GssField();

	}

} //tmPackage
