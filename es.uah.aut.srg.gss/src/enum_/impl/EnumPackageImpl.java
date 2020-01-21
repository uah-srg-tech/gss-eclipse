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
package enum_.impl;

import enum_.EnumFactory;
import enum_.EnumPackage;
import enum_.TMTCIFEnum;
import enum_.TMTCIFEnumValue;

import es.uah.aut.srg.gss.filter.filterPackage;

import es.uah.aut.srg.gss.import_.importPackage;

import es.uah.aut.srg.gss.tmoutput.impl.tmoutputPackageImpl;

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
public class EnumPackageImpl extends EPackageImpl implements EnumPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmtcifEnumValueEClass = null;

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
	 * @see enum_.EnumPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumPackageImpl() {
		super(eNS_URI, EnumFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EnumPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumPackage init() {
		if (isInited) return (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);

		// Obtain or create and register package
		EnumPackageImpl theEnumPackage = (EnumPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EnumPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EnumPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		filterPackage.eINSTANCE.eClass();
		importPackage.eINSTANCE.eClass();
		tmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		tmoutputPackageImpl thetmoutputPackage = (tmoutputPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(tmoutputPackage.eNS_URI) instanceof tmoutputPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(tmoutputPackage.eNS_URI) : tmoutputPackage.eINSTANCE);

		// Create package meta-data objects
		theEnumPackage.createPackageContents();
		thetmoutputPackage.createPackageContents();

		// Initialize created meta-data
		theEnumPackage.initializePackageContents();
		thetmoutputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumPackage.eNS_URI, theEnumPackage);
		return theEnumPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFEnum() {
		return tmtcifEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFEnum_Name() {
		return (EAttribute)tmtcifEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTMTCIFEnum_Values() {
		return (EReference)tmtcifEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTMTCIFEnumValue() {
		return tmtcifEnumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFEnumValue_Name() {
		return (EAttribute)tmtcifEnumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTMTCIFEnumValue_Raw() {
		return (EAttribute)tmtcifEnumValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumFactory getEnumFactory() {
		return (EnumFactory)getEFactoryInstance();
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
		tmtcifEnumEClass = createEClass(TMTCIF_ENUM);
		createEAttribute(tmtcifEnumEClass, TMTCIF_ENUM__NAME);
		createEReference(tmtcifEnumEClass, TMTCIF_ENUM__VALUES);

		tmtcifEnumValueEClass = createEClass(TMTCIF_ENUM_VALUE);
		createEAttribute(tmtcifEnumValueEClass, TMTCIF_ENUM_VALUE__NAME);
		createEAttribute(tmtcifEnumValueEClass, TMTCIF_ENUM_VALUE__RAW);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tmtcifEnumEClass, TMTCIFEnum.class, "TMTCIFEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFEnum_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTMTCIFEnum_Values(), this.getTMTCIFEnumValue(), null, "values", null, 1, -1, TMTCIFEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tmtcifEnumValueEClass, TMTCIFEnumValue.class, "TMTCIFEnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTMTCIFEnumValue_Name(), ecorePackage.getEString(), "name", null, 1, 1, TMTCIFEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTMTCIFEnumValue_Raw(), ecorePackage.getEString(), "raw", null, 1, 1, TMTCIFEnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EnumPackageImpl
