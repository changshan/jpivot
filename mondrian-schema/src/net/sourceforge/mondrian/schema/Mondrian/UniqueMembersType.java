/**
 * <copyright>
 * </copyright>
 *
 * $Id: UniqueMembersType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unique Members Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getUniqueMembersType()
 * @model
 * @generated
 */
public final class UniqueMembersType extends AbstractEnumerator {
  /**
   * The '<em><b>True</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRUE_LITERAL
   * @model name="true"
   * @generated
   * @ordered
   */
  public static final int TRUE = 0;

  /**
   * The '<em><b>False</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FALSE_LITERAL
   * @model name="false"
   * @generated
   * @ordered
   */
  public static final int FALSE = 1;

  /**
   * The '<em><b>True</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>True</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRUE
   * @generated
   * @ordered
   */
  public static final UniqueMembersType TRUE_LITERAL = new UniqueMembersType(TRUE, "true");

  /**
   * The '<em><b>False</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>False</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FALSE
   * @generated
   * @ordered
   */
  public static final UniqueMembersType FALSE_LITERAL = new UniqueMembersType(FALSE, "false");

  /**
   * An array of all the '<em><b>Unique Members Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UniqueMembersType[] VALUES_ARRAY =
    new UniqueMembersType[] {
      TRUE_LITERAL,
      FALSE_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Unique Members Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Unique Members Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UniqueMembersType get(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UniqueMembersType result = VALUES_ARRAY[i];
      if (result.toString().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Unique Members Type</b></em>' literal with the specified value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UniqueMembersType get(int value) {
    switch (value) {
      case TRUE: return TRUE_LITERAL;
      case FALSE: return FALSE_LITERAL;
    }
    return null;	
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private UniqueMembersType(int value, String name) {
    super(value, name);
  }

} //UniqueMembersType
