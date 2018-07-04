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
 * A representation of the model object '<em><b>GSS Config Periodic TC Level0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getPeriod_value <em>Period value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getPeriod_unit <em>Period unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getApp_to_level0 <em>App to level0</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriodicTCLevel0()
 * @model
 * @generated
 */
public interface GSSConfigPeriodicTCLevel0 extends EObject {
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriodicTCLevel0_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriodicTCLevel0_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Ref</em>' attribute.
	 * @see #setIfRef(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriodicTCLevel0_IfRef()
	 * @model required="true"
	 * @generated
	 */
	String getIfRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getIfRef <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Ref</em>' attribute.
	 * @see #getIfRef()
	 * @generated
	 */
	void setIfRef(String value);

	/**
	 * Returns the value of the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period value</em>' attribute.
	 * @see #setPeriod_value(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriodicTCLevel0_Period_value()
	 * @model required="true"
	 * @generated
	 */
	String getPeriod_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getPeriod_value <em>Period value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period value</em>' attribute.
	 * @see #getPeriod_value()
	 * @generated
	 */
	void setPeriod_value(String value);

	/**
	 * Returns the value of the '<em><b>Period unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUnit
	 * @see #setPeriod_unit(GSSConfigUnit)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriodicTCLevel0_Period_unit()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigUnit getPeriod_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getPeriod_unit <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUnit
	 * @see #getPeriod_unit()
	 * @generated
	 */
	void setPeriod_unit(GSSConfigUnit value);

	/**
	 * Returns the value of the '<em><b>Level0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level0</em>' containment reference.
	 * @see #setLevel0(GSSConfigLevel0)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriodicTCLevel0_Level0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigLevel0 getLevel0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getLevel0 <em>Level0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0</em>' containment reference.
	 * @see #getLevel0()
	 * @generated
	 */
	void setLevel0(GSSConfigLevel0 value);

	/**
	 * Returns the value of the '<em><b>App to level0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App to level0</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App to level0</em>' containment reference.
	 * @see #setApp_to_level0(GSSConfigAppToLevel0)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPeriodicTCLevel0_App_to_level0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigAppToLevel0 getApp_to_level0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getApp_to_level0 <em>App to level0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App to level0</em>' containment reference.
	 * @see #getApp_to_level0()
	 * @generated
	 */
	void setApp_to_level0(GSSConfigAppToLevel0 value);

} // GSSConfigPeriodicTCLevel0
