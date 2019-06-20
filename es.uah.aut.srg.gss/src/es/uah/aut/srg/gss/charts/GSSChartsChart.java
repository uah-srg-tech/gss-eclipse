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

import es.uah.aut.srg.gss.common.GSSModelObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Charts Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getY_units <em>Yunits</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getY_max <em>Ymax</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.charts.chartsPackage#getGSSChartsChart()
 * @model
 * @generated
 */
public interface GSSChartsChart extends GSSModelObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.gss.charts.chartsPackage#getGSSChartsChart_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Yunits</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.charts.GSSChartsYUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yunits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yunits</em>' attribute.
	 * @see es.uah.aut.srg.gss.charts.GSSChartsYUnits
	 * @see #isSetY_units()
	 * @see #unsetY_units()
	 * @see #setY_units(GSSChartsYUnits)
	 * @see es.uah.aut.srg.gss.charts.chartsPackage#getGSSChartsChart_Y_units()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSChartsYUnits getY_units();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getY_units <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yunits</em>' attribute.
	 * @see es.uah.aut.srg.gss.charts.GSSChartsYUnits
	 * @see #isSetY_units()
	 * @see #unsetY_units()
	 * @see #getY_units()
	 * @generated
	 */
	void setY_units(GSSChartsYUnits value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getY_units <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY_units()
	 * @see #getY_units()
	 * @see #setY_units(GSSChartsYUnits)
	 * @generated
	 */
	void unsetY_units();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getY_units <em>Yunits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Yunits</em>' attribute is set.
	 * @see #unsetY_units()
	 * @see #getY_units()
	 * @see #setY_units(GSSChartsYUnits)
	 * @generated
	 */
	boolean isSetY_units();

	/**
	 * Returns the value of the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ymax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ymax</em>' attribute.
	 * @see #setY_max(String)
	 * @see es.uah.aut.srg.gss.charts.chartsPackage#getGSSChartsChart_Y_max()
	 * @model required="true"
	 * @generated
	 */
	String getY_max();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getY_max <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ymax</em>' attribute.
	 * @see #getY_max()
	 * @generated
	 */
	void setY_max(String value);

} // GSSChartsChart
