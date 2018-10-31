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

import es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst;
import es.uah.aut.srg.gss.export.exportPackage;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Export Setting AI From Const</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromConstImpl#getValue <em>Value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromConstImpl#getToFieldRef <em>To Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromConstImpl#getToArrayIndex <em>To Array Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportSettingAIFromConstImpl extends MinimalEObjectImpl.Container implements GSSExportSettingAIFromConst {
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
	 * The cached value of the '{@link #getToFieldRef() <em>To Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToFieldRef()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatAIField toFieldRef;

	/**
	 * The default value of the '{@link #getToArrayIndex() <em>To Array Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrayIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_ARRAY_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToArrayIndex() <em>To Array Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrayIndex()
	 * @generated
	 * @ordered
	 */
	protected String toArrayIndex = TO_ARRAY_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportSettingAIFromConstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_SETTING_AI_FROM_CONST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatAIField getToFieldRef() {
		if (toFieldRef != null && toFieldRef.eIsProxy()) {
			InternalEObject oldToFieldRef = (InternalEObject)toFieldRef;
			toFieldRef = (GSSTmTcFormatAIField)eResolveProxy(oldToFieldRef);
			if (toFieldRef != oldToFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF, oldToFieldRef, toFieldRef));
			}
		}
		return toFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatAIField basicGetToFieldRef() {
		return toFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToFieldRef(GSSTmTcFormatAIField newToFieldRef) {
		GSSTmTcFormatAIField oldToFieldRef = toFieldRef;
		toFieldRef = newToFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF, oldToFieldRef, toFieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToArrayIndex() {
		return toArrayIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToArrayIndex(String newToArrayIndex) {
		String oldToArrayIndex = toArrayIndex;
		toArrayIndex = newToArrayIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX, oldToArrayIndex, toArrayIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE:
				return getValue();
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF:
				if (resolve) return getToFieldRef();
				return basicGetToFieldRef();
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX:
				return getToArrayIndex();
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
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE:
				setValue((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF:
				setToFieldRef((GSSTmTcFormatAIField)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX:
				setToArrayIndex((String)newValue);
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
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF:
				setToFieldRef((GSSTmTcFormatAIField)null);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX:
				setToArrayIndex(TO_ARRAY_INDEX_EDEFAULT);
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
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF:
				return toFieldRef != null;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX:
				return TO_ARRAY_INDEX_EDEFAULT == null ? toArrayIndex != null : !TO_ARRAY_INDEX_EDEFAULT.equals(toArrayIndex);
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
		result.append(", toArrayIndex: ");
		result.append(toArrayIndex);
		result.append(')');
		return result.toString();
	}

} //GSSExportSettingAIFromConstImpl
