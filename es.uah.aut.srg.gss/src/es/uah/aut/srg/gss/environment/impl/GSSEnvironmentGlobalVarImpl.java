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

import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Global Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl#getInitial_value <em>Initial value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl#getReferenceField <em>Reference Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl#getReferencePeriodicTC <em>Reference Periodic TC</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl#getReferenceSpecialPacket <em>Reference Special Packet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentGlobalVarImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentGlobalVar {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentGlobalVarType TYPE_EDEFAULT = GSSEnvironmentGlobalVarType.UINT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentGlobalVarType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getInitial_value() <em>Initial value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_value()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitial_value() <em>Initial value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial_value()
	 * @generated
	 * @ordered
	 */
	protected String initial_value = INITIAL_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceField() <em>Reference Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceField()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentReferenceField referenceField;

	/**
	 * The cached value of the '{@link #getReferencePeriodicTC() <em>Reference Periodic TC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePeriodicTC()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentReferencePeriodicTC referencePeriodicTC;

	/**
	 * The cached value of the '{@link #getReferenceSpecialPacket() <em>Reference Special Packet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSpecialPacket()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentReferenceSpecialPacket referenceSpecialPacket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentGlobalVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_GLOBAL_VAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGlobalVarType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GSSEnvironmentGlobalVarType newType) {
		GSSEnvironmentGlobalVarType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		GSSEnvironmentGlobalVarType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public String getInitial_value() {
		return initial_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial_value(String newInitial_value) {
		String oldInitial_value = initial_value;
		initial_value = newInitial_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__INITIAL_VALUE, oldInitial_value, initial_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentReferenceField getReferenceField() {
		return referenceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceField(GSSEnvironmentReferenceField newReferenceField, NotificationChain msgs) {
		GSSEnvironmentReferenceField oldReferenceField = referenceField;
		referenceField = newReferenceField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD, oldReferenceField, newReferenceField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceField(GSSEnvironmentReferenceField newReferenceField) {
		if (newReferenceField != referenceField) {
			NotificationChain msgs = null;
			if (referenceField != null)
				msgs = ((InternalEObject)referenceField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD, null, msgs);
			if (newReferenceField != null)
				msgs = ((InternalEObject)newReferenceField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD, null, msgs);
			msgs = basicSetReferenceField(newReferenceField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD, newReferenceField, newReferenceField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentReferencePeriodicTC getReferencePeriodicTC() {
		return referencePeriodicTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencePeriodicTC(GSSEnvironmentReferencePeriodicTC newReferencePeriodicTC, NotificationChain msgs) {
		GSSEnvironmentReferencePeriodicTC oldReferencePeriodicTC = referencePeriodicTC;
		referencePeriodicTC = newReferencePeriodicTC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC, oldReferencePeriodicTC, newReferencePeriodicTC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencePeriodicTC(GSSEnvironmentReferencePeriodicTC newReferencePeriodicTC) {
		if (newReferencePeriodicTC != referencePeriodicTC) {
			NotificationChain msgs = null;
			if (referencePeriodicTC != null)
				msgs = ((InternalEObject)referencePeriodicTC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC, null, msgs);
			if (newReferencePeriodicTC != null)
				msgs = ((InternalEObject)newReferencePeriodicTC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC, null, msgs);
			msgs = basicSetReferencePeriodicTC(newReferencePeriodicTC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC, newReferencePeriodicTC, newReferencePeriodicTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentReferenceSpecialPacket getReferenceSpecialPacket() {
		return referenceSpecialPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceSpecialPacket(GSSEnvironmentReferenceSpecialPacket newReferenceSpecialPacket, NotificationChain msgs) {
		GSSEnvironmentReferenceSpecialPacket oldReferenceSpecialPacket = referenceSpecialPacket;
		referenceSpecialPacket = newReferenceSpecialPacket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET, oldReferenceSpecialPacket, newReferenceSpecialPacket);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSpecialPacket(GSSEnvironmentReferenceSpecialPacket newReferenceSpecialPacket) {
		if (newReferenceSpecialPacket != referenceSpecialPacket) {
			NotificationChain msgs = null;
			if (referenceSpecialPacket != null)
				msgs = ((InternalEObject)referenceSpecialPacket).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET, null, msgs);
			if (newReferenceSpecialPacket != null)
				msgs = ((InternalEObject)newReferenceSpecialPacket).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET, null, msgs);
			msgs = basicSetReferenceSpecialPacket(newReferenceSpecialPacket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET, newReferenceSpecialPacket, newReferenceSpecialPacket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD:
				return basicSetReferenceField(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC:
				return basicSetReferencePeriodicTC(null, msgs);
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET:
				return basicSetReferenceSpecialPacket(null, msgs);
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
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__NAME:
				return getName();
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__ID:
				return getId();
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__TYPE:
				return getType();
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__INITIAL_VALUE:
				return getInitial_value();
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD:
				return getReferenceField();
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC:
				return getReferencePeriodicTC();
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET:
				return getReferenceSpecialPacket();
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
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__NAME:
				setName((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__ID:
				setId((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__TYPE:
				setType((GSSEnvironmentGlobalVarType)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__INITIAL_VALUE:
				setInitial_value((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD:
				setReferenceField((GSSEnvironmentReferenceField)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC:
				setReferencePeriodicTC((GSSEnvironmentReferencePeriodicTC)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET:
				setReferenceSpecialPacket((GSSEnvironmentReferenceSpecialPacket)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__ID:
				setId(ID_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__TYPE:
				unsetType();
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__INITIAL_VALUE:
				setInitial_value(INITIAL_VALUE_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD:
				setReferenceField((GSSEnvironmentReferenceField)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC:
				setReferencePeriodicTC((GSSEnvironmentReferencePeriodicTC)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET:
				setReferenceSpecialPacket((GSSEnvironmentReferenceSpecialPacket)null);
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
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__TYPE:
				return isSetType();
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initial_value != null : !INITIAL_VALUE_EDEFAULT.equals(initial_value);
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD:
				return referenceField != null;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC:
				return referencePeriodicTC != null;
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET:
				return referenceSpecialPacket != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", initial_value: ");
		result.append(initial_value);
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentGlobalVarImpl
