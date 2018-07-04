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
package es.uah.aut.srg.gss.charts;

import es.uah.aut.srg.gss.common.GSSModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Charts Charts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.charts.GSSChartsCharts#getChart <em>Chart</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.charts.chartsPackage#getGSSChartsCharts()
 * @model
 * @generated
 */
public interface GSSChartsCharts extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Chart</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.charts.GSSChartsChart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.charts.chartsPackage#getGSSChartsCharts_Chart()
	 * @model containment="true" required="true" upper="5"
	 * @generated
	 */
	EList<GSSChartsChart> getChart();

} // GSSChartsCharts
