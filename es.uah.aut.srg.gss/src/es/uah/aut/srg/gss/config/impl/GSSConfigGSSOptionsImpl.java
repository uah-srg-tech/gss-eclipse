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
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags;
import es.uah.aut.srg.gss.config.GSSConfigGSSInfo;
import es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint;
import es.uah.aut.srg.gss.config.GSSConfigGSSOptions;
import es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config GSS Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSOptionsImpl#getGss_info <em>Gss info</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSOptionsImpl#getGss_info_print <em>Gss info print</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSOptionsImpl#getPhy_header_print <em>Phy header print</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSOptionsImpl#getDiscardErrorFlags <em>Discard Error Flags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigGSSOptionsImpl extends MinimalEObjectImpl.Container implements GSSConfigGSSOptions {
	/**
	 * The cached value of the '{@link #getGss_info() <em>Gss info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGss_info()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigGSSInfo gss_info;

	/**
	 * The cached value of the '{@link #getGss_info_print() <em>Gss info print</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGss_info_print()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigGSSInfoPrint gss_info_print;

	/**
	 * The cached value of the '{@link #getPhy_header_print() <em>Phy header print</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhy_header_print()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigPhyHeaderPrint phy_header_print;

	/**
	 * The cached value of the '{@link #getDiscardErrorFlags() <em>Discard Error Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscardErrorFlags()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigGSSDiscardErrorFlags discardErrorFlags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigGSSOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_GSS_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGSSInfo getGss_info() {
		return gss_info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGss_info(GSSConfigGSSInfo newGss_info, NotificationChain msgs) {
		GSSConfigGSSInfo oldGss_info = gss_info;
		gss_info = newGss_info;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO, oldGss_info, newGss_info);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGss_info(GSSConfigGSSInfo newGss_info) {
		if (newGss_info != gss_info) {
			NotificationChain msgs = null;
			if (gss_info != null)
				msgs = ((InternalEObject)gss_info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO, null, msgs);
			if (newGss_info != null)
				msgs = ((InternalEObject)newGss_info).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO, null, msgs);
			msgs = basicSetGss_info(newGss_info, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO, newGss_info, newGss_info));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGSSInfoPrint getGss_info_print() {
		return gss_info_print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGss_info_print(GSSConfigGSSInfoPrint newGss_info_print, NotificationChain msgs) {
		GSSConfigGSSInfoPrint oldGss_info_print = gss_info_print;
		gss_info_print = newGss_info_print;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT, oldGss_info_print, newGss_info_print);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGss_info_print(GSSConfigGSSInfoPrint newGss_info_print) {
		if (newGss_info_print != gss_info_print) {
			NotificationChain msgs = null;
			if (gss_info_print != null)
				msgs = ((InternalEObject)gss_info_print).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT, null, msgs);
			if (newGss_info_print != null)
				msgs = ((InternalEObject)newGss_info_print).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT, null, msgs);
			msgs = basicSetGss_info_print(newGss_info_print, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT, newGss_info_print, newGss_info_print));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPhyHeaderPrint getPhy_header_print() {
		return phy_header_print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhy_header_print(GSSConfigPhyHeaderPrint newPhy_header_print, NotificationChain msgs) {
		GSSConfigPhyHeaderPrint oldPhy_header_print = phy_header_print;
		phy_header_print = newPhy_header_print;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT, oldPhy_header_print, newPhy_header_print);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhy_header_print(GSSConfigPhyHeaderPrint newPhy_header_print) {
		if (newPhy_header_print != phy_header_print) {
			NotificationChain msgs = null;
			if (phy_header_print != null)
				msgs = ((InternalEObject)phy_header_print).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT, null, msgs);
			if (newPhy_header_print != null)
				msgs = ((InternalEObject)newPhy_header_print).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT, null, msgs);
			msgs = basicSetPhy_header_print(newPhy_header_print, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT, newPhy_header_print, newPhy_header_print));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGSSDiscardErrorFlags getDiscardErrorFlags() {
		return discardErrorFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscardErrorFlags(GSSConfigGSSDiscardErrorFlags newDiscardErrorFlags, NotificationChain msgs) {
		GSSConfigGSSDiscardErrorFlags oldDiscardErrorFlags = discardErrorFlags;
		discardErrorFlags = newDiscardErrorFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS, oldDiscardErrorFlags, newDiscardErrorFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscardErrorFlags(GSSConfigGSSDiscardErrorFlags newDiscardErrorFlags) {
		if (newDiscardErrorFlags != discardErrorFlags) {
			NotificationChain msgs = null;
			if (discardErrorFlags != null)
				msgs = ((InternalEObject)discardErrorFlags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS, null, msgs);
			if (newDiscardErrorFlags != null)
				msgs = ((InternalEObject)newDiscardErrorFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS, null, msgs);
			msgs = basicSetDiscardErrorFlags(newDiscardErrorFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS, newDiscardErrorFlags, newDiscardErrorFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO:
				return basicSetGss_info(null, msgs);
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT:
				return basicSetGss_info_print(null, msgs);
			case configPackage.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT:
				return basicSetPhy_header_print(null, msgs);
			case configPackage.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS:
				return basicSetDiscardErrorFlags(null, msgs);
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
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO:
				return getGss_info();
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT:
				return getGss_info_print();
			case configPackage.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT:
				return getPhy_header_print();
			case configPackage.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS:
				return getDiscardErrorFlags();
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
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO:
				setGss_info((GSSConfigGSSInfo)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT:
				setGss_info_print((GSSConfigGSSInfoPrint)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT:
				setPhy_header_print((GSSConfigPhyHeaderPrint)newValue);
				return;
			case configPackage.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS:
				setDiscardErrorFlags((GSSConfigGSSDiscardErrorFlags)newValue);
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
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO:
				setGss_info((GSSConfigGSSInfo)null);
				return;
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT:
				setGss_info_print((GSSConfigGSSInfoPrint)null);
				return;
			case configPackage.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT:
				setPhy_header_print((GSSConfigPhyHeaderPrint)null);
				return;
			case configPackage.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS:
				setDiscardErrorFlags((GSSConfigGSSDiscardErrorFlags)null);
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
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO:
				return gss_info != null;
			case configPackage.GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT:
				return gss_info_print != null;
			case configPackage.GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT:
				return phy_header_print != null;
			case configPackage.GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS:
				return discardErrorFlags != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSConfigGSSOptionsImpl
