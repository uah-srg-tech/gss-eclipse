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

import es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket;
import es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket;
import es.uah.aut.srg.gss.environment.environmentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Reference Special Packet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceSpecialPacketImpl#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceSpecialPacketImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceSpecialPacketImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceSpecialPacketImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceSpecialPacketImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentReferenceSpecialPacketImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentReferenceSpecialPacket {
	/**
	 * The cached value of the '{@link #getIdRef() <em>Id Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRef()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentSpecialPacket idRef;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

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
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentReferenceSpecialPacketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentSpecialPacket getIdRef() {
		if (idRef != null && idRef.eIsProxy()) {
			InternalEObject oldIdRef = (InternalEObject)idRef;
			idRef = (GSSEnvironmentSpecialPacket)eResolveProxy(oldIdRef);
			if (idRef != oldIdRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF, oldIdRef, idRef));
			}
		}
		return idRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentSpecialPacket basicGetIdRef() {
		return idRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRef(GSSEnvironmentSpecialPacket newIdRef) {
		GSSEnvironmentSpecialPacket oldIdRef = idRef;
		idRef = newIdRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF, oldIdRef, idRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL, oldLevel, level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF:
				if (resolve) return getIdRef();
				return basicGetIdRef();
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL:
				return getLevel();
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF:
				return getFieldRef();
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET:
				return getOffset();
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE:
				return getSize();
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
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF:
				setIdRef((GSSEnvironmentSpecialPacket)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL:
				setLevel((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF:
				setFieldRef((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET:
				setOffset((String)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE:
				setSize((String)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF:
				setIdRef((GSSEnvironmentSpecialPacket)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF:
				setFieldRef(FIELD_REF_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF:
				return idRef != null;
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF:
				return FIELD_REF_EDEFAULT == null ? fieldRef != null : !FIELD_REF_EDEFAULT.equals(fieldRef);
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
		result.append(" (level: ");
		result.append(level);
		result.append(", fieldRef: ");
		result.append(fieldRef);
		result.append(", offset: ");
		result.append(offset);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //GSSEnvironmentReferenceSpecialPacketImpl
