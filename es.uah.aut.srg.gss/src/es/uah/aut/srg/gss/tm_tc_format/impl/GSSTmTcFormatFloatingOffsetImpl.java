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
package es.uah.aut.srg.gss.tm_tc_format.impl;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Tm Tc Format Floating Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFloatingOffsetImpl#getFidRef <em>Fid Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTmTcFormatFloatingOffsetImpl extends MinimalEObjectImpl.Container implements GSSTmTcFormatFloatingOffset {
	/**
	 * The default value of the '{@link #getFidRef() <em>Fid Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFidRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FID_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFidRef() <em>Fid Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFidRef()
	 * @generated
	 * @ordered
	 */
	protected String fidRef = FID_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTmTcFormatFloatingOffsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FLOATING_OFFSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFidRef() {
		return fidRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFidRef(String newFidRef) {
		String oldFidRef = fidRef;
		fidRef = newFidRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF, oldFidRef, fidRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF:
				return getFidRef();
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF:
				setFidRef((String)newValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF:
				setFidRef(FID_REF_EDEFAULT);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FLOATING_OFFSET__FID_REF:
				return FID_REF_EDEFAULT == null ? fidRef != null : !FID_REF_EDEFAULT.equals(fidRef);
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
		result.append(" (fidRef: ");
		result.append(fidRef);
		result.append(')');
		return result.toString();
	}

} //GSSTmTcFormatFloatingOffsetImpl
