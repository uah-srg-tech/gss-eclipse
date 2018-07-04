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
import es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Phy Header Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPhyHeaderPrintImpl#getMainLog <em>Main Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPhyHeaderPrintImpl#getPortLogs <em>Port Logs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPhyHeaderPrintImpl#getDebugLog <em>Debug Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPhyHeaderPrintImpl#getGssTabs <em>Gss Tabs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigPhyHeaderPrintImpl extends MinimalEObjectImpl.Container implements GSSConfigPhyHeaderPrint {
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
	 * The default value of the '{@link #getGssTabs() <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssTabs()
	 * @generated
	 * @ordered
	 */
	protected static final GSSConfigEnableDisable GSS_TABS_EDEFAULT = GSSConfigEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getGssTabs() <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssTabs()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigEnableDisable gssTabs = GSS_TABS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigPhyHeaderPrintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_PHY_HEADER_PRINT;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG, oldMainLog, mainLog));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS, oldPortLogs, portLogs));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PHY_HEADER_PRINT__DEBUG_LOG, oldDebugLog, debugLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigEnableDisable getGssTabs() {
		return gssTabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGssTabs(GSSConfigEnableDisable newGssTabs) {
		GSSConfigEnableDisable oldGssTabs = gssTabs;
		gssTabs = newGssTabs == null ? GSS_TABS_EDEFAULT : newGssTabs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS, oldGssTabs, gssTabs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG:
				return getMainLog();
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS:
				return getPortLogs();
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__DEBUG_LOG:
				return getDebugLog();
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS:
				return getGssTabs();
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
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG:
				setMainLog((GSSConfigEnableDisable)newValue);
				return;
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS:
				setPortLogs((GSSConfigEnableDisable)newValue);
				return;
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__DEBUG_LOG:
				setDebugLog((GSSConfigEnableDisable)newValue);
				return;
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS:
				setGssTabs((GSSConfigEnableDisable)newValue);
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
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG:
				setMainLog(MAIN_LOG_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS:
				setPortLogs(PORT_LOGS_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__DEBUG_LOG:
				setDebugLog(DEBUG_LOG_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS:
				setGssTabs(GSS_TABS_EDEFAULT);
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
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG:
				return mainLog != MAIN_LOG_EDEFAULT;
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS:
				return portLogs != PORT_LOGS_EDEFAULT;
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__DEBUG_LOG:
				return debugLog != DEBUG_LOG_EDEFAULT;
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS:
				return gssTabs != GSS_TABS_EDEFAULT;
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
		result.append(mainLog);
		result.append(", portLogs: ");
		result.append(portLogs);
		result.append(", debugLog: ");
		result.append(debugLog);
		result.append(", gssTabs: ");
		result.append(gssTabs);
		result.append(')');
		return result.toString();
	}

} //GSSConfigPhyHeaderPrintImpl
