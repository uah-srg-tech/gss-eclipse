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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test List Test List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_list.GSSTestListTestList#getTestCase <em>Test Case</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_list.test_listPackage#getGSSTestListTestList()
 * @model
 * @generated
 */
public interface GSSTestListTestList extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Case</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_list.GSSTestListTestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Case</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_list.test_listPackage#getGSSTestListTestList_TestCase()
	 * @model containment="true" required="true" upper="150"
	 * @generated
	 */
	EList<GSSTestListTestCase> getTestCase();

} // GSSTestListTestList
