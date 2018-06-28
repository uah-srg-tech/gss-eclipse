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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
	 * The default value of the '{@link #getFieldRef() <em>Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected String fieldRef = FIELD_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getToFieldRef() <em>To Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToFieldRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_FIELD_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToFieldRef() <em>To Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToFieldRef()
	 * @generated
	 * @ordered
	 */
	protected String toFieldRef = TO_FIELD_REF_EDEFAULT;

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
	public String getFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(String newFieldRef) {
		String oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToFieldRef() {
		return toFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToFieldRef(String newToFieldRef) {
		String oldToFieldRef = toFieldRef;
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
				return getFieldRef();
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF:
				return getToFieldRef();
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
				setFieldRef((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF:
				setToFieldRef((String)newValue);
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
				setFieldRef(FIELD_REF_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF:
				setToFieldRef(TO_FIELD_REF_EDEFAULT);
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
				return FIELD_REF_EDEFAULT == null ? fieldRef != null : !FIELD_REF_EDEFAULT.equals(fieldRef);
			case exportPackage.GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF:
				return TO_FIELD_REF_EDEFAULT == null ? toFieldRef != null : !TO_FIELD_REF_EDEFAULT.equals(toFieldRef);
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
		result.append(" (fieldRef: ");
		result.append(fieldRef);
		result.append(", toFieldRef: ");
		result.append(toFieldRef);
		result.append(')');
		return result.toString();
	}

} //GSSExportSettingFromFieldImpl
