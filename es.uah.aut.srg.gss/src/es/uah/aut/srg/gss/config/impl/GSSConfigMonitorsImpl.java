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

import es.uah.aut.srg.gss.charts.GSSChartsCharts;

import es.uah.aut.srg.gss.config.GSSConfigAlarmMsg;
import es.uah.aut.srg.gss.config.GSSConfigAlarmVal;
import es.uah.aut.srg.gss.config.GSSConfigModify;
import es.uah.aut.srg.gss.config.GSSConfigMonitors;
import es.uah.aut.srg.gss.config.GSSConfigPlot;
import es.uah.aut.srg.gss.config.configPackage;

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
 * An implementation of the model object '<em><b>GSS Config Monitors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMonitorsImpl#getChartsFile <em>Charts File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMonitorsImpl#getPlot <em>Plot</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMonitorsImpl#getAlarmMsg <em>Alarm Msg</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMonitorsImpl#getModify <em>Modify</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMonitorsImpl#getAlarmVal <em>Alarm Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigMonitorsImpl extends MinimalEObjectImpl.Container implements GSSConfigMonitors {
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
	protected EList<GSSConfigPlot> plot;

	/**
	 * The cached value of the '{@link #getAlarmMsg() <em>Alarm Msg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmMsg()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigAlarmMsg> alarmMsg;

	/**
	 * The cached value of the '{@link #getModify() <em>Modify</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModify()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigModify> modify;

	/**
	 * The cached value of the '{@link #getAlarmVal() <em>Alarm Val</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmVal()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigAlarmVal> alarmVal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigMonitorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_MONITORS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_MONITORS__CHARTS_FILE, oldChartsFile, chartsFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_MONITORS__CHARTS_FILE, oldChartsFile, chartsFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigPlot> getPlot() {
		if (plot == null) {
			plot = new EObjectContainmentEList<GSSConfigPlot>(GSSConfigPlot.class, this, configPackage.GSS_CONFIG_MONITORS__PLOT);
		}
		return plot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigAlarmMsg> getAlarmMsg() {
		if (alarmMsg == null) {
			alarmMsg = new EObjectContainmentEList<GSSConfigAlarmMsg>(GSSConfigAlarmMsg.class, this, configPackage.GSS_CONFIG_MONITORS__ALARM_MSG);
		}
		return alarmMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigModify> getModify() {
		if (modify == null) {
			modify = new EObjectContainmentEList<GSSConfigModify>(GSSConfigModify.class, this, configPackage.GSS_CONFIG_MONITORS__MODIFY);
		}
		return modify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigAlarmVal> getAlarmVal() {
		if (alarmVal == null) {
			alarmVal = new EObjectContainmentEList<GSSConfigAlarmVal>(GSSConfigAlarmVal.class, this, configPackage.GSS_CONFIG_MONITORS__ALARM_VAL);
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
			case configPackage.GSS_CONFIG_MONITORS__PLOT:
				return ((InternalEList<?>)getPlot()).basicRemove(otherEnd, msgs);
			case configPackage.GSS_CONFIG_MONITORS__ALARM_MSG:
				return ((InternalEList<?>)getAlarmMsg()).basicRemove(otherEnd, msgs);
			case configPackage.GSS_CONFIG_MONITORS__MODIFY:
				return ((InternalEList<?>)getModify()).basicRemove(otherEnd, msgs);
			case configPackage.GSS_CONFIG_MONITORS__ALARM_VAL:
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
			case configPackage.GSS_CONFIG_MONITORS__CHARTS_FILE:
				if (resolve) return getChartsFile();
				return basicGetChartsFile();
			case configPackage.GSS_CONFIG_MONITORS__PLOT:
				return getPlot();
			case configPackage.GSS_CONFIG_MONITORS__ALARM_MSG:
				return getAlarmMsg();
			case configPackage.GSS_CONFIG_MONITORS__MODIFY:
				return getModify();
			case configPackage.GSS_CONFIG_MONITORS__ALARM_VAL:
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
			case configPackage.GSS_CONFIG_MONITORS__CHARTS_FILE:
				setChartsFile((GSSChartsCharts)newValue);
				return;
			case configPackage.GSS_CONFIG_MONITORS__PLOT:
				getPlot().clear();
				getPlot().addAll((Collection<? extends GSSConfigPlot>)newValue);
				return;
			case configPackage.GSS_CONFIG_MONITORS__ALARM_MSG:
				getAlarmMsg().clear();
				getAlarmMsg().addAll((Collection<? extends GSSConfigAlarmMsg>)newValue);
				return;
			case configPackage.GSS_CONFIG_MONITORS__MODIFY:
				getModify().clear();
				getModify().addAll((Collection<? extends GSSConfigModify>)newValue);
				return;
			case configPackage.GSS_CONFIG_MONITORS__ALARM_VAL:
				getAlarmVal().clear();
				getAlarmVal().addAll((Collection<? extends GSSConfigAlarmVal>)newValue);
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
			case configPackage.GSS_CONFIG_MONITORS__CHARTS_FILE:
				setChartsFile((GSSChartsCharts)null);
				return;
			case configPackage.GSS_CONFIG_MONITORS__PLOT:
				getPlot().clear();
				return;
			case configPackage.GSS_CONFIG_MONITORS__ALARM_MSG:
				getAlarmMsg().clear();
				return;
			case configPackage.GSS_CONFIG_MONITORS__MODIFY:
				getModify().clear();
				return;
			case configPackage.GSS_CONFIG_MONITORS__ALARM_VAL:
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
			case configPackage.GSS_CONFIG_MONITORS__CHARTS_FILE:
				return chartsFile != null;
			case configPackage.GSS_CONFIG_MONITORS__PLOT:
				return plot != null && !plot.isEmpty();
			case configPackage.GSS_CONFIG_MONITORS__ALARM_MSG:
				return alarmMsg != null && !alarmMsg.isEmpty();
			case configPackage.GSS_CONFIG_MONITORS__MODIFY:
				return modify != null && !modify.isEmpty();
			case configPackage.GSS_CONFIG_MONITORS__ALARM_VAL:
				return alarmVal != null && !alarmVal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSConfigMonitorsImpl
