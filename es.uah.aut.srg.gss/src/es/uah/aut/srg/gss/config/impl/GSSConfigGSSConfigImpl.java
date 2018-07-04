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

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.config.GSSConfigGSSConfig;
import es.uah.aut.srg.gss.config.GSSConfigGSSOptions;
import es.uah.aut.srg.gss.config.GSSConfigGlobalVars;
import es.uah.aut.srg.gss.config.GSSConfigInterfaces;
import es.uah.aut.srg.gss.config.GSSConfigMonitors;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs;
import es.uah.aut.srg.gss.config.GSSConfigProtocols;
import es.uah.aut.srg.gss.config.GSSConfigSpecialPackets;
import es.uah.aut.srg.gss.config.GSSConfigTests;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config GSS Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl#getGss_options <em>Gss options</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl#getSpecialPackets <em>Special Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl#getPeriodicTCs <em>Periodic TCs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl#getGlobalVars <em>Global Vars</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigGSSConfigImpl extends GSSModelElementImpl implements GSSConfigGSSConfig {
	/**
	 * The cached value of the '{@link #getGss_options() <em>Gss options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGss_options()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigGSSOptions gss_options;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigProtocols protocols;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigInterfaces interfaces;

	/**
	 * The cached value of the '{@link #getSpecialPackets() <em>Special Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPackets()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigSpecialPackets specialPackets;

	/**
	 * The cached value of the '{@link #getPeriodicTCs() <em>Periodic TCs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTCs()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigPeriodicTCs periodicTCs;

	/**
	 * The cached value of the '{@link #getGlobalVars() <em>Global Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVars()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigGlobalVars globalVars;

	/**
	 * The cached value of the '{@link #getMonitors() <em>Monitors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitors()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigMonitors monitors;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigTests tests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigGSSConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_GSS_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGSSOptions getGss_options() {
		return gss_options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGss_options(GSSConfigGSSOptions newGss_options, NotificationChain msgs) {
		GSSConfigGSSOptions oldGss_options = gss_options;
		gss_options = newGss_options;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS, oldGss_options, newGss_options);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGss_options(GSSConfigGSSOptions newGss_options) {
		if (newGss_options != gss_options) {
			NotificationChain msgs = null;
			if (gss_options != null)
				msgs = ((InternalEObject)gss_options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS, null, msgs);
			if (newGss_options != null)
				msgs = ((InternalEObject)newGss_options).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS, null, msgs);
			msgs = basicSetGss_options(newGss_options, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS, newGss_options, newGss_options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigProtocols getProtocols() {
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocols(GSSConfigProtocols newProtocols, NotificationChain msgs) {
		GSSConfigProtocols oldProtocols = protocols;
		protocols = newProtocols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__PROTOCOLS, oldProtocols, newProtocols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocols(GSSConfigProtocols newProtocols) {
		if (newProtocols != protocols) {
			NotificationChain msgs = null;
			if (protocols != null)
				msgs = ((InternalEObject)protocols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__PROTOCOLS, null, msgs);
			if (newProtocols != null)
				msgs = ((InternalEObject)newProtocols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__PROTOCOLS, null, msgs);
			msgs = basicSetProtocols(newProtocols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__PROTOCOLS, newProtocols, newProtocols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigInterfaces getInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(GSSConfigInterfaces newInterfaces, NotificationChain msgs) {
		GSSConfigInterfaces oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__INTERFACES, oldInterfaces, newInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(GSSConfigInterfaces newInterfaces) {
		if (newInterfaces != interfaces) {
			NotificationChain msgs = null;
			if (interfaces != null)
				msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__INTERFACES, null, msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__INTERFACES, null, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__INTERFACES, newInterfaces, newInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigSpecialPackets getSpecialPackets() {
		return specialPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialPackets(GSSConfigSpecialPackets newSpecialPackets, NotificationChain msgs) {
		GSSConfigSpecialPackets oldSpecialPackets = specialPackets;
		specialPackets = newSpecialPackets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS, oldSpecialPackets, newSpecialPackets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialPackets(GSSConfigSpecialPackets newSpecialPackets) {
		if (newSpecialPackets != specialPackets) {
			NotificationChain msgs = null;
			if (specialPackets != null)
				msgs = ((InternalEObject)specialPackets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS, null, msgs);
			if (newSpecialPackets != null)
				msgs = ((InternalEObject)newSpecialPackets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS, null, msgs);
			msgs = basicSetSpecialPackets(newSpecialPackets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS, newSpecialPackets, newSpecialPackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPeriodicTCs getPeriodicTCs() {
		return periodicTCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodicTCs(GSSConfigPeriodicTCs newPeriodicTCs, NotificationChain msgs) {
		GSSConfigPeriodicTCs oldPeriodicTCs = periodicTCs;
		periodicTCs = newPeriodicTCs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS, oldPeriodicTCs, newPeriodicTCs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicTCs(GSSConfigPeriodicTCs newPeriodicTCs) {
		if (newPeriodicTCs != periodicTCs) {
			NotificationChain msgs = null;
			if (periodicTCs != null)
				msgs = ((InternalEObject)periodicTCs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS, null, msgs);
			if (newPeriodicTCs != null)
				msgs = ((InternalEObject)newPeriodicTCs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS, null, msgs);
			msgs = basicSetPeriodicTCs(newPeriodicTCs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS, newPeriodicTCs, newPeriodicTCs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGlobalVars getGlobalVars() {
		return globalVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalVars(GSSConfigGlobalVars newGlobalVars, NotificationChain msgs) {
		GSSConfigGlobalVars oldGlobalVars = globalVars;
		globalVars = newGlobalVars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS, oldGlobalVars, newGlobalVars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalVars(GSSConfigGlobalVars newGlobalVars) {
		if (newGlobalVars != globalVars) {
			NotificationChain msgs = null;
			if (globalVars != null)
				msgs = ((InternalEObject)globalVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS, null, msgs);
			if (newGlobalVars != null)
				msgs = ((InternalEObject)newGlobalVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS, null, msgs);
			msgs = basicSetGlobalVars(newGlobalVars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS, newGlobalVars, newGlobalVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigMonitors getMonitors() {
		return monitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitors(GSSConfigMonitors newMonitors, NotificationChain msgs) {
		GSSConfigMonitors oldMonitors = monitors;
		monitors = newMonitors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__MONITORS, oldMonitors, newMonitors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitors(GSSConfigMonitors newMonitors) {
		if (newMonitors != monitors) {
			NotificationChain msgs = null;
			if (monitors != null)
				msgs = ((InternalEObject)monitors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__MONITORS, null, msgs);
			if (newMonitors != null)
				msgs = ((InternalEObject)newMonitors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__MONITORS, null, msgs);
			msgs = basicSetMonitors(newMonitors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__MONITORS, newMonitors, newMonitors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigTests getTests() {
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTests(GSSConfigTests newTests, NotificationChain msgs) {
		GSSConfigTests oldTests = tests;
		tests = newTests;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__TESTS, oldTests, newTests);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTests(GSSConfigTests newTests) {
		if (newTests != tests) {
			NotificationChain msgs = null;
			if (tests != null)
				msgs = ((InternalEObject)tests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__TESTS, null, msgs);
			if (newTests != null)
				msgs = ((InternalEObject)newTests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_CONFIG__TESTS, null, msgs);
			msgs = basicSetTests(newTests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_CONFIG__TESTS, newTests, newTests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS:
				return basicSetGss_options(null, msgs);
			case configPackage.GSS_CONFIG_GSS_CONFIG__PROTOCOLS:
				return basicSetProtocols(null, msgs);
			case configPackage.GSS_CONFIG_GSS_CONFIG__INTERFACES:
				return basicSetInterfaces(null, msgs);
			case configPackage.GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS:
				return basicSetSpecialPackets(null, msgs);
			case configPackage.GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS:
				return basicSetPeriodicTCs(null, msgs);
			case configPackage.GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS:
				return basicSetGlobalVars(null, msgs);
			case configPackage.GSS_CONFIG_GSS_CONFIG__MONITORS:
				return basicSetMonitors(null, msgs);
			case configPackage.GSS_CONFIG_GSS_CONFIG__TESTS:
				return basicSetTests(null, msgs);
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
			case configPackage.GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS:
				return getGss_options();
			case configPackage.GSS_CONFIG_GSS_CONFIG__PROTOCOLS:
				return getProtocols();
			case configPackage.GSS_CONFIG_GSS_CONFIG__INTERFACES:
				return getInterfaces();
			case configPackage.GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS:
				return getSpecialPackets();
			case configPackage.GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS:
				return getPeriodicTCs();
			case configPackage.GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS:
				return getGlobalVars();
			case configPackage.GSS_CONFIG_GSS_CONFIG__MONITORS:
				return getMonitors();
			case configPackage.GSS_CONFIG_GSS_CONFIG__TESTS:
				return getTests();
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
			case configPackage.GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS:
				setGss_options((GSSConfigGSSOptions)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__PROTOCOLS:
				setProtocols((GSSConfigProtocols)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__INTERFACES:
				setInterfaces((GSSConfigInterfaces)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS:
				setSpecialPackets((GSSConfigSpecialPackets)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS:
				setPeriodicTCs((GSSConfigPeriodicTCs)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS:
				setGlobalVars((GSSConfigGlobalVars)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__MONITORS:
				setMonitors((GSSConfigMonitors)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__TESTS:
				setTests((GSSConfigTests)newValue);
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
			case configPackage.GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS:
				setGss_options((GSSConfigGSSOptions)null);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__PROTOCOLS:
				setProtocols((GSSConfigProtocols)null);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__INTERFACES:
				setInterfaces((GSSConfigInterfaces)null);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS:
				setSpecialPackets((GSSConfigSpecialPackets)null);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS:
				setPeriodicTCs((GSSConfigPeriodicTCs)null);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS:
				setGlobalVars((GSSConfigGlobalVars)null);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__MONITORS:
				setMonitors((GSSConfigMonitors)null);
				return;
			case configPackage.GSS_CONFIG_GSS_CONFIG__TESTS:
				setTests((GSSConfigTests)null);
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
			case configPackage.GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS:
				return gss_options != null;
			case configPackage.GSS_CONFIG_GSS_CONFIG__PROTOCOLS:
				return protocols != null;
			case configPackage.GSS_CONFIG_GSS_CONFIG__INTERFACES:
				return interfaces != null;
			case configPackage.GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS:
				return specialPackets != null;
			case configPackage.GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS:
				return periodicTCs != null;
			case configPackage.GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS:
				return globalVars != null;
			case configPackage.GSS_CONFIG_GSS_CONFIG__MONITORS:
				return monitors != null;
			case configPackage.GSS_CONFIG_GSS_CONFIG__TESTS:
				return tests != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSConfigGSSConfigImpl
