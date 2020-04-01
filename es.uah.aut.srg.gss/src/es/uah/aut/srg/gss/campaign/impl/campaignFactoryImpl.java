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

import es.uah.aut.srg.gss.campaign.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class campaignFactoryImpl extends EFactoryImpl implements campaignFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static campaignFactory init() {
		try {
			campaignFactory thecampaignFactory = (campaignFactory)EPackage.Registry.INSTANCE.getEFactory(campaignPackage.eNS_URI);
			if (thecampaignFactory != null) {
				return thecampaignFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new campaignFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public campaignFactoryImpl() {
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
			case campaignPackage.GSS_CAMPAIGN_CAMPAIGN: return createGSSCampaignCampaign();
			case campaignPackage.GSS_CAMPAIGN_SCENARIO: return createGSSCampaignScenario();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSCampaignCampaign createGSSCampaignCampaign() {
		GSSCampaignCampaignImpl gssCampaignCampaign = new GSSCampaignCampaignImpl();
		return gssCampaignCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSCampaignScenario createGSSCampaignScenario() {
		GSSCampaignScenarioImpl gssCampaignScenario = new GSSCampaignScenarioImpl();
		return gssCampaignScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public campaignPackage getcampaignPackage() {
		return (campaignPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static campaignPackage getPackage() {
		return campaignPackage.eINSTANCE;
	}

} //campaignFactoryImpl
