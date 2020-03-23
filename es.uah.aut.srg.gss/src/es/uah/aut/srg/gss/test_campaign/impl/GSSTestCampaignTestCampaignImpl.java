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
package es.uah.aut.srg.gss.test_campaign.impl;

import es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest;
import es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign;
import es.uah.aut.srg.gss.test_campaign.test_campaignPackage;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Campaign Test Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestCampaignImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_campaign.impl.GSSTestCampaignTestCampaignImpl#getTest <em>Test</em>}</li>
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
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTestCampaignTest> test;

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
		return test_campaignPackage.Literals.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTestCampaignTest> getTest() {
		if (test == null) {
			test = new EObjectContainmentEList<GSSTestCampaignTest>(GSSTestCampaignTest.class, this, test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST:
				return ((InternalEList<?>)getTest()).basicRemove(otherEnd, msgs);
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
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME:
				return getName();
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST:
				return getTest();
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
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME:
				setName((String)newValue);
				return;
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends GSSTestCampaignTest>)newValue);
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
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST:
				getTest().clear();
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
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST:
				return test != null && !test.isEmpty();
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
