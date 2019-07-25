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

import es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket;
import es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets;
import es.uah.aut.srg.gss.environment.environmentPackage;

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
 * An implementation of the model object '<em><b>GSS Environment Special Packets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketsImpl#getSpecialPacket <em>Special Packet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentSpecialPacketsImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentSpecialPackets {
	/**
	 * The cached value of the '{@link #getSpecialPacket() <em>Special Packet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPacket()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentSpecialPacket> specialPacket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentSpecialPacketsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_SPECIAL_PACKETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentSpecialPacket> getSpecialPacket() {
		if (specialPacket == null) {
			specialPacket = new EObjectContainmentEList<GSSEnvironmentSpecialPacket>(GSSEnvironmentSpecialPacket.class, this, environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKETS__SPECIAL_PACKET);
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
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKETS__SPECIAL_PACKET:
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
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKETS__SPECIAL_PACKET:
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
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKETS__SPECIAL_PACKET:
				getSpecialPacket().clear();
				getSpecialPacket().addAll((Collection<? extends GSSEnvironmentSpecialPacket>)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKETS__SPECIAL_PACKET:
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
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKETS__SPECIAL_PACKET:
				return specialPacket != null && !specialPacket.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSEnvironmentSpecialPacketsImpl
