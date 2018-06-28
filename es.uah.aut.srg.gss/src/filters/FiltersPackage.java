/**
 */
package filters;

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
 * @see filters.FiltersFactory
 * @model kind="package"
 * @generated
 */
public interface FiltersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/filters";

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
	FiltersPackage eINSTANCE = filters.impl.FiltersPackageImpl.init();

	/**
	 * The meta object id for the '{@link filters.impl.GSSFilterFilterImpl <em>GSS Filter Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterFilterImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterFilter()
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
	 * The number of structural features of the '<em>GSS Filter Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSS Filter Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FILTER_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link filters.impl.GSSFilterMaxtermFilterImpl <em>GSS Filter Maxterm Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterMaxtermFilterImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterMaxtermFilter()
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
	 * The feature id for the '<em><b>Format File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__FORMAT_FILE = GSS_FILTER_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__BOOL_VAR = GSS_FILTER_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bool Var From Array Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = GSS_FILTER_FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bool Var From Grouped Array Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = GSS_FILTER_FILTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bool Var FDIC</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC = GSS_FILTER_FILTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maxterm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER__MAXTERM = GSS_FILTER_FILTER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>GSS Filter Maxterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER_FEATURE_COUNT = GSS_FILTER_FILTER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>GSS Filter Maxterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM_FILTER_OPERATION_COUNT = GSS_FILTER_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link filters.impl.GSSFilterMintermFilterImpl <em>GSS Filter Minterm Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterMintermFilterImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterMintermFilter()
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
	 * The feature id for the '<em><b>Format File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__FORMAT_FILE = GSS_FILTER_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool Var</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__BOOL_VAR = GSS_FILTER_FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bool Var From Array Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = GSS_FILTER_FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bool Var From Grouped Array Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = GSS_FILTER_FILTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bool Var FDIC</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FDIC = GSS_FILTER_FILTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Minterm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER__MINTERM = GSS_FILTER_FILTER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>GSS Filter Minterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER_FEATURE_COUNT = GSS_FILTER_FILTER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>GSS Filter Minterm Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM_FILTER_OPERATION_COUNT = GSS_FILTER_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link filters.impl.GSSFilterBoolVarImpl <em>GSS Filter Bool Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterBoolVarImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVar()
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
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__OP = 4;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Select</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR__SELECT = 6;

	/**
	 * The feature id for the '<em><b>Select Line</b></em>' reference.
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
	 * The meta object id for the '{@link filters.impl.GSSFilterFieldRefImpl <em>GSS Filter Field Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterFieldRefImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterFieldRef()
	 * @generated
	 */
	int GSS_FILTER_FIELD_REF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FIELD_REF__NAME = 0;

	/**
	 * The number of structural features of the '<em>GSS Filter Field Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FIELD_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Filter Field Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_FIELD_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link filters.impl.GSSFilterFieldOpImpl <em>GSS Filter Field Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterFieldOpImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterFieldOp()
	 * @generated
	 */
	int GSS_FILTER_FIELD_OP = 5;

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
	 * The meta object id for the '{@link filters.impl.GSSFilterConstantImpl <em>GSS Filter Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterConstantImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterConstant()
	 * @generated
	 */
	int GSS_FILTER_CONSTANT = 6;

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
	 * The meta object id for the '{@link filters.impl.GSSFilterSelectImpl <em>GSS Filter Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterSelectImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterSelect()
	 * @generated
	 */
	int GSS_FILTER_SELECT = 7;

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
	 * The meta object id for the '{@link filters.impl.GSSFilterSelectLineImpl <em>GSS Filter Select Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterSelectLineImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterSelectLine()
	 * @generated
	 */
	int GSS_FILTER_SELECT_LINE = 8;

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
	 * The meta object id for the '{@link filters.impl.GSSFilterBoolVarFromArrayItemImpl <em>GSS Filter Bool Var From Array Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterBoolVarFromArrayItemImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM = 9;

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
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP = 4;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Select</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT = 6;

	/**
	 * The feature id for the '<em><b>Select Line</b></em>' reference.
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
	 * The meta object id for the '{@link filters.impl.GSSFilterAIFieldRefImpl <em>GSS Filter AI Field Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterAIFieldRefImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterAIFieldRef()
	 * @generated
	 */
	int GSS_FILTER_AI_FIELD_REF = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_AI_FIELD_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_AI_FIELD_REF__INDEX = 1;

	/**
	 * The number of structural features of the '<em>GSS Filter AI Field Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_AI_FIELD_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Filter AI Field Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_AI_FIELD_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl <em>GSS Filter Bool Var From Grouped Array Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = 11;

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
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP = 5;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT = 6;

	/**
	 * The feature id for the '<em><b>Select</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT = 7;

	/**
	 * The feature id for the '<em><b>Select Line</b></em>' reference.
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
	 * The meta object id for the '{@link filters.impl.GSSFilterAIFieldRefsImpl <em>GSS Filter AI Field Refs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterAIFieldRefsImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterAIFieldRefs()
	 * @generated
	 */
	int GSS_FILTER_AI_FIELD_REFS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_AI_FIELD_REFS__NAME = 0;

	/**
	 * The number of structural features of the '<em>GSS Filter AI Field Refs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_AI_FIELD_REFS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Filter AI Field Refs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_AI_FIELD_REFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link filters.impl.GSSFilterBoolVarFDICImpl <em>GSS Filter Bool Var FDIC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterBoolVarFDICImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	int GSS_FILTER_BOOL_VAR_FDIC = 13;

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
	 * The feature id for the '<em><b>Op</b></em>' reference.
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
	 * The meta object id for the '{@link filters.impl.GSSFilterMaxtermImpl <em>GSS Filter Maxterm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterMaxtermImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterMaxterm()
	 * @generated
	 */
	int GSS_FILTER_MAXTERM = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MAXTERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Bool Var Ref</b></em>' reference list.
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
	 * The meta object id for the '{@link filters.impl.GSSFilterMintermImpl <em>GSS Filter Minterm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterMintermImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterMinterm()
	 * @generated
	 */
	int GSS_FILTER_MINTERM = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_FILTER_MINTERM__ID = 0;

	/**
	 * The feature id for the '<em><b>Bool Var Ref</b></em>' reference list.
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
	 * The meta object id for the '{@link filters.impl.GSSFilterBoolVarRefImpl <em>GSS Filter Bool Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.impl.GSSFilterBoolVarRefImpl
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVarRef()
	 * @generated
	 */
	int GSS_FILTER_BOOL_VAR_REF = 16;

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
	 * The meta object id for the '{@link filters.GSSFilterConstantType <em>GSS Filter Constant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.GSSFilterConstantType
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterConstantType()
	 * @generated
	 */
	int GSS_FILTER_CONSTANT_TYPE = 17;

	/**
	 * The meta object id for the '{@link filters.GSSFilterOPType <em>GSS Filter OP Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.GSSFilterOPType
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterOPType()
	 * @generated
	 */
	int GSS_FILTER_OP_TYPE = 18;

	/**
	 * The meta object id for the '{@link filters.GSSFilterSelectType <em>GSS Filter Select Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filters.GSSFilterSelectType
	 * @see filters.impl.FiltersPackageImpl#getGSSFilterSelectType()
	 * @generated
	 */
	int GSS_FILTER_SELECT_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link filters.GSSFilterFilter <em>GSS Filter Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Filter</em>'.
	 * @see filters.GSSFilterFilter
	 * @generated
	 */
	EClass getGSSFilterFilter();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterMaxtermFilter <em>GSS Filter Maxterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Maxterm Filter</em>'.
	 * @see filters.GSSFilterMaxtermFilter
	 * @generated
	 */
	EClass getGSSFilterMaxtermFilter();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterMaxtermFilter#getFormatFile <em>Format File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format File</em>'.
	 * @see filters.GSSFilterMaxtermFilter#getFormatFile()
	 * @see #getGSSFilterMaxtermFilter()
	 * @generated
	 */
	EAttribute getGSSFilterMaxtermFilter_FormatFile();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMaxtermFilter#getBoolVar <em>Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var</em>'.
	 * @see filters.GSSFilterMaxtermFilter#getBoolVar()
	 * @see #getGSSFilterMaxtermFilter()
	 * @generated
	 */
	EReference getGSSFilterMaxtermFilter_BoolVar();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMaxtermFilter#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var From Array Item</em>'.
	 * @see filters.GSSFilterMaxtermFilter#getBoolVarFromArrayItem()
	 * @see #getGSSFilterMaxtermFilter()
	 * @generated
	 */
	EReference getGSSFilterMaxtermFilter_BoolVarFromArrayItem();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMaxtermFilter#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var From Grouped Array Item</em>'.
	 * @see filters.GSSFilterMaxtermFilter#getBoolVarFromGroupedArrayItem()
	 * @see #getGSSFilterMaxtermFilter()
	 * @generated
	 */
	EReference getGSSFilterMaxtermFilter_BoolVarFromGroupedArrayItem();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMaxtermFilter#getBoolVarFDIC <em>Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var FDIC</em>'.
	 * @see filters.GSSFilterMaxtermFilter#getBoolVarFDIC()
	 * @see #getGSSFilterMaxtermFilter()
	 * @generated
	 */
	EReference getGSSFilterMaxtermFilter_BoolVarFDIC();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMaxtermFilter#getMaxterm <em>Maxterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Maxterm</em>'.
	 * @see filters.GSSFilterMaxtermFilter#getMaxterm()
	 * @see #getGSSFilterMaxtermFilter()
	 * @generated
	 */
	EReference getGSSFilterMaxtermFilter_Maxterm();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterMintermFilter <em>GSS Filter Minterm Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Minterm Filter</em>'.
	 * @see filters.GSSFilterMintermFilter
	 * @generated
	 */
	EClass getGSSFilterMintermFilter();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterMintermFilter#getFormatFile <em>Format File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format File</em>'.
	 * @see filters.GSSFilterMintermFilter#getFormatFile()
	 * @see #getGSSFilterMintermFilter()
	 * @generated
	 */
	EAttribute getGSSFilterMintermFilter_FormatFile();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMintermFilter#getBoolVar <em>Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var</em>'.
	 * @see filters.GSSFilterMintermFilter#getBoolVar()
	 * @see #getGSSFilterMintermFilter()
	 * @generated
	 */
	EReference getGSSFilterMintermFilter_BoolVar();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMintermFilter#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var From Array Item</em>'.
	 * @see filters.GSSFilterMintermFilter#getBoolVarFromArrayItem()
	 * @see #getGSSFilterMintermFilter()
	 * @generated
	 */
	EReference getGSSFilterMintermFilter_BoolVarFromArrayItem();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMintermFilter#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var From Grouped Array Item</em>'.
	 * @see filters.GSSFilterMintermFilter#getBoolVarFromGroupedArrayItem()
	 * @see #getGSSFilterMintermFilter()
	 * @generated
	 */
	EReference getGSSFilterMintermFilter_BoolVarFromGroupedArrayItem();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMintermFilter#getBoolVarFDIC <em>Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var FDIC</em>'.
	 * @see filters.GSSFilterMintermFilter#getBoolVarFDIC()
	 * @see #getGSSFilterMintermFilter()
	 * @generated
	 */
	EReference getGSSFilterMintermFilter_BoolVarFDIC();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMintermFilter#getMinterm <em>Minterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Minterm</em>'.
	 * @see filters.GSSFilterMintermFilter#getMinterm()
	 * @see #getGSSFilterMintermFilter()
	 * @generated
	 */
	EReference getGSSFilterMintermFilter_Minterm();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterBoolVar <em>GSS Filter Bool Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var</em>'.
	 * @see filters.GSSFilterBoolVar
	 * @generated
	 */
	EClass getGSSFilterBoolVar();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see filters.GSSFilterBoolVar#getId()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVar_Id();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see filters.GSSFilterBoolVar#getName()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVar_Name();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVar#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see filters.GSSFilterBoolVar#getConstantType()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVar_ConstantType();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVar#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see filters.GSSFilterBoolVar#getFieldRef()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_FieldRef();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVar#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see filters.GSSFilterBoolVar#getOp()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_Op();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVar#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constant</em>'.
	 * @see filters.GSSFilterBoolVar#getConstant()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_Constant();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVar#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select</em>'.
	 * @see filters.GSSFilterBoolVar#getSelect()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_Select();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVar#getSelectLine <em>Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select Line</em>'.
	 * @see filters.GSSFilterBoolVar#getSelectLine()
	 * @see #getGSSFilterBoolVar()
	 * @generated
	 */
	EReference getGSSFilterBoolVar_SelectLine();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterFieldRef <em>GSS Filter Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Field Ref</em>'.
	 * @see filters.GSSFilterFieldRef
	 * @generated
	 */
	EClass getGSSFilterFieldRef();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterFieldRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see filters.GSSFilterFieldRef#getName()
	 * @see #getGSSFilterFieldRef()
	 * @generated
	 */
	EAttribute getGSSFilterFieldRef_Name();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterFieldOp <em>GSS Filter Field Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Field Op</em>'.
	 * @see filters.GSSFilterFieldOp
	 * @generated
	 */
	EClass getGSSFilterFieldOp();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterFieldOp#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see filters.GSSFilterFieldOp#getType()
	 * @see #getGSSFilterFieldOp()
	 * @generated
	 */
	EAttribute getGSSFilterFieldOp_Type();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterConstant <em>GSS Filter Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Constant</em>'.
	 * @see filters.GSSFilterConstant
	 * @generated
	 */
	EClass getGSSFilterConstant();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see filters.GSSFilterConstant#getValue()
	 * @see #getGSSFilterConstant()
	 * @generated
	 */
	EAttribute getGSSFilterConstant_Value();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterConstant#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see filters.GSSFilterConstant#getMask()
	 * @see #getGSSFilterConstant()
	 * @generated
	 */
	EAttribute getGSSFilterConstant_Mask();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterSelect <em>GSS Filter Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Select</em>'.
	 * @see filters.GSSFilterSelect
	 * @generated
	 */
	EClass getGSSFilterSelect();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelect#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see filters.GSSFilterSelect#getFromFile()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_FromFile();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelect#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see filters.GSSFilterSelect#getType()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_Type();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelect#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see filters.GSSFilterSelect#getOffset()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_Offset();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelect#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see filters.GSSFilterSelect#getSize()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_Size();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelect#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see filters.GSSFilterSelect#getMask()
	 * @see #getGSSFilterSelect()
	 * @generated
	 */
	EAttribute getGSSFilterSelect_Mask();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterSelectLine <em>GSS Filter Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Select Line</em>'.
	 * @see filters.GSSFilterSelectLine
	 * @generated
	 */
	EClass getGSSFilterSelectLine();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelectLine#getFromFile <em>From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From File</em>'.
	 * @see filters.GSSFilterSelectLine#getFromFile()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_FromFile();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelectLine#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see filters.GSSFilterSelectLine#getLine()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_Line();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelectLine#getLeftTrim <em>Left Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Trim</em>'.
	 * @see filters.GSSFilterSelectLine#getLeftTrim()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_LeftTrim();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelectLine#getRightTrim <em>Right Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Trim</em>'.
	 * @see filters.GSSFilterSelectLine#getRightTrim()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_RightTrim();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterSelectLine#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see filters.GSSFilterSelectLine#getMask()
	 * @see #getGSSFilterSelectLine()
	 * @generated
	 */
	EAttribute getGSSFilterSelectLine_Mask();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterBoolVarFromArrayItem <em>GSS Filter Bool Var From Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var From Array Item</em>'.
	 * @see filters.GSSFilterBoolVarFromArrayItem
	 * @generated
	 */
	EClass getGSSFilterBoolVarFromArrayItem();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarFromArrayItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see filters.GSSFilterBoolVarFromArrayItem#getId()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromArrayItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarFromArrayItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see filters.GSSFilterBoolVarFromArrayItem#getName()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromArrayItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see filters.GSSFilterBoolVarFromArrayItem#getConstantType()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromArrayItem_ConstantType();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AI Field Ref</em>'.
	 * @see filters.GSSFilterBoolVarFromArrayItem#getAIFieldRef()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_AIFieldRef();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromArrayItem#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see filters.GSSFilterBoolVarFromArrayItem#getOp()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_Op();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromArrayItem#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constant</em>'.
	 * @see filters.GSSFilterBoolVarFromArrayItem#getConstant()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_Constant();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromArrayItem#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select</em>'.
	 * @see filters.GSSFilterBoolVarFromArrayItem#getSelect()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_Select();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromArrayItem#getSelectLine <em>Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select Line</em>'.
	 * @see filters.GSSFilterBoolVarFromArrayItem#getSelectLine()
	 * @see #getGSSFilterBoolVarFromArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromArrayItem_SelectLine();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterAIFieldRef <em>GSS Filter AI Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter AI Field Ref</em>'.
	 * @see filters.GSSFilterAIFieldRef
	 * @generated
	 */
	EClass getGSSFilterAIFieldRef();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterAIFieldRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see filters.GSSFilterAIFieldRef#getName()
	 * @see #getGSSFilterAIFieldRef()
	 * @generated
	 */
	EAttribute getGSSFilterAIFieldRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterAIFieldRef#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see filters.GSSFilterAIFieldRef#getIndex()
	 * @see #getGSSFilterAIFieldRef()
	 * @generated
	 */
	EAttribute getGSSFilterAIFieldRef_Index();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterBoolVarFromGroupedArrayItem <em>GSS Filter Bool Var From Grouped Array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var From Grouped Array Item</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem
	 * @generated
	 */
	EClass getGSSFilterBoolVarFromGroupedArrayItem();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem#getId()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromGroupedArrayItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem#getName()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromGroupedArrayItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getConstantType <em>Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Type</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem#getConstantType()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromGroupedArrayItem_ConstantType();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem#getGroup()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFromGroupedArrayItem_Group();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getAIFieldRefs <em>AI Field Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>AI Field Refs</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem#getAIFieldRefs()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_AIFieldRefs();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem#getOp()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_Op();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constant</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem#getConstant()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_Constant();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem#getSelect()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_Select();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getSelectLine <em>Select Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select Line</em>'.
	 * @see filters.GSSFilterBoolVarFromGroupedArrayItem#getSelectLine()
	 * @see #getGSSFilterBoolVarFromGroupedArrayItem()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFromGroupedArrayItem_SelectLine();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterAIFieldRefs <em>GSS Filter AI Field Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter AI Field Refs</em>'.
	 * @see filters.GSSFilterAIFieldRefs
	 * @generated
	 */
	EClass getGSSFilterAIFieldRefs();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterAIFieldRefs#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see filters.GSSFilterAIFieldRefs#getName()
	 * @see #getGSSFilterAIFieldRefs()
	 * @generated
	 */
	EAttribute getGSSFilterAIFieldRefs_Name();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterBoolVarFDIC <em>GSS Filter Bool Var FDIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var FDIC</em>'.
	 * @see filters.GSSFilterBoolVarFDIC
	 * @generated
	 */
	EClass getGSSFilterBoolVarFDIC();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarFDIC#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see filters.GSSFilterBoolVarFDIC#getId()
	 * @see #getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFDIC_Id();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarFDIC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see filters.GSSFilterBoolVarFDIC#getName()
	 * @see #getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarFDIC_Name();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFDIC#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Ref</em>'.
	 * @see filters.GSSFilterBoolVarFDIC#getFieldRef()
	 * @see #getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFDIC_FieldRef();

	/**
	 * Returns the meta object for the reference '{@link filters.GSSFilterBoolVarFDIC#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see filters.GSSFilterBoolVarFDIC#getOp()
	 * @see #getGSSFilterBoolVarFDIC()
	 * @generated
	 */
	EReference getGSSFilterBoolVarFDIC_Op();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterMaxterm <em>GSS Filter Maxterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Maxterm</em>'.
	 * @see filters.GSSFilterMaxterm
	 * @generated
	 */
	EClass getGSSFilterMaxterm();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterMaxterm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see filters.GSSFilterMaxterm#getId()
	 * @see #getGSSFilterMaxterm()
	 * @generated
	 */
	EAttribute getGSSFilterMaxterm_Id();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMaxterm#getBoolVarRef <em>Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var Ref</em>'.
	 * @see filters.GSSFilterMaxterm#getBoolVarRef()
	 * @see #getGSSFilterMaxterm()
	 * @generated
	 */
	EReference getGSSFilterMaxterm_BoolVarRef();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterMinterm <em>GSS Filter Minterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Minterm</em>'.
	 * @see filters.GSSFilterMinterm
	 * @generated
	 */
	EClass getGSSFilterMinterm();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterMinterm#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see filters.GSSFilterMinterm#getId()
	 * @see #getGSSFilterMinterm()
	 * @generated
	 */
	EAttribute getGSSFilterMinterm_Id();

	/**
	 * Returns the meta object for the reference list '{@link filters.GSSFilterMinterm#getBoolVarRef <em>Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bool Var Ref</em>'.
	 * @see filters.GSSFilterMinterm#getBoolVarRef()
	 * @see #getGSSFilterMinterm()
	 * @generated
	 */
	EReference getGSSFilterMinterm_BoolVarRef();

	/**
	 * Returns the meta object for class '{@link filters.GSSFilterBoolVarRef <em>GSS Filter Bool Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Filter Bool Var Ref</em>'.
	 * @see filters.GSSFilterBoolVarRef
	 * @generated
	 */
	EClass getGSSFilterBoolVarRef();

	/**
	 * Returns the meta object for the attribute '{@link filters.GSSFilterBoolVarRef#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see filters.GSSFilterBoolVarRef#getIdRef()
	 * @see #getGSSFilterBoolVarRef()
	 * @generated
	 */
	EAttribute getGSSFilterBoolVarRef_IdRef();

	/**
	 * Returns the meta object for enum '{@link filters.GSSFilterConstantType <em>GSS Filter Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Filter Constant Type</em>'.
	 * @see filters.GSSFilterConstantType
	 * @generated
	 */
	EEnum getGSSFilterConstantType();

	/**
	 * Returns the meta object for enum '{@link filters.GSSFilterOPType <em>GSS Filter OP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Filter OP Type</em>'.
	 * @see filters.GSSFilterOPType
	 * @generated
	 */
	EEnum getGSSFilterOPType();

	/**
	 * Returns the meta object for enum '{@link filters.GSSFilterSelectType <em>GSS Filter Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Filter Select Type</em>'.
	 * @see filters.GSSFilterSelectType
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
	FiltersFactory getFiltersFactory();

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
		 * The meta object literal for the '{@link filters.impl.GSSFilterFilterImpl <em>GSS Filter Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterFilterImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterFilter()
		 * @generated
		 */
		EClass GSS_FILTER_FILTER = eINSTANCE.getGSSFilterFilter();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterMaxtermFilterImpl <em>GSS Filter Maxterm Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterMaxtermFilterImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterMaxtermFilter()
		 * @generated
		 */
		EClass GSS_FILTER_MAXTERM_FILTER = eINSTANCE.getGSSFilterMaxtermFilter();

		/**
		 * The meta object literal for the '<em><b>Format File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_MAXTERM_FILTER__FORMAT_FILE = eINSTANCE.getGSSFilterMaxtermFilter_FormatFile();

		/**
		 * The meta object literal for the '<em><b>Bool Var</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MAXTERM_FILTER__BOOL_VAR = eINSTANCE.getGSSFilterMaxtermFilter_BoolVar();

		/**
		 * The meta object literal for the '<em><b>Bool Var From Array Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = eINSTANCE.getGSSFilterMaxtermFilter_BoolVarFromArrayItem();

		/**
		 * The meta object literal for the '<em><b>Bool Var From Grouped Array Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = eINSTANCE.getGSSFilterMaxtermFilter_BoolVarFromGroupedArrayItem();

		/**
		 * The meta object literal for the '<em><b>Bool Var FDIC</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MAXTERM_FILTER__BOOL_VAR_FDIC = eINSTANCE.getGSSFilterMaxtermFilter_BoolVarFDIC();

		/**
		 * The meta object literal for the '<em><b>Maxterm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MAXTERM_FILTER__MAXTERM = eINSTANCE.getGSSFilterMaxtermFilter_Maxterm();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterMintermFilterImpl <em>GSS Filter Minterm Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterMintermFilterImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterMintermFilter()
		 * @generated
		 */
		EClass GSS_FILTER_MINTERM_FILTER = eINSTANCE.getGSSFilterMintermFilter();

		/**
		 * The meta object literal for the '<em><b>Format File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_MINTERM_FILTER__FORMAT_FILE = eINSTANCE.getGSSFilterMintermFilter_FormatFile();

		/**
		 * The meta object literal for the '<em><b>Bool Var</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MINTERM_FILTER__BOOL_VAR = eINSTANCE.getGSSFilterMintermFilter_BoolVar();

		/**
		 * The meta object literal for the '<em><b>Bool Var From Array Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM = eINSTANCE.getGSSFilterMintermFilter_BoolVarFromArrayItem();

		/**
		 * The meta object literal for the '<em><b>Bool Var From Grouped Array Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM = eINSTANCE.getGSSFilterMintermFilter_BoolVarFromGroupedArrayItem();

		/**
		 * The meta object literal for the '<em><b>Bool Var FDIC</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FDIC = eINSTANCE.getGSSFilterMintermFilter_BoolVarFDIC();

		/**
		 * The meta object literal for the '<em><b>Minterm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MINTERM_FILTER__MINTERM = eINSTANCE.getGSSFilterMintermFilter_Minterm();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterBoolVarImpl <em>GSS Filter Bool Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterBoolVarImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVar()
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
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR__OP = eINSTANCE.getGSSFilterBoolVar_Op();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR__CONSTANT = eINSTANCE.getGSSFilterBoolVar_Constant();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR__SELECT = eINSTANCE.getGSSFilterBoolVar_Select();

		/**
		 * The meta object literal for the '<em><b>Select Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR__SELECT_LINE = eINSTANCE.getGSSFilterBoolVar_SelectLine();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterFieldRefImpl <em>GSS Filter Field Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterFieldRefImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterFieldRef()
		 * @generated
		 */
		EClass GSS_FILTER_FIELD_REF = eINSTANCE.getGSSFilterFieldRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_FIELD_REF__NAME = eINSTANCE.getGSSFilterFieldRef_Name();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterFieldOpImpl <em>GSS Filter Field Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterFieldOpImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterFieldOp()
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
		 * The meta object literal for the '{@link filters.impl.GSSFilterConstantImpl <em>GSS Filter Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterConstantImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterConstant()
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
		 * The meta object literal for the '{@link filters.impl.GSSFilterSelectImpl <em>GSS Filter Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterSelectImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterSelect()
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
		 * The meta object literal for the '{@link filters.impl.GSSFilterSelectLineImpl <em>GSS Filter Select Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterSelectLineImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterSelectLine()
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
		 * The meta object literal for the '{@link filters.impl.GSSFilterBoolVarFromArrayItemImpl <em>GSS Filter Bool Var From Array Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterBoolVarFromArrayItemImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVarFromArrayItem()
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
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP = eINSTANCE.getGSSFilterBoolVarFromArrayItem_Op();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT = eINSTANCE.getGSSFilterBoolVarFromArrayItem_Constant();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT = eINSTANCE.getGSSFilterBoolVarFromArrayItem_Select();

		/**
		 * The meta object literal for the '<em><b>Select Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE = eINSTANCE.getGSSFilterBoolVarFromArrayItem_SelectLine();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterAIFieldRefImpl <em>GSS Filter AI Field Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterAIFieldRefImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterAIFieldRef()
		 * @generated
		 */
		EClass GSS_FILTER_AI_FIELD_REF = eINSTANCE.getGSSFilterAIFieldRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_AI_FIELD_REF__NAME = eINSTANCE.getGSSFilterAIFieldRef_Name();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_AI_FIELD_REF__INDEX = eINSTANCE.getGSSFilterAIFieldRef_Index();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl <em>GSS Filter Bool Var From Grouped Array Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVarFromGroupedArrayItem()
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
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_Op();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_Constant();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_Select();

		/**
		 * The meta object literal for the '<em><b>Select Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE = eINSTANCE.getGSSFilterBoolVarFromGroupedArrayItem_SelectLine();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterAIFieldRefsImpl <em>GSS Filter AI Field Refs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterAIFieldRefsImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterAIFieldRefs()
		 * @generated
		 */
		EClass GSS_FILTER_AI_FIELD_REFS = eINSTANCE.getGSSFilterAIFieldRefs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_FILTER_AI_FIELD_REFS__NAME = eINSTANCE.getGSSFilterAIFieldRefs_Name();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterBoolVarFDICImpl <em>GSS Filter Bool Var FDIC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterBoolVarFDICImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVarFDIC()
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
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_BOOL_VAR_FDIC__OP = eINSTANCE.getGSSFilterBoolVarFDIC_Op();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterMaxtermImpl <em>GSS Filter Maxterm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterMaxtermImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterMaxterm()
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
		 * The meta object literal for the '<em><b>Bool Var Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MAXTERM__BOOL_VAR_REF = eINSTANCE.getGSSFilterMaxterm_BoolVarRef();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterMintermImpl <em>GSS Filter Minterm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterMintermImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterMinterm()
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
		 * The meta object literal for the '<em><b>Bool Var Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_FILTER_MINTERM__BOOL_VAR_REF = eINSTANCE.getGSSFilterMinterm_BoolVarRef();

		/**
		 * The meta object literal for the '{@link filters.impl.GSSFilterBoolVarRefImpl <em>GSS Filter Bool Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.impl.GSSFilterBoolVarRefImpl
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterBoolVarRef()
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
		 * The meta object literal for the '{@link filters.GSSFilterConstantType <em>GSS Filter Constant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.GSSFilterConstantType
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterConstantType()
		 * @generated
		 */
		EEnum GSS_FILTER_CONSTANT_TYPE = eINSTANCE.getGSSFilterConstantType();

		/**
		 * The meta object literal for the '{@link filters.GSSFilterOPType <em>GSS Filter OP Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.GSSFilterOPType
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterOPType()
		 * @generated
		 */
		EEnum GSS_FILTER_OP_TYPE = eINSTANCE.getGSSFilterOPType();

		/**
		 * The meta object literal for the '{@link filters.GSSFilterSelectType <em>GSS Filter Select Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filters.GSSFilterSelectType
		 * @see filters.impl.FiltersPackageImpl#getGSSFilterSelectType()
		 * @generated
		 */
		EEnum GSS_FILTER_SELECT_TYPE = eINSTANCE.getGSSFilterSelectType();

	}

} //FiltersPackage
