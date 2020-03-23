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
package es.uah.aut.srg.gss.tcheader.impl;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.tcheader.GSSTCHeader;
import es.uah.aut.srg.gss.tcheader.GSSTCHeaderField;
import es.uah.aut.srg.gss.tcheader.tcheaderFactory;
import es.uah.aut.srg.gss.tcheader.tcheaderPackage;

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
public class tcheaderPackageImpl extends EPackageImpl implements tcheaderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstcHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstcHeaderFieldEClass = null;

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
	 * @see es.uah.aut.srg.gss.tcheader.tcheaderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tcheaderPackageImpl() {
		super(eNS_URI, tcheaderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tcheaderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tcheaderPackage init() {
		if (isInited) return (tcheaderPackage)EPackage.Registry.INSTANCE.getEPackage(tcheaderPackage.eNS_URI);

		// Obtain or create and register package
		tcheaderPackageImpl thetcheaderPackage = (tcheaderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tcheaderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tcheaderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		formatPackage.eINSTANCE.eClass();
		es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetcheaderPackage.createPackageContents();

		// Initialize created meta-data
		thetcheaderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetcheaderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tcheaderPackage.eNS_URI, thetcheaderPackage);
		return thetcheaderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTCHeader() {
		return gsstcHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCHeader_Format() {
		return (EReference)gsstcHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCHeader_GssHeaderFields() {
		return (EReference)gsstcHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTCHeaderField() {
		return gsstcHeaderFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTCHeaderField_GssHeaderField() {
		return (EReference)gsstcHeaderFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcheaderFactory gettcheaderFactory() {
		return (tcheaderFactory)getEFactoryInstance();
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
		gsstcHeaderEClass = createEClass(GSSTC_HEADER);
		createEReference(gsstcHeaderEClass, GSSTC_HEADER__FORMAT);
		createEReference(gsstcHeaderEClass, GSSTC_HEADER__GSS_HEADER_FIELDS);

		gsstcHeaderFieldEClass = createEClass(GSSTC_HEADER_FIELD);
		createEReference(gsstcHeaderFieldEClass, GSSTC_HEADER_FIELD__GSS_HEADER_FIELD);
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
		es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage thetcheaderPackage_1 = (es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage)EPackage.Registry.INSTANCE.getEPackage(es.uah.aut.srg.tmtcif.tcheader.tcheaderPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gsstcHeaderEClass.getESuperTypes().add(thetcheaderPackage_1.getTMTCIFTCHeader());
		gsstcHeaderFieldEClass.getESuperTypes().add(thetcheaderPackage_1.getTMTCIFTCHeaderField());

		// Initialize classes, features, and operations; add parameters
		initEClass(gsstcHeaderEClass, GSSTCHeader.class, "GSSTCHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTCHeader_Format(), theformatPackage.getGSSFormatFormat(), null, "format", null, 1, 1, GSSTCHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTCHeader_GssHeaderFields(), this.getGSSTCHeaderField(), null, "gssHeaderFields", null, 0, -1, GSSTCHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstcHeaderFieldEClass, GSSTCHeaderField.class, "GSSTCHeaderField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTCHeaderField_GssHeaderField(), theformatPackage.getGSSFormatField(), null, "gssHeaderField", null, 1, 1, GSSTCHeaderField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tcheaderPackageImpl
