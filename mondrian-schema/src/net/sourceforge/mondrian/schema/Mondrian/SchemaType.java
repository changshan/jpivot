/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchemaType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getCube <em>Cube</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getVirtualCube <em>Virtual Cube</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getRole <em>Role</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getDefaultRole <em>Default Role</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaType()
 * @model 
 * @generated
 */
public interface SchemaType extends EObject {
  /**
   * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.DimensionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaType_Dimension()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.DimensionType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getDimension();

  /**
   * Returns the value of the '<em><b>Cube</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.CubeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cube</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cube</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaType_Cube()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.CubeType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getCube();

  /**
   * Returns the value of the '<em><b>Virtual Cube</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtual Cube</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual Cube</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaType_VirtualCube()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getVirtualCube();

  /**
   * Returns the value of the '<em><b>Role</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.RoleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaType_Role()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.RoleType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getRole();

  /**
   * Returns the value of the '<em><b>Default Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Role</em>' attribute.
   * @see #setDefaultRole(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaType_DefaultRole()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getDefaultRole();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getDefaultRole <em>Default Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Role</em>' attribute.
   * @see #getDefaultRole()
   * @generated
   */
  void setDefaultRole(Object value);

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getSchemaType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

} // SchemaType
