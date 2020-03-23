/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.scenario.impl;

import es.uah.aut.srg.gss.filter.GSSFilterFilter;

import es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable;
import es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriod;
import es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData;
import es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket;
import es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

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
 * An implementation of the model object '<em><b>GSS Scenario Special Packet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getLevelRef <em>Level Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getUpperLevels <em>Upper Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getPrintingData <em>Printing Data</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl#getIntervalRange <em>Interval Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioSpecialPacketImpl extends MinimalEObjectImpl.Container implements GSSScenarioSpecialPacket {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioEnableDisable STATUS_EDEFAULT = GSSScenarioEnableDisable.DISABLED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioEnableDisable status = STATUS_EDEFAULT;

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
	protected GSSFilterFilter inputFilter;

	/**
	 * The cached value of the '{@link #getUpperLevels() <em>Upper Levels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLevels()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioUpperLevels> upperLevels;

	/**
	 * The cached value of the '{@link #getPrintingData() <em>Printing Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintingData()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioPrintingData printingData;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioPeriod period;

	/**
	 * The cached value of the '{@link #getIntervalRange() <em>Interval Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalRange()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioIntervalRange intervalRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioSpecialPacketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_SPECIAL_PACKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioEnableDisable getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(GSSScenarioEnableDisable newStatus) {
		GSSScenarioEnableDisable oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__IF_REF, oldIfRef, ifRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVELS, oldLevels, levels));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVEL_REF, oldLevelRef, levelRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter getInputFilter() {
		if (inputFilter != null && inputFilter.eIsProxy()) {
			InternalEObject oldInputFilter = (InternalEObject)inputFilter;
			inputFilter = (GSSFilterFilter)eResolveProxy(oldInputFilter);
			if (inputFilter != oldInputFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INPUT_FILTER, oldInputFilter, inputFilter));
			}
		}
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter basicGetInputFilter() {
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFilter(GSSFilterFilter newInputFilter) {
		GSSFilterFilter oldInputFilter = inputFilter;
		inputFilter = newInputFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INPUT_FILTER, oldInputFilter, inputFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioUpperLevels> getUpperLevels() {
		if (upperLevels == null) {
			upperLevels = new EObjectContainmentEList<GSSScenarioUpperLevels>(GSSScenarioUpperLevels.class, this, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__UPPER_LEVELS);
		}
		return upperLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPrintingData getPrintingData() {
		return printingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrintingData(GSSScenarioPrintingData newPrintingData, NotificationChain msgs) {
		GSSScenarioPrintingData oldPrintingData = printingData;
		printingData = newPrintingData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA, oldPrintingData, newPrintingData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintingData(GSSScenarioPrintingData newPrintingData) {
		if (newPrintingData != printingData) {
			NotificationChain msgs = null;
			if (printingData != null)
				msgs = ((InternalEObject)printingData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA, null, msgs);
			if (newPrintingData != null)
				msgs = ((InternalEObject)newPrintingData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA, null, msgs);
			msgs = basicSetPrintingData(newPrintingData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA, newPrintingData, newPrintingData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPeriod getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(GSSScenarioPeriod newPeriod, NotificationChain msgs) {
		GSSScenarioPeriod oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(GSSScenarioPeriod newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioIntervalRange getIntervalRange() {
		return intervalRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntervalRange(GSSScenarioIntervalRange newIntervalRange, NotificationChain msgs) {
		GSSScenarioIntervalRange oldIntervalRange = intervalRange;
		intervalRange = newIntervalRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE, oldIntervalRange, newIntervalRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalRange(GSSScenarioIntervalRange newIntervalRange) {
		if (newIntervalRange != intervalRange) {
			NotificationChain msgs = null;
			if (intervalRange != null)
				msgs = ((InternalEObject)intervalRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE, null, msgs);
			if (newIntervalRange != null)
				msgs = ((InternalEObject)newIntervalRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE, null, msgs);
			msgs = basicSetIntervalRange(newIntervalRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE, newIntervalRange, newIntervalRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__UPPER_LEVELS:
				return ((InternalEList<?>)getUpperLevels()).basicRemove(otherEnd, msgs);
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA:
				return basicSetPrintingData(null, msgs);
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PERIOD:
				return basicSetPeriod(null, msgs);
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE:
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
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__STATUS:
				return getStatus();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__NAME:
				return getName();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__ID:
				return getId();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__IF_REF:
				return getIfRef();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVELS:
				return getLevels();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVEL_REF:
				return getLevelRef();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INPUT_FILTER:
				if (resolve) return getInputFilter();
				return basicGetInputFilter();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__UPPER_LEVELS:
				return getUpperLevels();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA:
				return getPrintingData();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PERIOD:
				return getPeriod();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE:
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
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__STATUS:
				setStatus((GSSScenarioEnableDisable)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__NAME:
				setName((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__ID:
				setId((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__IF_REF:
				setIfRef((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVELS:
				setLevels((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVEL_REF:
				setLevelRef((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INPUT_FILTER:
				setInputFilter((GSSFilterFilter)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__UPPER_LEVELS:
				getUpperLevels().clear();
				getUpperLevels().addAll((Collection<? extends GSSScenarioUpperLevels>)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA:
				setPrintingData((GSSScenarioPrintingData)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PERIOD:
				setPeriod((GSSScenarioPeriod)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE:
				setIntervalRange((GSSScenarioIntervalRange)newValue);
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
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__ID:
				setId(ID_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVELS:
				setLevels(LEVELS_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVEL_REF:
				setLevelRef(LEVEL_REF_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INPUT_FILTER:
				setInputFilter((GSSFilterFilter)null);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__UPPER_LEVELS:
				getUpperLevels().clear();
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA:
				setPrintingData((GSSScenarioPrintingData)null);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PERIOD:
				setPeriod((GSSScenarioPeriod)null);
				return;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE:
				setIntervalRange((GSSScenarioIntervalRange)null);
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
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__STATUS:
				return status != STATUS_EDEFAULT;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVELS:
				return LEVELS_EDEFAULT == null ? levels != null : !LEVELS_EDEFAULT.equals(levels);
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__LEVEL_REF:
				return LEVEL_REF_EDEFAULT == null ? levelRef != null : !LEVEL_REF_EDEFAULT.equals(levelRef);
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INPUT_FILTER:
				return inputFilter != null;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__UPPER_LEVELS:
				return upperLevels != null && !upperLevels.isEmpty();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA:
				return printingData != null;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__PERIOD:
				return period != null;
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE:
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

} //GSSScenarioSpecialPacketImpl
