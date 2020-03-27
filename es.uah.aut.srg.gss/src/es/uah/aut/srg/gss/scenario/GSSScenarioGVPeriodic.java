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
 * A representation of the model object '<em><b>GSS Scenario GV Periodic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic#getPeriod_value <em>Period value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic#getPeriod_unit <em>Period unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGVPeriodic()
 * @model
 * @generated
 */
public interface GSSScenarioGVPeriodic extends GSSScenarioGV {
	/**
	 * Returns the value of the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period value</em>' attribute.
	 * @see #setPeriod_value(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGVPeriodic_Period_value()
	 * @model required="true"
	 * @generated
	 */
	String getPeriod_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic#getPeriod_value <em>Period value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period value</em>' attribute.
	 * @see #getPeriod_value()
	 * @generated
	 */
	void setPeriod_value(String value);

	/**
	 * Returns the value of the '<em><b>Period unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @see #setPeriod_unit(GSSScenarioUnit)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGVPeriodic_Period_unit()
	 * @model required="true"
	 * @generated
	 */
	GSSScenarioUnit getPeriod_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic#getPeriod_unit <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @see #getPeriod_unit()
	 * @generated
	 */
	void setPeriod_unit(GSSScenarioUnit value);

} // GSSScenarioGVPeriodic
