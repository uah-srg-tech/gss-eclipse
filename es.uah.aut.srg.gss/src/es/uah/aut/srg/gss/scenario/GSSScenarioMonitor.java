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
package es.uah.aut.srg.gss.scenario;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitor#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitor#getGVRef <em>GV Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioMonitor()
 * @model abstract="true"
 * @generated
 */
public interface GSSScenarioMonitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioMonitor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>GV Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GV Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GV Ref</em>' containment reference.
	 * @see #setGVRef(GSSScenarioGVRef)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioMonitor_GVRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSScenarioGVRef getGVRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitor#getGVRef <em>GV Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GV Ref</em>' containment reference.
	 * @see #getGVRef()
	 * @generated
	 */
	void setGVRef(GSSScenarioGVRef value);

} // GSSScenarioMonitor
