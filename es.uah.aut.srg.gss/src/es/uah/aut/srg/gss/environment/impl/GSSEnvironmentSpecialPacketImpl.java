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

import es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable;
import es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData;
import es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket;
import es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevels;
import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter;

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
 * An implementation of the model object '<em><b>GSS Environment Special Packet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getLevelRef <em>Level Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getUpperLevels <em>Upper Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getPrintingData <em>Printing Data</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl#getIntervalRange <em>Interval Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentSpecialPacketImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentSpecialPacket {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentEnableDisable STATUS_EDEFAULT = GSSEnvironmentEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentEnableDisable status = STATUS_EDEFAULT;

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
	 * The default value of the '{@link #getLevels() <em>Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected String levels = LEVELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelRef() <em>Level Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelRef() <em>Level Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRef()
	 * @generated
	 * @ordered
	 */
	protected String levelRef = LEVEL_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputFilter() <em>Input Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFilter()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFilterFilter inputFilter;

	/**
	 * The cached value of the '{@link #getUpperLevels() <em>Upper Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentUpperLevels> upperLevels;

	/**
	 * The cached value of the '{@link #getPrintingData() <em>Printing Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintingData()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentPrintingData printingData;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentPeriod period;

	/**
	 * The cached value of the '{@link #getIntervalRange() <em>Interval Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalRange()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentIntervalRange intervalRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentSpecialPacketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_SPECIAL_PACKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentEnableDisable getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(GSSEnvironmentEnableDisable newStatus) {
		GSSEnvironmentEnableDisable oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__IF_REF, oldIfRef, ifRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevels() {
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevels(String newLevels) {
		String oldLevels = levels;
		levels = newLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVELS, oldLevels, levels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevelRef() {
		return levelRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelRef(String newLevelRef) {
		String oldLevelRef = levelRef;
		levelRef = newLevelRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVEL_REF, oldLevelRef, levelRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFilter getInputFilter() {
		if (inputFilter != null && inputFilter.eIsProxy()) {
			InternalEObject oldInputFilter = (InternalEObject)inputFilter;
			inputFilter = (TMTCIFFilterFilter)eResolveProxy(oldInputFilter);
			if (inputFilter != oldInputFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INPUT_FILTER, oldInputFilter, inputFilter));
			}
		}
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFilter basicGetInputFilter() {
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFilter(TMTCIFFilterFilter newInputFilter) {
		TMTCIFFilterFilter oldInputFilter = inputFilter;
		inputFilter = newInputFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INPUT_FILTER, oldInputFilter, inputFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentUpperLevels> getUpperLevels() {
		if (upperLevels == null) {
			upperLevels = new EObjectContainmentEList<GSSEnvironmentUpperLevels>(GSSEnvironmentUpperLevels.class, this, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__UPPER_LEVELS);
		}
		return upperLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPrintingData getPrintingData() {
		return printingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrintingData(GSSEnvironmentPrintingData newPrintingData, NotificationChain msgs) {
		GSSEnvironmentPrintingData oldPrintingData = printingData;
		printingData = newPrintingData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA, oldPrintingData, newPrintingData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintingData(GSSEnvironmentPrintingData newPrintingData) {
		if (newPrintingData != printingData) {
			NotificationChain msgs = null;
			if (printingData != null)
				msgs = ((InternalEObject)printingData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA, null, msgs);
			if (newPrintingData != null)
				msgs = ((InternalEObject)newPrintingData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA, null, msgs);
			msgs = basicSetPrintingData(newPrintingData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA, newPrintingData, newPrintingData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPeriod getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(GSSEnvironmentPeriod newPeriod, NotificationChain msgs) {
		GSSEnvironmentPeriod oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(GSSEnvironmentPeriod newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentIntervalRange getIntervalRange() {
		return intervalRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalRange(GSSEnvironmentIntervalRange newIntervalRange, NotificationChain msgs) {
		GSSEnvironmentIntervalRange oldIntervalRange = intervalRange;
		intervalRange = newIntervalRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE, oldIntervalRange, newIntervalRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalRange(GSSEnvironmentIntervalRange newIntervalRange) {
		if (newIntervalRange != intervalRange) {
			NotificationChain msgs = null;
			if (intervalRange != null)
				msgs = ((InternalEObject)intervalRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE, null, msgs);
			if (newIntervalRange != null)
				msgs = ((InternalEObject)newIntervalRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE, null, msgs);
			msgs = basicSetIntervalRange(newIntervalRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE, newIntervalRange, newIntervalRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__UPPER_LEVELS:
				return ((InternalEList<?>)getUpperLevels()).basicRemove(otherEnd, msgs);
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA:
				return basicSetPrintingData(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD:
				return basicSetPeriod(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE:
				return basicSetIntervalRange(null, msgs);
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
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__STATUS:
				return getStatus();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__NAME:
				return getName();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__ID:
				return getId();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__IF_REF:
				return getIfRef();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVELS:
				return getLevels();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVEL_REF:
				return getLevelRef();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INPUT_FILTER:
				if (resolve) return getInputFilter();
				return basicGetInputFilter();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__UPPER_LEVELS:
				return getUpperLevels();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA:
				return getPrintingData();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD:
				return getPeriod();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE:
				return getIntervalRange();
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
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__STATUS:
				setStatus((GSSEnvironmentEnableDisable)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__NAME:
				setName((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__ID:
				setId((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__IF_REF:
				setIfRef((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVELS:
				setLevels((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVEL_REF:
				setLevelRef((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INPUT_FILTER:
				setInputFilter((TMTCIFFilterFilter)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__UPPER_LEVELS:
				getUpperLevels().clear();
				getUpperLevels().addAll((Collection<? extends GSSEnvironmentUpperLevels>)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA:
				setPrintingData((GSSEnvironmentPrintingData)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD:
				setPeriod((GSSEnvironmentPeriod)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE:
				setIntervalRange((GSSEnvironmentIntervalRange)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__ID:
				setId(ID_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVELS:
				setLevels(LEVELS_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVEL_REF:
				setLevelRef(LEVEL_REF_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INPUT_FILTER:
				setInputFilter((TMTCIFFilterFilter)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__UPPER_LEVELS:
				getUpperLevels().clear();
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA:
				setPrintingData((GSSEnvironmentPrintingData)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD:
				setPeriod((GSSEnvironmentPeriod)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE:
				setIntervalRange((GSSEnvironmentIntervalRange)null);
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
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__STATUS:
				return status != STATUS_EDEFAULT;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVELS:
				return LEVELS_EDEFAULT == null ? levels != null : !LEVELS_EDEFAULT.equals(levels);
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__LEVEL_REF:
				return LEVEL_REF_EDEFAULT == null ? levelRef != null : !LEVEL_REF_EDEFAULT.equals(levelRef);
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INPUT_FILTER:
				return inputFilter != null;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__UPPER_LEVELS:
				return upperLevels != null && !upperLevels.isEmpty();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA:
				return printingData != null;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD:
				return period != null;
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE:
				return intervalRange != null;
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
		result.append(" (status: ");
		result.append(status);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", ifRef: ");
		result.append(ifRef);
		result.append(", levels: ");
		result.append(levels);
		result.append(", levelRef: ");
		result.append(levelRef);
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentSpecialPacketImpl
