/**
 */
package filters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Field Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filters.GSSFilterFieldOp#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see filters.FiltersPackage#getGSSFilterFieldOp()
 * @model
 * @generated
 */
public interface GSSFilterFieldOp extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link filters.GSSFilterOPType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see filters.GSSFilterOPType
	 * @see #setType(GSSFilterOPType)
	 * @see filters.FiltersPackage#getGSSFilterFieldOp_Type()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterOPType getType();

	/**
	 * Sets the value of the '{@link filters.GSSFilterFieldOp#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see filters.GSSFilterOPType
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSFilterOPType value);

} // GSSFilterFieldOp
