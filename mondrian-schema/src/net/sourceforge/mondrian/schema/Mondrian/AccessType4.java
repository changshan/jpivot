/**
 * <copyright>
 * </copyright>
 *
 * $Id: AccessType4.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Access Type4</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getAccessType4()
 * @model
 * @generated
 */
public final class AccessType4 extends AbstractEnumerator {
  /**
   * The '<em><b>All</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_LITERAL
   * @model name="all"
   * @generated
   * @ordered
   */
  public static final int ALL = 0;

  /**
   * The '<em><b>Custom</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CUSTOM_LITERAL
   * @model name="custom"
   * @generated
   * @ordered
   */
  public static final int CUSTOM = 1;

  /**
   * The '<em><b>None</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_LITERAL
   * @model name="none"
   * @generated
   * @ordered
   */
  public static final int NONE = 2;

  /**
   * The '<em><b>All dimensions</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_DIMENSIONS_LITERAL
   * @model name="all_dimensions"
   * @generated
   * @ordered
   */
  public static final int ALL_DIMENSIONS = 3;

  /**
   * The '<em><b>All</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL
   * @generated
   * @ordered
   */
  public static final AccessType4 ALL_LITERAL = new AccessType4(ALL, "all");

  /**
   * The '<em><b>Custom</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CUSTOM
   * @generated
   * @ordered
   */
  public static final AccessType4 CUSTOM_LITERAL = new AccessType4(CUSTOM, "custom");

  /**
   * The '<em><b>None</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @generated
   * @ordered
   */
  public static final AccessType4 NONE_LITERAL = new AccessType4(NONE, "none");

  /**
   * The '<em><b>All dimensions</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All dimensions</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL_DIMENSIONS
   * @generated
   * @ordered
   */
  public static final AccessType4 ALL_DIMENSIONS_LITERAL = new AccessType4(ALL_DIMENSIONS, "all_dimensions");

  /**
   * An array of all the '<em><b>Access Type4</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AccessType4[] VALUES_ARRAY =
    new AccessType4[] {
      ALL_LITERAL,
      CUSTOM_LITERAL,
      NONE_LITERAL,
      ALL_DIMENSIONS_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Access Type4</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Access Type4</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AccessType4 get(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      AccessType4 result = VALUES_ARRAY[i];
      if (result.toString().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Access Type4</b></em>' literal with the specified value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AccessType4 get(int value) {
    switch (value) {
      case ALL: return ALL_LITERAL;
      case CUSTOM: return CUSTOM_LITERAL;
      case NONE: return NONE_LITERAL;
      case ALL_DIMENSIONS: return ALL_DIMENSIONS_LITERAL;
    }
    return null;	
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private AccessType4(int value, String name) {
    super(value, name);
  }

} //AccessType4
