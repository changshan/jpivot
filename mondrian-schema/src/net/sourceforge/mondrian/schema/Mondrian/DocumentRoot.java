/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getColumn <em>Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getCube <em>Cube</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getCubeGrant <em>Cube Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimensionGrant <em>Dimension Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimensionUsage <em>Dimension Usage</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getHierarchyGrant <em>Hierarchy Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getJoin <em>Join</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getKeyExpression <em>Key Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getLevel <em>Level</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMeasure <em>Measure</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMemberGrant <em>Member Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getOrdinalExpression <em>Ordinal Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getParentExpression <em>Parent Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getRole <em>Role</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSchema <em>Schema</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSchemaGrant <em>Schema Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSql <em>Sql</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getView <em>View</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCube <em>Virtual Cube</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCubeMeasure <em>Virtual Cube Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot()
 * @model 
 * @generated
 */
public interface DocumentRoot extends EObject {
  /**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   * @generated
   */
  FeatureMap getMixed();

  /**
   * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XMLNS Prefix Map</em>' map.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_XMLNSPrefixMap()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
   * @generated
   */
  EMap getXMLNSPrefixMap();

  /**
   * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XSI Schema Location</em>' map.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
   * @generated
   */
  EMap getXSISchemaLocation();

  /**
   * Returns the value of the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' containment reference.
   * @see #setColumn(ColumnType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Column()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  ColumnType getColumn();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getColumn <em>Column</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' containment reference.
   * @see #getColumn()
   * @generated
   */
  void setColumn(ColumnType value);

  /**
   * Returns the value of the '<em><b>Cube</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cube</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cube</em>' containment reference.
   * @see #setCube(CubeType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Cube()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  CubeType getCube();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getCube <em>Cube</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cube</em>' containment reference.
   * @see #getCube()
   * @generated
   */
  void setCube(CubeType value);

  /**
   * Returns the value of the '<em><b>Cube Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cube Grant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cube Grant</em>' containment reference.
   * @see #setCubeGrant(CubeGrantType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_CubeGrant()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  CubeGrantType getCubeGrant();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getCubeGrant <em>Cube Grant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cube Grant</em>' containment reference.
   * @see #getCubeGrant()
   * @generated
   */
  void setCubeGrant(CubeGrantType value);

  /**
   * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension</em>' containment reference.
   * @see #setDimension(DimensionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Dimension()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  DimensionType getDimension();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimension <em>Dimension</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimension</em>' containment reference.
   * @see #getDimension()
   * @generated
   */
  void setDimension(DimensionType value);

  /**
   * Returns the value of the '<em><b>Dimension Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension Grant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension Grant</em>' containment reference.
   * @see #setDimensionGrant(DimensionGrantType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_DimensionGrant()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  DimensionGrantType getDimensionGrant();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimensionGrant <em>Dimension Grant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimension Grant</em>' containment reference.
   * @see #getDimensionGrant()
   * @generated
   */
  void setDimensionGrant(DimensionGrantType value);

  /**
   * Returns the value of the '<em><b>Dimension Usage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension Usage</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension Usage</em>' containment reference.
   * @see #setDimensionUsage(DimensionUsageType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_DimensionUsage()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  DimensionUsageType getDimensionUsage();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimensionUsage <em>Dimension Usage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimension Usage</em>' containment reference.
   * @see #getDimensionUsage()
   * @generated
   */
  void setDimensionUsage(DimensionUsageType value);

  /**
   * Returns the value of the '<em><b>Hierarchy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hierarchy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hierarchy</em>' containment reference.
   * @see #setHierarchy(HierarchyType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Hierarchy()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  HierarchyType getHierarchy();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getHierarchy <em>Hierarchy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hierarchy</em>' containment reference.
   * @see #getHierarchy()
   * @generated
   */
  void setHierarchy(HierarchyType value);

  /**
   * Returns the value of the '<em><b>Hierarchy Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hierarchy Grant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hierarchy Grant</em>' containment reference.
   * @see #setHierarchyGrant(HierarchyGrantType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_HierarchyGrant()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  HierarchyGrantType getHierarchyGrant();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getHierarchyGrant <em>Hierarchy Grant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hierarchy Grant</em>' containment reference.
   * @see #getHierarchyGrant()
   * @generated
   */
  void setHierarchyGrant(HierarchyGrantType value);

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Join()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  JoinType getJoin();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getJoin <em>Join</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join</em>' containment reference.
   * @see #getJoin()
   * @generated
   */
  void setJoin(JoinType value);

  /**
   * Returns the value of the '<em><b>Key Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Expression</em>' containment reference.
   * @see #setKeyExpression(KeyExpressionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_KeyExpression()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  KeyExpressionType getKeyExpression();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getKeyExpression <em>Key Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Expression</em>' containment reference.
   * @see #getKeyExpression()
   * @generated
   */
  void setKeyExpression(KeyExpressionType value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' containment reference.
   * @see #setLevel(LevelType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Level()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  LevelType getLevel();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getLevel <em>Level</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' containment reference.
   * @see #getLevel()
   * @generated
   */
  void setLevel(LevelType value);

  /**
   * Returns the value of the '<em><b>Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Measure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Measure</em>' containment reference.
   * @see #setMeasure(MeasureType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Measure()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  MeasureType getMeasure();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMeasure <em>Measure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Measure</em>' containment reference.
   * @see #getMeasure()
   * @generated
   */
  void setMeasure(MeasureType value);

  /**
   * Returns the value of the '<em><b>Member Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Grant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Grant</em>' containment reference.
   * @see #setMemberGrant(MemberGrantType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_MemberGrant()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  MemberGrantType getMemberGrant();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMemberGrant <em>Member Grant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member Grant</em>' containment reference.
   * @see #getMemberGrant()
   * @generated
   */
  void setMemberGrant(MemberGrantType value);

  /**
   * Returns the value of the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Expression</em>' containment reference.
   * @see #setNameExpression(NameExpressionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_NameExpression()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  NameExpressionType getNameExpression();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getNameExpression <em>Name Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Expression</em>' containment reference.
   * @see #getNameExpression()
   * @generated
   */
  void setNameExpression(NameExpressionType value);

  /**
   * Returns the value of the '<em><b>Ordinal Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordinal Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordinal Expression</em>' containment reference.
   * @see #setOrdinalExpression(OrdinalExpressionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_OrdinalExpression()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  OrdinalExpressionType getOrdinalExpression();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getOrdinalExpression <em>Ordinal Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordinal Expression</em>' containment reference.
   * @see #getOrdinalExpression()
   * @generated
   */
  void setOrdinalExpression(OrdinalExpressionType value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(ParameterType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Parameter()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  ParameterType getParameter();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(ParameterType value);

  /**
   * Returns the value of the '<em><b>Parent Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Expression</em>' containment reference.
   * @see #setParentExpression(ParentExpressionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_ParentExpression()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  ParentExpressionType getParentExpression();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getParentExpression <em>Parent Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Expression</em>' containment reference.
   * @see #getParentExpression()
   * @generated
   */
  void setParentExpression(ParentExpressionType value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(PropertyType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Property()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  PropertyType getProperty();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(PropertyType value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' containment reference.
   * @see #setRole(RoleType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Role()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  RoleType getRole();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getRole <em>Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' containment reference.
   * @see #getRole()
   * @generated
   */
  void setRole(RoleType value);

  /**
   * Returns the value of the '<em><b>Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' containment reference.
   * @see #setSchema(SchemaType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Schema()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  SchemaType getSchema();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSchema <em>Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' containment reference.
   * @see #getSchema()
   * @generated
   */
  void setSchema(SchemaType value);

  /**
   * Returns the value of the '<em><b>Schema Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema Grant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema Grant</em>' containment reference.
   * @see #setSchemaGrant(SchemaGrantType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_SchemaGrant()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  SchemaGrantType getSchemaGrant();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSchemaGrant <em>Schema Grant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema Grant</em>' containment reference.
   * @see #getSchemaGrant()
   * @generated
   */
  void setSchemaGrant(SchemaGrantType value);

  /**
   * Returns the value of the '<em><b>Sql</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sql</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sql</em>' containment reference.
   * @see #setSql(SQLType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Sql()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  SQLType getSql();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSql <em>Sql</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sql</em>' containment reference.
   * @see #getSql()
   * @generated
   */
  void setSql(SQLType value);

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_Table()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  TableType getTable();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getTable <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' containment reference.
   * @see #getTable()
   * @generated
   */
  void setTable(TableType value);

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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_View()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  ViewType getView();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getView <em>View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View</em>' containment reference.
   * @see #getView()
   * @generated
   */
  void setView(ViewType value);

  /**
   * Returns the value of the '<em><b>Virtual Cube</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtual Cube</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual Cube</em>' containment reference.
   * @see #setVirtualCube(VirtualCubeType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_VirtualCube()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  VirtualCubeType getVirtualCube();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCube <em>Virtual Cube</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Virtual Cube</em>' containment reference.
   * @see #getVirtualCube()
   * @generated
   */
  void setVirtualCube(VirtualCubeType value);

  /**
   * Returns the value of the '<em><b>Virtual Cube Dimension</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtual Cube Dimension</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual Cube Dimension</em>' containment reference.
   * @see #setVirtualCubeDimension(VirtualCubeDimensionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_VirtualCubeDimension()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  VirtualCubeDimensionType getVirtualCubeDimension();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Virtual Cube Dimension</em>' containment reference.
   * @see #getVirtualCubeDimension()
   * @generated
   */
  void setVirtualCubeDimension(VirtualCubeDimensionType value);

  /**
   * Returns the value of the '<em><b>Virtual Cube Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtual Cube Measure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual Cube Measure</em>' containment reference.
   * @see #setVirtualCubeMeasure(VirtualCubeMeasureType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDocumentRoot_VirtualCubeMeasure()
   * @model containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
   * @generated
   */
  VirtualCubeMeasureType getVirtualCubeMeasure();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCubeMeasure <em>Virtual Cube Measure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Virtual Cube Measure</em>' containment reference.
   * @see #getVirtualCubeMeasure()
   * @generated
   */
  void setVirtualCubeMeasure(VirtualCubeMeasureType value);

} // DocumentRoot
