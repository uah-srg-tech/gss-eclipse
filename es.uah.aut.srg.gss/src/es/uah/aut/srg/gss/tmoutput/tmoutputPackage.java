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
package es.uah.aut.srg.gss.tmoutput;

import es.uah.aut.srg.tmtcif.tm.tmPackage;

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
 * @see es.uah.aut.srg.gss.tmoutput.tmoutputFactory
 * @model kind="package"
 * @generated
 */
public interface tmoutputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tmoutput";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/tmoutput";

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
	tmoutputPackage eINSTANCE = es.uah.aut.srg.gss.tmoutput.impl.tmoutputPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputImpl <em>GSSTM Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputImpl
	 * @see es.uah.aut.srg.gss.tmoutput.impl.tmoutputPackageImpl#getGSSTMOutput()
	 * @generated
	 */
	int GSSTM_OUTPUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__NAME = tmPackage.TMTCIFTM__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__TYPE = tmPackage.TMTCIFTM__TYPE;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__SUBTYPE = tmPackage.TMTCIFTM__SUBTYPE;

	/**
	 * The feature id for the '<em><b>Pi1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__PI1 = tmPackage.TMTCIFTM__PI1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__FIELDS = tmPackage.TMTCIFTM__FIELDS;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__LEVELS = tmPackage.TMTCIFTM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level3 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__LEVEL3_FILTER = tmPackage.TMTCIFTM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level3 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__LEVEL3_FORMAT = tmPackage.TMTCIFTM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From level2 import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__FROM_LEVEL2_IMPORT = tmPackage.TMTCIFTM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level2 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__LEVEL2_FILTER = tmPackage.TMTCIFTM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level2 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__LEVEL2_FORMAT = tmPackage.TMTCIFTM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From level1 import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__FROM_LEVEL1_IMPORT = tmPackage.TMTCIFTM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level1 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__LEVEL1_FILTER = tmPackage.TMTCIFTM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Level1 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__LEVEL1_FORMAT = tmPackage.TMTCIFTM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>From level0 import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__FROM_LEVEL0_IMPORT = tmPackage.TMTCIFTM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__LEVEL0_FILTER = tmPackage.TMTCIFTM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Level0 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__LEVEL0_FORMAT = tmPackage.TMTCIFTM_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Gss Pi1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__GSS_PI1 = tmPackage.TMTCIFTM_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Gss Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT__GSS_FIELDS = tmPackage.TMTCIFTM_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>GSSTM Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_FEATURE_COUNT = tmPackage.TMTCIFTM_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>GSSTM Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_OPERATION_COUNT = tmPackage.TMTCIFTM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputPi1Impl <em>GSSTM Output Pi1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputPi1Impl
	 * @see es.uah.aut.srg.gss.tmoutput.impl.tmoutputPackageImpl#getGSSTMOutputPi1()
	 * @generated
	 */
	int GSSTM_OUTPUT_PI1 = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_PI1__NAME = tmPackage.TMTCIFPI1__NAME;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_PI1__VAL = tmPackage.TMTCIFPI1__VAL;

	/**
	 * The feature id for the '<em><b>Gss Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_PI1__GSS_FIELD = tmPackage.TMTCIFPI1_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSSTM Output Pi1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_PI1_FEATURE_COUNT = tmPackage.TMTCIFPI1_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSSTM Output Pi1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_PI1_OPERATION_COUNT = tmPackage.TMTCIFPI1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputFieldImpl <em>GSSTM Output Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputFieldImpl
	 * @see es.uah.aut.srg.gss.tmoutput.impl.tmoutputPackageImpl#getGSSTMOutputField()
	 * @generated
	 */
	int GSSTM_OUTPUT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_FIELD__NAME = tmPackage.TMTCIFTM_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Gss Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_FIELD__GSS_FIELD = tmPackage.TMTCIFTM_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSSTM Output Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_FIELD_FEATURE_COUNT = tmPackage.TMTCIFTM_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSSTM Output Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSSTM_OUTPUT_FIELD_OPERATION_COUNT = tmPackage.TMTCIFTM_FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput <em>GSSTM Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTM Output</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput
	 * @generated
	 */
	EClass getGSSTMOutput();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Levels</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevels()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EAttribute getGSSTMOutput_Levels();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel3_filter <em>Level3 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 filter</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel3_filter()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_Level3_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel3_format <em>Level3 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 format</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel3_format()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_Level3_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getFrom_level2_import <em>From level2 import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From level2 import</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getFrom_level2_import()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_From_level2_import();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel2_filter <em>Level2 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 filter</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel2_filter()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_Level2_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel2_format <em>Level2 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 format</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel2_format()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_Level2_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getFrom_level1_import <em>From level1 import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From level1 import</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getFrom_level1_import()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_From_level1_import();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel1_filter <em>Level1 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 filter</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel1_filter()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_Level1_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel1_format <em>Level1 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 format</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel1_format()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_Level1_format();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getFrom_level0_import <em>From level0 import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From level0 import</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getFrom_level0_import()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_From_level0_import();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel0_filter()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_Level0_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel0_format <em>Level0 format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0 format</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getLevel0_format()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_Level0_format();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getGssPi1 <em>Gss Pi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss Pi1</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getGssPi1()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_GssPi1();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getGssFields <em>Gss Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gss Fields</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutput#getGssFields()
	 * @see #getGSSTMOutput()
	 * @generated
	 */
	EReference getGSSTMOutput_GssFields();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutputPi1 <em>GSSTM Output Pi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTM Output Pi1</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutputPi1
	 * @generated
	 */
	EClass getGSSTMOutputPi1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutputPi1#getGssField <em>Gss Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gss Field</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutputPi1#getGssField()
	 * @see #getGSSTMOutputPi1()
	 * @generated
	 */
	EReference getGSSTMOutputPi1_GssField();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutputField <em>GSSTM Output Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSSTM Output Field</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutputField
	 * @generated
	 */
	EClass getGSSTMOutputField();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.tmoutput.GSSTMOutputField#getGssField <em>Gss Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gss Field</em>'.
	 * @see es.uah.aut.srg.gss.tmoutput.GSSTMOutputField#getGssField()
	 * @see #getGSSTMOutputField()
	 * @generated
	 */
	EReference getGSSTMOutputField_GssField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	tmoutputFactory gettmoutputFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputImpl <em>GSSTM Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputImpl
		 * @see es.uah.aut.srg.gss.tmoutput.impl.tmoutputPackageImpl#getGSSTMOutput()
		 * @generated
		 */
		EClass GSSTM_OUTPUT = eINSTANCE.getGSSTMOutput();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSSTM_OUTPUT__LEVELS = eINSTANCE.getGSSTMOutput_Levels();

		/**
		 * The meta object literal for the '<em><b>Level3 filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__LEVEL3_FILTER = eINSTANCE.getGSSTMOutput_Level3_filter();

		/**
		 * The meta object literal for the '<em><b>Level3 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__LEVEL3_FORMAT = eINSTANCE.getGSSTMOutput_Level3_format();

		/**
		 * The meta object literal for the '<em><b>From level2 import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__FROM_LEVEL2_IMPORT = eINSTANCE.getGSSTMOutput_From_level2_import();

		/**
		 * The meta object literal for the '<em><b>Level2 filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__LEVEL2_FILTER = eINSTANCE.getGSSTMOutput_Level2_filter();

		/**
		 * The meta object literal for the '<em><b>Level2 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__LEVEL2_FORMAT = eINSTANCE.getGSSTMOutput_Level2_format();

		/**
		 * The meta object literal for the '<em><b>From level1 import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__FROM_LEVEL1_IMPORT = eINSTANCE.getGSSTMOutput_From_level1_import();

		/**
		 * The meta object literal for the '<em><b>Level1 filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__LEVEL1_FILTER = eINSTANCE.getGSSTMOutput_Level1_filter();

		/**
		 * The meta object literal for the '<em><b>Level1 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__LEVEL1_FORMAT = eINSTANCE.getGSSTMOutput_Level1_format();

		/**
		 * The meta object literal for the '<em><b>From level0 import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__FROM_LEVEL0_IMPORT = eINSTANCE.getGSSTMOutput_From_level0_import();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__LEVEL0_FILTER = eINSTANCE.getGSSTMOutput_Level0_filter();

		/**
		 * The meta object literal for the '<em><b>Level0 format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__LEVEL0_FORMAT = eINSTANCE.getGSSTMOutput_Level0_format();

		/**
		 * The meta object literal for the '<em><b>Gss Pi1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__GSS_PI1 = eINSTANCE.getGSSTMOutput_GssPi1();

		/**
		 * The meta object literal for the '<em><b>Gss Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT__GSS_FIELDS = eINSTANCE.getGSSTMOutput_GssFields();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputPi1Impl <em>GSSTM Output Pi1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputPi1Impl
		 * @see es.uah.aut.srg.gss.tmoutput.impl.tmoutputPackageImpl#getGSSTMOutputPi1()
		 * @generated
		 */
		EClass GSSTM_OUTPUT_PI1 = eINSTANCE.getGSSTMOutputPi1();

		/**
		 * The meta object literal for the '<em><b>Gss Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT_PI1__GSS_FIELD = eINSTANCE.getGSSTMOutputPi1_GssField();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputFieldImpl <em>GSSTM Output Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.tmoutput.impl.GSSTMOutputFieldImpl
		 * @see es.uah.aut.srg.gss.tmoutput.impl.tmoutputPackageImpl#getGSSTMOutputField()
		 * @generated
		 */
		EClass GSSTM_OUTPUT_FIELD = eINSTANCE.getGSSTMOutputField();

		/**
		 * The meta object literal for the '<em><b>Gss Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSSTM_OUTPUT_FIELD__GSS_FIELD = eINSTANCE.getGSSTMOutputField_GssField();

	}

} //tmoutputPackage
