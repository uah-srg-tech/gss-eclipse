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
package es.uah.aut.srg.gss.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSS Config Alarm Msg Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigAlarmMsgType()
 * @model
 * @generated
 */
public enum GSSConfigAlarmMsgType implements Enumerator {
	/**
	 * The '<em><b>Alarm1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARM1_VALUE
	 * @generated
	 * @ordered
	 */
	ALARM1(0, "alarm1", "alarm1"),

	/**
	 * The '<em><b>Alarm2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARM2_VALUE
	 * @generated
	 * @ordered
	 */
	ALARM2(1, "alarm2", "alarm2"),

	/**
	 * The '<em><b>Alarm3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARM3_VALUE
	 * @generated
	 * @ordered
	 */
	ALARM3(2, "alarm3", "alarm3");

	/**
	 * The '<em><b>Alarm1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alarm1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALARM1
	 * @model name="alarm1"
	 * @generated
	 * @ordered
	 */
	public static final int ALARM1_VALUE = 0;

	/**
	 * The '<em><b>Alarm2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alarm2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALARM2
	 * @model name="alarm2"
	 * @generated
	 * @ordered
	 */
	public static final int ALARM2_VALUE = 1;

	/**
	 * The '<em><b>Alarm3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alarm3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALARM3
	 * @model name="alarm3"
	 * @generated
	 * @ordered
	 */
	public static final int ALARM3_VALUE = 2;

	/**
	 * An array of all the '<em><b>GSS Config Alarm Msg Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSSConfigAlarmMsgType[] VALUES_ARRAY =
		new GSSConfigAlarmMsgType[] {
			ALARM1,
			ALARM2,
			ALARM3,
		};

	/**
	 * A public read-only list of all the '<em><b>GSS Config Alarm Msg Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSSConfigAlarmMsgType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSS Config Alarm Msg Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSConfigAlarmMsgType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSConfigAlarmMsgType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Config Alarm Msg Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSConfigAlarmMsgType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSConfigAlarmMsgType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Config Alarm Msg Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSConfigAlarmMsgType get(int value) {
		switch (value) {
			case ALARM1_VALUE: return ALARM1;
			case ALARM2_VALUE: return ALARM2;
			case ALARM3_VALUE: return ALARM3;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GSSConfigAlarmMsgType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GSSConfigAlarmMsgType
