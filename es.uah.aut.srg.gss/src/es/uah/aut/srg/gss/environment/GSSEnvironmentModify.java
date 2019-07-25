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
 * A representation of the model object '<em><b>GSS Environment Modify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getValue <em>Value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getGVFiltered <em>GV Filtered</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getGVPeriodic <em>GV Periodic</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentModify()
 * @model
 * @generated
 */
public interface GSSEnvironmentModify extends EObject {
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentModify_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSEnvironmentModifyType)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentModify_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentModifyType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSEnvironmentModifyType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSEnvironmentModifyType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSEnvironmentModifyType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentModify_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentModify_GVFiltered()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentGVFiltered getGVFiltered();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getGVFiltered <em>GV Filtered</em>}' containment reference.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentModify_GVPeriodic()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentGVPeriodic getGVPeriodic();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getGVPeriodic <em>GV Periodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GV Periodic</em>' containment reference.
	 * @see #getGVPeriodic()
	 * @generated
	 */
	void setGVPeriodic(GSSEnvironmentGVPeriodic value);

} // GSSEnvironmentModify
