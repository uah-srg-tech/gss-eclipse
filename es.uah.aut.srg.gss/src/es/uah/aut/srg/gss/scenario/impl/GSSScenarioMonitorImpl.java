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

import es.uah.aut.srg.gss.scenario.GSSScenarioGVRef;
import es.uah.aut.srg.gss.scenario.GSSScenarioMonitor;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorImpl#getGVRef <em>GV Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GSSScenarioMonitorImpl extends MinimalEObjectImpl.Container implements GSSScenarioMonitor {
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
	 * The cached value of the '{@link #getGVRef() <em>GV Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGVRef()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioGVRef gvRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioMonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_MONITOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_MONITOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioGVRef getGVRef() {
		return gvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGVRef(GSSScenarioGVRef newGVRef, NotificationChain msgs) {
		GSSScenarioGVRef oldGVRef = gvRef;
		gvRef = newGVRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_MONITOR__GV_REF, oldGVRef, newGVRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGVRef(GSSScenarioGVRef newGVRef) {
		if (newGVRef != gvRef) {
			NotificationChain msgs = null;
			if (gvRef != null)
				msgs = ((InternalEObject)gvRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_MONITOR__GV_REF, null, msgs);
			if (newGVRef != null)
				msgs = ((InternalEObject)newGVRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_MONITOR__GV_REF, null, msgs);
			msgs = basicSetGVRef(newGVRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_MONITOR__GV_REF, newGVRef, newGVRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_MONITOR__GV_REF:
				return basicSetGVRef(null, msgs);
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
			case scenarioPackage.GSS_SCENARIO_MONITOR__NAME:
				return getName();
			case scenarioPackage.GSS_SCENARIO_MONITOR__GV_REF:
				return getGVRef();
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
			case scenarioPackage.GSS_SCENARIO_MONITOR__NAME:
				setName((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_MONITOR__GV_REF:
				setGVRef((GSSScenarioGVRef)newValue);
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
			case scenarioPackage.GSS_SCENARIO_MONITOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_MONITOR__GV_REF:
				setGVRef((GSSScenarioGVRef)null);
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
			case scenarioPackage.GSS_SCENARIO_MONITOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case scenarioPackage.GSS_SCENARIO_MONITOR__GV_REF:
				return gvRef != null;
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

} //GSSScenarioMonitorImpl
