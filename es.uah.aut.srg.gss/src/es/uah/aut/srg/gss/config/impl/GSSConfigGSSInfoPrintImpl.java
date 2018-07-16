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
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.config.GSSConfigEnableDisable;
import es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config GSS Info Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoPrintImpl#getMainLog <em>Main Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoPrintImpl#getPortLogs <em>Port Logs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoPrintImpl#getDebugLog <em>Debug Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigGSSInfoPrintImpl extends MinimalEObjectImpl.Container implements GSSConfigGSSInfoPrint {
	/**
	 * The default value of the '{@link #getMainLog() <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainLog()
	 * @generated
	 * @ordered
	 */
	protected static final GSSConfigEnableDisable MAIN_LOG_EDEFAULT = GSSConfigEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getMainLog() <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainLog()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigEnableDisable mainLog = MAIN_LOG_EDEFAULT;

	/**
	 * This is true if the Main Log attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mainLogESet;

	/**
	 * The default value of the '{@link #getPortLogs() <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortLogs()
	 * @generated
	 * @ordered
	 */
	protected static final GSSConfigEnableDisable PORT_LOGS_EDEFAULT = GSSConfigEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getPortLogs() <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortLogs()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigEnableDisable portLogs = PORT_LOGS_EDEFAULT;

	/**
	 * This is true if the Port Logs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean portLogsESet;

	/**
	 * The default value of the '{@link #getDebugLog() <em>Debug Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugLog()
	 * @generated
	 * @ordered
	 */
	protected static final GSSConfigEnableDisable DEBUG_LOG_EDEFAULT = GSSConfigEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getDebugLog() <em>Debug Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugLog()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigEnableDisable debugLog = DEBUG_LOG_EDEFAULT;

	/**
	 * This is true if the Debug Log attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean debugLogESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigGSSInfoPrintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_GSS_INFO_PRINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigEnableDisable getMainLog() {
		return mainLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainLog(GSSConfigEnableDisable newMainLog) {
		GSSConfigEnableDisable oldMainLog = mainLog;
		mainLog = newMainLog == null ? MAIN_LOG_EDEFAULT : newMainLog;
		boolean oldMainLogESet = mainLogESet;
		mainLogESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG, oldMainLog, mainLog, !oldMainLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMainLog() {
		GSSConfigEnableDisable oldMainLog = mainLog;
		boolean oldMainLogESet = mainLogESet;
		mainLog = MAIN_LOG_EDEFAULT;
		mainLogESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG, oldMainLog, MAIN_LOG_EDEFAULT, oldMainLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMainLog() {
		return mainLogESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigEnableDisable getPortLogs() {
		return portLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortLogs(GSSConfigEnableDisable newPortLogs) {
		GSSConfigEnableDisable oldPortLogs = portLogs;
		portLogs = newPortLogs == null ? PORT_LOGS_EDEFAULT : newPortLogs;
		boolean oldPortLogsESet = portLogsESet;
		portLogsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS, oldPortLogs, portLogs, !oldPortLogsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPortLogs() {
		GSSConfigEnableDisable oldPortLogs = portLogs;
		boolean oldPortLogsESet = portLogsESet;
		portLogs = PORT_LOGS_EDEFAULT;
		portLogsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS, oldPortLogs, PORT_LOGS_EDEFAULT, oldPortLogsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPortLogs() {
		return portLogsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigEnableDisable getDebugLog() {
		return debugLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebugLog(GSSConfigEnableDisable newDebugLog) {
		GSSConfigEnableDisable oldDebugLog = debugLog;
		debugLog = newDebugLog == null ? DEBUG_LOG_EDEFAULT : newDebugLog;
		boolean oldDebugLogESet = debugLogESet;
		debugLogESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_INFO_PRINT__DEBUG_LOG, oldDebugLog, debugLog, !oldDebugLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDebugLog() {
		GSSConfigEnableDisable oldDebugLog = debugLog;
		boolean oldDebugLogESet = debugLogESet;
		debugLog = DEBUG_LOG_EDEFAULT;
		debugLogESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_GSS_INFO_PRINT__DEBUG_LOG, oldDebugLog, DEBUG_LOG_EDEFAULT, oldDebugLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDebugLog() {
		return debugLogESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG:
				return getMainLog();
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS:
				return getPortLogs();
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__DEBUG_LOG:
				return getDebugLog();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG:
				setMainLog((GSSConfigEnableDisable)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS:
				setPortLogs((GSSConfigEnableDisable)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__DEBUG_LOG:
				setDebugLog((GSSConfigEnableDisable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG:
				unsetMainLog();
				return;
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS:
				unsetPortLogs();
				return;
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__DEBUG_LOG:
				unsetDebugLog();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG:
				return isSetMainLog();
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS:
				return isSetPortLogs();
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT__DEBUG_LOG:
				return isSetDebugLog();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mainLog: ");
		if (mainLogESet) result.append(mainLog); else result.append("<unset>");
		result.append(", portLogs: ");
		if (portLogsESet) result.append(portLogs); else result.append("<unset>");
		result.append(", debugLog: ");
		if (debugLogESet) result.append(debugLog); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSConfigGSSInfoPrintImpl
