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
import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocolType;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl#getSubtype <em>Subtype</em>}</li>
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentProtocolType type;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentProtocolType subtype;

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
	public GSSEnvironmentProtocolType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(GSSEnvironmentProtocolType newType, NotificationChain msgs) {
		GSSEnvironmentProtocolType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GSSEnvironmentProtocolType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentProtocolType getSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtype(GSSEnvironmentProtocolType newSubtype, NotificationChain msgs) {
		GSSEnvironmentProtocolType oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE, oldSubtype, newSubtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(GSSEnvironmentProtocolType newSubtype) {
		if (newSubtype != subtype) {
			NotificationChain msgs = null;
			if (subtype != null)
				msgs = ((InternalEObject)subtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE, null, msgs);
			if (newSubtype != null)
				msgs = ((InternalEObject)newSubtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE, null, msgs);
			msgs = basicSetSubtype(newSubtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE, newSubtype, newSubtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE:
				return basicSetType(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE:
				return basicSetSubtype(null, msgs);
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__ID:
				return getId();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__NAME:
				return getName();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE_LEVEL:
				return getTypeLevel();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE:
				return getType();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE:
				return getSubtype();
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE:
				setType((GSSEnvironmentProtocolType)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE:
				setSubtype((GSSEnvironmentProtocolType)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE:
				setType((GSSEnvironmentProtocolType)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE:
				setSubtype((GSSEnvironmentProtocolType)null);
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__TYPE:
				return type != null;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL__SUBTYPE:
				return subtype != null;
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
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentProtocolImpl
