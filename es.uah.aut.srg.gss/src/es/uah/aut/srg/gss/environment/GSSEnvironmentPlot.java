/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.environment;

import es.uah.aut.srg.gss.charts.GSSChartsChart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getChartRef <em>Chart Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getGVFiltered <em>GV Filtered</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getGVPeriodic <em>GV Periodic</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentPlot()
 * @model
 * @generated
 */
public interface GSSEnvironmentPlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentPlot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentPlot_ChartRef()
	 * @model required="true"
	 * @generated
	 */
	GSSChartsChart getChartRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getChartRef <em>Chart Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart Ref</em>' reference.
	 * @see #getChartRef()
	 * @generated
	 */
	void setChartRef(GSSChartsChart value);

	/**
	 * Returns the value of the '<em><b>GV Filtered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GV Filtered</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GV Filtered</em>' containment reference.
	 * @see #setGVFiltered(GSSEnvironmentGVFiltered)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentPlot_GVFiltered()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentGVFiltered getGVFiltered();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getGVFiltered <em>GV Filtered</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GV Filtered</em>' containment reference.
	 * @see #getGVFiltered()
	 * @generated
	 */
	void setGVFiltered(GSSEnvironmentGVFiltered value);

	/**
	 * Returns the value of the '<em><b>GV Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GV Periodic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GV Periodic</em>' containment reference.
	 * @see #setGVPeriodic(GSSEnvironmentGVPeriodic)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentPlot_GVPeriodic()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentGVPeriodic getGVPeriodic();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getGVPeriodic <em>GV Periodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GV Periodic</em>' containment reference.
	 * @see #getGVPeriodic()
	 * @generated
	 */
	void setGVPeriodic(GSSEnvironmentGVPeriodic value);

} // GSSEnvironmentPlot
