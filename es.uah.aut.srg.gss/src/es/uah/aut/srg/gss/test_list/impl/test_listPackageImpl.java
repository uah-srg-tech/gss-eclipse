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
package es.uah.aut.srg.gss.test_list.impl;

import es.uah.aut.srg.gss.test_list.GSSTestListPrevAction;
import es.uah.aut.srg.gss.test_list.GSSTestListTestCase;
import es.uah.aut.srg.gss.test_list.GSSTestListTestList;
import es.uah.aut.srg.gss.test_list.test_listFactory;
import es.uah.aut.srg.gss.test_list.test_listPackage;

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
public class test_listPackageImpl extends EPackageImpl implements test_listPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestListTestListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestListTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTestListPrevActionEEnum = null;

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
	 * @see es.uah.aut.srg.gss.test_list.test_listPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private test_listPackageImpl() {
		super(eNS_URI, test_listFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link test_listPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static test_listPackage init() {
		if (isInited) return (test_listPackage)EPackage.Registry.INSTANCE.getEPackage(test_listPackage.eNS_URI);

		// Obtain or create and register package
		test_listPackageImpl thetest_listPackage = (test_listPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof test_listPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new test_listPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		test_procPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetest_listPackage.createPackageContents();

		// Initialize created meta-data
		thetest_listPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetest_listPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(test_listPackage.eNS_URI, thetest_listPackage);
		return thetest_listPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestListTestList() {
		return gssTestListTestListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestListTestList_TestCase() {
		return (EReference)gssTestListTestListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestListTestCase() {
		return gssTestListTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestListTestCase_Name() {
		return (EAttribute)gssTestListTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestListTestCase_Procedure() {
		return (EReference)gssTestListTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestListTestCase_PrevMsg() {
		return (EAttribute)gssTestListTestCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestListTestCase_PrevAction() {
		return (EAttribute)gssTestListTestCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestListTestCase_PrevActionParam() {
		return (EAttribute)gssTestListTestCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTestListPrevAction() {
		return gssTestListPrevActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_listFactory gettest_listFactory() {
		return (test_listFactory)getEFactoryInstance();
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
		gssTestListTestListEClass = createEClass(GSS_TEST_LIST_TEST_LIST);
		createEReference(gssTestListTestListEClass, GSS_TEST_LIST_TEST_LIST__TEST_CASE);

		gssTestListTestCaseEClass = createEClass(GSS_TEST_LIST_TEST_CASE);
		createEAttribute(gssTestListTestCaseEClass, GSS_TEST_LIST_TEST_CASE__NAME);
		createEReference(gssTestListTestCaseEClass, GSS_TEST_LIST_TEST_CASE__PROCEDURE);
		createEAttribute(gssTestListTestCaseEClass, GSS_TEST_LIST_TEST_CASE__PREV_MSG);
		createEAttribute(gssTestListTestCaseEClass, GSS_TEST_LIST_TEST_CASE__PREV_ACTION);
		createEAttribute(gssTestListTestCaseEClass, GSS_TEST_LIST_TEST_CASE__PREV_ACTION_PARAM);

		// Create enums
		gssTestListPrevActionEEnum = createEEnum(GSS_TEST_LIST_PREV_ACTION);
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
		initEClass(gssTestListTestListEClass, GSSTestListTestList.class, "GSSTestListTestList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestListTestList_TestCase(), this.getGSSTestListTestCase(), null, "TestCase", null, 1, 150, GSSTestListTestList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestListTestCaseEClass, GSSTestListTestCase.class, "GSSTestListTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestListTestCase_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestListTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestListTestCase_Procedure(), thetest_procPackage.getGSSTestProcTestProc(), null, "procedure", null, 1, 1, GSSTestListTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestListTestCase_PrevMsg(), ecorePackage.getEString(), "prevMsg", null, 0, 1, GSSTestListTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestListTestCase_PrevAction(), this.getGSSTestListPrevAction(), "prevAction", null, 0, 1, GSSTestListTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestListTestCase_PrevActionParam(), ecorePackage.getEString(), "prevActionParam", null, 0, 1, GSSTestListTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssTestListPrevActionEEnum, GSSTestListPrevAction.class, "GSSTestListPrevAction");
		addEEnumLiteral(gssTestListPrevActionEEnum, GSSTestListPrevAction.NONE);
		addEEnumLiteral(gssTestListPrevActionEEnum, GSSTestListPrevAction.RESET);

		// Create resource
		createResource(eNS_URI);
	}

} //test_listPackageImpl
