/**
 * <copyright>
 * </copyright>
 *
 * $Id: CubeType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getView <em>View</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getJoin <em>Join</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getCubeDimension <em>Cube Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getDimensionUsage <em>Dimension Usage</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getMeasure <em>Measure</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType()
 * @model 
 * @generated
 */
public interface CubeType extends EObject {
  /**
   * Returns the value of the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View</em>' containment reference.
   * @see #setView(ViewType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType_View()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  ViewType getView();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getView <em>View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View</em>' containment reference.
   * @see #getView()
   * @generated
   */
  void setView(ViewType value);

  /**
   * Returns the value of the '<em><b>Join</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join</em>' containment reference.
   * @see #setJoin(JoinType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType_Join()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  JoinType getJoin();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getJoin <em>Join</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join</em>' containment reference.
   * @see #getJoin()
   * @generated
   */
  void setJoin(JoinType value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' containment reference.
   * @see #setTable(TableType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType_Table()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  TableType getTable();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableType value);

  /**
   * Returns the value of the '<em><b>Cube Dimension</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cube Dimension</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cube Dimension</em>' attribute list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType_CubeDimension()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   * @generated
   */
  FeatureMap getCubeDimension();

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType_VirtualCubeDimension()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  EList getVirtualCubeDimension();

  /**
   * Returns the value of the '<em><b>Dimension Usage</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension Usage</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension Usage</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType_DimensionUsage()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  EList getDimensionUsage();

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType_Dimension()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.DimensionType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  EList getDimension();

  /**
   * Returns the value of the '<em><b>Measure</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.MeasureType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measure</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType_Measure()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.MeasureType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getMeasure();

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getCubeType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

} // CubeType
