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

import es.uah.aut.srg.gss.campaign.GSSCampaignScenario;
import es.uah.aut.srg.gss.campaign.campaignPackage;

import es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment;
import es.uah.aut.srg.gss.scenario.GSSScenarioScenario;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Campaign Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignScenarioImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignScenarioImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSCampaignScenarioImpl extends MinimalEObjectImpl.Container implements GSSCampaignScenario {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnvironment environment;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioScenario scenario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSCampaignScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return campaignPackage.Literals.GSS_CAMPAIGN_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentEnvironment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (GSSEnvironmentEnvironment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, campaignPackage.GSS_CAMPAIGN_SCENARIO__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentEnvironment basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(GSSEnvironmentEnvironment newEnvironment) {
		GSSEnvironmentEnvironment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_SCENARIO__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioScenario getScenario() {
		if (scenario != null && scenario.eIsProxy()) {
			InternalEObject oldScenario = (InternalEObject)scenario;
			scenario = (GSSScenarioScenario)eResolveProxy(oldScenario);
			if (scenario != oldScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, campaignPackage.GSS_CAMPAIGN_SCENARIO__SCENARIO, oldScenario, scenario));
			}
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioScenario basicGetScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(GSSScenarioScenario newScenario) {
		GSSScenarioScenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_SCENARIO__SCENARIO, oldScenario, scenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case campaignPackage.GSS_CAMPAIGN_SCENARIO__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case campaignPackage.GSS_CAMPAIGN_SCENARIO__SCENARIO:
				if (resolve) return getScenario();
				return basicGetScenario();
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
			case campaignPackage.GSS_CAMPAIGN_SCENARIO__ENVIRONMENT:
				setEnvironment((GSSEnvironmentEnvironment)newValue);
				return;
			case campaignPackage.GSS_CAMPAIGN_SCENARIO__SCENARIO:
				setScenario((GSSScenarioScenario)newValue);
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
			case campaignPackage.GSS_CAMPAIGN_SCENARIO__ENVIRONMENT:
				setEnvironment((GSSEnvironmentEnvironment)null);
				return;
			case campaignPackage.GSS_CAMPAIGN_SCENARIO__SCENARIO:
				setScenario((GSSScenarioScenario)null);
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
			case campaignPackage.GSS_CAMPAIGN_SCENARIO__ENVIRONMENT:
				return environment != null;
			case campaignPackage.GSS_CAMPAIGN_SCENARIO__SCENARIO:
				return scenario != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSCampaignScenarioImpl
