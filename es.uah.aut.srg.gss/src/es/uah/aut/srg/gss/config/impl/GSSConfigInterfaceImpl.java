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

import es.uah.aut.srg.gss.config.GSSConfigInterface;
import es.uah.aut.srg.gss.config.GSSConfigInterfaceIOType;
import es.uah.aut.srg.gss.config.GSSConfigInterfaceType;
import es.uah.aut.srg.gss.config.GSSConfigLevelIn;
import es.uah.aut.srg.gss.config.GSSConfigLevelInOut;
import es.uah.aut.srg.gss.config.GSSConfigLevelOut;
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
 * An implementation of the model object '<em><b>GSS Config Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl#getIfType <em>If Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl#getIfConfig <em>If Config</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl#getIoType <em>Io Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl#getProtocolID <em>Protocol ID</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl#getLevelInOut <em>Level In Out</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl#getLevelIn <em>Level In</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl#getLevelOut <em>Level Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigInterfaceImpl extends MinimalEObjectImpl.Container implements GSSConfigInterface {
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
	protected static final GSSConfigInterfaceType IF_TYPE_EDEFAULT = GSSConfigInterfaceType.SP_W;

	/**
	 * The cached value of the '{@link #getIfType() <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfType()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigInterfaceType ifType = IF_TYPE_EDEFAULT;

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
	protected static final GSSConfigInterfaceIOType IO_TYPE_EDEFAULT = GSSConfigInterfaceIOType.IN_OUT;

	/**
	 * The cached value of the '{@link #getIoType() <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoType()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigInterfaceIOType ioType = IO_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getLevelIn() <em>Level In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelIn()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigLevelIn> levelIn;

	/**
	 * The cached value of the '{@link #getLevelOut() <em>Level Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOut()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigLevelOut> levelOut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_INTERFACE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigInterfaceType getIfType() {
		return ifType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfType(GSSConfigInterfaceType newIfType) {
		GSSConfigInterfaceType oldIfType = ifType;
		ifType = newIfType == null ? IF_TYPE_EDEFAULT : newIfType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_INTERFACE__IF_TYPE, oldIfType, ifType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_INTERFACE__IF_CONFIG, oldIfConfig, ifConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigInterfaceIOType getIoType() {
		return ioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoType(GSSConfigInterfaceIOType newIoType) {
		GSSConfigInterfaceIOType oldIoType = ioType;
		ioType = newIoType == null ? IO_TYPE_EDEFAULT : newIoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_INTERFACE__IO_TYPE, oldIoType, ioType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_INTERFACE__PROTOCOL_ID, oldProtocolID, protocolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigLevelInOut> getLevelInOut() {
		if (levelInOut == null) {
			levelInOut = new EObjectContainmentEList<GSSConfigLevelInOut>(GSSConfigLevelInOut.class, this, configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN_OUT);
		}
		return levelInOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigLevelIn> getLevelIn() {
		if (levelIn == null) {
			levelIn = new EObjectContainmentEList<GSSConfigLevelIn>(GSSConfigLevelIn.class, this, configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN);
		}
		return levelIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigLevelOut> getLevelOut() {
		if (levelOut == null) {
			levelOut = new EObjectContainmentEList<GSSConfigLevelOut>(GSSConfigLevelOut.class, this, configPackage.GSS_CONFIG_INTERFACE__LEVEL_OUT);
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
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN_OUT:
				return ((InternalEList<?>)getLevelInOut()).basicRemove(otherEnd, msgs);
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN:
				return ((InternalEList<?>)getLevelIn()).basicRemove(otherEnd, msgs);
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_OUT:
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
			case configPackage.GSS_CONFIG_INTERFACE__ID:
				return getId();
			case configPackage.GSS_CONFIG_INTERFACE__NAME:
				return getName();
			case configPackage.GSS_CONFIG_INTERFACE__IF_TYPE:
				return getIfType();
			case configPackage.GSS_CONFIG_INTERFACE__IF_CONFIG:
				return getIfConfig();
			case configPackage.GSS_CONFIG_INTERFACE__IO_TYPE:
				return getIoType();
			case configPackage.GSS_CONFIG_INTERFACE__PROTOCOL_ID:
				return getProtocolID();
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN_OUT:
				return getLevelInOut();
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN:
				return getLevelIn();
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_OUT:
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
			case configPackage.GSS_CONFIG_INTERFACE__ID:
				setId((String)newValue);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__IF_TYPE:
				setIfType((GSSConfigInterfaceType)newValue);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__IF_CONFIG:
				setIfConfig((String)newValue);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__IO_TYPE:
				setIoType((GSSConfigInterfaceIOType)newValue);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__PROTOCOL_ID:
				setProtocolID((String)newValue);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN_OUT:
				getLevelInOut().clear();
				getLevelInOut().addAll((Collection<? extends GSSConfigLevelInOut>)newValue);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN:
				getLevelIn().clear();
				getLevelIn().addAll((Collection<? extends GSSConfigLevelIn>)newValue);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_OUT:
				getLevelOut().clear();
				getLevelOut().addAll((Collection<? extends GSSConfigLevelOut>)newValue);
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
			case configPackage.GSS_CONFIG_INTERFACE__ID:
				setId(ID_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__IF_TYPE:
				setIfType(IF_TYPE_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__IF_CONFIG:
				setIfConfig(IF_CONFIG_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__IO_TYPE:
				setIoType(IO_TYPE_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__PROTOCOL_ID:
				setProtocolID(PROTOCOL_ID_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN_OUT:
				getLevelInOut().clear();
				return;
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN:
				getLevelIn().clear();
				return;
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_OUT:
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
			case configPackage.GSS_CONFIG_INTERFACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case configPackage.GSS_CONFIG_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case configPackage.GSS_CONFIG_INTERFACE__IF_TYPE:
				return ifType != IF_TYPE_EDEFAULT;
			case configPackage.GSS_CONFIG_INTERFACE__IF_CONFIG:
				return IF_CONFIG_EDEFAULT == null ? ifConfig != null : !IF_CONFIG_EDEFAULT.equals(ifConfig);
			case configPackage.GSS_CONFIG_INTERFACE__IO_TYPE:
				return ioType != IO_TYPE_EDEFAULT;
			case configPackage.GSS_CONFIG_INTERFACE__PROTOCOL_ID:
				return PROTOCOL_ID_EDEFAULT == null ? protocolID != null : !PROTOCOL_ID_EDEFAULT.equals(protocolID);
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN_OUT:
				return levelInOut != null && !levelInOut.isEmpty();
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_IN:
				return levelIn != null && !levelIn.isEmpty();
			case configPackage.GSS_CONFIG_INTERFACE__LEVEL_OUT:
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
		result.append(ifType);
		result.append(", ifConfig: ");
		result.append(ifConfig);
		result.append(", ioType: ");
		result.append(ioType);
		result.append(", protocolID: ");
		result.append(protocolID);
		result.append(')');
		return result.toString();
	}

} //GSSConfigInterfaceImpl
