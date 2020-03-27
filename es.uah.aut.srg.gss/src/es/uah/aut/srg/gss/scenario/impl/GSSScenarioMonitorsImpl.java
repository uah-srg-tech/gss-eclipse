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

import es.uah.aut.srg.gss.charts.GSSChartsCharts;
import es.uah.aut.srg.gss.scenario.GSSScenarioMonitor;
import es.uah.aut.srg.gss.scenario.GSSScenarioMonitors;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Monitors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl#getChartsFile <em>Charts File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl#getMonitor <em>Monitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioMonitorsImpl extends MinimalEObjectImpl.Container implements GSSScenarioMonitors {
	/**
	 * The cached value of the '{@link #getChartsFile() <em>Charts File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChartsFile()
	 * @generated
	 * @ordered
	 */
	protected GSSChartsCharts chartsFile;

	/**
	 * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioMonitor> monitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioMonitorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_MONITORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSChartsCharts getChartsFile() {
		if (chartsFile != null && chartsFile.eIsProxy()) {
			InternalEObject oldChartsFile = (InternalEObject)chartsFile;
			chartsFile = (GSSChartsCharts)eResolveProxy(oldChartsFile);
			if (chartsFile != oldChartsFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_MONITORS__CHARTS_FILE, oldChartsFile, chartsFile));
			}
		}
		return chartsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSChartsCharts basicGetChartsFile() {
		return chartsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChartsFile(GSSChartsCharts newChartsFile) {
		GSSChartsCharts oldChartsFile = chartsFile;
		chartsFile = newChartsFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_MONITORS__CHARTS_FILE, oldChartsFile, chartsFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioMonitor> getMonitor() {
		if (monitor == null) {
			monitor = new EObjectContainmentEList<GSSScenarioMonitor>(GSSScenarioMonitor.class, this, scenarioPackage.GSS_SCENARIO_MONITORS__MONITOR);
		}
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_MONITORS__MONITOR:
				return ((InternalEList<?>)getMonitor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_MONITORS__CHARTS_FILE:
				if (resolve) return getChartsFile();
				return basicGetChartsFile();
			case scenarioPackage.GSS_SCENARIO_MONITORS__MONITOR:
				return getMonitor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_MONITORS__CHARTS_FILE:
				setChartsFile((GSSChartsCharts)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_MONITORS__MONITOR:
				getMonitor().clear();
				getMonitor().addAll((Collection<? extends GSSScenarioMonitor>)newValue);
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
			case scenarioPackage.GSS_SCENARIO_MONITORS__CHARTS_FILE:
				setChartsFile((GSSChartsCharts)null);
				return;
			case scenarioPackage.GSS_SCENARIO_MONITORS__MONITOR:
				getMonitor().clear();
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
			case scenarioPackage.GSS_SCENARIO_MONITORS__CHARTS_FILE:
				return chartsFile != null;
			case scenarioPackage.GSS_SCENARIO_MONITORS__MONITOR:
				return monitor != null && !monitor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSScenarioMonitorsImpl
