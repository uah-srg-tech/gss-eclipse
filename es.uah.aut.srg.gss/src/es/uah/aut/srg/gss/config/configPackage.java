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
package es.uah.aut.srg.gss.config;

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
 * @see es.uah.aut.srg.gss.config.configFactory
 * @model kind="package"
 * @generated
 */
public interface configPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/config";

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
	configPackage eINSTANCE = es.uah.aut.srg.gss.config.impl.configPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl <em>GSS Config GSS Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSConfig()
	 * @generated
	 */
	int GSS_CONFIG_GSS_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__SCENARIO = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__TESTS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Config GSS Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Config GSS Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl <em>GSS Config Tests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigTests()
	 * @generated
	 */
	int GSS_CONFIG_TESTS = 1;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TESTS__TEST_CASE = 0;

	/**
	 * The number of structural features of the '<em>GSS Config Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TESTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Config Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TESTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl <em>GSS Config Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigTestCase()
	 * @generated
	 */
	int GSS_CONFIG_TEST_CASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE__PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE__REQ = 2;

	/**
	 * The feature id for the '<em><b>Req Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE__REQ_ACTION = 3;

	/**
	 * The number of structural features of the '<em>GSS Config Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigReqAction <em>GSS Config Req Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigReqAction
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReqAction()
	 * @generated
	 */
	int GSS_CONFIG_REQ_ACTION = 3;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig <em>GSS Config GSS Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config GSS Config</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig
	 * @generated
	 */
	EClass getGSSConfigGSSConfig();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getScenario()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_Scenario();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tests</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getTests()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_Tests();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigTests <em>GSS Config Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Tests</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTests
	 * @generated
	 */
	EClass getGSSConfigTests();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigTests#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Case</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTests#getTestCase()
	 * @see #getGSSConfigTests()
	 * @generated
	 */
	EReference getGSSConfigTests_TestCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase <em>GSS Config Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Test Case</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase
	 * @generated
	 */
	EClass getGSSConfigTestCase();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase#getName()
	 * @see #getGSSConfigTestCase()
	 * @generated
	 */
	EAttribute getGSSConfigTestCase_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedure</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase#getProcedure()
	 * @see #getGSSConfigTestCase()
	 * @generated
	 */
	EReference getGSSConfigTestCase_Procedure();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReq <em>Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase#getReq()
	 * @see #getGSSConfigTestCase()
	 * @generated
	 */
	EAttribute getGSSConfigTestCase_Req();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReqAction <em>Req Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Action</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase#getReqAction()
	 * @see #getGSSConfigTestCase()
	 * @generated
	 */
	EAttribute getGSSConfigTestCase_ReqAction();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigReqAction <em>GSS Config Req Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Req Action</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReqAction
	 * @generated
	 */
	EEnum getGSSConfigReqAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	configFactory getconfigFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl <em>GSS Config GSS Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSConfig()
		 * @generated
		 */
		EClass GSS_CONFIG_GSS_CONFIG = eINSTANCE.getGSSConfigGSSConfig();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__SCENARIO = eINSTANCE.getGSSConfigGSSConfig_Scenario();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__TESTS = eINSTANCE.getGSSConfigGSSConfig_Tests();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl <em>GSS Config Tests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigTests()
		 * @generated
		 */
		EClass GSS_CONFIG_TESTS = eINSTANCE.getGSSConfigTests();

		/**
		 * The meta object literal for the '<em><b>Test Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_TESTS__TEST_CASE = eINSTANCE.getGSSConfigTests_TestCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl <em>GSS Config Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigTestCase()
		 * @generated
		 */
		EClass GSS_CONFIG_TEST_CASE = eINSTANCE.getGSSConfigTestCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_TEST_CASE__NAME = eINSTANCE.getGSSConfigTestCase_Name();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_TEST_CASE__PROCEDURE = eINSTANCE.getGSSConfigTestCase_Procedure();

		/**
		 * The meta object literal for the '<em><b>Req</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_TEST_CASE__REQ = eINSTANCE.getGSSConfigTestCase_Req();

		/**
		 * The meta object literal for the '<em><b>Req Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_TEST_CASE__REQ_ACTION = eINSTANCE.getGSSConfigTestCase_ReqAction();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigReqAction <em>GSS Config Req Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigReqAction
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReqAction()
		 * @generated
		 */
		EEnum GSS_CONFIG_REQ_ACTION = eINSTANCE.getGSSConfigReqAction();

	}

} //configPackage
