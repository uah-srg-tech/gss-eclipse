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
package es.uah.aut.srg.gss.campaign;

import es.uah.aut.srg.gss.common.commonPackage;

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
 * @see es.uah.aut.srg.gss.campaign.campaignFactory
 * @model kind="package"
 * @generated
 */
public interface campaignPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "campaign";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/campaign";

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
	campaignPackage eINSTANCE = es.uah.aut.srg.gss.campaign.impl.campaignPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignCampaignImpl <em>GSS Campaign Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.campaign.impl.GSSCampaignCampaignImpl
	 * @see es.uah.aut.srg.gss.campaign.impl.campaignPackageImpl#getGSSCampaignCampaign()
	 * @generated
	 */
	int GSS_CAMPAIGN_CAMPAIGN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_CAMPAIGN__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_CAMPAIGN__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_CAMPAIGN__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_CAMPAIGN__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_CAMPAIGN__SCENARIO = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_CAMPAIGN__TESTS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Campaign Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_CAMPAIGN_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Campaign Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_CAMPAIGN_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignScenarioImpl <em>GSS Campaign Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.campaign.impl.GSSCampaignScenarioImpl
	 * @see es.uah.aut.srg.gss.campaign.impl.campaignPackageImpl#getGSSCampaignScenario()
	 * @generated
	 */
	int GSS_CAMPAIGN_SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_SCENARIO__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Scenario Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_SCENARIO__SCENARIO_REF = 1;

	/**
	 * The number of structural features of the '<em>GSS Campaign Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_SCENARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Campaign Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestsImpl <em>GSS Campaign Tests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestsImpl
	 * @see es.uah.aut.srg.gss.campaign.impl.campaignPackageImpl#getGSSCampaignTests()
	 * @generated
	 */
	int GSS_CAMPAIGN_TESTS = 2;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TESTS__TEST_CASE = 0;

	/**
	 * The number of structural features of the '<em>GSS Campaign Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TESTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Campaign Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TESTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestCaseImpl <em>GSS Campaign Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestCaseImpl
	 * @see es.uah.aut.srg.gss.campaign.impl.campaignPackageImpl#getGSSCampaignTestCase()
	 * @generated
	 */
	int GSS_CAMPAIGN_TEST_CASE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TEST_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TEST_CASE__PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Prev Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TEST_CASE__PREV_MSG = 2;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TEST_CASE__PREV_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Prev Action Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TEST_CASE__PREV_ACTION_PARAM = 4;

	/**
	 * The number of structural features of the '<em>GSS Campaign Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TEST_CASE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Campaign Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CAMPAIGN_TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.campaign.GSSCampaignCampaign <em>GSS Campaign Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Campaign Campaign</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignCampaign
	 * @generated
	 */
	EClass getGSSCampaignCampaign();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.campaign.GSSCampaignCampaign#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignCampaign#getScenario()
	 * @see #getGSSCampaignCampaign()
	 * @generated
	 */
	EReference getGSSCampaignCampaign_Scenario();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.campaign.GSSCampaignCampaign#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tests</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignCampaign#getTests()
	 * @see #getGSSCampaignCampaign()
	 * @generated
	 */
	EReference getGSSCampaignCampaign_Tests();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.campaign.GSSCampaignScenario <em>GSS Campaign Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Campaign Scenario</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignScenario
	 * @generated
	 */
	EClass getGSSCampaignScenario();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.campaign.GSSCampaignScenario#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignScenario#getEnvironment()
	 * @see #getGSSCampaignScenario()
	 * @generated
	 */
	EReference getGSSCampaignScenario_Environment();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.campaign.GSSCampaignScenario#getScenarioRef <em>Scenario Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario Ref</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignScenario#getScenarioRef()
	 * @see #getGSSCampaignScenario()
	 * @generated
	 */
	EReference getGSSCampaignScenario_ScenarioRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTests <em>GSS Campaign Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Campaign Tests</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTests
	 * @generated
	 */
	EClass getGSSCampaignTests();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTests#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Case</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTests#getTestCase()
	 * @see #getGSSCampaignTests()
	 * @generated
	 */
	EReference getGSSCampaignTests_TestCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTestCase <em>GSS Campaign Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Campaign Test Case</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTestCase
	 * @generated
	 */
	EClass getGSSCampaignTestCase();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getName()
	 * @see #getGSSCampaignTestCase()
	 * @generated
	 */
	EAttribute getGSSCampaignTestCase_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedure</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getProcedure()
	 * @see #getGSSCampaignTestCase()
	 * @generated
	 */
	EReference getGSSCampaignTestCase_Procedure();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getPrevMsg <em>Prev Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Msg</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getPrevMsg()
	 * @see #getGSSCampaignTestCase()
	 * @generated
	 */
	EAttribute getGSSCampaignTestCase_PrevMsg();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getPrevAction <em>Prev Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Action</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getPrevAction()
	 * @see #getGSSCampaignTestCase()
	 * @generated
	 */
	EAttribute getGSSCampaignTestCase_PrevAction();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getPrevActionParam <em>Prev Action Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Action Param</em>'.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTestCase#getPrevActionParam()
	 * @see #getGSSCampaignTestCase()
	 * @generated
	 */
	EAttribute getGSSCampaignTestCase_PrevActionParam();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	campaignFactory getcampaignFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignCampaignImpl <em>GSS Campaign Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.campaign.impl.GSSCampaignCampaignImpl
		 * @see es.uah.aut.srg.gss.campaign.impl.campaignPackageImpl#getGSSCampaignCampaign()
		 * @generated
		 */
		EClass GSS_CAMPAIGN_CAMPAIGN = eINSTANCE.getGSSCampaignCampaign();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CAMPAIGN_CAMPAIGN__SCENARIO = eINSTANCE.getGSSCampaignCampaign_Scenario();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CAMPAIGN_CAMPAIGN__TESTS = eINSTANCE.getGSSCampaignCampaign_Tests();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignScenarioImpl <em>GSS Campaign Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.campaign.impl.GSSCampaignScenarioImpl
		 * @see es.uah.aut.srg.gss.campaign.impl.campaignPackageImpl#getGSSCampaignScenario()
		 * @generated
		 */
		EClass GSS_CAMPAIGN_SCENARIO = eINSTANCE.getGSSCampaignScenario();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CAMPAIGN_SCENARIO__ENVIRONMENT = eINSTANCE.getGSSCampaignScenario_Environment();

		/**
		 * The meta object literal for the '<em><b>Scenario Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CAMPAIGN_SCENARIO__SCENARIO_REF = eINSTANCE.getGSSCampaignScenario_ScenarioRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestsImpl <em>GSS Campaign Tests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestsImpl
		 * @see es.uah.aut.srg.gss.campaign.impl.campaignPackageImpl#getGSSCampaignTests()
		 * @generated
		 */
		EClass GSS_CAMPAIGN_TESTS = eINSTANCE.getGSSCampaignTests();

		/**
		 * The meta object literal for the '<em><b>Test Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CAMPAIGN_TESTS__TEST_CASE = eINSTANCE.getGSSCampaignTests_TestCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestCaseImpl <em>GSS Campaign Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestCaseImpl
		 * @see es.uah.aut.srg.gss.campaign.impl.campaignPackageImpl#getGSSCampaignTestCase()
		 * @generated
		 */
		EClass GSS_CAMPAIGN_TEST_CASE = eINSTANCE.getGSSCampaignTestCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CAMPAIGN_TEST_CASE__NAME = eINSTANCE.getGSSCampaignTestCase_Name();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CAMPAIGN_TEST_CASE__PROCEDURE = eINSTANCE.getGSSCampaignTestCase_Procedure();

		/**
		 * The meta object literal for the '<em><b>Prev Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CAMPAIGN_TEST_CASE__PREV_MSG = eINSTANCE.getGSSCampaignTestCase_PrevMsg();

		/**
		 * The meta object literal for the '<em><b>Prev Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CAMPAIGN_TEST_CASE__PREV_ACTION = eINSTANCE.getGSSCampaignTestCase_PrevAction();

		/**
		 * The meta object literal for the '<em><b>Prev Action Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CAMPAIGN_TEST_CASE__PREV_ACTION_PARAM = eINSTANCE.getGSSCampaignTestCase_PrevActionParam();

	}

} //campaignPackage
