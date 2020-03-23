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
package es.uah.aut.srg.gss.scenario.impl;

import es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable;
import es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Phy Header Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPhyHeaderPrintImpl#getMainLog <em>Main Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPhyHeaderPrintImpl#getPortLogs <em>Port Logs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPhyHeaderPrintImpl#getRawLog <em>Raw Log</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPhyHeaderPrintImpl#getGssTabs <em>Gss Tabs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioPhyHeaderPrintImpl extends MinimalEObjectImpl.Container implements GSSScenarioPhyHeaderPrint {
	/**
	 * The default value of the '{@link #getMainLog() <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainLog()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioEnableDisable MAIN_LOG_EDEFAULT = GSSScenarioEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getMainLog() <em>Main Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainLog()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioEnableDisable mainLog = MAIN_LOG_EDEFAULT;

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
	protected static final GSSScenarioEnableDisable PORT_LOGS_EDEFAULT = GSSScenarioEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getPortLogs() <em>Port Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortLogs()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioEnableDisable portLogs = PORT_LOGS_EDEFAULT;

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
	protected static final GSSScenarioEnableDisable RAW_LOG_EDEFAULT = GSSScenarioEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getRawLog() <em>Raw Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawLog()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioEnableDisable rawLog = RAW_LOG_EDEFAULT;

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
	protected static final GSSScenarioEnableDisable GSS_TABS_EDEFAULT = GSSScenarioEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getGssTabs() <em>Gss Tabs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssTabs()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioEnableDisable gssTabs = GSS_TABS_EDEFAULT;

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
	protected GSSScenarioPhyHeaderPrintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_PHY_HEADER_PRINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioEnableDisable getMainLog() {
		return mainLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainLog(GSSScenarioEnableDisable newMainLog) {
		GSSScenarioEnableDisable oldMainLog = mainLog;
		mainLog = newMainLog == null ? MAIN_LOG_EDEFAULT : newMainLog;
		boolean oldMainLogESet = mainLogESet;
		mainLogESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG, oldMainLog, mainLog, !oldMainLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMainLog() {
		GSSScenarioEnableDisable oldMainLog = mainLog;
		boolean oldMainLogESet = mainLogESet;
		mainLog = MAIN_LOG_EDEFAULT;
		mainLogESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG, oldMainLog, MAIN_LOG_EDEFAULT, oldMainLogESet));
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
	public GSSScenarioEnableDisable getPortLogs() {
		return portLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortLogs(GSSScenarioEnableDisable newPortLogs) {
		GSSScenarioEnableDisable oldPortLogs = portLogs;
		portLogs = newPortLogs == null ? PORT_LOGS_EDEFAULT : newPortLogs;
		boolean oldPortLogsESet = portLogsESet;
		portLogsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS, oldPortLogs, portLogs, !oldPortLogsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPortLogs() {
		GSSScenarioEnableDisable oldPortLogs = portLogs;
		boolean oldPortLogsESet = portLogsESet;
		portLogs = PORT_LOGS_EDEFAULT;
		portLogsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS, oldPortLogs, PORT_LOGS_EDEFAULT, oldPortLogsESet));
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
	public GSSScenarioEnableDisable getRawLog() {
		return rawLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawLog(GSSScenarioEnableDisable newRawLog) {
		GSSScenarioEnableDisable oldRawLog = rawLog;
		rawLog = newRawLog == null ? RAW_LOG_EDEFAULT : newRawLog;
		boolean oldRawLogESet = rawLogESet;
		rawLogESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG, oldRawLog, rawLog, !oldRawLogESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRawLog() {
		GSSScenarioEnableDisable oldRawLog = rawLog;
		boolean oldRawLogESet = rawLogESet;
		rawLog = RAW_LOG_EDEFAULT;
		rawLogESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG, oldRawLog, RAW_LOG_EDEFAULT, oldRawLogESet));
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
	public GSSScenarioEnableDisable getGssTabs() {
		return gssTabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGssTabs(GSSScenarioEnableDisable newGssTabs) {
		GSSScenarioEnableDisable oldGssTabs = gssTabs;
		gssTabs = newGssTabs == null ? GSS_TABS_EDEFAULT : newGssTabs;
		boolean oldGssTabsESet = gssTabsESet;
		gssTabsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS, oldGssTabs, gssTabs, !oldGssTabsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGssTabs() {
		GSSScenarioEnableDisable oldGssTabs = gssTabs;
		boolean oldGssTabsESet = gssTabsESet;
		gssTabs = GSS_TABS_EDEFAULT;
		gssTabsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS, oldGssTabs, GSS_TABS_EDEFAULT, oldGssTabsESet));
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
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG:
				return getMainLog();
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS:
				return getPortLogs();
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG:
				return getRawLog();
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS:
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
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG:
				setMainLog((GSSScenarioEnableDisable)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS:
				setPortLogs((GSSScenarioEnableDisable)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG:
				setRawLog((GSSScenarioEnableDisable)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS:
				setGssTabs((GSSScenarioEnableDisable)newValue);
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
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG:
				unsetMainLog();
				return;
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS:
				unsetPortLogs();
				return;
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG:
				unsetRawLog();
				return;
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS:
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
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG:
				return isSetMainLog();
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS:
				return isSetPortLogs();
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG:
				return isSetRawLog();
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS:
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

} //GSSScenarioPhyHeaderPrintImpl
