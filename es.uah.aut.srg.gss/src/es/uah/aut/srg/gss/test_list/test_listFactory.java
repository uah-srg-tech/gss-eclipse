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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.test_list.test_listPackage
 * @generated
 */
public interface test_listFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	test_listFactory eINSTANCE = es.uah.aut.srg.gss.test_list.impl.test_listFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Test List Test List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Test List Test List</em>'.
	 * @generated
	 */
	GSSTestListTestList createGSSTestListTestList();

	/**
	 * Returns a new object of class '<em>GSS Test List Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Test List Test Case</em>'.
	 * @generated
	 */
	GSSTestListTestCase createGSSTestListTestCase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	test_listPackage gettest_listPackage();

} //test_listFactory
