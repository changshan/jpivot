/**
 * <copyright>
 * </copyright>
 *
 * $Id: LevelTypeType.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Level Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelTypeType()
 * @model
 * @generated
 */
public final class LevelTypeType extends AbstractEnumerator {
  /**
   * The '<em><b>Regular</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REGULAR_LITERAL
   * @model name="Regular"
   * @generated
   * @ordered
   */
  public static final int REGULAR = 0;

  /**
   * The '<em><b>Time Years</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_YEARS_LITERAL
   * @model name="TimeYears"
   * @generated
   * @ordered
   */
  public static final int TIME_YEARS = 1;

  /**
   * The '<em><b>Time Quarters</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_QUARTERS_LITERAL
   * @model name="TimeQuarters"
   * @generated
   * @ordered
   */
  public static final int TIME_QUARTERS = 2;

  /**
   * The '<em><b>Time Months</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_MONTHS_LITERAL
   * @model name="TimeMonths"
   * @generated
   * @ordered
   */
  public static final int TIME_MONTHS = 3;

  /**
   * The '<em><b>Time Weeks</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_WEEKS_LITERAL
   * @model name="TimeWeeks"
   * @generated
   * @ordered
   */
  public static final int TIME_WEEKS = 4;

  /**
   * The '<em><b>Time Days</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_DAYS_LITERAL
   * @model name="TimeDays"
   * @generated
   * @ordered
   */
  public static final int TIME_DAYS = 5;

  /**
   * The '<em><b>Regular</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Regular</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REGULAR
   * @generated
   * @ordered
   */
  public static final LevelTypeType REGULAR_LITERAL = new LevelTypeType(REGULAR, "Regular");

  /**
   * The '<em><b>Time Years</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time Years</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_YEARS
   * @generated
   * @ordered
   */
  public static final LevelTypeType TIME_YEARS_LITERAL = new LevelTypeType(TIME_YEARS, "TimeYears");

  /**
   * The '<em><b>Time Quarters</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time Quarters</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_QUARTERS
   * @generated
   * @ordered
   */
  public static final LevelTypeType TIME_QUARTERS_LITERAL = new LevelTypeType(TIME_QUARTERS, "TimeQuarters");

  /**
   * The '<em><b>Time Months</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time Months</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_MONTHS
   * @generated
   * @ordered
   */
  public static final LevelTypeType TIME_MONTHS_LITERAL = new LevelTypeType(TIME_MONTHS, "TimeMonths");

  /**
   * The '<em><b>Time Weeks</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time Weeks</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_WEEKS
   * @generated
   * @ordered
   */
  public static final LevelTypeType TIME_WEEKS_LITERAL = new LevelTypeType(TIME_WEEKS, "TimeWeeks");

  /**
   * The '<em><b>Time Days</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Time Days</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_DAYS
   * @generated
   * @ordered
   */
  public static final LevelTypeType TIME_DAYS_LITERAL = new LevelTypeType(TIME_DAYS, "TimeDays");

  /**
   * An array of all the '<em><b>Level Type Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LevelTypeType[] VALUES_ARRAY =
    new LevelTypeType[] {
      REGULAR_LITERAL,
      TIME_YEARS_LITERAL,
      TIME_QUARTERS_LITERAL,
      TIME_MONTHS_LITERAL,
      TIME_WEEKS_LITERAL,
      TIME_DAYS_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Level Type Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Level Type Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LevelTypeType get(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LevelTypeType result = VALUES_ARRAY[i];
      if (result.toString().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Level Type Type</b></em>' literal with the specified value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LevelTypeType get(int value) {
    switch (value) {
      case REGULAR: return REGULAR_LITERAL;
      case TIME_YEARS: return TIME_YEARS_LITERAL;
      case TIME_QUARTERS: return TIME_QUARTERS_LITERAL;
      case TIME_MONTHS: return TIME_MONTHS_LITERAL;
      case TIME_WEEKS: return TIME_WEEKS_LITERAL;
      case TIME_DAYS: return TIME_DAYS_LITERAL;
    }
    return null;	
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private LevelTypeType(int value, String name) {
    super(value, name);
  }

} //LevelTypeType
