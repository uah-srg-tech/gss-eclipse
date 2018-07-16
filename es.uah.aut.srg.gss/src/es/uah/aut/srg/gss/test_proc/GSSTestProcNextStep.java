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
 * A representation of the model object '<em><b>GSS Test Proc Next Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getIsConcurrent <em>Is Concurrent</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcNextStep()
 * @model
 * @generated
 */
public interface GSSTestProcNextStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcNextStep_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Concurrent</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Concurrent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Concurrent</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo
	 * @see #isSetIsConcurrent()
	 * @see #unsetIsConcurrent()
	 * @see #setIsConcurrent(GSSTestProcYesNo)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcNextStep_IsConcurrent()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTestProcYesNo getIsConcurrent();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getIsConcurrent <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Concurrent</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo
	 * @see #isSetIsConcurrent()
	 * @see #unsetIsConcurrent()
	 * @see #getIsConcurrent()
	 * @generated
	 */
	void setIsConcurrent(GSSTestProcYesNo value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getIsConcurrent <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsConcurrent()
	 * @see #getIsConcurrent()
	 * @see #setIsConcurrent(GSSTestProcYesNo)
	 * @generated
	 */
	void unsetIsConcurrent();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep#getIsConcurrent <em>Is Concurrent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Concurrent</em>' attribute is set.
	 * @see #unsetIsConcurrent()
	 * @see #getIsConcurrent()
	 * @see #setIsConcurrent(GSSTestProcYesNo)
	 * @generated
	 */
	boolean isSetIsConcurrent();

} // GSSTestProcNextStep
