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
package es.uah.aut.srg.gss.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment GV Periodic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getGlobalVarRef <em>Global Var Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getPeriod_value <em>Period value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getPeriod_unit <em>Period unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGVPeriodic()
 * @model
 * @generated
 */
public interface GSSEnvironmentGVPeriodic extends EObject {
	/**
	 * Returns the value of the '<em><b>Global Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Var Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Var Ref</em>' reference.
	 * @see #setGlobalVarRef(GSSEnvironmentGlobalVar)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGVPeriodic_GlobalVarRef()
	 * @model required="true"
	 * @generated
	 */
	GSSEnvironmentGlobalVar getGlobalVarRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getGlobalVarRef <em>Global Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Var Ref</em>' reference.
	 * @see #getGlobalVarRef()
	 * @generated
	 */
	void setGlobalVarRef(GSSEnvironmentGlobalVar value);

	/**
	 * Returns the value of the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period value</em>' attribute.
	 * @see #setPeriod_value(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGVPeriodic_Period_value()
	 * @model required="true"
	 * @generated
	 */
	String getPeriod_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getPeriod_value <em>Period value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period value</em>' attribute.
	 * @see #getPeriod_value()
	 * @generated
	 */
	void setPeriod_value(String value);

	/**
	 * Returns the value of the '<em><b>Period unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUnit
	 * @see #setPeriod_unit(GSSEnvironmentUnit)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentGVPeriodic_Period_unit()
	 * @model required="true"
	 * @generated
	 */
	GSSEnvironmentUnit getPeriod_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getPeriod_unit <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUnit
	 * @see #getPeriod_unit()
	 * @generated
	 */
	void setPeriod_unit(GSSEnvironmentUnit value);

} // GSSEnvironmentGVPeriodic
