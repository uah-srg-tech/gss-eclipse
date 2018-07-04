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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMin_value <em>Min value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMin_unit <em>Min unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMax_value <em>Max value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMax_unit <em>Max unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriod()
 * @model
 * @generated
 */
public interface GSSConfigPeriod extends EObject {
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriod_Min_value()
	 * @model required="true"
	 * @generated
	 */
	String getMin_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMin_value <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min value</em>' attribute.
	 * @see #getMin_value()
	 * @generated
	 */
	void setMin_value(String value);

	/**
	 * Returns the value of the '<em><b>Min unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUnit
	 * @see #setMin_unit(GSSConfigUnit)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriod_Min_unit()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigUnit getMin_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMin_unit <em>Min unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUnit
	 * @see #getMin_unit()
	 * @generated
	 */
	void setMin_unit(GSSConfigUnit value);

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriod_Max_value()
	 * @model required="true"
	 * @generated
	 */
	String getMax_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMax_value <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max value</em>' attribute.
	 * @see #getMax_value()
	 * @generated
	 */
	void setMax_value(String value);

	/**
	 * Returns the value of the '<em><b>Max unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUnit
	 * @see #setMax_unit(GSSConfigUnit)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriod_Max_unit()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigUnit getMax_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMax_unit <em>Max unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUnit
	 * @see #getMax_unit()
	 * @generated
	 */
	void setMax_unit(GSSConfigUnit value);

} // GSSConfigPeriod
