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

import es.uah.aut.srg.gss.test_campaign.*;

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
public class test_campaignFactoryImpl extends EFactoryImpl implements test_campaignFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static test_campaignFactory init() {
		try {
			test_campaignFactory thetest_campaignFactory = (test_campaignFactory)EPackage.Registry.INSTANCE.getEFactory(test_campaignPackage.eNS_URI);
			if (thetest_campaignFactory != null) {
				return thetest_campaignFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new test_campaignFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_campaignFactoryImpl() {
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
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST_CAMPAIGN: return createGSSTestCampaignTestCampaign();
			case test_campaignPackage.GSS_TEST_CAMPAIGN_TEST: return createGSSTestCampaignTest();
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
	public GSSTestCampaignTest createGSSTestCampaignTest() {
		GSSTestCampaignTestImpl gssTestCampaignTest = new GSSTestCampaignTestImpl();
		return gssTestCampaignTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_campaignPackage gettest_campaignPackage() {
		return (test_campaignPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static test_campaignPackage getPackage() {
		return test_campaignPackage.eINSTANCE;
	}

} //test_campaignFactoryImpl
