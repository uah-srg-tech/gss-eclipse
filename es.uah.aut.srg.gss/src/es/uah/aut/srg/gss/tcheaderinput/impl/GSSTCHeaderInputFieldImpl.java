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
package es.uah.aut.srg.gss.tcheaderinput.impl;

import es.uah.aut.srg.gss.format.GSSFormatField;

import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField;
import es.uah.aut.srg.gss.tcheaderinput.tcheaderinputPackage;

import es.uah.aut.srg.tmtcif.tcheader.impl.TMTCIFTCHeaderFieldImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSSTC Header Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tcheaderinput.impl.GSSTCHeaderInputFieldImpl#getGssHeaderField <em>Gss Header Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTCHeaderInputFieldImpl extends TMTCIFTCHeaderFieldImpl implements GSSTCHeaderInputField {
	/**
	 * The cached value of the '{@link #getGssHeaderField() <em>Gss Header Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssHeaderField()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatField gssHeaderField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTCHeaderInputFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tcheaderinputPackage.Literals.GSSTC_HEADER_INPUT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField getGssHeaderField() {
		if (gssHeaderField != null && gssHeaderField.eIsProxy()) {
			InternalEObject oldGssHeaderField = (InternalEObject)gssHeaderField;
			gssHeaderField = (GSSFormatField)eResolveProxy(oldGssHeaderField);
			if (gssHeaderField != oldGssHeaderField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcheaderinputPackage.GSSTC_HEADER_INPUT_FIELD__GSS_HEADER_FIELD, oldGssHeaderField, gssHeaderField));
			}
		}
		return gssHeaderField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField basicGetGssHeaderField() {
		return gssHeaderField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGssHeaderField(GSSFormatField newGssHeaderField) {
		GSSFormatField oldGssHeaderField = gssHeaderField;
		gssHeaderField = newGssHeaderField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcheaderinputPackage.GSSTC_HEADER_INPUT_FIELD__GSS_HEADER_FIELD, oldGssHeaderField, gssHeaderField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tcheaderinputPackage.GSSTC_HEADER_INPUT_FIELD__GSS_HEADER_FIELD:
				if (resolve) return getGssHeaderField();
				return basicGetGssHeaderField();
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
			case tcheaderinputPackage.GSSTC_HEADER_INPUT_FIELD__GSS_HEADER_FIELD:
				setGssHeaderField((GSSFormatField)newValue);
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
			case tcheaderinputPackage.GSSTC_HEADER_INPUT_FIELD__GSS_HEADER_FIELD:
				setGssHeaderField((GSSFormatField)null);
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
			case tcheaderinputPackage.GSSTC_HEADER_INPUT_FIELD__GSS_HEADER_FIELD:
				return gssHeaderField != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSTCHeaderInputFieldImpl
