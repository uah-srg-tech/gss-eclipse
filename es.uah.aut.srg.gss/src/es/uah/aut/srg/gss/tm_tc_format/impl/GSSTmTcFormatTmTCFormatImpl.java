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

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormatType;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVRFieldSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

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
 * An implementation of the model object '<em><b>GSS Tm Tc Format Tm TC Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getCSField <em>CS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getCSFormulaField <em>CS Formula Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getVSField <em>VS Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getFDICField <em>FDIC Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getVRFieldSize <em>VR Field Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getAField <em>AField</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getAIField <em>AI Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTmTcFormatTmTCFormatImpl extends GSSModelElementImpl implements GSSTmTcFormatTmTCFormat {
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
	protected static final GSSTmTcFormatTmTCFormatType TYPE_EDEFAULT = GSSTmTcFormatTmTCFormatType.TM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTCFormatType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCSField() <em>CS Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTmTcFormatCSField> csField;

	/**
	 * The cached value of the '{@link #getCSFormulaField() <em>CS Formula Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSFormulaField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTmTcFormatCSFormulaField> csFormulaField;

	/**
	 * The cached value of the '{@link #getVSField() <em>VS Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTmTcFormatVSField> vsField;

	/**
	 * The cached value of the '{@link #getFDICField() <em>FDIC Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFDICField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTmTcFormatFDICField> fdicField;

	/**
	 * The cached value of the '{@link #getVRFieldSize() <em>VR Field Size</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRFieldSize()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTmTcFormatVRFieldSize> vrFieldSize;

	/**
	 * The cached value of the '{@link #getAField() <em>AField</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTmTcFormatAField> aField;

	/**
	 * The cached value of the '{@link #getAIField() <em>AI Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTmTcFormatAIField> aiField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTmTcFormatTmTCFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_TM_TC_FORMAT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTCFormatType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GSSTmTcFormatTmTCFormatType newType) {
		GSSTmTcFormatTmTCFormatType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTmTcFormatCSFormulaField> getCSFormulaField() {
		if (csFormulaField == null) {
			csFormulaField = new EObjectContainmentEList<GSSTmTcFormatCSFormulaField>(GSSTmTcFormatCSFormulaField.class, this, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FORMULA_FIELD);
		}
		return csFormulaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTmTcFormatCSField> getCSField() {
		if (csField == null) {
			csField = new EObjectContainmentEList<GSSTmTcFormatCSField>(GSSTmTcFormatCSField.class, this, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FIELD);
		}
		return csField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTmTcFormatVSField> getVSField() {
		if (vsField == null) {
			vsField = new EObjectContainmentEList<GSSTmTcFormatVSField>(GSSTmTcFormatVSField.class, this, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VS_FIELD);
		}
		return vsField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTmTcFormatFDICField> getFDICField() {
		if (fdicField == null) {
			fdicField = new EObjectContainmentEList<GSSTmTcFormatFDICField>(GSSTmTcFormatFDICField.class, this, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__FDIC_FIELD);
		}
		return fdicField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTmTcFormatVRFieldSize> getVRFieldSize() {
		if (vrFieldSize == null) {
			vrFieldSize = new EObjectContainmentEList<GSSTmTcFormatVRFieldSize>(GSSTmTcFormatVRFieldSize.class, this, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VR_FIELD_SIZE);
		}
		return vrFieldSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTmTcFormatAField> getAField() {
		if (aField == null) {
			aField = new EObjectContainmentEList<GSSTmTcFormatAField>(GSSTmTcFormatAField.class, this, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AFIELD);
		}
		return aField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTmTcFormatAIField> getAIField() {
		if (aiField == null) {
			aiField = new EObjectContainmentEList<GSSTmTcFormatAIField>(GSSTmTcFormatAIField.class, this, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AI_FIELD);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FIELD:
				return ((InternalEList<?>)getCSField()).basicRemove(otherEnd, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FORMULA_FIELD:
				return ((InternalEList<?>)getCSFormulaField()).basicRemove(otherEnd, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VS_FIELD:
				return ((InternalEList<?>)getVSField()).basicRemove(otherEnd, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__FDIC_FIELD:
				return ((InternalEList<?>)getFDICField()).basicRemove(otherEnd, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VR_FIELD_SIZE:
				return ((InternalEList<?>)getVRFieldSize()).basicRemove(otherEnd, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AFIELD:
				return ((InternalEList<?>)getAField()).basicRemove(otherEnd, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AI_FIELD:
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL:
				return getProtocol();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE:
				return getType();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FIELD:
				return getCSField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FORMULA_FIELD:
				return getCSFormulaField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VS_FIELD:
				return getVSField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__FDIC_FIELD:
				return getFDICField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VR_FIELD_SIZE:
				return getVRFieldSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AFIELD:
				return getAField();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AI_FIELD:
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE:
				setType((GSSTmTcFormatTmTCFormatType)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FIELD:
				getCSField().clear();
				getCSField().addAll((Collection<? extends GSSTmTcFormatCSField>)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FORMULA_FIELD:
				getCSFormulaField().clear();
				getCSFormulaField().addAll((Collection<? extends GSSTmTcFormatCSFormulaField>)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VS_FIELD:
				getVSField().clear();
				getVSField().addAll((Collection<? extends GSSTmTcFormatVSField>)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__FDIC_FIELD:
				getFDICField().clear();
				getFDICField().addAll((Collection<? extends GSSTmTcFormatFDICField>)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VR_FIELD_SIZE:
				getVRFieldSize().clear();
				getVRFieldSize().addAll((Collection<? extends GSSTmTcFormatVRFieldSize>)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AFIELD:
				getAField().clear();
				getAField().addAll((Collection<? extends GSSTmTcFormatAField>)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AI_FIELD:
				getAIField().clear();
				getAIField().addAll((Collection<? extends GSSTmTcFormatAIField>)newValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FIELD:
				getCSField().clear();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FORMULA_FIELD:
				getCSFormulaField().clear();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VS_FIELD:
				getVSField().clear();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__FDIC_FIELD:
				getFDICField().clear();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VR_FIELD_SIZE:
				getVRFieldSize().clear();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AFIELD:
				getAField().clear();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AI_FIELD:
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE:
				return type != TYPE_EDEFAULT;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FIELD:
				return csField != null && !csField.isEmpty();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__CS_FORMULA_FIELD:
				return csFormulaField != null && !csFormulaField.isEmpty();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VS_FIELD:
				return vsField != null && !vsField.isEmpty();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__FDIC_FIELD:
				return fdicField != null && !fdicField.isEmpty();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__VR_FIELD_SIZE:
				return vrFieldSize != null && !vrFieldSize.isEmpty();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AFIELD:
				return aField != null && !aField.isEmpty();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__AI_FIELD:
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
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //GSSTmTcFormatTmTCFormatImpl
