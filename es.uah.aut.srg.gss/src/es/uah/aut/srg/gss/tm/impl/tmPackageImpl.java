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
package es.uah.aut.srg.gss.tm.impl;

import es.uah.aut.srg.gss.filter.filterPackage;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.import_.importPackage;

import es.uah.aut.srg.gss.tm.GSSTMField;
import es.uah.aut.srg.gss.tm.GSSTMPi1;
import es.uah.aut.srg.gss.tm.tmFactory;
import es.uah.aut.srg.gss.tm.tmPackage;

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
public class tmPackageImpl extends EPackageImpl implements tmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmPi1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmFieldEClass = null;

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
	 * @see es.uah.aut.srg.gss.tm.tmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tmPackageImpl() {
		super(eNS_URI, tmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tmPackage init() {
		if (isInited) return (tmPackage)EPackage.Registry.INSTANCE.getEPackage(tmPackage.eNS_URI);

		// Obtain or create and register package
		tmPackageImpl thetmPackage = (tmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		filterPackage.eINSTANCE.eClass();
		importPackage.eINSTANCE.eClass();
		es.uah.aut.srg.tmtcif.tm.tmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetmPackage.createPackageContents();

		// Initialize created meta-data
		thetmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tmPackage.eNS_URI, thetmPackage);
		return thetmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTM() {
		return gsstmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTM_Levels() {
		return (EAttribute)gsstmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_Level3_filter() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_Level3_format() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_From_level2_import() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_Level2_filter() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_Level2_format() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_From_level1_import() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_Level1_filter() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_Level1_format() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_From_level0_import() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_Level0_filter() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_Level0_format() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_GssPi1() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTM_GssFields() {
		return (EReference)gsstmEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTMPi1() {
		return gsstmPi1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMPi1_GssField() {
		return (EReference)gsstmPi1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTMField() {
		return gsstmFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMField_GssField() {
		return (EReference)gsstmFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmFactory gettmFactory() {
		return (tmFactory)getEFactoryInstance();
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
		gsstmEClass = createEClass(GSSTM);
		createEAttribute(gsstmEClass, GSSTM__LEVELS);
		createEReference(gsstmEClass, GSSTM__LEVEL3_FILTER);
		createEReference(gsstmEClass, GSSTM__LEVEL3_FORMAT);
		createEReference(gsstmEClass, GSSTM__FROM_LEVEL2_IMPORT);
		createEReference(gsstmEClass, GSSTM__LEVEL2_FILTER);
		createEReference(gsstmEClass, GSSTM__LEVEL2_FORMAT);
		createEReference(gsstmEClass, GSSTM__FROM_LEVEL1_IMPORT);
		createEReference(gsstmEClass, GSSTM__LEVEL1_FILTER);
		createEReference(gsstmEClass, GSSTM__LEVEL1_FORMAT);
		createEReference(gsstmEClass, GSSTM__FROM_LEVEL0_IMPORT);
		createEReference(gsstmEClass, GSSTM__LEVEL0_FILTER);
		createEReference(gsstmEClass, GSSTM__LEVEL0_FORMAT);
		createEReference(gsstmEClass, GSSTM__GSS_PI1);
		createEReference(gsstmEClass, GSSTM__GSS_FIELDS);

		gsstmPi1EClass = createEClass(GSSTM_PI1);
		createEReference(gsstmPi1EClass, GSSTM_PI1__GSS_FIELD);

		gsstmFieldEClass = createEClass(GSSTM_FIELD);
		createEReference(gsstmFieldEClass, GSSTM_FIELD__GSS_FIELD);
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
		es.uah.aut.srg.tmtcif.tm.tmPackage thetmPackage_1 = (es.uah.aut.srg.tmtcif.tm.tmPackage)EPackage.Registry.INSTANCE.getEPackage(es.uah.aut.srg.tmtcif.tm.tmPackage.eNS_URI);
		filterPackage thefilterPackage = (filterPackage)EPackage.Registry.INSTANCE.getEPackage(filterPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);
		importPackage theimportPackage = (importPackage)EPackage.Registry.INSTANCE.getEPackage(importPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gsstmEClass.getESuperTypes().add(thetmPackage_1.getTMTCIFTM());
		gsstmPi1EClass.getESuperTypes().add(thetmPackage_1.getTMTCIFPI1());
		gsstmFieldEClass.getESuperTypes().add(thetmPackage_1.getTMTCIFTMField());

		// Initialize classes, features, and operations; add parameters
		initEClass(gsstmEClass, es.uah.aut.srg.gss.tm.GSSTM.class, "GSSTM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTM_Levels(), ecorePackage.getEString(), "levels", null, 1, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_Level3_filter(), thefilterPackage.getGSSFilterFilter(), null, "level3_filter", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_Level3_format(), theformatPackage.getGSSFormatFormat(), null, "level3_format", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_From_level2_import(), theimportPackage.getGSSImportImport(), null, "from_level2_import", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_Level2_filter(), thefilterPackage.getGSSFilterFilter(), null, "level2_filter", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_Level2_format(), theformatPackage.getGSSFormatFormat(), null, "level2_format", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_From_level1_import(), theimportPackage.getGSSImportImport(), null, "from_level1_import", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_Level1_filter(), thefilterPackage.getGSSFilterFilter(), null, "level1_filter", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_Level1_format(), theformatPackage.getGSSFormatFormat(), null, "level1_format", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_From_level0_import(), theimportPackage.getGSSImportImport(), null, "from_level0_import", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_Level0_filter(), thefilterPackage.getGSSFilterFilter(), null, "level0_filter", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_Level0_format(), theformatPackage.getGSSFormatFormat(), null, "level0_format", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_GssPi1(), this.getGSSTMPi1(), null, "gssPi1", null, 0, 1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTM_GssFields(), this.getGSSTMField(), null, "gssFields", null, 0, -1, es.uah.aut.srg.gss.tm.GSSTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstmPi1EClass, GSSTMPi1.class, "GSSTMPi1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTMPi1_GssField(), theformatPackage.getGSSFormatField(), null, "gssField", null, 1, 1, GSSTMPi1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstmFieldEClass, GSSTMField.class, "GSSTMField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTMField_GssField(), theformatPackage.getGSSFormatField(), null, "gssField", null, 1, 1, GSSTMField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tmPackageImpl
