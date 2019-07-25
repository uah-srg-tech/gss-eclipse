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
package es.uah.aut.srg.gss.environment.impl;

import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl#getTypeLevel <em>Type Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl#getTypeOffset <em>Type Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl#getSubtypeOffset <em>Subtype Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentProtocolImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentProtocol {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeLevel() <em>Type Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeLevel() <em>Type Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLevel()
	 * @generated
	 * @ordered
	 */
	protected String typeLevel = TYPE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeOffset() <em>Type Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOffset() <em>Type Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOffset()
	 * @generated
	 * @ordered
	 */
	protected String typeOffset = TYPE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtypeOffset() <em>Subtype Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTYPE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtypeOffset() <em>Subtype Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeOffset()
	 * @generated
	 * @ordered
	 */
	protected String subtypeOffset = SUBTYPE_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_PROTOCOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeLevel() {
		return typeLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeLevel(String newTypeLevel) {
		String oldTypeLevel = typeLevel;
		typeLevel = newTypeLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_LEVEL, oldTypeLevel, typeLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeOffset() {
		return typeOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeOffset(String newTypeOffset) {
		String oldTypeOffset = typeOffset;
		typeOffset = newTypeOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_OFFSET, oldTypeOffset, typeOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubtypeOffset() {
		return subtypeOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtypeOffset(String newSubtypeOffset) {
		String oldSubtypeOffset = subtypeOffset;
		subtypeOffset = newSubtypeOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE_OFFSET, oldSubtypeOffset, subtypeOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__ID:
				return getId();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__NAME:
				return getName();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_LEVEL:
				return getTypeLevel();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_OFFSET:
				return getTypeOffset();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE_OFFSET:
				return getSubtypeOffset();
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__ID:
				setId((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__NAME:
				setName((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_LEVEL:
				setTypeLevel((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_OFFSET:
				setTypeOffset((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE_OFFSET:
				setSubtypeOffset((String)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__ID:
				setId(ID_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_LEVEL:
				setTypeLevel(TYPE_LEVEL_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_OFFSET:
				setTypeOffset(TYPE_OFFSET_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE_OFFSET:
				setSubtypeOffset(SUBTYPE_OFFSET_EDEFAULT);
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_LEVEL:
				return TYPE_LEVEL_EDEFAULT == null ? typeLevel != null : !TYPE_LEVEL_EDEFAULT.equals(typeLevel);
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_OFFSET:
				return TYPE_OFFSET_EDEFAULT == null ? typeOffset != null : !TYPE_OFFSET_EDEFAULT.equals(typeOffset);
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE_OFFSET:
				return SUBTYPE_OFFSET_EDEFAULT == null ? subtypeOffset != null : !SUBTYPE_OFFSET_EDEFAULT.equals(subtypeOffset);
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
		result.append(", name: ");
		result.append(name);
		result.append(", typeLevel: ");
		result.append(typeLevel);
		result.append(", typeOffset: ");
		result.append(typeOffset);
		result.append(", subtypeOffset: ");
		result.append(subtypeOffset);
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentProtocolImpl
