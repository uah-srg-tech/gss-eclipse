/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.charts.impl;

import es.uah.aut.srg.gss.charts.GSSChartsChart;
import es.uah.aut.srg.gss.charts.GSSChartsCharts;
import es.uah.aut.srg.gss.charts.GSSChartsYUnits;
import es.uah.aut.srg.gss.charts.chartsFactory;
import es.uah.aut.srg.gss.charts.chartsPackage;

import es.uah.aut.srg.gss.common.commonPackage;

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
public class chartsPackageImpl extends EPackageImpl implements chartsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssChartsChartsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssChartsChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssChartsYUnitsEEnum = null;

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
	 * @see es.uah.aut.srg.gss.charts.chartsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private chartsPackageImpl() {
		super(eNS_URI, chartsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link chartsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static chartsPackage init() {
		if (isInited) return (chartsPackage)EPackage.Registry.INSTANCE.getEPackage(chartsPackage.eNS_URI);

		// Obtain or create and register package
		chartsPackageImpl thechartsPackage = (chartsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof chartsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new chartsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thechartsPackage.createPackageContents();

		// Initialize created meta-data
		thechartsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thechartsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(chartsPackage.eNS_URI, thechartsPackage);
		return thechartsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSChartsCharts() {
		return gssChartsChartsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSChartsCharts_Chart() {
		return (EReference)gssChartsChartsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSChartsChart() {
		return gssChartsChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSChartsChart_Id() {
		return (EAttribute)gssChartsChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSChartsChart_Name() {
		return (EAttribute)gssChartsChartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSChartsChart_Y_units() {
		return (EAttribute)gssChartsChartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSChartsChart_Y_max() {
		return (EAttribute)gssChartsChartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSChartsYUnits() {
		return gssChartsYUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public chartsFactory getchartsFactory() {
		return (chartsFactory)getEFactoryInstance();
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
		gssChartsChartsEClass = createEClass(GSS_CHARTS_CHARTS);
		createEReference(gssChartsChartsEClass, GSS_CHARTS_CHARTS__CHART);

		gssChartsChartEClass = createEClass(GSS_CHARTS_CHART);
		createEAttribute(gssChartsChartEClass, GSS_CHARTS_CHART__ID);
		createEAttribute(gssChartsChartEClass, GSS_CHARTS_CHART__NAME);
		createEAttribute(gssChartsChartEClass, GSS_CHARTS_CHART__YUNITS);
		createEAttribute(gssChartsChartEClass, GSS_CHARTS_CHART__YMAX);

		// Create enums
		gssChartsYUnitsEEnum = createEEnum(GSS_CHARTS_YUNITS);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssChartsChartsEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssChartsChartsEClass, GSSChartsCharts.class, "GSSChartsCharts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSChartsCharts_Chart(), this.getGSSChartsChart(), null, "Chart", null, 1, 5, GSSChartsCharts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssChartsChartEClass, GSSChartsChart.class, "GSSChartsChart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSChartsChart_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSChartsChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSChartsChart_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSChartsChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSChartsChart_Y_units(), this.getGSSChartsYUnits(), "y_units", null, 1, 1, GSSChartsChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSChartsChart_Y_max(), ecorePackage.getEString(), "y_max", null, 1, 1, GSSChartsChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssChartsYUnitsEEnum, GSSChartsYUnits.class, "GSSChartsYUnits");
		addEEnumLiteral(gssChartsYUnitsEEnum, GSSChartsYUnits.VOLTS);
		addEEnumLiteral(gssChartsYUnitsEEnum, GSSChartsYUnits.AMPS);

		// Create resource
		createResource(eNS_URI);
	}

} //chartsPackageImpl
