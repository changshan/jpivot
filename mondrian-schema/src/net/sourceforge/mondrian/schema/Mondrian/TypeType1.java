/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeType1.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getTypeType1()
 * @model
 * @generated
 */
public final class TypeType1 extends AbstractEnumerator {
  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_LITERAL
   * @model name="String"
   * @generated
   * @ordered
   */
  public static final int STRING = 0;

  /**
   * The '<em><b>Numeric</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMERIC_LITERAL
   * @model name="Numeric"
   * @generated
   * @ordered
   */
  public static final int NUMERIC = 1;

  /**
   * The '<em><b>Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_LITERAL
   * @model name="Boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN = 2;

  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @generated
   * @ordered
   */
  public static final TypeType1 STRING_LITERAL = new TypeType1(STRING, "String");

  /**
   * The '<em><b>Numeric</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Numeric</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUMERIC
   * @generated
   * @ordered
   */
  public static final TypeType1 NUMERIC_LITERAL = new TypeType1(NUMERIC, "Numeric");

  /**
   * The '<em><b>Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @generated
   * @ordered
   */
  public static final TypeType1 BOOLEAN_LITERAL = new TypeType1(BOOLEAN, "Boolean");

  /**
   * An array of all the '<em><b>Type Type1</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TypeType1[] VALUES_ARRAY =
    new TypeType1[] {
      STRING_LITERAL,
      NUMERIC_LITERAL,
      BOOLEAN_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Type Type1</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type Type1</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeType1 get(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeType1 result = VALUES_ARRAY[i];
      if (result.toString().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Type1</b></em>' literal with the specified value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeType1 get(int value) {
    switch (value) {
      case STRING: return STRING_LITERAL;
      case NUMERIC: return NUMERIC_LITERAL;
      case BOOLEAN: return BOOLEAN_LITERAL;
    }
    return null;	
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TypeType1(int value, String name) {
    super(value, name);
  }

} //TypeType1
