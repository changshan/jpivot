/**
 * <copyright>
 * </copyright>
 *
 * $Id: DialectType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dialect Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDialectType()
 * @model
 * @generated
 */
public final class DialectType extends AbstractEnumerator {
  /**
   * The '<em><b>Generic</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GENERIC_LITERAL
   * @model name="generic"
   * @generated
   * @ordered
   */
  public static final int GENERIC = 0;

  /**
   * The '<em><b>Oracle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORACLE_LITERAL
   * @model name="oracle"
   * @generated
   * @ordered
   */
  public static final int ORACLE = 1;

  /**
   * The '<em><b>Mysql</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MYSQL_LITERAL
   * @model name="mysql"
   * @generated
   * @ordered
   */
  public static final int MYSQL = 2;

  /**
   * The '<em><b>Access</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACCESS_LITERAL
   * @model name="access"
   * @generated
   * @ordered
   */
  public static final int ACCESS = 3;

  /**
   * The '<em><b>Postgres</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSTGRES_LITERAL
   * @model name="postgres"
   * @generated
   * @ordered
   */
  public static final int POSTGRES = 4;

  /**
   * The '<em><b>Hsqldb</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HSQLDB_LITERAL
   * @model name="hsqldb"
   * @generated
   * @ordered
   */
  public static final int HSQLDB = 5;

  /**
   * The '<em><b>Mssql</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MSSQL_LITERAL
   * @model name="mssql"
   * @generated
   * @ordered
   */
  public static final int MSSQL = 6;

  /**
   * The '<em><b>Generic</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Generic</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GENERIC
   * @generated
   * @ordered
   */
  public static final DialectType GENERIC_LITERAL = new DialectType(GENERIC, "generic");

  /**
   * The '<em><b>Oracle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Oracle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ORACLE
   * @generated
   * @ordered
   */
  public static final DialectType ORACLE_LITERAL = new DialectType(ORACLE, "oracle");

  /**
   * The '<em><b>Mysql</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mysql</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MYSQL
   * @generated
   * @ordered
   */
  public static final DialectType MYSQL_LITERAL = new DialectType(MYSQL, "mysql");

  /**
   * The '<em><b>Access</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Access</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACCESS
   * @generated
   * @ordered
   */
  public static final DialectType ACCESS_LITERAL = new DialectType(ACCESS, "access");

  /**
   * The '<em><b>Postgres</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Postgres</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POSTGRES
   * @generated
   * @ordered
   */
  public static final DialectType POSTGRES_LITERAL = new DialectType(POSTGRES, "postgres");

  /**
   * The '<em><b>Hsqldb</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Hsqldb</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HSQLDB
   * @generated
   * @ordered
   */
  public static final DialectType HSQLDB_LITERAL = new DialectType(HSQLDB, "hsqldb");

  /**
   * The '<em><b>Mssql</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mssql</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MSSQL
   * @generated
   * @ordered
   */
  public static final DialectType MSSQL_LITERAL = new DialectType(MSSQL, "mssql");

  /**
   * An array of all the '<em><b>Dialect Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DialectType[] VALUES_ARRAY =
    new DialectType[] {
      GENERIC_LITERAL,
      ORACLE_LITERAL,
      MYSQL_LITERAL,
      ACCESS_LITERAL,
      POSTGRES_LITERAL,
      HSQLDB_LITERAL,
      MSSQL_LITERAL,
    };

  /**
   * A public read-only list of all the '<em><b>Dialect Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dialect Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DialectType get(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      DialectType result = VALUES_ARRAY[i];
      if (result.toString().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dialect Type</b></em>' literal with the specified value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DialectType get(int value) {
    switch (value) {
      case GENERIC: return GENERIC_LITERAL;
      case ORACLE: return ORACLE_LITERAL;
      case MYSQL: return MYSQL_LITERAL;
      case ACCESS: return ACCESS_LITERAL;
      case POSTGRES: return POSTGRES_LITERAL;
      case HSQLDB: return HSQLDB_LITERAL;
      case MSSQL: return MSSQL_LITERAL;
    }
    return null;	
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DialectType(int value, String name) {
    super(value, name);
  }

} //DialectType
