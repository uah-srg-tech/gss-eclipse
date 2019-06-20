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

import es.uah.aut.srg.gss.charts.GSSChartsCharts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Monitors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getChartsFile <em>Charts File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getPlot <em>Plot</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getAlarmMsg <em>Alarm Msg</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getModify <em>Modify</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getAlarmVal <em>Alarm Val</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMonitors()
 * @model
 * @generated
 */
public interface GSSConfigMonitors extends EObject {
	/**
	 * Returns the value of the '<em><b>Plot</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.config.GSSConfigPlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plot</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMonitors_Plot()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSConfigPlot> getPlot();

	/**
	 * Returns the value of the '<em><b>Alarm Msg</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm Msg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Msg</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMonitors_AlarmMsg()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSConfigAlarmMsg> getAlarmMsg();

	/**
	 * Returns the value of the '<em><b>Modify</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.config.GSSConfigModify}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMonitors_Modify()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSConfigModify> getModify();

	/**
	 * Returns the value of the '<em><b>Alarm Val</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.config.GSSConfigAlarmVal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alarm Val</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm Val</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMonitors_AlarmVal()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSConfigAlarmVal> getAlarmVal();

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMonitors_ChartsFile()
	 * @model
	 * @generated
	 */
	GSSChartsCharts getChartsFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getChartsFile <em>Charts File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charts File</em>' reference.
	 * @see #getChartsFile()
	 * @generated
	 */
	void setChartsFile(GSSChartsCharts value);

} // GSSConfigMonitors
