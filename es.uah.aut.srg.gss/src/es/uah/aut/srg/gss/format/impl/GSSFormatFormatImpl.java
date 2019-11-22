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

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.format.GSSFormatAField;
import es.uah.aut.srg.gss.format.GSSFormatAIField;
import es.uah.aut.srg.gss.format.GSSFormatCSField;
import es.uah.aut.srg.gss.format.GSSFormatCSFormulaField;
import es.uah.aut.srg.gss.format.GSSFormatFDICField;
import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.format.GSSFormatFormatType;
import es.uah.aut.srg.gss.format.GSSFormatVRFieldSize;
import es.uah.aut.srg.gss.format.GSSFormatVSField;
import es.uah.aut.srg.gss.format.formatPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Format Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl#getCSField <em>CS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl#getCSFormulaField <em>CS Formula Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl#getVSField <em>VS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl#getFDICField <em>FDIC Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl#getVRFieldSize <em>VR Field Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl#getAField <em>AField</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatFormatImpl#getAIField <em>AI Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFormatFormatImpl extends GSSModelElementImpl implements GSSFormatFormat {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSFormatFormatType TYPE_EDEFAULT = GSSFormatFormatType.TM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormatType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getCSField() <em>CS Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFormatCSField> csField;

	/**
	 * The cached value of the '{@link #getCSFormulaField() <em>CS Formula Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSFormulaField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFormatCSFormulaField> csFormulaField;

	/**
	 * The cached value of the '{@link #getVSField() <em>VS Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFormatVSField> vsField;

	/**
	 * The cached value of the '{@link #getFDICField() <em>FDIC Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFDICField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFormatFDICField> fdicField;

	/**
	 * The cached value of the '{@link #getVRFieldSize() <em>VR Field Size</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRFieldSize()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFormatVRFieldSize> vrFieldSize;

	/**
	 * The cached value of the '{@link #getAField() <em>AField</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFormatAField> aField;

	/**
	 * The cached value of the '{@link #getAIField() <em>AI Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFormatAIField> aiField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFormatFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.GSS_FORMAT_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_FORMAT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormatType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GSSFormatFormatType newType) {
		GSSFormatFormatType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_FORMAT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		GSSFormatFormatType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.GSS_FORMAT_FORMAT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFormatCSField> getCSField() {
		if (csField == null) {
			csField = new EObjectContainmentEList<GSSFormatCSField>(GSSFormatCSField.class, this, formatPackage.GSS_FORMAT_FORMAT__CS_FIELD);
		}
		return csField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFormatCSFormulaField> getCSFormulaField() {
		if (csFormulaField == null) {
			csFormulaField = new EObjectContainmentEList<GSSFormatCSFormulaField>(GSSFormatCSFormulaField.class, this, formatPackage.GSS_FORMAT_FORMAT__CS_FORMULA_FIELD);
		}
		return csFormulaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFormatVSField> getVSField() {
		if (vsField == null) {
			vsField = new EObjectContainmentEList<GSSFormatVSField>(GSSFormatVSField.class, this, formatPackage.GSS_FORMAT_FORMAT__VS_FIELD);
		}
		return vsField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFormatFDICField> getFDICField() {
		if (fdicField == null) {
			fdicField = new EObjectContainmentEList<GSSFormatFDICField>(GSSFormatFDICField.class, this, formatPackage.GSS_FORMAT_FORMAT__FDIC_FIELD);
		}
		return fdicField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFormatVRFieldSize> getVRFieldSize() {
		if (vrFieldSize == null) {
			vrFieldSize = new EObjectContainmentEList<GSSFormatVRFieldSize>(GSSFormatVRFieldSize.class, this, formatPackage.GSS_FORMAT_FORMAT__VR_FIELD_SIZE);
		}
		return vrFieldSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFormatAField> getAField() {
		if (aField == null) {
			aField = new EObjectContainmentEList<GSSFormatAField>(GSSFormatAField.class, this, formatPackage.GSS_FORMAT_FORMAT__AFIELD);
		}
		return aField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFormatAIField> getAIField() {
		if (aiField == null) {
			aiField = new EObjectContainmentEList<GSSFormatAIField>(GSSFormatAIField.class, this, formatPackage.GSS_FORMAT_FORMAT__AI_FIELD);
		}
		return aiField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case formatPackage.GSS_FORMAT_FORMAT__CS_FIELD:
				return ((InternalEList<?>)getCSField()).basicRemove(otherEnd, msgs);
			case formatPackage.GSS_FORMAT_FORMAT__CS_FORMULA_FIELD:
				return ((InternalEList<?>)getCSFormulaField()).basicRemove(otherEnd, msgs);
			case formatPackage.GSS_FORMAT_FORMAT__VS_FIELD:
				return ((InternalEList<?>)getVSField()).basicRemove(otherEnd, msgs);
			case formatPackage.GSS_FORMAT_FORMAT__FDIC_FIELD:
				return ((InternalEList<?>)getFDICField()).basicRemove(otherEnd, msgs);
			case formatPackage.GSS_FORMAT_FORMAT__VR_FIELD_SIZE:
				return ((InternalEList<?>)getVRFieldSize()).basicRemove(otherEnd, msgs);
			case formatPackage.GSS_FORMAT_FORMAT__AFIELD:
				return ((InternalEList<?>)getAField()).basicRemove(otherEnd, msgs);
			case formatPackage.GSS_FORMAT_FORMAT__AI_FIELD:
				return ((InternalEList<?>)getAIField()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case formatPackage.GSS_FORMAT_FORMAT__PROTOCOL:
				return getProtocol();
			case formatPackage.GSS_FORMAT_FORMAT__TYPE:
				return getType();
			case formatPackage.GSS_FORMAT_FORMAT__CS_FIELD:
				return getCSField();
			case formatPackage.GSS_FORMAT_FORMAT__CS_FORMULA_FIELD:
				return getCSFormulaField();
			case formatPackage.GSS_FORMAT_FORMAT__VS_FIELD:
				return getVSField();
			case formatPackage.GSS_FORMAT_FORMAT__FDIC_FIELD:
				return getFDICField();
			case formatPackage.GSS_FORMAT_FORMAT__VR_FIELD_SIZE:
				return getVRFieldSize();
			case formatPackage.GSS_FORMAT_FORMAT__AFIELD:
				return getAField();
			case formatPackage.GSS_FORMAT_FORMAT__AI_FIELD:
				return getAIField();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case formatPackage.GSS_FORMAT_FORMAT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case formatPackage.GSS_FORMAT_FORMAT__TYPE:
				setType((GSSFormatFormatType)newValue);
				return;
			case formatPackage.GSS_FORMAT_FORMAT__CS_FIELD:
				getCSField().clear();
				getCSField().addAll((Collection<? extends GSSFormatCSField>)newValue);
				return;
			case formatPackage.GSS_FORMAT_FORMAT__CS_FORMULA_FIELD:
				getCSFormulaField().clear();
				getCSFormulaField().addAll((Collection<? extends GSSFormatCSFormulaField>)newValue);
				return;
			case formatPackage.GSS_FORMAT_FORMAT__VS_FIELD:
				getVSField().clear();
				getVSField().addAll((Collection<? extends GSSFormatVSField>)newValue);
				return;
			case formatPackage.GSS_FORMAT_FORMAT__FDIC_FIELD:
				getFDICField().clear();
				getFDICField().addAll((Collection<? extends GSSFormatFDICField>)newValue);
				return;
			case formatPackage.GSS_FORMAT_FORMAT__VR_FIELD_SIZE:
				getVRFieldSize().clear();
				getVRFieldSize().addAll((Collection<? extends GSSFormatVRFieldSize>)newValue);
				return;
			case formatPackage.GSS_FORMAT_FORMAT__AFIELD:
				getAField().clear();
				getAField().addAll((Collection<? extends GSSFormatAField>)newValue);
				return;
			case formatPackage.GSS_FORMAT_FORMAT__AI_FIELD:
				getAIField().clear();
				getAIField().addAll((Collection<? extends GSSFormatAIField>)newValue);
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
			case formatPackage.GSS_FORMAT_FORMAT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case formatPackage.GSS_FORMAT_FORMAT__TYPE:
				unsetType();
				return;
			case formatPackage.GSS_FORMAT_FORMAT__CS_FIELD:
				getCSField().clear();
				return;
			case formatPackage.GSS_FORMAT_FORMAT__CS_FORMULA_FIELD:
				getCSFormulaField().clear();
				return;
			case formatPackage.GSS_FORMAT_FORMAT__VS_FIELD:
				getVSField().clear();
				return;
			case formatPackage.GSS_FORMAT_FORMAT__FDIC_FIELD:
				getFDICField().clear();
				return;
			case formatPackage.GSS_FORMAT_FORMAT__VR_FIELD_SIZE:
				getVRFieldSize().clear();
				return;
			case formatPackage.GSS_FORMAT_FORMAT__AFIELD:
				getAField().clear();
				return;
			case formatPackage.GSS_FORMAT_FORMAT__AI_FIELD:
				getAIField().clear();
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
			case formatPackage.GSS_FORMAT_FORMAT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case formatPackage.GSS_FORMAT_FORMAT__TYPE:
				return isSetType();
			case formatPackage.GSS_FORMAT_FORMAT__CS_FIELD:
				return csField != null && !csField.isEmpty();
			case formatPackage.GSS_FORMAT_FORMAT__CS_FORMULA_FIELD:
				return csFormulaField != null && !csFormulaField.isEmpty();
			case formatPackage.GSS_FORMAT_FORMAT__VS_FIELD:
				return vsField != null && !vsField.isEmpty();
			case formatPackage.GSS_FORMAT_FORMAT__FDIC_FIELD:
				return fdicField != null && !fdicField.isEmpty();
			case formatPackage.GSS_FORMAT_FORMAT__VR_FIELD_SIZE:
				return vrFieldSize != null && !vrFieldSize.isEmpty();
			case formatPackage.GSS_FORMAT_FORMAT__AFIELD:
				return aField != null && !aField.isEmpty();
			case formatPackage.GSS_FORMAT_FORMAT__AI_FIELD:
				return aiField != null && !aiField.isEmpty();
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSFormatFormatImpl
