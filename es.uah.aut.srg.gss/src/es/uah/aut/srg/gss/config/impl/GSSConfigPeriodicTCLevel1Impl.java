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

import es.uah.aut.srg.gss.config.GSSConfigAppToLevel1;
import es.uah.aut.srg.gss.config.GSSConfigLevel0;
import es.uah.aut.srg.gss.config.GSSConfigLevel1;
import es.uah.aut.srg.gss.config.GSSConfigLevel1ToLevel0;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1;
import es.uah.aut.srg.gss.config.GSSConfigUnit;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Periodic TC Level1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl#getPeriod_value <em>Period value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl#getPeriod_unit <em>Period unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl#getApp_to_level1 <em>App to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigPeriodicTCLevel1Impl extends MinimalEObjectImpl.Container implements GSSConfigPeriodicTCLevel1 {
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
	 * The cached value of the '{@link #getLevel1() <em>Level1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigLevel1 level1;

	/**
	 * The cached value of the '{@link #getApp_to_level1() <em>App to level1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level1()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigAppToLevel1 app_to_level1;

	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigLevel0 level0;

	/**
	 * The cached value of the '{@link #getLevel1_to_level0() <em>Level1 to level0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_to_level0()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigLevel1ToLevel0 level1_to_level0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigPeriodicTCLevel1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_PERIODIC_TC_LEVEL1;
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF, oldIfRef, ifRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE, oldPeriod_value, period_value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT, oldPeriod_unit, period_unit, !oldPeriod_unitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT, oldPeriod_unit, PERIOD_UNIT_EDEFAULT, oldPeriod_unitESet));
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
	public GSSConfigLevel1 getLevel1() {
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel1(GSSConfigLevel1 newLevel1, NotificationChain msgs) {
		GSSConfigLevel1 oldLevel1 = level1;
		level1 = newLevel1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1, oldLevel1, newLevel1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1(GSSConfigLevel1 newLevel1) {
		if (newLevel1 != level1) {
			NotificationChain msgs = null;
			if (level1 != null)
				msgs = ((InternalEObject)level1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1, null, msgs);
			if (newLevel1 != null)
				msgs = ((InternalEObject)newLevel1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1, null, msgs);
			msgs = basicSetLevel1(newLevel1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1, newLevel1, newLevel1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigAppToLevel1 getApp_to_level1() {
		return app_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApp_to_level1(GSSConfigAppToLevel1 newApp_to_level1, NotificationChain msgs) {
		GSSConfigAppToLevel1 oldApp_to_level1 = app_to_level1;
		app_to_level1 = newApp_to_level1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1, oldApp_to_level1, newApp_to_level1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level1(GSSConfigAppToLevel1 newApp_to_level1) {
		if (newApp_to_level1 != app_to_level1) {
			NotificationChain msgs = null;
			if (app_to_level1 != null)
				msgs = ((InternalEObject)app_to_level1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1, null, msgs);
			if (newApp_to_level1 != null)
				msgs = ((InternalEObject)newApp_to_level1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1, null, msgs);
			msgs = basicSetApp_to_level1(newApp_to_level1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1, newApp_to_level1, newApp_to_level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigLevel0 getLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel0(GSSConfigLevel0 newLevel0, NotificationChain msgs) {
		GSSConfigLevel0 oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0, oldLevel0, newLevel0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(GSSConfigLevel0 newLevel0) {
		if (newLevel0 != level0) {
			NotificationChain msgs = null;
			if (level0 != null)
				msgs = ((InternalEObject)level0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0, null, msgs);
			if (newLevel0 != null)
				msgs = ((InternalEObject)newLevel0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0, null, msgs);
			msgs = basicSetLevel0(newLevel0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0, newLevel0, newLevel0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigLevel1ToLevel0 getLevel1_to_level0() {
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel1_to_level0(GSSConfigLevel1ToLevel0 newLevel1_to_level0, NotificationChain msgs) {
		GSSConfigLevel1ToLevel0 oldLevel1_to_level0 = level1_to_level0;
		level1_to_level0 = newLevel1_to_level0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, newLevel1_to_level0);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_to_level0(GSSConfigLevel1ToLevel0 newLevel1_to_level0) {
		if (newLevel1_to_level0 != level1_to_level0) {
			NotificationChain msgs = null;
			if (level1_to_level0 != null)
				msgs = ((InternalEObject)level1_to_level0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0, null, msgs);
			if (newLevel1_to_level0 != null)
				msgs = ((InternalEObject)newLevel1_to_level0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0, null, msgs);
			msgs = basicSetLevel1_to_level0(newLevel1_to_level0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0, newLevel1_to_level0, newLevel1_to_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1:
				return basicSetLevel1(null, msgs);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1:
				return basicSetApp_to_level1(null, msgs);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0:
				return basicSetLevel0(null, msgs);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0:
				return basicSetLevel1_to_level0(null, msgs);
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME:
				return getName();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__ID:
				return getId();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF:
				return getIfRef();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE:
				return getPeriod_value();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT:
				return getPeriod_unit();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1:
				return getLevel1();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1:
				return getApp_to_level1();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0:
				return getLevel0();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0:
				return getLevel1_to_level0();
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME:
				setName((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__ID:
				setId((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF:
				setIfRef((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE:
				setPeriod_value((String)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT:
				setPeriod_unit((GSSConfigUnit)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1:
				setLevel1((GSSConfigLevel1)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1:
				setApp_to_level1((GSSConfigAppToLevel1)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0:
				setLevel0((GSSConfigLevel0)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((GSSConfigLevel1ToLevel0)newValue);
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__ID:
				setId(ID_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE:
				setPeriod_value(PERIOD_VALUE_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT:
				unsetPeriod_unit();
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1:
				setLevel1((GSSConfigLevel1)null);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1:
				setApp_to_level1((GSSConfigAppToLevel1)null);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0:
				setLevel0((GSSConfigLevel0)null);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((GSSConfigLevel1ToLevel0)null);
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
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE:
				return PERIOD_VALUE_EDEFAULT == null ? period_value != null : !PERIOD_VALUE_EDEFAULT.equals(period_value);
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT:
				return isSetPeriod_unit();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1:
				return level1 != null;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1:
				return app_to_level1 != null;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0:
				return level0 != null;
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0:
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

} //GSSConfigPeriodicTCLevel1Impl
