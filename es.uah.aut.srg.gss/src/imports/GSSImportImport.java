/**
 */
package imports;

import es.uah.aut.srg.gss.common.GSSModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Import Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imports.GSSImportImport#getFrom <em>From</em>}</li>
 *   <li>{@link imports.GSSImportImport#getTo <em>To</em>}</li>
 *   <li>{@link imports.GSSImportImport#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link imports.GSSImportImport#getVirtualSize <em>Virtual Size</em>}</li>
 * </ul>
 *
 * @see imports.ImportsPackage#getGSSImportImport()
 * @model
 * @generated
 */
public interface GSSImportImport extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see imports.ImportsPackage#getGSSImportImport_From()
	 * @model required="true"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link imports.GSSImportImport#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see imports.ImportsPackage#getGSSImportImport_To()
	 * @model required="true"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link imports.GSSImportImport#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(GSSImportDataSource)
	 * @see imports.ImportsPackage#getGSSImportImport_DataSource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSImportDataSource getDataSource();

	/**
	 * Sets the value of the '{@link imports.GSSImportImport#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(GSSImportDataSource value);

	/**
	 * Returns the value of the '<em><b>Virtual Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Size</em>' containment reference.
	 * @see #setVirtualSize(GSSImportVirtualSize)
	 * @see imports.ImportsPackage#getGSSImportImport_VirtualSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSImportVirtualSize getVirtualSize();

	/**
	 * Sets the value of the '{@link imports.GSSImportImport#getVirtualSize <em>Virtual Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Size</em>' containment reference.
	 * @see #getVirtualSize()
	 * @generated
	 */
	void setVirtualSize(GSSImportVirtualSize value);

} // GSSImportImport
