/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchemaGrantType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Grant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType#getCubeGrant <em>Cube Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType#getAccess <em>Access</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaGrantType()
 * @model 
 * @generated
 */
public interface SchemaGrantType extends EObject {
  /**
   * Returns the value of the '<em><b>Cube Grant</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cube Grant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cube Grant</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaGrantType_CubeGrant()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.CubeGrantType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getCubeGrant();

  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The default value is <code>"all"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.AccessType2}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType2
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType2)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaGrantType_Access()
   * @model default="all" unique="false" unsettable="true" required="true"
   * @generated
   */
  AccessType2 getAccess();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType2
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessType2 value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType2)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType2)
   * @generated
   */
  boolean isSetAccess();

} // SchemaGrantType
