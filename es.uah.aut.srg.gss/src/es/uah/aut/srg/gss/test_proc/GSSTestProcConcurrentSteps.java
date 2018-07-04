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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Concurrent Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps#getConcurrent_step <em>Concurrent step</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcConcurrentSteps()
 * @model
 * @generated
 */
public interface GSSTestProcConcurrentSteps extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step</em>' containment reference.
	 * @see #setNextStep(GSSTestProcNextStep)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcConcurrentSteps_NextStep()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcNextStep getNextStep();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps#getNextStep <em>Next Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step</em>' containment reference.
	 * @see #getNextStep()
	 * @generated
	 */
	void setNextStep(GSSTestProcNextStep value);

	/**
	 * Returns the value of the '<em><b>Concurrent step</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent step</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcConcurrentSteps_Concurrent_step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GSSTestProcConcurrentStep> getConcurrent_step();

} // GSSTestProcConcurrentSteps
