/**
 * <copyright>
 * </copyright>
 *
 * $Id: MondrianFactoryImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import net.sourceforge.mondrian.schema.Mondrian.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MondrianFactoryImpl extends EFactoryImpl implements MondrianFactory {
  /**
   * Creates and instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MondrianFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case MondrianPackage.COLUMN_TYPE: return createColumnType();
      case MondrianPackage.CUBE_GRANT_TYPE: return createCubeGrantType();
      case MondrianPackage.CUBE_TYPE: return createCubeType();
      case MondrianPackage.DIMENSION_GRANT_TYPE: return createDimensionGrantType();
      case MondrianPackage.DIMENSION_TYPE: return createDimensionType();
      case MondrianPackage.DIMENSION_USAGE_TYPE: return createDimensionUsageType();
      case MondrianPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case MondrianPackage.HIERARCHY_GRANT_TYPE: return createHierarchyGrantType();
      case MondrianPackage.HIERARCHY_TYPE: return createHierarchyType();
      case MondrianPackage.JOIN_TYPE: return createJoinType();
      case MondrianPackage.KEY_EXPRESSION_TYPE: return createKeyExpressionType();
      case MondrianPackage.LEVEL_TYPE: return createLevelType();
      case MondrianPackage.MEASURE_TYPE: return createMeasureType();
      case MondrianPackage.MEMBER_GRANT_TYPE: return createMemberGrantType();
      case MondrianPackage.NAME_EXPRESSION_TYPE: return createNameExpressionType();
      case MondrianPackage.ORDINAL_EXPRESSION_TYPE: return createOrdinalExpressionType();
      case MondrianPackage.PARAMETER_TYPE: return createParameterType();
      case MondrianPackage.PARENT_EXPRESSION_TYPE: return createParentExpressionType();
      case MondrianPackage.PROPERTY_TYPE: return createPropertyType();
      case MondrianPackage.ROLE_TYPE: return createRoleType();
      case MondrianPackage.SCHEMA_GRANT_TYPE: return createSchemaGrantType();
      case MondrianPackage.SCHEMA_TYPE: return createSchemaType();
      case MondrianPackage.SQL_TYPE: return createSQLType();
      case MondrianPackage.TABLE_TYPE: return createTableType();
      case MondrianPackage.VIEW_TYPE: return createViewType();
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE: return createVirtualCubeDimensionType();
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE: return createVirtualCubeMeasureType();
      case MondrianPackage.VIRTUAL_CUBE_TYPE: return createVirtualCubeType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case MondrianPackage.ACCESS_TYPE: {
        AccessType result = AccessType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.ACCESS_TYPE1: {
        AccessType1 result = AccessType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.ACCESS_TYPE2: {
        AccessType2 result = AccessType2.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.ACCESS_TYPE3: {
        AccessType3 result = AccessType3.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.ACCESS_TYPE4: {
        AccessType4 result = AccessType4.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.DIALECT_TYPE: {
        DialectType result = DialectType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.HAS_ALL_TYPE: {
        HasAllType result = HasAllType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.HIDE_MEMBER_IF_TYPE: {
        HideMemberIfType result = HideMemberIfType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.LEVEL_TYPE_TYPE: {
        LevelTypeType result = LevelTypeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.TYPE_TYPE: {
        TypeType result = TypeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.TYPE_TYPE1: {
        TypeType1 result = TypeType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.UNIQUE_MEMBERS_TYPE: {
        UniqueMembersType result = UniqueMembersType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
      }
      case MondrianPackage.ACCESS_TYPE_OBJECT:
        return createAccessTypeObjectFromString(eDataType, initialValue);
      case MondrianPackage.ACCESS_TYPE_OBJECT1:
        return createAccessTypeObject1FromString(eDataType, initialValue);
      case MondrianPackage.ACCESS_TYPE_OBJECT2:
        return createAccessTypeObject2FromString(eDataType, initialValue);
      case MondrianPackage.ACCESS_TYPE_OBJECT3:
        return createAccessTypeObject3FromString(eDataType, initialValue);
      case MondrianPackage.ACCESS_TYPE_OBJECT4:
        return createAccessTypeObject4FromString(eDataType, initialValue);
      case MondrianPackage.AGGREGATOR_TYPE:
        return createAggregatorTypeFromString(eDataType, initialValue);
      case MondrianPackage.DIALECT_TYPE_OBJECT:
        return createDialectTypeObjectFromString(eDataType, initialValue);
      case MondrianPackage.HAS_ALL_TYPE_OBJECT:
        return createHasAllTypeObjectFromString(eDataType, initialValue);
      case MondrianPackage.HIDE_MEMBER_IF_TYPE_OBJECT:
        return createHideMemberIfTypeObjectFromString(eDataType, initialValue);
      case MondrianPackage.LEVEL_TYPE_TYPE_OBJECT:
        return createLevelTypeTypeObjectFromString(eDataType, initialValue);
      case MondrianPackage.TYPE_TYPE_OBJECT:
        return createTypeTypeObjectFromString(eDataType, initialValue);
      case MondrianPackage.TYPE_TYPE_OBJECT1:
        return createTypeTypeObject1FromString(eDataType, initialValue);
      case MondrianPackage.UNIQUE_MEMBERS_TYPE_OBJECT:
        return createUniqueMembersTypeObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case MondrianPackage.ACCESS_TYPE:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.ACCESS_TYPE1:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.ACCESS_TYPE2:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.ACCESS_TYPE3:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.ACCESS_TYPE4:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.DIALECT_TYPE:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.HAS_ALL_TYPE:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.HIDE_MEMBER_IF_TYPE:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.LEVEL_TYPE_TYPE:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.TYPE_TYPE:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.TYPE_TYPE1:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.UNIQUE_MEMBERS_TYPE:
        return instanceValue == null ? null : instanceValue.toString();
      case MondrianPackage.ACCESS_TYPE_OBJECT:
        return convertAccessTypeObjectToString(eDataType, instanceValue);
      case MondrianPackage.ACCESS_TYPE_OBJECT1:
        return convertAccessTypeObject1ToString(eDataType, instanceValue);
      case MondrianPackage.ACCESS_TYPE_OBJECT2:
        return convertAccessTypeObject2ToString(eDataType, instanceValue);
      case MondrianPackage.ACCESS_TYPE_OBJECT3:
        return convertAccessTypeObject3ToString(eDataType, instanceValue);
      case MondrianPackage.ACCESS_TYPE_OBJECT4:
        return convertAccessTypeObject4ToString(eDataType, instanceValue);
      case MondrianPackage.AGGREGATOR_TYPE:
        return convertAggregatorTypeToString(eDataType, instanceValue);
      case MondrianPackage.DIALECT_TYPE_OBJECT:
        return convertDialectTypeObjectToString(eDataType, instanceValue);
      case MondrianPackage.HAS_ALL_TYPE_OBJECT:
        return convertHasAllTypeObjectToString(eDataType, instanceValue);
      case MondrianPackage.HIDE_MEMBER_IF_TYPE_OBJECT:
        return convertHideMemberIfTypeObjectToString(eDataType, instanceValue);
      case MondrianPackage.LEVEL_TYPE_TYPE_OBJECT:
        return convertLevelTypeTypeObjectToString(eDataType, instanceValue);
      case MondrianPackage.TYPE_TYPE_OBJECT:
        return convertTypeTypeObjectToString(eDataType, instanceValue);
      case MondrianPackage.TYPE_TYPE_OBJECT1:
        return convertTypeTypeObject1ToString(eDataType, instanceValue);
      case MondrianPackage.UNIQUE_MEMBERS_TYPE_OBJECT:
        return convertUniqueMembersTypeObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnType createColumnType() {
    ColumnTypeImpl columnType = new ColumnTypeImpl();
    return columnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CubeGrantType createCubeGrantType() {
    CubeGrantTypeImpl cubeGrantType = new CubeGrantTypeImpl();
    return cubeGrantType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CubeType createCubeType() {
    CubeTypeImpl cubeType = new CubeTypeImpl();
    return cubeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionGrantType createDimensionGrantType() {
    DimensionGrantTypeImpl dimensionGrantType = new DimensionGrantTypeImpl();
    return dimensionGrantType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionType createDimensionType() {
    DimensionTypeImpl dimensionType = new DimensionTypeImpl();
    return dimensionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimensionUsageType createDimensionUsageType() {
    DimensionUsageTypeImpl dimensionUsageType = new DimensionUsageTypeImpl();
    return dimensionUsageType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot() {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchyGrantType createHierarchyGrantType() {
    HierarchyGrantTypeImpl hierarchyGrantType = new HierarchyGrantTypeImpl();
    return hierarchyGrantType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HierarchyType createHierarchyType() {
    HierarchyTypeImpl hierarchyType = new HierarchyTypeImpl();
    return hierarchyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinType createJoinType() {
    JoinTypeImpl joinType = new JoinTypeImpl();
    return joinType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyExpressionType createKeyExpressionType() {
    KeyExpressionTypeImpl keyExpressionType = new KeyExpressionTypeImpl();
    return keyExpressionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LevelType createLevelType() {
    LevelTypeImpl levelType = new LevelTypeImpl();
    return levelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeasureType createMeasureType() {
    MeasureTypeImpl measureType = new MeasureTypeImpl();
    return measureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberGrantType createMemberGrantType() {
    MemberGrantTypeImpl memberGrantType = new MemberGrantTypeImpl();
    return memberGrantType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExpressionType createNameExpressionType() {
    NameExpressionTypeImpl nameExpressionType = new NameExpressionTypeImpl();
    return nameExpressionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdinalExpressionType createOrdinalExpressionType() {
    OrdinalExpressionTypeImpl ordinalExpressionType = new OrdinalExpressionTypeImpl();
    return ordinalExpressionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType createParameterType() {
    ParameterTypeImpl parameterType = new ParameterTypeImpl();
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentExpressionType createParentExpressionType() {
    ParentExpressionTypeImpl parentExpressionType = new ParentExpressionTypeImpl();
    return parentExpressionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyType createPropertyType() {
    PropertyTypeImpl propertyType = new PropertyTypeImpl();
    return propertyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleType createRoleType() {
    RoleTypeImpl roleType = new RoleTypeImpl();
    return roleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaGrantType createSchemaGrantType() {
    SchemaGrantTypeImpl schemaGrantType = new SchemaGrantTypeImpl();
    return schemaGrantType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaType createSchemaType() {
    SchemaTypeImpl schemaType = new SchemaTypeImpl();
    return schemaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SQLType createSQLType() {
    SQLTypeImpl sqlType = new SQLTypeImpl();
    return sqlType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableType createTableType() {
    TableTypeImpl tableType = new TableTypeImpl();
    return tableType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewType createViewType() {
    ViewTypeImpl viewType = new ViewTypeImpl();
    return viewType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualCubeDimensionType createVirtualCubeDimensionType() {
    VirtualCubeDimensionTypeImpl virtualCubeDimensionType = new VirtualCubeDimensionTypeImpl();
    return virtualCubeDimensionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualCubeMeasureType createVirtualCubeMeasureType() {
    VirtualCubeMeasureTypeImpl virtualCubeMeasureType = new VirtualCubeMeasureTypeImpl();
    return virtualCubeMeasureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualCubeType createVirtualCubeType() {
    VirtualCubeTypeImpl virtualCubeType = new VirtualCubeTypeImpl();
    return virtualCubeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
    return (AccessType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getAccessType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getAccessType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeObject1FromString(EDataType eDataType, String initialValue) {
    return (AccessType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getAccessType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeObject1ToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getAccessType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeObject2FromString(EDataType eDataType, String initialValue) {
    return (AccessType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getAccessType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeObject2ToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getAccessType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeObject3FromString(EDataType eDataType, String initialValue) {
    return (AccessType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getAccessType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeObject3ToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getAccessType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType createAccessTypeObject4FromString(EDataType eDataType, String initialValue) {
    return (AccessType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getAccessType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessTypeObject4ToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getAccessType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createAggregatorTypeFromString(EDataType eDataType, String initialValue) {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getToken(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAggregatorTypeToString(EDataType eDataType, Object instanceValue) {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getToken(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialectType createDialectTypeObjectFromString(EDataType eDataType, String initialValue) {
    return (DialectType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getDialectType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDialectTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getDialectType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasAllType createHasAllTypeObjectFromString(EDataType eDataType, String initialValue) {
    return (HasAllType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getHasAllType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHasAllTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getHasAllType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideMemberIfType createHideMemberIfTypeObjectFromString(EDataType eDataType, String initialValue) {
    return (HideMemberIfType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getHideMemberIfType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHideMemberIfTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getHideMemberIfType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LevelTypeType createLevelTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
    return (LevelTypeType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getLevelTypeType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLevelTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getLevelTypeType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
    return (TypeType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getTypeType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getTypeType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
    return (TypeType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getTypeType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getTypeType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueMembersType createUniqueMembersTypeObjectFromString(EDataType eDataType, String initialValue) {
    return (UniqueMembersType)MondrianFactory.eINSTANCE.createFromString(MondrianPackage.eINSTANCE.getUniqueMembersType(), initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUniqueMembersTypeObjectToString(EDataType eDataType, Object instanceValue) {
    return MondrianFactory.eINSTANCE.convertToString(MondrianPackage.eINSTANCE.getUniqueMembersType(), instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MondrianPackage getMondrianPackage() {
    return (MondrianPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static MondrianPackage getPackage() {
    return MondrianPackage.eINSTANCE;
  }

} //MondrianFactoryImpl
