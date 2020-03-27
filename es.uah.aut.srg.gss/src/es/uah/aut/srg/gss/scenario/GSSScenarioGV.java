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
 * A representation of the model object '<em><b>GSS Scenario GV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGV#getGlobalVarRef <em>Global Var Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGV()
 * @model abstract="true"
 * @generated
 */
public interface GSSScenarioGV extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Var Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Var Ref</em>' reference.
	 * @see #setGlobalVarRef(GSSScenarioGlobalVar)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGV_GlobalVarRef()
	 * @model required="true"
	 * @generated
	 */
	GSSScenarioGlobalVar getGlobalVarRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGV#getGlobalVarRef <em>Global Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Var Ref</em>' reference.
	 * @see #getGlobalVarRef()
	 * @generated
	 */
	void setGlobalVarRef(GSSScenarioGlobalVar value);

} // GSSScenarioGV
