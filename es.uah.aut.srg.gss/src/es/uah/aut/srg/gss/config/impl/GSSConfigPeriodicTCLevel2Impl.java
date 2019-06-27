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

import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2;
import es.uah.aut.srg.gss.config.GSSConfigUnit;
import es.uah.aut.srg.gss.config.configPackage;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Periodic TC Level2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getPeriod_value <em>Period value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getPeriod_unit <em>Period unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getApp_to_level2 <em>App to level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getLevel2_to_level1 <em>Level2 to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigPeriodicTCLevel2Impl extends MinimalEObjectImpl.Container implements GSSConfigPeriodicTCLevel2 {
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
	 * This is true if the Period unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean period_unitESet;

	/**
	 * The cached value of the '{@link #getLevel2() <em>Level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level2;

	/**
	 * The cached value of the '{@link #getApp_to_level2() <em>App to level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level2()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportExport app_to_level2;

	/**
	 * The cached value of the '{@link #getLevel1() <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level1;

	/**
	 * The cached value of the '{@link #getLevel2_to_level1() <em>Level2 to level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_to_level1()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportExport level2_to_level1;

	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level0;

	/**
	 * The cached value of the '{@link #getLevel1_to_level0() <em>Level1 to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_to_level0()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportExport level1_to_level0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigPeriodicTCLevel2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL2;
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF, oldIfRef, ifRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE, oldPeriod_value, period_value));
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
		boolean oldPeriod_unitESet = period_unitESet;
		period_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT, oldPeriod_unit, period_unit, !oldPeriod_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeriod_unit() {
		GSSConfigUnit oldPeriod_unit = period_unit;
		boolean oldPeriod_unitESet = period_unitESet;
		period_unit = PERIOD_UNIT_EDEFAULT;
		period_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT, oldPeriod_unit, PERIOD_UNIT_EDEFAULT, oldPeriod_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeriod_unit() {
		return period_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel2() {
		if (level2 != null && level2.eIsProxy()) {
			InternalEObject oldLevel2 = (InternalEObject)level2;
			level2 = (TMTCIFFormatFormat)eResolveProxy(oldLevel2);
			if (level2 != oldLevel2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2, oldLevel2, level2));
			}
		}
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel2() {
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2(TMTCIFFormatFormat newLevel2) {
		TMTCIFFormatFormat oldLevel2 = level2;
		level2 = newLevel2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2, oldLevel2, level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport getApp_to_level2() {
		if (app_to_level2 != null && app_to_level2.eIsProxy()) {
			InternalEObject oldApp_to_level2 = (InternalEObject)app_to_level2;
			app_to_level2 = (TMTCIFExportExport)eResolveProxy(oldApp_to_level2);
			if (app_to_level2 != oldApp_to_level2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2, oldApp_to_level2, app_to_level2));
			}
		}
		return app_to_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport basicGetApp_to_level2() {
		return app_to_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level2(TMTCIFExportExport newApp_to_level2) {
		TMTCIFExportExport oldApp_to_level2 = app_to_level2;
		app_to_level2 = newApp_to_level2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2, oldApp_to_level2, app_to_level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel1() {
		if (level1 != null && level1.eIsProxy()) {
			InternalEObject oldLevel1 = (InternalEObject)level1;
			level1 = (TMTCIFFormatFormat)eResolveProxy(oldLevel1);
			if (level1 != oldLevel1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1, oldLevel1, level1));
			}
		}
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel1() {
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1(TMTCIFFormatFormat newLevel1) {
		TMTCIFFormatFormat oldLevel1 = level1;
		level1 = newLevel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1, oldLevel1, level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport getLevel2_to_level1() {
		if (level2_to_level1 != null && level2_to_level1.eIsProxy()) {
			InternalEObject oldLevel2_to_level1 = (InternalEObject)level2_to_level1;
			level2_to_level1 = (TMTCIFExportExport)eResolveProxy(oldLevel2_to_level1);
			if (level2_to_level1 != oldLevel2_to_level1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1, oldLevel2_to_level1, level2_to_level1));
			}
		}
		return level2_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport basicGetLevel2_to_level1() {
		return level2_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_to_level1(TMTCIFExportExport newLevel2_to_level1) {
		TMTCIFExportExport oldLevel2_to_level1 = level2_to_level1;
		level2_to_level1 = newLevel2_to_level1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1, oldLevel2_to_level1, level2_to_level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel0() {
		if (level0 != null && level0.eIsProxy()) {
			InternalEObject oldLevel0 = (InternalEObject)level0;
			level0 = (TMTCIFFormatFormat)eResolveProxy(oldLevel0);
			if (level0 != oldLevel0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0, oldLevel0, level0));
			}
		}
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(TMTCIFFormatFormat newLevel0) {
		TMTCIFFormatFormat oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0, oldLevel0, level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport getLevel1_to_level0() {
		if (level1_to_level0 != null && level1_to_level0.eIsProxy()) {
			InternalEObject oldLevel1_to_level0 = (InternalEObject)level1_to_level0;
			level1_to_level0 = (TMTCIFExportExport)eResolveProxy(oldLevel1_to_level0);
			if (level1_to_level0 != oldLevel1_to_level0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
			}
		}
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport basicGetLevel1_to_level0() {
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_to_level0(TMTCIFExportExport newLevel1_to_level0) {
		TMTCIFExportExport oldLevel1_to_level0 = level1_to_level0;
		level1_to_level0 = newLevel1_to_level0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME:
				return getName();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__ID:
				return getId();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF:
				return getIfRef();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE:
				return getPeriod_value();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT:
				return getPeriod_unit();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2:
				if (resolve) return getLevel2();
				return basicGetLevel2();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				if (resolve) return getApp_to_level2();
				return basicGetApp_to_level2();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1:
				if (resolve) return getLevel1();
				return basicGetLevel1();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				if (resolve) return getLevel2_to_level1();
				return basicGetLevel2_to_level1();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				if (resolve) return getLevel1_to_level0();
				return basicGetLevel1_to_level0();
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME:
				setName((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__ID:
				setId((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF:
				setIfRef((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE:
				setPeriod_value((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT:
				setPeriod_unit((GSSConfigUnit)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2:
				setLevel2((TMTCIFFormatFormat)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				setApp_to_level2((TMTCIFExportExport)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1:
				setLevel1((TMTCIFFormatFormat)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((TMTCIFExportExport)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0:
				setLevel0((TMTCIFFormatFormat)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((TMTCIFExportExport)newValue);
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME:
				setName(NAME_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__ID:
				setId(ID_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE:
				setPeriod_value(PERIOD_VALUE_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT:
				unsetPeriod_unit();
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2:
				setLevel2((TMTCIFFormatFormat)null);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				setApp_to_level2((TMTCIFExportExport)null);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1:
				setLevel1((TMTCIFFormatFormat)null);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((TMTCIFExportExport)null);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0:
				setLevel0((TMTCIFFormatFormat)null);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((TMTCIFExportExport)null);
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE:
				return PERIOD_VALUE_EDEFAULT == null ? period_value != null : !PERIOD_VALUE_EDEFAULT.equals(period_value);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT:
				return isSetPeriod_unit();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2:
				return level2 != null;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				return app_to_level2 != null;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1:
				return level1 != null;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				return level2_to_level1 != null;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0:
				return level0 != null;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				return level1_to_level0 != null;
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
		if (period_unitESet) result.append(period_unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSConfigPeriodicTCLevel2Impl
