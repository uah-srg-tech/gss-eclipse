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
package es.uah.aut.srg.gss.tm_tc_format.impl;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFormula;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Tm Tc Format Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFormulaImpl#getSlope <em>Slope</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFormulaImpl#getIntercept <em>Intercept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTmTcFormatFormulaImpl extends MinimalEObjectImpl.Container implements GSSTmTcFormatFormula {
	/**
	 * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected static final String SLOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlope()
	 * @generated
	 * @ordered
	 */
	protected String slope = SLOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntercept() <em>Intercept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercept()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERCEPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntercept() <em>Intercept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercept()
	 * @generated
	 * @ordered
	 */
	protected String intercept = INTERCEPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTmTcFormatFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlope() {
		return slope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlope(String newSlope) {
		String oldSlope = slope;
		slope = newSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__SLOPE, oldSlope, slope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntercept() {
		return intercept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntercept(String newIntercept) {
		String oldIntercept = intercept;
		intercept = newIntercept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__INTERCEPT, oldIntercept, intercept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__SLOPE:
				return getSlope();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__INTERCEPT:
				return getIntercept();
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__SLOPE:
				setSlope((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__INTERCEPT:
				setIntercept((String)newValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__SLOPE:
				setSlope(SLOPE_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__INTERCEPT:
				setIntercept(INTERCEPT_EDEFAULT);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__SLOPE:
				return SLOPE_EDEFAULT == null ? slope != null : !SLOPE_EDEFAULT.equals(slope);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FORMULA__INTERCEPT:
				return INTERCEPT_EDEFAULT == null ? intercept != null : !INTERCEPT_EDEFAULT.equals(intercept);
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
		result.append(" (slope: ");
		result.append(slope);
		result.append(", intercept: ");
		result.append(intercept);
		result.append(')');
		return result.toString();
	}

} //GSSTmTcFormatFormulaImpl
