/**
 * <copyright>
 * </copyright>
 *
 * $Id: MondrianFactory.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage
 * @generated
 */
public interface MondrianFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MondrianFactory eINSTANCE = new net.sourceforge.mondrian.schema.Mondrian.impl.MondrianFactoryImpl();

  /**
   * Returns a new object of class '<em>Column Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Type</em>'.
   * @generated
   */
  ColumnType createColumnType();

  /**
   * Returns a new object of class '<em>Cube Grant Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cube Grant Type</em>'.
   * @generated
   */
  CubeGrantType createCubeGrantType();

  /**
   * Returns a new object of class '<em>Cube Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cube Type</em>'.
   * @generated
   */
  CubeType createCubeType();

  /**
   * Returns a new object of class '<em>Dimension Grant Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dimension Grant Type</em>'.
   * @generated
   */
  DimensionGrantType createDimensionGrantType();

  /**
   * Returns a new object of class '<em>Dimension Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dimension Type</em>'.
   * @generated
   */
  DimensionType createDimensionType();

  /**
   * Returns a new object of class '<em>Dimension Usage Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dimension Usage Type</em>'.
   * @generated
   */
  DimensionUsageType createDimensionUsageType();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Hierarchy Grant Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hierarchy Grant Type</em>'.
   * @generated
   */
  HierarchyGrantType createHierarchyGrantType();

  /**
   * Returns a new object of class '<em>Hierarchy Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hierarchy Type</em>'.
   * @generated
   */
  HierarchyType createHierarchyType();

  /**
   * Returns a new object of class '<em>Join Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Type</em>'.
   * @generated
   */
  JoinType createJoinType();

  /**
   * Returns a new object of class '<em>Key Expression Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Expression Type</em>'.
   * @generated
   */
  KeyExpressionType createKeyExpressionType();

  /**
   * Returns a new object of class '<em>Level Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Level Type</em>'.
   * @generated
   */
  LevelType createLevelType();

  /**
   * Returns a new object of class '<em>Measure Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Measure Type</em>'.
   * @generated
   */
  MeasureType createMeasureType();

  /**
   * Returns a new object of class '<em>Member Grant Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Grant Type</em>'.
   * @generated
   */
  MemberGrantType createMemberGrantType();

  /**
   * Returns a new object of class '<em>Name Expression Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Expression Type</em>'.
   * @generated
   */
  NameExpressionType createNameExpressionType();

  /**
   * Returns a new object of class '<em>Ordinal Expression Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ordinal Expression Type</em>'.
   * @generated
   */
  OrdinalExpressionType createOrdinalExpressionType();

  /**
   * Returns a new object of class '<em>Parameter Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Type</em>'.
   * @generated
   */
  ParameterType createParameterType();

  /**
   * Returns a new object of class '<em>Parent Expression Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent Expression Type</em>'.
   * @generated
   */
  ParentExpressionType createParentExpressionType();

  /**
   * Returns a new object of class '<em>Property Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Type</em>'.
   * @generated
   */
  PropertyType createPropertyType();

  /**
   * Returns a new object of class '<em>Role Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role Type</em>'.
   * @generated
   */
  RoleType createRoleType();

  /**
   * Returns a new object of class '<em>Schema Grant Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema Grant Type</em>'.
   * @generated
   */
  SchemaGrantType createSchemaGrantType();

  /**
   * Returns a new object of class '<em>Schema Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema Type</em>'.
   * @generated
   */
  SchemaType createSchemaType();

  /**
   * Returns a new object of class '<em>SQL Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SQL Type</em>'.
   * @generated
   */
  SQLType createSQLType();

  /**
   * Returns a new object of class '<em>Table Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Type</em>'.
   * @generated
   */
  TableType createTableType();

  /**
   * Returns a new object of class '<em>View Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Type</em>'.
   * @generated
   */
  ViewType createViewType();

  /**
   * Returns a new object of class '<em>Virtual Cube Dimension Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virtual Cube Dimension Type</em>'.
   * @generated
   */
  VirtualCubeDimensionType createVirtualCubeDimensionType();

  /**
   * Returns a new object of class '<em>Virtual Cube Measure Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virtual Cube Measure Type</em>'.
   * @generated
   */
  VirtualCubeMeasureType createVirtualCubeMeasureType();

  /**
   * Returns a new object of class '<em>Virtual Cube Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virtual Cube Type</em>'.
   * @generated
   */
  VirtualCubeType createVirtualCubeType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MondrianPackage getMondrianPackage();

} //MondrianFactory
