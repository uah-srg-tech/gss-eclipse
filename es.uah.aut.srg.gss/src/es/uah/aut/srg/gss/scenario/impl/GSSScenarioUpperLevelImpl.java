/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.scenario.impl;

import es.uah.aut.srg.gss.filter.GSSFilterFilter;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.import_.GSSImportImport;

import es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel;
import es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Upper Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelImpl#getTMformat <em>TMformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelImpl#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelImpl#getImport_from_prev_Level <em>Import from prev Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioUpperLevelImpl extends MinimalEObjectImpl.Container implements GSSScenarioUpperLevel {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioUpperLevelLevel LEVEL_EDEFAULT = GSSScenarioUpperLevelLevel._1;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioUpperLevelLevel level = LEVEL_EDEFAULT;

	/**
	 * This is true if the Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean levelESet;

	/**
	 * The cached value of the '{@link #getTMformat() <em>TMformat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMformat()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat tMformat;

	/**
	 * The cached value of the '{@link #getInputFilter() <em>Input Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFilter()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFilter inputFilter;

	/**
	 * The cached value of the '{@link #getImport_from_prev_Level() <em>Import from prev Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport_from_prev_Level()
	 * @generated
	 * @ordered
	 */
	protected GSSImportImport import_from_prev_Level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioUpperLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_UPPER_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioUpperLevelLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(GSSScenarioUpperLevelLevel newLevel) {
		GSSScenarioUpperLevelLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		boolean oldLevelESet = levelESet;
		levelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__LEVEL, oldLevel, level, !oldLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLevel() {
		GSSScenarioUpperLevelLevel oldLevel = level;
		boolean oldLevelESet = levelESet;
		level = LEVEL_EDEFAULT;
		levelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__LEVEL, oldLevel, LEVEL_EDEFAULT, oldLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLevel() {
		return levelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getTMformat() {
		if (tMformat != null && tMformat.eIsProxy()) {
			InternalEObject oldTMformat = (InternalEObject)tMformat;
			tMformat = (GSSFormatFormat)eResolveProxy(oldTMformat);
			if (tMformat != oldTMformat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__TMFORMAT, oldTMformat, tMformat));
			}
		}
		return tMformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetTMformat() {
		return tMformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTMformat(GSSFormatFormat newTMformat) {
		GSSFormatFormat oldTMformat = tMformat;
		tMformat = newTMformat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__TMFORMAT, oldTMformat, tMformat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter getInputFilter() {
		if (inputFilter != null && inputFilter.eIsProxy()) {
			InternalEObject oldInputFilter = (InternalEObject)inputFilter;
			inputFilter = (GSSFilterFilter)eResolveProxy(oldInputFilter);
			if (inputFilter != oldInputFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__INPUT_FILTER, oldInputFilter, inputFilter));
			}
		}
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter basicGetInputFilter() {
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFilter(GSSFilterFilter newInputFilter) {
		GSSFilterFilter oldInputFilter = inputFilter;
		inputFilter = newInputFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__INPUT_FILTER, oldInputFilter, inputFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport getImport_from_prev_Level() {
		if (import_from_prev_Level != null && import_from_prev_Level.eIsProxy()) {
			InternalEObject oldImport_from_prev_Level = (InternalEObject)import_from_prev_Level;
			import_from_prev_Level = (GSSImportImport)eResolveProxy(oldImport_from_prev_Level);
			if (import_from_prev_Level != oldImport_from_prev_Level) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL, oldImport_from_prev_Level, import_from_prev_Level));
			}
		}
		return import_from_prev_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportImport basicGetImport_from_prev_Level() {
		return import_from_prev_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport_from_prev_Level(GSSImportImport newImport_from_prev_Level) {
		GSSImportImport oldImport_from_prev_Level = import_from_prev_Level;
		import_from_prev_Level = newImport_from_prev_Level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL, oldImport_from_prev_Level, import_from_prev_Level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__LEVEL:
				return getLevel();
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__TMFORMAT:
				if (resolve) return getTMformat();
				return basicGetTMformat();
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__INPUT_FILTER:
				if (resolve) return getInputFilter();
				return basicGetInputFilter();
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				if (resolve) return getImport_from_prev_Level();
				return basicGetImport_from_prev_Level();
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
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__LEVEL:
				setLevel((GSSScenarioUpperLevelLevel)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__TMFORMAT:
				setTMformat((GSSFormatFormat)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__INPUT_FILTER:
				setInputFilter((GSSFilterFilter)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				setImport_from_prev_Level((GSSImportImport)newValue);
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
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__LEVEL:
				unsetLevel();
				return;
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__TMFORMAT:
				setTMformat((GSSFormatFormat)null);
				return;
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__INPUT_FILTER:
				setInputFilter((GSSFilterFilter)null);
				return;
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				setImport_from_prev_Level((GSSImportImport)null);
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
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__LEVEL:
				return isSetLevel();
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__TMFORMAT:
				return tMformat != null;
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__INPUT_FILTER:
				return inputFilter != null;
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
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
		if (levelESet) result.append(level); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSScenarioUpperLevelImpl
