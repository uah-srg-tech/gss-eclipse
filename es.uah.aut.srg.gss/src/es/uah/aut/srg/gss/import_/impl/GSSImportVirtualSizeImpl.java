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
package es.uah.aut.srg.gss.import_.impl;

import es.uah.aut.srg.gss.format.GSSFormatField;

import es.uah.aut.srg.gss.import_.GSSImportUnit;
import es.uah.aut.srg.gss.import_.GSSImportVirtualSize;
import es.uah.aut.srg.gss.import_.importPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Import Virtual Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.import_.impl.GSSImportVirtualSizeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.impl.GSSImportVirtualSizeImpl#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.impl.GSSImportVirtualSizeImpl#getAddSize <em>Add Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.impl.GSSImportVirtualSizeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSImportVirtualSizeImpl extends MinimalEObjectImpl.Container implements GSSImportVirtualSize {
	/**
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatField fieldRef;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatField to;

	/**
	 * The default value of the '{@link #getAddSize() <em>Add Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddSize()
	 * @generated
	 * @ordered
	 */
	protected static final String ADD_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddSize() <em>Add Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddSize()
	 * @generated
	 * @ordered
	 */
	protected String addSize = ADD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSImportUnit UNIT_EDEFAULT = GSSImportUnit.BITS;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected GSSImportUnit unit = UNIT_EDEFAULT;

	/**
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSImportVirtualSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return importPackage.Literals.GSS_IMPORT_VIRTUAL_SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField getFieldRef() {
		if (fieldRef != null && fieldRef.eIsProxy()) {
			InternalEObject oldFieldRef = (InternalEObject)fieldRef;
			fieldRef = (GSSFormatField)eResolveProxy(oldFieldRef);
			if (fieldRef != oldFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, importPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF, oldFieldRef, fieldRef));
			}
		}
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField basicGetFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(GSSFormatField newFieldRef) {
		GSSFormatField oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (GSSFormatField)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, importPackage.GSS_IMPORT_VIRTUAL_SIZE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(GSSFormatField newTo) {
		GSSFormatField oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.GSS_IMPORT_VIRTUAL_SIZE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddSize() {
		return addSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddSize(String newAddSize) {
		String oldAddSize = addSize;
		addSize = newAddSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE, oldAddSize, addSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(GSSImportUnit newUnit) {
		GSSImportUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT, oldUnit, unit, !oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		GSSImportUnit oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = UNIT_EDEFAULT;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, importPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF:
				if (resolve) return getFieldRef();
				return basicGetFieldRef();
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE:
				return getAddSize();
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT:
				return getUnit();
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
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF:
				setFieldRef((GSSFormatField)newValue);
				return;
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__TO:
				setTo((GSSFormatField)newValue);
				return;
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE:
				setAddSize((String)newValue);
				return;
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT:
				setUnit((GSSImportUnit)newValue);
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
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF:
				setFieldRef((GSSFormatField)null);
				return;
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__TO:
				setTo((GSSFormatField)null);
				return;
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE:
				setAddSize(ADD_SIZE_EDEFAULT);
				return;
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT:
				unsetUnit();
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
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF:
				return fieldRef != null;
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__TO:
				return to != null;
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE:
				return ADD_SIZE_EDEFAULT == null ? addSize != null : !ADD_SIZE_EDEFAULT.equals(addSize);
			case importPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT:
				return isSetUnit();
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
		result.append(" (addSize: ");
		result.append(addSize);
		result.append(", unit: ");
		if (unitESet) result.append(unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSImportVirtualSizeImpl
