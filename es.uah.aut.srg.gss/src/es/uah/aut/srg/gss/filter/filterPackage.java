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
package es.uah.aut.srg.gss.filter;

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
 * @see es.uah.aut.srg.gss.filter.filterFactory
 * @model kind="package"
 * @generated
 */
public interface filterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/filter";

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
	filterPackage eINSTANCE = es.uah.aut.srg.gss.filter.impl.filterPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterFilterImpl <em>GSS Filter Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterFilterImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterFilter()
	 * @generated
	 */
	int GSS_FILTER_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER__FORMAT_FILE = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER__BOOL_VAR = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bool Var From Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bool Var FDIC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER__BOOL_VAR_FDIC = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>GSS Filter Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>GSS Filter Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterMaxtermFilterImpl <em>GSS Filter Maxterm Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterMaxtermFilterImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterMaxtermFilter()
	 * @generated
	 */
	int GSS_FILTER_MAXTERM_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__NAME = GSS_FILTER_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__URI = GSS_FILTER_FILTER__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__VERSION = GSS_FILTER_FILTER__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__DESCRIPTION = GSS_FILTER_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__FORMAT_FILE = GSS_FILTER_FILTER__FORMAT_FILE;

	/**
	 * The feature id for the '<em><b>Bool Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__BOOL_VAR = GSS_FILTER_FILTER__BOOL_VAR;

	/**
	 * The feature id for the '<em><b>Bool Var From Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM;

	/**
	 * The feature id for the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM;

	/**
	 * The feature id for the '<em><b>Bool Var FDIC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC = GSS_FILTER_FILTER__BOOL_VAR_FDIC;

	/**
	 * The feature id for the '<em><b>Maxterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__MAXTERM = GSS_FILTER_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Filter Maxterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER_FEATURE_COUNT = GSS_FILTER_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Filter Maxterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER_OPERATION_COUNT = GSS_FILTER_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterMintermFilterImpl <em>GSS Filter Minterm Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterMintermFilterImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterMintermFilter()
	 * @generated
	 */
	int GSS_FILTER_MINTERM_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__NAME = GSS_FILTER_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__URI = GSS_FILTER_FILTER__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__VERSION = GSS_FILTER_FILTER__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__DESCRIPTION = GSS_FILTER_FILTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__FORMAT_FILE = GSS_FILTER_FILTER__FORMAT_FILE;

	/**
	 * The feature id for the '<em><b>Bool Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__BOOL_VAR = GSS_FILTER_FILTER__BOOL_VAR;

	/**
	 * The feature id for the '<em><b>Bool Var From Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM;

	/**
	 * The feature id for the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM;

	/**
	 * The feature id for the '<em><b>Bool Var FDIC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FDIC = GSS_FILTER_FILTER__BOOL_VAR_FDIC;

	/**
	 * The feature id for the '<em><b>Minterm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__MINTERM = GSS_FILTER_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Filter Minterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER_FEATURE_COUNT = GSS_FILTER_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Filter Minterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER_OPERATION_COUNT = GSS_FILTER_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl <em>GSS Filter Bool Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVar()
	 * @generated
	 */
	int GSS_FILTER_BOOL_VAR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Constant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__CONSTANT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__FIELD_REF = 3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__OP = 4;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__SELECT = 6;

	/**
	 * The feature id for the '<em><b>Select Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__SELECT_LINE = 7;

	/**
	 * The number of structural features of the '<em>GSS Filter Bool Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>GSS Filter Bool Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterFieldOpImpl <em>GSS Filter Field Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterFieldOpImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterFieldOp()
	 * @generated
	 */
	int GSS_FILTER_FIELD_OP = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FIELD_OP__TYPE = 0;

	/**
	 * The number of structural features of the '<em>GSS Filter Field Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FIELD_OP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Filter Field Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FIELD_OP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterConstantImpl <em>GSS Filter Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterConstantImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterConstant()
	 * @generated
	 */
	int GSS_FILTER_CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_CONSTANT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_CONSTANT__MASK = 1;

	/**
	 * The number of structural features of the '<em>GSS Filter Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_CONSTANT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Filter Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterSelectImpl <em>GSS Filter Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterSelectImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterSelect()
	 * @generated
	 */
	int GSS_FILTER_SELECT = 6;

	/**
	 * The feature id for the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT__FROM_FILE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT__OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT__MASK = 4;

	/**
	 * The number of structural features of the '<em>GSS Filter Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Filter Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterSelectLineImpl <em>GSS Filter Select Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterSelectLineImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterSelectLine()
	 * @generated
	 */
	int GSS_FILTER_SELECT_LINE = 7;

	/**
	 * The feature id for the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT_LINE__FROM_FILE = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT_LINE__LINE = 1;

	/**
	 * The feature id for the '<em><b>Left Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT_LINE__LEFT_TRIM = 2;

	/**
	 * The feature id for the '<em><b>Right Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT_LINE__RIGHT_TRIM = 3;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT_LINE__MASK = 4;

	/**
	 * The number of structural features of the '<em>GSS Filter Select Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT_LINE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Filter Select Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_SELECT_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl <em>GSS Filter Bool Var From Array Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Constant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>AI Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF = 3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP = 4;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT = 6;

	/**
	 * The feature id for the '<em><b>Select Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE = 7;

	/**
	 * The number of structural features of the '<em>GSS Filter Bool Var From Array Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>GSS Filter Bool Var From Array Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl <em>GSS Filter Bool Var From Grouped Array Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Constant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP = 3;

	/**
	 * The feature id for the '<em><b>AI Field Refs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS = 4;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP = 5;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT = 6;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT = 7;

	/**
	 * The feature id for the '<em><b>Select Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE = 8;

	/**
	 * The number of structural features of the '<em>GSS Filter Bool Var From Grouped Array Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>GSS Filter Bool Var From Grouped Array Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFDICImpl <em>GSS Filter Bool Var FDIC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFDICImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	int GSS_FILTER_BOOL_VAR_FDIC = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FDIC__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FDIC__NAME = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF = 2;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FDIC__OP = 3;

	/**
	 * The number of structural features of the '<em>GSS Filter Bool Var FDIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FDIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Filter Bool Var FDIC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FDIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterMaxtermImpl <em>GSS Filter Maxterm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterMaxtermImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterMaxterm()
	 * @generated
	 */
	int GSS_FILTER_MAXTERM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Bool Var Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM__BOOL_VAR_REF = 1;

	/**
	 * The number of structural features of the '<em>GSS Filter Maxterm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Filter Maxterm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterMintermImpl <em>GSS Filter Minterm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterMintermImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterMinterm()
	 * @generated
	 */
	int GSS_FILTER_MINTERM = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Bool Var Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM__BOOL_VAR_REF = 1;

	/**
	 * The number of structural features of the '<em>GSS Filter Minterm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Filter Minterm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarRefImpl <em>GSS Filter Bool Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarRefImpl
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVarRef()
	 * @generated
	 */
	int GSS_FILTER_BOOL_VAR_REF = 13;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_REF__ID_REF = 0;

	/**
	 * The number of structural features of the '<em>GSS Filter Bool Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Filter Bool Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.GSSFilterConstantType <em>GSS Filter Constant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstantType
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterConstantType()
	 * @generated
	 */
	int GSS_FILTER_CONSTANT_TYPE = 14;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.GSSFilterOPType <em>GSS Filter OP Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.GSSFilterOPType
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterOPType()
	 * @generated
	 */
	int GSS_FILTER_OP_TYPE = 15;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectType <em>GSS Filter Select Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectType
	 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterSelectType()
	 * @generated
	 */
	int GSS_FILTER_SELECT_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterFilter <em>GSS Filter Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Filter</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFilter
	 * @generated
	 */
	EClass getGSSFilterFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.filter.GSSFilterFilter#getFormatFile <em>Format File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Format File</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFilter#getFormatFile()
	 * @see #getGSSFilterFilter()
	 * @generated
	 */
	EReference getGSSFilterFilter_FormatFile();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.filter.GSSFilterFilter#getBoolVar <em>Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFilter#getBoolVar()
	 * @see #getGSSFilterFilter()
	 * @generated
	 */
	EReference getGSSFilterFilter_BoolVar();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.filter.GSSFilterFilter#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var From Array Item</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFilter#getBoolVarFromArrayItem()
	 * @see #getGSSFilterFilter()
	 * @generated
	 */
	EReference getGSSFilterFilter_BoolVarFromArrayItem();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.filter.GSSFilterFilter#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var From Grouped Array Item</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFilter#getBoolVarFromGroupedArrayItem()
	 * @see #getGSSFilterFilter()
	 * @generated
	 */
	EReference getGSSFilterFilter_BoolVarFromGroupedArrayItem();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.filter.GSSFilterFilter#getBoolVarFDIC <em>Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var FDIC</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFilter#getBoolVarFDIC()
	 * @see #getGSSFilterFilter()
	 * @generated
	 */
	EReference getGSSFilterFilter_BoolVarFDIC();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterMaxtermFilter <em>GSS Filter Maxterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Maxterm Filter</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMaxtermFilter
	 * @generated
	 */
	EClass getGSSFilterMaxtermFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.filter.GSSFilterMaxtermFilter#getMaxterm <em>Maxterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maxterm</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMaxtermFilter#getMaxterm()
	 * @see #getGSSFilterMaxtermFilter()
	 * @generated
	 */
	EReference getGSSFilterMaxtermFilter_Maxterm();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterMintermFilter <em>GSS Filter Minterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Minterm Filter</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMintermFilter
	 * @generated
	 */
	EClass getGSSFilterMintermFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.filter.GSSFilterMintermFilter#getMinterm <em>Minterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minterm</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMintermFilter#getMinterm()
	 * @see #getGSSFilterMintermFilter()
	 * @generated
	 */
	EReference getGSSFilterMintermFilter_Minterm();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar <em>GSS Filter Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar
	 * @generated
	 */
	EClass getGSSFilterBoolVar();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getId()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVar_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getName()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVar_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstantType()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVar_ConstantType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getFieldRef()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_FieldRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getOp()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_Op();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstant()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_Constant();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getSelect()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_Select();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getSelectLine <em>Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Line</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getSelectLine()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_SelectLine();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterFieldOp <em>GSS Filter Field Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Field Op</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFieldOp
	 * @generated
	 */
	EClass getGSSFilterFieldOp();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterFieldOp#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterFieldOp#getType()
	 * @see #getGSSFilterFieldOp()
	 * @generated
	 */
	EAttribute getGSSFilterFieldOp_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterConstant <em>GSS Filter Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Constant</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstant
	 * @generated
	 */
	EClass getGSSFilterConstant();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstant#getValue()
	 * @see #getGSSFilterConstant()
	 * @generated
	 */
	EAttribute getGSSFilterConstant_Value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterConstant#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstant#getMask()
	 * @see #getGSSFilterConstant()
	 * @generated
	 */
	EAttribute getGSSFilterConstant_Mask();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect <em>GSS Filter Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Select</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelect
	 * @generated
	 */
	EClass getGSSFilterSelect();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelect#getFromFile()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_FromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelect#getType()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelect#getOffset()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelect#getSize()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_Size();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelect#getMask()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_Mask();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine <em>GSS Filter Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Select Line</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectLine
	 * @generated
	 */
	EClass getGSSFilterSelectLine();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getFromFile()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_FromFile();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getLine()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_Line();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getLeftTrim <em>Left Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Trim</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getLeftTrim()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_LeftTrim();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getRightTrim <em>Right Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Trim</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getRightTrim()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_RightTrim();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getMask()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_Mask();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem <em>GSS Filter Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var From Array Item</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem
	 * @generated
	 */
	EClass getGSSFilterBoolVarFromArrayItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getId()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromArrayItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getName()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromArrayItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getConstantType()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromArrayItem_ConstantType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AI Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getAIFieldRef()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_AIFieldRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getOp()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_Op();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getConstant()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_Constant();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getSelect()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_Select();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getSelectLine <em>Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Line</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getSelectLine()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_SelectLine();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem <em>GSS Filter Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var From Grouped Array Item</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem
	 * @generated
	 */
	EClass getGSSFilterBoolVarFromGroupedArrayItem();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getId()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromGroupedArrayItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getName()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromGroupedArrayItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getConstantType()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromGroupedArrayItem_ConstantType();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getGroup()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromGroupedArrayItem_Group();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getAIFieldRefs <em>AI Field Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AI Field Refs</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getAIFieldRefs()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_AIFieldRefs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getOp()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_Op();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getConstant()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_Constant();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getSelect()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_Select();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getSelectLine <em>Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Line</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getSelectLine()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_SelectLine();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC <em>GSS Filter Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var FDIC</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC
	 * @generated
	 */
	EClass getGSSFilterBoolVarFDIC();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getId()
	 * @see #getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFDIC_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getName()
	 * @see #getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFDIC_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getFieldRef()
	 * @see #getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFDIC_FieldRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getOp()
	 * @see #getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFDIC_Op();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterMaxterm <em>GSS Filter Maxterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Maxterm</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMaxterm
	 * @generated
	 */
	EClass getGSSFilterMaxterm();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterMaxterm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMaxterm#getId()
	 * @see #getGSSFilterMaxterm()
	 * @generated
	 */
	EAttribute getGSSFilterMaxterm_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.filter.GSSFilterMaxterm#getBoolVarRef <em>Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var Ref</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMaxterm#getBoolVarRef()
	 * @see #getGSSFilterMaxterm()
	 * @generated
	 */
	EReference getGSSFilterMaxterm_BoolVarRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterMinterm <em>GSS Filter Minterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Minterm</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMinterm
	 * @generated
	 */
	EClass getGSSFilterMinterm();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterMinterm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMinterm#getId()
	 * @see #getGSSFilterMinterm()
	 * @generated
	 */
	EAttribute getGSSFilterMinterm_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.filter.GSSFilterMinterm#getBoolVarRef <em>Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool Var Ref</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterMinterm#getBoolVarRef()
	 * @see #getGSSFilterMinterm()
	 * @generated
	 */
	EReference getGSSFilterMinterm_BoolVarRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarRef <em>GSS Filter Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var Ref</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarRef
	 * @generated
	 */
	EClass getGSSFilterBoolVarRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarRef#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterBoolVarRef#getIdRef()
	 * @see #getGSSFilterBoolVarRef()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarRef_IdRef();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.filter.GSSFilterConstantType <em>GSS Filter Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Filter Constant Type</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstantType
	 * @generated
	 */
	EEnum getGSSFilterConstantType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.filter.GSSFilterOPType <em>GSS Filter OP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Filter OP Type</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterOPType
	 * @generated
	 */
	EEnum getGSSFilterOPType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectType <em>GSS Filter Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Filter Select Type</em>'.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectType
	 * @generated
	 */
	EEnum getGSSFilterSelectType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	filterFactory getfilterFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterFilterImpl <em>GSS Filter Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterFilterImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterFilter()
		 * @generated
		 */
		EClass GSS_FILTER_FILTER = eINSTANCE.getGSSFilterFilter();

		/**
		 * The meta object literal for the '<em><b>Format File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_FILTER__FORMAT_FILE = eINSTANCE.getGSSFilterFilter_FormatFile();

		/**
		 * The meta object literal for the '<em><b>Bool Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_FILTER__BOOL_VAR = eINSTANCE.getGSSFilterFilter_BoolVar();

		/**
		 * The meta object literal for the '<em><b>Bool Var From Array Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = eINSTANCE.getGSSFilterFilter_BoolVarFromArrayItem();

		/**
		 * The meta object literal for the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = eINSTANCE.getGSSFilterFilter_BoolVarFromGroupedArrayItem();

		/**
		 * The meta object literal for the '<em><b>Bool Var FDIC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_FILTER__BOOL_VAR_FDIC = eINSTANCE.getGSSFilterFilter_BoolVarFDIC();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterMaxtermFilterImpl <em>GSS Filter Maxterm Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterMaxtermFilterImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterMaxtermFilter()
		 * @generated
		 */
		EClass GSS_FILTER_MAXTERM_FILTER = eINSTANCE.getGSSFilterMaxtermFilter();

		/**
		 * The meta object literal for the '<em><b>Maxterm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MAXTERM_FILTER__MAXTERM = eINSTANCE.getGSSFilterMaxtermFilter_Maxterm();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterMintermFilterImpl <em>GSS Filter Minterm Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterMintermFilterImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterMintermFilter()
		 * @generated
		 */
		EClass GSS_FILTER_MINTERM_FILTER = eINSTANCE.getGSSFilterMintermFilter();

		/**
		 * The meta object literal for the '<em><b>Minterm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MINTERM_FILTER__MINTERM = eINSTANCE.getGSSFilterMintermFilter_Minterm();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl <em>GSS Filter Bool Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVar()
		 * @generated
		 */
		EClass GSS_FILTER_BOOL_VAR = eINSTANCE.getGSSFilterBoolVar();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR__ID = eINSTANCE.getGSSFilterBoolVar_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR__NAME = eINSTANCE.getGSSFilterBoolVar_Name();

		/**
		 * The meta object literal for the '<em><b>Constant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR__CONSTANT_TYPE = eINSTANCE.getGSSFilterBoolVar_ConstantType();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR__FIELD_REF = eINSTANCE.getGSSFilterBoolVar_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR__OP = eINSTANCE.getGSSFilterBoolVar_Op();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR__CONSTANT = eINSTANCE.getGSSFilterBoolVar_Constant();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR__SELECT = eINSTANCE.getGSSFilterBoolVar_Select();

		/**
		 * The meta object literal for the '<em><b>Select Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR__SELECT_LINE = eINSTANCE.getGSSFilterBoolVar_SelectLine();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterFieldOpImpl <em>GSS Filter Field Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterFieldOpImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterFieldOp()
		 * @generated
		 */
		EClass GSS_FILTER_FIELD_OP = eINSTANCE.getGSSFilterFieldOp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_FIELD_OP__TYPE = eINSTANCE.getGSSFilterFieldOp_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterConstantImpl <em>GSS Filter Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterConstantImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterConstant()
		 * @generated
		 */
		EClass GSS_FILTER_CONSTANT = eINSTANCE.getGSSFilterConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_CONSTANT__VALUE = eINSTANCE.getGSSFilterConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_CONSTANT__MASK = eINSTANCE.getGSSFilterConstant_Mask();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterSelectImpl <em>GSS Filter Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterSelectImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterSelect()
		 * @generated
		 */
		EClass GSS_FILTER_SELECT = eINSTANCE.getGSSFilterSelect();

		/**
		 * The meta object literal for the '<em><b>From File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT__FROM_FILE = eINSTANCE.getGSSFilterSelect_FromFile();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT__TYPE = eINSTANCE.getGSSFilterSelect_Type();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT__OFFSET = eINSTANCE.getGSSFilterSelect_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT__SIZE = eINSTANCE.getGSSFilterSelect_Size();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT__MASK = eINSTANCE.getGSSFilterSelect_Mask();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterSelectLineImpl <em>GSS Filter Select Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterSelectLineImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterSelectLine()
		 * @generated
		 */
		EClass GSS_FILTER_SELECT_LINE = eINSTANCE.getGSSFilterSelectLine();

		/**
		 * The meta object literal for the '<em><b>From File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT_LINE__FROM_FILE = eINSTANCE.getGSSFilterSelectLine_FromFile();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT_LINE__LINE = eINSTANCE.getGSSFilterSelectLine_Line();

		/**
		 * The meta object literal for the '<em><b>Left Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT_LINE__LEFT_TRIM = eINSTANCE.getGSSFilterSelectLine_LeftTrim();

		/**
		 * The meta object literal for the '<em><b>Right Trim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT_LINE__RIGHT_TRIM = eINSTANCE.getGSSFilterSelectLine_RightTrim();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_SELECT_LINE__MASK = eINSTANCE.getGSSFilterSelectLine_Mask();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl <em>GSS Filter Bool Var From Array Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVarFromArrayItem()
		 * @generated
		 */
		EClass GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM = eINSTANCE.getGSSFilterBoolVarFromArrayItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID = eINSTANCE.getGSSFilterBoolVarFromArrayItem_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME = eINSTANCE.getGSSFilterBoolVarFromArrayItem_Name();

		/**
		 * The meta object literal for the '<em><b>Constant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE = eINSTANCE.getGSSFilterBoolVarFromArrayItem_ConstantType();

		/**
		 * The meta object literal for the '<em><b>AI Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF = eINSTANCE.getGSSFilterBoolVarFromArrayItem_AIFieldRef();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP = eINSTANCE.getGSSFilterBoolVarFromArrayItem_Op();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT = eINSTANCE.getGSSFilterBoolVarFromArrayItem_Constant();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT = eINSTANCE.getGSSFilterBoolVarFromArrayItem_Select();

		/**
		 * The meta object literal for the '<em><b>Select Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE = eINSTANCE.getGSSFilterBoolVarFromArrayItem_SelectLine();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl <em>GSS Filter Bool Var From Grouped Array Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVarFromGroupedArrayItem()
		 * @generated
		 */
		EClass GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_Name();

		/**
		 * The meta object literal for the '<em><b>Constant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_ConstantType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_Group();

		/**
		 * The meta object literal for the '<em><b>AI Field Refs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_AIFieldRefs();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_Op();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_Constant();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_Select();

		/**
		 * The meta object literal for the '<em><b>Select Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_SelectLine();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFDICImpl <em>GSS Filter Bool Var FDIC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFDICImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVarFDIC()
		 * @generated
		 */
		EClass GSS_FILTER_BOOL_VAR_FDIC = eINSTANCE.getGSSFilterBoolVarFDIC();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_FDIC__ID = eINSTANCE.getGSSFilterBoolVarFDIC_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_FDIC__NAME = eINSTANCE.getGSSFilterBoolVarFDIC_Name();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF = eINSTANCE.getGSSFilterBoolVarFDIC_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FDIC__OP = eINSTANCE.getGSSFilterBoolVarFDIC_Op();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterMaxtermImpl <em>GSS Filter Maxterm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterMaxtermImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterMaxterm()
		 * @generated
		 */
		EClass GSS_FILTER_MAXTERM = eINSTANCE.getGSSFilterMaxterm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_MAXTERM__ID = eINSTANCE.getGSSFilterMaxterm_Id();

		/**
		 * The meta object literal for the '<em><b>Bool Var Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MAXTERM__BOOL_VAR_REF = eINSTANCE.getGSSFilterMaxterm_BoolVarRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterMintermImpl <em>GSS Filter Minterm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterMintermImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterMinterm()
		 * @generated
		 */
		EClass GSS_FILTER_MINTERM = eINSTANCE.getGSSFilterMinterm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_MINTERM__ID = eINSTANCE.getGSSFilterMinterm_Id();

		/**
		 * The meta object literal for the '<em><b>Bool Var Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MINTERM__BOOL_VAR_REF = eINSTANCE.getGSSFilterMinterm_BoolVarRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarRefImpl <em>GSS Filter Bool Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarRefImpl
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterBoolVarRef()
		 * @generated
		 */
		EClass GSS_FILTER_BOOL_VAR_REF = eINSTANCE.getGSSFilterBoolVarRef();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_BOOL_VAR_REF__ID_REF = eINSTANCE.getGSSFilterBoolVarRef_IdRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.GSSFilterConstantType <em>GSS Filter Constant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.GSSFilterConstantType
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterConstantType()
		 * @generated
		 */
		EEnum GSS_FILTER_CONSTANT_TYPE = eINSTANCE.getGSSFilterConstantType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.GSSFilterOPType <em>GSS Filter OP Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.GSSFilterOPType
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterOPType()
		 * @generated
		 */
		EEnum GSS_FILTER_OP_TYPE = eINSTANCE.getGSSFilterOPType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectType <em>GSS Filter Select Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectType
		 * @see es.uah.aut.srg.gss.filter.impl.filterPackageImpl#getGSSFilterSelectType()
		 * @generated
		 */
		EEnum GSS_FILTER_SELECT_TYPE = eINSTANCE.getGSSFilterSelectType();

	}

} //filterPackage
