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

import es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg;
import es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal;
import es.uah.aut.srg.gss.scenario.GSSScenarioModify;
import es.uah.aut.srg.gss.scenario.GSSScenarioMonitors;
import es.uah.aut.srg.gss.scenario.GSSScenarioPlot;
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
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl#getPlot <em>Plot</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl#getAlarmMsg <em>Alarm Msg</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl#getModify <em>Modify</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl#getAlarmVal <em>Alarm Val</em>}</li>
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
	 * The cached value of the '{@link #getPlot() <em>Plot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlot()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioPlot> plot;

	/**
	 * The cached value of the '{@link #getAlarmMsg() <em>Alarm Msg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmMsg()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioAlarmMsg> alarmMsg;

	/**
	 * The cached value of the '{@link #getModify() <em>Modify</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModify()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioModify> modify;

	/**
	 * The cached value of the '{@link #getAlarmVal() <em>Alarm Val</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmVal()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioAlarmVal> alarmVal;

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
	public EList<GSSScenarioPlot> getPlot() {
		if (plot == null) {
			plot = new EObjectContainmentEList<GSSScenarioPlot>(GSSScenarioPlot.class, this, scenarioPackage.GSS_SCENARIO_MONITORS__PLOT);
		}
		return plot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioAlarmMsg> getAlarmMsg() {
		if (alarmMsg == null) {
			alarmMsg = new EObjectContainmentEList<GSSScenarioAlarmMsg>(GSSScenarioAlarmMsg.class, this, scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_MSG);
		}
		return alarmMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioModify> getModify() {
		if (modify == null) {
			modify = new EObjectContainmentEList<GSSScenarioModify>(GSSScenarioModify.class, this, scenarioPackage.GSS_SCENARIO_MONITORS__MODIFY);
		}
		return modify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioAlarmVal> getAlarmVal() {
		if (alarmVal == null) {
			alarmVal = new EObjectContainmentEList<GSSScenarioAlarmVal>(GSSScenarioAlarmVal.class, this, scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_VAL);
		}
		return alarmVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_MONITORS__PLOT:
				return ((InternalEList<?>)getPlot()).basicRemove(otherEnd, msgs);
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_MSG:
				return ((InternalEList<?>)getAlarmMsg()).basicRemove(otherEnd, msgs);
			case scenarioPackage.GSS_SCENARIO_MONITORS__MODIFY:
				return ((InternalEList<?>)getModify()).basicRemove(otherEnd, msgs);
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_VAL:
				return ((InternalEList<?>)getAlarmVal()).basicRemove(otherEnd, msgs);
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
			case scenarioPackage.GSS_SCENARIO_MONITORS__PLOT:
				return getPlot();
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_MSG:
				return getAlarmMsg();
			case scenarioPackage.GSS_SCENARIO_MONITORS__MODIFY:
				return getModify();
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_VAL:
				return getAlarmVal();
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
			case scenarioPackage.GSS_SCENARIO_MONITORS__PLOT:
				getPlot().clear();
				getPlot().addAll((Collection<? extends GSSScenarioPlot>)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_MSG:
				getAlarmMsg().clear();
				getAlarmMsg().addAll((Collection<? extends GSSScenarioAlarmMsg>)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_MONITORS__MODIFY:
				getModify().clear();
				getModify().addAll((Collection<? extends GSSScenarioModify>)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_VAL:
				getAlarmVal().clear();
				getAlarmVal().addAll((Collection<? extends GSSScenarioAlarmVal>)newValue);
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
			case scenarioPackage.GSS_SCENARIO_MONITORS__PLOT:
				getPlot().clear();
				return;
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_MSG:
				getAlarmMsg().clear();
				return;
			case scenarioPackage.GSS_SCENARIO_MONITORS__MODIFY:
				getModify().clear();
				return;
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_VAL:
				getAlarmVal().clear();
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
			case scenarioPackage.GSS_SCENARIO_MONITORS__PLOT:
				return plot != null && !plot.isEmpty();
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_MSG:
				return alarmMsg != null && !alarmMsg.isEmpty();
			case scenarioPackage.GSS_SCENARIO_MONITORS__MODIFY:
				return modify != null && !modify.isEmpty();
			case scenarioPackage.GSS_SCENARIO_MONITORS__ALARM_VAL:
				return alarmVal != null && !alarmVal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSScenarioMonitorsImpl
