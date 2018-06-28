/**
 */
package filters;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Minterm Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filters.GSSFilterMintermFilter#getFormatFile <em>Format File</em>}</li>
 *   <li>{@link filters.GSSFilterMintermFilter#getBoolVar <em>Bool Var</em>}</li>
 *   <li>{@link filters.GSSFilterMintermFilter#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}</li>
 *   <li>{@link filters.GSSFilterMintermFilter#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}</li>
 *   <li>{@link filters.GSSFilterMintermFilter#getBoolVarFDIC <em>Bool Var FDIC</em>}</li>
 *   <li>{@link filters.GSSFilterMintermFilter#getMinterm <em>Minterm</em>}</li>
 * </ul>
 *
 * @see filters.FiltersPackage#getGSSFilterMintermFilter()
 * @model abstract="true"
 * @generated
 */
public interface GSSFilterMintermFilter extends GSSFilterFilter {
	/**
	 * Returns the value of the '<em><b>Format File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format File</em>' attribute.
	 * @see #setFormatFile(String)
	 * @see filters.FiltersPackage#getGSSFilterMintermFilter_FormatFile()
	 * @model required="true"
	 * @generated
	 */
	String getFormatFile();

	/**
	 * Sets the value of the '{@link filters.GSSFilterMintermFilter#getFormatFile <em>Format File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format File</em>' attribute.
	 * @see #getFormatFile()
	 * @generated
	 */
	void setFormatFile(String value);

	/**
	 * Returns the value of the '<em><b>Bool Var</b></em>' reference list.
	 * The list contents are of type {@link filters.GSSFilterBoolVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var</em>' reference list.
	 * @see filters.FiltersPackage#getGSSFilterMintermFilter_BoolVar()
	 * @model
	 * @generated
	 */
	EList<GSSFilterBoolVar> getBoolVar();

	/**
	 * Returns the value of the '<em><b>Bool Var From Array Item</b></em>' reference list.
	 * The list contents are of type {@link filters.GSSFilterBoolVarFromArrayItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var From Array Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var From Array Item</em>' reference list.
	 * @see filters.FiltersPackage#getGSSFilterMintermFilter_BoolVarFromArrayItem()
	 * @model
	 * @generated
	 */
	EList<GSSFilterBoolVarFromArrayItem> getBoolVarFromArrayItem();

	/**
	 * Returns the value of the '<em><b>Bool Var From Grouped Array Item</b></em>' reference list.
	 * The list contents are of type {@link filters.GSSFilterBoolVarFromGroupedArrayItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var From Grouped Array Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var From Grouped Array Item</em>' reference list.
	 * @see filters.FiltersPackage#getGSSFilterMintermFilter_BoolVarFromGroupedArrayItem()
	 * @model
	 * @generated
	 */
	EList<GSSFilterBoolVarFromGroupedArrayItem> getBoolVarFromGroupedArrayItem();

	/**
	 * Returns the value of the '<em><b>Bool Var FDIC</b></em>' reference list.
	 * The list contents are of type {@link filters.GSSFilterBoolVarFDIC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var FDIC</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var FDIC</em>' reference list.
	 * @see filters.FiltersPackage#getGSSFilterMintermFilter_BoolVarFDIC()
	 * @model required="true"
	 * @generated
	 */
	EList<GSSFilterBoolVarFDIC> getBoolVarFDIC();

	/**
	 * Returns the value of the '<em><b>Minterm</b></em>' reference list.
	 * The list contents are of type {@link filters.GSSFilterMinterm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minterm</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minterm</em>' reference list.
	 * @see filters.FiltersPackage#getGSSFilterMintermFilter_Minterm()
	 * @model required="true"
	 * @generated
	 */
	EList<GSSFilterMinterm> getMinterm();

} // GSSFilterMintermFilter
