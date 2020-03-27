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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Reference Periodic TC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC#getIdRef <em>Id Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioReferencePeriodicTC()
 * @model
 * @generated
 */
public interface GSSScenarioReferencePeriodicTC extends GSSScenarioReference {
	/**
	 * Returns the value of the '<em><b>Id Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Ref</em>' reference.
	 * @see #setIdRef(GSSScenarioPeriodicTC)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioReferencePeriodicTC_IdRef()
	 * @model required="true"
	 * @generated
	 */
	GSSScenarioPeriodicTC getIdRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC#getIdRef <em>Id Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' reference.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(GSSScenarioPeriodicTC value);

} // GSSScenarioReferencePeriodicTC
