/**
 * <copyright>
 * </copyright>
 *
 * $Id: HideMemberIfType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hide Member If Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHideMemberIfType()
 * @model
 * @generated
 */
public final class HideMemberIfType extends AbstractEnumerator {
  /**
   * The '<em><b>Never</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEVER_LITERAL
   * @model name="Never"
   * @generated
   * @ordered
   */
  public static final int NEVER = 0;

  /**
   * The '<em><b>If Blank Name</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IF_BLANK_NAME_LITERAL
   * @model name="IfBlankName"
   * @generated
   * @ordered
   */
  public static final int IF_BLANK_NAME = 1;

  /**
   * The '<em><b>If Parents Name</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IF_PARENTS_NAME_LITERAL
   * @model name="IfParentsName"
   * @generated
   * @ordered
   */
  public static final int IF_PARENTS_NAME = 2;

  /**
   * The '<em><b>Never</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Never</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEVER
   * @generated
   * @ordered
   */
  public static final HideMemberIfType NEVER_LITERAL = new HideMemberIfType(NEVER, "Never");

  /**
   * The '<em><b>If Blank Name</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>If Blank Name</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IF_BLANK_NAME
   * @generated
   * @ordered
   */
  public static final HideMemberIfType IF_BLANK_NAME_LITERAL = new HideMemberIfType(IF_BLANK_NAME, "IfBlankName");

  /**
   * The '<em><b>If Parents Name</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>If Parents Name</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IF_PARENTS_NAME
   * @generated
   * @ordered
   */
  public static final HideMemberIfType IF_PARENTS_NAME_LITERAL = new HideMemberIfType(IF_PARENTS_NAME, "IfParentsName");

  /**
   * An array of all the '<em><b>Hide Member If Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final HideMemberIfType[] VALUES_ARRAY =
    new HideMemberIfType[] {
      NEVER_LITERAL,
      IF_BLANK_NAME_LITERAL,
      IF_PARENTS_NAME_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Hide Member If Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Hide Member If Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HideMemberIfType get(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      HideMemberIfType result = VALUES_ARRAY[i];
      if (result.toString().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Hide Member If Type</b></em>' literal with the specified value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HideMemberIfType get(int value) {
    switch (value) {
      case NEVER: return NEVER_LITERAL;
      case IF_BLANK_NAME: return IF_BLANK_NAME_LITERAL;
      case IF_PARENTS_NAME: return IF_PARENTS_NAME_LITERAL;
    }
    return null;	
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private HideMemberIfType(int value, String name) {
    super(value, name);
  }

} //HideMemberIfType
