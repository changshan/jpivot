/**
 * <copyright>
 * </copyright>
 *
 * $Id: MondrianSwitch.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.util;

import java.util.List;

import net.sourceforge.mondrian.schema.Mondrian.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage
 * @generated
 */
public class MondrianSwitch {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MondrianPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MondrianSwitch() {
    if (modelPackage == null) {
      modelPackage = MondrianPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public Object doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(EClass theEClass, EObject theEObject) {
    if (theEClass.eContainer() == modelPackage) {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else {
      List eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch((EClass)eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case MondrianPackage.COLUMN_TYPE: {
        ColumnType columnType = (ColumnType)theEObject;
        Object result = caseColumnType(columnType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.CUBE_GRANT_TYPE: {
        CubeGrantType cubeGrantType = (CubeGrantType)theEObject;
        Object result = caseCubeGrantType(cubeGrantType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.CUBE_TYPE: {
        CubeType cubeType = (CubeType)theEObject;
        Object result = caseCubeType(cubeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.DIMENSION_GRANT_TYPE: {
        DimensionGrantType dimensionGrantType = (DimensionGrantType)theEObject;
        Object result = caseDimensionGrantType(dimensionGrantType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.DIMENSION_TYPE: {
        DimensionType dimensionType = (DimensionType)theEObject;
        Object result = caseDimensionType(dimensionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.DIMENSION_USAGE_TYPE: {
        DimensionUsageType dimensionUsageType = (DimensionUsageType)theEObject;
        Object result = caseDimensionUsageType(dimensionUsageType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.DOCUMENT_ROOT: {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        Object result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.HIERARCHY_GRANT_TYPE: {
        HierarchyGrantType hierarchyGrantType = (HierarchyGrantType)theEObject;
        Object result = caseHierarchyGrantType(hierarchyGrantType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.HIERARCHY_TYPE: {
        HierarchyType hierarchyType = (HierarchyType)theEObject;
        Object result = caseHierarchyType(hierarchyType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.JOIN_TYPE: {
        JoinType joinType = (JoinType)theEObject;
        Object result = caseJoinType(joinType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.KEY_EXPRESSION_TYPE: {
        KeyExpressionType keyExpressionType = (KeyExpressionType)theEObject;
        Object result = caseKeyExpressionType(keyExpressionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.LEVEL_TYPE: {
        LevelType levelType = (LevelType)theEObject;
        Object result = caseLevelType(levelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.MEASURE_TYPE: {
        MeasureType measureType = (MeasureType)theEObject;
        Object result = caseMeasureType(measureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.MEMBER_GRANT_TYPE: {
        MemberGrantType memberGrantType = (MemberGrantType)theEObject;
        Object result = caseMemberGrantType(memberGrantType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.NAME_EXPRESSION_TYPE: {
        NameExpressionType nameExpressionType = (NameExpressionType)theEObject;
        Object result = caseNameExpressionType(nameExpressionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.ORDINAL_EXPRESSION_TYPE: {
        OrdinalExpressionType ordinalExpressionType = (OrdinalExpressionType)theEObject;
        Object result = caseOrdinalExpressionType(ordinalExpressionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.PARAMETER_TYPE: {
        ParameterType parameterType = (ParameterType)theEObject;
        Object result = caseParameterType(parameterType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.PARENT_EXPRESSION_TYPE: {
        ParentExpressionType parentExpressionType = (ParentExpressionType)theEObject;
        Object result = caseParentExpressionType(parentExpressionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.PROPERTY_TYPE: {
        PropertyType propertyType = (PropertyType)theEObject;
        Object result = casePropertyType(propertyType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.ROLE_TYPE: {
        RoleType roleType = (RoleType)theEObject;
        Object result = caseRoleType(roleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.SCHEMA_GRANT_TYPE: {
        SchemaGrantType schemaGrantType = (SchemaGrantType)theEObject;
        Object result = caseSchemaGrantType(schemaGrantType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.SCHEMA_TYPE: {
        SchemaType schemaType = (SchemaType)theEObject;
        Object result = caseSchemaType(schemaType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.SQL_TYPE: {
        SQLType sqlType = (SQLType)theEObject;
        Object result = caseSQLType(sqlType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.TABLE_TYPE: {
        TableType tableType = (TableType)theEObject;
        Object result = caseTableType(tableType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.VIEW_TYPE: {
        ViewType viewType = (ViewType)theEObject;
        Object result = caseViewType(viewType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE: {
        VirtualCubeDimensionType virtualCubeDimensionType = (VirtualCubeDimensionType)theEObject;
        Object result = caseVirtualCubeDimensionType(virtualCubeDimensionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.VIRTUAL_CUBE_MEASURE_TYPE: {
        VirtualCubeMeasureType virtualCubeMeasureType = (VirtualCubeMeasureType)theEObject;
        Object result = caseVirtualCubeMeasureType(virtualCubeMeasureType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MondrianPackage.VIRTUAL_CUBE_TYPE: {
        VirtualCubeType virtualCubeType = (VirtualCubeType)theEObject;
        Object result = caseVirtualCubeType(virtualCubeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Column Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Column Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseColumnType(ColumnType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Cube Grant Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Cube Grant Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseCubeGrantType(CubeGrantType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Cube Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Cube Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseCubeType(CubeType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Dimension Grant Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Dimension Grant Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDimensionGrantType(DimensionGrantType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Dimension Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Dimension Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDimensionType(DimensionType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Dimension Usage Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Dimension Usage Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDimensionUsageType(DimensionUsageType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDocumentRoot(DocumentRoot object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Hierarchy Grant Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Hierarchy Grant Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseHierarchyGrantType(HierarchyGrantType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Hierarchy Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Hierarchy Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseHierarchyType(HierarchyType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Join Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Join Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseJoinType(JoinType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Key Expression Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Key Expression Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseKeyExpressionType(KeyExpressionType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Level Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Level Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseLevelType(LevelType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Measure Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Measure Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseMeasureType(MeasureType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Member Grant Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Member Grant Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseMemberGrantType(MemberGrantType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Name Expression Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Name Expression Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseNameExpressionType(NameExpressionType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Ordinal Expression Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Ordinal Expression Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseOrdinalExpressionType(OrdinalExpressionType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Parameter Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Parameter Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseParameterType(ParameterType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Parent Expression Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Parent Expression Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseParentExpressionType(ParentExpressionType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Property Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Property Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object casePropertyType(PropertyType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Role Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Role Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseRoleType(RoleType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Schema Grant Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Schema Grant Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseSchemaGrantType(SchemaGrantType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Schema Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Schema Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseSchemaType(SchemaType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>SQL Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>SQL Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseSQLType(SQLType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Table Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Table Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseTableType(TableType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>View Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>View Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseViewType(ViewType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Virtual Cube Dimension Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Virtual Cube Dimension Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseVirtualCubeDimensionType(VirtualCubeDimensionType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Virtual Cube Measure Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Virtual Cube Measure Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseVirtualCubeMeasureType(VirtualCubeMeasureType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Virtual Cube Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Virtual Cube Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseVirtualCubeType(VirtualCubeType object) {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public Object defaultCase(EObject object) {
    return null;
  }

} //MondrianSwitch
