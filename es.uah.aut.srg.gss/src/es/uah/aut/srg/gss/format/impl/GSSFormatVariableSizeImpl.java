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
package es.uah.aut.srg.gss.format.impl;

import es.uah.aut.srg.gss.format.GSSFormatPower;
import es.uah.aut.srg.gss.format.GSSFormatUnit;
import es.uah.aut.srg.gss.format.GSSFormatVariableSize;
import es.uah.aut.srg.gss.format.formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Format Variable Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVariableSizeImpl#getFidRef <em>Fid Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVariableSizeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVariableSizeImpl#getPower <em>Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFormatVariableSizeImpl extends MinimalEObjectImpl.Container implements GSSFormatVariableSize {
	/**
	 * The default value of the '{@link #getFidRef() <em>Fid Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFidRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFidRef() <em>Fid Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFidRef()
	 * @generated
	 * @ordered
	 */
	protected String fidRef = FID_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSFormatUnit UNIT_EDEFAULT = GSSFormatUnit.BYTES;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatUnit unit = UNIT_EDEFAULT;

	/**
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final GSSFormatPower POWER_EDEFAULT = GSSFormatPower._2;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatPower power = POWER_EDEFAULT;

	/**
	 * This is true if the Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFormatVariableSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.GSS_FORMAT_VARIABLE_SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFidRef() {
		return fidRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFidRef(String newFidRef) {
		String oldFidRef = fidRef;
		fidRef = newFidRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VARIABLE_SIZE__FID_REF, oldFidRef, fidRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(GSSFormatUnit newUnit) {
		GSSFormatUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VARIABLE_SIZE__UNIT, oldUnit, unit, !oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		GSSFormatUnit oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = UNIT_EDEFAULT;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.GSS_FORMAT_VARIABLE_SIZE__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatPower getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(GSSFormatPower newPower) {
		GSSFormatPower oldPower = power;
		power = newPower == null ? POWER_EDEFAULT : newPower;
		boolean oldPowerESet = powerESet;
		powerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VARIABLE_SIZE__POWER, oldPower, power, !oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPower() {
		GSSFormatPower oldPower = power;
		boolean oldPowerESet = powerESet;
		power = POWER_EDEFAULT;
		powerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.GSS_FORMAT_VARIABLE_SIZE__POWER, oldPower, POWER_EDEFAULT, oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPower() {
		return powerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__FID_REF:
				return getFidRef();
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__UNIT:
				return getUnit();
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__POWER:
				return getPower();
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
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__FID_REF:
				setFidRef((String)newValue);
				return;
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__UNIT:
				setUnit((GSSFormatUnit)newValue);
				return;
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__POWER:
				setPower((GSSFormatPower)newValue);
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
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__FID_REF:
				setFidRef(FID_REF_EDEFAULT);
				return;
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__UNIT:
				unsetUnit();
				return;
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__POWER:
				unsetPower();
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
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__FID_REF:
				return FID_REF_EDEFAULT == null ? fidRef != null : !FID_REF_EDEFAULT.equals(fidRef);
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__UNIT:
				return isSetUnit();
			case formatPackage.GSS_FORMAT_VARIABLE_SIZE__POWER:
				return isSetPower();
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
		result.append(" (fidRef: ");
		result.append(fidRef);
		result.append(", unit: ");
		if (unitESet) result.append(unit); else result.append("<unset>");
		result.append(", power: ");
		if (powerESet) result.append(power); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSFormatVariableSizeImpl
