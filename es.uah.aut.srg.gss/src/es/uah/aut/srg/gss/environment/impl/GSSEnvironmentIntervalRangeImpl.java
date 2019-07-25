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

import es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange;
import es.uah.aut.srg.gss.environment.GSSEnvironmentUnit;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Interval Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentIntervalRangeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentIntervalRangeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentIntervalRangeImpl#getInterval_value <em>Interval value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentIntervalRangeImpl#getInterval_unit <em>Interval unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentIntervalRangeImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentIntervalRange {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected String min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected String max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval_value() <em>Interval value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval_value()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval_value() <em>Interval value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval_value()
	 * @generated
	 * @ordered
	 */
	protected String interval_value = INTERVAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval_unit() <em>Interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval_unit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentUnit INTERVAL_UNIT_EDEFAULT = GSSEnvironmentUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getInterval_unit() <em>Interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval_unit()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentUnit interval_unit = INTERVAL_UNIT_EDEFAULT;

	/**
	 * This is true if the Interval unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interval_unitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentIntervalRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_INTERVAL_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(String newMin) {
		String oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(String newMax) {
		String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterval_value() {
		return interval_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval_value(String newInterval_value) {
		String oldInterval_value = interval_value;
		interval_value = newInterval_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE, oldInterval_value, interval_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentUnit getInterval_unit() {
		return interval_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval_unit(GSSEnvironmentUnit newInterval_unit) {
		GSSEnvironmentUnit oldInterval_unit = interval_unit;
		interval_unit = newInterval_unit == null ? INTERVAL_UNIT_EDEFAULT : newInterval_unit;
		boolean oldInterval_unitESet = interval_unitESet;
		interval_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT, oldInterval_unit, interval_unit, !oldInterval_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterval_unit() {
		GSSEnvironmentUnit oldInterval_unit = interval_unit;
		boolean oldInterval_unitESet = interval_unitESet;
		interval_unit = INTERVAL_UNIT_EDEFAULT;
		interval_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT, oldInterval_unit, INTERVAL_UNIT_EDEFAULT, oldInterval_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterval_unit() {
		return interval_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MIN:
				return getMin();
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MAX:
				return getMax();
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE:
				return getInterval_value();
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT:
				return getInterval_unit();
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
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MIN:
				setMin((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MAX:
				setMax((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE:
				setInterval_value((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT:
				setInterval_unit((GSSEnvironmentUnit)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE:
				setInterval_value(INTERVAL_VALUE_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT:
				unsetInterval_unit();
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
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE:
				return INTERVAL_VALUE_EDEFAULT == null ? interval_value != null : !INTERVAL_VALUE_EDEFAULT.equals(interval_value);
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT:
				return isSetInterval_unit();
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", interval_value: ");
		result.append(interval_value);
		result.append(", interval_unit: ");
		if (interval_unitESet) result.append(interval_unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentIntervalRangeImpl