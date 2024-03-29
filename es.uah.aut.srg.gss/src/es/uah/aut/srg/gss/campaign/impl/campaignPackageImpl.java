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
import es.uah.aut.srg.gss.campaign.campaignFactory;
import es.uah.aut.srg.gss.campaign.campaignPackage;

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.gss.scenario.scenarioPackage;
import es.uah.aut.srg.gss.test_list.test_listPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class campaignPackageImpl extends EPackageImpl implements campaignPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssCampaignCampaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssCampaignScenarioEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.gss.campaign.campaignPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private campaignPackageImpl() {
		super(eNS_URI, campaignFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link campaignPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static campaignPackage init() {
		if (isInited) return (campaignPackage)EPackage.Registry.INSTANCE.getEPackage(campaignPackage.eNS_URI);

		// Obtain or create and register package
		campaignPackageImpl thecampaignPackage = (campaignPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof campaignPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new campaignPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		environmentPackage.eINSTANCE.eClass();
		test_listPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thecampaignPackage.createPackageContents();

		// Initialize created meta-data
		thecampaignPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecampaignPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(campaignPackage.eNS_URI, thecampaignPackage);
		return thecampaignPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSCampaignCampaign() {
		return gssCampaignCampaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSCampaignCampaign_Scenario() {
		return (EReference)gssCampaignCampaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSCampaignCampaign_Tests() {
		return (EReference)gssCampaignCampaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSCampaignScenario() {
		return gssCampaignScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSCampaignScenario_Environment() {
		return (EReference)gssCampaignScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSCampaignScenario_ScenarioRef() {
		return (EReference)gssCampaignScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public campaignFactory getcampaignFactory() {
		return (campaignFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gssCampaignCampaignEClass = createEClass(GSS_CAMPAIGN_CAMPAIGN);
		createEReference(gssCampaignCampaignEClass, GSS_CAMPAIGN_CAMPAIGN__SCENARIO);
		createEReference(gssCampaignCampaignEClass, GSS_CAMPAIGN_CAMPAIGN__TESTS);

		gssCampaignScenarioEClass = createEClass(GSS_CAMPAIGN_SCENARIO);
		createEReference(gssCampaignScenarioEClass, GSS_CAMPAIGN_SCENARIO__ENVIRONMENT);
		createEReference(gssCampaignScenarioEClass, GSS_CAMPAIGN_SCENARIO__SCENARIO_REF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);
		test_listPackage thetest_listPackage = (test_listPackage)EPackage.Registry.INSTANCE.getEPackage(test_listPackage.eNS_URI);
		environmentPackage theenvironmentPackage = (environmentPackage)EPackage.Registry.INSTANCE.getEPackage(environmentPackage.eNS_URI);
		scenarioPackage thescenarioPackage = (scenarioPackage)EPackage.Registry.INSTANCE.getEPackage(scenarioPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssCampaignCampaignEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssCampaignCampaignEClass, GSSCampaignCampaign.class, "GSSCampaignCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSCampaignCampaign_Scenario(), this.getGSSCampaignScenario(), null, "Scenario", null, 1, 1, GSSCampaignCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSCampaignCampaign_Tests(), thetest_listPackage.getGSSTestListTestList(), null, "Tests", null, 1, 1, GSSCampaignCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssCampaignScenarioEClass, GSSCampaignScenario.class, "GSSCampaignScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSCampaignScenario_Environment(), theenvironmentPackage.getGSSEnvironmentEnvironment(), null, "environment", null, 1, 1, GSSCampaignScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSCampaignScenario_ScenarioRef(), thescenarioPackage.getGSSScenarioScenario(), null, "scenarioRef", null, 1, 1, GSSCampaignScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //campaignPackageImpl
