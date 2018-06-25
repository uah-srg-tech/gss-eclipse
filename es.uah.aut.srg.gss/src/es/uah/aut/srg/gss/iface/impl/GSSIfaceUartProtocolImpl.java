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
package es.uah.aut.srg.gss.iface.impl;

import es.uah.aut.srg.gss.iface.GSSIfaceConstSize;
import es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldOffset;
import es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldTrim;
import es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern;
import es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol;
import es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower;
import es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit;
import es.uah.aut.srg.gss.iface.ifacePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Iface Uart Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl#getPower <em>Power</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl#getConstSize <em>Const Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl#getSizeFieldOffset <em>Size Field Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl#getSizeFieldTrim <em>Size Field Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl#getSyncPattern <em>Sync Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSIfaceUartProtocolImpl extends MinimalEObjectImpl.Container implements GSSIfaceUartProtocol {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSIfaceUartProtocolUnit UNIT_EDEFAULT = GSSIfaceUartProtocolUnit.BYTES;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceUartProtocolUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final GSSIfaceUartProtocolPower POWER_EDEFAULT = GSSIfaceUartProtocolPower.NO;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceUartProtocolPower power = POWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstSize() <em>Const Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstSize()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceConstSize constSize;

	/**
	 * The cached value of the '{@link #getSizeFieldOffset() <em>Size Field Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeFieldOffset()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceSizeFieldOffset sizeFieldOffset;

	/**
	 * The cached value of the '{@link #getSizeFieldTrim() <em>Size Field Trim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeFieldTrim()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceSizeFieldTrim sizeFieldTrim;

	/**
	 * The cached value of the '{@link #getSyncPattern() <em>Sync Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncPattern()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceSyncPattern syncPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSIfaceUartProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ifacePackage.Literals.GSS_IFACE_UART_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartProtocolUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(GSSIfaceUartProtocolUnit newUnit) {
		GSSIfaceUartProtocolUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartProtocolPower getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(GSSIfaceUartProtocolPower newPower) {
		GSSIfaceUartProtocolPower oldPower = power;
		power = newPower == null ? POWER_EDEFAULT : newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceConstSize getConstSize() {
		return constSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstSize(GSSIfaceConstSize newConstSize, NotificationChain msgs) {
		GSSIfaceConstSize oldConstSize = constSize;
		constSize = newConstSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__CONST_SIZE, oldConstSize, newConstSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstSize(GSSIfaceConstSize newConstSize) {
		if (newConstSize != constSize) {
			NotificationChain msgs = null;
			if (constSize != null)
				msgs = ((InternalEObject)constSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PROTOCOL__CONST_SIZE, null, msgs);
			if (newConstSize != null)
				msgs = ((InternalEObject)newConstSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PROTOCOL__CONST_SIZE, null, msgs);
			msgs = basicSetConstSize(newConstSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__CONST_SIZE, newConstSize, newConstSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSizeFieldOffset getSizeFieldOffset() {
		return sizeFieldOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizeFieldOffset(GSSIfaceSizeFieldOffset newSizeFieldOffset, NotificationChain msgs) {
		GSSIfaceSizeFieldOffset oldSizeFieldOffset = sizeFieldOffset;
		sizeFieldOffset = newSizeFieldOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET, oldSizeFieldOffset, newSizeFieldOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeFieldOffset(GSSIfaceSizeFieldOffset newSizeFieldOffset) {
		if (newSizeFieldOffset != sizeFieldOffset) {
			NotificationChain msgs = null;
			if (sizeFieldOffset != null)
				msgs = ((InternalEObject)sizeFieldOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET, null, msgs);
			if (newSizeFieldOffset != null)
				msgs = ((InternalEObject)newSizeFieldOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET, null, msgs);
			msgs = basicSetSizeFieldOffset(newSizeFieldOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET, newSizeFieldOffset, newSizeFieldOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSizeFieldTrim getSizeFieldTrim() {
		return sizeFieldTrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizeFieldTrim(GSSIfaceSizeFieldTrim newSizeFieldTrim, NotificationChain msgs) {
		GSSIfaceSizeFieldTrim oldSizeFieldTrim = sizeFieldTrim;
		sizeFieldTrim = newSizeFieldTrim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM, oldSizeFieldTrim, newSizeFieldTrim);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeFieldTrim(GSSIfaceSizeFieldTrim newSizeFieldTrim) {
		if (newSizeFieldTrim != sizeFieldTrim) {
			NotificationChain msgs = null;
			if (sizeFieldTrim != null)
				msgs = ((InternalEObject)sizeFieldTrim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM, null, msgs);
			if (newSizeFieldTrim != null)
				msgs = ((InternalEObject)newSizeFieldTrim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM, null, msgs);
			msgs = basicSetSizeFieldTrim(newSizeFieldTrim, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM, newSizeFieldTrim, newSizeFieldTrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSyncPattern getSyncPattern() {
		return syncPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSyncPattern(GSSIfaceSyncPattern newSyncPattern, NotificationChain msgs) {
		GSSIfaceSyncPattern oldSyncPattern = syncPattern;
		syncPattern = newSyncPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN, oldSyncPattern, newSyncPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncPattern(GSSIfaceSyncPattern newSyncPattern) {
		if (newSyncPattern != syncPattern) {
			NotificationChain msgs = null;
			if (syncPattern != null)
				msgs = ((InternalEObject)syncPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN, null, msgs);
			if (newSyncPattern != null)
				msgs = ((InternalEObject)newSyncPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN, null, msgs);
			msgs = basicSetSyncPattern(newSyncPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN, newSyncPattern, newSyncPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__CONST_SIZE:
				return basicSetConstSize(null, msgs);
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET:
				return basicSetSizeFieldOffset(null, msgs);
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM:
				return basicSetSizeFieldTrim(null, msgs);
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN:
				return basicSetSyncPattern(null, msgs);
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
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__UNIT:
				return getUnit();
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__POWER:
				return getPower();
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__CONST_SIZE:
				return getConstSize();
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET:
				return getSizeFieldOffset();
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM:
				return getSizeFieldTrim();
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN:
				return getSyncPattern();
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
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__UNIT:
				setUnit((GSSIfaceUartProtocolUnit)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__POWER:
				setPower((GSSIfaceUartProtocolPower)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__CONST_SIZE:
				setConstSize((GSSIfaceConstSize)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET:
				setSizeFieldOffset((GSSIfaceSizeFieldOffset)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM:
				setSizeFieldTrim((GSSIfaceSizeFieldTrim)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN:
				setSyncPattern((GSSIfaceSyncPattern)newValue);
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
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__CONST_SIZE:
				setConstSize((GSSIfaceConstSize)null);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET:
				setSizeFieldOffset((GSSIfaceSizeFieldOffset)null);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM:
				setSizeFieldTrim((GSSIfaceSizeFieldTrim)null);
				return;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN:
				setSyncPattern((GSSIfaceSyncPattern)null);
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
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__UNIT:
				return unit != UNIT_EDEFAULT;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__POWER:
				return power != POWER_EDEFAULT;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__CONST_SIZE:
				return constSize != null;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET:
				return sizeFieldOffset != null;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM:
				return sizeFieldTrim != null;
			case ifacePackage.GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN:
				return syncPattern != null;
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(", power: ");
		result.append(power);
		result.append(')');
		return result.toString();
	}

} //GSSIfaceUartProtocolImpl