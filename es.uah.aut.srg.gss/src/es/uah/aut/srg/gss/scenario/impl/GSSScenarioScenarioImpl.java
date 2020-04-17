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

import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar;
import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces;
import es.uah.aut.srg.gss.scenario.GSSScenarioMonitors;
import es.uah.aut.srg.gss.scenario.GSSScenarioOptions;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs;
import es.uah.aut.srg.gss.scenario.GSSScenarioProtocols;
import es.uah.aut.srg.gss.scenario.GSSScenarioScenario;
import es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket;
import es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPackets;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterface;
import es.uah.aut.srg.gss.scenario.scenarioPackage;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioPacketConfig;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable;
import es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl#getGss_options <em>Gss options</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl#getSpecialPackets <em>Special Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl#getPeriodicTCs <em>Periodic TCs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl#getGlobalVars <em>Global Vars</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl#getMonitors <em>Monitors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioScenarioImpl extends TMTCIFScenarioImpl implements GSSScenarioScenario {
	/**
	 * The cached value of the '{@link #getGss_options() <em>Gss options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGss_options()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioOptions gss_options;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioProtocols protocols;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioInterfaces interfaces;

	/**
	 * The cached value of the '{@link #getSpecialPackets() <em>Special Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPackets()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioSpecialPackets specialPackets;

	/**
	 * The cached value of the '{@link #getPeriodicTCs() <em>Periodic TCs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTCs()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioPeriodicTCs periodicTCs;

	/**
	 * The cached value of the '{@link #getGlobalVars() <em>Global Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVars()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioGlobalVars globalVars;

	/**
	 * The cached value of the '{@link #getMonitors() <em>Monitors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitors()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioMonitors monitors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioOptions getGss_options() {
		return gss_options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGss_options(GSSScenarioOptions newGss_options, NotificationChain msgs) {
		GSSScenarioOptions oldGss_options = gss_options;
		gss_options = newGss_options;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__GSS_OPTIONS, oldGss_options, newGss_options);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGss_options(GSSScenarioOptions newGss_options) {
		if (newGss_options != gss_options) {
			NotificationChain msgs = null;
			if (gss_options != null)
				msgs = ((InternalEObject)gss_options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__GSS_OPTIONS, null, msgs);
			if (newGss_options != null)
				msgs = ((InternalEObject)newGss_options).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__GSS_OPTIONS, null, msgs);
			msgs = basicSetGss_options(newGss_options, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__GSS_OPTIONS, newGss_options, newGss_options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioProtocols getProtocols() {
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocols(GSSScenarioProtocols newProtocols, NotificationChain msgs) {
		GSSScenarioProtocols oldProtocols = protocols;
		protocols = newProtocols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__PROTOCOLS, oldProtocols, newProtocols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocols(GSSScenarioProtocols newProtocols) {
		if (newProtocols != protocols) {
			NotificationChain msgs = null;
			if (protocols != null)
				msgs = ((InternalEObject)protocols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__PROTOCOLS, null, msgs);
			if (newProtocols != null)
				msgs = ((InternalEObject)newProtocols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__PROTOCOLS, null, msgs);
			msgs = basicSetProtocols(newProtocols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__PROTOCOLS, newProtocols, newProtocols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInterfaces getInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioSpecialPackets getSpecialPackets() {
		return specialPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialPackets(GSSScenarioSpecialPackets newSpecialPackets, NotificationChain msgs) {
		GSSScenarioSpecialPackets oldSpecialPackets = specialPackets;
		specialPackets = newSpecialPackets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS, oldSpecialPackets, newSpecialPackets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialPackets(GSSScenarioSpecialPackets newSpecialPackets) {
		if (newSpecialPackets != specialPackets) {
			NotificationChain msgs = null;
			if (specialPackets != null)
				msgs = ((InternalEObject)specialPackets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS, null, msgs);
			if (newSpecialPackets != null)
				msgs = ((InternalEObject)newSpecialPackets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS, null, msgs);
			msgs = basicSetSpecialPackets(newSpecialPackets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS, newSpecialPackets, newSpecialPackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPeriodicTCs getPeriodicTCs() {
		return periodicTCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodicTCs(GSSScenarioPeriodicTCs newPeriodicTCs, NotificationChain msgs) {
		GSSScenarioPeriodicTCs oldPeriodicTCs = periodicTCs;
		periodicTCs = newPeriodicTCs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__PERIODIC_TCS, oldPeriodicTCs, newPeriodicTCs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicTCs(GSSScenarioPeriodicTCs newPeriodicTCs) {
		if (newPeriodicTCs != periodicTCs) {
			NotificationChain msgs = null;
			if (periodicTCs != null)
				msgs = ((InternalEObject)periodicTCs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__PERIODIC_TCS, null, msgs);
			if (newPeriodicTCs != null)
				msgs = ((InternalEObject)newPeriodicTCs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__PERIODIC_TCS, null, msgs);
			msgs = basicSetPeriodicTCs(newPeriodicTCs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__PERIODIC_TCS, newPeriodicTCs, newPeriodicTCs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioGlobalVars getGlobalVars() {
		return globalVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalVars(GSSScenarioGlobalVars newGlobalVars, NotificationChain msgs) {
		GSSScenarioGlobalVars oldGlobalVars = globalVars;
		globalVars = newGlobalVars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__GLOBAL_VARS, oldGlobalVars, newGlobalVars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalVars(GSSScenarioGlobalVars newGlobalVars) {
		if (newGlobalVars != globalVars) {
			NotificationChain msgs = null;
			if (globalVars != null)
				msgs = ((InternalEObject)globalVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__GLOBAL_VARS, null, msgs);
			if (newGlobalVars != null)
				msgs = ((InternalEObject)newGlobalVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__GLOBAL_VARS, null, msgs);
			msgs = basicSetGlobalVars(newGlobalVars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__GLOBAL_VARS, newGlobalVars, newGlobalVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioMonitors getMonitors() {
		return monitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitors(GSSScenarioMonitors newMonitors, NotificationChain msgs) {
		GSSScenarioMonitors oldMonitors = monitors;
		monitors = newMonitors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__MONITORS, oldMonitors, newMonitors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitors(GSSScenarioMonitors newMonitors) {
		if (newMonitors != monitors) {
			NotificationChain msgs = null;
			if (monitors != null)
				msgs = ((InternalEObject)monitors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__MONITORS, null, msgs);
			if (newMonitors != null)
				msgs = ((InternalEObject)newMonitors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__MONITORS, null, msgs);
			msgs = basicSetMonitors(newMonitors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__MONITORS, newMonitors, newMonitors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GSS_OPTIONS:
				return basicSetGss_options(null, msgs);
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PROTOCOLS:
				return basicSetProtocols(null, msgs);
			case scenarioPackage.GSS_SCENARIO_SCENARIO__INTERFACES:
				return basicSetInterfaces(null, msgs);
			case scenarioPackage.GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS:
				return basicSetSpecialPackets(null, msgs);
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PERIODIC_TCS:
				return basicSetPeriodicTCs(null, msgs);
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GLOBAL_VARS:
				return basicSetGlobalVars(null, msgs);
			case scenarioPackage.GSS_SCENARIO_SCENARIO__MONITORS:
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
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GSS_OPTIONS:
				return getGss_options();
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PROTOCOLS:
				return getProtocols();
			case scenarioPackage.GSS_SCENARIO_SCENARIO__INTERFACES:
				return getInterfaces();
			case scenarioPackage.GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS:
				return getSpecialPackets();
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PERIODIC_TCS:
				return getPeriodicTCs();
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GLOBAL_VARS:
				return getGlobalVars();
			case scenarioPackage.GSS_SCENARIO_SCENARIO__MONITORS:
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
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GSS_OPTIONS:
				setGss_options((GSSScenarioOptions)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PROTOCOLS:
				setProtocols((GSSScenarioProtocols)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__INTERFACES:
				setInterfaces((GSSScenarioInterfaces)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS:
				setSpecialPackets((GSSScenarioSpecialPackets)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PERIODIC_TCS:
				setPeriodicTCs((GSSScenarioPeriodicTCs)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GLOBAL_VARS:
				setGlobalVars((GSSScenarioGlobalVars)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__MONITORS:
				setMonitors((GSSScenarioMonitors)newValue);
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
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GSS_OPTIONS:
				setGss_options((GSSScenarioOptions)null);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PROTOCOLS:
				setProtocols((GSSScenarioProtocols)null);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__INTERFACES:
				setInterfaces((GSSScenarioInterfaces)null);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS:
				setSpecialPackets((GSSScenarioSpecialPackets)null);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PERIODIC_TCS:
				setPeriodicTCs((GSSScenarioPeriodicTCs)null);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GLOBAL_VARS:
				setGlobalVars((GSSScenarioGlobalVars)null);
				return;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__MONITORS:
				setMonitors((GSSScenarioMonitors)null);
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
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GSS_OPTIONS:
				return gss_options != null;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PROTOCOLS:
				return protocols != null;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__INTERFACES:
				return interfaces != null;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS:
				return specialPackets != null;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__PERIODIC_TCS:
				return periodicTCs != null;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__GLOBAL_VARS:
				return globalVars != null;
			case scenarioPackage.GSS_SCENARIO_SCENARIO__MONITORS:
				return monitors != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaces(GSSScenarioInterfaces newInterfaces, NotificationChain msgs) {
		GSSScenarioInterfaces oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__INTERFACES, oldInterfaces, newInterfaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(GSSScenarioInterfaces newInterfaces) {
		if (newInterfaces != interfaces) {
			NotificationChain msgs = null;
			if (interfaces != null)
				msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__INTERFACES, null, msgs);
			if (newInterfaces != null)
				msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - scenarioPackage.GSS_SCENARIO_SCENARIO__INTERFACES, null, msgs);
			msgs = basicSetInterfaces(newInterfaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_SCENARIO__INTERFACES, newInterfaces, newInterfaces));
	}

	@Override
	public EList<TMTCIFScenarioInterface> getScenarioInterfaces() {
		EList<TMTCIFScenarioInterface> interfs = new BasicEList<TMTCIFScenarioInterface>();
		interfs.add((TMTCIFScenarioInterface) getInterfaces().getMainInterface());
		for(GSSScenarioInterface interf : getInterfaces().getInterface()) {
			interfs.add((TMTCIFScenarioInterface) interf);
		};
		return interfs;
	}

	@Override
	public EList<TMTCIFScenarioVariable> getScenarioVariables() {
		if(getGlobalVars() == null) {
			return ECollections.emptyEList();
		} else {
			EList<TMTCIFScenarioVariable> vbles = new BasicEList<TMTCIFScenarioVariable>();
			for(GSSScenarioGlobalVar vble : getGlobalVars().getGlobalVar()) {
				vbles.add((TMTCIFScenarioVariable) vble);
			};
			return vbles;
		}
	}

	@Override
	public EList<TMTCIFScenarioPacketConfig> getScenarioPacketConfigs() {
		if(getSpecialPackets() == null) {
			return ECollections.emptyEList();
		} else {
			EList<TMTCIFScenarioPacketConfig> specialPkts = new BasicEList<TMTCIFScenarioPacketConfig>();
			for(GSSScenarioSpecialPacket specialPkt : getSpecialPackets().getSpecialPacket()) {
				specialPkts.add((TMTCIFScenarioPacketConfig) specialPkt);
			};
			return specialPkts;
		}
	}
} //GSSScenarioScenarioImpl
