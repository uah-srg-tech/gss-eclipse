/**
 */
package filters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Bool Var From Array Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filters.GSSFilterBoolVarFromArrayItem#getId <em>Id</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromArrayItem#getName <em>Name</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromArrayItem#getOp <em>Op</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromArrayItem#getConstant <em>Constant</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromArrayItem#getSelect <em>Select</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromArrayItem#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @see filters.FiltersPackage#getGSSFilterBoolVarFromArrayItem()
 * @model
 * @generated
 */
public interface GSSFilterBoolVarFromArrayItem extends EObject {
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
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromArrayItem_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromArrayItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromArrayItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromArrayItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constant Type</b></em>' attribute.
	 * The literals are from the enumeration {@link filters.GSSFilterConstantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Type</em>' attribute.
	 * @see filters.GSSFilterConstantType
	 * @see #setConstantType(GSSFilterConstantType)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromArrayItem_ConstantType()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterConstantType getConstantType();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Type</em>' attribute.
	 * @see filters.GSSFilterConstantType
	 * @see #getConstantType()
	 * @generated
	 */
	void setConstantType(GSSFilterConstantType value);

	/**
	 * Returns the value of the '<em><b>AI Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AI Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AI Field Ref</em>' reference.
	 * @see #setAIFieldRef(GSSFilterAIFieldRef)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromArrayItem_AIFieldRef()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterAIFieldRef getAIFieldRef();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AI Field Ref</em>' reference.
	 * @see #getAIFieldRef()
	 * @generated
	 */
	void setAIFieldRef(GSSFilterAIFieldRef value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(GSSFilterFieldOp)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromArrayItem_Op()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterFieldOp getOp();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromArrayItem#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(GSSFilterFieldOp value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' reference.
	 * @see #setConstant(GSSFilterConstant)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromArrayItem_Constant()
	 * @model
	 * @generated
	 */
	GSSFilterConstant getConstant();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromArrayItem#getConstant <em>Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(GSSFilterConstant value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' reference.
	 * @see #setSelect(GSSFilterSelect)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromArrayItem_Select()
	 * @model
	 * @generated
	 */
	GSSFilterSelect getSelect();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromArrayItem#getSelect <em>Select</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(GSSFilterSelect value);

	/**
	 * Returns the value of the '<em><b>Select Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Line</em>' reference.
	 * @see #setSelectLine(GSSFilterSelectLine)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromArrayItem_SelectLine()
	 * @model
	 * @generated
	 */
	GSSFilterSelectLine getSelectLine();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromArrayItem#getSelectLine <em>Select Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Line</em>' reference.
	 * @see #getSelectLine()
	 * @generated
	 */
	void setSelectLine(GSSFilterSelectLine value);

} // GSSFilterBoolVarFromArrayItem
