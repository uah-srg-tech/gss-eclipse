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
package es.uah.aut.srg.gss.tmheader.impl;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.tmheader.GSSTMHeader;
import es.uah.aut.srg.gss.tmheader.GSSTMHeaderField;
import es.uah.aut.srg.gss.tmheader.tmheaderFactory;
import es.uah.aut.srg.gss.tmheader.tmheaderPackage;

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
public class tmheaderPackageImpl extends EPackageImpl implements tmheaderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsstmHeaderFieldEClass = null;

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
	 * @see es.uah.aut.srg.gss.tmheader.tmheaderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private tmheaderPackageImpl() {
		super(eNS_URI, tmheaderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link tmheaderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static tmheaderPackage init() {
		if (isInited) return (tmheaderPackage)EPackage.Registry.INSTANCE.getEPackage(tmheaderPackage.eNS_URI);

		// Obtain or create and register package
		tmheaderPackageImpl thetmheaderPackage = (tmheaderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof tmheaderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new tmheaderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		formatPackage.eINSTANCE.eClass();
		es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thetmheaderPackage.createPackageContents();

		// Initialize created meta-data
		thetmheaderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetmheaderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(tmheaderPackage.eNS_URI, thetmheaderPackage);
		return thetmheaderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTMHeader() {
		return gsstmHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMHeader_Format() {
		return (EReference)gsstmHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMHeader_GssHeaderFields() {
		return (EReference)gsstmHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTMHeaderField() {
		return gsstmHeaderFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTMHeaderField_GssHeaderField() {
		return (EReference)gsstmHeaderFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tmheaderFactory gettmheaderFactory() {
		return (tmheaderFactory)getEFactoryInstance();
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
		gsstmHeaderEClass = createEClass(GSSTM_HEADER);
		createEReference(gsstmHeaderEClass, GSSTM_HEADER__FORMAT);
		createEReference(gsstmHeaderEClass, GSSTM_HEADER__GSS_HEADER_FIELDS);

		gsstmHeaderFieldEClass = createEClass(GSSTM_HEADER_FIELD);
		createEReference(gsstmHeaderFieldEClass, GSSTM_HEADER_FIELD__GSS_HEADER_FIELD);
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
		es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage thetmheaderPackage_1 = (es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage)EPackage.Registry.INSTANCE.getEPackage(es.uah.aut.srg.tmtcif.tmheader.tmheaderPackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gsstmHeaderEClass.getESuperTypes().add(thetmheaderPackage_1.getTMTCIFTMHeader());
		gsstmHeaderFieldEClass.getESuperTypes().add(thetmheaderPackage_1.getTMTCIFTMHeaderField());

		// Initialize classes, features, and operations; add parameters
		initEClass(gsstmHeaderEClass, GSSTMHeader.class, "GSSTMHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTMHeader_Format(), theformatPackage.getGSSFormatFormat(), null, "format", null, 1, 1, GSSTMHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTMHeader_GssHeaderFields(), this.getGSSTMHeaderField(), null, "gssHeaderFields", null, 0, -1, GSSTMHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsstmHeaderFieldEClass, GSSTMHeaderField.class, "GSSTMHeaderField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSTMHeaderField_GssHeaderField(), theformatPackage.getGSSFormatField(), null, "gssHeaderField", null, 1, 1, GSSTMHeaderField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //tmheaderPackageImpl
