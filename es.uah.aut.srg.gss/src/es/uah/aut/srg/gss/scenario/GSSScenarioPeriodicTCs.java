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
 * A representation of the model object '<em><b>GSS Scenario Periodic TCs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs#getPeriodicTC_level_2 <em>Periodic TC level 2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs#getPeriodicTC_level_1 <em>Periodic TC level 1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs#getPeriodicTC_level_0 <em>Periodic TC level 0</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPeriodicTCs()
 * @model
 * @generated
 */
public interface GSSScenarioPeriodicTCs extends EObject {
	/**
	 * Returns the value of the '<em><b>Periodic TC level 2</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodic TC level 2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic TC level 2</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPeriodicTCs_PeriodicTC_level_2()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSScenarioPeriodicTCLevel2> getPeriodicTC_level_2();

	/**
	 * Returns the value of the '<em><b>Periodic TC level 1</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodic TC level 1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic TC level 1</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPeriodicTCs_PeriodicTC_level_1()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSScenarioPeriodicTCLevel1> getPeriodicTC_level_1();

	/**
	 * Returns the value of the '<em><b>Periodic TC level 0</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodic TC level 0</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic TC level 0</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPeriodicTCs_PeriodicTC_level_0()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSScenarioPeriodicTCLevel0> getPeriodicTC_level_0();

} // GSSScenarioPeriodicTCs
