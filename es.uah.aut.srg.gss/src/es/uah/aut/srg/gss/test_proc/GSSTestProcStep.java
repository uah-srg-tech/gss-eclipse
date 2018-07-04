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

import es.uah.aut.srg.gss.common.GSSModelObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getMode <em>Mode</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getReplays <em>Replays</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getPrev_step_idref <em>Prev step idref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getOutput_idref_from_prev_step <em>Output idref from prev step</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getInputs <em>Inputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getSpecialPackets <em>Special Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getConcurrent_steps <em>Concurrent steps</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep()
 * @model
 * @generated
 */
public interface GSSTestProcStep extends GSSModelObject {
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
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Prev step idref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev step idref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev step idref</em>' reference.
	 * @see #setPrev_step_idref(GSSTestProcStep)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep_Prev_step_idref()
	 * @model
	 * @generated
	 */
	GSSTestProcStep getPrev_step_idref();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getPrev_step_idref <em>Prev step idref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev step idref</em>' reference.
	 * @see #getPrev_step_idref()
	 * @generated
	 */
	void setPrev_step_idref(GSSTestProcStep value);

	/**
	 * Returns the value of the '<em><b>Output idref from prev step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output idref from prev step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output idref from prev step</em>' reference.
	 * @see #setOutput_idref_from_prev_step(GSSTestProcOutput)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep_Output_idref_from_prev_step()
	 * @model
	 * @generated
	 */
	GSSTestProcOutput getOutput_idref_from_prev_step();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getOutput_idref_from_prev_step <em>Output idref from prev step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output idref from prev step</em>' reference.
	 * @see #getOutput_idref_from_prev_step()
	 * @generated
	 */
	void setOutput_idref_from_prev_step(GSSTestProcOutput value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcMode
	 * @see #setMode(GSSTestProcMode)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep_Mode()
	 * @model required="true"
	 * @generated
	 */
	GSSTestProcMode getMode();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(GSSTestProcMode value);

	/**
	 * Returns the value of the '<em><b>Replays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replays</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replays</em>' attribute.
	 * @see #setReplays(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep_Replays()
	 * @model
	 * @generated
	 */
	String getReplays();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getReplays <em>Replays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replays</em>' attribute.
	 * @see #getReplays()
	 * @generated
	 */
	void setReplays(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(GSSTestProcInputs)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcInputs getInputs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(GSSTestProcInputs value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference.
	 * @see #setOutputs(GSSTestProcOutputs)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	GSSTestProcOutputs getOutputs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getOutputs <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' containment reference.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(GSSTestProcOutputs value);

	/**
	 * Returns the value of the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Packets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Packets</em>' containment reference.
	 * @see #setSpecialPackets(GSSTestProcSpecialPackets)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep_SpecialPackets()
	 * @model containment="true"
	 * @generated
	 */
	GSSTestProcSpecialPackets getSpecialPackets();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getSpecialPackets <em>Special Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Packets</em>' containment reference.
	 * @see #getSpecialPackets()
	 * @generated
	 */
	void setSpecialPackets(GSSTestProcSpecialPackets value);

	/**
	 * Returns the value of the '<em><b>Concurrent steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concurrent steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrent steps</em>' containment reference.
	 * @see #setConcurrent_steps(GSSTestProcConcurrentSteps)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcStep_Concurrent_steps()
	 * @model containment="true"
	 * @generated
	 */
	GSSTestProcConcurrentSteps getConcurrent_steps();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcStep#getConcurrent_steps <em>Concurrent steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrent steps</em>' containment reference.
	 * @see #getConcurrent_steps()
	 * @generated
	 */
	void setConcurrent_steps(GSSTestProcConcurrentSteps value);

} // GSSTestProcStep
