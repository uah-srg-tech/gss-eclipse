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
 * A representation of the model object '<em><b>GSS Scenario Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_value <em>Min value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_unit <em>Min unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_value <em>Max value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_unit <em>Max unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPeriod()
 * @model
 * @generated
 */
public interface GSSScenarioPeriod extends EObject {
	/**
	 * Returns the value of the '<em><b>Min value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min value</em>' attribute.
	 * @see #setMin_value(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPeriod_Min_value()
	 * @model required="true"
	 * @generated
	 */
	String getMin_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_value <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min value</em>' attribute.
	 * @see #getMin_value()
	 * @generated
	 */
	void setMin_value(String value);

	/**
	 * Returns the value of the '<em><b>Min unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @see #isSetMin_unit()
	 * @see #unsetMin_unit()
	 * @see #setMin_unit(GSSScenarioUnit)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPeriod_Min_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioUnit getMin_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_unit <em>Min unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @see #isSetMin_unit()
	 * @see #unsetMin_unit()
	 * @see #getMin_unit()
	 * @generated
	 */
	void setMin_unit(GSSScenarioUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_unit <em>Min unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin_unit()
	 * @see #getMin_unit()
	 * @see #setMin_unit(GSSScenarioUnit)
	 * @generated
	 */
	void unsetMin_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_unit <em>Min unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min unit</em>' attribute is set.
	 * @see #unsetMin_unit()
	 * @see #getMin_unit()
	 * @see #setMin_unit(GSSScenarioUnit)
	 * @generated
	 */
	boolean isSetMin_unit();

	/**
	 * Returns the value of the '<em><b>Max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max value</em>' attribute.
	 * @see #setMax_value(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPeriod_Max_value()
	 * @model required="true"
	 * @generated
	 */
	String getMax_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_value <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max value</em>' attribute.
	 * @see #getMax_value()
	 * @generated
	 */
	void setMax_value(String value);

	/**
	 * Returns the value of the '<em><b>Max unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @see #isSetMax_unit()
	 * @see #unsetMax_unit()
	 * @see #setMax_unit(GSSScenarioUnit)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPeriod_Max_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioUnit getMax_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_unit <em>Max unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @see #isSetMax_unit()
	 * @see #unsetMax_unit()
	 * @see #getMax_unit()
	 * @generated
	 */
	void setMax_unit(GSSScenarioUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_unit <em>Max unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax_unit()
	 * @see #getMax_unit()
	 * @see #setMax_unit(GSSScenarioUnit)
	 * @generated
	 */
	void unsetMax_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_unit <em>Max unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max unit</em>' attribute is set.
	 * @see #unsetMax_unit()
	 * @see #getMax_unit()
	 * @see #setMax_unit(GSSScenarioUnit)
	 * @generated
	 */
	boolean isSetMax_unit();

} // GSSScenarioPeriod
