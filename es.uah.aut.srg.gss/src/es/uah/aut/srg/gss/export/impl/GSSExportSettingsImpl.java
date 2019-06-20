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
package es.uah.aut.srg.gss.export.impl;

import es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst;
import es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile;
import es.uah.aut.srg.gss.export.GSSExportSettingFromConst;
import es.uah.aut.srg.gss.export.GSSExportSettingFromField;
import es.uah.aut.srg.gss.export.GSSExportSettingFromFile;
import es.uah.aut.srg.gss.export.GSSExportSettingFromSize;
import es.uah.aut.srg.gss.export.GSSExportSettings;
import es.uah.aut.srg.gss.export.exportPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Export Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl#getSettingFromConst <em>Setting From Const</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl#getSettingFromSize <em>Setting From Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl#getSettingFromFile <em>Setting From File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl#getSettingFromField <em>Setting From Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl#getSettingAIFromConst <em>Setting AI From Const</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingsImpl#getSettingAIFromFile <em>Setting AI From File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportSettingsImpl extends MinimalEObjectImpl.Container implements GSSExportSettings {
	/**
	 * The cached value of the '{@link #getSettingFromConst() <em>Setting From Const</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingFromConst()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSettingFromConst> settingFromConst;

	/**
	 * The cached value of the '{@link #getSettingFromSize() <em>Setting From Size</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingFromSize()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSettingFromSize> settingFromSize;

	/**
	 * The cached value of the '{@link #getSettingFromFile() <em>Setting From File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingFromFile()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSettingFromFile> settingFromFile;

	/**
	 * The cached value of the '{@link #getSettingFromField() <em>Setting From Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingFromField()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSettingFromField> settingFromField;

	/**
	 * The cached value of the '{@link #getSettingAIFromConst() <em>Setting AI From Const</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingAIFromConst()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSettingAIFromConst> settingAIFromConst;

	/**
	 * The cached value of the '{@link #getSettingAIFromFile() <em>Setting AI From File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingAIFromFile()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSettingAIFromFile> settingAIFromFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSettingFromConst> getSettingFromConst() {
		if (settingFromConst == null) {
			settingFromConst = new EObjectContainmentEList<GSSExportSettingFromConst>(GSSExportSettingFromConst.class, this, exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_CONST);
		}
		return settingFromConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSettingFromSize> getSettingFromSize() {
		if (settingFromSize == null) {
			settingFromSize = new EObjectContainmentEList<GSSExportSettingFromSize>(GSSExportSettingFromSize.class, this, exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_SIZE);
		}
		return settingFromSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSettingFromFile> getSettingFromFile() {
		if (settingFromFile == null) {
			settingFromFile = new EObjectContainmentEList<GSSExportSettingFromFile>(GSSExportSettingFromFile.class, this, exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FILE);
		}
		return settingFromFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSettingFromField> getSettingFromField() {
		if (settingFromField == null) {
			settingFromField = new EObjectContainmentEList<GSSExportSettingFromField>(GSSExportSettingFromField.class, this, exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FIELD);
		}
		return settingFromField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSettingAIFromConst> getSettingAIFromConst() {
		if (settingAIFromConst == null) {
			settingAIFromConst = new EObjectContainmentEList<GSSExportSettingAIFromConst>(GSSExportSettingAIFromConst.class, this, exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_CONST);
		}
		return settingAIFromConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSettingAIFromFile> getSettingAIFromFile() {
		if (settingAIFromFile == null) {
			settingAIFromFile = new EObjectContainmentEList<GSSExportSettingAIFromFile>(GSSExportSettingAIFromFile.class, this, exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_FILE);
		}
		return settingAIFromFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_CONST:
				return ((InternalEList<?>)getSettingFromConst()).basicRemove(otherEnd, msgs);
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_SIZE:
				return ((InternalEList<?>)getSettingFromSize()).basicRemove(otherEnd, msgs);
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FILE:
				return ((InternalEList<?>)getSettingFromFile()).basicRemove(otherEnd, msgs);
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FIELD:
				return ((InternalEList<?>)getSettingFromField()).basicRemove(otherEnd, msgs);
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_CONST:
				return ((InternalEList<?>)getSettingAIFromConst()).basicRemove(otherEnd, msgs);
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_FILE:
				return ((InternalEList<?>)getSettingAIFromFile()).basicRemove(otherEnd, msgs);
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
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_CONST:
				return getSettingFromConst();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_SIZE:
				return getSettingFromSize();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FILE:
				return getSettingFromFile();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FIELD:
				return getSettingFromField();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_CONST:
				return getSettingAIFromConst();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_FILE:
				return getSettingAIFromFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_CONST:
				getSettingFromConst().clear();
				getSettingFromConst().addAll((Collection<? extends GSSExportSettingFromConst>)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_SIZE:
				getSettingFromSize().clear();
				getSettingFromSize().addAll((Collection<? extends GSSExportSettingFromSize>)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FILE:
				getSettingFromFile().clear();
				getSettingFromFile().addAll((Collection<? extends GSSExportSettingFromFile>)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FIELD:
				getSettingFromField().clear();
				getSettingFromField().addAll((Collection<? extends GSSExportSettingFromField>)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_CONST:
				getSettingAIFromConst().clear();
				getSettingAIFromConst().addAll((Collection<? extends GSSExportSettingAIFromConst>)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_FILE:
				getSettingAIFromFile().clear();
				getSettingAIFromFile().addAll((Collection<? extends GSSExportSettingAIFromFile>)newValue);
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
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_CONST:
				getSettingFromConst().clear();
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_SIZE:
				getSettingFromSize().clear();
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FILE:
				getSettingFromFile().clear();
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FIELD:
				getSettingFromField().clear();
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_CONST:
				getSettingAIFromConst().clear();
				return;
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_FILE:
				getSettingAIFromFile().clear();
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
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_CONST:
				return settingFromConst != null && !settingFromConst.isEmpty();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_SIZE:
				return settingFromSize != null && !settingFromSize.isEmpty();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FILE:
				return settingFromFile != null && !settingFromFile.isEmpty();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_FROM_FIELD:
				return settingFromField != null && !settingFromField.isEmpty();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_CONST:
				return settingAIFromConst != null && !settingAIFromConst.isEmpty();
			case exportPackage.GSS_EXPORT_SETTINGS__SETTING_AI_FROM_FILE:
				return settingAIFromFile != null && !settingAIFromFile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSExportSettingsImpl
