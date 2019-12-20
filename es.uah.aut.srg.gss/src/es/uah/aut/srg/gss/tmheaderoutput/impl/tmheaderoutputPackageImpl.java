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
package es.uah.aut.srg.gss.tmheaderoutput.impl;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutput;
import es.uah.aut.srg.gss.tmheaderoutput.GSSTMHeaderOutputField;
import es.uah.aut.srg.gss.tmheaderoutput.tmheaderoutputFactory;
import es.uah.aut.srg.gss.tmheaderoutput.tmheaderoutputPackage;

import es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage;

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
public class tmheaderoutputPackageImpl extends EPackageImpl implements tmheaderoutputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmHeaderOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmHeaderOutputFieldEClass = null;

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
	 * @see es.uah.aut.srg.gss.tmheaderoutput.tmheaderoutputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tmheaderoutputPackageImpl() {
		super(eNS_URI, tmheaderoutputFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tmheaderoutputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tmheaderoutputPackage init() {
		if (isInited) return (tmheaderoutputPackage)EPackage.Registry.INSTANCE.getEPackage(tmheaderoutputPackage.eNS_URI);

		// Obtain or create and register package
		tmheaderoutputPackageImpl thetmheaderoutputPackage = (tmheaderoutputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tmheaderoutputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tmheaderoutputPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		formatPackage.eINSTANCE.eClass();
		tmheaderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetmheaderoutputPackage.createPackageContents();

		// Initialize created meta-data
		thetmheaderoutputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetmheaderoutputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tmheaderoutputPackage.eNS_URI, thetmheaderoutputPackage);
		return thetmheaderoutputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTMHeaderOutput() {
		return gsstmHeaderOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMHeaderOutput_Format() {
		return (EReference)gsstmHeaderOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMHeaderOutput_GssHeaderFields() {
		return (EReference)gsstmHeaderOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTMHeaderOutputField() {
		return gsstmHeaderOutputFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMHeaderOutputField_GssHeaderField() {
		return (EReference)gsstmHeaderOutputFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmheaderoutputFactory gettmheaderoutputFactory() {
		return (tmheaderoutputFactory)getEFactoryInstance();
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
		gsstmHeaderOutputEClass = createEClass(GSSTM_HEADER_OUTPUT);
		createEReference(gsstmHeaderOutputEClass, GSSTM_HEADER_OUTPUT__FORMAT);
		createEReference(gsstmHeaderOutputEClass, GSSTM_HEADER_OUTPUT__GSS_HEADER_FIELDS);

		gsstmHeaderOutputFieldEClass = createEClass(GSSTM_HEADER_OUTPUT_FIELD);
		createEReference(gsstmHeaderOutputFieldEClass, GSSTM_HEADER_OUTPUT_FIELD__GSS_HEADER_FIELD);
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
		tmheaderPackage thetmheaderPackage = (tmheaderPackage)EPackage.Registry.INSTANCE.getEPackage(tmheaderPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gsstmHeaderOutputEClass.getESuperTypes().add(thetmheaderPackage.getTMTCIFTMHeader());
		gsstmHeaderOutputFieldEClass.getESuperTypes().add(thetmheaderPackage.getTMTCIFTMHeaderField());

		// Initialize classes, features, and operations; add parameters
		initEClass(gsstmHeaderOutputEClass, GSSTMHeaderOutput.class, "GSSTMHeaderOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTMHeaderOutput_Format(), theformatPackage.getGSSFormatFormat(), null, "format", null, 1, 1, GSSTMHeaderOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMHeaderOutput_GssHeaderFields(), this.getGSSTMHeaderOutputField(), null, "gssHeaderFields", null, 0, -1, GSSTMHeaderOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstmHeaderOutputFieldEClass, GSSTMHeaderOutputField.class, "GSSTMHeaderOutputField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTMHeaderOutputField_GssHeaderField(), theformatPackage.getGSSFormatField(), null, "gssHeaderField", null, 1, 1, GSSTMHeaderOutputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tmheaderoutputPackageImpl
