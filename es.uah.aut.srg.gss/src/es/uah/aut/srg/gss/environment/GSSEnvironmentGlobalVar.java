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
 * A representation of the model object '<em><b>GSS Environment Global Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getInitial_value <em>Initial value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferenceField <em>Reference Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferencePeriodicTC <em>Reference Periodic TC</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferenceSpecialPacket <em>Reference Special Packet</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGlobalVar()
 * @model
 * @generated
 */
public interface GSSEnvironmentGlobalVar extends EObject {
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGlobalVar_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getName <em>Name</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGlobalVar_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSEnvironmentGlobalVarType)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGlobalVar_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentGlobalVarType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSEnvironmentGlobalVarType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSEnvironmentGlobalVarType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSEnvironmentGlobalVarType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Initial value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial value</em>' attribute.
	 * @see #setInitial_value(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGlobalVar_Initial_value()
	 * @model required="true"
	 * @generated
	 */
	String getInitial_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getInitial_value <em>Initial value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial value</em>' attribute.
	 * @see #getInitial_value()
	 * @generated
	 */
	void setInitial_value(String value);

	/**
	 * Returns the value of the '<em><b>Reference Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Field</em>' containment reference.
	 * @see #setReferenceField(GSSEnvironmentReferenceField)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGlobalVar_ReferenceField()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentReferenceField getReferenceField();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferenceField <em>Reference Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Field</em>' containment reference.
	 * @see #getReferenceField()
	 * @generated
	 */
	void setReferenceField(GSSEnvironmentReferenceField value);

	/**
	 * Returns the value of the '<em><b>Reference Periodic TC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Periodic TC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Periodic TC</em>' containment reference.
	 * @see #setReferencePeriodicTC(GSSEnvironmentReferencePeriodicTC)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGlobalVar_ReferencePeriodicTC()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentReferencePeriodicTC getReferencePeriodicTC();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferencePeriodicTC <em>Reference Periodic TC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Periodic TC</em>' containment reference.
	 * @see #getReferencePeriodicTC()
	 * @generated
	 */
	void setReferencePeriodicTC(GSSEnvironmentReferencePeriodicTC value);

	/**
	 * Returns the value of the '<em><b>Reference Special Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Special Packet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Special Packet</em>' containment reference.
	 * @see #setReferenceSpecialPacket(GSSEnvironmentReferenceSpecialPacket)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGlobalVar_ReferenceSpecialPacket()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentReferenceSpecialPacket getReferenceSpecialPacket();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferenceSpecialPacket <em>Reference Special Packet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Special Packet</em>' containment reference.
	 * @see #getReferenceSpecialPacket()
	 * @generated
	 */
	void setReferenceSpecialPacket(GSSEnvironmentReferenceSpecialPacket value);

} // GSSEnvironmentGlobalVar
