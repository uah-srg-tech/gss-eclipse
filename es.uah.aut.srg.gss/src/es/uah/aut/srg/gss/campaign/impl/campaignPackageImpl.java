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
import es.uah.aut.srg.gss.campaign.GSSCampaignTestCase;
import es.uah.aut.srg.gss.campaign.GSSCampaignTestReqAction;
import es.uah.aut.srg.gss.campaign.GSSCampaignTests;
import es.uah.aut.srg.gss.campaign.campaignFactory;
import es.uah.aut.srg.gss.campaign.campaignPackage;

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.gss.test_proc.test_procPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssCampaignTestsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssCampaignTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssCampaignTestReqActionEEnum = null;

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
		test_procPackage.eINSTANCE.eClass();

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
	public EReference getGSSCampaignScenario_Scenario() {
		return (EReference)gssCampaignScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSCampaignTests() {
		return gssCampaignTestsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSCampaignTests_TestCase() {
		return (EReference)gssCampaignTestsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSCampaignTestCase() {
		return gssCampaignTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSCampaignTestCase_Name() {
		return (EAttribute)gssCampaignTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSCampaignTestCase_Procedure() {
		return (EReference)gssCampaignTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSCampaignTestCase_Req() {
		return (EAttribute)gssCampaignTestCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSCampaignTestCase_ReqAction() {
		return (EAttribute)gssCampaignTestCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSCampaignTestReqAction() {
		return gssCampaignTestReqActionEEnum;
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
		createEReference(gssCampaignScenarioEClass, GSS_CAMPAIGN_SCENARIO__SCENARIO);

		gssCampaignTestsEClass = createEClass(GSS_CAMPAIGN_TESTS);
		createEReference(gssCampaignTestsEClass, GSS_CAMPAIGN_TESTS__TEST_CASE);

		gssCampaignTestCaseEClass = createEClass(GSS_CAMPAIGN_TEST_CASE);
		createEAttribute(gssCampaignTestCaseEClass, GSS_CAMPAIGN_TEST_CASE__NAME);
		createEReference(gssCampaignTestCaseEClass, GSS_CAMPAIGN_TEST_CASE__PROCEDURE);
		createEAttribute(gssCampaignTestCaseEClass, GSS_CAMPAIGN_TEST_CASE__REQ);
		createEAttribute(gssCampaignTestCaseEClass, GSS_CAMPAIGN_TEST_CASE__REQ_ACTION);

		// Create enums
		gssCampaignTestReqActionEEnum = createEEnum(GSS_CAMPAIGN_TEST_REQ_ACTION);
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
		environmentPackage theenvironmentPackage = (environmentPackage)EPackage.Registry.INSTANCE.getEPackage(environmentPackage.eNS_URI);
		test_procPackage thetest_procPackage = (test_procPackage)EPackage.Registry.INSTANCE.getEPackage(test_procPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssCampaignCampaignEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssCampaignCampaignEClass, GSSCampaignCampaign.class, "GSSCampaignCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSCampaignCampaign_Scenario(), this.getGSSCampaignScenario(), null, "Scenario", null, 1, 1, GSSCampaignCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSCampaignCampaign_Tests(), this.getGSSCampaignTests(), null, "Tests", null, 1, 1, GSSCampaignCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssCampaignScenarioEClass, GSSCampaignScenario.class, "GSSCampaignScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSCampaignScenario_Environment(), theenvironmentPackage.getGSSEnvironmentEnvironment(), null, "environment", null, 1, 1, GSSCampaignScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSCampaignScenario_Scenario(), theenvironmentPackage.getGSSEnvironmentScenario(), null, "scenario", null, 1, 1, GSSCampaignScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssCampaignTestsEClass, GSSCampaignTests.class, "GSSCampaignTests", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSCampaignTests_TestCase(), this.getGSSCampaignTestCase(), null, "TestCase", null, 1, 150, GSSCampaignTests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssCampaignTestCaseEClass, GSSCampaignTestCase.class, "GSSCampaignTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSCampaignTestCase_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSCampaignTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSCampaignTestCase_Procedure(), thetest_procPackage.getGSSTestProcTestProc(), null, "procedure", null, 1, 1, GSSCampaignTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSCampaignTestCase_Req(), ecorePackage.getEString(), "req", null, 0, 1, GSSCampaignTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSCampaignTestCase_ReqAction(), this.getGSSCampaignTestReqAction(), "reqAction", null, 0, 1, GSSCampaignTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssCampaignTestReqActionEEnum, GSSCampaignTestReqAction.class, "GSSCampaignTestReqAction");
		addEEnumLiteral(gssCampaignTestReqActionEEnum, GSSCampaignTestReqAction._1);

		// Create resource
		createResource(eNS_URI);
	}

} //campaignPackageImpl
