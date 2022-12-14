/**
 * <copyright>
 * </copyright>
 *
 * $Id: MondrianValidator.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.util;

import java.util.Collection;
import java.util.Map;

import net.sourceforge.mondrian.schema.Mondrian.*;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage
 * @generated
 */
public class MondrianValidator extends EObjectValidator {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final MondrianValidator INSTANCE = new MondrianValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "net.sourceforge.mondrian.schema.Mondrian";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator xmlTypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MondrianValidator() {
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPackage getEPackage() {
    return MondrianPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresonding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
    switch (classifierID) {
      case MondrianPackage.COLUMN_TYPE:
        return validateColumnType((ColumnType)value, diagnostics, context);
      case MondrianPackage.CUBE_GRANT_TYPE:
        return validateCubeGrantType((CubeGrantType)value, diagnostics, context);
      case MondrianPackage.CUBE_TYPE:
        return validateCubeType((CubeType)value, diagnostics, context);
      case MondrianPackage.DIMENSION_GRANT_TYPE:
        return validateDimensionGrantType((DimensionGrantType)value, diagnostics, context);
      case MondrianPackage.DIMENSION_TYPE:
        return validateDimensionType((DimensionType)value, diagnostics, context);
      case MondrianPackage.DIMENSION_USAGE_TYPE:
        return validateDimensionUsageType((DimensionUsageType)value, diagnostics, context);
      case MondrianPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case MondrianPackage.HIERARCHY_GRANT_TYPE:
        return validateHierarchyGrantType((HierarchyGrantType)value, diagnostics, context);
      case MondrianPackage.HIERARCHY_TYPE:
        return validateHierarchyType((HierarchyType)value, diagnostics, context);
      case MondrianPackage.JOIN_TYPE:
        return validateJoinType((JoinType)value, diagnostics, context);
      case MondrianPackage.KEY_EXPRESSION_TYPE:
        return validateKeyExpressionType((KeyExpressionType)value, diagnostics, context);
      case MondrianPackage.LEVEL_TYPE:
        return validateLevelType((LevelType)value, diagnostics, context);
      case MondrianPackage.MEASURE_TYPE:
        return validateMeasureType((MeasureType)value, diagnostics, context);
      case MondrianPackage.MEMBER_GRANT_TYPE:
        return validateMemberGrantType((MemberGrantType)value, diagnostics, context);
      case MondrianPackage.NAME_EXPRESSION_TYPE:
        return validateNameExpressionType((NameExpressionType)value, diagnostics, context);
      case MondrianPackage.ORDINAL_EXPRESSION_TYPE:
        return validateOrdinalExpressionType((OrdinalExpressionType)value, diagnostics, context);
      case MondrianPackage.PARAMETER_TYPE:
        return validateParameterType((ParameterType)value, diagnostics, context);
      case MondrianPackage.PARENT_EXPRESSION_TYPE:
        return validateParentExpressionType((ParentExpressionType)value, diagnostics, context);
      case MondrianPackage.PROPERTY_TYPE:
        return validatePropertyType((PropertyType)value, diagnostics, context);
      case MondrianPackage.ROLE_TYPE:
        return validateRoleType((RoleType)value, diagnostics, context);
      case MondrianPackage.SCHEMA_GRANT_TYPE:
        return validateSchemaGrantType((SchemaGrantType)value, diagnostics, context);
      case MondrianPackage.SCHEMA_TYPE:
        return validateSchemaType((SchemaType)value, diagnostics, context);
      case MondrianPackage.SQL_TYPE:
        return validateSQLType((SQLType)value, diagnostics, context);
      case MondrianPackage.TABLE_TYPE:
        return validateTableType((TableType)value, diagnostics, context);
      case MondrianPackage.VIEW_TYPE:
        return validateViewType((ViewType)value, diagnostics, context);
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE:
        return validateVirtualCubeDimensionType((VirtualCubeDimensionType)value, diagnostics, context);
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE:
        return validateVirtualCubeMeasureType((VirtualCubeMeasureType)value, diagnostics, context);
      case MondrianPackage.VIRTUAL_CUBE_TYPE:
        return validateVirtualCubeType((VirtualCubeType)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE:
        return validateAccessType((Object)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE1:
        return validateAccessType1((Object)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE2:
        return validateAccessType2((Object)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE3:
        return validateAccessType3((Object)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE4:
        return validateAccessType4((Object)value, diagnostics, context);
      case MondrianPackage.DIALECT_TYPE:
        return validateDialectType((Object)value, diagnostics, context);
      case MondrianPackage.HAS_ALL_TYPE:
        return validateHasAllType((Object)value, diagnostics, context);
      case MondrianPackage.HIDE_MEMBER_IF_TYPE:
        return validateHideMemberIfType((Object)value, diagnostics, context);
      case MondrianPackage.LEVEL_TYPE_TYPE:
        return validateLevelTypeType((Object)value, diagnostics, context);
      case MondrianPackage.TYPE_TYPE:
        return validateTypeType((Object)value, diagnostics, context);
      case MondrianPackage.TYPE_TYPE1:
        return validateTypeType1((Object)value, diagnostics, context);
      case MondrianPackage.UNIQUE_MEMBERS_TYPE:
        return validateUniqueMembersType((Object)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE_OBJECT:
        return validateAccessTypeObject((AccessType)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE_OBJECT1:
        return validateAccessTypeObject1((AccessType)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE_OBJECT2:
        return validateAccessTypeObject2((AccessType)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE_OBJECT3:
        return validateAccessTypeObject3((AccessType)value, diagnostics, context);
      case MondrianPackage.ACCESS_TYPE_OBJECT4:
        return validateAccessTypeObject4((AccessType)value, diagnostics, context);
      case MondrianPackage.AGGREGATOR_TYPE:
        return validateAggregatorType((String)value, diagnostics, context);
      case MondrianPackage.DIALECT_TYPE_OBJECT:
        return validateDialectTypeObject((DialectType)value, diagnostics, context);
      case MondrianPackage.HAS_ALL_TYPE_OBJECT:
        return validateHasAllTypeObject((HasAllType)value, diagnostics, context);
      case MondrianPackage.HIDE_MEMBER_IF_TYPE_OBJECT:
        return validateHideMemberIfTypeObject((HideMemberIfType)value, diagnostics, context);
      case MondrianPackage.LEVEL_TYPE_TYPE_OBJECT:
        return validateLevelTypeTypeObject((LevelTypeType)value, diagnostics, context);
      case MondrianPackage.TYPE_TYPE_OBJECT:
        return validateTypeTypeObject((TypeType)value, diagnostics, context);
      case MondrianPackage.TYPE_TYPE_OBJECT1:
        return validateTypeTypeObject1((TypeType)value, diagnostics, context);
      case MondrianPackage.UNIQUE_MEMBERS_TYPE_OBJECT:
        return validateUniqueMembersTypeObject((UniqueMembersType)value, diagnostics, context);
      default: 
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateColumnType(ColumnType columnType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(columnType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCubeGrantType(CubeGrantType cubeGrantType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(cubeGrantType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCubeType(CubeType cubeType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(cubeType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDimensionGrantType(DimensionGrantType dimensionGrantType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(dimensionGrantType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDimensionType(DimensionType dimensionType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(dimensionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDimensionUsageType(DimensionUsageType dimensionUsageType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(dimensionUsageType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHierarchyGrantType(HierarchyGrantType hierarchyGrantType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(hierarchyGrantType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHierarchyType(HierarchyType hierarchyType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(hierarchyType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateJoinType(JoinType joinType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(joinType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateKeyExpressionType(KeyExpressionType keyExpressionType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(keyExpressionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLevelType(LevelType levelType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(levelType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMeasureType(MeasureType measureType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(measureType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMemberGrantType(MemberGrantType memberGrantType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(memberGrantType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNameExpressionType(NameExpressionType nameExpressionType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(nameExpressionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOrdinalExpressionType(OrdinalExpressionType ordinalExpressionType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(ordinalExpressionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(parameterType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateParentExpressionType(ParentExpressionType parentExpressionType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(parentExpressionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateRoleType(RoleType roleType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(roleType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSchemaGrantType(SchemaGrantType schemaGrantType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(schemaGrantType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSchemaType(SchemaType schemaType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(schemaType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSQLType(SQLType sqlType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(sqlType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTableType(TableType tableType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(tableType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateViewType(ViewType viewType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(viewType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVirtualCubeDimensionType(VirtualCubeDimensionType virtualCubeDimensionType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(virtualCubeDimensionType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVirtualCubeMeasureType(VirtualCubeMeasureType virtualCubeMeasureType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(virtualCubeMeasureType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVirtualCubeType(VirtualCubeType virtualCubeType, DiagnosticChain diagnostics, Map context) {
    return validate_EveryDefaultConstraint(virtualCubeType, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessType(Object accessType, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessType1(Object accessType1, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessType2(Object accessType2, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessType3(Object accessType3, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessType4(Object accessType4, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDialectType(Object dialectType, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHasAllType(Object hasAllType, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHideMemberIfType(Object hideMemberIfType, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLevelTypeType(Object levelTypeType, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTypeType(Object typeType, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTypeType1(Object typeType1, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUniqueMembersType(Object uniqueMembersType, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessTypeObject(AccessType accessTypeObject, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessTypeObject1(AccessType accessTypeObject1, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessTypeObject2(AccessType accessTypeObject2, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessTypeObject3(AccessType accessTypeObject3, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccessTypeObject4(AccessType accessTypeObject4, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAggregatorType(String aggregatorType, DiagnosticChain diagnostics, Map context) {
    boolean result = validateAggregatorType_Enumeration(aggregatorType, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateAggregatorType_Enumeration
   */
  public static final Collection AGGREGATOR_TYPE__ENUMERATION__VALUES =
    wrapEnumerationValues
      (new Object[] {
         "sum",
         "count",
         "min",
         "max",
         "avg",
         "distinct count"
       });

  /**
   * Validates the Enumeration constraint of '<em>Aggregator Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAggregatorType_Enumeration(String aggregatorType, DiagnosticChain diagnostics, Map context) {
    boolean result = AGGREGATOR_TYPE__ENUMERATION__VALUES.contains(aggregatorType);
    if (!result && diagnostics != null) 
      reportEnumerationViolation(MondrianPackage.eINSTANCE.getAggregatorType(), aggregatorType, AGGREGATOR_TYPE__ENUMERATION__VALUES, diagnostics, context);
    return result; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDialectTypeObject(DialectType dialectTypeObject, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHasAllTypeObject(HasAllType hasAllTypeObject, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHideMemberIfTypeObject(HideMemberIfType hideMemberIfTypeObject, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateLevelTypeTypeObject(LevelTypeType levelTypeTypeObject, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTypeTypeObject1(TypeType typeTypeObject1, DiagnosticChain diagnostics, Map context) {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateUniqueMembersTypeObject(UniqueMembersType uniqueMembersTypeObject, DiagnosticChain diagnostics, Map context) {
    return true;
  }

} //MondrianValidator
