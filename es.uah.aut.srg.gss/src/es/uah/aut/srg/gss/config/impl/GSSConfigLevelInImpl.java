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
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.config.GSSConfigExportToPrevLevel;
import es.uah.aut.srg.gss.config.GSSConfigLevelIn;
import es.uah.aut.srg.gss.config.GSSConfigTCFormat;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Level In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelInImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelInImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelInImpl#getTCformat <em>TCformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelInImpl#getExport_to_prev_Level <em>Export to prev Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigLevelInImpl extends MinimalEObjectImpl.Container implements GSSConfigLevelIn {
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
	 * The cached value of the '{@link #getTCformat() <em>TCformat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCformat()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigTCFormat tCformat;

	/**
	 * The cached value of the '{@link #getExport_to_prev_Level() <em>Export to prev Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport_to_prev_Level()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigExportToPrevLevel export_to_prev_Level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigLevelInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_LEVEL_IN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_LEVEL_IN__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_LEVEL_IN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigTCFormat getTCformat() {
		return tCformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCformat(GSSConfigTCFormat newTCformat, NotificationChain msgs) {
		GSSConfigTCFormat oldTCformat = tCformat;
		tCformat = newTCformat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_LEVEL_IN__TCFORMAT, oldTCformat, newTCformat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCformat(GSSConfigTCFormat newTCformat) {
		if (newTCformat != tCformat) {
			NotificationChain msgs = null;
			if (tCformat != null)
				msgs = ((InternalEObject)tCformat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_LEVEL_IN__TCFORMAT, null, msgs);
			if (newTCformat != null)
				msgs = ((InternalEObject)newTCformat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_LEVEL_IN__TCFORMAT, null, msgs);
			msgs = basicSetTCformat(newTCformat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_LEVEL_IN__TCFORMAT, newTCformat, newTCformat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigExportToPrevLevel getExport_to_prev_Level() {
		return export_to_prev_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExport_to_prev_Level(GSSConfigExportToPrevLevel newExport_to_prev_Level, NotificationChain msgs) {
		GSSConfigExportToPrevLevel oldExport_to_prev_Level = export_to_prev_Level;
		export_to_prev_Level = newExport_to_prev_Level;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL, oldExport_to_prev_Level, newExport_to_prev_Level);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport_to_prev_Level(GSSConfigExportToPrevLevel newExport_to_prev_Level) {
		if (newExport_to_prev_Level != export_to_prev_Level) {
			NotificationChain msgs = null;
			if (export_to_prev_Level != null)
				msgs = ((InternalEObject)export_to_prev_Level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL, null, msgs);
			if (newExport_to_prev_Level != null)
				msgs = ((InternalEObject)newExport_to_prev_Level).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL, null, msgs);
			msgs = basicSetExport_to_prev_Level(newExport_to_prev_Level, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL, newExport_to_prev_Level, newExport_to_prev_Level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_LEVEL_IN__TCFORMAT:
				return basicSetTCformat(null, msgs);
			case configPackage.GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL:
				return basicSetExport_to_prev_Level(null, msgs);
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
			case configPackage.GSS_CONFIG_LEVEL_IN__ID:
				return getId();
			case configPackage.GSS_CONFIG_LEVEL_IN__NAME:
				return getName();
			case configPackage.GSS_CONFIG_LEVEL_IN__TCFORMAT:
				return getTCformat();
			case configPackage.GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL:
				return getExport_to_prev_Level();
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
			case configPackage.GSS_CONFIG_LEVEL_IN__ID:
				setId((String)newValue);
				return;
			case configPackage.GSS_CONFIG_LEVEL_IN__NAME:
				setName((String)newValue);
				return;
			case configPackage.GSS_CONFIG_LEVEL_IN__TCFORMAT:
				setTCformat((GSSConfigTCFormat)newValue);
				return;
			case configPackage.GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL:
				setExport_to_prev_Level((GSSConfigExportToPrevLevel)newValue);
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
			case configPackage.GSS_CONFIG_LEVEL_IN__ID:
				setId(ID_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_LEVEL_IN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_LEVEL_IN__TCFORMAT:
				setTCformat((GSSConfigTCFormat)null);
				return;
			case configPackage.GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL:
				setExport_to_prev_Level((GSSConfigExportToPrevLevel)null);
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
			case configPackage.GSS_CONFIG_LEVEL_IN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case configPackage.GSS_CONFIG_LEVEL_IN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case configPackage.GSS_CONFIG_LEVEL_IN__TCFORMAT:
				return tCformat != null;
			case configPackage.GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL:
				return export_to_prev_Level != null;
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
		result.append(')');
		return result.toString();
	}

} //GSSConfigLevelInImpl
