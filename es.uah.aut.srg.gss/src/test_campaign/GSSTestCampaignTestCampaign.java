/**
 */
package test_campaign;

import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Campaign Test Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test_campaign.GSSTestCampaignTestCampaign#getName <em>Name</em>}</li>
 *   <li>{@link test_campaign.GSSTestCampaignTestCampaign#getTest_proc <em>Test proc</em>}</li>
 * </ul>
 *
 * @see test_campaign.Test_campaignPackage#getGSSTestCampaignTestCampaign()
 * @model
 * @generated
 */
public interface GSSTestCampaignTestCampaign extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see test_campaign.Test_campaignPackage#getGSSTestCampaignTestCampaign_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link test_campaign.GSSTestCampaignTestCampaign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Test proc</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test proc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test proc</em>' containment reference list.
	 * @see test_campaign.Test_campaignPackage#getGSSTestCampaignTestCampaign_Test_proc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GSSTestProcTestProc> getTest_proc();

} // GSSTestCampaignTestCampaign
