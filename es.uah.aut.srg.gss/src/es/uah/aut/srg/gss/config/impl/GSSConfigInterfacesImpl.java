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
import es.uah.aut.srg.gss.config.GSSConfigInterfaces;
import es.uah.aut.srg.gss.config.GSSConfigMainInterface;
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
 * An implementation of the model object '<em><b>GSS Config Interfaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfacesImpl#getMainInterface <em>Main Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfacesImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigInterfacesImpl extends MinimalEObjectImpl.Container implements GSSConfigInterfaces {
	/**
	 * The cached value of the '{@link #getMainInterface() <em>Main Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainInterface()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigMainInterface mainInterface;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigInterface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigInterfacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_INTERFACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigMainInterface getMainInterface() {
		return mainInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainInterface(GSSConfigMainInterface newMainInterface, NotificationChain msgs) {
		GSSConfigMainInterface oldMainInterface = mainInterface;
		mainInterface = newMainInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_INTERFACES__MAIN_INTERFACE, oldMainInterface, newMainInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainInterface(GSSConfigMainInterface newMainInterface) {
		if (newMainInterface != mainInterface) {
			NotificationChain msgs = null;
			if (mainInterface != null)
				msgs = ((InternalEObject)mainInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_INTERFACES__MAIN_INTERFACE, null, msgs);
			if (newMainInterface != null)
				msgs = ((InternalEObject)newMainInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_INTERFACES__MAIN_INTERFACE, null, msgs);
			msgs = basicSetMainInterface(newMainInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_INTERFACES__MAIN_INTERFACE, newMainInterface, newMainInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<GSSConfigInterface>(GSSConfigInterface.class, this, configPackage.GSS_CONFIG_INTERFACES__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_INTERFACES__MAIN_INTERFACE:
				return basicSetMainInterface(null, msgs);
			case configPackage.GSS_CONFIG_INTERFACES__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
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
			case configPackage.GSS_CONFIG_INTERFACES__MAIN_INTERFACE:
				return getMainInterface();
			case configPackage.GSS_CONFIG_INTERFACES__INTERFACE:
				return getInterface();
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
			case configPackage.GSS_CONFIG_INTERFACES__MAIN_INTERFACE:
				setMainInterface((GSSConfigMainInterface)newValue);
				return;
			case configPackage.GSS_CONFIG_INTERFACES__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends GSSConfigInterface>)newValue);
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
			case configPackage.GSS_CONFIG_INTERFACES__MAIN_INTERFACE:
				setMainInterface((GSSConfigMainInterface)null);
				return;
			case configPackage.GSS_CONFIG_INTERFACES__INTERFACE:
				getInterface().clear();
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
			case configPackage.GSS_CONFIG_INTERFACES__MAIN_INTERFACE:
				return mainInterface != null;
			case configPackage.GSS_CONFIG_INTERFACES__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSConfigInterfacesImpl
