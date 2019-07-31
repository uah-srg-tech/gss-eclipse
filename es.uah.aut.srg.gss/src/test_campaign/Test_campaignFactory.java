/**
 */
package test_campaign;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see test_campaign.Test_campaignPackage
 * @generated
 */
public interface Test_campaignFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Test_campaignFactory eINSTANCE = test_campaign.impl.Test_campaignFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Test Campaign Test Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Test Campaign Test Campaign</em>'.
	 * @generated
	 */
	GSSTestCampaignTestCampaign createGSSTestCampaignTestCampaign();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Test_campaignPackage getTest_campaignPackage();

} //Test_campaignFactory
