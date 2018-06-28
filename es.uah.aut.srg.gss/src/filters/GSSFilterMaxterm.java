/**
 */
package filters;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Maxterm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filters.GSSFilterMaxterm#getId <em>Id</em>}</li>
 *   <li>{@link filters.GSSFilterMaxterm#getBoolVarRef <em>Bool Var Ref</em>}</li>
 * </ul>
 *
 * @see filters.FiltersPackage#getGSSFilterMaxterm()
 * @model
 * @generated
 */
public interface GSSFilterMaxterm extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see filters.FiltersPackage#getGSSFilterMaxterm_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link filters.GSSFilterMaxterm#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Bool Var Ref</b></em>' reference list.
	 * The list contents are of type {@link filters.GSSFilterBoolVarRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var Ref</em>' reference list.
	 * @see filters.FiltersPackage#getGSSFilterMaxterm_BoolVarRef()
	 * @model required="true"
	 * @generated
	 */
	EList<GSSFilterBoolVarRef> getBoolVarRef();

} // GSSFilterMaxterm
