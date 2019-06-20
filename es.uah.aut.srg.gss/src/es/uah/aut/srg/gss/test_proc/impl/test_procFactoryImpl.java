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
package es.uah.aut.srg.gss.test_proc.impl;

import es.uah.aut.srg.gss.test_proc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class test_procFactoryImpl extends EFactoryImpl implements test_procFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static test_procFactory init() {
		try {
			test_procFactory thetest_procFactory = (test_procFactory)EPackage.Registry.INSTANCE.getEFactory(test_procPackage.eNS_URI);
			if (thetest_procFactory != null) {
				return thetest_procFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new test_procFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_procFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case test_procPackage.GSS_TEST_PROC_TEST_PROC: return createGSSTestProcTestProc();
			case test_procPackage.GSS_TEST_PROC_STEP: return createGSSTestProcStep();
			case test_procPackage.GSS_TEST_PROC_INPUTS: return createGSSTestProcInputs();
			case test_procPackage.GSS_TEST_PROC_OUTPUTS: return createGSSTestProcOutputs();
			case test_procPackage.GSS_TEST_PROC_SPECIAL_PACKETS: return createGSSTestProcSpecialPackets();
			case test_procPackage.GSS_TEST_PROC_ENABLE_DISABLE: return createGSSTestProcEnableDisable();
			case test_procPackage.GSS_TEST_PROC_CONCURRENT_STEPS: return createGSSTestProcConcurrentSteps();
			case test_procPackage.GSS_TEST_PROC_NEXT_STEP: return createGSSTestProcNextStep();
			case test_procPackage.GSS_TEST_PROC_CONCURRENT_STEP: return createGSSTestProcConcurrentStep();
			case test_procPackage.GSS_TEST_PROC_INPUT: return createGSSTestProcInput();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3: return createGSSTestProcInputLevel3();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL2: return createGSSTestProcInputLevel2();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1: return createGSSTestProcInputLevel1();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL0: return createGSSTestProcInputLevel0();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL3: return createGSSTestProcOutputLevel3();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL2: return createGSSTestProcOutputLevel2();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL1: return createGSSTestProcOutputLevel1();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0: return createGSSTestProcOutputLevel0();
			case test_procPackage.GSS_TEST_PROC_FILTER: return createGSSTestProcFilter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case test_procPackage.GSS_TEST_PROC_MODE:
				return createGSSTestProcModeFromString(eDataType, initialValue);
			case test_procPackage.GSS_TEST_PROC_UNIT:
				return createGSSTestProcUnitFromString(eDataType, initialValue);
			case test_procPackage.GSS_TEST_PROC_CHECKMODE:
				return createGSSTestProcCheckmodeFromString(eDataType, initialValue);
			case test_procPackage.GSS_TEST_PROC_YES_NO:
				return createGSSTestProcYesNoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case test_procPackage.GSS_TEST_PROC_MODE:
				return convertGSSTestProcModeToString(eDataType, instanceValue);
			case test_procPackage.GSS_TEST_PROC_UNIT:
				return convertGSSTestProcUnitToString(eDataType, instanceValue);
			case test_procPackage.GSS_TEST_PROC_CHECKMODE:
				return convertGSSTestProcCheckmodeToString(eDataType, instanceValue);
			case test_procPackage.GSS_TEST_PROC_YES_NO:
				return convertGSSTestProcYesNoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcTestProc createGSSTestProcTestProc() {
		GSSTestProcTestProcImpl gssTestProcTestProc = new GSSTestProcTestProcImpl();
		return gssTestProcTestProc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcStep createGSSTestProcStep() {
		GSSTestProcStepImpl gssTestProcStep = new GSSTestProcStepImpl();
		return gssTestProcStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcInputs createGSSTestProcInputs() {
		GSSTestProcInputsImpl gssTestProcInputs = new GSSTestProcInputsImpl();
		return gssTestProcInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcOutputs createGSSTestProcOutputs() {
		GSSTestProcOutputsImpl gssTestProcOutputs = new GSSTestProcOutputsImpl();
		return gssTestProcOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcSpecialPackets createGSSTestProcSpecialPackets() {
		GSSTestProcSpecialPacketsImpl gssTestProcSpecialPackets = new GSSTestProcSpecialPacketsImpl();
		return gssTestProcSpecialPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcEnableDisable createGSSTestProcEnableDisable() {
		GSSTestProcEnableDisableImpl gssTestProcEnableDisable = new GSSTestProcEnableDisableImpl();
		return gssTestProcEnableDisable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcConcurrentSteps createGSSTestProcConcurrentSteps() {
		GSSTestProcConcurrentStepsImpl gssTestProcConcurrentSteps = new GSSTestProcConcurrentStepsImpl();
		return gssTestProcConcurrentSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcNextStep createGSSTestProcNextStep() {
		GSSTestProcNextStepImpl gssTestProcNextStep = new GSSTestProcNextStepImpl();
		return gssTestProcNextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcConcurrentStep createGSSTestProcConcurrentStep() {
		GSSTestProcConcurrentStepImpl gssTestProcConcurrentStep = new GSSTestProcConcurrentStepImpl();
		return gssTestProcConcurrentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcInput createGSSTestProcInput() {
		GSSTestProcInputImpl gssTestProcInput = new GSSTestProcInputImpl();
		return gssTestProcInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcInputLevel3 createGSSTestProcInputLevel3() {
		GSSTestProcInputLevel3Impl gssTestProcInputLevel3 = new GSSTestProcInputLevel3Impl();
		return gssTestProcInputLevel3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcInputLevel2 createGSSTestProcInputLevel2() {
		GSSTestProcInputLevel2Impl gssTestProcInputLevel2 = new GSSTestProcInputLevel2Impl();
		return gssTestProcInputLevel2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcInputLevel1 createGSSTestProcInputLevel1() {
		GSSTestProcInputLevel1Impl gssTestProcInputLevel1 = new GSSTestProcInputLevel1Impl();
		return gssTestProcInputLevel1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcInputLevel0 createGSSTestProcInputLevel0() {
		GSSTestProcInputLevel0Impl gssTestProcInputLevel0 = new GSSTestProcInputLevel0Impl();
		return gssTestProcInputLevel0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcOutputLevel3 createGSSTestProcOutputLevel3() {
		GSSTestProcOutputLevel3Impl gssTestProcOutputLevel3 = new GSSTestProcOutputLevel3Impl();
		return gssTestProcOutputLevel3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcOutputLevel2 createGSSTestProcOutputLevel2() {
		GSSTestProcOutputLevel2Impl gssTestProcOutputLevel2 = new GSSTestProcOutputLevel2Impl();
		return gssTestProcOutputLevel2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcOutputLevel1 createGSSTestProcOutputLevel1() {
		GSSTestProcOutputLevel1Impl gssTestProcOutputLevel1 = new GSSTestProcOutputLevel1Impl();
		return gssTestProcOutputLevel1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcOutputLevel0 createGSSTestProcOutputLevel0() {
		GSSTestProcOutputLevel0Impl gssTestProcOutputLevel0 = new GSSTestProcOutputLevel0Impl();
		return gssTestProcOutputLevel0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcFilter createGSSTestProcFilter() {
		GSSTestProcFilterImpl gssTestProcFilter = new GSSTestProcFilterImpl();
		return gssTestProcFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcMode createGSSTestProcModeFromString(EDataType eDataType, String initialValue) {
		GSSTestProcMode result = GSSTestProcMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTestProcModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcUnit createGSSTestProcUnitFromString(EDataType eDataType, String initialValue) {
		GSSTestProcUnit result = GSSTestProcUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTestProcUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcCheckmode createGSSTestProcCheckmodeFromString(EDataType eDataType, String initialValue) {
		GSSTestProcCheckmode result = GSSTestProcCheckmode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTestProcCheckmodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcYesNo createGSSTestProcYesNoFromString(EDataType eDataType, String initialValue) {
		GSSTestProcYesNo result = GSSTestProcYesNo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSTestProcYesNoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_procPackage gettest_procPackage() {
		return (test_procPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static test_procPackage getPackage() {
		return test_procPackage.eINSTANCE;
	}

} //test_procFactoryImpl
