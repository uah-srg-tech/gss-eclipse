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
package es.uah.aut.srg.gss.environment.impl;

import es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Phy Header Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPhyHeaderPrintImpl#getMainLog <em>Main Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPhyHeaderPrintImpl#getPortLogs <em>Port Logs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPhyHeaderPrintImpl#getRawLog <em>Raw Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPhyHeaderPrintImpl#getGssTabs <em>Gss Tabs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentPhyHeaderPrintImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentPhyHeaderPrint {
	/**
	 * The default value of the '{@link #getMainLog() <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainLog()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentEnableDisable MAIN_LOG_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getMainLog() <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainLog()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable mainLog = MAIN_LOG_EDEFAULT;

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
	protected static final GSSEnvironmentEnableDisable PORT_LOGS_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getPortLogs() <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortLogs()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable portLogs = PORT_LOGS_EDEFAULT;

	/**
	 * This is true if the Port Logs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean portLogsESet;

	/**
	 * The default value of the '{@link #getRawLog() <em>Raw Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawLog()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentEnableDisable RAW_LOG_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getRawLog() <em>Raw Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawLog()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable rawLog = RAW_LOG_EDEFAULT;

	/**
	 * This is true if the Raw Log attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rawLogESet;

	/**
	 * The default value of the '{@link #getGssTabs() <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssTabs()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentEnableDisable GSS_TABS_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getGssTabs() <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssTabs()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable gssTabs = GSS_TABS_EDEFAULT;

	/**
	 * This is true if the Gss Tabs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gssTabsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentPhyHeaderPrintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_PHY_HEADER_PRINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentEnableDisable getMainLog() {
		return mainLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainLog(GSSEnvironmentEnableDisable newMainLog) {
		GSSEnvironmentEnableDisable oldMainLog = mainLog;
		mainLog = newMainLog == null ? MAIN_LOG_EDEFAULT : newMainLog;
		boolean oldMainLogESet = mainLogESet;
		mainLogESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG, oldMainLog, mainLog, !oldMainLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMainLog() {
		GSSEnvironmentEnableDisable oldMainLog = mainLog;
		boolean oldMainLogESet = mainLogESet;
		mainLog = MAIN_LOG_EDEFAULT;
		mainLogESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG, oldMainLog, MAIN_LOG_EDEFAULT, oldMainLogESet));
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
	public GSSEnvironmentEnableDisable getPortLogs() {
		return portLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortLogs(GSSEnvironmentEnableDisable newPortLogs) {
		GSSEnvironmentEnableDisable oldPortLogs = portLogs;
		portLogs = newPortLogs == null ? PORT_LOGS_EDEFAULT : newPortLogs;
		boolean oldPortLogsESet = portLogsESet;
		portLogsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS, oldPortLogs, portLogs, !oldPortLogsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPortLogs() {
		GSSEnvironmentEnableDisable oldPortLogs = portLogs;
		boolean oldPortLogsESet = portLogsESet;
		portLogs = PORT_LOGS_EDEFAULT;
		portLogsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS, oldPortLogs, PORT_LOGS_EDEFAULT, oldPortLogsESet));
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
	public GSSEnvironmentEnableDisable getRawLog() {
		return rawLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawLog(GSSEnvironmentEnableDisable newRawLog) {
		GSSEnvironmentEnableDisable oldRawLog = rawLog;
		rawLog = newRawLog == null ? RAW_LOG_EDEFAULT : newRawLog;
		boolean oldRawLogESet = rawLogESet;
		rawLogESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG, oldRawLog, rawLog, !oldRawLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRawLog() {
		GSSEnvironmentEnableDisable oldRawLog = rawLog;
		boolean oldRawLogESet = rawLogESet;
		rawLog = RAW_LOG_EDEFAULT;
		rawLogESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG, oldRawLog, RAW_LOG_EDEFAULT, oldRawLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRawLog() {
		return rawLogESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentEnableDisable getGssTabs() {
		return gssTabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGssTabs(GSSEnvironmentEnableDisable newGssTabs) {
		GSSEnvironmentEnableDisable oldGssTabs = gssTabs;
		gssTabs = newGssTabs == null ? GSS_TABS_EDEFAULT : newGssTabs;
		boolean oldGssTabsESet = gssTabsESet;
		gssTabsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS, oldGssTabs, gssTabs, !oldGssTabsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGssTabs() {
		GSSEnvironmentEnableDisable oldGssTabs = gssTabs;
		boolean oldGssTabsESet = gssTabsESet;
		gssTabs = GSS_TABS_EDEFAULT;
		gssTabsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS, oldGssTabs, GSS_TABS_EDEFAULT, oldGssTabsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGssTabs() {
		return gssTabsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG:
				return getMainLog();
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS:
				return getPortLogs();
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG:
				return getRawLog();
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS:
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
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG:
				setMainLog((GSSEnvironmentEnableDisable)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS:
				setPortLogs((GSSEnvironmentEnableDisable)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG:
				setRawLog((GSSEnvironmentEnableDisable)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS:
				setGssTabs((GSSEnvironmentEnableDisable)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG:
				unsetMainLog();
				return;
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS:
				unsetPortLogs();
				return;
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG:
				unsetRawLog();
				return;
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS:
				unsetGssTabs();
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
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG:
				return isSetMainLog();
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS:
				return isSetPortLogs();
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG:
				return isSetRawLog();
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS:
				return isSetGssTabs();
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
		result.append(", rawLog: ");
		if (rawLogESet) result.append(rawLog); else result.append("<unset>");
		result.append(", gssTabs: ");
		if (gssTabsESet) result.append(gssTabs); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentPhyHeaderPrintImpl
