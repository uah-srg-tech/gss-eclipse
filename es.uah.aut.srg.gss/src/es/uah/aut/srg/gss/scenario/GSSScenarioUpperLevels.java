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
 * A representation of the model object '<em><b>GSS Scenario Upper Levels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels#getUpperLevel <em>Upper Level</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioUpperLevels()
 * @model
 * @generated
 */
public interface GSSScenarioUpperLevels extends EObject {
	/**
	 * Returns the value of the '<em><b>Upper Level</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Level</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioUpperLevels_UpperLevel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GSSScenarioUpperLevel> getUpperLevel();

} // GSSScenarioUpperLevels
