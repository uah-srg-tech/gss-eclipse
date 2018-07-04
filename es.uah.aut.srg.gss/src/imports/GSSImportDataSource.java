/**
 */
package imports;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Import Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imports.GSSImportDataSource#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link imports.GSSImportDataSource#getLeftTrim <em>Left Trim</em>}</li>
 *   <li>{@link imports.GSSImportDataSource#getRightTrim <em>Right Trim</em>}</li>
 * </ul>
 *
 * @see imports.ImportsPackage#getGSSImportDataSource()
 * @model
 * @generated
 */
public interface GSSImportDataSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' attribute.
	 * @see #setFieldRef(String)
	 * @see imports.ImportsPackage#getGSSImportDataSource_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	String getFieldRef();

	/**
	 * Sets the value of the '{@link imports.GSSImportDataSource#getFieldRef <em>Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' attribute.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(String value);

	/**
	 * Returns the value of the '<em><b>Left Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Trim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Trim</em>' attribute.
	 * @see #setLeftTrim(String)
	 * @see imports.ImportsPackage#getGSSImportDataSource_LeftTrim()
	 * @model required="true"
	 * @generated
	 */
	String getLeftTrim();

	/**
	 * Sets the value of the '{@link imports.GSSImportDataSource#getLeftTrim <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Trim</em>' attribute.
	 * @see #getLeftTrim()
	 * @generated
	 */
	void setLeftTrim(String value);

	/**
	 * Returns the value of the '<em><b>Right Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Trim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Trim</em>' attribute.
	 * @see #setRightTrim(String)
	 * @see imports.ImportsPackage#getGSSImportDataSource_RightTrim()
	 * @model required="true"
	 * @generated
	 */
	String getRightTrim();

	/**
	 * Sets the value of the '{@link imports.GSSImportDataSource#getRightTrim <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Trim</em>' attribute.
	 * @see #getRightTrim()
	 * @generated
	 */
	void setRightTrim(String value);

} // GSSImportDataSource
