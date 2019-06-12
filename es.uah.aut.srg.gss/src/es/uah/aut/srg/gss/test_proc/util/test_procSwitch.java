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
package es.uah.aut.srg.gss.test_proc.util;

import es.uah.aut.srg.gss.common.GSSModelElement;
import es.uah.aut.srg.gss.common.GSSModelObject;

import es.uah.aut.srg.gss.test_proc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage
 * @generated
 */
public class test_procSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static test_procPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_procSwitch() {
		if (modelPackage == null) {
			modelPackage = test_procPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case test_procPackage.GSS_TEST_PROC_TEST_PROC: {
				GSSTestProcTestProc gssTestProcTestProc = (GSSTestProcTestProc)theEObject;
				T result = caseGSSTestProcTestProc(gssTestProcTestProc);
				if (result == null) result = caseGSSModelElement(gssTestProcTestProc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_STEP: {
				GSSTestProcStep gssTestProcStep = (GSSTestProcStep)theEObject;
				T result = caseGSSTestProcStep(gssTestProcStep);
				if (result == null) result = caseGSSModelObject(gssTestProcStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_INPUTS: {
				GSSTestProcInputs gssTestProcInputs = (GSSTestProcInputs)theEObject;
				T result = caseGSSTestProcInputs(gssTestProcInputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_OUTPUTS: {
				GSSTestProcOutputs gssTestProcOutputs = (GSSTestProcOutputs)theEObject;
				T result = caseGSSTestProcOutputs(gssTestProcOutputs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_SPECIAL_PACKETS: {
				GSSTestProcSpecialPackets gssTestProcSpecialPackets = (GSSTestProcSpecialPackets)theEObject;
				T result = caseGSSTestProcSpecialPackets(gssTestProcSpecialPackets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_ENABLE_DISABLE: {
				GSSTestProcEnableDisable gssTestProcEnableDisable = (GSSTestProcEnableDisable)theEObject;
				T result = caseGSSTestProcEnableDisable(gssTestProcEnableDisable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_CONCURRENT_STEPS: {
				GSSTestProcConcurrentSteps gssTestProcConcurrentSteps = (GSSTestProcConcurrentSteps)theEObject;
				T result = caseGSSTestProcConcurrentSteps(gssTestProcConcurrentSteps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_NEXT_STEP: {
				GSSTestProcNextStep gssTestProcNextStep = (GSSTestProcNextStep)theEObject;
				T result = caseGSSTestProcNextStep(gssTestProcNextStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_CONCURRENT_STEP: {
				GSSTestProcConcurrentStep gssTestProcConcurrentStep = (GSSTestProcConcurrentStep)theEObject;
				T result = caseGSSTestProcConcurrentStep(gssTestProcConcurrentStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_INPUT: {
				GSSTestProcInput gssTestProcInput = (GSSTestProcInput)theEObject;
				T result = caseGSSTestProcInput(gssTestProcInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3: {
				GSSTestProcInputLevel3 gssTestProcInputLevel3 = (GSSTestProcInputLevel3)theEObject;
				T result = caseGSSTestProcInputLevel3(gssTestProcInputLevel3);
				if (result == null) result = caseGSSTestProcInput(gssTestProcInputLevel3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL2: {
				GSSTestProcInputLevel2 gssTestProcInputLevel2 = (GSSTestProcInputLevel2)theEObject;
				T result = caseGSSTestProcInputLevel2(gssTestProcInputLevel2);
				if (result == null) result = caseGSSTestProcInput(gssTestProcInputLevel2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1: {
				GSSTestProcInputLevel1 gssTestProcInputLevel1 = (GSSTestProcInputLevel1)theEObject;
				T result = caseGSSTestProcInputLevel1(gssTestProcInputLevel1);
				if (result == null) result = caseGSSTestProcInput(gssTestProcInputLevel1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL0: {
				GSSTestProcInputLevel0 gssTestProcInputLevel0 = (GSSTestProcInputLevel0)theEObject;
				T result = caseGSSTestProcInputLevel0(gssTestProcInputLevel0);
				if (result == null) result = caseGSSTestProcInput(gssTestProcInputLevel0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_OUTPUT: {
				GSSTestProcOutput gssTestProcOutput = (GSSTestProcOutput)theEObject;
				T result = caseGSSTestProcOutput(gssTestProcOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL3: {
				GSSTestProcOutputLevel3 gssTestProcOutputLevel3 = (GSSTestProcOutputLevel3)theEObject;
				T result = caseGSSTestProcOutputLevel3(gssTestProcOutputLevel3);
				if (result == null) result = caseGSSTestProcOutput(gssTestProcOutputLevel3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2: {
				GSSTestProcOutputLevel2 gssTestProcOutputLevel2 = (GSSTestProcOutputLevel2)theEObject;
				T result = caseGSSTestProcOutputLevel2(gssTestProcOutputLevel2);
				if (result == null) result = caseGSSTestProcOutput(gssTestProcOutputLevel2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL1: {
				GSSTestProcOutputLevel1 gssTestProcOutputLevel1 = (GSSTestProcOutputLevel1)theEObject;
				T result = caseGSSTestProcOutputLevel1(gssTestProcOutputLevel1);
				if (result == null) result = caseGSSTestProcOutput(gssTestProcOutputLevel1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0: {
				GSSTestProcOutputLevel0 gssTestProcOutputLevel0 = (GSSTestProcOutputLevel0)theEObject;
				T result = caseGSSTestProcOutputLevel0(gssTestProcOutputLevel0);
				if (result == null) result = caseGSSTestProcOutput(gssTestProcOutputLevel0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_LEVEL3_FILTER: {
				GSSTestProcLevel3Filter gssTestProcLevel3Filter = (GSSTestProcLevel3Filter)theEObject;
				T result = caseGSSTestProcLevel3Filter(gssTestProcLevel3Filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_LEVEL2_FILTER: {
				GSSTestProcLevel2Filter gssTestProcLevel2Filter = (GSSTestProcLevel2Filter)theEObject;
				T result = caseGSSTestProcLevel2Filter(gssTestProcLevel2Filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_LEVEL1_FILTER: {
				GSSTestProcLevel1Filter gssTestProcLevel1Filter = (GSSTestProcLevel1Filter)theEObject;
				T result = caseGSSTestProcLevel1Filter(gssTestProcLevel1Filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER: {
				GSSTestProcLevel0Filter gssTestProcLevel0Filter = (GSSTestProcLevel0Filter)theEObject;
				T result = caseGSSTestProcLevel0Filter(gssTestProcLevel0Filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Test Proc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Test Proc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcTestProc(GSSTestProcTestProc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcStep(GSSTestProcStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Inputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcInputs(GSSTestProcInputs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Outputs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Outputs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcOutputs(GSSTestProcOutputs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Special Packets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Special Packets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcSpecialPackets(GSSTestProcSpecialPackets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Enable Disable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Enable Disable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcEnableDisable(GSSTestProcEnableDisable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Concurrent Steps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Concurrent Steps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcConcurrentSteps(GSSTestProcConcurrentSteps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Next Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Next Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcNextStep(GSSTestProcNextStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Concurrent Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Concurrent Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcConcurrentStep(GSSTestProcConcurrentStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcInput(GSSTestProcInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Input Level3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Input Level3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcInputLevel3(GSSTestProcInputLevel3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Input Level2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Input Level2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcInputLevel2(GSSTestProcInputLevel2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Input Level1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Input Level1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcInputLevel1(GSSTestProcInputLevel1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Input Level0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Input Level0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcInputLevel0(GSSTestProcInputLevel0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcOutput(GSSTestProcOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Output Level3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Output Level3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcOutputLevel3(GSSTestProcOutputLevel3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Output Level2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Output Level2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcOutputLevel2(GSSTestProcOutputLevel2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Output Level1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Output Level1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcOutputLevel1(GSSTestProcOutputLevel1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Output Level0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Output Level0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcOutputLevel0(GSSTestProcOutputLevel0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Level3 Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Level3 Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcLevel3Filter(GSSTestProcLevel3Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Level2 Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Level2 Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcLevel2Filter(GSSTestProcLevel2Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Level1 Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Level1 Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcLevel1Filter(GSSTestProcLevel1Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Test Proc Level0 Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Test Proc Level0 Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSTestProcLevel0Filter(GSSTestProcLevel0Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSModelElement(GSSModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Model Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Model Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSModelObject(GSSModelObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //test_procSwitch
