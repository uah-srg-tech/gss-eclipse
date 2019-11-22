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
package es.uah.aut.srg.gss.filter.impl;

import es.uah.aut.srg.gss.filter.GSSFilterSelectLine;
import es.uah.aut.srg.gss.filter.filterPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Select Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterSelectLineImpl#getFromFile <em>From File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterSelectLineImpl#getLine <em>Line</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterSelectLineImpl#getLeftTrim <em>Left Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterSelectLineImpl#getRightTrim <em>Right Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterSelectLineImpl#getMask <em>Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterSelectLineImpl extends MinimalEObjectImpl.Container implements GSSFilterSelectLine {
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
	 * The default value of the '{@link #getLeftTrim() <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftTrim()
	 * @generated
	 * @ordered
	 */
	protected static final String LEFT_TRIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeftTrim() <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftTrim()
	 * @generated
	 * @ordered
	 */
	protected String leftTrim = LEFT_TRIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightTrim() <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTrim()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHT_TRIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightTrim() <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTrim()
	 * @generated
	 * @ordered
	 */
	protected String rightTrim = RIGHT_TRIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final String MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected String mask = MASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterSelectLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.GSS_FILTER_SELECT_LINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_SELECT_LINE__FROM_FILE, oldFromFile, fromFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_SELECT_LINE__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeftTrim() {
		return leftTrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftTrim(String newLeftTrim) {
		String oldLeftTrim = leftTrim;
		leftTrim = newLeftTrim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_SELECT_LINE__LEFT_TRIM, oldLeftTrim, leftTrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRightTrim() {
		return rightTrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightTrim(String newRightTrim) {
		String oldRightTrim = rightTrim;
		rightTrim = newRightTrim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_SELECT_LINE__RIGHT_TRIM, oldRightTrim, rightTrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(String newMask) {
		String oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_SELECT_LINE__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case filterPackage.GSS_FILTER_SELECT_LINE__FROM_FILE:
				return getFromFile();
			case filterPackage.GSS_FILTER_SELECT_LINE__LINE:
				return getLine();
			case filterPackage.GSS_FILTER_SELECT_LINE__LEFT_TRIM:
				return getLeftTrim();
			case filterPackage.GSS_FILTER_SELECT_LINE__RIGHT_TRIM:
				return getRightTrim();
			case filterPackage.GSS_FILTER_SELECT_LINE__MASK:
				return getMask();
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
			case filterPackage.GSS_FILTER_SELECT_LINE__FROM_FILE:
				setFromFile((String)newValue);
				return;
			case filterPackage.GSS_FILTER_SELECT_LINE__LINE:
				setLine((String)newValue);
				return;
			case filterPackage.GSS_FILTER_SELECT_LINE__LEFT_TRIM:
				setLeftTrim((String)newValue);
				return;
			case filterPackage.GSS_FILTER_SELECT_LINE__RIGHT_TRIM:
				setRightTrim((String)newValue);
				return;
			case filterPackage.GSS_FILTER_SELECT_LINE__MASK:
				setMask((String)newValue);
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
			case filterPackage.GSS_FILTER_SELECT_LINE__FROM_FILE:
				setFromFile(FROM_FILE_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_SELECT_LINE__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_SELECT_LINE__LEFT_TRIM:
				setLeftTrim(LEFT_TRIM_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_SELECT_LINE__RIGHT_TRIM:
				setRightTrim(RIGHT_TRIM_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_SELECT_LINE__MASK:
				setMask(MASK_EDEFAULT);
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
			case filterPackage.GSS_FILTER_SELECT_LINE__FROM_FILE:
				return FROM_FILE_EDEFAULT == null ? fromFile != null : !FROM_FILE_EDEFAULT.equals(fromFile);
			case filterPackage.GSS_FILTER_SELECT_LINE__LINE:
				return LINE_EDEFAULT == null ? line != null : !LINE_EDEFAULT.equals(line);
			case filterPackage.GSS_FILTER_SELECT_LINE__LEFT_TRIM:
				return LEFT_TRIM_EDEFAULT == null ? leftTrim != null : !LEFT_TRIM_EDEFAULT.equals(leftTrim);
			case filterPackage.GSS_FILTER_SELECT_LINE__RIGHT_TRIM:
				return RIGHT_TRIM_EDEFAULT == null ? rightTrim != null : !RIGHT_TRIM_EDEFAULT.equals(rightTrim);
			case filterPackage.GSS_FILTER_SELECT_LINE__MASK:
				return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
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
		result.append(" (fromFile: ");
		result.append(fromFile);
		result.append(", line: ");
		result.append(line);
		result.append(", leftTrim: ");
		result.append(leftTrim);
		result.append(", rightTrim: ");
		result.append(rightTrim);
		result.append(", mask: ");
		result.append(mask);
		result.append(')');
		return result.toString();
	}

} //GSSFilterSelectLineImpl
