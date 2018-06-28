/**
 */
package filters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Bool Var Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filters.GSSFilterBoolVarRef#getIdRef <em>Id Ref</em>}</li>
 * </ul>
 *
 * @see filters.FiltersPackage#getGSSFilterBoolVarRef()
 * @model
 * @generated
 */
public interface GSSFilterBoolVarRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Ref</em>' attribute.
	 * @see #setIdRef(String)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarRef_IdRef()
	 * @model required="true"
	 * @generated
	 */
	String getIdRef();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarRef#getIdRef <em>Id Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' attribute.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(String value);

} // GSSFilterBoolVarRef
