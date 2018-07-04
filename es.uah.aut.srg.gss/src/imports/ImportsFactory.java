/**
 */
package imports;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see imports.ImportsPackage
 * @generated
 */
public interface ImportsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImportsFactory eINSTANCE = imports.impl.ImportsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Import Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Import Import</em>'.
	 * @generated
	 */
	GSSImportImport createGSSImportImport();

	/**
	 * Returns a new object of class '<em>GSS Import Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Import Data Source</em>'.
	 * @generated
	 */
	GSSImportDataSource createGSSImportDataSource();

	/**
	 * Returns a new object of class '<em>GSS Import Virtual Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Import Virtual Size</em>'.
	 * @generated
	 */
	GSSImportVirtualSize createGSSImportVirtualSize();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImportsPackage getImportsPackage();

} //ImportsFactory
