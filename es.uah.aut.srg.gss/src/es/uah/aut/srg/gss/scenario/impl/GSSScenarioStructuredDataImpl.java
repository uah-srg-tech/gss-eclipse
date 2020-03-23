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

import es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Structured Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioStructuredDataImpl#getLevelRef <em>Level Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioStructuredDataImpl#getFirstField <em>First Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioStructuredDataImpl extends MinimalEObjectImpl.Container implements GSSScenarioStructuredData {
	/**
	 * The default value of the '{@link #getLevelRef() <em>Level Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelRef() <em>Level Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRef()
	 * @generated
	 * @ordered
	 */
	protected String levelRef = LEVEL_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstField() <em>First Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstField()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstField() <em>First Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstField()
	 * @generated
	 * @ordered
	 */
	protected String firstField = FIRST_FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioStructuredDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_STRUCTURED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevelRef() {
		return levelRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelRef(String newLevelRef) {
		String oldLevelRef = levelRef;
		levelRef = newLevelRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF, oldLevelRef, levelRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstField() {
		return firstField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstField(String newFirstField) {
		String oldFirstField = firstField;
		firstField = newFirstField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD, oldFirstField, firstField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF:
				return getLevelRef();
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD:
				return getFirstField();
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
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF:
				setLevelRef((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD:
				setFirstField((String)newValue);
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
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF:
				setLevelRef(LEVEL_REF_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD:
				setFirstField(FIRST_FIELD_EDEFAULT);
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
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF:
				return LEVEL_REF_EDEFAULT == null ? levelRef != null : !LEVEL_REF_EDEFAULT.equals(levelRef);
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD:
				return FIRST_FIELD_EDEFAULT == null ? firstField != null : !FIRST_FIELD_EDEFAULT.equals(firstField);
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
		result.append(" (levelRef: ");
		result.append(levelRef);
		result.append(", firstField: ");
		result.append(firstField);
		result.append(')');
		return result.toString();
	}

} //GSSScenarioStructuredDataImpl
