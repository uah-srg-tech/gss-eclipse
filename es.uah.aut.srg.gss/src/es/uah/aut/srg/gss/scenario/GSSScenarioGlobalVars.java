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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Global Vars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars#getGlobalVar <em>Global Var</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVars()
 * @model
 * @generated
 */
public interface GSSScenarioGlobalVars extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Var</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Var</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVars_GlobalVar()
	 * @model containment="true" required="true" upper="10"
	 * @generated
	 */
	EList<GSSScenarioGlobalVar> getGlobalVar();

} // GSSScenarioGlobalVars
