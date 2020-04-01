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
package es.uah.aut.srg.gss.test_list;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.test_list.test_listFactory
 * @model kind="package"
 * @generated
 */
public interface test_listPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test_list";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/test_list";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	test_listPackage eINSTANCE = es.uah.aut.srg.gss.test_list.impl.test_listPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestListImpl <em>GSS Test List Test List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_list.impl.GSSTestListTestListImpl
	 * @see es.uah.aut.srg.gss.test_list.impl.test_listPackageImpl#getGSSTestListTestList()
	 * @generated
	 */
	int GSS_TEST_LIST_TEST_LIST = 0;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_LIST__TEST_CASE = 0;

	/**
	 * The number of structural features of the '<em>GSS Test List Test List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Test List Test List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestCaseImpl <em>GSS Test List Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_list.impl.GSSTestListTestCaseImpl
	 * @see es.uah.aut.srg.gss.test_list.impl.test_listPackageImpl#getGSSTestListTestCase()
	 * @generated
	 */
	int GSS_TEST_LIST_TEST_CASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_CASE__PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Prev Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_CASE__PREV_MSG = 2;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_CASE__PREV_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Prev Action Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_CASE__PREV_ACTION_PARAM = 4;

	/**
	 * The number of structural features of the '<em>GSS Test List Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_CASE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Test List Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_TEST_LIST_TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.test_list.GSSTestListPrevAction <em>GSS Test List Prev Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListPrevAction
	 * @see es.uah.aut.srg.gss.test_list.impl.test_listPackageImpl#getGSSTestListPrevAction()
	 * @generated
	 */
	int GSS_TEST_LIST_PREV_ACTION = 2;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_list.GSSTestListTestList <em>GSS Test List Test List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test List Test List</em>'.
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListTestList
	 * @generated
	 */
	EClass getGSSTestListTestList();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.test_list.GSSTestListTestList#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Case</em>'.
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListTestList#getTestCase()
	 * @see #getGSSTestListTestList()
	 * @generated
	 */
	EReference getGSSTestListTestList_TestCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.test_list.GSSTestListTestCase <em>GSS Test List Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Test List Test Case</em>'.
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListTestCase
	 * @generated
	 */
	EClass getGSSTestListTestCase();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getName()
	 * @see #getGSSTestListTestCase()
	 * @generated
	 */
	EAttribute getGSSTestListTestCase_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedure</em>'.
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getProcedure()
	 * @see #getGSSTestListTestCase()
	 * @generated
	 */
	EReference getGSSTestListTestCase_Procedure();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getPrevMsg <em>Prev Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Msg</em>'.
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getPrevMsg()
	 * @see #getGSSTestListTestCase()
	 * @generated
	 */
	EAttribute getGSSTestListTestCase_PrevMsg();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getPrevAction <em>Prev Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Action</em>'.
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getPrevAction()
	 * @see #getGSSTestListTestCase()
	 * @generated
	 */
	EAttribute getGSSTestListTestCase_PrevAction();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getPrevActionParam <em>Prev Action Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Action Param</em>'.
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListTestCase#getPrevActionParam()
	 * @see #getGSSTestListTestCase()
	 * @generated
	 */
	EAttribute getGSSTestListTestCase_PrevActionParam();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.test_list.GSSTestListPrevAction <em>GSS Test List Prev Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Test List Prev Action</em>'.
	 * @see es.uah.aut.srg.gss.test_list.GSSTestListPrevAction
	 * @generated
	 */
	EEnum getGSSTestListPrevAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	test_listFactory gettest_listFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestListImpl <em>GSS Test List Test List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_list.impl.GSSTestListTestListImpl
		 * @see es.uah.aut.srg.gss.test_list.impl.test_listPackageImpl#getGSSTestListTestList()
		 * @generated
		 */
		EClass GSS_TEST_LIST_TEST_LIST = eINSTANCE.getGSSTestListTestList();

		/**
		 * The meta object literal for the '<em><b>Test Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_LIST_TEST_LIST__TEST_CASE = eINSTANCE.getGSSTestListTestList_TestCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestCaseImpl <em>GSS Test List Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_list.impl.GSSTestListTestCaseImpl
		 * @see es.uah.aut.srg.gss.test_list.impl.test_listPackageImpl#getGSSTestListTestCase()
		 * @generated
		 */
		EClass GSS_TEST_LIST_TEST_CASE = eINSTANCE.getGSSTestListTestCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_LIST_TEST_CASE__NAME = eINSTANCE.getGSSTestListTestCase_Name();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_TEST_LIST_TEST_CASE__PROCEDURE = eINSTANCE.getGSSTestListTestCase_Procedure();

		/**
		 * The meta object literal for the '<em><b>Prev Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_LIST_TEST_CASE__PREV_MSG = eINSTANCE.getGSSTestListTestCase_PrevMsg();

		/**
		 * The meta object literal for the '<em><b>Prev Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_LIST_TEST_CASE__PREV_ACTION = eINSTANCE.getGSSTestListTestCase_PrevAction();

		/**
		 * The meta object literal for the '<em><b>Prev Action Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_TEST_LIST_TEST_CASE__PREV_ACTION_PARAM = eINSTANCE.getGSSTestListTestCase_PrevActionParam();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.test_list.GSSTestListPrevAction <em>GSS Test List Prev Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.test_list.GSSTestListPrevAction
		 * @see es.uah.aut.srg.gss.test_list.impl.test_listPackageImpl#getGSSTestListPrevAction()
		 * @generated
		 */
		EEnum GSS_TEST_LIST_PREV_ACTION = eINSTANCE.getGSSTestListPrevAction();

	}

} //test_listPackage
