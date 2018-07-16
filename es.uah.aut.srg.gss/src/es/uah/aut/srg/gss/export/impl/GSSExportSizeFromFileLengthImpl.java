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

import es.uah.aut.srg.gss.export.GSSExportSettingFromConst;
import es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength;
import es.uah.aut.srg.gss.export.GSSExportUnit;
import es.uah.aut.srg.gss.export.exportPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Export Size From File Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLengthImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLengthImpl#getFromFile <em>From File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLengthImpl#getAddSize <em>Add Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLengthImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLengthImpl#getSettingFromConst <em>Setting From Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportSizeFromFileLengthImpl extends MinimalEObjectImpl.Container implements GSSExportSizeFromFileLength {
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
	 * The default value of the '{@link #getFromFile() <em>From File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromFile() <em>From File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromFile()
	 * @generated
	 * @ordered
	 */
	protected String fromFile = FROM_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddSize() <em>Add Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddSize()
	 * @generated
	 * @ordered
	 */
	protected static final String ADD_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddSize() <em>Add Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddSize()
	 * @generated
	 * @ordered
	 */
	protected String addSize = ADD_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSExportUnit UNIT_EDEFAULT = GSSExportUnit.BITS;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected GSSExportUnit unit = UNIT_EDEFAULT;

	/**
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * The cached value of the '{@link #getSettingFromConst() <em>Setting From Const</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingFromConst()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSExportSettingFromConst> settingFromConst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportSizeFromFileLengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_SIZE_FROM_FILE_LENGTH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromFile() {
		return fromFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromFile(String newFromFile) {
		String oldFromFile = fromFile;
		fromFile = newFromFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE, oldFromFile, fromFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddSize() {
		return addSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddSize(String newAddSize) {
		String oldAddSize = addSize;
		addSize = newAddSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ADD_SIZE, oldAddSize, addSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(GSSExportUnit newUnit) {
		GSSExportUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT, oldUnit, unit, !oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		GSSExportUnit oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = UNIT_EDEFAULT;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSExportSettingFromConst> getSettingFromConst() {
		if (settingFromConst == null) {
			settingFromConst = new EObjectResolvingEList<GSSExportSettingFromConst>(GSSExportSettingFromConst.class, this, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__SETTING_FROM_CONST);
		}
		return settingFromConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ID:
				return getId();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE:
				return getFromFile();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ADD_SIZE:
				return getAddSize();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT:
				return getUnit();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__SETTING_FROM_CONST:
				return getSettingFromConst();
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
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ID:
				setId((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE:
				setFromFile((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ADD_SIZE:
				setAddSize((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT:
				setUnit((GSSExportUnit)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__SETTING_FROM_CONST:
				getSettingFromConst().clear();
				getSettingFromConst().addAll((Collection<? extends GSSExportSettingFromConst>)newValue);
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
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ID:
				setId(ID_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE:
				setFromFile(FROM_FILE_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ADD_SIZE:
				setAddSize(ADD_SIZE_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT:
				unsetUnit();
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__SETTING_FROM_CONST:
				getSettingFromConst().clear();
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
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE:
				return FROM_FILE_EDEFAULT == null ? fromFile != null : !FROM_FILE_EDEFAULT.equals(fromFile);
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ADD_SIZE:
				return ADD_SIZE_EDEFAULT == null ? addSize != null : !ADD_SIZE_EDEFAULT.equals(addSize);
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT:
				return isSetUnit();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LENGTH__SETTING_FROM_CONST:
				return settingFromConst != null && !settingFromConst.isEmpty();
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
		result.append(", fromFile: ");
		result.append(fromFile);
		result.append(", addSize: ");
		result.append(addSize);
		result.append(", unit: ");
		if (unitESet) result.append(unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSExportSizeFromFileLengthImpl
