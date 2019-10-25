/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.test_proc;

import es.uah.aut.srg.gss.common.GSSModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Test Proc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc#getStep <em>Step</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc#getScenarioId <em>Scenario Id</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcTestProc()
 * @model
 * @generated
 */
public interface GSSTestProcTestProc extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcTestProc_Step()
	 * @model containment="true" required="true" upper="1900"
	 * @generated
	 */
	EList<GSSTestProcStep> getStep();

	/**
	 * Returns the value of the '<em><b>Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Id</em>' attribute.
	 * @see #setScenarioId(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcTestProc_ScenarioId()
	 * @model
	 * @generated
	 */
	String getScenarioId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc#getScenarioId <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Id</em>' attribute.
	 * @see #getScenarioId()
	 * @generated
	 */
	void setScenarioId(String value);

} // GSSTestProcTestProc
