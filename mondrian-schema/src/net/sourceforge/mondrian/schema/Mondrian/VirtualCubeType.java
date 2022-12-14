/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualCubeType.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Cube Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getVirtualCubeMeasure <em>Virtual Cube Measure</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getVirtualCubeType()
 * @model 
 * @generated
 */
public interface VirtualCubeType extends EObject {
  /**
   * Returns the value of the '<em><b>Virtual Cube Dimension</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtual Cube Dimension</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual Cube Dimension</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getVirtualCubeType_VirtualCubeDimension()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getVirtualCubeDimension();

  /**
   * Returns the value of the '<em><b>Virtual Cube Measure</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtual Cube Measure</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual Cube Measure</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getVirtualCubeType_VirtualCubeMeasure()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getVirtualCubeMeasure();

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getVirtualCubeType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

} // VirtualCubeType
