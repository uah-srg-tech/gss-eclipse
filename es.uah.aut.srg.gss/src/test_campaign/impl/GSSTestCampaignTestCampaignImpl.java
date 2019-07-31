/**
 */
package test_campaign.impl;

import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import test_campaign.GSSTestCampaignTestCampaign;
import test_campaign.Test_campaignPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Campaign Test Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test_campaign.impl.GSSTestCampaignTestCampaignImpl#getName <em>Name</em>}</li>
 *   <li>{@link test_campaign.impl.GSSTestCampaignTestCampaignImpl#getTest_proc <em>Test proc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestCampaignTestCampaignImpl extends MinimalEObjectImpl.Container implements GSSTestCampaignTestCampaign {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTest_proc() <em>Test proc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest_proc()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTestProcTestProc> test_proc;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestCampaignTestCampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Test_campaignPackage.Literals.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTestProcTestProc> getTest_proc() {
		if (test_proc == null) {
			test_proc = new EObjectContainmentEList<GSSTestProcTestProc>(GSSTestProcTestProc.class, this, Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST_PROC);
		}
		return test_proc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST_PROC:
				return ((InternalEList<?>)getTest_proc()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME:
				return getName();
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST_PROC:
				return getTest_proc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME:
				setName((String)newValue);
				return;
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST_PROC:
				getTest_proc().clear();
				getTest_proc().addAll((Collection<? extends GSSTestProcTestProc>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST_PROC:
				getTest_proc().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST_PROC:
				return test_proc != null && !test_proc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GSSTestCampaignTestCampaignImpl
