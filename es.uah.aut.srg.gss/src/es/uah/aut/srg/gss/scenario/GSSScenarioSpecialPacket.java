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

import es.uah.aut.srg.gss.filter.GSSFilterFilter;

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioPacketConfig;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Special Packet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getStatus <em>Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getLevels <em>Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getLevelRef <em>Level Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getUpperLevels <em>Upper Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getPrintingData <em>Printing Data</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getPeriod <em>Period</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getIntervalRange <em>Interval Range</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket()
 * @model
 * @generated
 */
public interface GSSScenarioSpecialPacket extends TMTCIFScenarioPacketConfig {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #setStatus(GSSScenarioEnableDisable)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_Status()
	 * @model required="true"
	 * @generated
	 */
	GSSScenarioEnableDisable getStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GSSScenarioEnableDisable value);

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
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_IfRef()
	 * @model required="true"
	 * @generated
	 */
	String getIfRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getIfRef <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Ref</em>' attribute.
	 * @see #getIfRef()
	 * @generated
	 */
	void setIfRef(String value);

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Levels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' attribute.
	 * @see #setLevels(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_Levels()
	 * @model required="true"
	 * @generated
	 */
	String getLevels();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getLevels <em>Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Levels</em>' attribute.
	 * @see #getLevels()
	 * @generated
	 */
	void setLevels(String value);

	/**
	 * Returns the value of the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Ref</em>' attribute.
	 * @see #setLevelRef(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_LevelRef()
	 * @model required="true"
	 * @generated
	 */
	String getLevelRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getLevelRef <em>Level Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Ref</em>' attribute.
	 * @see #getLevelRef()
	 * @generated
	 */
	void setLevelRef(String value);

	/**
	 * Returns the value of the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Filter</em>' reference.
	 * @see #setInputFilter(GSSFilterFilter)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_InputFilter()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterFilter getInputFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getInputFilter <em>Input Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Filter</em>' reference.
	 * @see #getInputFilter()
	 * @generated
	 */
	void setInputFilter(GSSFilterFilter value);

	/**
	 * Returns the value of the '<em><b>Upper Levels</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Levels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Levels</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_UpperLevels()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSScenarioUpperLevels> getUpperLevels();

	/**
	 * Returns the value of the '<em><b>Printing Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printing Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printing Data</em>' containment reference.
	 * @see #setPrintingData(GSSScenarioPrintingData)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_PrintingData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSScenarioPrintingData getPrintingData();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getPrintingData <em>Printing Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printing Data</em>' containment reference.
	 * @see #getPrintingData()
	 * @generated
	 */
	void setPrintingData(GSSScenarioPrintingData value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(GSSScenarioPeriod)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_Period()
	 * @model containment="true"
	 * @generated
	 */
	GSSScenarioPeriod getPeriod();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(GSSScenarioPeriod value);

	/**
	 * Returns the value of the '<em><b>Interval Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Range</em>' containment reference.
	 * @see #setIntervalRange(GSSScenarioIntervalRange)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioSpecialPacket_IntervalRange()
	 * @model containment="true"
	 * @generated
	 */
	GSSScenarioIntervalRange getIntervalRange();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getIntervalRange <em>Interval Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Range</em>' containment reference.
	 * @see #getIntervalRange()
	 * @generated
	 */
	void setIntervalRange(GSSScenarioIntervalRange value);

} // GSSScenarioSpecialPacket
