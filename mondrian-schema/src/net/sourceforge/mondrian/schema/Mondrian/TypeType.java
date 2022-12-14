/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getTypeType()
 * @model
 * @generated
 */
public final class TypeType extends AbstractEnumerator {
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
  public static final TypeType STRING_LITERAL = new TypeType(STRING, "String");

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
  public static final TypeType NUMERIC_LITERAL = new TypeType(NUMERIC, "Numeric");

  /**
   * An array of all the '<em><b>Type Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TypeType[] VALUES_ARRAY =
    new TypeType[] {
      STRING_LITERAL,
      NUMERIC_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Type Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeType get(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TypeType result = VALUES_ARRAY[i];
      if (result.toString().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Type</b></em>' literal with the specified value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TypeType get(int value) {
    switch (value) {
      case STRING: return STRING_LITERAL;
      case NUMERIC: return NUMERIC_LITERAL;
    }
    return null;	
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TypeType(int value, String name) {
    super(value, name);
  }

} //TypeType
