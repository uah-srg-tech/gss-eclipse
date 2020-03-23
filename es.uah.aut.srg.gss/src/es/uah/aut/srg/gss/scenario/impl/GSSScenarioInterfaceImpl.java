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

import es.uah.aut.srg.gss.iface.GSSIfacePortConfig;

import es.uah.aut.srg.gss.scenario.GSSScenarioInterface;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType;
import es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn;
import es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut;
import es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut;
import es.uah.aut.srg.gss.scenario.GSSScenarioProtocol;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import es.uah.aut.srg.tmtcif.scenario.impl.TMTCIFScenarioInterfaceImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl#getIfType <em>If Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl#getIfConfig <em>If Config</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl#getIoType <em>Io Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl#getProtocolID <em>Protocol ID</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl#getLevelInOut <em>Level In Out</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl#getLevelIn <em>Level In</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl#getLevelOut <em>Level Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioInterfaceImpl extends TMTCIFScenarioInterfaceImpl implements GSSScenarioInterface {
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
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getIfType() <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioInterfaceType IF_TYPE_EDEFAULT = GSSScenarioInterfaceType.SP_W;

	/**
	 * The cached value of the '{@link #getIfType() <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfType()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioInterfaceType ifType = IF_TYPE_EDEFAULT;

	/**
	 * This is true if the If Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ifTypeESet;

	/**
	 * The cached value of the '{@link #getIfConfig() <em>If Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfConfig()
	 * @generated
	 * @ordered
	 */
	protected GSSIfacePortConfig ifConfig;

	/**
	 * The default value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioInterfaceIOType IO_TYPE_EDEFAULT = GSSScenarioInterfaceIOType.IN_OUT;

	/**
	 * The cached value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioInterfaceIOType ioType = IO_TYPE_EDEFAULT;

	/**
	 * This is true if the Io Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ioTypeESet;

	/**
	 * The cached value of the '{@link #getProtocolID() <em>Protocol ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolID()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioProtocol protocolID;

	/**
	 * The cached value of the '{@link #getLevelInOut() <em>Level In Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelInOut()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioLevelInOut> levelInOut;

	/**
	 * The cached value of the '{@link #getLevelIn() <em>Level In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelIn()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioLevelIn> levelIn;

	/**
	 * The cached value of the '{@link #getLevelOut() <em>Level Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOut()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioLevelOut> levelOut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_INTERFACE;
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
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_INTERFACE__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		String oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_INTERFACE__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInterfaceType getIfType() {
		return ifType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfType(GSSScenarioInterfaceType newIfType) {
		GSSScenarioInterfaceType oldIfType = ifType;
		ifType = newIfType == null ? IF_TYPE_EDEFAULT : newIfType;
		boolean oldIfTypeESet = ifTypeESet;
		ifTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_INTERFACE__IF_TYPE, oldIfType, ifType, !oldIfTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfType() {
		GSSScenarioInterfaceType oldIfType = ifType;
		boolean oldIfTypeESet = ifTypeESet;
		ifType = IF_TYPE_EDEFAULT;
		ifTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_INTERFACE__IF_TYPE, oldIfType, IF_TYPE_EDEFAULT, oldIfTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIfType() {
		return ifTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfacePortConfig getIfConfig() {
		if (ifConfig != null && ifConfig.eIsProxy()) {
			InternalEObject oldIfConfig = (InternalEObject)ifConfig;
			ifConfig = (GSSIfacePortConfig)eResolveProxy(oldIfConfig);
			if (ifConfig != oldIfConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_INTERFACE__IF_CONFIG, oldIfConfig, ifConfig));
			}
		}
		return ifConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfacePortConfig basicGetIfConfig() {
		return ifConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfConfig(GSSIfacePortConfig newIfConfig) {
		GSSIfacePortConfig oldIfConfig = ifConfig;
		ifConfig = newIfConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_INTERFACE__IF_CONFIG, oldIfConfig, ifConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInterfaceIOType getIoType() {
		return ioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoType(GSSScenarioInterfaceIOType newIoType) {
		GSSScenarioInterfaceIOType oldIoType = ioType;
		ioType = newIoType == null ? IO_TYPE_EDEFAULT : newIoType;
		boolean oldIoTypeESet = ioTypeESet;
		ioTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_INTERFACE__IO_TYPE, oldIoType, ioType, !oldIoTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIoType() {
		GSSScenarioInterfaceIOType oldIoType = ioType;
		boolean oldIoTypeESet = ioTypeESet;
		ioType = IO_TYPE_EDEFAULT;
		ioTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_INTERFACE__IO_TYPE, oldIoType, IO_TYPE_EDEFAULT, oldIoTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIoType() {
		return ioTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioProtocol getProtocolID() {
		if (protocolID != null && protocolID.eIsProxy()) {
			InternalEObject oldProtocolID = (InternalEObject)protocolID;
			protocolID = (GSSScenarioProtocol)eResolveProxy(oldProtocolID);
			if (protocolID != oldProtocolID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_INTERFACE__PROTOCOL_ID, oldProtocolID, protocolID));
			}
		}
		return protocolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioProtocol basicGetProtocolID() {
		return protocolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolID(GSSScenarioProtocol newProtocolID) {
		GSSScenarioProtocol oldProtocolID = protocolID;
		protocolID = newProtocolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_INTERFACE__PROTOCOL_ID, oldProtocolID, protocolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioLevelInOut> getLevelInOut() {
		if (levelInOut == null) {
			levelInOut = new EObjectContainmentEList<GSSScenarioLevelInOut>(GSSScenarioLevelInOut.class, this, scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT);
		}
		return levelInOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioLevelIn> getLevelIn() {
		if (levelIn == null) {
			levelIn = new EObjectContainmentEList<GSSScenarioLevelIn>(GSSScenarioLevelIn.class, this, scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN);
		}
		return levelIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioLevelOut> getLevelOut() {
		if (levelOut == null) {
			levelOut = new EObjectContainmentEList<GSSScenarioLevelOut>(GSSScenarioLevelOut.class, this, scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_OUT);
		}
		return levelOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT:
				return ((InternalEList<?>)getLevelInOut()).basicRemove(otherEnd, msgs);
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN:
				return ((InternalEList<?>)getLevelIn()).basicRemove(otherEnd, msgs);
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_OUT:
				return ((InternalEList<?>)getLevelOut()).basicRemove(otherEnd, msgs);
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
			case scenarioPackage.GSS_SCENARIO_INTERFACE__ID:
				return getId();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IF_TYPE:
				return getIfType();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IF_CONFIG:
				if (resolve) return getIfConfig();
				return basicGetIfConfig();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IO_TYPE:
				return getIoType();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__PROTOCOL_ID:
				if (resolve) return getProtocolID();
				return basicGetProtocolID();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT:
				return getLevelInOut();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN:
				return getLevelIn();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_OUT:
				return getLevelOut();
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
			case scenarioPackage.GSS_SCENARIO_INTERFACE__ID:
				setId((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IF_TYPE:
				setIfType((GSSScenarioInterfaceType)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IF_CONFIG:
				setIfConfig((GSSIfacePortConfig)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IO_TYPE:
				setIoType((GSSScenarioInterfaceIOType)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__PROTOCOL_ID:
				setProtocolID((GSSScenarioProtocol)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT:
				getLevelInOut().clear();
				getLevelInOut().addAll((Collection<? extends GSSScenarioLevelInOut>)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN:
				getLevelIn().clear();
				getLevelIn().addAll((Collection<? extends GSSScenarioLevelIn>)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_OUT:
				getLevelOut().clear();
				getLevelOut().addAll((Collection<? extends GSSScenarioLevelOut>)newValue);
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
			case scenarioPackage.GSS_SCENARIO_INTERFACE__ID:
				unsetId();
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IF_TYPE:
				unsetIfType();
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IF_CONFIG:
				setIfConfig((GSSIfacePortConfig)null);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IO_TYPE:
				unsetIoType();
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__PROTOCOL_ID:
				setProtocolID((GSSScenarioProtocol)null);
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT:
				getLevelInOut().clear();
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN:
				getLevelIn().clear();
				return;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_OUT:
				getLevelOut().clear();
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
			case scenarioPackage.GSS_SCENARIO_INTERFACE__ID:
				return isSetId();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IF_TYPE:
				return isSetIfType();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IF_CONFIG:
				return ifConfig != null;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__IO_TYPE:
				return isSetIoType();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__PROTOCOL_ID:
				return protocolID != null;
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT:
				return levelInOut != null && !levelInOut.isEmpty();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_IN:
				return levelIn != null && !levelIn.isEmpty();
			case scenarioPackage.GSS_SCENARIO_INTERFACE__LEVEL_OUT:
				return levelOut != null && !levelOut.isEmpty();
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
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", ifType: ");
		if (ifTypeESet) result.append(ifType); else result.append("<unset>");
		result.append(", ioType: ");
		if (ioTypeESet) result.append(ioType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSScenarioInterfaceImpl
