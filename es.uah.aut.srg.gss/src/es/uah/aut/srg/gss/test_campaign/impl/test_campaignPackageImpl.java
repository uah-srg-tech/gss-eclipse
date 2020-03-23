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
import es.uah.aut.srg.gss.test_campaign.test_campaignFactory;
import es.uah.aut.srg.gss.test_campaign.test_campaignPackage;

import es.uah.aut.srg.gss.test_proc.test_procPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class test_campaignPackageImpl extends EPackageImpl implements test_campaignPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestCampaignTestCampaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestCampaignTestEClass = null;

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
	 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private test_campaignPackageImpl() {
		super(eNS_URI, test_campaignFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link test_campaignPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static test_campaignPackage init() {
		if (isInited) return (test_campaignPackage)EPackage.Registry.INSTANCE.getEPackage(test_campaignPackage.eNS_URI);

		// Obtain or create and register package
		test_campaignPackageImpl thetest_campaignPackage = (test_campaignPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof test_campaignPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new test_campaignPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		test_procPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetest_campaignPackage.createPackageContents();

		// Initialize created meta-data
		thetest_campaignPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetest_campaignPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(test_campaignPackage.eNS_URI, thetest_campaignPackage);
		return thetest_campaignPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestCampaignTestCampaign() {
		return gssTestCampaignTestCampaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestCampaignTestCampaign_Name() {
		return (EAttribute)gssTestCampaignTestCampaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestCampaignTestCampaign_Test() {
		return (EReference)gssTestCampaignTestCampaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestCampaignTest() {
		return gssTestCampaignTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestCampaignTest_Name() {
		return (EAttribute)gssTestCampaignTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestCampaignTest_Procedure() {
		return (EReference)gssTestCampaignTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestCampaignTest_PrevMsg() {
		return (EAttribute)gssTestCampaignTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestCampaignTest_PrevAction() {
		return (EAttribute)gssTestCampaignTestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestCampaignTest_PrevActionParam() {
		return (EAttribute)gssTestCampaignTestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_campaignFactory gettest_campaignFactory() {
		return (test_campaignFactory)getEFactoryInstance();
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
		gssTestCampaignTestCampaignEClass = createEClass(GSS_TEST_CAMPAIGN_TEST_CAMPAIGN);
		createEAttribute(gssTestCampaignTestCampaignEClass, GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME);
		createEReference(gssTestCampaignTestCampaignEClass, GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST);

		gssTestCampaignTestEClass = createEClass(GSS_TEST_CAMPAIGN_TEST);
		createEAttribute(gssTestCampaignTestEClass, GSS_TEST_CAMPAIGN_TEST__NAME);
		createEReference(gssTestCampaignTestEClass, GSS_TEST_CAMPAIGN_TEST__PROCEDURE);
		createEAttribute(gssTestCampaignTestEClass, GSS_TEST_CAMPAIGN_TEST__PREV_MSG);
		createEAttribute(gssTestCampaignTestEClass, GSS_TEST_CAMPAIGN_TEST__PREV_ACTION);
		createEAttribute(gssTestCampaignTestEClass, GSS_TEST_CAMPAIGN_TEST__PREV_ACTION_PARAM);
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
		test_procPackage thetest_procPackage = (test_procPackage)EPackage.Registry.INSTANCE.getEPackage(test_procPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(gssTestCampaignTestCampaignEClass, GSSTestCampaignTestCampaign.class, "GSSTestCampaignTestCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestCampaignTestCampaign_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestCampaignTestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestCampaignTestCampaign_Test(), this.getGSSTestCampaignTest(), null, "test", null, 1, 150, GSSTestCampaignTestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestCampaignTestEClass, GSSTestCampaignTest.class, "GSSTestCampaignTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestCampaignTest_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestCampaignTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestCampaignTest_Procedure(), thetest_procPackage.getGSSTestProcTestProc(), null, "procedure", null, 1, 1, GSSTestCampaignTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestCampaignTest_PrevMsg(), ecorePackage.getEString(), "prevMsg", null, 0, 1, GSSTestCampaignTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestCampaignTest_PrevAction(), thetest_procPackage.getGSSTestProcPrevAction(), "prevAction", null, 0, 1, GSSTestCampaignTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestCampaignTest_PrevActionParam(), ecorePackage.getEString(), "prevActionParam", null, 0, 1, GSSTestCampaignTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //test_campaignPackageImpl
