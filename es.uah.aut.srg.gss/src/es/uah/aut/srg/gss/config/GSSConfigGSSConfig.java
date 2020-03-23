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
package es.uah.aut.srg.gss.config;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.scenario.GSSScenarioScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config GSS Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getScenario <em>Scenario</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig()
 * @model
 * @generated
 */
public interface GSSConfigGSSConfig extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference.
	 * @see #setScenario(GSSScenarioScenario)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_Scenario()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSScenarioScenario getScenario();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getScenario <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' containment reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(GSSScenarioScenario value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference.
	 * @see #setTests(GSSConfigTests)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_Tests()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigTests getTests();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getTests <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests</em>' containment reference.
	 * @see #getTests()
	 * @generated
	 */
	void setTests(GSSConfigTests value);

} // GSSConfigGSSConfig
