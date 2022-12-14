/**
 * <copyright>
 * </copyright>
 *
 * $Id: CubeGrantType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Grant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getDimensionGrant <em>Dimension Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getHierarchyGrant <em>Hierarchy Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getAccess <em>Access</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getCube <em>Cube</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeGrantType()
 * @model 
 * @generated
 */
public interface CubeGrantType extends EObject {
  /**
   * Returns the value of the '<em><b>Dimension Grant</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension Grant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension Grant</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeGrantType_DimensionGrant()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getDimensionGrant();

  /**
   * Returns the value of the '<em><b>Hierarchy Grant</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hierarchy Grant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hierarchy Grant</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeGrantType_HierarchyGrant()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getHierarchyGrant();

  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The default value is <code>"all"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.AccessType1}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType1
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType1)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeGrantType_Access()
   * @model default="all" unique="false" unsettable="true" required="true"
   * @generated
   */
  AccessType1 getAccess();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType1
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessType1 value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType1)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType1)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Cube</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cube</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cube</em>' attribute.
   * @see #setCube(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeGrantType_Cube()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getCube();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getCube <em>Cube</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cube</em>' attribute.
   * @see #getCube()
   * @generated
   */
  void setCube(Object value);

} // CubeGrantType
