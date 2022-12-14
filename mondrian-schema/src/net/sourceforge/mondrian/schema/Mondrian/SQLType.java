/**
 * <copyright>
 * </copyright>
 *
 * $Id: SQLType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SQLType#getValue <em>Value</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SQLType#getDialect <em>Dialect</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSQLType()
 * @model 
 * @generated
 */
public interface SQLType extends EObject {
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSQLType_Value()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.SQLType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Dialect</b></em>' attribute.
   * The default value is <code>"generic"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.DialectType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dialect</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dialect</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.DialectType
   * @see #isSetDialect()
   * @see #unsetDialect()
   * @see #setDialect(DialectType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSQLType_Dialect()
   * @model default="generic" unique="false" unsettable="true"
   * @generated
   */
  DialectType getDialect();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.SQLType#getDialect <em>Dialect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dialect</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.DialectType
   * @see #isSetDialect()
   * @see #unsetDialect()
   * @see #getDialect()
   * @generated
   */
  void setDialect(DialectType value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.SQLType#getDialect <em>Dialect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetDialect()
   * @see #getDialect()
   * @see #setDialect(DialectType)
   * @generated
   */
  void unsetDialect();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.SQLType#getDialect <em>Dialect</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Dialect</em>' attribute is set.
   * @see #unsetDialect()
   * @see #getDialect()
   * @see #setDialect(DialectType)
   * @generated
   */
  boolean isSetDialect();

} // SQLType
