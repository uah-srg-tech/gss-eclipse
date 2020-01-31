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

import es.uah.aut.srg.gss.export.GSSExportExport;

import es.uah.aut.srg.gss.filter.GSSFilterFilter;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.import_.GSSImportImport;

import es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Level In Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl#getTMformat <em>TMformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl#getTCformat <em>TCformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl#getExport_to_prev_Level <em>Export to prev Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl#getImport_from_prev_Level <em>Import from prev Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioLevelInOutImpl extends MinimalEObjectImpl.Container implements GSSScenarioLevelInOut {
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
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

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
	 * The cached value of the '{@link #getTMformat() <em>TMformat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTMformat()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat tMformat;

	/**
	 * The cached value of the '{@link #getTCformat() <em>TCformat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCformat()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat tCformat;

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
	 * The cached value of the '{@link #getExport_to_prev_Level() <em>Export to prev Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport_to_prev_Level()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport export_to_prev_Level;

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
	protected GSSScenarioLevelInOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_LEVEL_IN_OUT;
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
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		String oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TMFORMAT, oldTMformat, tMformat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TMFORMAT, oldTMformat, tMformat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getTCformat() {
		if (tCformat != null && tCformat.eIsProxy()) {
			InternalEObject oldTCformat = (InternalEObject)tCformat;
			tCformat = (GSSFormatFormat)eResolveProxy(oldTCformat);
			if (tCformat != oldTCformat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TCFORMAT, oldTCformat, tCformat));
			}
		}
		return tCformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetTCformat() {
		return tCformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCformat(GSSFormatFormat newTCformat) {
		GSSFormatFormat oldTCformat = tCformat;
		tCformat = newTCformat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TCFORMAT, oldTCformat, tCformat));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__INPUT_FILTER, oldInputFilter, inputFilter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__INPUT_FILTER, oldInputFilter, inputFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getExport_to_prev_Level() {
		if (export_to_prev_Level != null && export_to_prev_Level.eIsProxy()) {
			InternalEObject oldExport_to_prev_Level = (InternalEObject)export_to_prev_Level;
			export_to_prev_Level = (GSSExportExport)eResolveProxy(oldExport_to_prev_Level);
			if (export_to_prev_Level != oldExport_to_prev_Level) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL, oldExport_to_prev_Level, export_to_prev_Level));
			}
		}
		return export_to_prev_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetExport_to_prev_Level() {
		return export_to_prev_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport_to_prev_Level(GSSExportExport newExport_to_prev_Level) {
		GSSExportExport oldExport_to_prev_Level = export_to_prev_Level;
		export_to_prev_Level = newExport_to_prev_Level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL, oldExport_to_prev_Level, export_to_prev_Level));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL, oldImport_from_prev_Level, import_from_prev_Level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL, oldImport_from_prev_Level, import_from_prev_Level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__ID:
				return getId();
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__NAME:
				return getName();
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TMFORMAT:
				if (resolve) return getTMformat();
				return basicGetTMformat();
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TCFORMAT:
				if (resolve) return getTCformat();
				return basicGetTCformat();
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__INPUT_FILTER:
				if (resolve) return getInputFilter();
				return basicGetInputFilter();
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL:
				if (resolve) return getExport_to_prev_Level();
				return basicGetExport_to_prev_Level();
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL:
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
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__ID:
				setId((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__NAME:
				setName((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TMFORMAT:
				setTMformat((GSSFormatFormat)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TCFORMAT:
				setTCformat((GSSFormatFormat)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__INPUT_FILTER:
				setInputFilter((GSSFilterFilter)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL:
				setExport_to_prev_Level((GSSExportExport)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL:
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
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__ID:
				unsetId();
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TMFORMAT:
				setTMformat((GSSFormatFormat)null);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TCFORMAT:
				setTCformat((GSSFormatFormat)null);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__INPUT_FILTER:
				setInputFilter((GSSFilterFilter)null);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL:
				setExport_to_prev_Level((GSSExportExport)null);
				return;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL:
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
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__ID:
				return isSetId();
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TMFORMAT:
				return tMformat != null;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__TCFORMAT:
				return tCformat != null;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__INPUT_FILTER:
				return inputFilter != null;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL:
				return export_to_prev_Level != null;
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL:
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
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GSSScenarioLevelInOutImpl
