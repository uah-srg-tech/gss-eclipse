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

import es.uah.aut.srg.gss.charts.GSSChartsChart;

import es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPlot;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPlotImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPlotImpl#getChartRef <em>Chart Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPlotImpl#getGVFiltered <em>GV Filtered</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPlotImpl#getGVPeriodic <em>GV Periodic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentPlotImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentPlot {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChartRef() <em>Chart Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChartRef()
	 * @generated
	 * @ordered
	 */
	protected GSSChartsChart chartRef;

	/**
	 * The cached value of the '{@link #getGVFiltered() <em>GV Filtered</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGVFiltered()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentGVFiltered gvFiltered;

	/**
	 * The cached value of the '{@link #getGVPeriodic() <em>GV Periodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGVPeriodic()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentGVPeriodic gvPeriodic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentPlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PLOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSChartsChart getChartRef() {
		if (chartRef != null && chartRef.eIsProxy()) {
			InternalEObject oldChartRef = (InternalEObject)chartRef;
			chartRef = (GSSChartsChart)eResolveProxy(oldChartRef);
			if (chartRef != oldChartRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PLOT__CHART_REF, oldChartRef, chartRef));
			}
		}
		return chartRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSChartsChart basicGetChartRef() {
		return chartRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChartRef(GSSChartsChart newChartRef) {
		GSSChartsChart oldChartRef = chartRef;
		chartRef = newChartRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PLOT__CHART_REF, oldChartRef, chartRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGVFiltered getGVFiltered() {
		return gvFiltered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGVFiltered(GSSEnvironmentGVFiltered newGVFiltered, NotificationChain msgs) {
		GSSEnvironmentGVFiltered oldGVFiltered = gvFiltered;
		gvFiltered = newGVFiltered;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PLOT__GV_FILTERED, oldGVFiltered, newGVFiltered);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGVFiltered(GSSEnvironmentGVFiltered newGVFiltered) {
		if (newGVFiltered != gvFiltered) {
			NotificationChain msgs = null;
			if (gvFiltered != null)
				msgs = ((InternalEObject)gvFiltered).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PLOT__GV_FILTERED, null, msgs);
			if (newGVFiltered != null)
				msgs = ((InternalEObject)newGVFiltered).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PLOT__GV_FILTERED, null, msgs);
			msgs = basicSetGVFiltered(newGVFiltered, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PLOT__GV_FILTERED, newGVFiltered, newGVFiltered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGVPeriodic getGVPeriodic() {
		return gvPeriodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGVPeriodic(GSSEnvironmentGVPeriodic newGVPeriodic, NotificationChain msgs) {
		GSSEnvironmentGVPeriodic oldGVPeriodic = gvPeriodic;
		gvPeriodic = newGVPeriodic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PLOT__GV_PERIODIC, oldGVPeriodic, newGVPeriodic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGVPeriodic(GSSEnvironmentGVPeriodic newGVPeriodic) {
		if (newGVPeriodic != gvPeriodic) {
			NotificationChain msgs = null;
			if (gvPeriodic != null)
				msgs = ((InternalEObject)gvPeriodic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PLOT__GV_PERIODIC, null, msgs);
			if (newGVPeriodic != null)
				msgs = ((InternalEObject)newGVPeriodic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PLOT__GV_PERIODIC, null, msgs);
			msgs = basicSetGVPeriodic(newGVPeriodic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PLOT__GV_PERIODIC, newGVPeriodic, newGVPeriodic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_FILTERED:
				return basicSetGVFiltered(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_PERIODIC:
				return basicSetGVPeriodic(null, msgs);
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
			case environmentPackage.GSS_ENVIRONMENT_PLOT__NAME:
				return getName();
			case environmentPackage.GSS_ENVIRONMENT_PLOT__CHART_REF:
				if (resolve) return getChartRef();
				return basicGetChartRef();
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_FILTERED:
				return getGVFiltered();
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_PERIODIC:
				return getGVPeriodic();
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
			case environmentPackage.GSS_ENVIRONMENT_PLOT__NAME:
				setName((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PLOT__CHART_REF:
				setChartRef((GSSChartsChart)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_FILTERED:
				setGVFiltered((GSSEnvironmentGVFiltered)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_PERIODIC:
				setGVPeriodic((GSSEnvironmentGVPeriodic)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_PLOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PLOT__CHART_REF:
				setChartRef((GSSChartsChart)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_FILTERED:
				setGVFiltered((GSSEnvironmentGVFiltered)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_PERIODIC:
				setGVPeriodic((GSSEnvironmentGVPeriodic)null);
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
			case environmentPackage.GSS_ENVIRONMENT_PLOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case environmentPackage.GSS_ENVIRONMENT_PLOT__CHART_REF:
				return chartRef != null;
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_FILTERED:
				return gvFiltered != null;
			case environmentPackage.GSS_ENVIRONMENT_PLOT__GV_PERIODIC:
				return gvPeriodic != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentPlotImpl
