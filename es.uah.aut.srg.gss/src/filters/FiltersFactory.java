/**
 */
package filters;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see filters.FiltersPackage
 * @generated
 */
public interface FiltersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiltersFactory eINSTANCE = filters.impl.FiltersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var</em>'.
	 * @generated
	 */
	GSSFilterBoolVar createGSSFilterBoolVar();

	/**
	 * Returns a new object of class '<em>GSS Filter Field Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Field Ref</em>'.
	 * @generated
	 */
	GSSFilterFieldRef createGSSFilterFieldRef();

	/**
	 * Returns a new object of class '<em>GSS Filter Field Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Field Op</em>'.
	 * @generated
	 */
	GSSFilterFieldOp createGSSFilterFieldOp();

	/**
	 * Returns a new object of class '<em>GSS Filter Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Constant</em>'.
	 * @generated
	 */
	GSSFilterConstant createGSSFilterConstant();

	/**
	 * Returns a new object of class '<em>GSS Filter Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Select</em>'.
	 * @generated
	 */
	GSSFilterSelect createGSSFilterSelect();

	/**
	 * Returns a new object of class '<em>GSS Filter Select Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Select Line</em>'.
	 * @generated
	 */
	GSSFilterSelectLine createGSSFilterSelectLine();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var From Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var From Array Item</em>'.
	 * @generated
	 */
	GSSFilterBoolVarFromArrayItem createGSSFilterBoolVarFromArrayItem();

	/**
	 * Returns a new object of class '<em>GSS Filter AI Field Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter AI Field Ref</em>'.
	 * @generated
	 */
	GSSFilterAIFieldRef createGSSFilterAIFieldRef();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var From Grouped Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var From Grouped Array Item</em>'.
	 * @generated
	 */
	GSSFilterBoolVarFromGroupedArrayItem createGSSFilterBoolVarFromGroupedArrayItem();

	/**
	 * Returns a new object of class '<em>GSS Filter AI Field Refs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter AI Field Refs</em>'.
	 * @generated
	 */
	GSSFilterAIFieldRefs createGSSFilterAIFieldRefs();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var FDIC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var FDIC</em>'.
	 * @generated
	 */
	GSSFilterBoolVarFDIC createGSSFilterBoolVarFDIC();

	/**
	 * Returns a new object of class '<em>GSS Filter Maxterm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Maxterm</em>'.
	 * @generated
	 */
	GSSFilterMaxterm createGSSFilterMaxterm();

	/**
	 * Returns a new object of class '<em>GSS Filter Minterm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Minterm</em>'.
	 * @generated
	 */
	GSSFilterMinterm createGSSFilterMinterm();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var Ref</em>'.
	 * @generated
	 */
	GSSFilterBoolVarRef createGSSFilterBoolVarRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FiltersPackage getFiltersPackage();

} //FiltersFactory
