/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.tmheader.impl;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.tmheader.GSSTMHeader;
import es.uah.aut.srg.gss.tmheader.tmheaderPackage;

import es.uah.aut.srg.tmtcif.tmheader.impl.TMTCIFTMHeaderImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSSTM Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tmheader.impl.GSSTMHeaderImpl#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTMHeaderImpl extends TMTCIFTMHeaderImpl implements GSSTMHeader {
	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat format;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTMHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tmheaderPackage.Literals.GSSTM_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getFormat() {
		if (format != null && format.eIsProxy()) {
			InternalEObject oldFormat = (InternalEObject)format;
			format = (GSSFormatFormat)eResolveProxy(oldFormat);
			if (format != oldFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tmheaderPackage.GSSTM_HEADER__FORMAT, oldFormat, format));
			}
		}
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(GSSFormatFormat newFormat) {
		GSSFormatFormat oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tmheaderPackage.GSSTM_HEADER__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tmheaderPackage.GSSTM_HEADER__FORMAT:
				if (resolve) return getFormat();
				return basicGetFormat();
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
			case tmheaderPackage.GSSTM_HEADER__FORMAT:
				setFormat((GSSFormatFormat)newValue);
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
			case tmheaderPackage.GSSTM_HEADER__FORMAT:
				setFormat((GSSFormatFormat)null);
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
			case tmheaderPackage.GSSTM_HEADER__FORMAT:
				return format != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSTMHeaderImpl
