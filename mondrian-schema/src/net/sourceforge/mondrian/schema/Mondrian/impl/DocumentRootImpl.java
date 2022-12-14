/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.ColumnType;
import net.sourceforge.mondrian.schema.Mondrian.CubeGrantType;
import net.sourceforge.mondrian.schema.Mondrian.CubeType;
import net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType;
import net.sourceforge.mondrian.schema.Mondrian.DimensionType;
import net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType;
import net.sourceforge.mondrian.schema.Mondrian.DocumentRoot;
import net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType;
import net.sourceforge.mondrian.schema.Mondrian.HierarchyType;
import net.sourceforge.mondrian.schema.Mondrian.JoinType;
import net.sourceforge.mondrian.schema.Mondrian.KeyExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.LevelType;
import net.sourceforge.mondrian.schema.Mondrian.MeasureType;
import net.sourceforge.mondrian.schema.Mondrian.MemberGrantType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.NameExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.ParameterType;
import net.sourceforge.mondrian.schema.Mondrian.ParentExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.PropertyType;
import net.sourceforge.mondrian.schema.Mondrian.RoleType;
import net.sourceforge.mondrian.schema.Mondrian.SQLType;
import net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType;
import net.sourceforge.mondrian.schema.Mondrian.SchemaType;
import net.sourceforge.mondrian.schema.Mondrian.TableType;
import net.sourceforge.mondrian.schema.Mondrian.ViewType;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getCubeGrant <em>Cube Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getDimensionGrant <em>Dimension Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getDimensionUsage <em>Dimension Usage</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getHierarchyGrant <em>Hierarchy Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getKeyExpression <em>Key Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getMemberGrant <em>Member Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getOrdinalExpression <em>Ordinal Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getParentExpression <em>Parent Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getSchemaGrant <em>Schema Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getView <em>View</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getVirtualCube <em>Virtual Cube</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl#getVirtualCubeMeasure <em>Virtual Cube Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected FeatureMap mixed = null;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap xMLNSPrefixMap = null;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap xSISchemaLocation = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getDocumentRoot();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getMixed() {
    if (mixed == null) {
      mixed = new BasicFeatureMap(this, MondrianPackage.DOCUMENT_ROOT__MIXED);
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap getXMLNSPrefixMap() {
    if (xMLNSPrefixMap == null) {
      xMLNSPrefixMap = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, MondrianPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap getXSISchemaLocation() {
    if (xSISchemaLocation == null) {
      xSISchemaLocation = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, MondrianPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnType getColumn() {
    return (ColumnType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Column(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumn(ColumnType newColumn, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Column(), newColumn, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(ColumnType newColumn) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Column(), newColumn);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CubeType getCube() {
    return (CubeType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Cube(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCube(CubeType newCube, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Cube(), newCube, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCube(CubeType newCube) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Cube(), newCube);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CubeGrantType getCubeGrant() {
    return (CubeGrantType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_CubeGrant(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCubeGrant(CubeGrantType newCubeGrant, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_CubeGrant(), newCubeGrant, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCubeGrant(CubeGrantType newCubeGrant) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_CubeGrant(), newCubeGrant);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionType getDimension() {
    return (DimensionType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Dimension(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDimension(DimensionType newDimension, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Dimension(), newDimension, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDimension(DimensionType newDimension) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Dimension(), newDimension);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionGrantType getDimensionGrant() {
    return (DimensionGrantType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_DimensionGrant(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDimensionGrant(DimensionGrantType newDimensionGrant, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_DimensionGrant(), newDimensionGrant, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDimensionGrant(DimensionGrantType newDimensionGrant) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_DimensionGrant(), newDimensionGrant);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionUsageType getDimensionUsage() {
    return (DimensionUsageType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_DimensionUsage(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDimensionUsage(DimensionUsageType newDimensionUsage, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_DimensionUsage(), newDimensionUsage, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDimensionUsage(DimensionUsageType newDimensionUsage) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_DimensionUsage(), newDimensionUsage);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchyType getHierarchy() {
    return (HierarchyType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Hierarchy(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHierarchy(HierarchyType newHierarchy, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Hierarchy(), newHierarchy, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHierarchy(HierarchyType newHierarchy) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Hierarchy(), newHierarchy);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchyGrantType getHierarchyGrant() {
    return (HierarchyGrantType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_HierarchyGrant(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHierarchyGrant(HierarchyGrantType newHierarchyGrant, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_HierarchyGrant(), newHierarchyGrant, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHierarchyGrant(HierarchyGrantType newHierarchyGrant) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_HierarchyGrant(), newHierarchyGrant);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinType getJoin() {
    return (JoinType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Join(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoin(JoinType newJoin, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Join(), newJoin, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoin(JoinType newJoin) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Join(), newJoin);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyExpressionType getKeyExpression() {
    return (KeyExpressionType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_KeyExpression(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyExpression(KeyExpressionType newKeyExpression, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_KeyExpression(), newKeyExpression, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyExpression(KeyExpressionType newKeyExpression) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_KeyExpression(), newKeyExpression);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LevelType getLevel() {
    return (LevelType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Level(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLevel(LevelType newLevel, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Level(), newLevel, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(LevelType newLevel) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Level(), newLevel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeasureType getMeasure() {
    return (MeasureType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Measure(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMeasure(MeasureType newMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMeasure(MeasureType newMeasure) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Measure(), newMeasure);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberGrantType getMemberGrant() {
    return (MemberGrantType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_MemberGrant(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMemberGrant(MemberGrantType newMemberGrant, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_MemberGrant(), newMemberGrant, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemberGrant(MemberGrantType newMemberGrant) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_MemberGrant(), newMemberGrant);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExpressionType getNameExpression() {
    return (NameExpressionType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_NameExpression(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameExpression(NameExpressionType newNameExpression, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_NameExpression(), newNameExpression, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameExpression(NameExpressionType newNameExpression) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_NameExpression(), newNameExpression);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdinalExpressionType getOrdinalExpression() {
    return (OrdinalExpressionType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_OrdinalExpression(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrdinalExpression(OrdinalExpressionType newOrdinalExpression, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_OrdinalExpression(), newOrdinalExpression, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrdinalExpression(OrdinalExpressionType newOrdinalExpression) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_OrdinalExpression(), newOrdinalExpression);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType getParameter() {
    return (ParameterType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Parameter(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(ParameterType newParameter, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Parameter(), newParameter, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(ParameterType newParameter) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Parameter(), newParameter);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentExpressionType getParentExpression() {
    return (ParentExpressionType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_ParentExpression(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentExpression(ParentExpressionType newParentExpression, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_ParentExpression(), newParentExpression, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentExpression(ParentExpressionType newParentExpression) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_ParentExpression(), newParentExpression);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyType getProperty() {
    return (PropertyType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Property(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(PropertyType newProperty, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Property(), newProperty, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(PropertyType newProperty) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Property(), newProperty);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleType getRole() {
    return (RoleType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Role(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRole(RoleType newRole, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Role(), newRole, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(RoleType newRole) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Role(), newRole);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaType getSchema() {
    return (SchemaType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Schema(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchema(SchemaType newSchema, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Schema(), newSchema, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(SchemaType newSchema) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Schema(), newSchema);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaGrantType getSchemaGrant() {
    return (SchemaGrantType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_SchemaGrant(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchemaGrant(SchemaGrantType newSchemaGrant, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_SchemaGrant(), newSchemaGrant, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchemaGrant(SchemaGrantType newSchemaGrant) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_SchemaGrant(), newSchemaGrant);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SQLType getSql() {
    return (SQLType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Sql(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSql(SQLType newSql, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Sql(), newSql, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSql(SQLType newSql) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Sql(), newSql);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableType getTable() {
    return (TableType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_Table(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_Table(), newTable, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(TableType newTable) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_Table(), newTable);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewType getView() {
    return (ViewType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_View(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetView(ViewType newView, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_View(), newView, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView(ViewType newView) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_View(), newView);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualCubeType getVirtualCube() {
    return (VirtualCubeType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCube(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVirtualCube(VirtualCubeType newVirtualCube, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCube(), newVirtualCube, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVirtualCube(VirtualCubeType newVirtualCube) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCube(), newVirtualCube);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualCubeDimensionType getVirtualCubeDimension() {
    return (VirtualCubeDimensionType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCubeDimension(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVirtualCubeDimension(VirtualCubeDimensionType newVirtualCubeDimension, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCubeDimension(), newVirtualCubeDimension, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVirtualCubeDimension(VirtualCubeDimensionType newVirtualCubeDimension) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCubeDimension(), newVirtualCubeDimension);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualCubeMeasureType getVirtualCubeMeasure() {
    return (VirtualCubeMeasureType)getMixed().get(MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCubeMeasure(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVirtualCubeMeasure(VirtualCubeMeasureType newVirtualCubeMeasure, NotificationChain msgs) {
    return ((FeatureMap.Internal)getMixed()).basicAdd(MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCubeMeasure(), newVirtualCubeMeasure, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVirtualCubeMeasure(VirtualCubeMeasureType newVirtualCubeMeasure) {
    ((FeatureMap.Internal)getMixed()).set(MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCubeMeasure(), newVirtualCubeMeasure);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.DOCUMENT_ROOT__MIXED:
          return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
        case MondrianPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
          return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
        case MondrianPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
          return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
        case MondrianPackage.DOCUMENT_ROOT__COLUMN:
          return basicSetColumn(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__CUBE:
          return basicSetCube(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__CUBE_GRANT:
          return basicSetCubeGrant(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__DIMENSION:
          return basicSetDimension(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__DIMENSION_GRANT:
          return basicSetDimensionGrant(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__DIMENSION_USAGE:
          return basicSetDimensionUsage(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__HIERARCHY:
          return basicSetHierarchy(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__HIERARCHY_GRANT:
          return basicSetHierarchyGrant(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__JOIN:
          return basicSetJoin(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__KEY_EXPRESSION:
          return basicSetKeyExpression(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__LEVEL:
          return basicSetLevel(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__MEASURE:
          return basicSetMeasure(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__MEMBER_GRANT:
          return basicSetMemberGrant(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__NAME_EXPRESSION:
          return basicSetNameExpression(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__ORDINAL_EXPRESSION:
          return basicSetOrdinalExpression(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__PARAMETER:
          return basicSetParameter(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__PARENT_EXPRESSION:
          return basicSetParentExpression(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__PROPERTY:
          return basicSetProperty(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__ROLE:
          return basicSetRole(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__SCHEMA:
          return basicSetSchema(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__SCHEMA_GRANT:
          return basicSetSchemaGrant(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__SQL:
          return basicSetSql(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__TABLE:
          return basicSetTable(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__VIEW:
          return basicSetView(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE:
          return basicSetVirtualCube(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_DIMENSION:
          return basicSetVirtualCubeDimension(null, msgs);
        case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_MEASURE:
          return basicSetVirtualCubeMeasure(null, msgs);
        default:
          return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
      }
    }
    return eBasicSetContainer(null, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.DOCUMENT_ROOT__MIXED:
        return getMixed();
      case MondrianPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return getXMLNSPrefixMap();
      case MondrianPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return getXSISchemaLocation();
      case MondrianPackage.DOCUMENT_ROOT__COLUMN:
        return getColumn();
      case MondrianPackage.DOCUMENT_ROOT__CUBE:
        return getCube();
      case MondrianPackage.DOCUMENT_ROOT__CUBE_GRANT:
        return getCubeGrant();
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION:
        return getDimension();
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION_GRANT:
        return getDimensionGrant();
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION_USAGE:
        return getDimensionUsage();
      case MondrianPackage.DOCUMENT_ROOT__HIERARCHY:
        return getHierarchy();
      case MondrianPackage.DOCUMENT_ROOT__HIERARCHY_GRANT:
        return getHierarchyGrant();
      case MondrianPackage.DOCUMENT_ROOT__JOIN:
        return getJoin();
      case MondrianPackage.DOCUMENT_ROOT__KEY_EXPRESSION:
        return getKeyExpression();
      case MondrianPackage.DOCUMENT_ROOT__LEVEL:
        return getLevel();
      case MondrianPackage.DOCUMENT_ROOT__MEASURE:
        return getMeasure();
      case MondrianPackage.DOCUMENT_ROOT__MEMBER_GRANT:
        return getMemberGrant();
      case MondrianPackage.DOCUMENT_ROOT__NAME_EXPRESSION:
        return getNameExpression();
      case MondrianPackage.DOCUMENT_ROOT__ORDINAL_EXPRESSION:
        return getOrdinalExpression();
      case MondrianPackage.DOCUMENT_ROOT__PARAMETER:
        return getParameter();
      case MondrianPackage.DOCUMENT_ROOT__PARENT_EXPRESSION:
        return getParentExpression();
      case MondrianPackage.DOCUMENT_ROOT__PROPERTY:
        return getProperty();
      case MondrianPackage.DOCUMENT_ROOT__ROLE:
        return getRole();
      case MondrianPackage.DOCUMENT_ROOT__SCHEMA:
        return getSchema();
      case MondrianPackage.DOCUMENT_ROOT__SCHEMA_GRANT:
        return getSchemaGrant();
      case MondrianPackage.DOCUMENT_ROOT__SQL:
        return getSql();
      case MondrianPackage.DOCUMENT_ROOT__TABLE:
        return getTable();
      case MondrianPackage.DOCUMENT_ROOT__VIEW:
        return getView();
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE:
        return getVirtualCube();
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_DIMENSION:
        return getVirtualCubeDimension();
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_MEASURE:
        return getVirtualCubeMeasure();
    }
    return eDynamicGet(eFeature, resolve);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(EStructuralFeature eFeature, Object newValue) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        getMixed().addAll((Collection)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        getXMLNSPrefixMap().addAll((Collection)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        getXSISchemaLocation().addAll((Collection)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__COLUMN:
        setColumn((ColumnType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__CUBE:
        setCube((CubeType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__CUBE_GRANT:
        setCubeGrant((CubeGrantType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION:
        setDimension((DimensionType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION_GRANT:
        setDimensionGrant((DimensionGrantType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION_USAGE:
        setDimensionUsage((DimensionUsageType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__HIERARCHY:
        setHierarchy((HierarchyType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__HIERARCHY_GRANT:
        setHierarchyGrant((HierarchyGrantType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__JOIN:
        setJoin((JoinType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__KEY_EXPRESSION:
        setKeyExpression((KeyExpressionType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__LEVEL:
        setLevel((LevelType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__MEASURE:
        setMeasure((MeasureType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__MEMBER_GRANT:
        setMemberGrant((MemberGrantType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__NAME_EXPRESSION:
        setNameExpression((NameExpressionType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__ORDINAL_EXPRESSION:
        setOrdinalExpression((OrdinalExpressionType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__PARAMETER:
        setParameter((ParameterType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__PARENT_EXPRESSION:
        setParentExpression((ParentExpressionType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__PROPERTY:
        setProperty((PropertyType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__ROLE:
        setRole((RoleType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__SCHEMA:
        setSchema((SchemaType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__SCHEMA_GRANT:
        setSchemaGrant((SchemaGrantType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__SQL:
        setSql((SQLType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__TABLE:
        setTable((TableType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__VIEW:
        setView((ViewType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE:
        setVirtualCube((VirtualCubeType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_DIMENSION:
        setVirtualCubeDimension((VirtualCubeDimensionType)newValue);
        return;
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_MEASURE:
        setVirtualCubeMeasure((VirtualCubeMeasureType)newValue);
        return;
    }
    eDynamicSet(eFeature, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(EStructuralFeature eFeature) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        return;
      case MondrianPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case MondrianPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case MondrianPackage.DOCUMENT_ROOT__COLUMN:
        setColumn((ColumnType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__CUBE:
        setCube((CubeType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__CUBE_GRANT:
        setCubeGrant((CubeGrantType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION:
        setDimension((DimensionType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION_GRANT:
        setDimensionGrant((DimensionGrantType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION_USAGE:
        setDimensionUsage((DimensionUsageType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__HIERARCHY:
        setHierarchy((HierarchyType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__HIERARCHY_GRANT:
        setHierarchyGrant((HierarchyGrantType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__JOIN:
        setJoin((JoinType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__KEY_EXPRESSION:
        setKeyExpression((KeyExpressionType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__LEVEL:
        setLevel((LevelType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__MEASURE:
        setMeasure((MeasureType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__MEMBER_GRANT:
        setMemberGrant((MemberGrantType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__NAME_EXPRESSION:
        setNameExpression((NameExpressionType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__ORDINAL_EXPRESSION:
        setOrdinalExpression((OrdinalExpressionType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__PARAMETER:
        setParameter((ParameterType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__PARENT_EXPRESSION:
        setParentExpression((ParentExpressionType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__PROPERTY:
        setProperty((PropertyType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__ROLE:
        setRole((RoleType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__SCHEMA:
        setSchema((SchemaType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__SCHEMA_GRANT:
        setSchemaGrant((SchemaGrantType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__SQL:
        setSql((SQLType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__TABLE:
        setTable((TableType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__VIEW:
        setView((ViewType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE:
        setVirtualCube((VirtualCubeType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_DIMENSION:
        setVirtualCubeDimension((VirtualCubeDimensionType)null);
        return;
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_MEASURE:
        setVirtualCubeMeasure((VirtualCubeMeasureType)null);
        return;
    }
    eDynamicUnset(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(EStructuralFeature eFeature) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.isEmpty();
      case MondrianPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case MondrianPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case MondrianPackage.DOCUMENT_ROOT__COLUMN:
        return getColumn() != null;
      case MondrianPackage.DOCUMENT_ROOT__CUBE:
        return getCube() != null;
      case MondrianPackage.DOCUMENT_ROOT__CUBE_GRANT:
        return getCubeGrant() != null;
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION:
        return getDimension() != null;
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION_GRANT:
        return getDimensionGrant() != null;
      case MondrianPackage.DOCUMENT_ROOT__DIMENSION_USAGE:
        return getDimensionUsage() != null;
      case MondrianPackage.DOCUMENT_ROOT__HIERARCHY:
        return getHierarchy() != null;
      case MondrianPackage.DOCUMENT_ROOT__HIERARCHY_GRANT:
        return getHierarchyGrant() != null;
      case MondrianPackage.DOCUMENT_ROOT__JOIN:
        return getJoin() != null;
      case MondrianPackage.DOCUMENT_ROOT__KEY_EXPRESSION:
        return getKeyExpression() != null;
      case MondrianPackage.DOCUMENT_ROOT__LEVEL:
        return getLevel() != null;
      case MondrianPackage.DOCUMENT_ROOT__MEASURE:
        return getMeasure() != null;
      case MondrianPackage.DOCUMENT_ROOT__MEMBER_GRANT:
        return getMemberGrant() != null;
      case MondrianPackage.DOCUMENT_ROOT__NAME_EXPRESSION:
        return getNameExpression() != null;
      case MondrianPackage.DOCUMENT_ROOT__ORDINAL_EXPRESSION:
        return getOrdinalExpression() != null;
      case MondrianPackage.DOCUMENT_ROOT__PARAMETER:
        return getParameter() != null;
      case MondrianPackage.DOCUMENT_ROOT__PARENT_EXPRESSION:
        return getParentExpression() != null;
      case MondrianPackage.DOCUMENT_ROOT__PROPERTY:
        return getProperty() != null;
      case MondrianPackage.DOCUMENT_ROOT__ROLE:
        return getRole() != null;
      case MondrianPackage.DOCUMENT_ROOT__SCHEMA:
        return getSchema() != null;
      case MondrianPackage.DOCUMENT_ROOT__SCHEMA_GRANT:
        return getSchemaGrant() != null;
      case MondrianPackage.DOCUMENT_ROOT__SQL:
        return getSql() != null;
      case MondrianPackage.DOCUMENT_ROOT__TABLE:
        return getTable() != null;
      case MondrianPackage.DOCUMENT_ROOT__VIEW:
        return getView() != null;
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE:
        return getVirtualCube() != null;
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_DIMENSION:
        return getVirtualCubeDimension() != null;
      case MondrianPackage.DOCUMENT_ROOT__VIRTUAL_CUBE_MEASURE:
        return getVirtualCubeMeasure() != null;
    }
    return eDynamicIsSet(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
