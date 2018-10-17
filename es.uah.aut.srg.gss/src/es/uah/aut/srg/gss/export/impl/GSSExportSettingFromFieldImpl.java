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

import es.uah.aut.srg.gss.export.GSSExportSettingFromField;
import es.uah.aut.srg.gss.export.exportPackage;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatField;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Export Setting From Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFieldImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromFieldImpl#getToFieldRef <em>To Field Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportSettingFromFieldImpl extends MinimalEObjectImpl.Container implements GSSExportSettingFromField {
	/**
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatField fieldRef;

	/**
	 * The cached value of the '{@link #getToFieldRef() <em>To Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToFieldRef()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatField toFieldRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportSettingFromFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_SETTING_FROM_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatField getFieldRef() {
		if (fieldRef != null && fieldRef.eIsProxy()) {
			InternalEObject oldFieldRef = (InternalEObject)fieldRef;
			fieldRef = (GSSTmTcFormatField)eResolveProxy(oldFieldRef);
			if (fieldRef != oldFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF, oldFieldRef, fieldRef));
			}
		}
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatField basicGetFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(GSSTmTcFormatField newFieldRef) {
		GSSTmTcFormatField oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatField getToFieldRef() {
		if (toFieldRef != null && toFieldRef.eIsProxy()) {
			InternalEObject oldToFieldRef = (InternalEObject)toFieldRef;
			toFieldRef = (GSSTmTcFormatField)eResolveProxy(oldToFieldRef);
			if (toFieldRef != oldToFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF, oldToFieldRef, toFieldRef));
			}
		}
		return toFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatField basicGetToFieldRef() {
		return toFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToFieldRef(GSSTmTcFormatField newToFieldRef) {
		GSSTmTcFormatField oldToFieldRef = toFieldRef;
		toFieldRef = newToFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF, oldToFieldRef, toFieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF:
				if (resolve) return getFieldRef();
				return basicGetFieldRef();
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF:
				if (resolve) return getToFieldRef();
				return basicGetToFieldRef();
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
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF:
				setFieldRef((GSSTmTcFormatField)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF:
				setToFieldRef((GSSTmTcFormatField)newValue);
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
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF:
				setFieldRef((GSSTmTcFormatField)null);
				return;
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF:
				setToFieldRef((GSSTmTcFormatField)null);
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
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF:
				return fieldRef != null;
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF:
				return toFieldRef != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSExportSettingFromFieldImpl
