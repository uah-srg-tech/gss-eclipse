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

import es.uah.aut.srg.gss.export.GSSExportSettingFromConst;
import es.uah.aut.srg.gss.export.exportPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Export Setting From Const</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromConstImpl#getValue <em>Value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingFromConstImpl#getToFieldRef <em>To Field Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportSettingFromConstImpl extends MinimalEObjectImpl.Container implements GSSExportSettingFromConst {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	protected GSSExportSettingFromConstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_SETTING_FROM_CONST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_FROM_CONST__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_FROM_CONST__TO_FIELD_REF, oldToFieldRef, toFieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST__VALUE:
				return getValue();
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST__TO_FIELD_REF:
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
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST__VALUE:
				setValue((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST__TO_FIELD_REF:
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
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST__TO_FIELD_REF:
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
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case exportPackage.GSS_EXPORT_SETTING_FROM_CONST__TO_FIELD_REF:
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
		result.append(" (value: ");
		result.append(value);
		result.append(", toFieldRef: ");
		result.append(toFieldRef);
		result.append(')');
		return result.toString();
	}

} //GSSExportSettingFromConstImpl