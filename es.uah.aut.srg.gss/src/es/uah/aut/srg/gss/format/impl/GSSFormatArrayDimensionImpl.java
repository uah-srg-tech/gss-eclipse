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
package es.uah.aut.srg.gss.format.impl;

import es.uah.aut.srg.gss.format.GSSFormatArrayDimension;
import es.uah.aut.srg.gss.format.formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Format Array Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatArrayDimensionImpl#getFidRef <em>Fid Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatArrayDimensionImpl#getMaxItems <em>Max Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFormatArrayDimensionImpl extends MinimalEObjectImpl.Container implements GSSFormatArrayDimension {
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
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected String maxItems = MAX_ITEMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFormatArrayDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.GSS_FORMAT_ARRAY_DIMENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_ARRAY_DIMENSION__FID_REF, oldFidRef, fidRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxItems(String newMaxItems) {
		String oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION__FID_REF:
				return getFidRef();
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS:
				return getMaxItems();
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
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION__FID_REF:
				setFidRef((String)newValue);
				return;
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS:
				setMaxItems((String)newValue);
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
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION__FID_REF:
				setFidRef(FID_REF_EDEFAULT);
				return;
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
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
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION__FID_REF:
				return FID_REF_EDEFAULT == null ? fidRef != null : !FID_REF_EDEFAULT.equals(fidRef);
			case formatPackage.GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS:
				return MAX_ITEMS_EDEFAULT == null ? maxItems != null : !MAX_ITEMS_EDEFAULT.equals(maxItems);
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
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(')');
		return result.toString();
	}

} //GSSFormatArrayDimensionImpl
