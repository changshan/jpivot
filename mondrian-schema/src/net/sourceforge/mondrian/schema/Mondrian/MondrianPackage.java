/**
 * <copyright>
 * </copyright>
 *
 * $Id: MondrianPackage.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianFactory
 * @generated
 */
public interface MondrianPackage extends EPackage{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "Mondrian";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "platform:/resource/mondrian-schema/src/model/mondrian.xsd";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "Mondrian";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MondrianPackage eINSTANCE = net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.ColumnTypeImpl <em>Column Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.ColumnTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getColumnType()
   * @generated
   */
  int COLUMN_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE__TABLE = 1;

  /**
   * The number of structural features of the the '<em>Column Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeGrantTypeImpl <em>Cube Grant Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.CubeGrantTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getCubeGrantType()
   * @generated
   */
  int CUBE_GRANT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Dimension Grant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_GRANT_TYPE__DIMENSION_GRANT = 0;

  /**
   * The feature id for the '<em><b>Hierarchy Grant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_GRANT_TYPE__HIERARCHY_GRANT = 1;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_GRANT_TYPE__ACCESS = 2;

  /**
   * The feature id for the '<em><b>Cube</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_GRANT_TYPE__CUBE = 3;

  /**
   * The number of structural features of the the '<em>Cube Grant Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_GRANT_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl <em>Cube Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.CubeTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getCubeType()
   * @generated
   */
  int CUBE_TYPE = 2;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE__VIEW = 0;

  /**
   * The feature id for the '<em><b>Join</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE__JOIN = 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE__TABLE = 2;

  /**
   * The feature id for the '<em><b>Cube Dimension</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE__CUBE_DIMENSION = 3;

  /**
   * The feature id for the '<em><b>Virtual Cube Dimension</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE__VIRTUAL_CUBE_DIMENSION = 4;

  /**
   * The feature id for the '<em><b>Dimension Usage</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE__DIMENSION_USAGE = 5;

  /**
   * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE__DIMENSION = 6;

  /**
   * The feature id for the '<em><b>Measure</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE__MEASURE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE__NAME = 8;

  /**
   * The number of structural features of the the '<em>Cube Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUBE_TYPE_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.DimensionGrantTypeImpl <em>Dimension Grant Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.DimensionGrantTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getDimensionGrantType()
   * @generated
   */
  int DIMENSION_GRANT_TYPE = 3;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_GRANT_TYPE__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_GRANT_TYPE__DIMENSION = 1;

  /**
   * The number of structural features of the the '<em>Dimension Grant Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_GRANT_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.DimensionTypeImpl <em>Dimension Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.DimensionTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getDimensionType()
   * @generated
   */
  int DIMENSION_TYPE = 4;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_TYPE__HIERARCHY = 0;

  /**
   * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_TYPE__FOREIGN_KEY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_TYPE__NAME = 2;

  /**
   * The number of structural features of the the '<em>Dimension Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.DimensionUsageTypeImpl <em>Dimension Usage Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.DimensionUsageTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getDimensionUsageType()
   * @generated
   */
  int DIMENSION_USAGE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_USAGE_TYPE__FOREIGN_KEY = 0;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_USAGE_TYPE__LEVEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_USAGE_TYPE__NAME = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_USAGE_TYPE__SOURCE = 3;

  /**
   * The number of structural features of the the '<em>Dimension Usage Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_USAGE_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.DocumentRootImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 6;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__COLUMN = 3;

  /**
   * The feature id for the '<em><b>Cube</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CUBE = 4;

  /**
   * The feature id for the '<em><b>Cube Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CUBE_GRANT = 5;

  /**
   * The feature id for the '<em><b>Dimension</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DIMENSION = 6;

  /**
   * The feature id for the '<em><b>Dimension Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DIMENSION_GRANT = 7;

  /**
   * The feature id for the '<em><b>Dimension Usage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__DIMENSION_USAGE = 8;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__HIERARCHY = 9;

  /**
   * The feature id for the '<em><b>Hierarchy Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__HIERARCHY_GRANT = 10;

  /**
   * The feature id for the '<em><b>Join</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__JOIN = 11;

  /**
   * The feature id for the '<em><b>Key Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__KEY_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Level</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LEVEL = 13;

  /**
   * The feature id for the '<em><b>Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MEASURE = 14;

  /**
   * The feature id for the '<em><b>Member Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MEMBER_GRANT = 15;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__NAME_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Ordinal Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ORDINAL_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PARAMETER = 18;

  /**
   * The feature id for the '<em><b>Parent Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PARENT_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ROLE = 21;

  /**
   * The feature id for the '<em><b>Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SCHEMA = 22;

  /**
   * The feature id for the '<em><b>Schema Grant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SCHEMA_GRANT = 23;

  /**
   * The feature id for the '<em><b>Sql</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SQL = 24;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TABLE = 25;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VIEW = 26;

  /**
   * The feature id for the '<em><b>Virtual Cube</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VIRTUAL_CUBE = 27;

  /**
   * The feature id for the '<em><b>Virtual Cube Dimension</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VIRTUAL_CUBE_DIMENSION = 28;

  /**
   * The feature id for the '<em><b>Virtual Cube Measure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__VIRTUAL_CUBE_MEASURE = 29;

  /**
   * The number of structural features of the the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 30;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyGrantTypeImpl <em>Hierarchy Grant Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyGrantTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getHierarchyGrantType()
   * @generated
   */
  int HIERARCHY_GRANT_TYPE = 7;

  /**
   * The feature id for the '<em><b>Member Grant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_GRANT_TYPE__MEMBER_GRANT = 0;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_GRANT_TYPE__ACCESS = 1;

  /**
   * The feature id for the '<em><b>Bottom Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_GRANT_TYPE__BOTTOM_LEVEL = 2;

  /**
   * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_GRANT_TYPE__HIERARCHY = 3;

  /**
   * The feature id for the '<em><b>Top Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_GRANT_TYPE__TOP_LEVEL = 4;

  /**
   * The number of structural features of the the '<em>Hierarchy Grant Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_GRANT_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl <em>Hierarchy Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getHierarchyType()
   * @generated
   */
  int HIERARCHY_TYPE = 8;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__VIEW = 0;

  /**
   * The feature id for the '<em><b>Join</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__JOIN = 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__TABLE = 2;

  /**
   * The feature id for the '<em><b>Level</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__LEVEL = 3;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__PARAMETER = 4;

  /**
   * The feature id for the '<em><b>All Member Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__ALL_MEMBER_NAME = 5;

  /**
   * The feature id for the '<em><b>Default Member</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__DEFAULT_MEMBER = 6;

  /**
   * The feature id for the '<em><b>Has All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__HAS_ALL = 7;

  /**
   * The feature id for the '<em><b>Member Reader Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__MEMBER_READER_CLASS = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__NAME = 9;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__PRIMARY_KEY = 10;

  /**
   * The feature id for the '<em><b>Primary Key Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE__PRIMARY_KEY_TABLE = 11;

  /**
   * The number of structural features of the the '<em>Hierarchy Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIERARCHY_TYPE_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl <em>Join Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getJoinType()
   * @generated
   */
  int JOIN_TYPE = 9;

  /**
   * The feature id for the '<em><b>Relation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TYPE__RELATION = 0;

  /**
   * The feature id for the '<em><b>View</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TYPE__VIEW = 1;

  /**
   * The feature id for the '<em><b>Join</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TYPE__JOIN = 2;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TYPE__TABLE = 3;

  /**
   * The feature id for the '<em><b>Left Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TYPE__LEFT_ALIAS = 4;

  /**
   * The feature id for the '<em><b>Left Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TYPE__LEFT_KEY = 5;

  /**
   * The feature id for the '<em><b>Right Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TYPE__RIGHT_ALIAS = 6;

  /**
   * The feature id for the '<em><b>Right Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TYPE__RIGHT_KEY = 7;

  /**
   * The number of structural features of the the '<em>Join Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TYPE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.KeyExpressionTypeImpl <em>Key Expression Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.KeyExpressionTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getKeyExpressionType()
   * @generated
   */
  int KEY_EXPRESSION_TYPE = 10;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_EXPRESSION_TYPE__SQL = 0;

  /**
   * The number of structural features of the the '<em>Key Expression Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_EXPRESSION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl <em>Level Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getLevelType()
   * @generated
   */
  int LEVEL_TYPE = 11;

  /**
   * The feature id for the '<em><b>Key Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__KEY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__NAME_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Ordinal Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__ORDINAL_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Parent Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__PARENT_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__COLUMN = 5;

  /**
   * The feature id for the '<em><b>Hide Member If</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__HIDE_MEMBER_IF = 6;

  /**
   * The feature id for the '<em><b>Level Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__LEVEL_TYPE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__NAME = 8;

  /**
   * The feature id for the '<em><b>Name Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__NAME_COLUMN = 9;

  /**
   * The feature id for the '<em><b>Null Parent Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__NULL_PARENT_VALUE = 10;

  /**
   * The feature id for the '<em><b>Ordinal Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__ORDINAL_COLUMN = 11;

  /**
   * The feature id for the '<em><b>Parent Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__PARENT_COLUMN = 12;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__TABLE = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__TYPE = 14;

  /**
   * The feature id for the '<em><b>Unique Members</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE__UNIQUE_MEMBERS = 15;

  /**
   * The number of structural features of the the '<em>Level Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_TYPE_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.MeasureTypeImpl <em>Measure Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MeasureTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getMeasureType()
   * @generated
   */
  int MEASURE_TYPE = 12;

  /**
   * The feature id for the '<em><b>Aggregator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE_TYPE__AGGREGATOR = 0;

  /**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE_TYPE__COLUMN = 1;

  /**
   * The feature id for the '<em><b>Format String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE_TYPE__FORMAT_STRING = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE_TYPE__NAME = 3;

  /**
   * The number of structural features of the the '<em>Measure Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEASURE_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.MemberGrantTypeImpl <em>Member Grant Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MemberGrantTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getMemberGrantType()
   * @generated
   */
  int MEMBER_GRANT_TYPE = 13;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_GRANT_TYPE__ACCESS = 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_GRANT_TYPE__MEMBER = 1;

  /**
   * The number of structural features of the the '<em>Member Grant Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_GRANT_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.NameExpressionTypeImpl <em>Name Expression Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.NameExpressionTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getNameExpressionType()
   * @generated
   */
  int NAME_EXPRESSION_TYPE = 14;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION_TYPE__SQL = 0;

  /**
   * The number of structural features of the the '<em>Name Expression Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_EXPRESSION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.OrdinalExpressionTypeImpl <em>Ordinal Expression Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.OrdinalExpressionTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getOrdinalExpressionType()
   * @generated
   */
  int ORDINAL_EXPRESSION_TYPE = 15;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINAL_EXPRESSION_TYPE__SQL = 0;

  /**
   * The number of structural features of the the '<em>Ordinal Expression Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDINAL_EXPRESSION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.ParameterTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getParameterType()
   * @generated
   */
  int PARAMETER_TYPE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE__VALUE = 1;

  /**
   * The number of structural features of the the '<em>Parameter Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.ParentExpressionTypeImpl <em>Parent Expression Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.ParentExpressionTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getParentExpressionType()
   * @generated
   */
  int PARENT_EXPRESSION_TYPE = 17;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_EXPRESSION_TYPE__SQL = 0;

  /**
   * The number of structural features of the the '<em>Parent Expression Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_EXPRESSION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.PropertyTypeImpl <em>Property Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.PropertyTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getPropertyType()
   * @generated
   */
  int PROPERTY_TYPE = 18;

  /**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TYPE__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TYPE__TYPE = 2;

  /**
   * The number of structural features of the the '<em>Property Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.RoleTypeImpl <em>Role Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.RoleTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getRoleType()
   * @generated
   */
  int ROLE_TYPE = 19;

  /**
   * The feature id for the '<em><b>Schema Grant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__SCHEMA_GRANT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE__NAME = 1;

  /**
   * The number of structural features of the the '<em>Role Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaGrantTypeImpl <em>Schema Grant Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.SchemaGrantTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getSchemaGrantType()
   * @generated
   */
  int SCHEMA_GRANT_TYPE = 20;

  /**
   * The feature id for the '<em><b>Cube Grant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_GRANT_TYPE__CUBE_GRANT = 0;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_GRANT_TYPE__ACCESS = 1;

  /**
   * The number of structural features of the the '<em>Schema Grant Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_GRANT_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.SchemaTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getSchemaType()
   * @generated
   */
  int SCHEMA_TYPE = 21;

  /**
   * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE__DIMENSION = 0;

  /**
   * The feature id for the '<em><b>Cube</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE__CUBE = 1;

  /**
   * The feature id for the '<em><b>Virtual Cube</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE__VIRTUAL_CUBE = 2;

  /**
   * The feature id for the '<em><b>Role</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE__ROLE = 3;

  /**
   * The feature id for the '<em><b>Default Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE__DEFAULT_ROLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE__NAME = 5;

  /**
   * The number of structural features of the the '<em>Schema Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_TYPE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.SQLTypeImpl <em>SQL Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.SQLTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getSQLType()
   * @generated
   */
  int SQL_TYPE = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Dialect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE__DIALECT = 1;

  /**
   * The number of structural features of the the '<em>SQL Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.TableTypeImpl <em>Table Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.TableTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getTableType()
   * @generated
   */
  int TABLE_TYPE = 23;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_TYPE__ALIAS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_TYPE__SCHEMA = 2;

  /**
   * The number of structural features of the the '<em>Table Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.ViewTypeImpl <em>View Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.ViewTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getViewType()
   * @generated
   */
  int VIEW_TYPE = 24;

  /**
   * The feature id for the '<em><b>SQL</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_TYPE__SQL = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_TYPE__ALIAS = 1;

  /**
   * The number of structural features of the the '<em>View Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeDimensionTypeImpl <em>Virtual Cube Dimension Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeDimensionTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getVirtualCubeDimensionType()
   * @generated
   */
  int VIRTUAL_CUBE_DIMENSION_TYPE = 25;

  /**
   * The feature id for the '<em><b>Cube Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_DIMENSION_TYPE__CUBE_NAME = 0;

  /**
   * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_DIMENSION_TYPE__FOREIGN_KEY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_DIMENSION_TYPE__NAME = 2;

  /**
   * The number of structural features of the the '<em>Virtual Cube Dimension Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_DIMENSION_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeMeasureTypeImpl <em>Virtual Cube Measure Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeMeasureTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getVirtualCubeMeasureType()
   * @generated
   */
  int VIRTUAL_CUBE_MEASURE_TYPE = 26;

  /**
   * The feature id for the '<em><b>Cube Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_MEASURE_TYPE__CUBE_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_MEASURE_TYPE__NAME = 1;

  /**
   * The number of structural features of the the '<em>Virtual Cube Measure Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_MEASURE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeTypeImpl <em>Virtual Cube Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeTypeImpl
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getVirtualCubeType()
   * @generated
   */
  int VIRTUAL_CUBE_TYPE = 27;

  /**
   * The feature id for the '<em><b>Virtual Cube Dimension</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_DIMENSION = 0;

  /**
   * The feature id for the '<em><b>Virtual Cube Measure</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_MEASURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_TYPE__NAME = 2;

  /**
   * The number of structural features of the the '<em>Virtual Cube Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_CUBE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType <em>Access Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessType()
   * @generated
   */
  int ACCESS_TYPE = 28;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType1 <em>Access Type1</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType1
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessType1()
   * @generated
   */
  int ACCESS_TYPE1 = 29;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType2 <em>Access Type2</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType2
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessType2()
   * @generated
   */
  int ACCESS_TYPE2 = 30;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType3 <em>Access Type3</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType3
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessType3()
   * @generated
   */
  int ACCESS_TYPE3 = 31;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType4 <em>Access Type4</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType4
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessType4()
   * @generated
   */
  int ACCESS_TYPE4 = 32;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.DialectType <em>Dialect Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.DialectType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getDialectType()
   * @generated
   */
  int DIALECT_TYPE = 33;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.HasAllType <em>Has All Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.HasAllType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getHasAllType()
   * @generated
   */
  int HAS_ALL_TYPE = 34;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType <em>Hide Member If Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getHideMemberIfType()
   * @generated
   */
  int HIDE_MEMBER_IF_TYPE = 35;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelTypeType <em>Level Type Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelTypeType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getLevelTypeType()
   * @generated
   */
  int LEVEL_TYPE_TYPE = 36;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.TypeType <em>Type Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getTypeType()
   * @generated
   */
  int TYPE_TYPE = 37;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.TypeType1 <em>Type Type1</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType1
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getTypeType1()
   * @generated
   */
  int TYPE_TYPE1 = 38;

  /**
   * The meta object id for the '{@link net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType <em>Unique Members Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getUniqueMembersType()
   * @generated
   */
  int UNIQUE_MEMBERS_TYPE = 39;

  /**
   * The meta object id for the '<em>Access Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessTypeObject()
   * @generated
   */
  int ACCESS_TYPE_OBJECT = 40;

  /**
   * The meta object id for the '<em>Access Type Object1</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessTypeObject1()
   * @generated
   */
  int ACCESS_TYPE_OBJECT1 = 41;

  /**
   * The meta object id for the '<em>Access Type Object2</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessTypeObject2()
   * @generated
   */
  int ACCESS_TYPE_OBJECT2 = 42;

  /**
   * The meta object id for the '<em>Access Type Object3</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessTypeObject3()
   * @generated
   */
  int ACCESS_TYPE_OBJECT3 = 43;

  /**
   * The meta object id for the '<em>Access Type Object4</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAccessTypeObject4()
   * @generated
   */
  int ACCESS_TYPE_OBJECT4 = 44;

  /**
   * The meta object id for the '<em>Aggregator Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getAggregatorType()
   * @generated
   */
  int AGGREGATOR_TYPE = 45;

  /**
   * The meta object id for the '<em>Dialect Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.DialectType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getDialectTypeObject()
   * @generated
   */
  int DIALECT_TYPE_OBJECT = 46;

  /**
   * The meta object id for the '<em>Has All Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.HasAllType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getHasAllTypeObject()
   * @generated
   */
  int HAS_ALL_TYPE_OBJECT = 47;

  /**
   * The meta object id for the '<em>Hide Member If Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getHideMemberIfTypeObject()
   * @generated
   */
  int HIDE_MEMBER_IF_TYPE_OBJECT = 48;

  /**
   * The meta object id for the '<em>Level Type Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelTypeType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getLevelTypeTypeObject()
   * @generated
   */
  int LEVEL_TYPE_TYPE_OBJECT = 49;

  /**
   * The meta object id for the '<em>Type Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getTypeTypeObject()
   * @generated
   */
  int TYPE_TYPE_OBJECT = 50;

  /**
   * The meta object id for the '<em>Type Type Object1</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getTypeTypeObject1()
   * @generated
   */
  int TYPE_TYPE_OBJECT1 = 51;

  /**
   * The meta object id for the '<em>Unique Members Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType
   * @see net.sourceforge.mondrian.schema.Mondrian.impl.MondrianPackageImpl#getUniqueMembersTypeObject()
   * @generated
   */
  int UNIQUE_MEMBERS_TYPE_OBJECT = 52;


  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.ColumnType <em>Column Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ColumnType
   * @generated
   */
  EClass getColumnType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.ColumnType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ColumnType#getName()
   * @see #getColumnType()
   * @generated
   */
  EAttribute getColumnType_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.ColumnType#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ColumnType#getTable()
   * @see #getColumnType()
   * @generated
   */
  EAttribute getColumnType_Table();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType <em>Cube Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cube Grant Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeGrantType
   * @generated
   */
  EClass getCubeGrantType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getDimensionGrant <em>Dimension Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimension Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getDimensionGrant()
   * @see #getCubeGrantType()
   * @generated
   */
  EReference getCubeGrantType_DimensionGrant();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getHierarchyGrant <em>Hierarchy Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hierarchy Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getHierarchyGrant()
   * @see #getCubeGrantType()
   * @generated
   */
  EReference getCubeGrantType_HierarchyGrant();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getAccess()
   * @see #getCubeGrantType()
   * @generated
   */
  EAttribute getCubeGrantType_Access();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getCube <em>Cube</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cube</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeGrantType#getCube()
   * @see #getCubeGrantType()
   * @generated
   */
  EAttribute getCubeGrantType_Cube();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType <em>Cube Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cube Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType
   * @generated
   */
  EClass getCubeType();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType#getView()
   * @see #getCubeType()
   * @generated
   */
  EReference getCubeType_View();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getJoin <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Join</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType#getJoin()
   * @see #getCubeType()
   * @generated
   */
  EReference getCubeType_Join();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType#getTable()
   * @see #getCubeType()
   * @generated
   */
  EReference getCubeType_Table();

  /**
   * Returns the meta object for the attribute list '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getCubeDimension <em>Cube Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cube Dimension</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType#getCubeDimension()
   * @see #getCubeType()
   * @generated
   */
  EAttribute getCubeType_CubeDimension();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Virtual Cube Dimension</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType#getVirtualCubeDimension()
   * @see #getCubeType()
   * @generated
   */
  EReference getCubeType_VirtualCubeDimension();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getDimensionUsage <em>Dimension Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimension Usage</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType#getDimensionUsage()
   * @see #getCubeType()
   * @generated
   */
  EReference getCubeType_DimensionUsage();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getDimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimension</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType#getDimension()
   * @see #getCubeType()
   * @generated
   */
  EReference getCubeType_Dimension();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getMeasure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Measure</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType#getMeasure()
   * @see #getCubeType()
   * @generated
   */
  EReference getCubeType_Measure();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.CubeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.CubeType#getName()
   * @see #getCubeType()
   * @generated
   */
  EAttribute getCubeType_Name();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType <em>Dimension Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Grant Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType
   * @generated
   */
  EClass getDimensionGrantType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getAccess()
   * @see #getDimensionGrantType()
   * @generated
   */
  EAttribute getDimensionGrantType_Access();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getDimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dimension</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getDimension()
   * @see #getDimensionGrantType()
   * @generated
   */
  EAttribute getDimensionGrantType_Dimension();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType <em>Dimension Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionType
   * @generated
   */
  EClass getDimensionType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hierarchy</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionType#getHierarchy()
   * @see #getDimensionType()
   * @generated
   */
  EReference getDimensionType_Hierarchy();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType#getForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Foreign Key</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionType#getForeignKey()
   * @see #getDimensionType()
   * @generated
   */
  EAttribute getDimensionType_ForeignKey();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionType#getName()
   * @see #getDimensionType()
   * @generated
   */
  EAttribute getDimensionType_Name();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType <em>Dimension Usage Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension Usage Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType
   * @generated
   */
  EClass getDimensionUsageType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType#getForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Foreign Key</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType#getForeignKey()
   * @see #getDimensionUsageType()
   * @generated
   */
  EAttribute getDimensionUsageType_ForeignKey();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType#getLevel()
   * @see #getDimensionUsageType()
   * @generated
   */
  EAttribute getDimensionUsageType_Level();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType#getName()
   * @see #getDimensionUsageType()
   * @generated
   */
  EAttribute getDimensionUsageType_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType#getSource()
   * @see #getDimensionUsageType()
   * @generated
   */
  EAttribute getDimensionUsageType_Source();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getColumn()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Column();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getCube <em>Cube</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cube</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getCube()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Cube();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getCubeGrant <em>Cube Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cube Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getCubeGrant()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CubeGrant();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dimension</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimension()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Dimension();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimensionGrant <em>Dimension Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dimension Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimensionGrant()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DimensionGrant();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimensionUsage <em>Dimension Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dimension Usage</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getDimensionUsage()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_DimensionUsage();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hierarchy</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getHierarchy()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Hierarchy();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getHierarchyGrant <em>Hierarchy Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hierarchy Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getHierarchyGrant()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_HierarchyGrant();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getJoin <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Join</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getJoin()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Join();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getKeyExpression <em>Key Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Expression</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getKeyExpression()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_KeyExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Level</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getLevel()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Level();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMeasure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Measure</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Measure();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMemberGrant <em>Member Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Member Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getMemberGrant()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_MemberGrant();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getNameExpression <em>Name Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Expression</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getNameExpression()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_NameExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getOrdinalExpression <em>Ordinal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ordinal Expression</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getOrdinalExpression()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_OrdinalExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getParameter()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getParentExpression <em>Parent Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parent Expression</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getParentExpression()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ParentExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getProperty()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Property();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Role</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getRole()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Role();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schema</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSchema()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Schema();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSchemaGrant <em>Schema Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schema Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSchemaGrant()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SchemaGrant();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSql <em>Sql</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sql</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getSql()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Sql();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getTable()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Table();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getView()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_View();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCube <em>Virtual Cube</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Virtual Cube</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCube()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_VirtualCube();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Virtual Cube Dimension</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCubeDimension()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_VirtualCubeDimension();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCubeMeasure <em>Virtual Cube Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Virtual Cube Measure</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DocumentRoot#getVirtualCubeMeasure()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_VirtualCubeMeasure();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType <em>Hierarchy Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hierarchy Grant Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType
   * @generated
   */
  EClass getHierarchyGrantType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getMemberGrant <em>Member Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Member Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getMemberGrant()
   * @see #getHierarchyGrantType()
   * @generated
   */
  EReference getHierarchyGrantType_MemberGrant();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getAccess()
   * @see #getHierarchyGrantType()
   * @generated
   */
  EAttribute getHierarchyGrantType_Access();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getBottomLevel <em>Bottom Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bottom Level</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getBottomLevel()
   * @see #getHierarchyGrantType()
   * @generated
   */
  EAttribute getHierarchyGrantType_BottomLevel();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getHierarchy <em>Hierarchy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hierarchy</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getHierarchy()
   * @see #getHierarchyGrantType()
   * @generated
   */
  EAttribute getHierarchyGrantType_Hierarchy();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getTopLevel <em>Top Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Top Level</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getTopLevel()
   * @see #getHierarchyGrantType()
   * @generated
   */
  EAttribute getHierarchyGrantType_TopLevel();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType <em>Hierarchy Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hierarchy Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType
   * @generated
   */
  EClass getHierarchyType();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>View</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getView()
   * @see #getHierarchyType()
   * @generated
   */
  EReference getHierarchyType_View();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getJoin <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Join</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getJoin()
   * @see #getHierarchyType()
   * @generated
   */
  EReference getHierarchyType_Join();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getTable()
   * @see #getHierarchyType()
   * @generated
   */
  EReference getHierarchyType_Table();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Level</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getLevel()
   * @see #getHierarchyType()
   * @generated
   */
  EReference getHierarchyType_Level();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getParameter()
   * @see #getHierarchyType()
   * @generated
   */
  EReference getHierarchyType_Parameter();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getAllMemberName <em>All Member Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Member Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getAllMemberName()
   * @see #getHierarchyType()
   * @generated
   */
  EAttribute getHierarchyType_AllMemberName();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getDefaultMember <em>Default Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Member</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getDefaultMember()
   * @see #getHierarchyType()
   * @generated
   */
  EAttribute getHierarchyType_DefaultMember();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getHasAll <em>Has All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has All</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getHasAll()
   * @see #getHierarchyType()
   * @generated
   */
  EAttribute getHierarchyType_HasAll();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getMemberReaderClass <em>Member Reader Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Member Reader Class</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getMemberReaderClass()
   * @see #getHierarchyType()
   * @generated
   */
  EAttribute getHierarchyType_MemberReaderClass();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getName()
   * @see #getHierarchyType()
   * @generated
   */
  EAttribute getHierarchyType_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getPrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primary Key</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getPrimaryKey()
   * @see #getHierarchyType()
   * @generated
   */
  EAttribute getHierarchyType_PrimaryKey();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getPrimaryKeyTable <em>Primary Key Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primary Key Table</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HierarchyType#getPrimaryKeyTable()
   * @see #getHierarchyType()
   * @generated
   */
  EAttribute getHierarchyType_PrimaryKeyTable();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType <em>Join Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType
   * @generated
   */
  EClass getJoinType();

  /**
   * Returns the meta object for the attribute list '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Relation</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType#getRelation()
   * @see #getJoinType()
   * @generated
   */
  EAttribute getJoinType_Relation();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>View</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType#getView()
   * @see #getJoinType()
   * @generated
   */
  EReference getJoinType_View();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getJoin <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType#getJoin()
   * @see #getJoinType()
   * @generated
   */
  EReference getJoinType_Join();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Table</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType#getTable()
   * @see #getJoinType()
   * @generated
   */
  EReference getJoinType_Table();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getLeftAlias <em>Left Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Alias</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType#getLeftAlias()
   * @see #getJoinType()
   * @generated
   */
  EAttribute getJoinType_LeftAlias();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getLeftKey <em>Left Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Key</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType#getLeftKey()
   * @see #getJoinType()
   * @generated
   */
  EAttribute getJoinType_LeftKey();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getRightAlias <em>Right Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Alias</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType#getRightAlias()
   * @see #getJoinType()
   * @generated
   */
  EAttribute getJoinType_RightAlias();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.JoinType#getRightKey <em>Right Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Key</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.JoinType#getRightKey()
   * @see #getJoinType()
   * @generated
   */
  EAttribute getJoinType_RightKey();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.KeyExpressionType <em>Key Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Expression Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.KeyExpressionType
   * @generated
   */
  EClass getKeyExpressionType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.KeyExpressionType#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>SQL</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.KeyExpressionType#getSQL()
   * @see #getKeyExpressionType()
   * @generated
   */
  EReference getKeyExpressionType_SQL();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType <em>Level Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Level Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType
   * @generated
   */
  EClass getLevelType();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getKeyExpression <em>Key Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Expression</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getKeyExpression()
   * @see #getLevelType()
   * @generated
   */
  EReference getLevelType_KeyExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getNameExpression <em>Name Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Expression</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getNameExpression()
   * @see #getLevelType()
   * @generated
   */
  EReference getLevelType_NameExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getOrdinalExpression <em>Ordinal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ordinal Expression</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getOrdinalExpression()
   * @see #getLevelType()
   * @generated
   */
  EReference getLevelType_OrdinalExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getParentExpression <em>Parent Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parent Expression</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getParentExpression()
   * @see #getLevelType()
   * @generated
   */
  EReference getLevelType_ParentExpression();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getProperty()
   * @see #getLevelType()
   * @generated
   */
  EReference getLevelType_Property();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getColumn()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_Column();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getHideMemberIf <em>Hide Member If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hide Member If</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getHideMemberIf()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_HideMemberIf();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getLevelType <em>Level Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getLevelType()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_LevelType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getName()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getNameColumn <em>Name Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Column</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getNameColumn()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_NameColumn();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getNullParentValue <em>Null Parent Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null Parent Value</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getNullParentValue()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_NullParentValue();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getOrdinalColumn <em>Ordinal Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordinal Column</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getOrdinalColumn()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_OrdinalColumn();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getParentColumn <em>Parent Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parent Column</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getParentColumn()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_ParentColumn();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getTable()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_Table();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getType()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getUniqueMembers <em>Unique Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique Members</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelType#getUniqueMembers()
   * @see #getLevelType()
   * @generated
   */
  EAttribute getLevelType_UniqueMembers();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType <em>Measure Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Measure Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.MeasureType
   * @generated
   */
  EClass getMeasureType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getAggregator <em>Aggregator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregator</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.MeasureType#getAggregator()
   * @see #getMeasureType()
   * @generated
   */
  EAttribute getMeasureType_Aggregator();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.MeasureType#getColumn()
   * @see #getMeasureType()
   * @generated
   */
  EAttribute getMeasureType_Column();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getFormatString <em>Format String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format String</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.MeasureType#getFormatString()
   * @see #getMeasureType()
   * @generated
   */
  EAttribute getMeasureType_FormatString();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.MeasureType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.MeasureType#getName()
   * @see #getMeasureType()
   * @generated
   */
  EAttribute getMeasureType_Name();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.MemberGrantType <em>Member Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Grant Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.MemberGrantType
   * @generated
   */
  EClass getMemberGrantType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.MemberGrantType#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.MemberGrantType#getAccess()
   * @see #getMemberGrantType()
   * @generated
   */
  EAttribute getMemberGrantType_Access();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.MemberGrantType#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Member</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.MemberGrantType#getMember()
   * @see #getMemberGrantType()
   * @generated
   */
  EAttribute getMemberGrantType_Member();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.NameExpressionType <em>Name Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Expression Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.NameExpressionType
   * @generated
   */
  EClass getNameExpressionType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.NameExpressionType#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>SQL</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.NameExpressionType#getSQL()
   * @see #getNameExpressionType()
   * @generated
   */
  EReference getNameExpressionType_SQL();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType <em>Ordinal Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ordinal Expression Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType
   * @generated
   */
  EClass getOrdinalExpressionType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>SQL</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType#getSQL()
   * @see #getOrdinalExpressionType()
   * @generated
   */
  EReference getOrdinalExpressionType_SQL();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ParameterType
   * @generated
   */
  EClass getParameterType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.ParameterType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ParameterType#getName()
   * @see #getParameterType()
   * @generated
   */
  EAttribute getParameterType_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.ParameterType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ParameterType#getValue()
   * @see #getParameterType()
   * @generated
   */
  EAttribute getParameterType_Value();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.ParentExpressionType <em>Parent Expression Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent Expression Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ParentExpressionType
   * @generated
   */
  EClass getParentExpressionType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.ParentExpressionType#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>SQL</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ParentExpressionType#getSQL()
   * @see #getParentExpressionType()
   * @generated
   */
  EReference getParentExpressionType_SQL();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType <em>Property Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.PropertyType
   * @generated
   */
  EClass getPropertyType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.PropertyType#getColumn()
   * @see #getPropertyType()
   * @generated
   */
  EAttribute getPropertyType_Column();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.PropertyType#getName()
   * @see #getPropertyType()
   * @generated
   */
  EAttribute getPropertyType_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.PropertyType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.PropertyType#getType()
   * @see #getPropertyType()
   * @generated
   */
  EAttribute getPropertyType_Type();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.RoleType <em>Role Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.RoleType
   * @generated
   */
  EClass getRoleType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.RoleType#getSchemaGrant <em>Schema Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Schema Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.RoleType#getSchemaGrant()
   * @see #getRoleType()
   * @generated
   */
  EReference getRoleType_SchemaGrant();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.RoleType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.RoleType#getName()
   * @see #getRoleType()
   * @generated
   */
  EAttribute getRoleType_Name();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType <em>Schema Grant Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Grant Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType
   * @generated
   */
  EClass getSchemaGrantType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType#getCubeGrant <em>Cube Grant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cube Grant</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType#getCubeGrant()
   * @see #getSchemaGrantType()
   * @generated
   */
  EReference getSchemaGrantType_CubeGrant();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType#getAccess()
   * @see #getSchemaGrantType()
   * @generated
   */
  EAttribute getSchemaGrantType_Access();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType <em>Schema Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaType
   * @generated
   */
  EClass getSchemaType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getDimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimension</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaType#getDimension()
   * @see #getSchemaType()
   * @generated
   */
  EReference getSchemaType_Dimension();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getCube <em>Cube</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cube</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaType#getCube()
   * @see #getSchemaType()
   * @generated
   */
  EReference getSchemaType_Cube();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getVirtualCube <em>Virtual Cube</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Virtual Cube</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaType#getVirtualCube()
   * @see #getSchemaType()
   * @generated
   */
  EReference getSchemaType_VirtualCube();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Role</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaType#getRole()
   * @see #getSchemaType()
   * @generated
   */
  EReference getSchemaType_Role();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getDefaultRole <em>Default Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Role</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaType#getDefaultRole()
   * @see #getSchemaType()
   * @generated
   */
  EAttribute getSchemaType_DefaultRole();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.SchemaType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SchemaType#getName()
   * @see #getSchemaType()
   * @generated
   */
  EAttribute getSchemaType_Name();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.SQLType <em>SQL Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SQL Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SQLType
   * @generated
   */
  EClass getSQLType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.SQLType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SQLType#getValue()
   * @see #getSQLType()
   * @generated
   */
  EAttribute getSQLType_Value();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.SQLType#getDialect <em>Dialect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dialect</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.SQLType#getDialect()
   * @see #getSQLType()
   * @generated
   */
  EAttribute getSQLType_Dialect();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.TableType <em>Table Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.TableType
   * @generated
   */
  EClass getTableType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.TableType#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.TableType#getAlias()
   * @see #getTableType()
   * @generated
   */
  EAttribute getTableType_Alias();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.TableType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.TableType#getName()
   * @see #getTableType()
   * @generated
   */
  EAttribute getTableType_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.TableType#getSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.TableType#getSchema()
   * @see #getTableType()
   * @generated
   */
  EAttribute getTableType_Schema();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.ViewType <em>View Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ViewType
   * @generated
   */
  EClass getViewType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.ViewType#getSQL <em>SQL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>SQL</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ViewType#getSQL()
   * @see #getViewType()
   * @generated
   */
  EReference getViewType_SQL();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.ViewType#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.ViewType#getAlias()
   * @see #getViewType()
   * @generated
   */
  EAttribute getViewType_Alias();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType <em>Virtual Cube Dimension Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Cube Dimension Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType
   * @generated
   */
  EClass getVirtualCubeDimensionType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType#getCubeName <em>Cube Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cube Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType#getCubeName()
   * @see #getVirtualCubeDimensionType()
   * @generated
   */
  EAttribute getVirtualCubeDimensionType_CubeName();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType#getForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Foreign Key</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType#getForeignKey()
   * @see #getVirtualCubeDimensionType()
   * @generated
   */
  EAttribute getVirtualCubeDimensionType_ForeignKey();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType#getName()
   * @see #getVirtualCubeDimensionType()
   * @generated
   */
  EAttribute getVirtualCubeDimensionType_Name();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType <em>Virtual Cube Measure Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Cube Measure Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType
   * @generated
   */
  EClass getVirtualCubeMeasureType();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType#getCubeName <em>Cube Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cube Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType#getCubeName()
   * @see #getVirtualCubeMeasureType()
   * @generated
   */
  EAttribute getVirtualCubeMeasureType_CubeName();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType#getName()
   * @see #getVirtualCubeMeasureType()
   * @generated
   */
  EAttribute getVirtualCubeMeasureType_Name();

  /**
   * Returns the meta object for class '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType <em>Virtual Cube Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Cube Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType
   * @generated
   */
  EClass getVirtualCubeType();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getVirtualCubeDimension <em>Virtual Cube Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Virtual Cube Dimension</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getVirtualCubeDimension()
   * @see #getVirtualCubeType()
   * @generated
   */
  EReference getVirtualCubeType_VirtualCubeDimension();

  /**
   * Returns the meta object for the containment reference list '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getVirtualCubeMeasure <em>Virtual Cube Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Virtual Cube Measure</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getVirtualCubeMeasure()
   * @see #getVirtualCubeType()
   * @generated
   */
  EReference getVirtualCubeType_VirtualCubeMeasure();

  /**
   * Returns the meta object for the attribute '{@link net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType#getName()
   * @see #getVirtualCubeType()
   * @generated
   */
  EAttribute getVirtualCubeType_Name();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType <em>Access Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @generated
   */
  EEnum getAccessType();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType1 <em>Access Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Type1</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType1
   * @generated
   */
  EEnum getAccessType1();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType2 <em>Access Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Type2</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType2
   * @generated
   */
  EEnum getAccessType2();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType3 <em>Access Type3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Type3</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType3
   * @generated
   */
  EEnum getAccessType3();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType4 <em>Access Type4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Type4</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType4
   * @generated
   */
  EEnum getAccessType4();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.DialectType <em>Dialect Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dialect Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DialectType
   * @generated
   */
  EEnum getDialectType();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.HasAllType <em>Has All Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Has All Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HasAllType
   * @generated
   */
  EEnum getHasAllType();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType <em>Hide Member If Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Hide Member If Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType
   * @generated
   */
  EEnum getHideMemberIfType();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.LevelTypeType <em>Level Type Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Level Type Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelTypeType
   * @generated
   */
  EEnum getLevelTypeType();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.TypeType <em>Type Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType
   * @generated
   */
  EEnum getTypeType();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.TypeType1 <em>Type Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Type1</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType1
   * @generated
   */
  EEnum getTypeType1();

  /**
   * Returns the meta object for enum '{@link net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType <em>Unique Members Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unique Members Type</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType
   * @generated
   */
  EEnum getUniqueMembersType();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType <em>Access Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Access Type Object</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.AccessType"
   * @generated
   */
  EDataType getAccessTypeObject();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType <em>Access Type Object1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Access Type Object1</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.AccessType"
   * @generated
   */
  EDataType getAccessTypeObject1();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType <em>Access Type Object2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Access Type Object2</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.AccessType"
   * @generated
   */
  EDataType getAccessTypeObject2();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType <em>Access Type Object3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Access Type Object3</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.AccessType"
   * @generated
   */
  EDataType getAccessTypeObject3();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.AccessType <em>Access Type Object4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Access Type Object4</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.AccessType"
   * @generated
   */
  EDataType getAccessTypeObject4();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Aggregator Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Aggregator Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   * @generated
   */
  EDataType getAggregatorType();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.DialectType <em>Dialect Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Dialect Type Object</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.DialectType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.DialectType"
   * @generated
   */
  EDataType getDialectTypeObject();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.HasAllType <em>Has All Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Has All Type Object</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HasAllType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.HasAllType"
   * @generated
   */
  EDataType getHasAllTypeObject();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType <em>Hide Member If Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Hide Member If Type Object</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType"
   * @generated
   */
  EDataType getHideMemberIfTypeObject();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.LevelTypeType <em>Level Type Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Level Type Type Object</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelTypeType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.LevelTypeType"
   * @generated
   */
  EDataType getLevelTypeTypeObject();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.TypeType <em>Type Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Type Type Object</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.TypeType"
   * @generated
   */
  EDataType getTypeTypeObject();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.TypeType <em>Type Type Object1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Type Type Object1</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.TypeType"
   * @generated
   */
  EDataType getTypeTypeObject1();

  /**
   * Returns the meta object for data type '{@link net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType <em>Unique Members Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unique Members Type Object</em>'.
   * @see net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType
   * @model instanceClass="net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType"
   * @generated
   */
  EDataType getUniqueMembersTypeObject();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MondrianFactory getMondrianFactory();

} //MondrianPackage
