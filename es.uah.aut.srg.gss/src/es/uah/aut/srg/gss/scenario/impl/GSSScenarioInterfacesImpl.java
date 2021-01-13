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

import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets;

import es.uah.aut.srg.gss.scenario.GSSScenarioInterface;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces;
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
 * An implementation of the model object '<em><b>GSS Scenario Interfaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfacesImpl#getProtocolPacketsFile <em>Protocol Packets File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfacesImpl#getMainInterface <em>Main Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfacesImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioInterfacesImpl extends MinimalEObjectImpl.Container implements GSSScenarioInterfaces {
	/**
	 * The cached value of the '{@link #getProtocolPacketsFile() <em>Protocol Packets File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolPacketsFile()
	 * @generated
	 * @ordered
	 */
	protected GSSProtocolPacketsProtocolPackets protocolPacketsFile;

	/**
	 * The cached value of the '{@link #getMainInterface() <em>Main Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainInterface()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioInterface mainInterface;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioInterface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioInterfacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_INTERFACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsProtocolPackets getProtocolPacketsFile() {
		if (protocolPacketsFile != null && protocolPacketsFile.eIsProxy()) {
			InternalEObject oldProtocolPacketsFile = (InternalEObject)protocolPacketsFile;
			protocolPacketsFile = (GSSProtocolPacketsProtocolPackets)eResolveProxy(oldProtocolPacketsFile);
			if (protocolPacketsFile != oldProtocolPacketsFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_INTERFACES__PROTOCOL_PACKETS_FILE, oldProtocolPacketsFile, protocolPacketsFile));
			}
		}
		return protocolPacketsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsProtocolPackets basicGetProtocolPacketsFile() {
		return protocolPacketsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolPacketsFile(GSSProtocolPacketsProtocolPackets newProtocolPacketsFile) {
		GSSProtocolPacketsProtocolPackets oldProtocolPacketsFile = protocolPacketsFile;
		protocolPacketsFile = newProtocolPacketsFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_INTERFACES__PROTOCOL_PACKETS_FILE, oldProtocolPacketsFile, protocolPacketsFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInterface getMainInterface() {
		return mainInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainInterface(GSSScenarioInterface newMainInterface, NotificationChain msgs) {
		GSSScenarioInterface oldMainInterface = mainInterface;
		mainInterface = newMainInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_INTERFACES__MAIN_INTERFACE, oldMainInterface, newMainInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainInterface(GSSScenarioInterface newMainInterface) {
		if (newMainInterface != mainInterface) {
			NotificationChain msgs = null;
			if (mainInterface != null)
				msgs = ((InternalEObject)mainInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_INTERFACES__MAIN_INTERFACE, null, msgs);
			if (newMainInterface != null)
				msgs = ((InternalEObject)newMainInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_INTERFACES__MAIN_INTERFACE, null, msgs);
			msgs = basicSetMainInterface(newMainInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_INTERFACES__MAIN_INTERFACE, newMainInterface, newMainInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<GSSScenarioInterface>(GSSScenarioInterface.class, this, scenarioPackage.GSS_SCENARIO_INTERFACES__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_INTERFACES__MAIN_INTERFACE:
				return basicSetMainInterface(null, msgs);
			case scenarioPackage.GSS_SCENARIO_INTERFACES__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
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
			case scenarioPackage.GSS_SCENARIO_INTERFACES__PROTOCOL_PACKETS_FILE:
				if (resolve) return getProtocolPacketsFile();
				return basicGetProtocolPacketsFile();
			case scenarioPackage.GSS_SCENARIO_INTERFACES__MAIN_INTERFACE:
				return getMainInterface();
			case scenarioPackage.GSS_SCENARIO_INTERFACES__INTERFACE:
				return getInterface();
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
			case scenarioPackage.GSS_SCENARIO_INTERFACES__PROTOCOL_PACKETS_FILE:
				setProtocolPacketsFile((GSSProtocolPacketsProtocolPackets)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACES__MAIN_INTERFACE:
				setMainInterface((GSSScenarioInterface)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACES__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends GSSScenarioInterface>)newValue);
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
			case scenarioPackage.GSS_SCENARIO_INTERFACES__PROTOCOL_PACKETS_FILE:
				setProtocolPacketsFile((GSSProtocolPacketsProtocolPackets)null);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACES__MAIN_INTERFACE:
				setMainInterface((GSSScenarioInterface)null);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACES__INTERFACE:
				getInterface().clear();
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
			case scenarioPackage.GSS_SCENARIO_INTERFACES__PROTOCOL_PACKETS_FILE:
				return protocolPacketsFile != null;
			case scenarioPackage.GSS_SCENARIO_INTERFACES__MAIN_INTERFACE:
				return mainInterface != null;
			case scenarioPackage.GSS_SCENARIO_INTERFACES__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSScenarioInterfacesImpl
