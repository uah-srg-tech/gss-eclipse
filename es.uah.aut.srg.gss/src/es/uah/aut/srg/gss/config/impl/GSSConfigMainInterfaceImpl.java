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

import es.uah.aut.srg.gss.config.GSSConfigLevelInOut;
import es.uah.aut.srg.gss.config.GSSConfigMainInterface;
import es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType;
import es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType;
import es.uah.aut.srg.gss.config.configPackage;

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
 * An implementation of the model object '<em><b>GSS Config Main Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl#getIfType <em>If Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl#getIfConfig <em>If Config</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl#getIoType <em>Io Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl#getProtocolID <em>Protocol ID</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl#getLevelInOut <em>Level In Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigMainInterfaceImpl extends MinimalEObjectImpl.Container implements GSSConfigMainInterface {
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
	protected static final GSSConfigMainInterfaceType IF_TYPE_EDEFAULT = GSSConfigMainInterfaceType.SP_W;

	/**
	 * The cached value of the '{@link #getIfType() <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfType()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigMainInterfaceType ifType = IF_TYPE_EDEFAULT;

	/**
	 * This is true if the If Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ifTypeESet;

	/**
	 * The default value of the '{@link #getIfConfig() <em>If Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfConfig() <em>If Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfConfig()
	 * @generated
	 * @ordered
	 */
	protected String ifConfig = IF_CONFIG_EDEFAULT;

	/**
	 * The default value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSConfigMainInterfaceIOType IO_TYPE_EDEFAULT = GSSConfigMainInterfaceIOType.IN_OUT;

	/**
	 * The cached value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigMainInterfaceIOType ioType = IO_TYPE_EDEFAULT;

	/**
	 * This is true if the Io Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ioTypeESet;

	/**
	 * The default value of the '{@link #getProtocolID() <em>Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolID() <em>Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolID()
	 * @generated
	 * @ordered
	 */
	protected String protocolID = PROTOCOL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLevelInOut() <em>Level In Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelInOut()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigLevelInOut> levelInOut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigMainInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_MAIN_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_MAIN_INTERFACE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_MAIN_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigMainInterfaceType getIfType() {
		return ifType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfType(GSSConfigMainInterfaceType newIfType) {
		GSSConfigMainInterfaceType oldIfType = ifType;
		ifType = newIfType == null ? IF_TYPE_EDEFAULT : newIfType;
		boolean oldIfTypeESet = ifTypeESet;
		ifTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_TYPE, oldIfType, ifType, !oldIfTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIfType() {
		GSSConfigMainInterfaceType oldIfType = ifType;
		boolean oldIfTypeESet = ifTypeESet;
		ifType = IF_TYPE_EDEFAULT;
		ifTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_TYPE, oldIfType, IF_TYPE_EDEFAULT, oldIfTypeESet));
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
	public String getIfConfig() {
		return ifConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfConfig(String newIfConfig) {
		String oldIfConfig = ifConfig;
		ifConfig = newIfConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_CONFIG, oldIfConfig, ifConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigMainInterfaceIOType getIoType() {
		return ioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoType(GSSConfigMainInterfaceIOType newIoType) {
		GSSConfigMainInterfaceIOType oldIoType = ioType;
		ioType = newIoType == null ? IO_TYPE_EDEFAULT : newIoType;
		boolean oldIoTypeESet = ioTypeESet;
		ioTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_MAIN_INTERFACE__IO_TYPE, oldIoType, ioType, !oldIoTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIoType() {
		GSSConfigMainInterfaceIOType oldIoType = ioType;
		boolean oldIoTypeESet = ioTypeESet;
		ioType = IO_TYPE_EDEFAULT;
		ioTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_MAIN_INTERFACE__IO_TYPE, oldIoType, IO_TYPE_EDEFAULT, oldIoTypeESet));
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
	public String getProtocolID() {
		return protocolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolID(String newProtocolID) {
		String oldProtocolID = protocolID;
		protocolID = newProtocolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_MAIN_INTERFACE__PROTOCOL_ID, oldProtocolID, protocolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigLevelInOut> getLevelInOut() {
		if (levelInOut == null) {
			levelInOut = new EObjectContainmentEList<GSSConfigLevelInOut>(GSSConfigLevelInOut.class, this, configPackage.GSS_CONFIG_MAIN_INTERFACE__LEVEL_IN_OUT);
		}
		return levelInOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__LEVEL_IN_OUT:
				return ((InternalEList<?>)getLevelInOut()).basicRemove(otherEnd, msgs);
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
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__ID:
				return getId();
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__NAME:
				return getName();
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_TYPE:
				return getIfType();
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_CONFIG:
				return getIfConfig();
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IO_TYPE:
				return getIoType();
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__PROTOCOL_ID:
				return getProtocolID();
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__LEVEL_IN_OUT:
				return getLevelInOut();
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
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__ID:
				setId((String)newValue);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_TYPE:
				setIfType((GSSConfigMainInterfaceType)newValue);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_CONFIG:
				setIfConfig((String)newValue);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IO_TYPE:
				setIoType((GSSConfigMainInterfaceIOType)newValue);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__PROTOCOL_ID:
				setProtocolID((String)newValue);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__LEVEL_IN_OUT:
				getLevelInOut().clear();
				getLevelInOut().addAll((Collection<? extends GSSConfigLevelInOut>)newValue);
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
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__ID:
				setId(ID_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_TYPE:
				unsetIfType();
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_CONFIG:
				setIfConfig(IF_CONFIG_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IO_TYPE:
				unsetIoType();
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__PROTOCOL_ID:
				setProtocolID(PROTOCOL_ID_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__LEVEL_IN_OUT:
				getLevelInOut().clear();
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
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_TYPE:
				return isSetIfType();
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IF_CONFIG:
				return IF_CONFIG_EDEFAULT == null ? ifConfig != null : !IF_CONFIG_EDEFAULT.equals(ifConfig);
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__IO_TYPE:
				return isSetIoType();
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__PROTOCOL_ID:
				return PROTOCOL_ID_EDEFAULT == null ? protocolID != null : !PROTOCOL_ID_EDEFAULT.equals(protocolID);
			case configPackage.GSS_CONFIG_MAIN_INTERFACE__LEVEL_IN_OUT:
				return levelInOut != null && !levelInOut.isEmpty();
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
		result.append(", ifConfig: ");
		result.append(ifConfig);
		result.append(", ioType: ");
		if (ioTypeESet) result.append(ioType); else result.append("<unset>");
		result.append(", protocolID: ");
		result.append(protocolID);
		result.append(')');
		return result.toString();
	}

} //GSSConfigMainInterfaceImpl
