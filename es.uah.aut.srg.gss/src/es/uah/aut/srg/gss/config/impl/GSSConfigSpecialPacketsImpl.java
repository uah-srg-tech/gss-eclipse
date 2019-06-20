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

import es.uah.aut.srg.gss.config.GSSConfigSpecialPacket;
import es.uah.aut.srg.gss.config.GSSConfigSpecialPackets;
import es.uah.aut.srg.gss.config.configPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Special Packets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigSpecialPacketsImpl#getSpecialPacket <em>Special Packet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigSpecialPacketsImpl extends MinimalEObjectImpl.Container implements GSSConfigSpecialPackets {
	/**
	 * The cached value of the '{@link #getSpecialPacket() <em>Special Packet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPacket()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigSpecialPacket> specialPacket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigSpecialPacketsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_SPECIAL_PACKETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigSpecialPacket> getSpecialPacket() {
		if (specialPacket == null) {
			specialPacket = new EObjectContainmentEList<GSSConfigSpecialPacket>(GSSConfigSpecialPacket.class, this, configPackage.GSS_CONFIG_SPECIAL_PACKETS__SPECIAL_PACKET);
		}
		return specialPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_SPECIAL_PACKETS__SPECIAL_PACKET:
				return ((InternalEList<?>)getSpecialPacket()).basicRemove(otherEnd, msgs);
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
			case configPackage.GSS_CONFIG_SPECIAL_PACKETS__SPECIAL_PACKET:
				return getSpecialPacket();
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
			case configPackage.GSS_CONFIG_SPECIAL_PACKETS__SPECIAL_PACKET:
				getSpecialPacket().clear();
				getSpecialPacket().addAll((Collection<? extends GSSConfigSpecialPacket>)newValue);
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
			case configPackage.GSS_CONFIG_SPECIAL_PACKETS__SPECIAL_PACKET:
				getSpecialPacket().clear();
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
			case configPackage.GSS_CONFIG_SPECIAL_PACKETS__SPECIAL_PACKET:
				return specialPacket != null && !specialPacket.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSConfigSpecialPacketsImpl
