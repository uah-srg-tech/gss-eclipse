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

import es.uah.aut.srg.gss.config.GSSConfigTestCase;
import es.uah.aut.srg.gss.config.GSSConfigTests;
import es.uah.aut.srg.gss.config.configPackage;

import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets;

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
 * An implementation of the model object '<em><b>GSS Config Tests</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl#getProtocolPacketsFile <em>Protocol Packets File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl#getTestCase <em>Test Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigTestsImpl extends MinimalEObjectImpl.Container implements GSSConfigTests {
	/**
	 * The cached value of the '{@link #getProtocolPacketsFile() <em>Protocol Packets File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolPacketsFile()
	 * @generated
	 * @ordered
	 */
	protected GSSProtocolPacketsProtocolPackets protocolPacketsFile;

	/**
	 * The cached value of the '{@link #getTestCase() <em>Test Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCase()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigTestCase> testCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigTestsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_TESTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsProtocolPackets getProtocolPacketsFile() {
		if (protocolPacketsFile != null && protocolPacketsFile.eIsProxy()) {
			InternalEObject oldProtocolPacketsFile = (InternalEObject)protocolPacketsFile;
			protocolPacketsFile = (GSSProtocolPacketsProtocolPackets)eResolveProxy(oldProtocolPacketsFile);
			if (protocolPacketsFile != oldProtocolPacketsFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_TESTS__PROTOCOL_PACKETS_FILE, oldProtocolPacketsFile, protocolPacketsFile));
			}
		}
		return protocolPacketsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsProtocolPackets basicGetProtocolPacketsFile() {
		return protocolPacketsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolPacketsFile(GSSProtocolPacketsProtocolPackets newProtocolPacketsFile) {
		GSSProtocolPacketsProtocolPackets oldProtocolPacketsFile = protocolPacketsFile;
		protocolPacketsFile = newProtocolPacketsFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_TESTS__PROTOCOL_PACKETS_FILE, oldProtocolPacketsFile, protocolPacketsFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigTestCase> getTestCase() {
		if (testCase == null) {
			testCase = new EObjectContainmentEList<GSSConfigTestCase>(GSSConfigTestCase.class, this, configPackage.GSS_CONFIG_TESTS__TEST_CASE);
		}
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_TESTS__TEST_CASE:
				return ((InternalEList<?>)getTestCase()).basicRemove(otherEnd, msgs);
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
			case configPackage.GSS_CONFIG_TESTS__PROTOCOL_PACKETS_FILE:
				if (resolve) return getProtocolPacketsFile();
				return basicGetProtocolPacketsFile();
			case configPackage.GSS_CONFIG_TESTS__TEST_CASE:
				return getTestCase();
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
			case configPackage.GSS_CONFIG_TESTS__PROTOCOL_PACKETS_FILE:
				setProtocolPacketsFile((GSSProtocolPacketsProtocolPackets)newValue);
				return;
			case configPackage.GSS_CONFIG_TESTS__TEST_CASE:
				getTestCase().clear();
				getTestCase().addAll((Collection<? extends GSSConfigTestCase>)newValue);
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
			case configPackage.GSS_CONFIG_TESTS__PROTOCOL_PACKETS_FILE:
				setProtocolPacketsFile((GSSProtocolPacketsProtocolPackets)null);
				return;
			case configPackage.GSS_CONFIG_TESTS__TEST_CASE:
				getTestCase().clear();
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
			case configPackage.GSS_CONFIG_TESTS__PROTOCOL_PACKETS_FILE:
				return protocolPacketsFile != null;
			case configPackage.GSS_CONFIG_TESTS__TEST_CASE:
				return testCase != null && !testCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSConfigTestsImpl
