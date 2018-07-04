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
package es.uah.aut.srg.gss.imports.impl;

import es.uah.aut.srg.gss.imports.GSSImportUnit;
import es.uah.aut.srg.gss.imports.GSSImportVirtualSize;
import es.uah.aut.srg.gss.imports.importsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link es.uah.aut.srg.gss.imports.impl.GSSImportVirtualSizeImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.imports.impl.GSSImportVirtualSizeImpl#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.imports.impl.GSSImportVirtualSizeImpl#getAddSize <em>Add Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.imports.impl.GSSImportVirtualSizeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSImportVirtualSizeImpl extends MinimalEObjectImpl.Container implements GSSImportVirtualSize {
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
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

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
		return importsPackage.Literals.GSS_IMPORT_VIRTUAL_SIZE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, importsPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importsPackage.GSS_IMPORT_VIRTUAL_SIZE__TO, oldTo, to));
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
			eNotify(new ENotificationImpl(this, Notification.SET, importsPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE, oldAddSize, addSize));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, importsPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF:
				return getFieldRef();
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__TO:
				return getTo();
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE:
				return getAddSize();
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT:
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
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF:
				setFieldRef((String)newValue);
				return;
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__TO:
				setTo((String)newValue);
				return;
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE:
				setAddSize((String)newValue);
				return;
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT:
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
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF:
				setFieldRef(FIELD_REF_EDEFAULT);
				return;
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__TO:
				setTo(TO_EDEFAULT);
				return;
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE:
				setAddSize(ADD_SIZE_EDEFAULT);
				return;
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF:
				return FIELD_REF_EDEFAULT == null ? fieldRef != null : !FIELD_REF_EDEFAULT.equals(fieldRef);
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE:
				return ADD_SIZE_EDEFAULT == null ? addSize != null : !ADD_SIZE_EDEFAULT.equals(addSize);
			case importsPackage.GSS_IMPORT_VIRTUAL_SIZE__UNIT:
				return unit != UNIT_EDEFAULT;
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
		result.append(" (FieldRef: ");
		result.append(fieldRef);
		result.append(", to: ");
		result.append(to);
		result.append(", addSize: ");
		result.append(addSize);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //GSSImportVirtualSizeImpl
