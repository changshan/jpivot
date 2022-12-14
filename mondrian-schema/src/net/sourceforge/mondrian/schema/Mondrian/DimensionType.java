/**
 * <copyright>
 * </copyright>
 *
 * $Id: DimensionType.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDimensionType()
 * @model 
 * @generated
 */
public interface DimensionType extends EObject {
  /**
   * Returns the value of the '<em><b>Hierarchy</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hierarchy</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hierarchy</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDimensionType_Hierarchy()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.HierarchyType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getHierarchy();

  /**
   * Returns the value of the '<em><b>Foreign Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreign Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foreign Key</em>' attribute.
   * @see #setForeignKey(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDimensionType_ForeignKey()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getForeignKey();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType#getForeignKey <em>Foreign Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foreign Key</em>' attribute.
   * @see #getForeignKey()
   * @generated
   */
  void setForeignKey(Object value);

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDimensionType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

} // DimensionType
