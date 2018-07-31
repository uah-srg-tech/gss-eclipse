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

import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0;
import es.uah.aut.srg.gss.config.GSSConfigUnit;
import es.uah.aut.srg.gss.config.configPackage;

import es.uah.aut.srg.gss.export.GSSExportExport;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Periodic TC Level0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl#getPeriod_value <em>Period value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl#getPeriod_unit <em>Period unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl#getApp_to_level0 <em>App to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigPeriodicTCLevel0Impl extends MinimalEObjectImpl.Container implements GSSConfigPeriodicTCLevel0 {
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
	 * The default value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected String ifRef = IF_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod_value() <em>Period value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_value()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod_value() <em>Period value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_value()
	 * @generated
	 * @ordered
	 */
	protected String period_value = PERIOD_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod_unit() <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_unit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSConfigUnit PERIOD_UNIT_EDEFAULT = GSSConfigUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getPeriod_unit() <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_unit()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigUnit period_unit = PERIOD_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTCFormat level0;

	/**
	 * The cached value of the '{@link #getApp_to_level0() <em>App to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level0()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport app_to_level0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigPeriodicTCLevel0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL0;
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfRef() {
		return ifRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfRef(String newIfRef) {
		String oldIfRef = ifRef;
		ifRef = newIfRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF, oldIfRef, ifRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriod_value() {
		return period_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod_value(String newPeriod_value) {
		String oldPeriod_value = period_value;
		period_value = newPeriod_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE, oldPeriod_value, period_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigUnit getPeriod_unit() {
		return period_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod_unit(GSSConfigUnit newPeriod_unit) {
		GSSConfigUnit oldPeriod_unit = period_unit;
		period_unit = newPeriod_unit == null ? PERIOD_UNIT_EDEFAULT : newPeriod_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT, oldPeriod_unit, period_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTCFormat getLevel0() {
		if (level0 != null && level0.eIsProxy()) {
			InternalEObject oldLevel0 = (InternalEObject)level0;
			level0 = (GSSTmTcFormatTmTCFormat)eResolveProxy(oldLevel0);
			if (level0 != oldLevel0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0, oldLevel0, level0));
			}
		}
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTCFormat basicGetLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(GSSTmTcFormatTmTCFormat newLevel0) {
		GSSTmTcFormatTmTCFormat oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0, oldLevel0, level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getApp_to_level0() {
		if (app_to_level0 != null && app_to_level0.eIsProxy()) {
			InternalEObject oldApp_to_level0 = (InternalEObject)app_to_level0;
			app_to_level0 = (GSSExportExport)eResolveProxy(oldApp_to_level0);
			if (app_to_level0 != oldApp_to_level0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0, oldApp_to_level0, app_to_level0));
			}
		}
		return app_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetApp_to_level0() {
		return app_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level0(GSSExportExport newApp_to_level0) {
		GSSExportExport oldApp_to_level0 = app_to_level0;
		app_to_level0 = newApp_to_level0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0, oldApp_to_level0, app_to_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME:
				return getName();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__ID:
				return getId();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF:
				return getIfRef();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE:
				return getPeriod_value();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT:
				return getPeriod_unit();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0:
				if (resolve) return getApp_to_level0();
				return basicGetApp_to_level0();
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME:
				setName((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__ID:
				setId((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF:
				setIfRef((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE:
				setPeriod_value((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT:
				setPeriod_unit((GSSConfigUnit)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0:
				setLevel0((GSSTmTcFormatTmTCFormat)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0:
				setApp_to_level0((GSSExportExport)newValue);
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME:
				setName(NAME_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__ID:
				setId(ID_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE:
				setPeriod_value(PERIOD_VALUE_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT:
				setPeriod_unit(PERIOD_UNIT_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0:
				setLevel0((GSSTmTcFormatTmTCFormat)null);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0:
				setApp_to_level0((GSSExportExport)null);
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE:
				return PERIOD_VALUE_EDEFAULT == null ? period_value != null : !PERIOD_VALUE_EDEFAULT.equals(period_value);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT:
				return period_unit != PERIOD_UNIT_EDEFAULT;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0:
				return level0 != null;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0:
				return app_to_level0 != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(", ifRef: ");
		result.append(ifRef);
		result.append(", period_value: ");
		result.append(period_value);
		result.append(", period_unit: ");
		result.append(period_unit);
		result.append(')');
		return result.toString();
	}

} //GSSConfigPeriodicTCLevel0Impl
