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
 * A representation of the model object '<em><b>GSS Scenario Phy Header Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getMainLog <em>Main Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getPortLogs <em>Port Logs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getRawLog <em>Raw Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPhyHeaderPrint()
 * @model
 * @generated
 */
public interface GSSScenarioPhyHeaderPrint extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Log</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetMainLog()
	 * @see #unsetMainLog()
	 * @see #setMainLog(GSSScenarioEnableDisable)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPhyHeaderPrint_MainLog()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioEnableDisable getMainLog();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getMainLog <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetMainLog()
	 * @see #unsetMainLog()
	 * @see #getMainLog()
	 * @generated
	 */
	void setMainLog(GSSScenarioEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getMainLog <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMainLog()
	 * @see #getMainLog()
	 * @see #setMainLog(GSSScenarioEnableDisable)
	 * @generated
	 */
	void unsetMainLog();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getMainLog <em>Main Log</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Main Log</em>' attribute is set.
	 * @see #unsetMainLog()
	 * @see #getMainLog()
	 * @see #setMainLog(GSSScenarioEnableDisable)
	 * @generated
	 */
	boolean isSetMainLog();

	/**
	 * Returns the value of the '<em><b>Port Logs</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Logs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Logs</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetPortLogs()
	 * @see #unsetPortLogs()
	 * @see #setPortLogs(GSSScenarioEnableDisable)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPhyHeaderPrint_PortLogs()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioEnableDisable getPortLogs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getPortLogs <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Logs</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetPortLogs()
	 * @see #unsetPortLogs()
	 * @see #getPortLogs()
	 * @generated
	 */
	void setPortLogs(GSSScenarioEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getPortLogs <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPortLogs()
	 * @see #getPortLogs()
	 * @see #setPortLogs(GSSScenarioEnableDisable)
	 * @generated
	 */
	void unsetPortLogs();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getPortLogs <em>Port Logs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port Logs</em>' attribute is set.
	 * @see #unsetPortLogs()
	 * @see #getPortLogs()
	 * @see #setPortLogs(GSSScenarioEnableDisable)
	 * @generated
	 */
	boolean isSetPortLogs();

	/**
	 * Returns the value of the '<em><b>Raw Log</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetRawLog()
	 * @see #unsetRawLog()
	 * @see #setRawLog(GSSScenarioEnableDisable)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPhyHeaderPrint_RawLog()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioEnableDisable getRawLog();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getRawLog <em>Raw Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetRawLog()
	 * @see #unsetRawLog()
	 * @see #getRawLog()
	 * @generated
	 */
	void setRawLog(GSSScenarioEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getRawLog <em>Raw Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRawLog()
	 * @see #getRawLog()
	 * @see #setRawLog(GSSScenarioEnableDisable)
	 * @generated
	 */
	void unsetRawLog();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getRawLog <em>Raw Log</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Raw Log</em>' attribute is set.
	 * @see #unsetRawLog()
	 * @see #getRawLog()
	 * @see #setRawLog(GSSScenarioEnableDisable)
	 * @generated
	 */
	boolean isSetRawLog();

	/**
	 * Returns the value of the '<em><b>Gss Tabs</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss Tabs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss Tabs</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetGssTabs()
	 * @see #unsetGssTabs()
	 * @see #setGssTabs(GSSScenarioEnableDisable)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioPhyHeaderPrint_GssTabs()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioEnableDisable getGssTabs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss Tabs</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see #isSetGssTabs()
	 * @see #unsetGssTabs()
	 * @see #getGssTabs()
	 * @generated
	 */
	void setGssTabs(GSSScenarioEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGssTabs()
	 * @see #getGssTabs()
	 * @see #setGssTabs(GSSScenarioEnableDisable)
	 * @generated
	 */
	void unsetGssTabs();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gss Tabs</em>' attribute is set.
	 * @see #unsetGssTabs()
	 * @see #getGssTabs()
	 * @see #setGssTabs(GSSScenarioEnableDisable)
	 * @generated
	 */
	boolean isSetGssTabs();

} // GSSScenarioPhyHeaderPrint
