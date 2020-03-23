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
package es.uah.aut.srg.gss.import_.impl;

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.import_.GSSImportDataSource;
import es.uah.aut.srg.gss.import_.GSSImportImport;
import es.uah.aut.srg.gss.import_.GSSImportUnit;
import es.uah.aut.srg.gss.import_.GSSImportVirtualSize;
import es.uah.aut.srg.gss.import_.importFactory;
import es.uah.aut.srg.gss.import_.importPackage;

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
public class importPackageImpl extends EPackageImpl implements importPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssImportImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssImportDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssImportVirtualSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssImportUnitEEnum = null;

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
	 * @see es.uah.aut.srg.gss.import_.importPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private importPackageImpl() {
		super(eNS_URI, importFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link importPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static importPackage init() {
		if (isInited) return (importPackage)EPackage.Registry.INSTANCE.getEPackage(importPackage.eNS_URI);

		// Obtain or create and register package
		importPackageImpl theimportPackage = (importPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof importPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new importPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		formatPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theimportPackage.createPackageContents();

		// Initialize created meta-data
		theimportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theimportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(importPackage.eNS_URI, theimportPackage);
		return theimportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSImportImport() {
		return gssImportImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSImportImport_From() {
		return (EReference)gssImportImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSImportImport_To() {
		return (EReference)gssImportImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSImportImport_DataSource() {
		return (EReference)gssImportImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSImportImport_VirtualSize() {
		return (EReference)gssImportImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSImportDataSource() {
		return gssImportDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSImportDataSource_FieldRef() {
		return (EReference)gssImportDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSImportDataSource_LeftTrim() {
		return (EAttribute)gssImportDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSImportDataSource_RightTrim() {
		return (EAttribute)gssImportDataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSImportVirtualSize() {
		return gssImportVirtualSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSImportVirtualSize_FieldRef() {
		return (EReference)gssImportVirtualSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSImportVirtualSize_To() {
		return (EReference)gssImportVirtualSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSImportVirtualSize_AddSize() {
		return (EAttribute)gssImportVirtualSizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSImportVirtualSize_Unit() {
		return (EAttribute)gssImportVirtualSizeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSImportUnit() {
		return gssImportUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public importFactory getimportFactory() {
		return (importFactory)getEFactoryInstance();
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
		gssImportImportEClass = createEClass(GSS_IMPORT_IMPORT);
		createEReference(gssImportImportEClass, GSS_IMPORT_IMPORT__FROM);
		createEReference(gssImportImportEClass, GSS_IMPORT_IMPORT__TO);
		createEReference(gssImportImportEClass, GSS_IMPORT_IMPORT__DATA_SOURCE);
		createEReference(gssImportImportEClass, GSS_IMPORT_IMPORT__VIRTUAL_SIZE);

		gssImportDataSourceEClass = createEClass(GSS_IMPORT_DATA_SOURCE);
		createEReference(gssImportDataSourceEClass, GSS_IMPORT_DATA_SOURCE__FIELD_REF);
		createEAttribute(gssImportDataSourceEClass, GSS_IMPORT_DATA_SOURCE__LEFT_TRIM);
		createEAttribute(gssImportDataSourceEClass, GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM);

		gssImportVirtualSizeEClass = createEClass(GSS_IMPORT_VIRTUAL_SIZE);
		createEReference(gssImportVirtualSizeEClass, GSS_IMPORT_VIRTUAL_SIZE__FIELD_REF);
		createEReference(gssImportVirtualSizeEClass, GSS_IMPORT_VIRTUAL_SIZE__TO);
		createEAttribute(gssImportVirtualSizeEClass, GSS_IMPORT_VIRTUAL_SIZE__ADD_SIZE);
		createEAttribute(gssImportVirtualSizeEClass, GSS_IMPORT_VIRTUAL_SIZE__UNIT);

		// Create enums
		gssImportUnitEEnum = createEEnum(GSS_IMPORT_UNIT);
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
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssImportImportEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssImportImportEClass, GSSImportImport.class, "GSSImportImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSImportImport_From(), theformatPackage.getGSSFormatFormat(), null, "from", null, 1, 1, GSSImportImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSImportImport_To(), theformatPackage.getGSSFormatFormat(), null, "to", null, 0, 1, GSSImportImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSImportImport_DataSource(), this.getGSSImportDataSource(), null, "dataSource", null, 1, -1, GSSImportImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSImportImport_VirtualSize(), this.getGSSImportVirtualSize(), null, "virtualSize", null, 0, 1, GSSImportImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssImportDataSourceEClass, GSSImportDataSource.class, "GSSImportDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSImportDataSource_FieldRef(), theformatPackage.getGSSFormatField(), null, "FieldRef", null, 1, 1, GSSImportDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSImportDataSource_LeftTrim(), ecorePackage.getEString(), "leftTrim", null, 1, 1, GSSImportDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSImportDataSource_RightTrim(), ecorePackage.getEString(), "rightTrim", null, 1, 1, GSSImportDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssImportVirtualSizeEClass, GSSImportVirtualSize.class, "GSSImportVirtualSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSImportVirtualSize_FieldRef(), theformatPackage.getGSSFormatField(), null, "FieldRef", null, 1, 1, GSSImportVirtualSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSImportVirtualSize_To(), theformatPackage.getGSSFormatField(), null, "to", null, 1, 1, GSSImportVirtualSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSImportVirtualSize_AddSize(), ecorePackage.getEString(), "addSize", null, 0, 1, GSSImportVirtualSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSImportVirtualSize_Unit(), this.getGSSImportUnit(), "unit", null, 0, 1, GSSImportVirtualSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssImportUnitEEnum, GSSImportUnit.class, "GSSImportUnit");
		addEEnumLiteral(gssImportUnitEEnum, GSSImportUnit.BITS);
		addEEnumLiteral(gssImportUnitEEnum, GSSImportUnit.BYTES);

		// Create resource
		createResource(eNS_URI);
	}

} //importPackageImpl
