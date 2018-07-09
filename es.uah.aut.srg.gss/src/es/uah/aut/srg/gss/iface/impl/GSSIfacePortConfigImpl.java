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
package es.uah.aut.srg.gss.iface.impl;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.iface.GSSIfacePort;
import es.uah.aut.srg.gss.iface.GSSIfacePortConfig;
import es.uah.aut.srg.gss.iface.ifacePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Iface Port Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfacePortConfigImpl#getPortConfig <em>Port Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSIfacePortConfigImpl extends GSSModelElementImpl implements GSSIfacePortConfig {
	/**
	 * The cached value of the '{@link #getPortConfig() <em>Port Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConfig()
	 * @generated
	 * @ordered
	 */
	protected GSSIfacePort portConfig;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSIfacePortConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ifacePackage.Literals.GSS_IFACE_PORT_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfacePort getPortConfig() {
		return portConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortConfig(GSSIfacePort newPortConfig, NotificationChain msgs) {
		GSSIfacePort oldPortConfig = portConfig;
		portConfig = newPortConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_PORT_CONFIG__PORT_CONFIG, oldPortConfig, newPortConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortConfig(GSSIfacePort newPortConfig) {
		if (newPortConfig != portConfig) {
			NotificationChain msgs = null;
			if (portConfig != null)
				msgs = ((InternalEObject)portConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_PORT_CONFIG__PORT_CONFIG, null, msgs);
			if (newPortConfig != null)
				msgs = ((InternalEObject)newPortConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_PORT_CONFIG__PORT_CONFIG, null, msgs);
			msgs = basicSetPortConfig(newPortConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_PORT_CONFIG__PORT_CONFIG, newPortConfig, newPortConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ifacePackage.GSS_IFACE_PORT_CONFIG__PORT_CONFIG:
				return basicSetPortConfig(null, msgs);
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
			case ifacePackage.GSS_IFACE_PORT_CONFIG__PORT_CONFIG:
				return getPortConfig();
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
			case ifacePackage.GSS_IFACE_PORT_CONFIG__PORT_CONFIG:
				setPortConfig((GSSIfacePort)newValue);
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
			case ifacePackage.GSS_IFACE_PORT_CONFIG__PORT_CONFIG:
				setPortConfig((GSSIfacePort)null);
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
			case ifacePackage.GSS_IFACE_PORT_CONFIG__PORT_CONFIG:
				return portConfig != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSIfacePortConfigImpl
