/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.config.GSSConfigGSSConfig;
import es.uah.aut.srg.gss.config.GSSConfigTestCase;
import es.uah.aut.srg.gss.config.GSSConfigTests;
import es.uah.aut.srg.gss.config.configFactory;
import es.uah.aut.srg.gss.config.configPackage;

import es.uah.aut.srg.gss.scenario.scenarioPackage;

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
public class configPackageImpl extends EPackageImpl implements configPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGSSConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigTestsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigTestCaseEClass = null;

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
	 * @see es.uah.aut.srg.gss.config.configPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private configPackageImpl() {
		super(eNS_URI, configFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link configPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static configPackage init() {
		if (isInited) return (configPackage)EPackage.Registry.INSTANCE.getEPackage(configPackage.eNS_URI);

		// Obtain or create and register package
		configPackageImpl theconfigPackage = (configPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof configPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new configPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		scenarioPackage.eINSTANCE.eClass();
		test_procPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theconfigPackage.createPackageContents();

		// Initialize created meta-data
		theconfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theconfigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(configPackage.eNS_URI, theconfigPackage);
		return theconfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGSSConfig() {
		return gssConfigGSSConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_Scenario() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_Tests() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigTests() {
		return gssConfigTestsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigTests_TestCase() {
		return (EReference)gssConfigTestsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigTestCase() {
		return gssConfigTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigTestCase_Name() {
		return (EAttribute)gssConfigTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigTestCase_Procedure() {
		return (EReference)gssConfigTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigTestCase_PrevMsg() {
		return (EAttribute)gssConfigTestCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigTestCase_PrevAction() {
		return (EAttribute)gssConfigTestCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigTestCase_PrevActionParam() {
		return (EAttribute)gssConfigTestCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public configFactory getconfigFactory() {
		return (configFactory)getEFactoryInstance();
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
		gssConfigGSSConfigEClass = createEClass(GSS_CONFIG_GSS_CONFIG);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__SCENARIO);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__TESTS);

		gssConfigTestsEClass = createEClass(GSS_CONFIG_TESTS);
		createEReference(gssConfigTestsEClass, GSS_CONFIG_TESTS__TEST_CASE);

		gssConfigTestCaseEClass = createEClass(GSS_CONFIG_TEST_CASE);
		createEAttribute(gssConfigTestCaseEClass, GSS_CONFIG_TEST_CASE__NAME);
		createEReference(gssConfigTestCaseEClass, GSS_CONFIG_TEST_CASE__PROCEDURE);
		createEAttribute(gssConfigTestCaseEClass, GSS_CONFIG_TEST_CASE__PREV_MSG);
		createEAttribute(gssConfigTestCaseEClass, GSS_CONFIG_TEST_CASE__PREV_ACTION);
		createEAttribute(gssConfigTestCaseEClass, GSS_CONFIG_TEST_CASE__PREV_ACTION_PARAM);
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
		scenarioPackage thescenarioPackage = (scenarioPackage)EPackage.Registry.INSTANCE.getEPackage(scenarioPackage.eNS_URI);
		test_procPackage thetest_procPackage = (test_procPackage)EPackage.Registry.INSTANCE.getEPackage(test_procPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssConfigGSSConfigEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssConfigGSSConfigEClass, GSSConfigGSSConfig.class, "GSSConfigGSSConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigGSSConfig_Scenario(), thescenarioPackage.getGSSScenarioScenario(), null, "scenario", null, 1, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSConfig_Tests(), this.getGSSConfigTests(), null, "Tests", null, 1, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigTestsEClass, GSSConfigTests.class, "GSSConfigTests", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigTests_TestCase(), this.getGSSConfigTestCase(), null, "TestCase", null, 1, 150, GSSConfigTests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigTestCaseEClass, GSSConfigTestCase.class, "GSSConfigTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigTestCase_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigTestCase_Procedure(), thetest_procPackage.getGSSTestProcTestProc(), null, "procedure", null, 1, 1, GSSConfigTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigTestCase_PrevMsg(), ecorePackage.getEString(), "prevMsg", null, 0, 1, GSSConfigTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigTestCase_PrevAction(), thetest_procPackage.getGSSTestProcPrevAction(), "prevAction", null, 0, 1, GSSConfigTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigTestCase_PrevActionParam(), ecorePackage.getEString(), "prevActionParam", null, 0, 1, GSSConfigTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //configPackageImpl
