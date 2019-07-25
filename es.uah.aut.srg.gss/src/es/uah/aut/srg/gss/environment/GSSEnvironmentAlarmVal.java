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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment Alarm Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getGVFiltered <em>GV Filtered</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getGVPeriodic <em>GV Periodic</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentAlarmVal()
 * @model
 * @generated
 */
public interface GSSEnvironmentAlarmVal extends EObject {
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentAlarmVal_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSEnvironmentAlarmValType)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentAlarmVal_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentAlarmValType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSEnvironmentAlarmValType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSEnvironmentAlarmValType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSEnvironmentAlarmValType)
	 * @generated
	 */
	boolean isSetType();

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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentAlarmVal_GVFiltered()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentGVFiltered getGVFiltered();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getGVFiltered <em>GV Filtered</em>}' containment reference.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentAlarmVal_GVPeriodic()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentGVPeriodic getGVPeriodic();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getGVPeriodic <em>GV Periodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GV Periodic</em>' containment reference.
	 * @see #getGVPeriodic()
	 * @generated
	 */
	void setGVPeriodic(GSSEnvironmentGVPeriodic value);

} // GSSEnvironmentAlarmVal
