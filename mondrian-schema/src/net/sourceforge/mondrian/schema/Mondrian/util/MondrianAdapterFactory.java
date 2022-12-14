/**
 * <copyright>
 * </copyright>
 *
 * $Id: MondrianAdapterFactory.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.util;

import net.sourceforge.mondrian.schema.Mondrian.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage
 * @generated
 */
public class MondrianAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MondrianPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MondrianAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = MondrianPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch the delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MondrianSwitch modelSwitch =
    new MondrianSwitch() {
      public Object caseColumnType(ColumnType object) {
        return createColumnTypeAdapter();
      }
      public Object caseCubeGrantType(CubeGrantType object) {
        return createCubeGrantTypeAdapter();
      }
      public Object caseCubeType(CubeType object) {
        return createCubeTypeAdapter();
      }
      public Object caseDimensionGrantType(DimensionGrantType object) {
        return createDimensionGrantTypeAdapter();
      }
      public Object caseDimensionType(DimensionType object) {
        return createDimensionTypeAdapter();
      }
      public Object caseDimensionUsageType(DimensionUsageType object) {
        return createDimensionUsageTypeAdapter();
      }
      public Object caseDocumentRoot(DocumentRoot object) {
        return createDocumentRootAdapter();
      }
      public Object caseHierarchyGrantType(HierarchyGrantType object) {
        return createHierarchyGrantTypeAdapter();
      }
      public Object caseHierarchyType(HierarchyType object) {
        return createHierarchyTypeAdapter();
      }
      public Object caseJoinType(JoinType object) {
        return createJoinTypeAdapter();
      }
      public Object caseKeyExpressionType(KeyExpressionType object) {
        return createKeyExpressionTypeAdapter();
      }
      public Object caseLevelType(LevelType object) {
        return createLevelTypeAdapter();
      }
      public Object caseMeasureType(MeasureType object) {
        return createMeasureTypeAdapter();
      }
      public Object caseMemberGrantType(MemberGrantType object) {
        return createMemberGrantTypeAdapter();
      }
      public Object caseNameExpressionType(NameExpressionType object) {
        return createNameExpressionTypeAdapter();
      }
      public Object caseOrdinalExpressionType(OrdinalExpressionType object) {
        return createOrdinalExpressionTypeAdapter();
      }
      public Object caseParameterType(ParameterType object) {
        return createParameterTypeAdapter();
      }
      public Object caseParentExpressionType(ParentExpressionType object) {
        return createParentExpressionTypeAdapter();
      }
      public Object casePropertyType(PropertyType object) {
        return createPropertyTypeAdapter();
      }
      public Object caseRoleType(RoleType object) {
        return createRoleTypeAdapter();
      }
      public Object caseSchemaGrantType(SchemaGrantType object) {
        return createSchemaGrantTypeAdapter();
      }
      public Object caseSchemaType(SchemaType object) {
        return createSchemaTypeAdapter();
      }
      public Object caseSQLType(SQLType object) {
        return createSQLTypeAdapter();
      }
      public Object caseTableType(TableType object) {
        return createTableTypeAdapter();
      }
      public Object caseViewType(ViewType object) {
        return createViewTypeAdapter();
      }
      public Object caseVirtualCubeDimensionType(VirtualCubeDimensionType object) {
        return createVirtualCubeDimensionTypeAdapter();
      }
      public Object caseVirtualCubeMeasureType(VirtualCubeMeasureType object) {
        return createVirtualCubeMeasureTypeAdapter();
      }
      public Object caseVirtualCubeType(VirtualCubeType object) {
        return createVirtualCubeTypeAdapter();
      }
      public Object defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  public Adapter createAdapter(Notifier target) {
    return (Adapter)modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.ColumnType <em>Column Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.ColumnType
   * @generated
   */
  public Adapter createColumnTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType <em>Cube Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeGrantType
   * @generated
   */
  public Adapter createCubeGrantTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType <em>Cube Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType
   * @generated
   */
  public Adapter createCubeTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType <em>Dimension Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType
   * @generated
   */
  public Adapter createDimensionGrantTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType <em>Dimension Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionType
   * @generated
   */
  public Adapter createDimensionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType <em>Dimension Usage Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType
   * @generated
   */
  public Adapter createDimensionUsageTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType <em>Hierarchy Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType
   * @generated
   */
  public Adapter createHierarchyGrantTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType <em>Hierarchy Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType
   * @generated
   */
  public Adapter createHierarchyTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType <em>Join Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType
   * @generated
   */
  public Adapter createJoinTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.KeyExpressionType <em>Key Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.KeyExpressionType
   * @generated
   */
  public Adapter createKeyExpressionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType <em>Level Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType
   * @generated
   */
  public Adapter createLevelTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType <em>Measure Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.MeasureType
   * @generated
   */
  public Adapter createMeasureTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.MemberGrantType <em>Member Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.MemberGrantType
   * @generated
   */
  public Adapter createMemberGrantTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.NameExpressionType <em>Name Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.NameExpressionType
   * @generated
   */
  public Adapter createNameExpressionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType <em>Ordinal Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType
   * @generated
   */
  public Adapter createOrdinalExpressionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.ParameterType
   * @generated
   */
  public Adapter createParameterTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.ParentExpressionType <em>Parent Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.ParentExpressionType
   * @generated
   */
  public Adapter createParentExpressionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType <em>Property Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.PropertyType
   * @generated
   */
  public Adapter createPropertyTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.RoleType <em>Role Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.RoleType
   * @generated
   */
  public Adapter createRoleTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType <em>Schema Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType
   * @generated
   */
  public Adapter createSchemaGrantTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType <em>Schema Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaType
   * @generated
   */
  public Adapter createSchemaTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.SQLType <em>SQL Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.SQLType
   * @generated
   */
  public Adapter createSQLTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.TableType <em>Table Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.TableType
   * @generated
   */
  public Adapter createTableTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.ViewType <em>View Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.ViewType
   * @generated
   */
  public Adapter createViewTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType <em>Virtual Cube Dimension Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType
   * @generated
   */
  public Adapter createVirtualCubeDimensionTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType <em>Virtual Cube Measure Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType
   * @generated
   */
  public Adapter createVirtualCubeMeasureTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType <em>Virtual Cube Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType
   * @generated
   */
  public Adapter createVirtualCubeTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //MondrianAdapterFactory
