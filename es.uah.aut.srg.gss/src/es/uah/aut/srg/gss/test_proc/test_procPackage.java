/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.test_proc;

import es.uah.aut.srg.gss.common.commonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see es.uah.aut.srg.gss.test_proc.test_procFactory
 * @model kind="package"
 * @generated
 */
public interface test_procPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test_proc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/test_proc";

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
	test_procPackage eINSTANCE = es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcTestProcImpl <em>GSS Test Proc Test Proc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcTestProcImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcTestProc()
	 * @generated
	 */
	int GSS_TEST_PROC_TEST_PROC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_TEST_PROC__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_TEST_PROC__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_TEST_PROC__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_TEST_PROC__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_TEST_PROC__STEP = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Test Proc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_TEST_PROC_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Test Proc Test Proc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_TEST_PROC_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl <em>GSS Test Proc Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcStep()
	 * @generated
	 */
	int GSS_TEST_PROC_STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__NAME = commonPackage.GSS_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__DESCRIPTION = commonPackage.GSS_MODEL_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__ID = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__MODE = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Replays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__REPLAYS = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prev step idref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__PREV_STEP_IDREF = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output idref from prev step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__INPUTS = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__OUTPUTS = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__SPECIAL_PACKETS = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Concurrent steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP__CONCURRENT_STEPS = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP_FEATURE_COUNT = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>GSS Test Proc Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_STEP_OPERATION_COUNT = commonPackage.GSS_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputsImpl <em>GSS Test Proc Inputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputsImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputs()
	 * @generated
	 */
	int GSS_TEST_PROC_INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Input level 3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUTS__INPUT_LEVEL_3 = 0;

	/**
	 * The feature id for the '<em><b>Input level 2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUTS__INPUT_LEVEL_2 = 1;

	/**
	 * The feature id for the '<em><b>Input level 1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUTS__INPUT_LEVEL_1 = 2;

	/**
	 * The feature id for the '<em><b>Input level 0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUTS__INPUT_LEVEL_0 = 3;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Test Proc Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputsImpl <em>GSS Test Proc Outputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputsImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputs()
	 * @generated
	 */
	int GSS_TEST_PROC_OUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>Checkmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUTS__CHECKMODE = 0;

	/**
	 * The feature id for the '<em><b>Valid time interval value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Valid time interval unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Output level 3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_3 = 3;

	/**
	 * The feature id for the '<em><b>Output level 2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_2 = 4;

	/**
	 * The feature id for the '<em><b>Output level 1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_1 = 5;

	/**
	 * The feature id for the '<em><b>Output level 0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_0 = 6;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Outputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUTS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GSS Test Proc Outputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcSpecialPacketsImpl <em>GSS Test Proc Special Packets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcSpecialPacketsImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcSpecialPackets()
	 * @generated
	 */
	int GSS_TEST_PROC_SPECIAL_PACKETS = 4;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_SPECIAL_PACKETS__ENABLE = 0;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_SPECIAL_PACKETS__DISABLE = 1;

	/**
	 * The feature id for the '<em><b>Enable print</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_SPECIAL_PACKETS__ENABLE_PRINT = 2;

	/**
	 * The feature id for the '<em><b>Disable print</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_SPECIAL_PACKETS__DISABLE_PRINT = 3;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_SPECIAL_PACKETS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Test Proc Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_SPECIAL_PACKETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcEnableDisableImpl <em>GSS Test Proc Enable Disable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcEnableDisableImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcEnableDisable()
	 * @generated
	 */
	int GSS_TEST_PROC_ENABLE_DISABLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_ENABLE_DISABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Enable Disable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_ENABLE_DISABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Test Proc Enable Disable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_ENABLE_DISABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcConcurrentStepsImpl <em>GSS Test Proc Concurrent Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcConcurrentStepsImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcConcurrentSteps()
	 * @generated
	 */
	int GSS_TEST_PROC_CONCURRENT_STEPS = 6;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_CONCURRENT_STEPS__NEXT_STEP = 0;

	/**
	 * The feature id for the '<em><b>Concurrent step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_CONCURRENT_STEPS__CONCURRENT_STEP = 1;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Concurrent Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_CONCURRENT_STEPS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Test Proc Concurrent Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_CONCURRENT_STEPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcNextStepImpl <em>GSS Test Proc Next Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcNextStepImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcNextStep()
	 * @generated
	 */
	int GSS_TEST_PROC_NEXT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_NEXT_STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Is Concurrent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_NEXT_STEP__IS_CONCURRENT = 1;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Next Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_NEXT_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Test Proc Next Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_NEXT_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcConcurrentStepImpl <em>GSS Test Proc Concurrent Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcConcurrentStepImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcConcurrentStep()
	 * @generated
	 */
	int GSS_TEST_PROC_CONCURRENT_STEP = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_CONCURRENT_STEP__ID = 0;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Concurrent Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_CONCURRENT_STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Test Proc Concurrent Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_CONCURRENT_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputImpl <em>GSS Test Proc Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInput()
	 * @generated
	 */
	int GSS_TEST_PROC_INPUT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT__IF_REF = 1;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT__DELAY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT__DELAY_UNIT = 3;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Test Proc Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl <em>GSS Test Proc Input Level3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputLevel3()
	 * @generated
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3 = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__NAME = GSS_TEST_PROC_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__IF_REF = GSS_TEST_PROC_INPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__DELAY_VALUE = GSS_TEST_PROC_INPUT__DELAY_VALUE;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__DELAY_UNIT = GSS_TEST_PROC_INPUT__DELAY_UNIT;

	/**
	 * The feature id for the '<em><b>Level3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level3 to level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level2 to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Input Level3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3_FEATURE_COUNT = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>GSS Test Proc Input Level3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL3_OPERATION_COUNT = GSS_TEST_PROC_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel2Impl <em>GSS Test Proc Input Level2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel2Impl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputLevel2()
	 * @generated
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2 = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__NAME = GSS_TEST_PROC_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__IF_REF = GSS_TEST_PROC_INPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__DELAY_VALUE = GSS_TEST_PROC_INPUT__DELAY_VALUE;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__DELAY_UNIT = GSS_TEST_PROC_INPUT__DELAY_UNIT;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__APP_TO_LEVEL2 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level2 to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2_TO_LEVEL1 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__LEVEL0 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1_TO_LEVEL0 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Input Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2_FEATURE_COUNT = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>GSS Test Proc Input Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL2_OPERATION_COUNT = GSS_TEST_PROC_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl <em>GSS Test Proc Input Level1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputLevel1()
	 * @generated
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1 = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1__NAME = GSS_TEST_PROC_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1__IF_REF = GSS_TEST_PROC_INPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE = GSS_TEST_PROC_INPUT__DELAY_VALUE;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT = GSS_TEST_PROC_INPUT__DELAY_UNIT;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Input Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1_FEATURE_COUNT = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GSS Test Proc Input Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL1_OPERATION_COUNT = GSS_TEST_PROC_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel0Impl <em>GSS Test Proc Input Level0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel0Impl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputLevel0()
	 * @generated
	 */
	int GSS_TEST_PROC_INPUT_LEVEL0 = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL0__NAME = GSS_TEST_PROC_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL0__IF_REF = GSS_TEST_PROC_INPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL0__DELAY_VALUE = GSS_TEST_PROC_INPUT__DELAY_VALUE;

	/**
	 * The feature id for the '<em><b>Delay unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL0__DELAY_UNIT = GSS_TEST_PROC_INPUT__DELAY_UNIT;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL0__LEVEL0 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL0__APP_TO_LEVEL0 = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Input Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL0_FEATURE_COUNT = GSS_TEST_PROC_INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Test Proc Input Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_INPUT_LEVEL0_OPERATION_COUNT = GSS_TEST_PROC_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputImpl <em>GSS Test Proc Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutput()
	 * @generated
	 */
	int GSS_TEST_PROC_OUTPUT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT__ID = 1;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT__IF_REF = 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT__OPTIONAL = 3;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Test Proc Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel3Impl <em>GSS Test Proc Output Level3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel3Impl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputLevel3()
	 * @generated
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3 = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__NAME = GSS_TEST_PROC_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__ID = GSS_TEST_PROC_OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__IF_REF = GSS_TEST_PROC_OUTPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__OPTIONAL = GSS_TEST_PROC_OUTPUT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Level3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level3 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level3 from level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level2 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Level2 from level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level1 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL0 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Level1 from level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL0_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Output Level3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3_FEATURE_COUNT = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>GSS Test Proc Output Level3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL3_OPERATION_COUNT = GSS_TEST_PROC_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl <em>GSS Test Proc Output Level2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputLevel2()
	 * @generated
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2 = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__NAME = GSS_TEST_PROC_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__ID = GSS_TEST_PROC_OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__IF_REF = GSS_TEST_PROC_OUTPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__OPTIONAL = GSS_TEST_PROC_OUTPUT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level2 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level2 from level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level1 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Level1 from level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Output Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2_FEATURE_COUNT = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>GSS Test Proc Output Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL2_OPERATION_COUNT = GSS_TEST_PROC_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel1Impl <em>GSS Test Proc Output Level1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel1Impl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputLevel1()
	 * @generated
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1 = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1__NAME = GSS_TEST_PROC_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1__ID = GSS_TEST_PROC_OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1__IF_REF = GSS_TEST_PROC_OUTPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1__OPTIONAL = GSS_TEST_PROC_OUTPUT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level1 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL0 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level1 from level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1_FROM_LEVEL0 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL0_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Output Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1_FEATURE_COUNT = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>GSS Test Proc Output Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL1_OPERATION_COUNT = GSS_TEST_PROC_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel0Impl <em>GSS Test Proc Output Level0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel0Impl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputLevel0()
	 * @generated
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL0 = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL0__NAME = GSS_TEST_PROC_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL0__ID = GSS_TEST_PROC_OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL0__IF_REF = GSS_TEST_PROC_OUTPUT__IF_REF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL0__OPTIONAL = GSS_TEST_PROC_OUTPUT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0 = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level0 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Output Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL0_FEATURE_COUNT = GSS_TEST_PROC_OUTPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Test Proc Output Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_OUTPUT_LEVEL0_OPERATION_COUNT = GSS_TEST_PROC_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel3FilterImpl <em>GSS Test Proc Level3 Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel3FilterImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcLevel3Filter()
	 * @generated
	 */
	int GSS_TEST_PROC_LEVEL3_FILTER = 19;

	/**
	 * The feature id for the '<em><b>Apply def filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL3_FILTER__APPLY_DEF_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Extra filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL3_FILTER__EXTRA_FILTER = 1;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Level3 Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL3_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Test Proc Level3 Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL3_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel2FilterImpl <em>GSS Test Proc Level2 Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel2FilterImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcLevel2Filter()
	 * @generated
	 */
	int GSS_TEST_PROC_LEVEL2_FILTER = 20;

	/**
	 * The feature id for the '<em><b>Apply def filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL2_FILTER__APPLY_DEF_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Extra filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL2_FILTER__EXTRA_FILTER = 1;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Level2 Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL2_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Test Proc Level2 Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL2_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel1FilterImpl <em>GSS Test Proc Level1 Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel1FilterImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcLevel1Filter()
	 * @generated
	 */
	int GSS_TEST_PROC_LEVEL1_FILTER = 21;

	/**
	 * The feature id for the '<em><b>Apply def filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL1_FILTER__APPLY_DEF_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Extra filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL1_FILTER__EXTRA_FILTER = 1;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Level1 Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL1_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Test Proc Level1 Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL1_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel0FilterImpl <em>GSS Test Proc Level0 Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel0FilterImpl
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcLevel0Filter()
	 * @generated
	 */
	int GSS_TEST_PROC_LEVEL0_FILTER = 22;

	/**
	 * The feature id for the '<em><b>Apply def filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Extra filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER = 1;

	/**
	 * The number of structural features of the '<em>GSS Test Proc Level0 Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL0_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Test Proc Level0 Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_PROC_LEVEL0_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcMode <em>GSS Test Proc Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcMode
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcMode()
	 * @generated
	 */
	int GSS_TEST_PROC_MODE = 23;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcUnit <em>GSS Test Proc Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcUnit
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcUnit()
	 * @generated
	 */
	int GSS_TEST_PROC_UNIT = 24;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode <em>GSS Test Proc Checkmode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcCheckmode()
	 * @generated
	 */
	int GSS_TEST_PROC_CHECKMODE = 25;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo <em>GSS Test Proc Yes No</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo
	 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcYesNo()
	 * @generated
	 */
	int GSS_TEST_PROC_YES_NO = 26;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc <em>GSS Test Proc Test Proc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Test Proc</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc
	 * @generated
	 */
	EClass getGSSTestProcTestProc();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc#getStep()
	 * @see #getGSSTestProcTestProc()
	 * @generated
	 */
	EReference getGSSTestProcTestProc_Step();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep <em>GSS Test Proc Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Step</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep
	 * @generated
	 */
	EClass getGSSTestProcStep();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getId()
	 * @see #getGSSTestProcStep()
	 * @generated
	 */
	EAttribute getGSSTestProcStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getMode()
	 * @see #getGSSTestProcStep()
	 * @generated
	 */
	EAttribute getGSSTestProcStep_Mode();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getReplays <em>Replays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replays</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getReplays()
	 * @see #getGSSTestProcStep()
	 * @generated
	 */
	EAttribute getGSSTestProcStep_Replays();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getPrev_step_idref <em>Prev step idref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev step idref</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getPrev_step_idref()
	 * @see #getGSSTestProcStep()
	 * @generated
	 */
	EReference getGSSTestProcStep_Prev_step_idref();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getOutput_idref_from_prev_step <em>Output idref from prev step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output idref from prev step</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getOutput_idref_from_prev_step()
	 * @see #getGSSTestProcStep()
	 * @generated
	 */
	EReference getGSSTestProcStep_Output_idref_from_prev_step();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getInputs()
	 * @see #getGSSTestProcStep()
	 * @generated
	 */
	EReference getGSSTestProcStep_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outputs</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getOutputs()
	 * @see #getGSSTestProcStep()
	 * @generated
	 */
	EReference getGSSTestProcStep_Outputs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getSpecialPackets <em>Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special Packets</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getSpecialPackets()
	 * @see #getGSSTestProcStep()
	 * @generated
	 */
	EReference getGSSTestProcStep_SpecialPackets();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getConcurrent_steps <em>Concurrent steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concurrent steps</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getConcurrent_steps()
	 * @see #getGSSTestProcStep()
	 * @generated
	 */
	EReference getGSSTestProcStep_Concurrent_steps();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputs <em>GSS Test Proc Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Inputs</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputs
	 * @generated
	 */
	EClass getGSSTestProcInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputs#getInput_level_3 <em>Input level 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input level 3</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputs#getInput_level_3()
	 * @see #getGSSTestProcInputs()
	 * @generated
	 */
	EReference getGSSTestProcInputs_Input_level_3();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputs#getInput_level_2 <em>Input level 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input level 2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputs#getInput_level_2()
	 * @see #getGSSTestProcInputs()
	 * @generated
	 */
	EReference getGSSTestProcInputs_Input_level_2();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputs#getInput_level_1 <em>Input level 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input level 1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputs#getInput_level_1()
	 * @see #getGSSTestProcInputs()
	 * @generated
	 */
	EReference getGSSTestProcInputs_Input_level_1();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputs#getInput_level_0 <em>Input level 0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input level 0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputs#getInput_level_0()
	 * @see #getGSSTestProcInputs()
	 * @generated
	 */
	EReference getGSSTestProcInputs_Input_level_0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs <em>GSS Test Proc Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Outputs</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs
	 * @generated
	 */
	EClass getGSSTestProcOutputs();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getCheckmode <em>Checkmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkmode</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getCheckmode()
	 * @see #getGSSTestProcOutputs()
	 * @generated
	 */
	EAttribute getGSSTestProcOutputs_Checkmode();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_value <em>Valid time interval value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid time interval value</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_value()
	 * @see #getGSSTestProcOutputs()
	 * @generated
	 */
	EAttribute getGSSTestProcOutputs_Valid_time_interval_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid time interval unit</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_unit()
	 * @see #getGSSTestProcOutputs()
	 * @generated
	 */
	EAttribute getGSSTestProcOutputs_Valid_time_interval_unit();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_3 <em>Output level 3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output level 3</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_3()
	 * @see #getGSSTestProcOutputs()
	 * @generated
	 */
	EReference getGSSTestProcOutputs_Output_level_3();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_2 <em>Output level 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output level 2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_2()
	 * @see #getGSSTestProcOutputs()
	 * @generated
	 */
	EReference getGSSTestProcOutputs_Output_level_2();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_1 <em>Output level 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output level 1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_1()
	 * @see #getGSSTestProcOutputs()
	 * @generated
	 */
	EReference getGSSTestProcOutputs_Output_level_1();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_0 <em>Output level 0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output level 0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_0()
	 * @see #getGSSTestProcOutputs()
	 * @generated
	 */
	EReference getGSSTestProcOutputs_Output_level_0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets <em>GSS Test Proc Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Special Packets</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets
	 * @generated
	 */
	EClass getGSSTestProcSpecialPackets();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enable</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getEnable()
	 * @see #getGSSTestProcSpecialPackets()
	 * @generated
	 */
	EReference getGSSTestProcSpecialPackets_Enable();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disable</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getDisable()
	 * @see #getGSSTestProcSpecialPackets()
	 * @generated
	 */
	EReference getGSSTestProcSpecialPackets_Disable();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getEnable_print <em>Enable print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enable print</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getEnable_print()
	 * @see #getGSSTestProcSpecialPackets()
	 * @generated
	 */
	EReference getGSSTestProcSpecialPackets_Enable_print();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getDisable_print <em>Disable print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disable print</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getDisable_print()
	 * @see #getGSSTestProcSpecialPackets()
	 * @generated
	 */
	EReference getGSSTestProcSpecialPackets_Disable_print();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable <em>GSS Test Proc Enable Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Enable Disable</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable
	 * @generated
	 */
	EClass getGSSTestProcEnableDisable();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable#getId()
	 * @see #getGSSTestProcEnableDisable()
	 * @generated
	 */
	EAttribute getGSSTestProcEnableDisable_Id();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps <em>GSS Test Proc Concurrent Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Concurrent Steps</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps
	 * @generated
	 */
	EClass getGSSTestProcConcurrentSteps();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Step</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps#getNextStep()
	 * @see #getGSSTestProcConcurrentSteps()
	 * @generated
	 */
	EReference getGSSTestProcConcurrentSteps_NextStep();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps#getConcurrent_step <em>Concurrent step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concurrent step</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps#getConcurrent_step()
	 * @see #getGSSTestProcConcurrentSteps()
	 * @generated
	 */
	EReference getGSSTestProcConcurrentSteps_Concurrent_step();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep <em>GSS Test Proc Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Next Step</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep
	 * @generated
	 */
	EClass getGSSTestProcNextStep();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getId()
	 * @see #getGSSTestProcNextStep()
	 * @generated
	 */
	EAttribute getGSSTestProcNextStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getIsConcurrent <em>Is Concurrent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Concurrent</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getIsConcurrent()
	 * @see #getGSSTestProcNextStep()
	 * @generated
	 */
	EAttribute getGSSTestProcNextStep_IsConcurrent();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep <em>GSS Test Proc Concurrent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Concurrent Step</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep
	 * @generated
	 */
	EClass getGSSTestProcConcurrentStep();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep#getId()
	 * @see #getGSSTestProcConcurrentStep()
	 * @generated
	 */
	EAttribute getGSSTestProcConcurrentStep_Id();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInput <em>GSS Test Proc Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Input</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInput
	 * @generated
	 */
	EClass getGSSTestProcInput();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInput#getName()
	 * @see #getGSSTestProcInput()
	 * @generated
	 */
	EAttribute getGSSTestProcInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInput#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInput#getIfRef()
	 * @see #getGSSTestProcInput()
	 * @generated
	 */
	EAttribute getGSSTestProcInput_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInput#getDelay_value <em>Delay value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay value</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInput#getDelay_value()
	 * @see #getGSSTestProcInput()
	 * @generated
	 */
	EAttribute getGSSTestProcInput_Delay_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInput#getDelay_unit <em>Delay unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay unit</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInput#getDelay_unit()
	 * @see #getGSSTestProcInput()
	 * @generated
	 */
	EAttribute getGSSTestProcInput_Delay_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3 <em>GSS Test Proc Input Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Input Level3</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3
	 * @generated
	 */
	EClass getGSSTestProcInputLevel3();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel3 <em>Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel3()
	 * @see #getGSSTestProcInputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel3_Level3();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getApp_to_level3 <em>App to level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level3</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getApp_to_level3()
	 * @see #getGSSTestProcInputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel3_App_to_level3();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel2()
	 * @see #getGSSTestProcInputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel3_Level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel3_to_level2 <em>Level3 to level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 to level2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel3_to_level2()
	 * @see #getGSSTestProcInputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel3_Level3_to_level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel1()
	 * @see #getGSSTestProcInputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel3_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel2_to_level1 <em>Level2 to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 to level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel2_to_level1()
	 * @see #getGSSTestProcInputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel3_Level2_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel0()
	 * @see #getGSSTestProcInputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel3_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3#getLevel1_to_level0()
	 * @see #getGSSTestProcInputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel3_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2 <em>GSS Test Proc Input Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Input Level2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2
	 * @generated
	 */
	EClass getGSSTestProcInputLevel2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel2()
	 * @see #getGSSTestProcInputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel2_Level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getApp_to_level2 <em>App to level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getApp_to_level2()
	 * @see #getGSSTestProcInputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel2_App_to_level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel1()
	 * @see #getGSSTestProcInputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel2_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel2_to_level1 <em>Level2 to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 to level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel2_to_level1()
	 * @see #getGSSTestProcInputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel2_Level2_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel0()
	 * @see #getGSSTestProcInputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel2_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel1_to_level0()
	 * @see #getGSSTestProcInputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel2_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1 <em>GSS Test Proc Input Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Input Level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1
	 * @generated
	 */
	EClass getGSSTestProcInputLevel1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1#getLevel1()
	 * @see #getGSSTestProcInputLevel1()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel1_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1#getApp_to_level1 <em>App to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1#getApp_to_level1()
	 * @see #getGSSTestProcInputLevel1()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel1_App_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1#getLevel0()
	 * @see #getGSSTestProcInputLevel1()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel1_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1#getLevel1_to_level0()
	 * @see #getGSSTestProcInputLevel1()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel1_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0 <em>GSS Test Proc Input Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Input Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0
	 * @generated
	 */
	EClass getGSSTestProcInputLevel0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0#getLevel0()
	 * @see #getGSSTestProcInputLevel0()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel0_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0#getApp_to_level0 <em>App to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0#getApp_to_level0()
	 * @see #getGSSTestProcInputLevel0()
	 * @generated
	 */
	EReference getGSSTestProcInputLevel0_App_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutput <em>GSS Test Proc Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Output</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutput
	 * @generated
	 */
	EClass getGSSTestProcOutput();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutput#getName()
	 * @see #getGSSTestProcOutput()
	 * @generated
	 */
	EAttribute getGSSTestProcOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutput#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutput#getId()
	 * @see #getGSSTestProcOutput()
	 * @generated
	 */
	EAttribute getGSSTestProcOutput_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutput#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutput#getIfRef()
	 * @see #getGSSTestProcOutput()
	 * @generated
	 */
	EAttribute getGSSTestProcOutput_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutput#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutput#getOptional()
	 * @see #getGSSTestProcOutput()
	 * @generated
	 */
	EAttribute getGSSTestProcOutput_Optional();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3 <em>GSS Test Proc Output Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Output Level3</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3
	 * @generated
	 */
	EClass getGSSTestProcOutputLevel3();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3 <em>Level3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level3();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3_filter <em>Level3 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level3 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3_filter()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level3_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3_from_level2 <em>Level3 from level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level3 from level2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3_from_level2()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level3_from_level2();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2_filter <em>Level2 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level2 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2_filter()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level2_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2_from_level1 <em>Level2 from level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 from level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2_from_level1()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level2_from_level1();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1_filter <em>Level1 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level1 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1_filter()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level1_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel0()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1_from_level0 <em>Level1 from level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 from level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1_from_level0()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level1_from_level0();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel0_filter()
	 * @see #getGSSTestProcOutputLevel3()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel3_Level0_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2 <em>GSS Test Proc Output Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Output Level2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2
	 * @generated
	 */
	EClass getGSSTestProcOutputLevel2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel2()
	 * @see #getGSSTestProcOutputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel2_Level2();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel2_filter <em>Level2 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level2 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel2_filter()
	 * @see #getGSSTestProcOutputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel2_Level2_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel1()
	 * @see #getGSSTestProcOutputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel2_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel2_from_level1 <em>Level2 from level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 from level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel2_from_level1()
	 * @see #getGSSTestProcOutputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel2_Level2_from_level1();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel1_filter <em>Level1 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level1 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel1_filter()
	 * @see #getGSSTestProcOutputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel2_Level1_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel0()
	 * @see #getGSSTestProcOutputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel2_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel1_from_level0 <em>Level1 from level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 from level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel1_from_level0()
	 * @see #getGSSTestProcOutputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel2_Level1_from_level0();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2#getLevel0_filter()
	 * @see #getGSSTestProcOutputLevel2()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel2_Level0_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1 <em>GSS Test Proc Output Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Output Level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1
	 * @generated
	 */
	EClass getGSSTestProcOutputLevel1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1()
	 * @see #getGSSTestProcOutputLevel1()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel1_Level1();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1_filter <em>Level1 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level1 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1_filter()
	 * @see #getGSSTestProcOutputLevel1()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel1_Level1_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0()
	 * @see #getGSSTestProcOutputLevel1()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel1_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1_from_level0 <em>Level1 from level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 from level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1_from_level0()
	 * @see #getGSSTestProcOutputLevel1()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel1_Level1_from_level0();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0_filter()
	 * @see #getGSSTestProcOutputLevel1()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel1_Level0_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0 <em>GSS Test Proc Output Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Output Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0
	 * @generated
	 */
	EClass getGSSTestProcOutputLevel0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0#getLevel0()
	 * @see #getGSSTestProcOutputLevel0()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel0_Level0();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0#getLevel0_filter <em>Level0 filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level0 filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0#getLevel0_filter()
	 * @see #getGSSTestProcOutputLevel0()
	 * @generated
	 */
	EReference getGSSTestProcOutputLevel0_Level0_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter <em>GSS Test Proc Level3 Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Level3 Filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter
	 * @generated
	 */
	EClass getGSSTestProcLevel3Filter();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter#getApply_def_filter <em>Apply def filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply def filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter#getApply_def_filter()
	 * @see #getGSSTestProcLevel3Filter()
	 * @generated
	 */
	EAttribute getGSSTestProcLevel3Filter_Apply_def_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter#getExtra_filter <em>Extra filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extra filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter#getExtra_filter()
	 * @see #getGSSTestProcLevel3Filter()
	 * @generated
	 */
	EReference getGSSTestProcLevel3Filter_Extra_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2Filter <em>GSS Test Proc Level2 Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Level2 Filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2Filter
	 * @generated
	 */
	EClass getGSSTestProcLevel2Filter();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2Filter#getApply_def_filter <em>Apply def filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply def filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2Filter#getApply_def_filter()
	 * @see #getGSSTestProcLevel2Filter()
	 * @generated
	 */
	EAttribute getGSSTestProcLevel2Filter_Apply_def_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2Filter#getExtra_filter <em>Extra filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extra filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2Filter#getExtra_filter()
	 * @see #getGSSTestProcLevel2Filter()
	 * @generated
	 */
	EReference getGSSTestProcLevel2Filter_Extra_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1Filter <em>GSS Test Proc Level1 Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Level1 Filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1Filter
	 * @generated
	 */
	EClass getGSSTestProcLevel1Filter();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1Filter#getApply_def_filter <em>Apply def filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply def filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1Filter#getApply_def_filter()
	 * @see #getGSSTestProcLevel1Filter()
	 * @generated
	 */
	EAttribute getGSSTestProcLevel1Filter_Apply_def_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1Filter#getExtra_filter <em>Extra filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extra filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1Filter#getExtra_filter()
	 * @see #getGSSTestProcLevel1Filter()
	 * @generated
	 */
	EReference getGSSTestProcLevel1Filter_Extra_filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter <em>GSS Test Proc Level0 Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Proc Level0 Filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter
	 * @generated
	 */
	EClass getGSSTestProcLevel0Filter();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter#getApply_def_filter <em>Apply def filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply def filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter#getApply_def_filter()
	 * @see #getGSSTestProcLevel0Filter()
	 * @generated
	 */
	EAttribute getGSSTestProcLevel0Filter_Apply_def_filter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter#getExtra_filter <em>Extra filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extra filter</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter#getExtra_filter()
	 * @see #getGSSTestProcLevel0Filter()
	 * @generated
	 */
	EReference getGSSTestProcLevel0Filter_Extra_filter();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcMode <em>GSS Test Proc Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Test Proc Mode</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcMode
	 * @generated
	 */
	EEnum getGSSTestProcMode();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcUnit <em>GSS Test Proc Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Test Proc Unit</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcUnit
	 * @generated
	 */
	EEnum getGSSTestProcUnit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode <em>GSS Test Proc Checkmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Test Proc Checkmode</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode
	 * @generated
	 */
	EEnum getGSSTestProcCheckmode();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo <em>GSS Test Proc Yes No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Test Proc Yes No</em>'.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo
	 * @generated
	 */
	EEnum getGSSTestProcYesNo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	test_procFactory gettest_procFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcTestProcImpl <em>GSS Test Proc Test Proc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcTestProcImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcTestProc()
		 * @generated
		 */
		EClass GSS_TEST_PROC_TEST_PROC = eINSTANCE.getGSSTestProcTestProc();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_TEST_PROC__STEP = eINSTANCE.getGSSTestProcTestProc_Step();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl <em>GSS Test Proc Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcStepImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcStep()
		 * @generated
		 */
		EClass GSS_TEST_PROC_STEP = eINSTANCE.getGSSTestProcStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_STEP__ID = eINSTANCE.getGSSTestProcStep_Id();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_STEP__MODE = eINSTANCE.getGSSTestProcStep_Mode();

		/**
		 * The meta object literal for the '<em><b>Replays</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_STEP__REPLAYS = eINSTANCE.getGSSTestProcStep_Replays();

		/**
		 * The meta object literal for the '<em><b>Prev step idref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_STEP__PREV_STEP_IDREF = eINSTANCE.getGSSTestProcStep_Prev_step_idref();

		/**
		 * The meta object literal for the '<em><b>Output idref from prev step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP = eINSTANCE.getGSSTestProcStep_Output_idref_from_prev_step();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_STEP__INPUTS = eINSTANCE.getGSSTestProcStep_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_STEP__OUTPUTS = eINSTANCE.getGSSTestProcStep_Outputs();

		/**
		 * The meta object literal for the '<em><b>Special Packets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_STEP__SPECIAL_PACKETS = eINSTANCE.getGSSTestProcStep_SpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Concurrent steps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_STEP__CONCURRENT_STEPS = eINSTANCE.getGSSTestProcStep_Concurrent_steps();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputsImpl <em>GSS Test Proc Inputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputsImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputs()
		 * @generated
		 */
		EClass GSS_TEST_PROC_INPUTS = eINSTANCE.getGSSTestProcInputs();

		/**
		 * The meta object literal for the '<em><b>Input level 3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUTS__INPUT_LEVEL_3 = eINSTANCE.getGSSTestProcInputs_Input_level_3();

		/**
		 * The meta object literal for the '<em><b>Input level 2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUTS__INPUT_LEVEL_2 = eINSTANCE.getGSSTestProcInputs_Input_level_2();

		/**
		 * The meta object literal for the '<em><b>Input level 1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUTS__INPUT_LEVEL_1 = eINSTANCE.getGSSTestProcInputs_Input_level_1();

		/**
		 * The meta object literal for the '<em><b>Input level 0</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUTS__INPUT_LEVEL_0 = eINSTANCE.getGSSTestProcInputs_Input_level_0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputsImpl <em>GSS Test Proc Outputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputsImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputs()
		 * @generated
		 */
		EClass GSS_TEST_PROC_OUTPUTS = eINSTANCE.getGSSTestProcOutputs();

		/**
		 * The meta object literal for the '<em><b>Checkmode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_OUTPUTS__CHECKMODE = eINSTANCE.getGSSTestProcOutputs_Checkmode();

		/**
		 * The meta object literal for the '<em><b>Valid time interval value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_VALUE = eINSTANCE.getGSSTestProcOutputs_Valid_time_interval_value();

		/**
		 * The meta object literal for the '<em><b>Valid time interval unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT = eINSTANCE.getGSSTestProcOutputs_Valid_time_interval_unit();

		/**
		 * The meta object literal for the '<em><b>Output level 3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_3 = eINSTANCE.getGSSTestProcOutputs_Output_level_3();

		/**
		 * The meta object literal for the '<em><b>Output level 2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_2 = eINSTANCE.getGSSTestProcOutputs_Output_level_2();

		/**
		 * The meta object literal for the '<em><b>Output level 1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_1 = eINSTANCE.getGSSTestProcOutputs_Output_level_1();

		/**
		 * The meta object literal for the '<em><b>Output level 0</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_0 = eINSTANCE.getGSSTestProcOutputs_Output_level_0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcSpecialPacketsImpl <em>GSS Test Proc Special Packets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcSpecialPacketsImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcSpecialPackets()
		 * @generated
		 */
		EClass GSS_TEST_PROC_SPECIAL_PACKETS = eINSTANCE.getGSSTestProcSpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_SPECIAL_PACKETS__ENABLE = eINSTANCE.getGSSTestProcSpecialPackets_Enable();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_SPECIAL_PACKETS__DISABLE = eINSTANCE.getGSSTestProcSpecialPackets_Disable();

		/**
		 * The meta object literal for the '<em><b>Enable print</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_SPECIAL_PACKETS__ENABLE_PRINT = eINSTANCE.getGSSTestProcSpecialPackets_Enable_print();

		/**
		 * The meta object literal for the '<em><b>Disable print</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_SPECIAL_PACKETS__DISABLE_PRINT = eINSTANCE.getGSSTestProcSpecialPackets_Disable_print();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcEnableDisableImpl <em>GSS Test Proc Enable Disable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcEnableDisableImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcEnableDisable()
		 * @generated
		 */
		EClass GSS_TEST_PROC_ENABLE_DISABLE = eINSTANCE.getGSSTestProcEnableDisable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_ENABLE_DISABLE__ID = eINSTANCE.getGSSTestProcEnableDisable_Id();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcConcurrentStepsImpl <em>GSS Test Proc Concurrent Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcConcurrentStepsImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcConcurrentSteps()
		 * @generated
		 */
		EClass GSS_TEST_PROC_CONCURRENT_STEPS = eINSTANCE.getGSSTestProcConcurrentSteps();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_CONCURRENT_STEPS__NEXT_STEP = eINSTANCE.getGSSTestProcConcurrentSteps_NextStep();

		/**
		 * The meta object literal for the '<em><b>Concurrent step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_CONCURRENT_STEPS__CONCURRENT_STEP = eINSTANCE.getGSSTestProcConcurrentSteps_Concurrent_step();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcNextStepImpl <em>GSS Test Proc Next Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcNextStepImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcNextStep()
		 * @generated
		 */
		EClass GSS_TEST_PROC_NEXT_STEP = eINSTANCE.getGSSTestProcNextStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_NEXT_STEP__ID = eINSTANCE.getGSSTestProcNextStep_Id();

		/**
		 * The meta object literal for the '<em><b>Is Concurrent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_NEXT_STEP__IS_CONCURRENT = eINSTANCE.getGSSTestProcNextStep_IsConcurrent();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcConcurrentStepImpl <em>GSS Test Proc Concurrent Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcConcurrentStepImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcConcurrentStep()
		 * @generated
		 */
		EClass GSS_TEST_PROC_CONCURRENT_STEP = eINSTANCE.getGSSTestProcConcurrentStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_CONCURRENT_STEP__ID = eINSTANCE.getGSSTestProcConcurrentStep_Id();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputImpl <em>GSS Test Proc Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInput()
		 * @generated
		 */
		EClass GSS_TEST_PROC_INPUT = eINSTANCE.getGSSTestProcInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_INPUT__NAME = eINSTANCE.getGSSTestProcInput_Name();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_INPUT__IF_REF = eINSTANCE.getGSSTestProcInput_IfRef();

		/**
		 * The meta object literal for the '<em><b>Delay value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_INPUT__DELAY_VALUE = eINSTANCE.getGSSTestProcInput_Delay_value();

		/**
		 * The meta object literal for the '<em><b>Delay unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_INPUT__DELAY_UNIT = eINSTANCE.getGSSTestProcInput_Delay_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl <em>GSS Test Proc Input Level3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputLevel3()
		 * @generated
		 */
		EClass GSS_TEST_PROC_INPUT_LEVEL3 = eINSTANCE.getGSSTestProcInputLevel3();

		/**
		 * The meta object literal for the '<em><b>Level3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3 = eINSTANCE.getGSSTestProcInputLevel3_Level3();

		/**
		 * The meta object literal for the '<em><b>App to level3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3 = eINSTANCE.getGSSTestProcInputLevel3_App_to_level3();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2 = eINSTANCE.getGSSTestProcInputLevel3_Level2();

		/**
		 * The meta object literal for the '<em><b>Level3 to level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2 = eINSTANCE.getGSSTestProcInputLevel3_Level3_to_level2();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1 = eINSTANCE.getGSSTestProcInputLevel3_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1 = eINSTANCE.getGSSTestProcInputLevel3_Level2_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0 = eINSTANCE.getGSSTestProcInputLevel3_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0 = eINSTANCE.getGSSTestProcInputLevel3_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel2Impl <em>GSS Test Proc Input Level2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel2Impl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputLevel2()
		 * @generated
		 */
		EClass GSS_TEST_PROC_INPUT_LEVEL2 = eINSTANCE.getGSSTestProcInputLevel2();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2 = eINSTANCE.getGSSTestProcInputLevel2_Level2();

		/**
		 * The meta object literal for the '<em><b>App to level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL2__APP_TO_LEVEL2 = eINSTANCE.getGSSTestProcInputLevel2_App_to_level2();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1 = eINSTANCE.getGSSTestProcInputLevel2_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2_TO_LEVEL1 = eINSTANCE.getGSSTestProcInputLevel2_Level2_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL2__LEVEL0 = eINSTANCE.getGSSTestProcInputLevel2_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1_TO_LEVEL0 = eINSTANCE.getGSSTestProcInputLevel2_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl <em>GSS Test Proc Input Level1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputLevel1()
		 * @generated
		 */
		EClass GSS_TEST_PROC_INPUT_LEVEL1 = eINSTANCE.getGSSTestProcInputLevel1();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1 = eINSTANCE.getGSSTestProcInputLevel1_Level1();

		/**
		 * The meta object literal for the '<em><b>App to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1 = eINSTANCE.getGSSTestProcInputLevel1_App_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0 = eINSTANCE.getGSSTestProcInputLevel1_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0 = eINSTANCE.getGSSTestProcInputLevel1_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel0Impl <em>GSS Test Proc Input Level0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel0Impl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcInputLevel0()
		 * @generated
		 */
		EClass GSS_TEST_PROC_INPUT_LEVEL0 = eINSTANCE.getGSSTestProcInputLevel0();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL0__LEVEL0 = eINSTANCE.getGSSTestProcInputLevel0_Level0();

		/**
		 * The meta object literal for the '<em><b>App to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_INPUT_LEVEL0__APP_TO_LEVEL0 = eINSTANCE.getGSSTestProcInputLevel0_App_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputImpl <em>GSS Test Proc Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutput()
		 * @generated
		 */
		EClass GSS_TEST_PROC_OUTPUT = eINSTANCE.getGSSTestProcOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_OUTPUT__NAME = eINSTANCE.getGSSTestProcOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_OUTPUT__ID = eINSTANCE.getGSSTestProcOutput_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_OUTPUT__IF_REF = eINSTANCE.getGSSTestProcOutput_IfRef();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_OUTPUT__OPTIONAL = eINSTANCE.getGSSTestProcOutput_Optional();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel3Impl <em>GSS Test Proc Output Level3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel3Impl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputLevel3()
		 * @generated
		 */
		EClass GSS_TEST_PROC_OUTPUT_LEVEL3 = eINSTANCE.getGSSTestProcOutputLevel3();

		/**
		 * The meta object literal for the '<em><b>Level3</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3 = eINSTANCE.getGSSTestProcOutputLevel3_Level3();

		/**
		 * The meta object literal for the '<em><b>Level3 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3_FILTER = eINSTANCE.getGSSTestProcOutputLevel3_Level3_filter();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2 = eINSTANCE.getGSSTestProcOutputLevel3_Level2();

		/**
		 * The meta object literal for the '<em><b>Level3 from level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2 = eINSTANCE.getGSSTestProcOutputLevel3_Level3_from_level2();

		/**
		 * The meta object literal for the '<em><b>Level2 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2_FILTER = eINSTANCE.getGSSTestProcOutputLevel3_Level2_filter();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1 = eINSTANCE.getGSSTestProcOutputLevel3_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 from level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1 = eINSTANCE.getGSSTestProcOutputLevel3_Level2_from_level1();

		/**
		 * The meta object literal for the '<em><b>Level1 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1_FILTER = eINSTANCE.getGSSTestProcOutputLevel3_Level1_filter();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL0 = eINSTANCE.getGSSTestProcOutputLevel3_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 from level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0 = eINSTANCE.getGSSTestProcOutputLevel3_Level1_from_level0();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL0_FILTER = eINSTANCE.getGSSTestProcOutputLevel3_Level0_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl <em>GSS Test Proc Output Level2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel2Impl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputLevel2()
		 * @generated
		 */
		EClass GSS_TEST_PROC_OUTPUT_LEVEL2 = eINSTANCE.getGSSTestProcOutputLevel2();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2 = eINSTANCE.getGSSTestProcOutputLevel2_Level2();

		/**
		 * The meta object literal for the '<em><b>Level2 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER = eINSTANCE.getGSSTestProcOutputLevel2_Level2_filter();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1 = eINSTANCE.getGSSTestProcOutputLevel2_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 from level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1 = eINSTANCE.getGSSTestProcOutputLevel2_Level2_from_level1();

		/**
		 * The meta object literal for the '<em><b>Level1 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER = eINSTANCE.getGSSTestProcOutputLevel2_Level1_filter();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0 = eINSTANCE.getGSSTestProcOutputLevel2_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 from level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0 = eINSTANCE.getGSSTestProcOutputLevel2_Level1_from_level0();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER = eINSTANCE.getGSSTestProcOutputLevel2_Level0_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel1Impl <em>GSS Test Proc Output Level1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel1Impl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputLevel1()
		 * @generated
		 */
		EClass GSS_TEST_PROC_OUTPUT_LEVEL1 = eINSTANCE.getGSSTestProcOutputLevel1();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1 = eINSTANCE.getGSSTestProcOutputLevel1_Level1();

		/**
		 * The meta object literal for the '<em><b>Level1 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1_FILTER = eINSTANCE.getGSSTestProcOutputLevel1_Level1_filter();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL0 = eINSTANCE.getGSSTestProcOutputLevel1_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 from level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1_FROM_LEVEL0 = eINSTANCE.getGSSTestProcOutputLevel1_Level1_from_level0();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL0_FILTER = eINSTANCE.getGSSTestProcOutputLevel1_Level0_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel0Impl <em>GSS Test Proc Output Level0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel0Impl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcOutputLevel0()
		 * @generated
		 */
		EClass GSS_TEST_PROC_OUTPUT_LEVEL0 = eINSTANCE.getGSSTestProcOutputLevel0();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0 = eINSTANCE.getGSSTestProcOutputLevel0_Level0();

		/**
		 * The meta object literal for the '<em><b>Level0 filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER = eINSTANCE.getGSSTestProcOutputLevel0_Level0_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel3FilterImpl <em>GSS Test Proc Level3 Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel3FilterImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcLevel3Filter()
		 * @generated
		 */
		EClass GSS_TEST_PROC_LEVEL3_FILTER = eINSTANCE.getGSSTestProcLevel3Filter();

		/**
		 * The meta object literal for the '<em><b>Apply def filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_LEVEL3_FILTER__APPLY_DEF_FILTER = eINSTANCE.getGSSTestProcLevel3Filter_Apply_def_filter();

		/**
		 * The meta object literal for the '<em><b>Extra filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_LEVEL3_FILTER__EXTRA_FILTER = eINSTANCE.getGSSTestProcLevel3Filter_Extra_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel2FilterImpl <em>GSS Test Proc Level2 Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel2FilterImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcLevel2Filter()
		 * @generated
		 */
		EClass GSS_TEST_PROC_LEVEL2_FILTER = eINSTANCE.getGSSTestProcLevel2Filter();

		/**
		 * The meta object literal for the '<em><b>Apply def filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_LEVEL2_FILTER__APPLY_DEF_FILTER = eINSTANCE.getGSSTestProcLevel2Filter_Apply_def_filter();

		/**
		 * The meta object literal for the '<em><b>Extra filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_LEVEL2_FILTER__EXTRA_FILTER = eINSTANCE.getGSSTestProcLevel2Filter_Extra_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel1FilterImpl <em>GSS Test Proc Level1 Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel1FilterImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcLevel1Filter()
		 * @generated
		 */
		EClass GSS_TEST_PROC_LEVEL1_FILTER = eINSTANCE.getGSSTestProcLevel1Filter();

		/**
		 * The meta object literal for the '<em><b>Apply def filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_LEVEL1_FILTER__APPLY_DEF_FILTER = eINSTANCE.getGSSTestProcLevel1Filter_Apply_def_filter();

		/**
		 * The meta object literal for the '<em><b>Extra filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_LEVEL1_FILTER__EXTRA_FILTER = eINSTANCE.getGSSTestProcLevel1Filter_Extra_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel0FilterImpl <em>GSS Test Proc Level0 Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel0FilterImpl
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcLevel0Filter()
		 * @generated
		 */
		EClass GSS_TEST_PROC_LEVEL0_FILTER = eINSTANCE.getGSSTestProcLevel0Filter();

		/**
		 * The meta object literal for the '<em><b>Apply def filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER = eINSTANCE.getGSSTestProcLevel0Filter_Apply_def_filter();

		/**
		 * The meta object literal for the '<em><b>Extra filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER = eINSTANCE.getGSSTestProcLevel0Filter_Extra_filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcMode <em>GSS Test Proc Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcMode
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcMode()
		 * @generated
		 */
		EEnum GSS_TEST_PROC_MODE = eINSTANCE.getGSSTestProcMode();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcUnit <em>GSS Test Proc Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcUnit
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcUnit()
		 * @generated
		 */
		EEnum GSS_TEST_PROC_UNIT = eINSTANCE.getGSSTestProcUnit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode <em>GSS Test Proc Checkmode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcCheckmode()
		 * @generated
		 */
		EEnum GSS_TEST_PROC_CHECKMODE = eINSTANCE.getGSSTestProcCheckmode();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo <em>GSS Test Proc Yes No</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo
		 * @see es.uah.aut.srg.gss.test_proc.impl.test_procPackageImpl#getGSSTestProcYesNo()
		 * @generated
		 */
		EEnum GSS_TEST_PROC_YES_NO = eINSTANCE.getGSSTestProcYesNo();

	}

} //test_procPackage
