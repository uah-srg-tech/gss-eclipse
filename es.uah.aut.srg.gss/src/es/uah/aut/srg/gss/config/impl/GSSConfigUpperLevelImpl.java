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

import es.uah.aut.srg.gss.config.GSSConfigImportFromPrevLevel;
import es.uah.aut.srg.gss.config.GSSConfigInputFilter;
import es.uah.aut.srg.gss.config.GSSConfigTMFormat;
import es.uah.aut.srg.gss.config.GSSConfigUpperLevel;
import es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Upper Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelImpl#getTMformat <em>TMformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelImpl#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelImpl#getImport_from_prev_Level <em>Import from prev Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigUpperLevelImpl extends MinimalEObjectImpl.Container implements GSSConfigUpperLevel {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final GSSConfigUpperLevelLevel LEVEL_EDEFAULT = GSSConfigUpperLevelLevel._1;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigUpperLevelLevel level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTMformat() <em>TMformat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMformat()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigTMFormat tMformat;

	/**
	 * The cached value of the '{@link #getInputFilter() <em>Input Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFilter()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigInputFilter inputFilter;

	/**
	 * The cached value of the '{@link #getImport_from_prev_Level() <em>Import from prev Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport_from_prev_Level()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigImportFromPrevLevel import_from_prev_Level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigUpperLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_UPPER_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigUpperLevelLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(GSSConfigUpperLevelLevel newLevel) {
		GSSConfigUpperLevelLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_UPPER_LEVEL__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigTMFormat getTMformat() {
		return tMformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTMformat(GSSConfigTMFormat newTMformat, NotificationChain msgs) {
		GSSConfigTMFormat oldTMformat = tMformat;
		tMformat = newTMformat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_UPPER_LEVEL__TMFORMAT, oldTMformat, newTMformat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTMformat(GSSConfigTMFormat newTMformat) {
		if (newTMformat != tMformat) {
			NotificationChain msgs = null;
			if (tMformat != null)
				msgs = ((InternalEObject)tMformat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_UPPER_LEVEL__TMFORMAT, null, msgs);
			if (newTMformat != null)
				msgs = ((InternalEObject)newTMformat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_UPPER_LEVEL__TMFORMAT, null, msgs);
			msgs = basicSetTMformat(newTMformat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_UPPER_LEVEL__TMFORMAT, newTMformat, newTMformat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigInputFilter getInputFilter() {
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputFilter(GSSConfigInputFilter newInputFilter, NotificationChain msgs) {
		GSSConfigInputFilter oldInputFilter = inputFilter;
		inputFilter = newInputFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER, oldInputFilter, newInputFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFilter(GSSConfigInputFilter newInputFilter) {
		if (newInputFilter != inputFilter) {
			NotificationChain msgs = null;
			if (inputFilter != null)
				msgs = ((InternalEObject)inputFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER, null, msgs);
			if (newInputFilter != null)
				msgs = ((InternalEObject)newInputFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER, null, msgs);
			msgs = basicSetInputFilter(newInputFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER, newInputFilter, newInputFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigImportFromPrevLevel getImport_from_prev_Level() {
		return import_from_prev_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport_from_prev_Level(GSSConfigImportFromPrevLevel newImport_from_prev_Level, NotificationChain msgs) {
		GSSConfigImportFromPrevLevel oldImport_from_prev_Level = import_from_prev_Level;
		import_from_prev_Level = newImport_from_prev_Level;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL, oldImport_from_prev_Level, newImport_from_prev_Level);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport_from_prev_Level(GSSConfigImportFromPrevLevel newImport_from_prev_Level) {
		if (newImport_from_prev_Level != import_from_prev_Level) {
			NotificationChain msgs = null;
			if (import_from_prev_Level != null)
				msgs = ((InternalEObject)import_from_prev_Level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL, null, msgs);
			if (newImport_from_prev_Level != null)
				msgs = ((InternalEObject)newImport_from_prev_Level).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL, null, msgs);
			msgs = basicSetImport_from_prev_Level(newImport_from_prev_Level, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL, newImport_from_prev_Level, newImport_from_prev_Level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_UPPER_LEVEL__TMFORMAT:
				return basicSetTMformat(null, msgs);
			case configPackage.GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER:
				return basicSetInputFilter(null, msgs);
			case configPackage.GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				return basicSetImport_from_prev_Level(null, msgs);
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
			case configPackage.GSS_CONFIG_UPPER_LEVEL__LEVEL:
				return getLevel();
			case configPackage.GSS_CONFIG_UPPER_LEVEL__TMFORMAT:
				return getTMformat();
			case configPackage.GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER:
				return getInputFilter();
			case configPackage.GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				return getImport_from_prev_Level();
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
			case configPackage.GSS_CONFIG_UPPER_LEVEL__LEVEL:
				setLevel((GSSConfigUpperLevelLevel)newValue);
				return;
			case configPackage.GSS_CONFIG_UPPER_LEVEL__TMFORMAT:
				setTMformat((GSSConfigTMFormat)newValue);
				return;
			case configPackage.GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER:
				setInputFilter((GSSConfigInputFilter)newValue);
				return;
			case configPackage.GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				setImport_from_prev_Level((GSSConfigImportFromPrevLevel)newValue);
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
			case configPackage.GSS_CONFIG_UPPER_LEVEL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_UPPER_LEVEL__TMFORMAT:
				setTMformat((GSSConfigTMFormat)null);
				return;
			case configPackage.GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER:
				setInputFilter((GSSConfigInputFilter)null);
				return;
			case configPackage.GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				setImport_from_prev_Level((GSSConfigImportFromPrevLevel)null);
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
			case configPackage.GSS_CONFIG_UPPER_LEVEL__LEVEL:
				return level != LEVEL_EDEFAULT;
			case configPackage.GSS_CONFIG_UPPER_LEVEL__TMFORMAT:
				return tMformat != null;
			case configPackage.GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER:
				return inputFilter != null;
			case configPackage.GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				return import_from_prev_Level != null;
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
		result.append(')');
		return result.toString();
	}

} //GSSConfigUpperLevelImpl
