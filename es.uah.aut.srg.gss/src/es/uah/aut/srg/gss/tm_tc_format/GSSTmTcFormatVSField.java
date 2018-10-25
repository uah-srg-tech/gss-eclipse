/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.tm_tc_format;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Tm Tc Format VS Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFid <em>Fid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getPfid <em>Pfid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getConstSize <em>Const Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getGlobalOffset <em>Global Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getVariableSize <em>Variable Size</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField()
 * @model
 * @generated
 */
public interface GSSTmTcFormatVSField extends GSSTmTcFormatField {
	/**
	 * Returns the value of the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fid</em>' attribute.
	 * @see #setFid(String)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField_Fid()
	 * @model required="true"
	 * @generated
	 */
	String getFid();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFid <em>Fid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fid</em>' attribute.
	 * @see #getFid()
	 * @generated
	 */
	void setFid(String value);

	/**
	 * Returns the value of the '<em><b>Pfid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pfid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pfid</em>' attribute.
	 * @see #setPfid(String)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField_Pfid()
	 * @model required="true"
	 * @generated
	 */
	String getPfid();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getPfid <em>Pfid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pfid</em>' attribute.
	 * @see #getPfid()
	 * @generated
	 */
	void setPfid(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSTmTcFormatFieldType)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatFieldType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSTmTcFormatFieldType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSTmTcFormatFieldType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSTmTcFormatFieldType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Byte Order</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Order</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder
	 * @see #isSetByteOrder()
	 * @see #unsetByteOrder()
	 * @see #setByteOrder(GSSTmTcFormatFieldByteOrder)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField_ByteOrder()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatFieldByteOrder getByteOrder();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Order</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder
	 * @see #isSetByteOrder()
	 * @see #unsetByteOrder()
	 * @see #getByteOrder()
	 * @generated
	 */
	void setByteOrder(GSSTmTcFormatFieldByteOrder value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByteOrder()
	 * @see #getByteOrder()
	 * @see #setByteOrder(GSSTmTcFormatFieldByteOrder)
	 * @generated
	 */
	void unsetByteOrder();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getByteOrder <em>Byte Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Byte Order</em>' attribute is set.
	 * @see #unsetByteOrder()
	 * @see #getByteOrder()
	 * @see #setByteOrder(GSSTmTcFormatFieldByteOrder)
	 * @generated
	 */
	boolean isSetByteOrder();

	/**
	 * Returns the value of the '<em><b>First Bit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Bit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Bit</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit
	 * @see #isSetFirstBit()
	 * @see #unsetFirstBit()
	 * @see #setFirstBit(GSSTmTcFormatSFieldFirstBit)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField_FirstBit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatSFieldFirstBit getFirstBit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFirstBit <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Bit</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit
	 * @see #isSetFirstBit()
	 * @see #unsetFirstBit()
	 * @see #getFirstBit()
	 * @generated
	 */
	void setFirstBit(GSSTmTcFormatSFieldFirstBit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFirstBit <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstBit()
	 * @see #getFirstBit()
	 * @see #setFirstBit(GSSTmTcFormatSFieldFirstBit)
	 * @generated
	 */
	void unsetFirstBit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getFirstBit <em>First Bit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Bit</em>' attribute is set.
	 * @see #unsetFirstBit()
	 * @see #getFirstBit()
	 * @see #setFirstBit(GSSTmTcFormatSFieldFirstBit)
	 * @generated
	 */
	boolean isSetFirstBit();

	/**
	 * Returns the value of the '<em><b>Const Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Size</em>' containment reference.
	 * @see #setConstSize(GSSTmTcFormatConstSize)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField_ConstSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatConstSize getConstSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getConstSize <em>Const Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const Size</em>' containment reference.
	 * @see #getConstSize()
	 * @generated
	 */
	void setConstSize(GSSTmTcFormatConstSize value);

	/**
	 * Returns the value of the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Offset</em>' containment reference.
	 * @see #setGlobalOffset(GSSTmTcFormatGlobalOffset)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField_GlobalOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatGlobalOffset getGlobalOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getGlobalOffset <em>Global Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Offset</em>' containment reference.
	 * @see #getGlobalOffset()
	 * @generated
	 */
	void setGlobalOffset(GSSTmTcFormatGlobalOffset value);

	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' containment reference.
	 * @see #setMaxSize(GSSTmTcFormatMaxSize)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField_MaxSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatMaxSize getMaxSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getMaxSize <em>Max Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' containment reference.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(GSSTmTcFormatMaxSize value);

	/**
	 * Returns the value of the '<em><b>Variable Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Size</em>' containment reference.
	 * @see #setVariableSize(GSSTmTcFormatVariableSize)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVSField_VariableSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatVariableSize getVariableSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField#getVariableSize <em>Variable Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Size</em>' containment reference.
	 * @see #getVariableSize()
	 * @generated
	 */
	void setVariableSize(GSSTmTcFormatVariableSize value);

} // GSSTmTcFormatVSField
