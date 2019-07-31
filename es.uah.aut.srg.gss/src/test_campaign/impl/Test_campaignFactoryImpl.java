/**
 */
package test_campaign.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import test_campaign.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Test_campaignFactoryImpl extends EFactoryImpl implements Test_campaignFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test_campaignFactory init() {
		try {
			Test_campaignFactory theTest_campaignFactory = (Test_campaignFactory)EPackage.Registry.INSTANCE.getEFactory(Test_campaignPackage.eNS_URI);
			if (theTest_campaignFactory != null) {
				return theTest_campaignFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Test_campaignFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test_campaignFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN: return createGSSTestCampaignTestCampaign();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestCampaignTestCampaign createGSSTestCampaignTestCampaign() {
		GSSTestCampaignTestCampaignImpl gssTestCampaignTestCampaign = new GSSTestCampaignTestCampaignImpl();
		return gssTestCampaignTestCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test_campaignPackage getTest_campaignPackage() {
		return (Test_campaignPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Test_campaignPackage getPackage() {
		return Test_campaignPackage.eINSTANCE;
	}

} //Test_campaignFactoryImpl
