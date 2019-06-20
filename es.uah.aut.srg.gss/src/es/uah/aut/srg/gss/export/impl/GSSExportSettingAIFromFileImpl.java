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

import es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile;
import es.uah.aut.srg.gss.export.exportPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Export Setting AI From File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromFileImpl#getFile <em>File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromFileImpl#getToArrayIndex <em>To Array Index</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromFileImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromFileImpl#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.impl.GSSExportSettingAIFromFileImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSExportSettingAIFromFileImpl extends GSSExportSettingImpl implements GSSExportSettingAIFromFile {
	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToArrayIndex() <em>To Array Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrayIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_ARRAY_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToArrayIndex() <em>To Array Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArrayIndex()
	 * @generated
	 * @ordered
	 */
	protected String toArrayIndex = TO_ARRAY_INDEX_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSExportSettingAIFromFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return exportPackage.Literals.GSS_EXPORT_SETTING_AI_FROM_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToArrayIndex() {
		return toArrayIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToArrayIndex(String newToArrayIndex) {
		String oldToArrayIndex = toArrayIndex;
		toArrayIndex = newToArrayIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX, oldToArrayIndex, toArrayIndex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__OFFSET, oldOffset, offset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__FILE:
				return getFile();
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX:
				return getToArrayIndex();
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__OFFSET:
				return getOffset();
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__SIZE:
				return getSize();
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__LINE:
				return getLine();
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
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__FILE:
				setFile((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX:
				setToArrayIndex((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__OFFSET:
				setOffset((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__SIZE:
				setSize((String)newValue);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__LINE:
				setLine((String)newValue);
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
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX:
				setToArrayIndex(TO_ARRAY_INDEX_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__LINE:
				setLine(LINE_EDEFAULT);
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
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX:
				return TO_ARRAY_INDEX_EDEFAULT == null ? toArrayIndex != null : !TO_ARRAY_INDEX_EDEFAULT.equals(toArrayIndex);
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case exportPackage.GSS_EXPORT_SETTING_AI_FROM_FILE__LINE:
				return LINE_EDEFAULT == null ? line != null : !LINE_EDEFAULT.equals(line);
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
		result.append(" (file: ");
		result.append(file);
		result.append(", toArrayIndex: ");
		result.append(toArrayIndex);
		result.append(", offset: ");
		result.append(offset);
		result.append(", size: ");
		result.append(size);
		result.append(", line: ");
		result.append(line);
		result.append(')');
		return result.toString();
	}

} //GSSExportSettingAIFromFileImpl
