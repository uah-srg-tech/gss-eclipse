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
 * A representation of the model object '<em><b>GSS Scenario Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getTest_campaign <em>Test campaign</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getVersion <em>Version</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getDate <em>Date</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getVersion_control_url <em>Version control url</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInfo()
 * @model
 * @generated
 */
public interface GSSScenarioInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Test campaign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test campaign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test campaign</em>' attribute.
	 * @see #setTest_campaign(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInfo_Test_campaign()
	 * @model required="true"
	 * @generated
	 */
	String getTest_campaign();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getTest_campaign <em>Test campaign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test campaign</em>' attribute.
	 * @see #getTest_campaign()
	 * @generated
	 */
	void setTest_campaign(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInfo_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInfo_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Version control url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version control url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version control url</em>' attribute.
	 * @see #setVersion_control_url(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInfo_Version_control_url()
	 * @model
	 * @generated
	 */
	String getVersion_control_url();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getVersion_control_url <em>Version control url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version control url</em>' attribute.
	 * @see #getVersion_control_url()
	 * @generated
	 */
	void setVersion_control_url(String value);

} // GSSScenarioInfo
