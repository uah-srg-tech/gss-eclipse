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
package es.uah.aut.srg.gss.charts;

import es.uah.aut.srg.gss.common.commonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.charts.chartsFactory
 * @model kind="package"
 * @generated
 */
public interface chartsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "charts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/charts";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	chartsPackage eINSTANCE = es.uah.aut.srg.gss.charts.impl.chartsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.charts.impl.GSSChartsChartsImpl <em>GSS Charts Charts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.charts.impl.GSSChartsChartsImpl
	 * @see es.uah.aut.srg.gss.charts.impl.chartsPackageImpl#getGSSChartsCharts()
	 * @generated
	 */
	int GSS_CHARTS_CHARTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHARTS__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHARTS__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHARTS__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHARTS__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHARTS__CHART = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Charts Charts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHARTS_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Charts Charts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHARTS_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.charts.impl.GSSChartsChartImpl <em>GSS Charts Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.charts.impl.GSSChartsChartImpl
	 * @see es.uah.aut.srg.gss.charts.impl.chartsPackageImpl#getGSSChartsChart()
	 * @generated
	 */
	int GSS_CHARTS_CHART = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHART__NAME = commonPackage.GSS_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHART__DESCRIPTION = commonPackage.GSS_MODEL_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHART__ID = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Yunits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHART__YUNITS = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ymax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHART__YMAX = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>GSS Charts Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHART_FEATURE_COUNT = commonPackage.GSS_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>GSS Charts Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CHARTS_CHART_OPERATION_COUNT = commonPackage.GSS_MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.charts.GSSChartsYUnits <em>GSS Charts YUnits</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.charts.GSSChartsYUnits
	 * @see es.uah.aut.srg.gss.charts.impl.chartsPackageImpl#getGSSChartsYUnits()
	 * @generated
	 */
	int GSS_CHARTS_YUNITS = 2;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.charts.GSSChartsCharts <em>GSS Charts Charts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Charts Charts</em>'.
	 * @see es.uah.aut.srg.gss.charts.GSSChartsCharts
	 * @generated
	 */
	EClass getGSSChartsCharts();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.charts.GSSChartsCharts#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chart</em>'.
	 * @see es.uah.aut.srg.gss.charts.GSSChartsCharts#getChart()
	 * @see #getGSSChartsCharts()
	 * @generated
	 */
	EReference getGSSChartsCharts_Chart();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.charts.GSSChartsChart <em>GSS Charts Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Charts Chart</em>'.
	 * @see es.uah.aut.srg.gss.charts.GSSChartsChart
	 * @generated
	 */
	EClass getGSSChartsChart();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.charts.GSSChartsChart#getId()
	 * @see #getGSSChartsChart()
	 * @generated
	 */
	EAttribute getGSSChartsChart_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getY_units <em>Yunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yunits</em>'.
	 * @see es.uah.aut.srg.gss.charts.GSSChartsChart#getY_units()
	 * @see #getGSSChartsChart()
	 * @generated
	 */
	EAttribute getGSSChartsChart_Y_units();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.charts.GSSChartsChart#getY_max <em>Ymax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ymax</em>'.
	 * @see es.uah.aut.srg.gss.charts.GSSChartsChart#getY_max()
	 * @see #getGSSChartsChart()
	 * @generated
	 */
	EAttribute getGSSChartsChart_Y_max();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.charts.GSSChartsYUnits <em>GSS Charts YUnits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Charts YUnits</em>'.
	 * @see es.uah.aut.srg.gss.charts.GSSChartsYUnits
	 * @generated
	 */
	EEnum getGSSChartsYUnits();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	chartsFactory getchartsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.charts.impl.GSSChartsChartsImpl <em>GSS Charts Charts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.charts.impl.GSSChartsChartsImpl
		 * @see es.uah.aut.srg.gss.charts.impl.chartsPackageImpl#getGSSChartsCharts()
		 * @generated
		 */
		EClass GSS_CHARTS_CHARTS = eINSTANCE.getGSSChartsCharts();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CHARTS_CHARTS__CHART = eINSTANCE.getGSSChartsCharts_Chart();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.charts.impl.GSSChartsChartImpl <em>GSS Charts Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.charts.impl.GSSChartsChartImpl
		 * @see es.uah.aut.srg.gss.charts.impl.chartsPackageImpl#getGSSChartsChart()
		 * @generated
		 */
		EClass GSS_CHARTS_CHART = eINSTANCE.getGSSChartsChart();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CHARTS_CHART__ID = eINSTANCE.getGSSChartsChart_Id();

		/**
		 * The meta object literal for the '<em><b>Yunits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CHARTS_CHART__YUNITS = eINSTANCE.getGSSChartsChart_Y_units();

		/**
		 * The meta object literal for the '<em><b>Ymax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CHARTS_CHART__YMAX = eINSTANCE.getGSSChartsChart_Y_max();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.charts.GSSChartsYUnits <em>GSS Charts YUnits</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.charts.GSSChartsYUnits
		 * @see es.uah.aut.srg.gss.charts.impl.chartsPackageImpl#getGSSChartsYUnits()
		 * @generated
		 */
		EEnum GSS_CHARTS_YUNITS = eINSTANCE.getGSSChartsYUnits();

	}

} //chartsPackage
