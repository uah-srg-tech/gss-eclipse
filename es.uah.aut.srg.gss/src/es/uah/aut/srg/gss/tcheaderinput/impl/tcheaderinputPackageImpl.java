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
package es.uah.aut.srg.gss.tcheaderinput.impl;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput;
import es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField;
import es.uah.aut.srg.gss.tcheaderinput.tcheaderinputFactory;
import es.uah.aut.srg.gss.tcheaderinput.tcheaderinputPackage;

import es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage;

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
public class tcheaderinputPackageImpl extends EPackageImpl implements tcheaderinputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstcHeaderInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstcHeaderInputFieldEClass = null;

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
	 * @see es.uah.aut.srg.gss.tcheaderinput.tcheaderinputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tcheaderinputPackageImpl() {
		super(eNS_URI, tcheaderinputFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tcheaderinputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tcheaderinputPackage init() {
		if (isInited) return (tcheaderinputPackage)EPackage.Registry.INSTANCE.getEPackage(tcheaderinputPackage.eNS_URI);

		// Obtain or create and register package
		tcheaderinputPackageImpl thetcheaderinputPackage = (tcheaderinputPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tcheaderinputPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tcheaderinputPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		formatPackage.eINSTANCE.eClass();
		tcheaderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetcheaderinputPackage.createPackageContents();

		// Initialize created meta-data
		thetcheaderinputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetcheaderinputPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tcheaderinputPackage.eNS_URI, thetcheaderinputPackage);
		return thetcheaderinputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTCHeaderInput() {
		return gsstcHeaderInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCHeaderInput_Format() {
		return (EReference)gsstcHeaderInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCHeaderInput_GssHeaderFields() {
		return (EReference)gsstcHeaderInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTCHeaderInputField() {
		return gsstcHeaderInputFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCHeaderInputField_GssHeaderField() {
		return (EReference)gsstcHeaderInputFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcheaderinputFactory gettcheaderinputFactory() {
		return (tcheaderinputFactory)getEFactoryInstance();
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
		gsstcHeaderInputEClass = createEClass(GSSTC_HEADER_INPUT);
		createEReference(gsstcHeaderInputEClass, GSSTC_HEADER_INPUT__FORMAT);
		createEReference(gsstcHeaderInputEClass, GSSTC_HEADER_INPUT__GSS_HEADER_FIELDS);

		gsstcHeaderInputFieldEClass = createEClass(GSSTC_HEADER_INPUT_FIELD);
		createEReference(gsstcHeaderInputFieldEClass, GSSTC_HEADER_INPUT_FIELD__GSS_HEADER_FIELD);
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
		tcheaderPackage thetcheaderPackage = (tcheaderPackage)EPackage.Registry.INSTANCE.getEPackage(tcheaderPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gsstcHeaderInputEClass.getESuperTypes().add(thetcheaderPackage.getTMTCIFTCHeader());
		gsstcHeaderInputFieldEClass.getESuperTypes().add(thetcheaderPackage.getTMTCIFTCHeaderField());

		// Initialize classes, features, and operations; add parameters
		initEClass(gsstcHeaderInputEClass, GSSTCHeaderInput.class, "GSSTCHeaderInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTCHeaderInput_Format(), theformatPackage.getGSSFormatFormat(), null, "format", null, 1, 1, GSSTCHeaderInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCHeaderInput_GssHeaderFields(), this.getGSSTCHeaderInputField(), null, "gssHeaderFields", null, 0, -1, GSSTCHeaderInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstcHeaderInputFieldEClass, GSSTCHeaderInputField.class, "GSSTCHeaderInputField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTCHeaderInputField_GssHeaderField(), theformatPackage.getGSSFormatField(), null, "gssHeaderField", null, 1, 1, GSSTCHeaderInputField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tcheaderinputPackageImpl
