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

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.test_proc.GSSTestProcAppToLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcAppToLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcAppToLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcAppToLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode;
import es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcConcurrentSteps;
import es.uah.aut.srg.gss.test_proc.GSSTestProcDisable;
import es.uah.aut.srg.gss.test_proc.GSSTestProcDisablePrint;
import es.uah.aut.srg.gss.test_proc.GSSTestProcEnable;
import es.uah.aut.srg.gss.test_proc.GSSTestProcEnablePrint;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1FromLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel1ToLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2FromLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel2ToLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3FromLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel3ToLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcMode;
import es.uah.aut.srg.gss.test_proc.GSSTestProcNextStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutput;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcSpecialPackets;
import es.uah.aut.srg.gss.test_proc.GSSTestProcStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;
import es.uah.aut.srg.gss.test_proc.GSSTestProcUnit;
import es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo;
import es.uah.aut.srg.gss.test_proc.test_procFactory;
import es.uah.aut.srg.gss.test_proc.test_procPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class test_procPackageImpl extends EPackageImpl implements test_procPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcTestProcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcSpecialPacketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcEnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcDisableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcEnablePrintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcDisablePrintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcConcurrentStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcNextStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcConcurrentStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputLevel3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcInputLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcAppToLevel3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcAppToLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcAppToLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcAppToLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel3ToLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel2ToLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel1ToLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputLevel3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcOutputLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel3FilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel2FilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel1FilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel0FilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel3FromLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel2FromLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestProcLevel1FromLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTestProcUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTestProcModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTestProcCheckmodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssTestProcYesNoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private test_procPackageImpl() {
		super(eNS_URI, test_procFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link test_procPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static test_procPackage init() {
		if (isInited) return (test_procPackage)EPackage.Registry.INSTANCE.getEPackage(test_procPackage.eNS_URI);

		// Obtain or create and register package
		test_procPackageImpl thetest_procPackage = (test_procPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof test_procPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new test_procPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetest_procPackage.createPackageContents();

		// Initialize created meta-data
		thetest_procPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetest_procPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(test_procPackage.eNS_URI, thetest_procPackage);
		return thetest_procPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcTestProc() {
		return gssTestProcTestProcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcTestProc_Step() {
		return (EReference)gssTestProcTestProcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcStep() {
		return gssTestProcStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcStep_Id() {
		return (EAttribute)gssTestProcStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Prev_step_idref() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Output_idref_from_prev_step() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcStep_Mode() {
		return (EAttribute)gssTestProcStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcStep_Replays() {
		return (EAttribute)gssTestProcStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Inputs() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Outputs() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_SpecialPackets() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcStep_Concurrent_steps() {
		return (EReference)gssTestProcStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputs() {
		return gssTestProcInputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputs_Input_level_3() {
		return (EReference)gssTestProcInputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputs_Input_level_2() {
		return (EReference)gssTestProcInputsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputs_Input_level_1() {
		return (EReference)gssTestProcInputsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputs_Input_level_0() {
		return (EReference)gssTestProcInputsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputs() {
		return gssTestProcOutputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputs_Checkmode() {
		return (EAttribute)gssTestProcOutputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputs_Valid_time_interval_value() {
		return (EAttribute)gssTestProcOutputsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputs_Valid_time_interval_unit() {
		return (EAttribute)gssTestProcOutputsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputs_Output_level_3() {
		return (EReference)gssTestProcOutputsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputs_Output_level_2() {
		return (EReference)gssTestProcOutputsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputs_Output_level_1() {
		return (EReference)gssTestProcOutputsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputs_Output_level_0() {
		return (EReference)gssTestProcOutputsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcSpecialPackets() {
		return gssTestProcSpecialPacketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcSpecialPackets_Enable() {
		return (EReference)gssTestProcSpecialPacketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcSpecialPackets_Disable() {
		return (EReference)gssTestProcSpecialPacketsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcSpecialPackets_Enable_print() {
		return (EReference)gssTestProcSpecialPacketsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcSpecialPackets_Disable_print() {
		return (EReference)gssTestProcSpecialPacketsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcEnable() {
		return gssTestProcEnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcEnable_Id() {
		return (EAttribute)gssTestProcEnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcDisable() {
		return gssTestProcDisableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcDisable_Id() {
		return (EAttribute)gssTestProcDisableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcEnablePrint() {
		return gssTestProcEnablePrintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcEnablePrint_Id() {
		return (EAttribute)gssTestProcEnablePrintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcDisablePrint() {
		return gssTestProcDisablePrintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcDisablePrint_Id() {
		return (EAttribute)gssTestProcDisablePrintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcConcurrentSteps() {
		return gssTestProcConcurrentStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcConcurrentSteps_NextStep() {
		return (EReference)gssTestProcConcurrentStepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcConcurrentSteps_Concurrent_step() {
		return (EReference)gssTestProcConcurrentStepsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcNextStep() {
		return gssTestProcNextStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcNextStep_Id() {
		return (EAttribute)gssTestProcNextStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcNextStep_IsConcurrent() {
		return (EAttribute)gssTestProcNextStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcConcurrentStep() {
		return gssTestProcConcurrentStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcConcurrentStep_Id() {
		return (EAttribute)gssTestProcConcurrentStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputLevel3() {
		return gssTestProcInputLevel3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel3_Name() {
		return (EAttribute)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel3_IfRef() {
		return (EAttribute)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel3_Delay_value() {
		return (EAttribute)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel3_Delay_unit() {
		return (EAttribute)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level3() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_App_to_level3() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level2() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level3_to_level2() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level1() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level2_to_level1() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level0() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel3_Level1_to_level0() {
		return (EReference)gssTestProcInputLevel3EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputLevel2() {
		return gssTestProcInputLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel2_Name() {
		return (EAttribute)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel2_IfRef() {
		return (EAttribute)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel2_Delay_value() {
		return (EAttribute)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel2_Delay_unit() {
		return (EAttribute)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level2() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_App_to_level2() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level1() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level2_to_level1() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level0() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel2_Level1_to_level0() {
		return (EReference)gssTestProcInputLevel2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputLevel1() {
		return gssTestProcInputLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel1_Name() {
		return (EAttribute)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel1_IfRef() {
		return (EAttribute)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel1_Delay_value() {
		return (EAttribute)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel1_Delay_unit() {
		return (EAttribute)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel1_Level1() {
		return (EReference)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel1_App_to_level1() {
		return (EReference)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel1_Level0() {
		return (EReference)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel1_Level1_to_level0() {
		return (EReference)gssTestProcInputLevel1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcInputLevel0() {
		return gssTestProcInputLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel0_Name() {
		return (EAttribute)gssTestProcInputLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel0_IfRef() {
		return (EAttribute)gssTestProcInputLevel0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel0_Delay_value() {
		return (EAttribute)gssTestProcInputLevel0EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcInputLevel0_Delay_unit() {
		return (EAttribute)gssTestProcInputLevel0EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel0_Level0() {
		return (EReference)gssTestProcInputLevel0EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcInputLevel0_App_to_level0() {
		return (EReference)gssTestProcInputLevel0EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel3() {
		return gssTestProcLevel3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel3_Format() {
		return (EAttribute)gssTestProcLevel3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel2() {
		return gssTestProcLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel2_Format() {
		return (EAttribute)gssTestProcLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel1() {
		return gssTestProcLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel1_Format() {
		return (EAttribute)gssTestProcLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel0() {
		return gssTestProcLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel0_Format() {
		return (EAttribute)gssTestProcLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcAppToLevel3() {
		return gssTestProcAppToLevel3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcAppToLevel3_Export() {
		return (EAttribute)gssTestProcAppToLevel3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcAppToLevel2() {
		return gssTestProcAppToLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcAppToLevel2_Export() {
		return (EAttribute)gssTestProcAppToLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcAppToLevel1() {
		return gssTestProcAppToLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcAppToLevel1_Export() {
		return (EAttribute)gssTestProcAppToLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcAppToLevel0() {
		return gssTestProcAppToLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcAppToLevel0_Export() {
		return (EAttribute)gssTestProcAppToLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel3ToLevel2() {
		return gssTestProcLevel3ToLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel3ToLevel2_Export() {
		return (EAttribute)gssTestProcLevel3ToLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel2ToLevel1() {
		return gssTestProcLevel2ToLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel2ToLevel1_Export() {
		return (EAttribute)gssTestProcLevel2ToLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel1ToLevel0() {
		return gssTestProcLevel1ToLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel1ToLevel0_Export() {
		return (EAttribute)gssTestProcLevel1ToLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutput() {
		return gssTestProcOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputLevel3() {
		return gssTestProcOutputLevel3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel3_Name() {
		return (EAttribute)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel3_Id() {
		return (EAttribute)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel3_IfRef() {
		return (EAttribute)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel3_Optional() {
		return (EAttribute)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level3() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level3_filter() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level2() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level3_from_level2() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level2_filter() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level1() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level2_from_level1() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level1_filter() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level0() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level1_from_level0() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel3_Level0_filter() {
		return (EReference)gssTestProcOutputLevel3EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputLevel2() {
		return gssTestProcOutputLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel2_Name() {
		return (EAttribute)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel2_Id() {
		return (EAttribute)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel2_IfRef() {
		return (EAttribute)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel2_Optional() {
		return (EAttribute)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level2() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level2_filter() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level1() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level2_from_level1() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level1_filter() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level0() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level1_from_level0() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel2_Level0_filter() {
		return (EReference)gssTestProcOutputLevel2EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputLevel1() {
		return gssTestProcOutputLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel1_Name() {
		return (EAttribute)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel1_Id() {
		return (EAttribute)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel1_IfRef() {
		return (EAttribute)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel1_Optional() {
		return (EAttribute)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level1() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level1_filter() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level0() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level1_from_level0() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel1_Level0_filter() {
		return (EReference)gssTestProcOutputLevel1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcOutputLevel0() {
		return gssTestProcOutputLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel0_Name() {
		return (EAttribute)gssTestProcOutputLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel0_Id() {
		return (EAttribute)gssTestProcOutputLevel0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel0_IfRef() {
		return (EAttribute)gssTestProcOutputLevel0EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcOutputLevel0_Optional() {
		return (EAttribute)gssTestProcOutputLevel0EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel0_Level0() {
		return (EReference)gssTestProcOutputLevel0EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestProcOutputLevel0_Level0_filter() {
		return (EReference)gssTestProcOutputLevel0EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel3Filter() {
		return gssTestProcLevel3FilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel3Filter_Apply_def_filter() {
		return (EAttribute)gssTestProcLevel3FilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel3Filter_Extra_filter() {
		return (EAttribute)gssTestProcLevel3FilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel2Filter() {
		return gssTestProcLevel2FilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel2Filter_Apply_def_filter() {
		return (EAttribute)gssTestProcLevel2FilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel2Filter_Extra_filter() {
		return (EAttribute)gssTestProcLevel2FilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel1Filter() {
		return gssTestProcLevel1FilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel1Filter_Apply_def_filter() {
		return (EAttribute)gssTestProcLevel1FilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel1Filter_Extra_filter() {
		return (EAttribute)gssTestProcLevel1FilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel0Filter() {
		return gssTestProcLevel0FilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel0Filter_Apply_def_filter() {
		return (EAttribute)gssTestProcLevel0FilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel0Filter_Extra_filter() {
		return (EAttribute)gssTestProcLevel0FilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel3FromLevel2() {
		return gssTestProcLevel3FromLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel3FromLevel2_Import() {
		return (EAttribute)gssTestProcLevel3FromLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel2FromLevel1() {
		return gssTestProcLevel2FromLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel2FromLevel1_Import() {
		return (EAttribute)gssTestProcLevel2FromLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestProcLevel1FromLevel0() {
		return gssTestProcLevel1FromLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestProcLevel1FromLevel0_Import() {
		return (EAttribute)gssTestProcLevel1FromLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTestProcUnit() {
		return gssTestProcUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTestProcMode() {
		return gssTestProcModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTestProcCheckmode() {
		return gssTestProcCheckmodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSTestProcYesNo() {
		return gssTestProcYesNoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test_procFactory gettest_procFactory() {
		return (test_procFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gssTestProcTestProcEClass = createEClass(GSS_TEST_PROC_TEST_PROC);
		createEReference(gssTestProcTestProcEClass, GSS_TEST_PROC_TEST_PROC__STEP);

		gssTestProcStepEClass = createEClass(GSS_TEST_PROC_STEP);
		createEAttribute(gssTestProcStepEClass, GSS_TEST_PROC_STEP__ID);
		createEAttribute(gssTestProcStepEClass, GSS_TEST_PROC_STEP__MODE);
		createEAttribute(gssTestProcStepEClass, GSS_TEST_PROC_STEP__REPLAYS);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__PREV_STEP_IDREF);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__OUTPUT_IDREF_FROM_PREV_STEP);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__INPUTS);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__OUTPUTS);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__SPECIAL_PACKETS);
		createEReference(gssTestProcStepEClass, GSS_TEST_PROC_STEP__CONCURRENT_STEPS);

		gssTestProcInputsEClass = createEClass(GSS_TEST_PROC_INPUTS);
		createEReference(gssTestProcInputsEClass, GSS_TEST_PROC_INPUTS__INPUT_LEVEL_3);
		createEReference(gssTestProcInputsEClass, GSS_TEST_PROC_INPUTS__INPUT_LEVEL_2);
		createEReference(gssTestProcInputsEClass, GSS_TEST_PROC_INPUTS__INPUT_LEVEL_1);
		createEReference(gssTestProcInputsEClass, GSS_TEST_PROC_INPUTS__INPUT_LEVEL_0);

		gssTestProcOutputsEClass = createEClass(GSS_TEST_PROC_OUTPUTS);
		createEAttribute(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__CHECKMODE);
		createEAttribute(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_VALUE);
		createEAttribute(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT);
		createEReference(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_3);
		createEReference(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_2);
		createEReference(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_1);
		createEReference(gssTestProcOutputsEClass, GSS_TEST_PROC_OUTPUTS__OUTPUT_LEVEL_0);

		gssTestProcSpecialPacketsEClass = createEClass(GSS_TEST_PROC_SPECIAL_PACKETS);
		createEReference(gssTestProcSpecialPacketsEClass, GSS_TEST_PROC_SPECIAL_PACKETS__ENABLE);
		createEReference(gssTestProcSpecialPacketsEClass, GSS_TEST_PROC_SPECIAL_PACKETS__DISABLE);
		createEReference(gssTestProcSpecialPacketsEClass, GSS_TEST_PROC_SPECIAL_PACKETS__ENABLE_PRINT);
		createEReference(gssTestProcSpecialPacketsEClass, GSS_TEST_PROC_SPECIAL_PACKETS__DISABLE_PRINT);

		gssTestProcEnableEClass = createEClass(GSS_TEST_PROC_ENABLE);
		createEAttribute(gssTestProcEnableEClass, GSS_TEST_PROC_ENABLE__ID);

		gssTestProcDisableEClass = createEClass(GSS_TEST_PROC_DISABLE);
		createEAttribute(gssTestProcDisableEClass, GSS_TEST_PROC_DISABLE__ID);

		gssTestProcEnablePrintEClass = createEClass(GSS_TEST_PROC_ENABLE_PRINT);
		createEAttribute(gssTestProcEnablePrintEClass, GSS_TEST_PROC_ENABLE_PRINT__ID);

		gssTestProcDisablePrintEClass = createEClass(GSS_TEST_PROC_DISABLE_PRINT);
		createEAttribute(gssTestProcDisablePrintEClass, GSS_TEST_PROC_DISABLE_PRINT__ID);

		gssTestProcConcurrentStepsEClass = createEClass(GSS_TEST_PROC_CONCURRENT_STEPS);
		createEReference(gssTestProcConcurrentStepsEClass, GSS_TEST_PROC_CONCURRENT_STEPS__NEXT_STEP);
		createEReference(gssTestProcConcurrentStepsEClass, GSS_TEST_PROC_CONCURRENT_STEPS__CONCURRENT_STEP);

		gssTestProcNextStepEClass = createEClass(GSS_TEST_PROC_NEXT_STEP);
		createEAttribute(gssTestProcNextStepEClass, GSS_TEST_PROC_NEXT_STEP__ID);
		createEAttribute(gssTestProcNextStepEClass, GSS_TEST_PROC_NEXT_STEP__IS_CONCURRENT);

		gssTestProcConcurrentStepEClass = createEClass(GSS_TEST_PROC_CONCURRENT_STEP);
		createEAttribute(gssTestProcConcurrentStepEClass, GSS_TEST_PROC_CONCURRENT_STEP__ID);

		gssTestProcInputLevel3EClass = createEClass(GSS_TEST_PROC_INPUT_LEVEL3);
		createEAttribute(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__NAME);
		createEAttribute(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__IF_REF);
		createEAttribute(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__DELAY_VALUE);
		createEAttribute(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__DELAY_UNIT);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0);
		createEReference(gssTestProcInputLevel3EClass, GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0);

		gssTestProcInputLevel2EClass = createEClass(GSS_TEST_PROC_INPUT_LEVEL2);
		createEAttribute(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__NAME);
		createEAttribute(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__IF_REF);
		createEAttribute(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__DELAY_VALUE);
		createEAttribute(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__DELAY_UNIT);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__APP_TO_LEVEL2);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL2_TO_LEVEL1);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL0);
		createEReference(gssTestProcInputLevel2EClass, GSS_TEST_PROC_INPUT_LEVEL2__LEVEL1_TO_LEVEL0);

		gssTestProcInputLevel1EClass = createEClass(GSS_TEST_PROC_INPUT_LEVEL1);
		createEAttribute(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__NAME);
		createEAttribute(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__IF_REF);
		createEAttribute(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE);
		createEAttribute(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT);
		createEReference(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1);
		createEReference(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1);
		createEReference(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0);
		createEReference(gssTestProcInputLevel1EClass, GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0);

		gssTestProcInputLevel0EClass = createEClass(GSS_TEST_PROC_INPUT_LEVEL0);
		createEAttribute(gssTestProcInputLevel0EClass, GSS_TEST_PROC_INPUT_LEVEL0__NAME);
		createEAttribute(gssTestProcInputLevel0EClass, GSS_TEST_PROC_INPUT_LEVEL0__IF_REF);
		createEAttribute(gssTestProcInputLevel0EClass, GSS_TEST_PROC_INPUT_LEVEL0__DELAY_VALUE);
		createEAttribute(gssTestProcInputLevel0EClass, GSS_TEST_PROC_INPUT_LEVEL0__DELAY_UNIT);
		createEReference(gssTestProcInputLevel0EClass, GSS_TEST_PROC_INPUT_LEVEL0__LEVEL0);
		createEReference(gssTestProcInputLevel0EClass, GSS_TEST_PROC_INPUT_LEVEL0__APP_TO_LEVEL0);

		gssTestProcLevel3EClass = createEClass(GSS_TEST_PROC_LEVEL3);
		createEAttribute(gssTestProcLevel3EClass, GSS_TEST_PROC_LEVEL3__FORMAT);

		gssTestProcLevel2EClass = createEClass(GSS_TEST_PROC_LEVEL2);
		createEAttribute(gssTestProcLevel2EClass, GSS_TEST_PROC_LEVEL2__FORMAT);

		gssTestProcLevel1EClass = createEClass(GSS_TEST_PROC_LEVEL1);
		createEAttribute(gssTestProcLevel1EClass, GSS_TEST_PROC_LEVEL1__FORMAT);

		gssTestProcLevel0EClass = createEClass(GSS_TEST_PROC_LEVEL0);
		createEAttribute(gssTestProcLevel0EClass, GSS_TEST_PROC_LEVEL0__FORMAT);

		gssTestProcAppToLevel3EClass = createEClass(GSS_TEST_PROC_APP_TO_LEVEL3);
		createEAttribute(gssTestProcAppToLevel3EClass, GSS_TEST_PROC_APP_TO_LEVEL3__EXPORT);

		gssTestProcAppToLevel2EClass = createEClass(GSS_TEST_PROC_APP_TO_LEVEL2);
		createEAttribute(gssTestProcAppToLevel2EClass, GSS_TEST_PROC_APP_TO_LEVEL2__EXPORT);

		gssTestProcAppToLevel1EClass = createEClass(GSS_TEST_PROC_APP_TO_LEVEL1);
		createEAttribute(gssTestProcAppToLevel1EClass, GSS_TEST_PROC_APP_TO_LEVEL1__EXPORT);

		gssTestProcAppToLevel0EClass = createEClass(GSS_TEST_PROC_APP_TO_LEVEL0);
		createEAttribute(gssTestProcAppToLevel0EClass, GSS_TEST_PROC_APP_TO_LEVEL0__EXPORT);

		gssTestProcLevel3ToLevel2EClass = createEClass(GSS_TEST_PROC_LEVEL3_TO_LEVEL2);
		createEAttribute(gssTestProcLevel3ToLevel2EClass, GSS_TEST_PROC_LEVEL3_TO_LEVEL2__EXPORT);

		gssTestProcLevel2ToLevel1EClass = createEClass(GSS_TEST_PROC_LEVEL2_TO_LEVEL1);
		createEAttribute(gssTestProcLevel2ToLevel1EClass, GSS_TEST_PROC_LEVEL2_TO_LEVEL1__EXPORT);

		gssTestProcLevel1ToLevel0EClass = createEClass(GSS_TEST_PROC_LEVEL1_TO_LEVEL0);
		createEAttribute(gssTestProcLevel1ToLevel0EClass, GSS_TEST_PROC_LEVEL1_TO_LEVEL0__EXPORT);

		gssTestProcOutputEClass = createEClass(GSS_TEST_PROC_OUTPUT);

		gssTestProcOutputLevel3EClass = createEClass(GSS_TEST_PROC_OUTPUT_LEVEL3);
		createEAttribute(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__NAME);
		createEAttribute(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__ID);
		createEAttribute(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__IF_REF);
		createEAttribute(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__OPTIONAL);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3_FILTER);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL3_FROM_LEVEL2);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2_FILTER);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL2_FROM_LEVEL1);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1_FILTER);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL0);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL1_FROM_LEVEL0);
		createEReference(gssTestProcOutputLevel3EClass, GSS_TEST_PROC_OUTPUT_LEVEL3__LEVEL0_FILTER);

		gssTestProcOutputLevel2EClass = createEClass(GSS_TEST_PROC_OUTPUT_LEVEL2);
		createEAttribute(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__NAME);
		createEAttribute(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__ID);
		createEAttribute(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__IF_REF);
		createEAttribute(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__OPTIONAL);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FILTER);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL2_FROM_LEVEL1);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FILTER);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL1_FROM_LEVEL0);
		createEReference(gssTestProcOutputLevel2EClass, GSS_TEST_PROC_OUTPUT_LEVEL2__LEVEL0_FILTER);

		gssTestProcOutputLevel1EClass = createEClass(GSS_TEST_PROC_OUTPUT_LEVEL1);
		createEAttribute(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__NAME);
		createEAttribute(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__ID);
		createEAttribute(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__IF_REF);
		createEAttribute(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__OPTIONAL);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1_FILTER);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL0);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL1_FROM_LEVEL0);
		createEReference(gssTestProcOutputLevel1EClass, GSS_TEST_PROC_OUTPUT_LEVEL1__LEVEL0_FILTER);

		gssTestProcOutputLevel0EClass = createEClass(GSS_TEST_PROC_OUTPUT_LEVEL0);
		createEAttribute(gssTestProcOutputLevel0EClass, GSS_TEST_PROC_OUTPUT_LEVEL0__NAME);
		createEAttribute(gssTestProcOutputLevel0EClass, GSS_TEST_PROC_OUTPUT_LEVEL0__ID);
		createEAttribute(gssTestProcOutputLevel0EClass, GSS_TEST_PROC_OUTPUT_LEVEL0__IF_REF);
		createEAttribute(gssTestProcOutputLevel0EClass, GSS_TEST_PROC_OUTPUT_LEVEL0__OPTIONAL);
		createEReference(gssTestProcOutputLevel0EClass, GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0);
		createEReference(gssTestProcOutputLevel0EClass, GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER);

		gssTestProcLevel3FilterEClass = createEClass(GSS_TEST_PROC_LEVEL3_FILTER);
		createEAttribute(gssTestProcLevel3FilterEClass, GSS_TEST_PROC_LEVEL3_FILTER__APPLY_DEF_FILTER);
		createEAttribute(gssTestProcLevel3FilterEClass, GSS_TEST_PROC_LEVEL3_FILTER__EXTRA_FILTER);

		gssTestProcLevel2FilterEClass = createEClass(GSS_TEST_PROC_LEVEL2_FILTER);
		createEAttribute(gssTestProcLevel2FilterEClass, GSS_TEST_PROC_LEVEL2_FILTER__APPLY_DEF_FILTER);
		createEAttribute(gssTestProcLevel2FilterEClass, GSS_TEST_PROC_LEVEL2_FILTER__EXTRA_FILTER);

		gssTestProcLevel1FilterEClass = createEClass(GSS_TEST_PROC_LEVEL1_FILTER);
		createEAttribute(gssTestProcLevel1FilterEClass, GSS_TEST_PROC_LEVEL1_FILTER__APPLY_DEF_FILTER);
		createEAttribute(gssTestProcLevel1FilterEClass, GSS_TEST_PROC_LEVEL1_FILTER__EXTRA_FILTER);

		gssTestProcLevel0FilterEClass = createEClass(GSS_TEST_PROC_LEVEL0_FILTER);
		createEAttribute(gssTestProcLevel0FilterEClass, GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER);
		createEAttribute(gssTestProcLevel0FilterEClass, GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER);

		gssTestProcLevel3FromLevel2EClass = createEClass(GSS_TEST_PROC_LEVEL3_FROM_LEVEL2);
		createEAttribute(gssTestProcLevel3FromLevel2EClass, GSS_TEST_PROC_LEVEL3_FROM_LEVEL2__IMPORT);

		gssTestProcLevel2FromLevel1EClass = createEClass(GSS_TEST_PROC_LEVEL2_FROM_LEVEL1);
		createEAttribute(gssTestProcLevel2FromLevel1EClass, GSS_TEST_PROC_LEVEL2_FROM_LEVEL1__IMPORT);

		gssTestProcLevel1FromLevel0EClass = createEClass(GSS_TEST_PROC_LEVEL1_FROM_LEVEL0);
		createEAttribute(gssTestProcLevel1FromLevel0EClass, GSS_TEST_PROC_LEVEL1_FROM_LEVEL0__IMPORT);

		// Create enums
		gssTestProcModeEEnum = createEEnum(GSS_TEST_PROC_MODE);
		gssTestProcUnitEEnum = createEEnum(GSS_TEST_PROC_UNIT);
		gssTestProcCheckmodeEEnum = createEEnum(GSS_TEST_PROC_CHECKMODE);
		gssTestProcYesNoEEnum = createEEnum(GSS_TEST_PROC_YES_NO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssTestProcTestProcEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());
		gssTestProcStepEClass.getESuperTypes().add(thecommonPackage.getGSSModelObject());
		gssTestProcOutputLevel3EClass.getESuperTypes().add(this.getGSSTestProcOutput());
		gssTestProcOutputLevel2EClass.getESuperTypes().add(this.getGSSTestProcOutput());
		gssTestProcOutputLevel1EClass.getESuperTypes().add(this.getGSSTestProcOutput());
		gssTestProcOutputLevel0EClass.getESuperTypes().add(this.getGSSTestProcOutput());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssTestProcTestProcEClass, GSSTestProcTestProc.class, "GSSTestProcTestProc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcTestProc_Step(), this.getGSSTestProcStep(), null, "step", null, 1, 1900, GSSTestProcTestProc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcStepEClass, GSSTestProcStep.class, "GSSTestProcStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcStep_Mode(), this.getGSSTestProcMode(), "mode", null, 1, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcStep_Replays(), ecorePackage.getEString(), "replays", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Prev_step_idref(), this.getGSSTestProcStep(), null, "prev_step_idref", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Output_idref_from_prev_step(), this.getGSSTestProcOutput(), null, "output_idref_from_prev_step", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Inputs(), this.getGSSTestProcInputs(), null, "inputs", null, 1, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Outputs(), this.getGSSTestProcOutputs(), null, "outputs", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_SpecialPackets(), this.getGSSTestProcSpecialPackets(), null, "specialPackets", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcStep_Concurrent_steps(), this.getGSSTestProcConcurrentSteps(), null, "concurrent_steps", null, 0, 1, GSSTestProcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputsEClass, GSSTestProcInputs.class, "GSSTestProcInputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcInputs_Input_level_3(), this.getGSSTestProcInputLevel3(), null, "input_level_3", null, 0, -1, GSSTestProcInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputs_Input_level_2(), this.getGSSTestProcInputLevel2(), null, "input_level_2", null, 0, -1, GSSTestProcInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputs_Input_level_1(), this.getGSSTestProcInputLevel1(), null, "input_level_1", null, 0, -1, GSSTestProcInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputs_Input_level_0(), this.getGSSTestProcInputLevel0(), null, "input_level_0", null, 0, -1, GSSTestProcInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputsEClass, GSSTestProcOutputs.class, "GSSTestProcOutputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcOutputs_Checkmode(), this.getGSSTestProcCheckmode(), "checkmode", null, 1, 1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputs_Valid_time_interval_value(), ecorePackage.getEString(), "valid_time_interval_value", null, 1, 1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputs_Valid_time_interval_unit(), this.getGSSTestProcUnit(), "valid_time_interval_unit", null, 1, 1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputs_Output_level_3(), this.getGSSTestProcOutputLevel3(), null, "output_level_3", null, 0, -1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputs_Output_level_2(), this.getGSSTestProcOutputLevel2(), null, "output_level_2", null, 0, -1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputs_Output_level_1(), this.getGSSTestProcOutputLevel1(), null, "output_level_1", null, 0, -1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputs_Output_level_0(), this.getGSSTestProcOutputLevel0(), null, "output_level_0", null, 0, -1, GSSTestProcOutputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcSpecialPacketsEClass, GSSTestProcSpecialPackets.class, "GSSTestProcSpecialPackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcSpecialPackets_Enable(), this.getGSSTestProcEnable(), null, "enable", null, 0, -1, GSSTestProcSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcSpecialPackets_Disable(), this.getGSSTestProcDisable(), null, "disable", null, 0, -1, GSSTestProcSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcSpecialPackets_Enable_print(), this.getGSSTestProcEnablePrint(), null, "enable_print", null, 0, -1, GSSTestProcSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcSpecialPackets_Disable_print(), this.getGSSTestProcDisablePrint(), null, "disable_print", null, 0, -1, GSSTestProcSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcEnableEClass, GSSTestProcEnable.class, "GSSTestProcEnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcEnable_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcEnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcDisableEClass, GSSTestProcDisable.class, "GSSTestProcDisable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcDisable_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcDisable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcEnablePrintEClass, GSSTestProcEnablePrint.class, "GSSTestProcEnablePrint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcEnablePrint_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcEnablePrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcDisablePrintEClass, GSSTestProcDisablePrint.class, "GSSTestProcDisablePrint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcDisablePrint_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcDisablePrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcConcurrentStepsEClass, GSSTestProcConcurrentSteps.class, "GSSTestProcConcurrentSteps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTestProcConcurrentSteps_NextStep(), this.getGSSTestProcNextStep(), null, "nextStep", null, 1, 1, GSSTestProcConcurrentSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcConcurrentSteps_Concurrent_step(), this.getGSSTestProcConcurrentStep(), null, "concurrent_step", null, 1, -1, GSSTestProcConcurrentSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcNextStepEClass, GSSTestProcNextStep.class, "GSSTestProcNextStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcNextStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcNextStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcNextStep_IsConcurrent(), this.getGSSTestProcYesNo(), "isConcurrent", null, 1, 1, GSSTestProcNextStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcConcurrentStepEClass, GSSTestProcConcurrentStep.class, "GSSTestProcConcurrentStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcConcurrentStep_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcConcurrentStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputLevel3EClass, GSSTestProcInputLevel3.class, "GSSTestProcInputLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcInputLevel3_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel3_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel3_Delay_value(), ecorePackage.getEString(), "delay_value", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel3_Delay_unit(), this.getGSSTestProcUnit(), "delay_unit", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level3(), this.getGSSTestProcLevel3(), null, "level3", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_App_to_level3(), this.getGSSTestProcAppToLevel3(), null, "app_to_level3", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level2(), this.getGSSTestProcLevel2(), null, "level2", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level3_to_level2(), this.getGSSTestProcLevel3ToLevel2(), null, "level3_to_level2", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level1(), this.getGSSTestProcLevel1(), null, "level1", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level2_to_level1(), this.getGSSTestProcLevel2ToLevel1(), null, "level2_to_level1", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level0(), this.getGSSTestProcLevel0(), null, "level0", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel3_Level1_to_level0(), this.getGSSTestProcLevel1ToLevel0(), null, "level1_to_level0", null, 1, 1, GSSTestProcInputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputLevel2EClass, GSSTestProcInputLevel2.class, "GSSTestProcInputLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcInputLevel2_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel2_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel2_Delay_value(), ecorePackage.getEString(), "delay_value", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel2_Delay_unit(), this.getGSSTestProcUnit(), "delay_unit", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_Level2(), this.getGSSTestProcLevel2(), null, "level2", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_App_to_level2(), this.getGSSTestProcAppToLevel2(), null, "app_to_level2", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_Level1(), this.getGSSTestProcLevel1(), null, "level1", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_Level2_to_level1(), this.getGSSTestProcLevel2ToLevel1(), null, "level2_to_level1", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_Level0(), this.getGSSTestProcLevel0(), null, "level0", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel2_Level1_to_level0(), this.getGSSTestProcLevel1ToLevel0(), null, "level1_to_level0", null, 1, 1, GSSTestProcInputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputLevel1EClass, GSSTestProcInputLevel1.class, "GSSTestProcInputLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcInputLevel1_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel1_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel1_Delay_value(), ecorePackage.getEString(), "delay_value", null, 1, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel1_Delay_unit(), this.getGSSTestProcUnit(), "delay_unit", null, 1, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel1_Level1(), this.getGSSTestProcLevel1(), null, "level1", null, 1, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel1_App_to_level1(), this.getGSSTestProcAppToLevel1(), null, "app_to_level1", null, 1, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel1_Level0(), this.getGSSTestProcLevel0(), null, "level0", null, 1, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel1_Level1_to_level0(), this.getGSSTestProcLevel1ToLevel0(), null, "level1_to_level0", null, 1, 1, GSSTestProcInputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcInputLevel0EClass, GSSTestProcInputLevel0.class, "GSSTestProcInputLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcInputLevel0_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel0_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel0_Delay_value(), ecorePackage.getEString(), "delay_value", null, 1, 1, GSSTestProcInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcInputLevel0_Delay_unit(), this.getGSSTestProcUnit(), "delay_unit", null, 1, 1, GSSTestProcInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel0_Level0(), this.getGSSTestProcLevel0(), null, "level0", null, 1, 1, GSSTestProcInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcInputLevel0_App_to_level0(), this.getGSSTestProcAppToLevel0(), null, "app_to_level0", null, 1, 1, GSSTestProcInputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel3EClass, GSSTestProcLevel3.class, "GSSTestProcLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel3_Format(), ecorePackage.getEString(), "format", null, 1, 1, GSSTestProcLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel2EClass, GSSTestProcLevel2.class, "GSSTestProcLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel2_Format(), ecorePackage.getEString(), "format", null, 1, 1, GSSTestProcLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel1EClass, GSSTestProcLevel1.class, "GSSTestProcLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel1_Format(), ecorePackage.getEString(), "format", null, 1, 1, GSSTestProcLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel0EClass, GSSTestProcLevel0.class, "GSSTestProcLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel0_Format(), ecorePackage.getEString(), "format", null, 1, 1, GSSTestProcLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcAppToLevel3EClass, GSSTestProcAppToLevel3.class, "GSSTestProcAppToLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcAppToLevel3_Export(), ecorePackage.getEString(), "export", null, 1, 1, GSSTestProcAppToLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcAppToLevel2EClass, GSSTestProcAppToLevel2.class, "GSSTestProcAppToLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcAppToLevel2_Export(), ecorePackage.getEString(), "export", null, 1, 1, GSSTestProcAppToLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcAppToLevel1EClass, GSSTestProcAppToLevel1.class, "GSSTestProcAppToLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcAppToLevel1_Export(), ecorePackage.getEString(), "export", null, 1, 1, GSSTestProcAppToLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcAppToLevel0EClass, GSSTestProcAppToLevel0.class, "GSSTestProcAppToLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcAppToLevel0_Export(), ecorePackage.getEString(), "export", null, 1, 1, GSSTestProcAppToLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel3ToLevel2EClass, GSSTestProcLevel3ToLevel2.class, "GSSTestProcLevel3ToLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel3ToLevel2_Export(), ecorePackage.getEString(), "export", null, 1, 1, GSSTestProcLevel3ToLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel2ToLevel1EClass, GSSTestProcLevel2ToLevel1.class, "GSSTestProcLevel2ToLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel2ToLevel1_Export(), ecorePackage.getEString(), "export", null, 1, 1, GSSTestProcLevel2ToLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel1ToLevel0EClass, GSSTestProcLevel1ToLevel0.class, "GSSTestProcLevel1ToLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel1ToLevel0_Export(), ecorePackage.getEString(), "export", null, 1, 1, GSSTestProcLevel1ToLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputEClass, GSSTestProcOutput.class, "GSSTestProcOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gssTestProcOutputLevel3EClass, GSSTestProcOutputLevel3.class, "GSSTestProcOutputLevel3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcOutputLevel3_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel3_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel3_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel3_Optional(), ecorePackage.getEString(), "optional", null, 0, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level3(), this.getGSSTestProcLevel3(), null, "level3", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level3_filter(), this.getGSSTestProcLevel3Filter(), null, "level3_filter", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level2(), this.getGSSTestProcLevel2(), null, "level2", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level3_from_level2(), this.getGSSTestProcLevel3FromLevel2(), null, "level3_from_level2", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level2_filter(), this.getGSSTestProcLevel2Filter(), null, "level2_filter", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level1(), this.getGSSTestProcLevel1(), null, "level1", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level2_from_level1(), this.getGSSTestProcLevel2FromLevel1(), null, "level2_from_level1", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level1_filter(), this.getGSSTestProcLevel1Filter(), null, "level1_filter", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level0(), this.getGSSTestProcLevel0(), null, "level0", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level1_from_level0(), this.getGSSTestProcLevel1FromLevel0(), null, "level1_from_level0", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel3_Level0_filter(), this.getGSSTestProcLevel0Filter(), null, "level0_filter", null, 1, 1, GSSTestProcOutputLevel3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputLevel2EClass, GSSTestProcOutputLevel2.class, "GSSTestProcOutputLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcOutputLevel2_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel2_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel2_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel2_Optional(), ecorePackage.getEString(), "optional", null, 0, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level2(), this.getGSSTestProcLevel2(), null, "level2", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level2_filter(), this.getGSSTestProcLevel2Filter(), null, "level2_filter", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level1(), this.getGSSTestProcLevel1(), null, "level1", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level2_from_level1(), this.getGSSTestProcLevel2FromLevel1(), null, "level2_from_level1", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level1_filter(), this.getGSSTestProcLevel1Filter(), null, "level1_filter", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level0(), this.getGSSTestProcLevel0(), null, "level0", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level1_from_level0(), this.getGSSTestProcLevel1FromLevel0(), null, "level1_from_level0", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel2_Level0_filter(), this.getGSSTestProcLevel0Filter(), null, "level0_filter", null, 1, 1, GSSTestProcOutputLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputLevel1EClass, GSSTestProcOutputLevel1.class, "GSSTestProcOutputLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcOutputLevel1_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel1_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel1_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel1_Optional(), ecorePackage.getEString(), "optional", null, 0, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel1_Level1(), this.getGSSTestProcLevel1(), null, "level1", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel1_Level1_filter(), this.getGSSTestProcLevel1Filter(), null, "level1_filter", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel1_Level0(), this.getGSSTestProcLevel0(), null, "level0", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel1_Level1_from_level0(), this.getGSSTestProcLevel1FromLevel0(), null, "level1_from_level0", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel1_Level0_filter(), this.getGSSTestProcLevel0Filter(), null, "level0_filter", null, 1, 1, GSSTestProcOutputLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcOutputLevel0EClass, GSSTestProcOutputLevel0.class, "GSSTestProcOutputLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcOutputLevel0_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestProcOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel0_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSTestProcOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel0_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSTestProcOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcOutputLevel0_Optional(), ecorePackage.getEString(), "optional", null, 0, 1, GSSTestProcOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel0_Level0(), this.getGSSTestProcLevel0(), null, "level0", null, 1, 1, GSSTestProcOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestProcOutputLevel0_Level0_filter(), this.getGSSTestProcLevel0Filter(), null, "level0_filter", null, 1, 1, GSSTestProcOutputLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel3FilterEClass, GSSTestProcLevel3Filter.class, "GSSTestProcLevel3Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel3Filter_Apply_def_filter(), this.getGSSTestProcYesNo(), "apply_def_filter", null, 1, 1, GSSTestProcLevel3Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcLevel3Filter_Extra_filter(), ecorePackage.getEString(), "extra_filter", null, 1, 1, GSSTestProcLevel3Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel2FilterEClass, GSSTestProcLevel2Filter.class, "GSSTestProcLevel2Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel2Filter_Apply_def_filter(), this.getGSSTestProcYesNo(), "apply_def_filter", null, 1, 1, GSSTestProcLevel2Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcLevel2Filter_Extra_filter(), ecorePackage.getEString(), "extra_filter", null, 1, 1, GSSTestProcLevel2Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel1FilterEClass, GSSTestProcLevel1Filter.class, "GSSTestProcLevel1Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel1Filter_Apply_def_filter(), this.getGSSTestProcYesNo(), "apply_def_filter", null, 1, 1, GSSTestProcLevel1Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcLevel1Filter_Extra_filter(), ecorePackage.getEString(), "extra_filter", null, 1, 1, GSSTestProcLevel1Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel0FilterEClass, GSSTestProcLevel0Filter.class, "GSSTestProcLevel0Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel0Filter_Apply_def_filter(), this.getGSSTestProcYesNo(), "apply_def_filter", null, 1, 1, GSSTestProcLevel0Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSTestProcLevel0Filter_Extra_filter(), ecorePackage.getEString(), "extra_filter", null, 1, 1, GSSTestProcLevel0Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel3FromLevel2EClass, GSSTestProcLevel3FromLevel2.class, "GSSTestProcLevel3FromLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel3FromLevel2_Import(), ecorePackage.getEString(), "import", null, 1, 1, GSSTestProcLevel3FromLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel2FromLevel1EClass, GSSTestProcLevel2FromLevel1.class, "GSSTestProcLevel2FromLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel2FromLevel1_Import(), ecorePackage.getEString(), "import", null, 1, 1, GSSTestProcLevel2FromLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssTestProcLevel1FromLevel0EClass, GSSTestProcLevel1FromLevel0.class, "GSSTestProcLevel1FromLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestProcLevel1FromLevel0_Import(), ecorePackage.getEString(), "import", null, 1, 1, GSSTestProcLevel1FromLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssTestProcModeEEnum, GSSTestProcMode.class, "GSSTestProcMode");
		addEEnumLiteral(gssTestProcModeEEnum, GSSTestProcMode.CONTINUOUS);
		addEEnumLiteral(gssTestProcModeEEnum, GSSTestProcMode.MANUAL);
		addEEnumLiteral(gssTestProcModeEEnum, GSSTestProcMode.CONCURRENT);

		initEEnum(gssTestProcUnitEEnum, GSSTestProcUnit.class, "GSSTestProcUnit");
		addEEnumLiteral(gssTestProcUnitEEnum, GSSTestProcUnit.MILISECONDS);
		addEEnumLiteral(gssTestProcUnitEEnum, GSSTestProcUnit.SECONDS);

		initEEnum(gssTestProcCheckmodeEEnum, GSSTestProcCheckmode.class, "GSSTestProcCheckmode");
		addEEnumLiteral(gssTestProcCheckmodeEEnum, GSSTestProcCheckmode.ALL);
		addEEnumLiteral(gssTestProcCheckmodeEEnum, GSSTestProcCheckmode.ALLUNSORTED);
		addEEnumLiteral(gssTestProcCheckmodeEEnum, GSSTestProcCheckmode.ANY);

		initEEnum(gssTestProcYesNoEEnum, GSSTestProcYesNo.class, "GSSTestProcYesNo");
		addEEnumLiteral(gssTestProcYesNoEEnum, GSSTestProcYesNo.YES);
		addEEnumLiteral(gssTestProcYesNoEEnum, GSSTestProcYesNo.NO);

		// Create resource
		createResource(eNS_URI);
	}

} //test_procPackageImpl
