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
 * A representation of the model object '<em><b>GSS Environment Info Print</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getMainLog <em>Main Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getPortLogs <em>Port Logs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getRawLog <em>Raw Log</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInfoPrint()
 * @model
 * @generated
 */
public interface GSSEnvironmentInfoPrint extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Log</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetMainLog()
	 * @see #unsetMainLog()
	 * @see #setMainLog(GSSEnvironmentEnableDisable)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInfoPrint_MainLog()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentEnableDisable getMainLog();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getMainLog <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetMainLog()
	 * @see #unsetMainLog()
	 * @see #getMainLog()
	 * @generated
	 */
	void setMainLog(GSSEnvironmentEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getMainLog <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMainLog()
	 * @see #getMainLog()
	 * @see #setMainLog(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	void unsetMainLog();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getMainLog <em>Main Log</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Main Log</em>' attribute is set.
	 * @see #unsetMainLog()
	 * @see #getMainLog()
	 * @see #setMainLog(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	boolean isSetMainLog();

	/**
	 * Returns the value of the '<em><b>Port Logs</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Logs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Logs</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetPortLogs()
	 * @see #unsetPortLogs()
	 * @see #setPortLogs(GSSEnvironmentEnableDisable)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInfoPrint_PortLogs()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentEnableDisable getPortLogs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getPortLogs <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Logs</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetPortLogs()
	 * @see #unsetPortLogs()
	 * @see #getPortLogs()
	 * @generated
	 */
	void setPortLogs(GSSEnvironmentEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getPortLogs <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPortLogs()
	 * @see #getPortLogs()
	 * @see #setPortLogs(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	void unsetPortLogs();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getPortLogs <em>Port Logs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Port Logs</em>' attribute is set.
	 * @see #unsetPortLogs()
	 * @see #getPortLogs()
	 * @see #setPortLogs(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	boolean isSetPortLogs();

	/**
	 * Returns the value of the '<em><b>Raw Log</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetRawLog()
	 * @see #unsetRawLog()
	 * @see #setRawLog(GSSEnvironmentEnableDisable)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInfoPrint_RawLog()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentEnableDisable getRawLog();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getRawLog <em>Raw Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Log</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #isSetRawLog()
	 * @see #unsetRawLog()
	 * @see #getRawLog()
	 * @generated
	 */
	void setRawLog(GSSEnvironmentEnableDisable value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getRawLog <em>Raw Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRawLog()
	 * @see #getRawLog()
	 * @see #setRawLog(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	void unsetRawLog();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getRawLog <em>Raw Log</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Raw Log</em>' attribute is set.
	 * @see #unsetRawLog()
	 * @see #getRawLog()
	 * @see #setRawLog(GSSEnvironmentEnableDisable)
	 * @generated
	 */
	boolean isSetRawLog();

} // GSSEnvironmentInfoPrint
