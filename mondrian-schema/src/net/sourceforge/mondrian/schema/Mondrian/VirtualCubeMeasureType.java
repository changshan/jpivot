/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualCubeMeasureType.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Cube Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType#getCubeName <em>Cube Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getVirtualCubeMeasureType()
 * @model 
 * @generated
 */
public interface VirtualCubeMeasureType extends EObject {
  /**
   * Returns the value of the '<em><b>Cube Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cube Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cube Name</em>' attribute.
   * @see #setCubeName(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getVirtualCubeMeasureType_CubeName()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getCubeName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType#getCubeName <em>Cube Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cube Name</em>' attribute.
   * @see #getCubeName()
   * @generated
   */
  void setCubeName(Object value);

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getVirtualCubeMeasureType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

} // VirtualCubeMeasureType
