/**
 * <copyright>
 * </copyright>
 *
 * $Id: RoleType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.RoleType#getSchemaGrant <em>Schema Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.RoleType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getRoleType()
 * @model 
 * @generated
 */
public interface RoleType extends EObject {
  /**
   * Returns the value of the '<em><b>Schema Grant</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema Grant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema Grant</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getRoleType_SchemaGrant()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getSchemaGrant();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getRoleType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.RoleType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

} // RoleType
