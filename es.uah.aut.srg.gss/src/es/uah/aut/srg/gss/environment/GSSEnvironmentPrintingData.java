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
 * A representation of the model object '<em><b>GSS Environment Printing Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData#getPrintStatus <em>Print Status</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData#getStructuredData <em>Structured Data</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentPrintingData()
 * @model
 * @generated
 */
public interface GSSEnvironmentPrintingData extends EObject {
	/**
	 * Returns the value of the '<em><b>Print Status</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Print Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print Status</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #setPrintStatus(GSSEnvironmentEnableDisable)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentPrintingData_PrintStatus()
	 * @model required="true"
	 * @generated
	 */
	GSSEnvironmentEnableDisable getPrintStatus();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData#getPrintStatus <em>Print Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print Status</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see #getPrintStatus()
	 * @generated
	 */
	void setPrintStatus(GSSEnvironmentEnableDisable value);

	/**
	 * Returns the value of the '<em><b>Structured Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Data</em>' containment reference.
	 * @see #setStructuredData(GSSEnvironmentStructuredData)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentPrintingData_StructuredData()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentStructuredData getStructuredData();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData#getStructuredData <em>Structured Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Data</em>' containment reference.
	 * @see #getStructuredData()
	 * @generated
	 */
	void setStructuredData(GSSEnvironmentStructuredData value);

} // GSSEnvironmentPrintingData
