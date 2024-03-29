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
 * A representation of the model object '<em><b>GSS Scenario Interval Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getMin <em>Min</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getMax <em>Max</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_value <em>Interval value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_unit <em>Interval unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioIntervalRange()
 * @model
 * @generated
 */
public interface GSSScenarioIntervalRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioIntervalRange_Min()
	 * @model required="true"
	 * @generated
	 */
	String getMin();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(String value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioIntervalRange_Max()
	 * @model required="true"
	 * @generated
	 */
	String getMax();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(String value);

	/**
	 * Returns the value of the '<em><b>Interval value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval value</em>' attribute.
	 * @see #setInterval_value(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioIntervalRange_Interval_value()
	 * @model required="true"
	 * @generated
	 */
	String getInterval_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_value <em>Interval value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval value</em>' attribute.
	 * @see #getInterval_value()
	 * @generated
	 */
	void setInterval_value(String value);

	/**
	 * Returns the value of the '<em><b>Interval unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @see #isSetInterval_unit()
	 * @see #unsetInterval_unit()
	 * @see #setInterval_unit(GSSScenarioUnit)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioIntervalRange_Interval_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioUnit getInterval_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_unit <em>Interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @see #isSetInterval_unit()
	 * @see #unsetInterval_unit()
	 * @see #getInterval_unit()
	 * @generated
	 */
	void setInterval_unit(GSSScenarioUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_unit <em>Interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterval_unit()
	 * @see #getInterval_unit()
	 * @see #setInterval_unit(GSSScenarioUnit)
	 * @generated
	 */
	void unsetInterval_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_unit <em>Interval unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interval unit</em>' attribute is set.
	 * @see #unsetInterval_unit()
	 * @see #getInterval_unit()
	 * @see #setInterval_unit(GSSScenarioUnit)
	 * @generated
	 */
	boolean isSetInterval_unit();

} // GSSScenarioIntervalRange
