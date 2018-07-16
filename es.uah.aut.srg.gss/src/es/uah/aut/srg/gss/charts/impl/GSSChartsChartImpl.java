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
import es.uah.aut.srg.gss.charts.GSSChartsYUnits;
import es.uah.aut.srg.gss.charts.chartsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Charts Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.charts.impl.GSSChartsChartImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.charts.impl.GSSChartsChartImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.charts.impl.GSSChartsChartImpl#getY_units <em>Yunits</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.charts.impl.GSSChartsChartImpl#getY_max <em>Ymax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSChartsChartImpl extends MinimalEObjectImpl.Container implements GSSChartsChart {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getY_units() <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_units()
	 * @generated
	 * @ordered
	 */
	protected static final GSSChartsYUnits YUNITS_EDEFAULT = GSSChartsYUnits.VOLTS;

	/**
	 * The cached value of the '{@link #getY_units() <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_units()
	 * @generated
	 * @ordered
	 */
	protected GSSChartsYUnits y_units = YUNITS_EDEFAULT;

	/**
	 * This is true if the Yunits attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y_unitsESet;

	/**
	 * The default value of the '{@link #getY_max() <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_max()
	 * @generated
	 * @ordered
	 */
	protected static final String YMAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY_max() <em>Ymax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_max()
	 * @generated
	 * @ordered
	 */
	protected String y_max = YMAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSChartsChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return chartsPackage.Literals.GSS_CHARTS_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, chartsPackage.GSS_CHARTS_CHART__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, chartsPackage.GSS_CHARTS_CHART__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSChartsYUnits getY_units() {
		return y_units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_units(GSSChartsYUnits newY_units) {
		GSSChartsYUnits oldY_units = y_units;
		y_units = newY_units == null ? YUNITS_EDEFAULT : newY_units;
		boolean oldY_unitsESet = y_unitsESet;
		y_unitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, chartsPackage.GSS_CHARTS_CHART__YUNITS, oldY_units, y_units, !oldY_unitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetY_units() {
		GSSChartsYUnits oldY_units = y_units;
		boolean oldY_unitsESet = y_unitsESet;
		y_units = YUNITS_EDEFAULT;
		y_unitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, chartsPackage.GSS_CHARTS_CHART__YUNITS, oldY_units, YUNITS_EDEFAULT, oldY_unitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetY_units() {
		return y_unitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY_max() {
		return y_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_max(String newY_max) {
		String oldY_max = y_max;
		y_max = newY_max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, chartsPackage.GSS_CHARTS_CHART__YMAX, oldY_max, y_max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case chartsPackage.GSS_CHARTS_CHART__ID:
				return getId();
			case chartsPackage.GSS_CHARTS_CHART__NAME:
				return getName();
			case chartsPackage.GSS_CHARTS_CHART__YUNITS:
				return getY_units();
			case chartsPackage.GSS_CHARTS_CHART__YMAX:
				return getY_max();
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
			case chartsPackage.GSS_CHARTS_CHART__ID:
				setId((String)newValue);
				return;
			case chartsPackage.GSS_CHARTS_CHART__NAME:
				setName((String)newValue);
				return;
			case chartsPackage.GSS_CHARTS_CHART__YUNITS:
				setY_units((GSSChartsYUnits)newValue);
				return;
			case chartsPackage.GSS_CHARTS_CHART__YMAX:
				setY_max((String)newValue);
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
			case chartsPackage.GSS_CHARTS_CHART__ID:
				setId(ID_EDEFAULT);
				return;
			case chartsPackage.GSS_CHARTS_CHART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case chartsPackage.GSS_CHARTS_CHART__YUNITS:
				unsetY_units();
				return;
			case chartsPackage.GSS_CHARTS_CHART__YMAX:
				setY_max(YMAX_EDEFAULT);
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
			case chartsPackage.GSS_CHARTS_CHART__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case chartsPackage.GSS_CHARTS_CHART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case chartsPackage.GSS_CHARTS_CHART__YUNITS:
				return isSetY_units();
			case chartsPackage.GSS_CHARTS_CHART__YMAX:
				return YMAX_EDEFAULT == null ? y_max != null : !YMAX_EDEFAULT.equals(y_max);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", y_units: ");
		if (y_unitsESet) result.append(y_units); else result.append("<unset>");
		result.append(", y_max: ");
		result.append(y_max);
		result.append(')');
		return result.toString();
	}

} //GSSChartsChartImpl
