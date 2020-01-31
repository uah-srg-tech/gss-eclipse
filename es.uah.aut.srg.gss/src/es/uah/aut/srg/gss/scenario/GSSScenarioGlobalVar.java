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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Global Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getInitial_value <em>Initial value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getReferenceField <em>Reference Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getReferencePeriodicTC <em>Reference Periodic TC</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getReferenceSpecialPacket <em>Reference Special Packet</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVar()
 * @model
 * @generated
 */
public interface GSSScenarioGlobalVar extends EObject {
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
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVar_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getName <em>Name</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVar_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSScenarioGlobalVarType)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVar_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioGlobalVarType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSScenarioGlobalVarType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSScenarioGlobalVarType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSScenarioGlobalVarType)
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
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVar_Initial_value()
	 * @model required="true"
	 * @generated
	 */
	String getInitial_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getInitial_value <em>Initial value</em>}' attribute.
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
	 * @see #setReferenceField(GSSScenarioReferenceField)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVar_ReferenceField()
	 * @model containment="true"
	 * @generated
	 */
	GSSScenarioReferenceField getReferenceField();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getReferenceField <em>Reference Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Field</em>' containment reference.
	 * @see #getReferenceField()
	 * @generated
	 */
	void setReferenceField(GSSScenarioReferenceField value);

	/**
	 * Returns the value of the '<em><b>Reference Periodic TC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Periodic TC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Periodic TC</em>' containment reference.
	 * @see #setReferencePeriodicTC(GSSScenarioReferencePeriodicTC)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVar_ReferencePeriodicTC()
	 * @model containment="true"
	 * @generated
	 */
	GSSScenarioReferencePeriodicTC getReferencePeriodicTC();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getReferencePeriodicTC <em>Reference Periodic TC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Periodic TC</em>' containment reference.
	 * @see #getReferencePeriodicTC()
	 * @generated
	 */
	void setReferencePeriodicTC(GSSScenarioReferencePeriodicTC value);

	/**
	 * Returns the value of the '<em><b>Reference Special Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Special Packet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Special Packet</em>' containment reference.
	 * @see #setReferenceSpecialPacket(GSSScenarioReferenceSpecialPacket)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioGlobalVar_ReferenceSpecialPacket()
	 * @model containment="true"
	 * @generated
	 */
	GSSScenarioReferenceSpecialPacket getReferenceSpecialPacket();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getReferenceSpecialPacket <em>Reference Special Packet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Special Packet</em>' containment reference.
	 * @see #getReferenceSpecialPacket()
	 * @generated
	 */
	void setReferenceSpecialPacket(GSSScenarioReferenceSpecialPacket value);

} // GSSScenarioGlobalVar
