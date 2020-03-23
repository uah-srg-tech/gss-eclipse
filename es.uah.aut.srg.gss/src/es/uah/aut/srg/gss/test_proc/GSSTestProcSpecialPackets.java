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
 * A representation of the model object '<em><b>GSS Test Proc Special Packets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getEnable <em>Enable</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getDisable <em>Disable</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getEnable_print <em>Enable print</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets#getDisable_print <em>Disable print</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcSpecialPackets()
 * @model
 * @generated
 */
public interface GSSTestProcSpecialPackets extends EObject {
	/**
	 * Returns the value of the '<em><b>Enable</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcSpecialPackets_Enable()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTestProcEnableDisable> getEnable();

	/**
	 * Returns the value of the '<em><b>Disable</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcSpecialPackets_Disable()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTestProcEnableDisable> getDisable();

	/**
	 * Returns the value of the '<em><b>Enable print</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable print</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable print</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcSpecialPackets_Enable_print()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTestProcEnableDisable> getEnable_print();

	/**
	 * Returns the value of the '<em><b>Disable print</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_proc.GSSTestProcEnableDisable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable print</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable print</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcSpecialPackets_Disable_print()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTestProcEnableDisable> getDisable_print();

} // GSSTestProcSpecialPackets
