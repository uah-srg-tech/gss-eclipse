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

import es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine;
import es.uah.aut.srg.gss.export.GSSExportUnit;
import es.uah.aut.srg.gss.export.exportPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Export Size From File Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLineImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLineImpl#getFromFile <em>From File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLineImpl#getLine <em>Line</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLineImpl#getAddSize <em>Add Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSizeFromFileLineImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportSizeFromFileLineImpl extends MinimalEObjectImpl.Container implements GSSExportSizeFromFileLine {
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
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected String line = LINE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportSizeFromFileLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_SIZE_FROM_FILE_LINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE, oldFromFile, fromFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(String newLine) {
		String oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__LINE, oldLine, line));
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
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ADD_SIZE, oldAddSize, addSize));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ID:
				return getId();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE:
				return getFromFile();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__LINE:
				return getLine();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ADD_SIZE:
				return getAddSize();
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__UNIT:
				return getUnit();
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
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ID:
				setId((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE:
				setFromFile((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__LINE:
				setLine((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ADD_SIZE:
				setAddSize((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__UNIT:
				setUnit((GSSExportUnit)newValue);
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
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ID:
				setId(ID_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE:
				setFromFile(FROM_FILE_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ADD_SIZE:
				setAddSize(ADD_SIZE_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE:
				return FROM_FILE_EDEFAULT == null ? fromFile != null : !FROM_FILE_EDEFAULT.equals(fromFile);
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__LINE:
				return LINE_EDEFAULT == null ? line != null : !LINE_EDEFAULT.equals(line);
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__ADD_SIZE:
				return ADD_SIZE_EDEFAULT == null ? addSize != null : !ADD_SIZE_EDEFAULT.equals(addSize);
			case exportPackage.GSS_EXPORT_SIZE_FROM_FILE_LINE__UNIT:
				return unit != UNIT_EDEFAULT;
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
		result.append(", line: ");
		result.append(line);
		result.append(", addSize: ");
		result.append(addSize);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //GSSExportSizeFromFileLineImpl
