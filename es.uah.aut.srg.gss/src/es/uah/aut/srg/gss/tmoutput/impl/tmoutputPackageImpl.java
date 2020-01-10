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
package es.uah.aut.srg.gss.tmoutput.impl;

import es.uah.aut.srg.gss.filter.filterPackage;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.import_.importPackage;

import es.uah.aut.srg.gss.tmoutput.GSSTMOutput;
import es.uah.aut.srg.gss.tmoutput.GSSTMOutputField;
import es.uah.aut.srg.gss.tmoutput.GSSTMOutputPi1;
import es.uah.aut.srg.gss.tmoutput.tmoutputFactory;
import es.uah.aut.srg.gss.tmoutput.tmoutputPackage;

import es.uah.aut.srg.tmtcif.tm.tmPackage;

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
public class tmoutputPackageImpl extends EPackageImpl implements tmoutputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmOutputPi1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmOutputFieldEClass = null;

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
	 * @see es.uah.aut.srg.gss.tmoutput.tmoutputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tmoutputPackageImpl() {
		super(eNS_URI, tmoutputFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tmoutputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tmoutputPackage init() {
		if (isInited) return (tmoutputPackage)EPackage.Registry.INSTANCE.getEPackage(tmoutputPackage.eNS_URI);

		// Obtain or create and register package
		tmoutputPackageImpl thetmoutputPackage = (tmoutputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tmoutputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tmoutputPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		filterPackage.eINSTANCE.eClass();
		importPackage.eINSTANCE.eClass();
		tmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetmoutputPackage.createPackageContents();

		// Initialize created meta-data
		thetmoutputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetmoutputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tmoutputPackage.eNS_URI, thetmoutputPackage);
		return thetmoutputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTMOutput() {
		return gsstmOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTMOutput_Levels() {
		return (EAttribute)gsstmOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_Level3_filter() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_Level3_format() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_From_level2_import() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_Level2_filter() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_Level2_format() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_From_level1_import() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_Level1_filter() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_Level1_format() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_From_level0_import() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_Level0_filter() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_Level0_format() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_GssPi1() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutput_GssFields() {
		return (EReference)gsstmOutputEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTMOutputPi1() {
		return gsstmOutputPi1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutputPi1_GssField() {
		return (EReference)gsstmOutputPi1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTMOutputField() {
		return gsstmOutputFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMOutputField_GssField() {
		return (EReference)gsstmOutputFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmoutputFactory gettmoutputFactory() {
		return (tmoutputFactory)getEFactoryInstance();
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
		gsstmOutputEClass = createEClass(GSSTM_OUTPUT);
		createEAttribute(gsstmOutputEClass, GSSTM_OUTPUT__LEVELS);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__LEVEL3_FILTER);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__LEVEL3_FORMAT);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__FROM_LEVEL2_IMPORT);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__LEVEL2_FILTER);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__LEVEL2_FORMAT);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__FROM_LEVEL1_IMPORT);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__LEVEL1_FILTER);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__LEVEL1_FORMAT);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__FROM_LEVEL0_IMPORT);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__LEVEL0_FILTER);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__LEVEL0_FORMAT);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__GSS_PI1);
		createEReference(gsstmOutputEClass, GSSTM_OUTPUT__GSS_FIELDS);

		gsstmOutputPi1EClass = createEClass(GSSTM_OUTPUT_PI1);
		createEReference(gsstmOutputPi1EClass, GSSTM_OUTPUT_PI1__GSS_FIELD);

		gsstmOutputFieldEClass = createEClass(GSSTM_OUTPUT_FIELD);
		createEReference(gsstmOutputFieldEClass, GSSTM_OUTPUT_FIELD__GSS_FIELD);
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
		tmPackage thetmPackage = (tmPackage)EPackage.Registry.INSTANCE.getEPackage(tmPackage.eNS_URI);
		filterPackage thefilterPackage = (filterPackage)EPackage.Registry.INSTANCE.getEPackage(filterPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);
		importPackage theimportPackage = (importPackage)EPackage.Registry.INSTANCE.getEPackage(importPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gsstmOutputEClass.getESuperTypes().add(thetmPackage.getTMTCIFTM());
		gsstmOutputPi1EClass.getESuperTypes().add(thetmPackage.getTMTCIFPI1());
		gsstmOutputFieldEClass.getESuperTypes().add(thetmPackage.getTMTCIFTMField());

		// Initialize classes, features, and operations; add parameters
		initEClass(gsstmOutputEClass, GSSTMOutput.class, "GSSTMOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTMOutput_Levels(), ecorePackage.getEString(), "levels", null, 1, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_Level3_filter(), thefilterPackage.getGSSFilterFilter(), null, "level3_filter", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_Level3_format(), theformatPackage.getGSSFormatFormat(), null, "level3_format", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_From_level2_import(), theimportPackage.getGSSImportImport(), null, "from_level2_import", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_Level2_filter(), thefilterPackage.getGSSFilterFilter(), null, "level2_filter", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_Level2_format(), theformatPackage.getGSSFormatFormat(), null, "level2_format", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_From_level1_import(), theimportPackage.getGSSImportImport(), null, "from_level1_import", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_Level1_filter(), thefilterPackage.getGSSFilterFilter(), null, "level1_filter", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_Level1_format(), theformatPackage.getGSSFormatFormat(), null, "level1_format", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_From_level0_import(), theimportPackage.getGSSImportImport(), null, "from_level0_import", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_Level0_filter(), thefilterPackage.getGSSFilterFilter(), null, "level0_filter", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_Level0_format(), theformatPackage.getGSSFormatFormat(), null, "level0_format", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_GssPi1(), this.getGSSTMOutputPi1(), null, "gssPi1", null, 0, 1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMOutput_GssFields(), this.getGSSTMOutputField(), null, "gssFields", null, 0, -1, GSSTMOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstmOutputPi1EClass, GSSTMOutputPi1.class, "GSSTMOutputPi1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTMOutputPi1_GssField(), theformatPackage.getGSSFormatField(), null, "gssField", null, 1, 1, GSSTMOutputPi1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstmOutputFieldEClass, GSSTMOutputField.class, "GSSTMOutputField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTMOutputField_GssField(), theformatPackage.getGSSFormatField(), null, "gssField", null, 1, 1, GSSTMOutputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tmoutputPackageImpl
