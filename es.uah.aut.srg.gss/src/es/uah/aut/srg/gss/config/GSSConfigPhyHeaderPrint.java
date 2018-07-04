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
	 * @see #setMainLog(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPhyHeaderPrint_MainLog()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getMainLog();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getMainLog <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #getMainLog()
	 * @generated
	 */
	void setMainLog(GSSConfigEnableDisable value);

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
	 * @see #setPortLogs(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPhyHeaderPrint_PortLogs()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getPortLogs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getPortLogs <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Logs</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #getPortLogs()
	 * @generated
	 */
	void setPortLogs(GSSConfigEnableDisable value);

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
	 * @see #setDebugLog(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPhyHeaderPrint_DebugLog()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getDebugLog();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getDebugLog <em>Debug Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #getDebugLog()
	 * @generated
	 */
	void setDebugLog(GSSConfigEnableDisable value);

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
	 * @see #setGssTabs(GSSConfigEnableDisable)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigPhyHeaderPrint_GssTabs()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigEnableDisable getGssTabs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss Tabs</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see #getGssTabs()
	 * @generated
	 */
	void setGssTabs(GSSConfigEnableDisable value);

} // GSSConfigPhyHeaderPrint
