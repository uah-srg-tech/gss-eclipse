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

import es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel;
import es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevelLevel;
import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

import es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Upper Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelImpl#getTMformat <em>TMformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelImpl#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelImpl#getImport_from_prev_Level <em>Import from prev Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentUpperLevelImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentUpperLevel {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final GSSEnvironmentUpperLevelLevel LEVEL_EDEFAULT = GSSEnvironmentUpperLevelLevel._1;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected GSSEnvironmentUpperLevelLevel level = LEVEL_EDEFAULT;

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
	protected TMTCIFFormatFormat tMformat;

	/**
	 * The cached value of the '{@link #getInputFilter() <em>Input Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFilter()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFilterFilter inputFilter;

	/**
	 * The cached value of the '{@link #getImport_from_prev_Level() <em>Import from prev Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport_from_prev_Level()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFImportImport import_from_prev_Level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentUpperLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_UPPER_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentUpperLevelLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(GSSEnvironmentUpperLevelLevel newLevel) {
		GSSEnvironmentUpperLevelLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		boolean oldLevelESet = levelESet;
		levelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__LEVEL, oldLevel, level, !oldLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLevel() {
		GSSEnvironmentUpperLevelLevel oldLevel = level;
		boolean oldLevelESet = levelESet;
		level = LEVEL_EDEFAULT;
		levelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__LEVEL, oldLevel, LEVEL_EDEFAULT, oldLevelESet));
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
	public TMTCIFFormatFormat getTMformat() {
		if (tMformat != null && tMformat.eIsProxy()) {
			InternalEObject oldTMformat = (InternalEObject)tMformat;
			tMformat = (TMTCIFFormatFormat)eResolveProxy(oldTMformat);
			if (tMformat != oldTMformat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__TMFORMAT, oldTMformat, tMformat));
			}
		}
		return tMformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetTMformat() {
		return tMformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTMformat(TMTCIFFormatFormat newTMformat) {
		TMTCIFFormatFormat oldTMformat = tMformat;
		tMformat = newTMformat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__TMFORMAT, oldTMformat, tMformat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFilter getInputFilter() {
		if (inputFilter != null && inputFilter.eIsProxy()) {
			InternalEObject oldInputFilter = (InternalEObject)inputFilter;
			inputFilter = (TMTCIFFilterFilter)eResolveProxy(oldInputFilter);
			if (inputFilter != oldInputFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__INPUT_FILTER, oldInputFilter, inputFilter));
			}
		}
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFilterFilter basicGetInputFilter() {
		return inputFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFilter(TMTCIFFilterFilter newInputFilter) {
		TMTCIFFilterFilter oldInputFilter = inputFilter;
		inputFilter = newInputFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__INPUT_FILTER, oldInputFilter, inputFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFImportImport getImport_from_prev_Level() {
		if (import_from_prev_Level != null && import_from_prev_Level.eIsProxy()) {
			InternalEObject oldImport_from_prev_Level = (InternalEObject)import_from_prev_Level;
			import_from_prev_Level = (TMTCIFImportImport)eResolveProxy(oldImport_from_prev_Level);
			if (import_from_prev_Level != oldImport_from_prev_Level) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL, oldImport_from_prev_Level, import_from_prev_Level));
			}
		}
		return import_from_prev_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFImportImport basicGetImport_from_prev_Level() {
		return import_from_prev_Level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport_from_prev_Level(TMTCIFImportImport newImport_from_prev_Level) {
		TMTCIFImportImport oldImport_from_prev_Level = import_from_prev_Level;
		import_from_prev_Level = newImport_from_prev_Level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL, oldImport_from_prev_Level, import_from_prev_Level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__LEVEL:
				return getLevel();
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__TMFORMAT:
				if (resolve) return getTMformat();
				return basicGetTMformat();
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__INPUT_FILTER:
				if (resolve) return getInputFilter();
				return basicGetInputFilter();
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
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
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__LEVEL:
				setLevel((GSSEnvironmentUpperLevelLevel)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__TMFORMAT:
				setTMformat((TMTCIFFormatFormat)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__INPUT_FILTER:
				setInputFilter((TMTCIFFilterFilter)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				setImport_from_prev_Level((TMTCIFImportImport)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__LEVEL:
				unsetLevel();
				return;
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__TMFORMAT:
				setTMformat((TMTCIFFormatFormat)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__INPUT_FILTER:
				setInputFilter((TMTCIFFilterFilter)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
				setImport_from_prev_Level((TMTCIFImportImport)null);
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
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__LEVEL:
				return isSetLevel();
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__TMFORMAT:
				return tMformat != null;
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__INPUT_FILTER:
				return inputFilter != null;
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL:
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

} //GSSEnvironmentUpperLevelImpl
