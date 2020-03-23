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
package es.uah.aut.srg.gss.test_proc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Outputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getCheckmode <em>Checkmode</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_value <em>Valid time interval value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs()
 * @model
 * @generated
 */
public interface GSSTestProcOutputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Checkmode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkmode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkmode</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode
	 * @see #isSetCheckmode()
	 * @see #unsetCheckmode()
	 * @see #setCheckmode(GSSTestProcCheckmode)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Checkmode()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTestProcCheckmode getCheckmode();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getCheckmode <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkmode</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode
	 * @see #isSetCheckmode()
	 * @see #unsetCheckmode()
	 * @see #getCheckmode()
	 * @generated
	 */
	void setCheckmode(GSSTestProcCheckmode value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getCheckmode <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCheckmode()
	 * @see #getCheckmode()
	 * @see #setCheckmode(GSSTestProcCheckmode)
	 * @generated
	 */
	void unsetCheckmode();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getCheckmode <em>Checkmode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Checkmode</em>' attribute is set.
	 * @see #unsetCheckmode()
	 * @see #getCheckmode()
	 * @see #setCheckmode(GSSTestProcCheckmode)
	 * @generated
	 */
	boolean isSetCheckmode();

	/**
	 * Returns the value of the '<em><b>Valid time interval value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid time interval value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid time interval value</em>' attribute.
	 * @see #setValid_time_interval_value(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Valid_time_interval_value()
	 * @model required="true"
	 * @generated
	 */
	String getValid_time_interval_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_value <em>Valid time interval value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid time interval value</em>' attribute.
	 * @see #getValid_time_interval_value()
	 * @generated
	 */
	void setValid_time_interval_value(String value);

	/**
	 * Returns the value of the '<em><b>Valid time interval unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid time interval unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid time interval unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit
	 * @see #isSetValid_time_interval_unit()
	 * @see #unsetValid_time_interval_unit()
	 * @see #setValid_time_interval_unit(GSSTestProcTimeUnit)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Valid_time_interval_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTestProcTimeUnit getValid_time_interval_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid time interval unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit
	 * @see #isSetValid_time_interval_unit()
	 * @see #unsetValid_time_interval_unit()
	 * @see #getValid_time_interval_unit()
	 * @generated
	 */
	void setValid_time_interval_unit(GSSTestProcTimeUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValid_time_interval_unit()
	 * @see #getValid_time_interval_unit()
	 * @see #setValid_time_interval_unit(GSSTestProcTimeUnit)
	 * @generated
	 */
	void unsetValid_time_interval_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valid time interval unit</em>' attribute is set.
	 * @see #unsetValid_time_interval_unit()
	 * @see #getValid_time_interval_unit()
	 * @see #setValid_time_interval_unit(GSSTestProcTimeUnit)
	 * @generated
	 */
	boolean isSetValid_time_interval_unit();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GSSTestProcOutput> getOutput();

} // GSSTestProcOutputs
