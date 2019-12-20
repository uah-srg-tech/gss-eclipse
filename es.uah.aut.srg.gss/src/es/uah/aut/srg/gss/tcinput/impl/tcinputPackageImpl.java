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
package es.uah.aut.srg.gss.tcinput.impl;

import es.uah.aut.srg.gss.export.exportPackage;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.tcinput.GSSTCInput;
import es.uah.aut.srg.gss.tcinput.GSSTCInputField;
import es.uah.aut.srg.gss.tcinput.tcinputFactory;
import es.uah.aut.srg.gss.tcinput.tcinputPackage;

import es.uah.aut.srg.tmtcif.tc.tcPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class tcinputPackageImpl extends EPackageImpl implements tcinputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstcInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstcInputFieldEClass = null;

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
	 * @see es.uah.aut.srg.gss.tcinput.tcinputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tcinputPackageImpl() {
		super(eNS_URI, tcinputFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tcinputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tcinputPackage init() {
		if (isInited) return (tcinputPackage)EPackage.Registry.INSTANCE.getEPackage(tcinputPackage.eNS_URI);

		// Obtain or create and register package
		tcinputPackageImpl thetcinputPackage = (tcinputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tcinputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tcinputPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		exportPackage.eINSTANCE.eClass();
		tcPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetcinputPackage.createPackageContents();

		// Initialize created meta-data
		thetcinputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetcinputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tcinputPackage.eNS_URI, thetcinputPackage);
		return thetcinputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTCInput() {
		return gsstcInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTCInput_Levels() {
		return (EAttribute)gsstcInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInput_To_level3_export() {
		return (EReference)gsstcInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInput_Level3_format() {
		return (EReference)gsstcInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInput_To_level2_export() {
		return (EReference)gsstcInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInput_Level2_format() {
		return (EReference)gsstcInputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInput_To_level1_export() {
		return (EReference)gsstcInputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInput_Level1_format() {
		return (EReference)gsstcInputEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInput_To_level0_export() {
		return (EReference)gsstcInputEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInput_Level0_format() {
		return (EReference)gsstcInputEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInput_GssFields() {
		return (EReference)gsstcInputEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTCInputField() {
		return gsstcInputFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCInputField_GssField() {
		return (EReference)gsstcInputFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcinputFactory gettcinputFactory() {
		return (tcinputFactory)getEFactoryInstance();
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
		gsstcInputEClass = createEClass(GSSTC_INPUT);
		createEAttribute(gsstcInputEClass, GSSTC_INPUT__LEVELS);
		createEReference(gsstcInputEClass, GSSTC_INPUT__TO_LEVEL3_EXPORT);
		createEReference(gsstcInputEClass, GSSTC_INPUT__LEVEL3_FORMAT);
		createEReference(gsstcInputEClass, GSSTC_INPUT__TO_LEVEL2_EXPORT);
		createEReference(gsstcInputEClass, GSSTC_INPUT__LEVEL2_FORMAT);
		createEReference(gsstcInputEClass, GSSTC_INPUT__TO_LEVEL1_EXPORT);
		createEReference(gsstcInputEClass, GSSTC_INPUT__LEVEL1_FORMAT);
		createEReference(gsstcInputEClass, GSSTC_INPUT__TO_LEVEL0_EXPORT);
		createEReference(gsstcInputEClass, GSSTC_INPUT__LEVEL0_FORMAT);
		createEReference(gsstcInputEClass, GSSTC_INPUT__GSS_FIELDS);

		gsstcInputFieldEClass = createEClass(GSSTC_INPUT_FIELD);
		createEReference(gsstcInputFieldEClass, GSSTC_INPUT_FIELD__GSS_FIELD);
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
		tcPackage thetcPackage = (tcPackage)EPackage.Registry.INSTANCE.getEPackage(tcPackage.eNS_URI);
		exportPackage theexportPackage = (exportPackage)EPackage.Registry.INSTANCE.getEPackage(exportPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gsstcInputEClass.getESuperTypes().add(thetcPackage.getTMTCIFTC());
		gsstcInputFieldEClass.getESuperTypes().add(thetcPackage.getTMTCIFTCField());

		// Initialize classes, features, and operations; add parameters
		initEClass(gsstcInputEClass, GSSTCInput.class, "GSSTCInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTCInput_Levels(), ecorePackage.getEString(), "levels", null, 1, 1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCInput_To_level3_export(), theexportPackage.getGSSExportExport(), null, "to_level3_export", null, 0, 1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCInput_Level3_format(), theformatPackage.getGSSFormatFormat(), null, "level3_format", null, 0, 1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCInput_To_level2_export(), theexportPackage.getGSSExportExport(), null, "to_level2_export", null, 0, 1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCInput_Level2_format(), theformatPackage.getGSSFormatFormat(), null, "level2_format", null, 0, 1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCInput_To_level1_export(), theexportPackage.getGSSExportExport(), null, "to_level1_export", null, 0, 1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCInput_Level1_format(), theformatPackage.getGSSFormatFormat(), null, "level1_format", null, 0, 1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCInput_To_level0_export(), theexportPackage.getGSSExportExport(), null, "to_level0_export", null, 0, 1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCInput_Level0_format(), theformatPackage.getGSSFormatFormat(), null, "level0_format", null, 0, 1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCInput_GssFields(), this.getGSSTCInputField(), null, "gssFields", null, 0, -1, GSSTCInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstcInputFieldEClass, GSSTCInputField.class, "GSSTCInputField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTCInputField_GssField(), theformatPackage.getGSSFormatField(), null, "gssField", null, 1, 1, GSSTCInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tcinputPackageImpl
