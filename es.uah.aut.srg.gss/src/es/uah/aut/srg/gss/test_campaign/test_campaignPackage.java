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
package es.uah.aut.srg.gss.test_campaign;

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
 * @see es.uah.aut.srg.gss.test_campaign.test_campaignFactory
 * @model kind="package"
 * @generated
 */
public interface test_campaignPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test_campaign";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/test_campaign";

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
	test_campaignPackage eINSTANCE = es.uah.aut.srg.gss.test_campaign.impl.test_campaignPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestCampaignImpl <em>GSS Test Campaign Test Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestCampaignImpl
	 * @see es.uah.aut.srg.gss.test_campaign.impl.test_campaignPackageImpl#getGSSTestCampaignTestCampaign()
	 * @generated
	 */
	int GSS_TEST_CAMPAIGN_TEST_CAMPAIGN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST = 1;

	/**
	 * The number of structural features of the '<em>GSS Test Campaign Test Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST_CAMPAIGN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Test Campaign Test Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST_CAMPAIGN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestImpl <em>GSS Test Campaign Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestImpl
	 * @see es.uah.aut.srg.gss.test_campaign.impl.test_campaignPackageImpl#getGSSTestCampaignTest()
	 * @generated
	 */
	int GSS_TEST_CAMPAIGN_TEST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST__PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Prev Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST__PREV_MSG = 2;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST__PREV_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Prev Action Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST__PREV_ACTION_PARAM = 4;

	/**
	 * The number of structural features of the '<em>GSS Test Campaign Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Test Campaign Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign <em>GSS Test Campaign Test Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Campaign Test Campaign</em>'.
	 * @see es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign
	 * @generated
	 */
	EClass getGSSTestCampaignTestCampaign();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign#getName()
	 * @see #getGSSTestCampaignTestCampaign()
	 * @generated
	 */
	EAttribute getGSSTestCampaignTestCampaign_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test</em>'.
	 * @see es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign#getTest()
	 * @see #getGSSTestCampaignTestCampaign()
	 * @generated
	 */
	EReference getGSSTestCampaignTestCampaign_Test();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest <em>GSS Test Campaign Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Campaign Test</em>'.
	 * @see es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest
	 * @generated
	 */
	EClass getGSSTestCampaignTest();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getName()
	 * @see #getGSSTestCampaignTest()
	 * @generated
	 */
	EAttribute getGSSTestCampaignTest_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure</em>'.
	 * @see es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getProcedure()
	 * @see #getGSSTestCampaignTest()
	 * @generated
	 */
	EReference getGSSTestCampaignTest_Procedure();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevMsg <em>Prev Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Msg</em>'.
	 * @see es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevMsg()
	 * @see #getGSSTestCampaignTest()
	 * @generated
	 */
	EAttribute getGSSTestCampaignTest_PrevMsg();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevAction <em>Prev Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Action</em>'.
	 * @see es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevAction()
	 * @see #getGSSTestCampaignTest()
	 * @generated
	 */
	EAttribute getGSSTestCampaignTest_PrevAction();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevActionParam <em>Prev Action Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Action Param</em>'.
	 * @see es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevActionParam()
	 * @see #getGSSTestCampaignTest()
	 * @generated
	 */
	EAttribute getGSSTestCampaignTest_PrevActionParam();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	test_campaignFactory gettest_campaignFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestCampaignImpl <em>GSS Test Campaign Test Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestCampaignImpl
		 * @see es.uah.aut.srg.gss.test_campaign.impl.test_campaignPackageImpl#getGSSTestCampaignTestCampaign()
		 * @generated
		 */
		EClass GSS_TEST_CAMPAIGN_TEST_CAMPAIGN = eINSTANCE.getGSSTestCampaignTestCampaign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME = eINSTANCE.getGSSTestCampaignTestCampaign_Name();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST = eINSTANCE.getGSSTestCampaignTestCampaign_Test();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestImpl <em>GSS Test Campaign Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestImpl
		 * @see es.uah.aut.srg.gss.test_campaign.impl.test_campaignPackageImpl#getGSSTestCampaignTest()
		 * @generated
		 */
		EClass GSS_TEST_CAMPAIGN_TEST = eINSTANCE.getGSSTestCampaignTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_CAMPAIGN_TEST__NAME = eINSTANCE.getGSSTestCampaignTest_Name();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_CAMPAIGN_TEST__PROCEDURE = eINSTANCE.getGSSTestCampaignTest_Procedure();

		/**
		 * The meta object literal for the '<em><b>Prev Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_CAMPAIGN_TEST__PREV_MSG = eINSTANCE.getGSSTestCampaignTest_PrevMsg();

		/**
		 * The meta object literal for the '<em><b>Prev Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_CAMPAIGN_TEST__PREV_ACTION = eINSTANCE.getGSSTestCampaignTest_PrevAction();

		/**
		 * The meta object literal for the '<em><b>Prev Action Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_CAMPAIGN_TEST__PREV_ACTION_PARAM = eINSTANCE.getGSSTestCampaignTest_PrevActionParam();

	}

} //test_campaignPackage
