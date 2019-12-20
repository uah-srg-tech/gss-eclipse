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
package es.uah.aut.srg.gss.tcinput.impl;

import es.uah.aut.srg.gss.format.GSSFormatField;
import es.uah.aut.srg.gss.tcinput.GSSTCInputField;
import es.uah.aut.srg.gss.tcinput.tcinputPackage;

import es.uah.aut.srg.tmtcif.tc.impl.TMTCIFTCFieldImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSSTC Input Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tcinput.impl.GSSTCInputFieldImpl#getGssField <em>Gss Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTCInputFieldImpl extends TMTCIFTCFieldImpl implements GSSTCInputField {
	/**
	 * The cached value of the '{@link #getGssField() <em>Gss Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGssField()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatField gssField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTCInputFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tcinputPackage.Literals.GSSTC_INPUT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField getGssField() {
		if (gssField != null && gssField.eIsProxy()) {
			InternalEObject oldGssField = (InternalEObject)gssField;
			gssField = (GSSFormatField)eResolveProxy(oldGssField);
			if (gssField != oldGssField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tcinputPackage.GSSTC_INPUT_FIELD__GSS_FIELD, oldGssField, gssField));
			}
		}
		return gssField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField basicGetGssField() {
		return gssField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGssField(GSSFormatField newGssField) {
		GSSFormatField oldGssField = gssField;
		gssField = newGssField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tcinputPackage.GSSTC_INPUT_FIELD__GSS_FIELD, oldGssField, gssField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tcinputPackage.GSSTC_INPUT_FIELD__GSS_FIELD:
				if (resolve) return getGssField();
				return basicGetGssField();
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
			case tcinputPackage.GSSTC_INPUT_FIELD__GSS_FIELD:
				setGssField((GSSFormatField)newValue);
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
			case tcinputPackage.GSSTC_INPUT_FIELD__GSS_FIELD:
				setGssField((GSSFormatField)null);
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
			case tcinputPackage.GSSTC_INPUT_FIELD__GSS_FIELD:
				return gssField != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSTCInputFieldImpl
