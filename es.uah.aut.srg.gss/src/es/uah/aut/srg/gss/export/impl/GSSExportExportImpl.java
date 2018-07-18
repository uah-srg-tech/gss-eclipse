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
package es.uah.aut.srg.gss.export.impl;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.export.GSSExportActivateDICs;
import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.export.GSSExportSettings;
import es.uah.aut.srg.gss.export.GSSExportSizes;
import es.uah.aut.srg.gss.export.exportPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Export Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportExportImpl#getFrom <em>From</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportExportImpl#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportExportImpl#getSizes <em>Sizes</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportExportImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportExportImpl#getActivateDICs <em>Activate DI Cs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportExportImpl extends GSSModelElementImpl implements GSSExportExport {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSizes() <em>Sizes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizes()
	 * @generated
	 * @ordered
	 */
	protected GSSExportSizes sizes;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected GSSExportSettings settings;

	/**
	 * The cached value of the '{@link #getActivateDICs() <em>Activate DI Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivateDICs()
	 * @generated
	 * @ordered
	 */
	protected GSSExportActivateDICs activateDICs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportExportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_EXPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_EXPORT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_EXPORT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSizes getSizes() {
		return sizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizes(GSSExportSizes newSizes, NotificationChain msgs) {
		GSSExportSizes oldSizes = sizes;
		sizes = newSizes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_EXPORT__SIZES, oldSizes, newSizes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizes(GSSExportSizes newSizes) {
		if (newSizes != sizes) {
			NotificationChain msgs = null;
			if (sizes != null)
				msgs = ((InternalEObject)sizes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - exportPackage.GSS_EXPORT_EXPORT__SIZES, null, msgs);
			if (newSizes != null)
				msgs = ((InternalEObject)newSizes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - exportPackage.GSS_EXPORT_EXPORT__SIZES, null, msgs);
			msgs = basicSetSizes(newSizes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_EXPORT__SIZES, newSizes, newSizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportSettings getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(GSSExportSettings newSettings, NotificationChain msgs) {
		GSSExportSettings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_EXPORT__SETTINGS, oldSettings, newSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(GSSExportSettings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - exportPackage.GSS_EXPORT_EXPORT__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - exportPackage.GSS_EXPORT_EXPORT__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_EXPORT__SETTINGS, newSettings, newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportActivateDICs getActivateDICs() {
		return activateDICs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivateDICs(GSSExportActivateDICs newActivateDICs, NotificationChain msgs) {
		GSSExportActivateDICs oldActivateDICs = activateDICs;
		activateDICs = newActivateDICs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_EXPORT__ACTIVATE_DI_CS, oldActivateDICs, newActivateDICs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivateDICs(GSSExportActivateDICs newActivateDICs) {
		if (newActivateDICs != activateDICs) {
			NotificationChain msgs = null;
			if (activateDICs != null)
				msgs = ((InternalEObject)activateDICs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - exportPackage.GSS_EXPORT_EXPORT__ACTIVATE_DI_CS, null, msgs);
			if (newActivateDICs != null)
				msgs = ((InternalEObject)newActivateDICs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - exportPackage.GSS_EXPORT_EXPORT__ACTIVATE_DI_CS, null, msgs);
			msgs = basicSetActivateDICs(newActivateDICs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_EXPORT__ACTIVATE_DI_CS, newActivateDICs, newActivateDICs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_EXPORT__SIZES:
				return basicSetSizes(null, msgs);
			case exportPackage.GSS_EXPORT_EXPORT__SETTINGS:
				return basicSetSettings(null, msgs);
			case exportPackage.GSS_EXPORT_EXPORT__ACTIVATE_DI_CS:
				return basicSetActivateDICs(null, msgs);
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
			case exportPackage.GSS_EXPORT_EXPORT__FROM:
				return getFrom();
			case exportPackage.GSS_EXPORT_EXPORT__TO:
				return getTo();
			case exportPackage.GSS_EXPORT_EXPORT__SIZES:
				return getSizes();
			case exportPackage.GSS_EXPORT_EXPORT__SETTINGS:
				return getSettings();
			case exportPackage.GSS_EXPORT_EXPORT__ACTIVATE_DI_CS:
				return getActivateDICs();
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
			case exportPackage.GSS_EXPORT_EXPORT__FROM:
				setFrom((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_EXPORT__TO:
				setTo((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_EXPORT__SIZES:
				setSizes((GSSExportSizes)newValue);
				return;
			case exportPackage.GSS_EXPORT_EXPORT__SETTINGS:
				setSettings((GSSExportSettings)newValue);
				return;
			case exportPackage.GSS_EXPORT_EXPORT__ACTIVATE_DI_CS:
				setActivateDICs((GSSExportActivateDICs)newValue);
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
			case exportPackage.GSS_EXPORT_EXPORT__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_EXPORT__TO:
				setTo(TO_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_EXPORT__SIZES:
				setSizes((GSSExportSizes)null);
				return;
			case exportPackage.GSS_EXPORT_EXPORT__SETTINGS:
				setSettings((GSSExportSettings)null);
				return;
			case exportPackage.GSS_EXPORT_EXPORT__ACTIVATE_DI_CS:
				setActivateDICs((GSSExportActivateDICs)null);
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
			case exportPackage.GSS_EXPORT_EXPORT__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case exportPackage.GSS_EXPORT_EXPORT__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case exportPackage.GSS_EXPORT_EXPORT__SIZES:
				return sizes != null;
			case exportPackage.GSS_EXPORT_EXPORT__SETTINGS:
				return settings != null;
			case exportPackage.GSS_EXPORT_EXPORT__ACTIVATE_DI_CS:
				return activateDICs != null;
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
		result.append(" (from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //GSSExportExportImpl
