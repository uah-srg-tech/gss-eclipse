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
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_3 <em>Output level 3</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_2 <em>Output level 2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_1 <em>Output level 1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getOutput_level_0 <em>Output level 0</em>}</li>
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
	 * @see #setCheckmode(GSSTestProcCheckmode)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Checkmode()
	 * @model required="true"
	 * @generated
	 */
	GSSTestProcCheckmode getCheckmode();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getCheckmode <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkmode</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode
	 * @see #getCheckmode()
	 * @generated
	 */
	void setCheckmode(GSSTestProcCheckmode value);

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
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid time interval unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid time interval unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcUnit
	 * @see #setValid_time_interval_unit(GSSTestProcUnit)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Valid_time_interval_unit()
	 * @model required="true"
	 * @generated
	 */
	GSSTestProcUnit getValid_time_interval_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs#getValid_time_interval_unit <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid time interval unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcUnit
	 * @see #getValid_time_interval_unit()
	 * @generated
	 */
	void setValid_time_interval_unit(GSSTestProcUnit value);

	/**
	 * Returns the value of the '<em><b>Output level 3</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output level 3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output level 3</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Output_level_3()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTestProcOutputLevel3> getOutput_level_3();

	/**
	 * Returns the value of the '<em><b>Output level 2</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output level 2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output level 2</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Output_level_2()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTestProcOutputLevel2> getOutput_level_2();

	/**
	 * Returns the value of the '<em><b>Output level 1</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output level 1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output level 1</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Output_level_1()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTestProcOutputLevel1> getOutput_level_1();

	/**
	 * Returns the value of the '<em><b>Output level 0</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output level 0</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output level 0</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputs_Output_level_0()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTestProcOutputLevel0> getOutput_level_0();

} // GSSTestProcOutputs
