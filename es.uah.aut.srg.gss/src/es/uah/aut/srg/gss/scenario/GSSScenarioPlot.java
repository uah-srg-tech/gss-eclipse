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

import es.uah.aut.srg.gss.charts.GSSChartsChart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPlot#getChartRef <em>Chart Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPlot()
 * @model
 * @generated
 */
public interface GSSScenarioPlot extends GSSScenarioMonitor {
	/**
	 * Returns the value of the '<em><b>Chart Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart Ref</em>' reference.
	 * @see #setChartRef(GSSChartsChart)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPlot_ChartRef()
	 * @model required="true"
	 * @generated
	 */
	GSSChartsChart getChartRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPlot#getChartRef <em>Chart Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart Ref</em>' reference.
	 * @see #getChartRef()
	 * @generated
	 */
	void setChartRef(GSSChartsChart value);

} // GSSScenarioPlot
