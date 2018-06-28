/**
 */
package filters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filters.GSSFilterSelect#getFromFile <em>From File</em>}</li>
 *   <li>{@link filters.GSSFilterSelect#getType <em>Type</em>}</li>
 *   <li>{@link filters.GSSFilterSelect#getOffset <em>Offset</em>}</li>
 *   <li>{@link filters.GSSFilterSelect#getSize <em>Size</em>}</li>
 *   <li>{@link filters.GSSFilterSelect#getMask <em>Mask</em>}</li>
 * </ul>
 *
 * @see filters.FiltersPackage#getGSSFilterSelect()
 * @model
 * @generated
 */
public interface GSSFilterSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From File</em>' attribute.
	 * @see #setFromFile(String)
	 * @see filters.FiltersPackage#getGSSFilterSelect_FromFile()
	 * @model required="true"
	 * @generated
	 */
	String getFromFile();

	/**
	 * Sets the value of the '{@link filters.GSSFilterSelect#getFromFile <em>From File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From File</em>' attribute.
	 * @see #getFromFile()
	 * @generated
	 */
	void setFromFile(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link filters.GSSFilterSelectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see filters.GSSFilterSelectType
	 * @see #setType(GSSFilterSelectType)
	 * @see filters.FiltersPackage#getGSSFilterSelect_Type()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterSelectType getType();

	/**
	 * Sets the value of the '{@link filters.GSSFilterSelect#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see filters.GSSFilterSelectType
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSFilterSelectType value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see filters.FiltersPackage#getGSSFilterSelect_Offset()
	 * @model
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link filters.GSSFilterSelect#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see filters.FiltersPackage#getGSSFilterSelect_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link filters.GSSFilterSelect#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(String)
	 * @see filters.FiltersPackage#getGSSFilterSelect_Mask()
	 * @model
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link filters.GSSFilterSelect#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String value);

} // GSSFilterSelect
