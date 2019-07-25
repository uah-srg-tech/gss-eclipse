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
package es.uah.aut.srg.gss.config;

import es.uah.aut.srg.gss.common.GSSModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigConfig#getScenario <em>Scenario</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigConfig#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigConfig()
 * @model
 * @generated
 */
public interface GSSConfigConfig extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference.
	 * @see #setScenario(es.uah.aut.srg.gss.environment.GSSEnvironmentScenario)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigConfig_Scenario()
	 * @model required="true"
	 * @generated
	 */
	es.uah.aut.srg.gss.environment.GSSEnvironmentScenario getScenario();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigConfig#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(es.uah.aut.srg.gss.environment.GSSEnvironmentScenario value);

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigConfig_Tests()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigTests getTests();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigConfig#getTests <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests</em>' containment reference.
	 * @see #getTests()
	 * @generated
	 */
	void setTests(GSSConfigTests value);

} // GSSConfigConfig
