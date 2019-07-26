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
package es.uah.aut.srg.gss.campaign.impl;

import es.uah.aut.srg.gss.campaign.GSSCampaignCampaign;
import es.uah.aut.srg.gss.campaign.GSSCampaignScenario;
import es.uah.aut.srg.gss.campaign.GSSCampaignTests;
import es.uah.aut.srg.gss.campaign.campaignPackage;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Campaign Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignCampaignImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignCampaignImpl#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSCampaignCampaignImpl extends GSSModelElementImpl implements GSSCampaignCampaign {
	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected GSSCampaignScenario scenario;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected GSSCampaignTests tests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSCampaignCampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return campaignPackage.Literals.GSS_CAMPAIGN_CAMPAIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSCampaignScenario getScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(GSSCampaignScenario newScenario, NotificationChain msgs) {
		GSSCampaignScenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_CAMPAIGN__SCENARIO, oldScenario, newScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(GSSCampaignScenario newScenario) {
		if (newScenario != scenario) {
			NotificationChain msgs = null;
			if (scenario != null)
				msgs = ((InternalEObject)scenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - campaignPackage.GSS_CAMPAIGN_CAMPAIGN__SCENARIO, null, msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - campaignPackage.GSS_CAMPAIGN_CAMPAIGN__SCENARIO, null, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_CAMPAIGN__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSCampaignTests getTests() {
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTests(GSSCampaignTests newTests, NotificationChain msgs) {
		GSSCampaignTests oldTests = tests;
		tests = newTests;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_CAMPAIGN__TESTS, oldTests, newTests);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTests(GSSCampaignTests newTests) {
		if (newTests != tests) {
			NotificationChain msgs = null;
			if (tests != null)
				msgs = ((InternalEObject)tests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - campaignPackage.GSS_CAMPAIGN_CAMPAIGN__TESTS, null, msgs);
			if (newTests != null)
				msgs = ((InternalEObject)newTests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - campaignPackage.GSS_CAMPAIGN_CAMPAIGN__TESTS, null, msgs);
			msgs = basicSetTests(newTests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_CAMPAIGN__TESTS, newTests, newTests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__SCENARIO:
				return basicSetScenario(null, msgs);
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__TESTS:
				return basicSetTests(null, msgs);
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
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__SCENARIO:
				return getScenario();
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__TESTS:
				return getTests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__SCENARIO:
				setScenario((GSSCampaignScenario)newValue);
				return;
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__TESTS:
				setTests((GSSCampaignTests)newValue);
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
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__SCENARIO:
				setScenario((GSSCampaignScenario)null);
				return;
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__TESTS:
				setTests((GSSCampaignTests)null);
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
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__SCENARIO:
				return scenario != null;
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN__TESTS:
				return tests != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSCampaignCampaignImpl
