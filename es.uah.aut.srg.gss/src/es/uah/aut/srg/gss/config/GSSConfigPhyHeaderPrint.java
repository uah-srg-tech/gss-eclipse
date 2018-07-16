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
 * A representation of the model object '<em><b>GSS Config Phy Header Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getMainLog <em>Main Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getPortLogs <em>Port Logs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getDebugLog <em>Debug Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPhyHeaderPrint()
 * @model
 * @generated
 */
public interface GSSConfigPhyHeaderPrint extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Log</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetMainLog()
	 * @see #unsetMainLog()
	 * @see #setMainLog(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPhyHeaderPrint_MainLog()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getMainLog();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getMainLog <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetMainLog()
	 * @see #unsetMainLog()
	 * @see #getMainLog()
	 * @generated
	 */
	void setMainLog(GSSConfigEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getMainLog <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMainLog()
	 * @see #getMainLog()
	 * @see #setMainLog(GSSConfigEnableDisable)
	 * @generated
	 */
	void unsetMainLog();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getMainLog <em>Main Log</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Main Log</em>' attribute is set.
	 * @see #unsetMainLog()
	 * @see #getMainLog()
	 * @see #setMainLog(GSSConfigEnableDisable)
	 * @generated
	 */
	boolean isSetMainLog();

	/**
	 * Returns the value of the '<em><b>Port Logs</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Logs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Logs</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetPortLogs()
	 * @see #unsetPortLogs()
	 * @see #setPortLogs(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPhyHeaderPrint_PortLogs()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getPortLogs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getPortLogs <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Logs</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetPortLogs()
	 * @see #unsetPortLogs()
	 * @see #getPortLogs()
	 * @generated
	 */
	void setPortLogs(GSSConfigEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getPortLogs <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPortLogs()
	 * @see #getPortLogs()
	 * @see #setPortLogs(GSSConfigEnableDisable)
	 * @generated
	 */
	void unsetPortLogs();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getPortLogs <em>Port Logs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port Logs</em>' attribute is set.
	 * @see #unsetPortLogs()
	 * @see #getPortLogs()
	 * @see #setPortLogs(GSSConfigEnableDisable)
	 * @generated
	 */
	boolean isSetPortLogs();

	/**
	 * Returns the value of the '<em><b>Debug Log</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetDebugLog()
	 * @see #unsetDebugLog()
	 * @see #setDebugLog(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPhyHeaderPrint_DebugLog()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getDebugLog();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getDebugLog <em>Debug Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetDebugLog()
	 * @see #unsetDebugLog()
	 * @see #getDebugLog()
	 * @generated
	 */
	void setDebugLog(GSSConfigEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getDebugLog <em>Debug Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDebugLog()
	 * @see #getDebugLog()
	 * @see #setDebugLog(GSSConfigEnableDisable)
	 * @generated
	 */
	void unsetDebugLog();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getDebugLog <em>Debug Log</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Debug Log</em>' attribute is set.
	 * @see #unsetDebugLog()
	 * @see #getDebugLog()
	 * @see #setDebugLog(GSSConfigEnableDisable)
	 * @generated
	 */
	boolean isSetDebugLog();

	/**
	 * Returns the value of the '<em><b>Gss Tabs</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss Tabs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss Tabs</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetGssTabs()
	 * @see #unsetGssTabs()
	 * @see #setGssTabs(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPhyHeaderPrint_GssTabs()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getGssTabs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss Tabs</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #isSetGssTabs()
	 * @see #unsetGssTabs()
	 * @see #getGssTabs()
	 * @generated
	 */
	void setGssTabs(GSSConfigEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGssTabs()
	 * @see #getGssTabs()
	 * @see #setGssTabs(GSSConfigEnableDisable)
	 * @generated
	 */
	void unsetGssTabs();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gss Tabs</em>' attribute is set.
	 * @see #unsetGssTabs()
	 * @see #getGssTabs()
	 * @see #setGssTabs(GSSConfigEnableDisable)
	 * @generated
	 */
	boolean isSetGssTabs();

} // GSSConfigPhyHeaderPrint
