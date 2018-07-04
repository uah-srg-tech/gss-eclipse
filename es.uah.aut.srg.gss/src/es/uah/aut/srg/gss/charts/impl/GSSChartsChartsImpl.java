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
package es.uah.aut.srg.gss.charts.impl;

import es.uah.aut.srg.gss.charts.GSSChartsChart;
import es.uah.aut.srg.gss.charts.GSSChartsCharts;
import es.uah.aut.srg.gss.charts.chartsPackage;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Charts Charts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.charts.impl.GSSChartsChartsImpl#getChart <em>Chart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSChartsChartsImpl extends GSSModelElementImpl implements GSSChartsCharts {
	/**
	 * The cached value of the '{@link #getChart() <em>Chart</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChart()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSChartsChart> chart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSChartsChartsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return chartsPackage.Literals.GSS_CHARTS_CHARTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSChartsChart> getChart() {
		if (chart == null) {
			chart = new EObjectContainmentEList<GSSChartsChart>(GSSChartsChart.class, this, chartsPackage.GSS_CHARTS_CHARTS__CHART);
		}
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case chartsPackage.GSS_CHARTS_CHARTS__CHART:
				return ((InternalEList<?>)getChart()).basicRemove(otherEnd, msgs);
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
			case chartsPackage.GSS_CHARTS_CHARTS__CHART:
				return getChart();
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
			case chartsPackage.GSS_CHARTS_CHARTS__CHART:
				getChart().clear();
				getChart().addAll((Collection<? extends GSSChartsChart>)newValue);
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
			case chartsPackage.GSS_CHARTS_CHARTS__CHART:
				getChart().clear();
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
			case chartsPackage.GSS_CHARTS_CHARTS__CHART:
				return chart != null && !chart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSChartsChartsImpl
