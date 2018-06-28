/**
 */
package filters;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Bool Var From Grouped Array Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getId <em>Id</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getName <em>Name</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getGroup <em>Group</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getAIFieldRefs <em>AI Field Refs</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getOp <em>Op</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getConstant <em>Constant</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getSelect <em>Select</em>}</li>
 *   <li>{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem()
 * @model
 * @generated
 */
public interface GSSFilterBoolVarFromGroupedArrayItem extends EObject {
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
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getId <em>Id</em>}' attribute.
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
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getName <em>Name</em>}' attribute.
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
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem_ConstantType()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterConstantType getConstantType();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getConstantType <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Type</em>' attribute.
	 * @see filters.GSSFilterConstantType
	 * @see #getConstantType()
	 * @generated
	 */
	void setConstantType(GSSFilterConstantType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem_Group()
	 * @model required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>AI Field Refs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AI Field Refs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AI Field Refs</em>' reference.
	 * @see #setAIFieldRefs(GSSFilterAIFieldRefs)
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem_AIFieldRefs()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterAIFieldRefs getAIFieldRefs();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getAIFieldRefs <em>AI Field Refs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AI Field Refs</em>' reference.
	 * @see #getAIFieldRefs()
	 * @generated
	 */
	void setAIFieldRefs(GSSFilterAIFieldRefs value);

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
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem_Op()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterFieldOp getOp();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getOp <em>Op</em>}' reference.
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
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem_Constant()
	 * @model
	 * @generated
	 */
	GSSFilterConstant getConstant();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getConstant <em>Constant</em>}' reference.
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
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem_Select()
	 * @model
	 * @generated
	 */
	GSSFilterSelect getSelect();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getSelect <em>Select</em>}' reference.
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
	 * @see filters.FiltersPackage#getGSSFilterBoolVarFromGroupedArrayItem_SelectLine()
	 * @model
	 * @generated
	 */
	GSSFilterSelectLine getSelectLine();

	/**
	 * Sets the value of the '{@link filters.GSSFilterBoolVarFromGroupedArrayItem#getSelectLine <em>Select Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Line</em>' reference.
	 * @see #getSelectLine()
	 * @generated
	 */
	void setSelectLine(GSSFilterSelectLine value);

} // GSSFilterBoolVarFromGroupedArrayItem
