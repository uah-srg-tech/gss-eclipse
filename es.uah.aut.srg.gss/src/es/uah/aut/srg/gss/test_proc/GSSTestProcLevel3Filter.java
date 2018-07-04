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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Level3 Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter#getApply_def_filter <em>Apply def filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter#getExtra_filter <em>Extra filter</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcLevel3Filter()
 * @model
 * @generated
 */
public interface GSSTestProcLevel3Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply def filter</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply def filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply def filter</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo
	 * @see #setApply_def_filter(GSSTestProcYesNo)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcLevel3Filter_Apply_def_filter()
	 * @model required="true"
	 * @generated
	 */
	GSSTestProcYesNo getApply_def_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter#getApply_def_filter <em>Apply def filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply def filter</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo
	 * @see #getApply_def_filter()
	 * @generated
	 */
	void setApply_def_filter(GSSTestProcYesNo value);

	/**
	 * Returns the value of the '<em><b>Extra filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra filter</em>' attribute.
	 * @see #setExtra_filter(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcLevel3Filter_Extra_filter()
	 * @model required="true"
	 * @generated
	 */
	String getExtra_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter#getExtra_filter <em>Extra filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra filter</em>' attribute.
	 * @see #getExtra_filter()
	 * @generated
	 */
	void setExtra_filter(String value);

} // GSSTestProcLevel3Filter
