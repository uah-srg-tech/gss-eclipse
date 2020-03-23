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

import es.uah.aut.srg.gss.charts.GSSChartsCharts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Monitors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getChartsFile <em>Charts File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getPlot <em>Plot</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getAlarmMsg <em>Alarm Msg</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getModify <em>Modify</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getAlarmVal <em>Alarm Val</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioMonitors()
 * @model
 * @generated
 */
public interface GSSScenarioMonitors extends EObject {
	/**
	 * Returns the value of the '<em><b>Charts File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charts File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charts File</em>' reference.
	 * @see #setChartsFile(GSSChartsCharts)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioMonitors_ChartsFile()
	 * @model
	 * @generated
	 */
	GSSChartsCharts getChartsFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getChartsFile <em>Charts File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charts File</em>' reference.
	 * @see #getChartsFile()
	 * @generated
	 */
	void setChartsFile(GSSChartsCharts value);

	/**
	 * Returns the value of the '<em><b>Plot</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioPlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioMonitors_Plot()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSScenarioPlot> getPlot();

	/**
	 * Returns the value of the '<em><b>Alarm Msg</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm Msg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Msg</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioMonitors_AlarmMsg()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSScenarioAlarmMsg> getAlarmMsg();

	/**
	 * Returns the value of the '<em><b>Modify</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioModify}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioMonitors_Modify()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSScenarioModify> getModify();

	/**
	 * Returns the value of the '<em><b>Alarm Val</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm Val</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Val</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioMonitors_AlarmVal()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSScenarioAlarmVal> getAlarmVal();

} // GSSScenarioMonitors
