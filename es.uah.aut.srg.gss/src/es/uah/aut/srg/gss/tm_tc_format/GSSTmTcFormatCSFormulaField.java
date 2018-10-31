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
 * A representation of the model object '<em><b>GSS Tm Tc Format CS Formula Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFid <em>Fid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getPfid <em>Pfid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getGlobalOffset <em>Global Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatCSFormulaField()
 * @model
 * @generated
 */
public interface GSSTmTcFormatCSFormulaField extends GSSTmTcFormatField {
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
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatCSFormulaField_Fid()
	 * @model required="true"
	 * @generated
	 */
	String getFid();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFid <em>Fid</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatCSFormulaField_Pfid()
	 * @model required="true"
	 * @generated
	 */
	String getPfid();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getPfid <em>Pfid</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatCSFormulaField_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatFieldType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSTmTcFormatFieldType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getType <em>Type</em>}' attribute is set.
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
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatCSFormulaField_ByteOrder()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatFieldByteOrder getByteOrder();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getByteOrder <em>Byte Order</em>}' attribute.
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
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByteOrder()
	 * @see #getByteOrder()
	 * @see #setByteOrder(GSSTmTcFormatFieldByteOrder)
	 * @generated
	 */
	void unsetByteOrder();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getByteOrder <em>Byte Order</em>}' attribute is set.
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
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatCSFormulaField_FirstBit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatSFieldFirstBit getFirstBit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFirstBit <em>First Bit</em>}' attribute.
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
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFirstBit <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstBit()
	 * @see #getFirstBit()
	 * @see #setFirstBit(GSSTmTcFormatSFieldFirstBit)
	 * @generated
	 */
	void unsetFirstBit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFirstBit <em>First Bit</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(GSSTmTcFormatSize)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatCSFormulaField_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatSize getSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(GSSTmTcFormatSize value);

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
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatCSFormulaField_GlobalOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatGlobalOffset getGlobalOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getGlobalOffset <em>Global Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Offset</em>' containment reference.
	 * @see #getGlobalOffset()
	 * @generated
	 */
	void setGlobalOffset(GSSTmTcFormatGlobalOffset value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(GSSTmTcFormatFormula)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatCSFormulaField_Formula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTmTcFormatFormula getFormula();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSFormulaField#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(GSSTmTcFormatFormula value);

} // GSSTmTcFormatCSFormulaField
