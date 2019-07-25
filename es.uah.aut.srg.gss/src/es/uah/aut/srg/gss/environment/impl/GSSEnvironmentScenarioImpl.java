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

import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces;
import es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors;
import es.uah.aut.srg.gss.environment.GSSEnvironmentOptions;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs;
import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols;
import es.uah.aut.srg.gss.environment.GSSEnvironmentScenario;
import es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl#getGss_options <em>Gss options</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl#getSpecialPackets <em>Special Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl#getPeriodicTCs <em>Periodic TCs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl#getGlobalVars <em>Global Vars</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl#getMonitors <em>Monitors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentScenarioImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentScenario {
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
	 * The cached value of the '{@link #getGss_options() <em>Gss options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGss_options()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentOptions gss_options;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentProtocols protocols;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentInterfaces interfaces;

	/**
	 * The cached value of the '{@link #getSpecialPackets() <em>Special Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPackets()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentSpecialPackets specialPackets;

	/**
	 * The cached value of the '{@link #getPeriodicTCs() <em>Periodic TCs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTCs()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentPeriodicTCs periodicTCs;

	/**
	 * The cached value of the '{@link #getGlobalVars() <em>Global Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVars()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentGlobalVars globalVars;

	/**
	 * The cached value of the '{@link #getMonitors() <em>Monitors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitors()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentMonitors monitors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_SCENARIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentOptions getGss_options() {
		return gss_options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGss_options(GSSEnvironmentOptions newGss_options, NotificationChain msgs) {
		GSSEnvironmentOptions oldGss_options = gss_options;
		gss_options = newGss_options;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS, oldGss_options, newGss_options);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGss_options(GSSEnvironmentOptions newGss_options) {
		if (newGss_options != gss_options) {
			NotificationChain msgs = null;
			if (gss_options != null)
				msgs = ((InternalEObject)gss_options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS, null, msgs);
			if (newGss_options != null)
				msgs = ((InternalEObject)newGss_options).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS, null, msgs);
			msgs = basicSetGss_options(newGss_options, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS, newGss_options, newGss_options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentProtocols getProtocols() {
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocols(GSSEnvironmentProtocols newProtocols, NotificationChain msgs) {
		GSSEnvironmentProtocols oldProtocols = protocols;
		protocols = newProtocols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__PROTOCOLS, oldProtocols, newProtocols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocols(GSSEnvironmentProtocols newProtocols) {
		if (newProtocols != protocols) {
			NotificationChain msgs = null;
			if (protocols != null)
				msgs = ((InternalEObject)protocols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__PROTOCOLS, null, msgs);
			if (newProtocols != null)
				msgs = ((InternalEObject)newProtocols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__PROTOCOLS, null, msgs);
			msgs = basicSetProtocols(newProtocols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__PROTOCOLS, newProtocols, newProtocols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentInterfaces getInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(GSSEnvironmentInterfaces newInterfaces, NotificationChain msgs) {
		GSSEnvironmentInterfaces oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__INTERFACES, oldInterfaces, newInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(GSSEnvironmentInterfaces newInterfaces) {
		if (newInterfaces != interfaces) {
			NotificationChain msgs = null;
			if (interfaces != null)
				msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__INTERFACES, null, msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__INTERFACES, null, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__INTERFACES, newInterfaces, newInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentSpecialPackets getSpecialPackets() {
		return specialPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialPackets(GSSEnvironmentSpecialPackets newSpecialPackets, NotificationChain msgs) {
		GSSEnvironmentSpecialPackets oldSpecialPackets = specialPackets;
		specialPackets = newSpecialPackets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS, oldSpecialPackets, newSpecialPackets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialPackets(GSSEnvironmentSpecialPackets newSpecialPackets) {
		if (newSpecialPackets != specialPackets) {
			NotificationChain msgs = null;
			if (specialPackets != null)
				msgs = ((InternalEObject)specialPackets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS, null, msgs);
			if (newSpecialPackets != null)
				msgs = ((InternalEObject)newSpecialPackets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS, null, msgs);
			msgs = basicSetSpecialPackets(newSpecialPackets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS, newSpecialPackets, newSpecialPackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPeriodicTCs getPeriodicTCs() {
		return periodicTCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodicTCs(GSSEnvironmentPeriodicTCs newPeriodicTCs, NotificationChain msgs) {
		GSSEnvironmentPeriodicTCs oldPeriodicTCs = periodicTCs;
		periodicTCs = newPeriodicTCs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS, oldPeriodicTCs, newPeriodicTCs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicTCs(GSSEnvironmentPeriodicTCs newPeriodicTCs) {
		if (newPeriodicTCs != periodicTCs) {
			NotificationChain msgs = null;
			if (periodicTCs != null)
				msgs = ((InternalEObject)periodicTCs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS, null, msgs);
			if (newPeriodicTCs != null)
				msgs = ((InternalEObject)newPeriodicTCs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS, null, msgs);
			msgs = basicSetPeriodicTCs(newPeriodicTCs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS, newPeriodicTCs, newPeriodicTCs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGlobalVars getGlobalVars() {
		return globalVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalVars(GSSEnvironmentGlobalVars newGlobalVars, NotificationChain msgs) {
		GSSEnvironmentGlobalVars oldGlobalVars = globalVars;
		globalVars = newGlobalVars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS, oldGlobalVars, newGlobalVars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalVars(GSSEnvironmentGlobalVars newGlobalVars) {
		if (newGlobalVars != globalVars) {
			NotificationChain msgs = null;
			if (globalVars != null)
				msgs = ((InternalEObject)globalVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS, null, msgs);
			if (newGlobalVars != null)
				msgs = ((InternalEObject)newGlobalVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS, null, msgs);
			msgs = basicSetGlobalVars(newGlobalVars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS, newGlobalVars, newGlobalVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentMonitors getMonitors() {
		return monitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitors(GSSEnvironmentMonitors newMonitors, NotificationChain msgs) {
		GSSEnvironmentMonitors oldMonitors = monitors;
		monitors = newMonitors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__MONITORS, oldMonitors, newMonitors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitors(GSSEnvironmentMonitors newMonitors) {
		if (newMonitors != monitors) {
			NotificationChain msgs = null;
			if (monitors != null)
				msgs = ((InternalEObject)monitors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__MONITORS, null, msgs);
			if (newMonitors != null)
				msgs = ((InternalEObject)newMonitors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_SCENARIO__MONITORS, null, msgs);
			msgs = basicSetMonitors(newMonitors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_SCENARIO__MONITORS, newMonitors, newMonitors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS:
				return basicSetGss_options(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PROTOCOLS:
				return basicSetProtocols(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__INTERFACES:
				return basicSetInterfaces(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS:
				return basicSetSpecialPackets(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS:
				return basicSetPeriodicTCs(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS:
				return basicSetGlobalVars(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__MONITORS:
				return basicSetMonitors(null, msgs);
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
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__NAME:
				return getName();
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__ID:
				return getId();
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS:
				return getGss_options();
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PROTOCOLS:
				return getProtocols();
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__INTERFACES:
				return getInterfaces();
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS:
				return getSpecialPackets();
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS:
				return getPeriodicTCs();
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS:
				return getGlobalVars();
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__MONITORS:
				return getMonitors();
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
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__NAME:
				setName((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__ID:
				setId((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS:
				setGss_options((GSSEnvironmentOptions)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PROTOCOLS:
				setProtocols((GSSEnvironmentProtocols)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__INTERFACES:
				setInterfaces((GSSEnvironmentInterfaces)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS:
				setSpecialPackets((GSSEnvironmentSpecialPackets)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS:
				setPeriodicTCs((GSSEnvironmentPeriodicTCs)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS:
				setGlobalVars((GSSEnvironmentGlobalVars)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__MONITORS:
				setMonitors((GSSEnvironmentMonitors)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__ID:
				setId(ID_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS:
				setGss_options((GSSEnvironmentOptions)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PROTOCOLS:
				setProtocols((GSSEnvironmentProtocols)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__INTERFACES:
				setInterfaces((GSSEnvironmentInterfaces)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS:
				setSpecialPackets((GSSEnvironmentSpecialPackets)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS:
				setPeriodicTCs((GSSEnvironmentPeriodicTCs)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS:
				setGlobalVars((GSSEnvironmentGlobalVars)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__MONITORS:
				setMonitors((GSSEnvironmentMonitors)null);
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
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS:
				return gss_options != null;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PROTOCOLS:
				return protocols != null;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__INTERFACES:
				return interfaces != null;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS:
				return specialPackets != null;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS:
				return periodicTCs != null;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS:
				return globalVars != null;
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO__MONITORS:
				return monitors != null;
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
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentScenarioImpl
