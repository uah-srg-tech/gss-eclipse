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

import es.uah.aut.srg.gss.environment.GSSEnvironmentInterface;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn;
import es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut;
import es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut;
import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol;
import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.gss.iface.GSSIfacePortConfig;

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
 * An implementation of the model object '<em><b>GSS Environment Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl#getIfType <em>If Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl#getIfConfig <em>If Config</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl#getIoType <em>Io Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl#getProtocolID <em>Protocol ID</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl#getLevelInOut <em>Level In Out</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl#getLevelIn <em>Level In</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl#getLevelOut <em>Level Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentInterfaceImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentInterface {
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
	 * The default value of the '{@link #getIfType() <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentInterfaceType IF_TYPE_EDEFAULT = GSSEnvironmentInterfaceType.SP_W;

	/**
	 * The cached value of the '{@link #getIfType() <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfType()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentInterfaceType ifType = IF_TYPE_EDEFAULT;

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
	protected static final GSSEnvironmentInterfaceIOType IO_TYPE_EDEFAULT = GSSEnvironmentInterfaceIOType.IN_OUT;

	/**
	 * The cached value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentInterfaceIOType ioType = IO_TYPE_EDEFAULT;

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
	protected GSSEnvironmentProtocol protocolID;

	/**
	 * The cached value of the '{@link #getLevelInOut() <em>Level In Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelInOut()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentLevelInOut> levelInOut;

	/**
	 * The cached value of the '{@link #getLevelIn() <em>Level In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelIn()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentLevelIn> levelIn;

	/**
	 * The cached value of the '{@link #getLevelOut() <em>Level Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOut()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentLevelOut> levelOut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERFACE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentInterfaceType getIfType() {
		return ifType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfType(GSSEnvironmentInterfaceType newIfType) {
		GSSEnvironmentInterfaceType oldIfType = ifType;
		ifType = newIfType == null ? IF_TYPE_EDEFAULT : newIfType;
		boolean oldIfTypeESet = ifTypeESet;
		ifTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_TYPE, oldIfType, ifType, !oldIfTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfType() {
		GSSEnvironmentInterfaceType oldIfType = ifType;
		boolean oldIfTypeESet = ifTypeESet;
		ifType = IF_TYPE_EDEFAULT;
		ifTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_TYPE, oldIfType, IF_TYPE_EDEFAULT, oldIfTypeESet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_CONFIG, oldIfConfig, ifConfig));
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_CONFIG, oldIfConfig, ifConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentInterfaceIOType getIoType() {
		return ioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoType(GSSEnvironmentInterfaceIOType newIoType) {
		GSSEnvironmentInterfaceIOType oldIoType = ioType;
		ioType = newIoType == null ? IO_TYPE_EDEFAULT : newIoType;
		boolean oldIoTypeESet = ioTypeESet;
		ioTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERFACE__IO_TYPE, oldIoType, ioType, !oldIoTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIoType() {
		GSSEnvironmentInterfaceIOType oldIoType = ioType;
		boolean oldIoTypeESet = ioTypeESet;
		ioType = IO_TYPE_EDEFAULT;
		ioTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_INTERFACE__IO_TYPE, oldIoType, IO_TYPE_EDEFAULT, oldIoTypeESet));
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
	public GSSEnvironmentProtocol getProtocolID() {
		if (protocolID != null && protocolID.eIsProxy()) {
			InternalEObject oldProtocolID = (InternalEObject)protocolID;
			protocolID = (GSSEnvironmentProtocol)eResolveProxy(oldProtocolID);
			if (protocolID != oldProtocolID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID, oldProtocolID, protocolID));
			}
		}
		return protocolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentProtocol basicGetProtocolID() {
		return protocolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolID(GSSEnvironmentProtocol newProtocolID) {
		GSSEnvironmentProtocol oldProtocolID = protocolID;
		protocolID = newProtocolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID, oldProtocolID, protocolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentLevelInOut> getLevelInOut() {
		if (levelInOut == null) {
			levelInOut = new EObjectContainmentEList<GSSEnvironmentLevelInOut>(GSSEnvironmentLevelInOut.class, this, environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT);
		}
		return levelInOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentLevelIn> getLevelIn() {
		if (levelIn == null) {
			levelIn = new EObjectContainmentEList<GSSEnvironmentLevelIn>(GSSEnvironmentLevelIn.class, this, environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN);
		}
		return levelIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentLevelOut> getLevelOut() {
		if (levelOut == null) {
			levelOut = new EObjectContainmentEList<GSSEnvironmentLevelOut>(GSSEnvironmentLevelOut.class, this, environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT);
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
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT:
				return ((InternalEList<?>)getLevelInOut()).basicRemove(otherEnd, msgs);
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN:
				return ((InternalEList<?>)getLevelIn()).basicRemove(otherEnd, msgs);
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT:
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
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__ID:
				return getId();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__NAME:
				return getName();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_TYPE:
				return getIfType();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_CONFIG:
				if (resolve) return getIfConfig();
				return basicGetIfConfig();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IO_TYPE:
				return getIoType();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID:
				if (resolve) return getProtocolID();
				return basicGetProtocolID();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT:
				return getLevelInOut();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN:
				return getLevelIn();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT:
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
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__ID:
				setId((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_TYPE:
				setIfType((GSSEnvironmentInterfaceType)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_CONFIG:
				setIfConfig((GSSIfacePortConfig)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IO_TYPE:
				setIoType((GSSEnvironmentInterfaceIOType)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID:
				setProtocolID((GSSEnvironmentProtocol)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT:
				getLevelInOut().clear();
				getLevelInOut().addAll((Collection<? extends GSSEnvironmentLevelInOut>)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN:
				getLevelIn().clear();
				getLevelIn().addAll((Collection<? extends GSSEnvironmentLevelIn>)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT:
				getLevelOut().clear();
				getLevelOut().addAll((Collection<? extends GSSEnvironmentLevelOut>)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__ID:
				setId(ID_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_TYPE:
				unsetIfType();
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_CONFIG:
				setIfConfig((GSSIfacePortConfig)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IO_TYPE:
				unsetIoType();
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID:
				setProtocolID((GSSEnvironmentProtocol)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT:
				getLevelInOut().clear();
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN:
				getLevelIn().clear();
				return;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT:
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
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_TYPE:
				return isSetIfType();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IF_CONFIG:
				return ifConfig != null;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__IO_TYPE:
				return isSetIoType();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID:
				return protocolID != null;
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT:
				return levelInOut != null && !levelInOut.isEmpty();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_IN:
				return levelIn != null && !levelIn.isEmpty();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT:
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
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", ifType: ");
		if (ifTypeESet) result.append(ifType); else result.append("<unset>");
		result.append(", ioType: ");
		if (ioTypeESet) result.append(ioType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentInterfaceImpl
