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

import es.uah.aut.srg.gss.export.GSSExportDIC;
import es.uah.aut.srg.gss.export.exportPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Export DIC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportDICImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportDICImpl#getDICRef <em>DIC Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportDICImpl extends MinimalEObjectImpl.Container implements GSSExportDIC {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDICRef() <em>DIC Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDICRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DIC_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDICRef() <em>DIC Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDICRef()
	 * @generated
	 * @ordered
	 */
	protected String dicRef = DIC_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportDICImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_DIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_DIC__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDICRef() {
		return dicRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDICRef(String newDICRef) {
		String oldDICRef = dicRef;
		dicRef = newDICRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_DIC__DIC_REF, oldDICRef, dicRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_DIC__ID:
				return getId();
			case exportPackage.GSS_EXPORT_DIC__DIC_REF:
				return getDICRef();
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
			case exportPackage.GSS_EXPORT_DIC__ID:
				setId((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_DIC__DIC_REF:
				setDICRef((String)newValue);
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
			case exportPackage.GSS_EXPORT_DIC__ID:
				setId(ID_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_DIC__DIC_REF:
				setDICRef(DIC_REF_EDEFAULT);
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
			case exportPackage.GSS_EXPORT_DIC__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case exportPackage.GSS_EXPORT_DIC__DIC_REF:
				return DIC_REF_EDEFAULT == null ? dicRef != null : !DIC_REF_EDEFAULT.equals(dicRef);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", DICRef: ");
		result.append(dicRef);
		result.append(')');
		return result.toString();
	}

} //GSSExportDICImpl
