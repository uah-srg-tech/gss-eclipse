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
package es.uah.aut.srg.gss.config;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Special Packet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getStatus <em>Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getLevels <em>Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getLevelRef <em>Level Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getUpperLevels <em>Upper Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getPrintingData <em>Printing Data</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getPeriod <em>Period</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getIntervalRange <em>Interval Range</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket()
 * @model
 * @generated
 */
public interface GSSConfigSpecialPacket extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #setStatus(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_Status()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(GSSConfigEnableDisable value);

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getName <em>Name</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_IfRef()
	 * @model required="true"
	 * @generated
	 */
	String getIfRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getIfRef <em>If Ref</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_Levels()
	 * @model required="true"
	 * @generated
	 */
	String getLevels();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getLevels <em>Levels</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_LevelRef()
	 * @model required="true"
	 * @generated
	 */
	String getLevelRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getLevelRef <em>Level Ref</em>}' attribute.
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
	 * @see #setInputFilter(TMTCIFFilterFilter)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_InputFilter()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFilterFilter getInputFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getInputFilter <em>Input Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Filter</em>' reference.
	 * @see #getInputFilter()
	 * @generated
	 */
	void setInputFilter(TMTCIFFilterFilter value);

	/**
	 * Returns the value of the '<em><b>Upper Levels</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.config.GSSConfigUpperLevels}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Levels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Levels</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_UpperLevels()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSConfigUpperLevels> getUpperLevels();

	/**
	 * Returns the value of the '<em><b>Printing Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printing Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printing Data</em>' containment reference.
	 * @see #setPrintingData(GSSConfigPrintingData)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_PrintingData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigPrintingData getPrintingData();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getPrintingData <em>Printing Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printing Data</em>' containment reference.
	 * @see #getPrintingData()
	 * @generated
	 */
	void setPrintingData(GSSConfigPrintingData value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(GSSConfigPeriod)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_Period()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigPeriod getPeriod();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(GSSConfigPeriod value);

	/**
	 * Returns the value of the '<em><b>Interval Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Range</em>' containment reference.
	 * @see #setIntervalRange(GSSConfigIntervalRange)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPacket_IntervalRange()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigIntervalRange getIntervalRange();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getIntervalRange <em>Interval Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Range</em>' containment reference.
	 * @see #getIntervalRange()
	 * @generated
	 */
	void setIntervalRange(GSSConfigIntervalRange value);

} // GSSConfigSpecialPacket
