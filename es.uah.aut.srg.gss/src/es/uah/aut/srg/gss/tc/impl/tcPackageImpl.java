/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.tc.impl;

import es.uah.aut.srg.gss.export.exportPackage;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.tc.GSSTCField;
import es.uah.aut.srg.gss.tc.tcFactory;
import es.uah.aut.srg.gss.tc.tcPackage;

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
public class tcPackageImpl extends EPackageImpl implements tcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstcFieldEClass = null;

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
	 * @see es.uah.aut.srg.gss.tc.tcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tcPackageImpl() {
		super(eNS_URI, tcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tcPackage init() {
		if (isInited) return (tcPackage)EPackage.Registry.INSTANCE.getEPackage(tcPackage.eNS_URI);

		// Obtain or create and register package
		tcPackageImpl thetcPackage = (tcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tcPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		exportPackage.eINSTANCE.eClass();
		es.uah.aut.srg.tmtcif.tc.tcPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetcPackage.createPackageContents();

		// Initialize created meta-data
		thetcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetcPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tcPackage.eNS_URI, thetcPackage);
		return thetcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTC() {
		return gsstcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTC_Levels() {
		return (EAttribute)gsstcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTC_To_level3_export() {
		return (EReference)gsstcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTC_Level3_format() {
		return (EReference)gsstcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTC_To_level2_export() {
		return (EReference)gsstcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTC_Level2_format() {
		return (EReference)gsstcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTC_To_level1_export() {
		return (EReference)gsstcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTC_Level1_format() {
		return (EReference)gsstcEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTC_To_level0_export() {
		return (EReference)gsstcEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTC_Level0_format() {
		return (EReference)gsstcEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTC_GssFields() {
		return (EReference)gsstcEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTCField() {
		return gsstcFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCField_GssField() {
		return (EReference)gsstcFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcFactory gettcFactory() {
		return (tcFactory)getEFactoryInstance();
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
		gsstcEClass = createEClass(GSSTC);
		createEAttribute(gsstcEClass, GSSTC__LEVELS);
		createEReference(gsstcEClass, GSSTC__TO_LEVEL3_EXPORT);
		createEReference(gsstcEClass, GSSTC__LEVEL3_FORMAT);
		createEReference(gsstcEClass, GSSTC__TO_LEVEL2_EXPORT);
		createEReference(gsstcEClass, GSSTC__LEVEL2_FORMAT);
		createEReference(gsstcEClass, GSSTC__TO_LEVEL1_EXPORT);
		createEReference(gsstcEClass, GSSTC__LEVEL1_FORMAT);
		createEReference(gsstcEClass, GSSTC__TO_LEVEL0_EXPORT);
		createEReference(gsstcEClass, GSSTC__LEVEL0_FORMAT);
		createEReference(gsstcEClass, GSSTC__GSS_FIELDS);

		gsstcFieldEClass = createEClass(GSSTC_FIELD);
		createEReference(gsstcFieldEClass, GSSTC_FIELD__GSS_FIELD);
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
		es.uah.aut.srg.tmtcif.tc.tcPackage thetcPackage_1 = (es.uah.aut.srg.tmtcif.tc.tcPackage)EPackage.Registry.INSTANCE.getEPackage(es.uah.aut.srg.tmtcif.tc.tcPackage.eNS_URI);
		exportPackage theexportPackage = (exportPackage)EPackage.Registry.INSTANCE.getEPackage(exportPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gsstcEClass.getESuperTypes().add(thetcPackage_1.getTMTCIFTC());
		gsstcFieldEClass.getESuperTypes().add(thetcPackage_1.getTMTCIFTCField());

		// Initialize classes, features, and operations; add parameters
		initEClass(gsstcEClass, es.uah.aut.srg.gss.tc.GSSTC.class, "GSSTC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTC_Levels(), ecorePackage.getEString(), "levels", null, 1, 1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTC_To_level3_export(), theexportPackage.getGSSExportExport(), null, "to_level3_export", null, 0, 1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTC_Level3_format(), theformatPackage.getGSSFormatFormat(), null, "level3_format", null, 0, 1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTC_To_level2_export(), theexportPackage.getGSSExportExport(), null, "to_level2_export", null, 0, 1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTC_Level2_format(), theformatPackage.getGSSFormatFormat(), null, "level2_format", null, 0, 1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTC_To_level1_export(), theexportPackage.getGSSExportExport(), null, "to_level1_export", null, 0, 1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTC_Level1_format(), theformatPackage.getGSSFormatFormat(), null, "level1_format", null, 0, 1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTC_To_level0_export(), theexportPackage.getGSSExportExport(), null, "to_level0_export", null, 0, 1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTC_Level0_format(), theformatPackage.getGSSFormatFormat(), null, "level0_format", null, 0, 1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTC_GssFields(), this.getGSSTCField(), null, "gssFields", null, 0, -1, es.uah.aut.srg.gss.tc.GSSTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstcFieldEClass, GSSTCField.class, "GSSTCField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTCField_GssField(), theformatPackage.getGSSFormatField(), null, "gssField", null, 1, 1, GSSTCField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tcPackageImpl
