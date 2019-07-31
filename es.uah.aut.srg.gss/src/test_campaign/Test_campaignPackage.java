/**
 */
package test_campaign;

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
 * @see test_campaign.Test_campaignFactory
 * @model kind="package"
 * @generated
 */
public interface Test_campaignPackage extends EPackage {
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
	Test_campaignPackage eINSTANCE = test_campaign.impl.Test_campaignPackageImpl.init();

	/**
	 * The meta object id for the '{@link test_campaign.impl.GSSTestCampaignTestCampaignImpl <em>GSS Test Campaign Test Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test_campaign.impl.GSSTestCampaignTestCampaignImpl
	 * @see test_campaign.impl.Test_campaignPackageImpl#getGSSTestCampaignTestCampaign()
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
	 * The feature id for the '<em><b>Test proc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST_PROC = 1;

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
	 * Returns the meta object for class '{@link test_campaign.GSSTestCampaignTestCampaign <em>GSS Test Campaign Test Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test Campaign Test Campaign</em>'.
	 * @see test_campaign.GSSTestCampaignTestCampaign
	 * @generated
	 */
	EClass getGSSTestCampaignTestCampaign();

	/**
	 * Returns the meta object for the attribute '{@link test_campaign.GSSTestCampaignTestCampaign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see test_campaign.GSSTestCampaignTestCampaign#getName()
	 * @see #getGSSTestCampaignTestCampaign()
	 * @generated
	 */
	EAttribute getGSSTestCampaignTestCampaign_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link test_campaign.GSSTestCampaignTestCampaign#getTest_proc <em>Test proc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test proc</em>'.
	 * @see test_campaign.GSSTestCampaignTestCampaign#getTest_proc()
	 * @see #getGSSTestCampaignTestCampaign()
	 * @generated
	 */
	EReference getGSSTestCampaignTestCampaign_Test_proc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Test_campaignFactory getTest_campaignFactory();

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
		 * The meta object literal for the '{@link test_campaign.impl.GSSTestCampaignTestCampaignImpl <em>GSS Test Campaign Test Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test_campaign.impl.GSSTestCampaignTestCampaignImpl
		 * @see test_campaign.impl.Test_campaignPackageImpl#getGSSTestCampaignTestCampaign()
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
		 * The meta object literal for the '<em><b>Test proc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST_PROC = eINSTANCE.getGSSTestCampaignTestCampaign_Test_proc();

	}

} //Test_campaignPackage
