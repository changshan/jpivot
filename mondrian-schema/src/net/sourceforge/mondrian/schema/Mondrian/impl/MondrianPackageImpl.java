/**
 * <copyright>
 * </copyright>
 *
 * $Id: MondrianPackageImpl.java,v 1.2 2004/06/30 13:45:47 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import net.sourceforge.mondrian.schema.Mondrian.AccessType;
import net.sourceforge.mondrian.schema.Mondrian.AccessType1;
import net.sourceforge.mondrian.schema.Mondrian.AccessType2;
import net.sourceforge.mondrian.schema.Mondrian.AccessType3;
import net.sourceforge.mondrian.schema.Mondrian.AccessType4;
import net.sourceforge.mondrian.schema.Mondrian.ColumnType;
import net.sourceforge.mondrian.schema.Mondrian.CubeGrantType;
import net.sourceforge.mondrian.schema.Mondrian.CubeType;
import net.sourceforge.mondrian.schema.Mondrian.DialectType;
import net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType;
import net.sourceforge.mondrian.schema.Mondrian.DimensionType;
import net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType;
import net.sourceforge.mondrian.schema.Mondrian.DocumentRoot;
import net.sourceforge.mondrian.schema.Mondrian.HasAllType;
import net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType;
import net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType;
import net.sourceforge.mondrian.schema.Mondrian.HierarchyType;
import net.sourceforge.mondrian.schema.Mondrian.JoinType;
import net.sourceforge.mondrian.schema.Mondrian.KeyExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.LevelType;
import net.sourceforge.mondrian.schema.Mondrian.LevelTypeType;
import net.sourceforge.mondrian.schema.Mondrian.MeasureType;
import net.sourceforge.mondrian.schema.Mondrian.MemberGrantType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianFactory;
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
import net.sourceforge.mondrian.schema.Mondrian.TypeType;
import net.sourceforge.mondrian.schema.Mondrian.TypeType1;
import net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType;
import net.sourceforge.mondrian.schema.Mondrian.ViewType;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeMeasureType;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType;

import net.sourceforge.mondrian.schema.Mondrian.util.MondrianValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MondrianPackageImpl extends EPackageImpl implements MondrianPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cubeGrantTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cubeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionGrantTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dimensionUsageTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hierarchyGrantTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hierarchyTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyExpressionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass levelTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass measureTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberGrantTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameExpressionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ordinalExpressionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parentExpressionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaGrantTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sqlTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virtualCubeDimensionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virtualCubeMeasureTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virtualCubeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accessTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accessType1EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accessType2EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accessType3EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accessType4EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dialectTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum hasAllTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum hideMemberIfTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum levelTypeTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeType1EEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum uniqueMembersTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType accessTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType accessTypeObject1EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType accessTypeObject2EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType accessTypeObject3EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType accessTypeObject4EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType aggregatorTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType dialectTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType hasAllTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType hideMemberIfTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType levelTypeTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType typeTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType typeTypeObject1EDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType uniqueMembersTypeObjectEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MondrianPackageImpl() {
    super(eNS_URI, MondrianFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MondrianPackage init() {
    if (isInited) return (MondrianPackage)EPackage.Registry.INSTANCE.get(MondrianPackage.eNS_URI);

    // Obtain or create and register package
    MondrianPackageImpl theMondrianPackage = (MondrianPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MondrianPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MondrianPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackageImpl.init();

    // Create package meta-data objects
    theMondrianPackage.createPackageContents();

    // Initialize created meta-data
    theMondrianPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theMondrianPackage, 
       new EValidator.Descriptor() {
         public EValidator getEValidator() {
           return MondrianValidator.INSTANCE;
         }
       });

    return theMondrianPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnType() {
    return columnTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnType_Name() {
    return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnType_Table() {
    return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCubeGrantType() {
    return cubeGrantTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCubeGrantType_DimensionGrant() {
    return (EReference)cubeGrantTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCubeGrantType_HierarchyGrant() {
    return (EReference)cubeGrantTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCubeGrantType_Access() {
    return (EAttribute)cubeGrantTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCubeGrantType_Cube() {
    return (EAttribute)cubeGrantTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCubeType() {
    return cubeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCubeType_View() {
    return (EReference)cubeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCubeType_Join() {
    return (EReference)cubeTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCubeType_Table() {
    return (EReference)cubeTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCubeType_CubeDimension() {
    return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCubeType_VirtualCubeDimension() {
    return (EReference)cubeTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCubeType_DimensionUsage() {
    return (EReference)cubeTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCubeType_Dimension() {
    return (EReference)cubeTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCubeType_Measure() {
    return (EReference)cubeTypeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCubeType_Name() {
    return (EAttribute)cubeTypeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionGrantType() {
    return dimensionGrantTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionGrantType_Access() {
    return (EAttribute)dimensionGrantTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionGrantType_Dimension() {
    return (EAttribute)dimensionGrantTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionType() {
    return dimensionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDimensionType_Hierarchy() {
    return (EReference)dimensionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionType_ForeignKey() {
    return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionType_Name() {
    return (EAttribute)dimensionTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDimensionUsageType() {
    return dimensionUsageTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionUsageType_ForeignKey() {
    return (EAttribute)dimensionUsageTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionUsageType_Level() {
    return (EAttribute)dimensionUsageTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionUsageType_Name() {
    return (EAttribute)dimensionUsageTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDimensionUsageType_Source() {
    return (EAttribute)dimensionUsageTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot() {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed() {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Column() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Cube() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CubeGrant() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Dimension() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_DimensionGrant() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_DimensionUsage() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Hierarchy() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_HierarchyGrant() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Join() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_KeyExpression() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Level() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Measure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_MemberGrant() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_NameExpression() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_OrdinalExpression() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Parameter() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ParentExpression() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Property() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Role() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Schema() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SchemaGrant() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Sql() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Table() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_View() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_VirtualCube() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_VirtualCubeDimension() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_VirtualCubeMeasure() {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHierarchyGrantType() {
    return hierarchyGrantTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHierarchyGrantType_MemberGrant() {
    return (EReference)hierarchyGrantTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyGrantType_Access() {
    return (EAttribute)hierarchyGrantTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyGrantType_BottomLevel() {
    return (EAttribute)hierarchyGrantTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyGrantType_Hierarchy() {
    return (EAttribute)hierarchyGrantTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyGrantType_TopLevel() {
    return (EAttribute)hierarchyGrantTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHierarchyType() {
    return hierarchyTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHierarchyType_View() {
    return (EReference)hierarchyTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHierarchyType_Join() {
    return (EReference)hierarchyTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHierarchyType_Table() {
    return (EReference)hierarchyTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHierarchyType_Level() {
    return (EReference)hierarchyTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHierarchyType_Parameter() {
    return (EReference)hierarchyTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyType_AllMemberName() {
    return (EAttribute)hierarchyTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyType_DefaultMember() {
    return (EAttribute)hierarchyTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyType_HasAll() {
    return (EAttribute)hierarchyTypeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyType_MemberReaderClass() {
    return (EAttribute)hierarchyTypeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyType_Name() {
    return (EAttribute)hierarchyTypeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyType_PrimaryKey() {
    return (EAttribute)hierarchyTypeEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHierarchyType_PrimaryKeyTable() {
    return (EAttribute)hierarchyTypeEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinType() {
    return joinTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinType_Relation() {
    return (EAttribute)joinTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinType_View() {
    return (EReference)joinTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinType_Join() {
    return (EReference)joinTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinType_Table() {
    return (EReference)joinTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinType_LeftAlias() {
    return (EAttribute)joinTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinType_LeftKey() {
    return (EAttribute)joinTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinType_RightAlias() {
    return (EAttribute)joinTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinType_RightKey() {
    return (EAttribute)joinTypeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyExpressionType() {
    return keyExpressionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeyExpressionType_SQL() {
    return (EReference)keyExpressionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLevelType() {
    return levelTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLevelType_KeyExpression() {
    return (EReference)levelTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLevelType_NameExpression() {
    return (EReference)levelTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLevelType_OrdinalExpression() {
    return (EReference)levelTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLevelType_ParentExpression() {
    return (EReference)levelTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLevelType_Property() {
    return (EReference)levelTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_Column() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_HideMemberIf() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_LevelType() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_Name() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_NameColumn() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_NullParentValue() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_OrdinalColumn() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_ParentColumn() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_Table() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_Type() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLevelType_UniqueMembers() {
    return (EAttribute)levelTypeEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMeasureType() {
    return measureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasureType_Aggregator() {
    return (EAttribute)measureTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasureType_Column() {
    return (EAttribute)measureTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasureType_FormatString() {
    return (EAttribute)measureTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMeasureType_Name() {
    return (EAttribute)measureTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMemberGrantType() {
    return memberGrantTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMemberGrantType_Access() {
    return (EAttribute)memberGrantTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMemberGrantType_Member() {
    return (EAttribute)memberGrantTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameExpressionType() {
    return nameExpressionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameExpressionType_SQL() {
    return (EReference)nameExpressionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrdinalExpressionType() {
    return ordinalExpressionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrdinalExpressionType_SQL() {
    return (EReference)ordinalExpressionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterType() {
    return parameterTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterType_Name() {
    return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterType_Value() {
    return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParentExpressionType() {
    return parentExpressionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParentExpressionType_SQL() {
    return (EReference)parentExpressionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyType() {
    return propertyTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyType_Column() {
    return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyType_Name() {
    return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyType_Type() {
    return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleType() {
    return roleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleType_SchemaGrant() {
    return (EReference)roleTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRoleType_Name() {
    return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemaGrantType() {
    return schemaGrantTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaGrantType_CubeGrant() {
    return (EReference)schemaGrantTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemaGrantType_Access() {
    return (EAttribute)schemaGrantTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemaType() {
    return schemaTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaType_Dimension() {
    return (EReference)schemaTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaType_Cube() {
    return (EReference)schemaTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaType_VirtualCube() {
    return (EReference)schemaTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaType_Role() {
    return (EReference)schemaTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemaType_DefaultRole() {
    return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemaType_Name() {
    return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSQLType() {
    return sqlTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSQLType_Value() {
    return (EAttribute)sqlTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSQLType_Dialect() {
    return (EAttribute)sqlTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableType() {
    return tableTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableType_Alias() {
    return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableType_Name() {
    return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableType_Schema() {
    return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewType() {
    return viewTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewType_SQL() {
    return (EReference)viewTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewType_Alias() {
    return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualCubeDimensionType() {
    return virtualCubeDimensionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualCubeDimensionType_CubeName() {
    return (EAttribute)virtualCubeDimensionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualCubeDimensionType_ForeignKey() {
    return (EAttribute)virtualCubeDimensionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualCubeDimensionType_Name() {
    return (EAttribute)virtualCubeDimensionTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualCubeMeasureType() {
    return virtualCubeMeasureTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualCubeMeasureType_CubeName() {
    return (EAttribute)virtualCubeMeasureTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualCubeMeasureType_Name() {
    return (EAttribute)virtualCubeMeasureTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualCubeType() {
    return virtualCubeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVirtualCubeType_VirtualCubeDimension() {
    return (EReference)virtualCubeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVirtualCubeType_VirtualCubeMeasure() {
    return (EReference)virtualCubeTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualCubeType_Name() {
    return (EAttribute)virtualCubeTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccessType() {
    return accessTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccessType1() {
    return accessType1EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccessType2() {
    return accessType2EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccessType3() {
    return accessType3EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccessType4() {
    return accessType4EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDialectType() {
    return dialectTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHasAllType() {
    return hasAllTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHideMemberIfType() {
    return hideMemberIfTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLevelTypeType() {
    return levelTypeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeType() {
    return typeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeType1() {
    return typeType1EEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUniqueMembersType() {
    return uniqueMembersTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAccessTypeObject() {
    return accessTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAccessTypeObject1() {
    return accessTypeObject1EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAccessTypeObject2() {
    return accessTypeObject2EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAccessTypeObject3() {
    return accessTypeObject3EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAccessTypeObject4() {
    return accessTypeObject4EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAggregatorType() {
    return aggregatorTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDialectTypeObject() {
    return dialectTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getHasAllTypeObject() {
    return hasAllTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getHideMemberIfTypeObject() {
    return hideMemberIfTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getLevelTypeTypeObject() {
    return levelTypeTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTypeTypeObject() {
    return typeTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTypeTypeObject1() {
    return typeTypeObject1EDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getUniqueMembersTypeObject() {
    return uniqueMembersTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MondrianFactory getMondrianFactory() {
    return (MondrianFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    columnTypeEClass = createEClass(COLUMN_TYPE);
    createEAttribute(columnTypeEClass, COLUMN_TYPE__NAME);
    createEAttribute(columnTypeEClass, COLUMN_TYPE__TABLE);

    cubeGrantTypeEClass = createEClass(CUBE_GRANT_TYPE);
    createEReference(cubeGrantTypeEClass, CUBE_GRANT_TYPE__DIMENSION_GRANT);
    createEReference(cubeGrantTypeEClass, CUBE_GRANT_TYPE__HIERARCHY_GRANT);
    createEAttribute(cubeGrantTypeEClass, CUBE_GRANT_TYPE__ACCESS);
    createEAttribute(cubeGrantTypeEClass, CUBE_GRANT_TYPE__CUBE);

    cubeTypeEClass = createEClass(CUBE_TYPE);
    createEReference(cubeTypeEClass, CUBE_TYPE__VIEW);
    createEReference(cubeTypeEClass, CUBE_TYPE__JOIN);
    createEReference(cubeTypeEClass, CUBE_TYPE__TABLE);
    createEAttribute(cubeTypeEClass, CUBE_TYPE__CUBE_DIMENSION);
    createEReference(cubeTypeEClass, CUBE_TYPE__VIRTUAL_CUBE_DIMENSION);
    createEReference(cubeTypeEClass, CUBE_TYPE__DIMENSION_USAGE);
    createEReference(cubeTypeEClass, CUBE_TYPE__DIMENSION);
    createEReference(cubeTypeEClass, CUBE_TYPE__MEASURE);
    createEAttribute(cubeTypeEClass, CUBE_TYPE__NAME);

    dimensionGrantTypeEClass = createEClass(DIMENSION_GRANT_TYPE);
    createEAttribute(dimensionGrantTypeEClass, DIMENSION_GRANT_TYPE__ACCESS);
    createEAttribute(dimensionGrantTypeEClass, DIMENSION_GRANT_TYPE__DIMENSION);

    dimensionTypeEClass = createEClass(DIMENSION_TYPE);
    createEReference(dimensionTypeEClass, DIMENSION_TYPE__HIERARCHY);
    createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__FOREIGN_KEY);
    createEAttribute(dimensionTypeEClass, DIMENSION_TYPE__NAME);

    dimensionUsageTypeEClass = createEClass(DIMENSION_USAGE_TYPE);
    createEAttribute(dimensionUsageTypeEClass, DIMENSION_USAGE_TYPE__FOREIGN_KEY);
    createEAttribute(dimensionUsageTypeEClass, DIMENSION_USAGE_TYPE__LEVEL);
    createEAttribute(dimensionUsageTypeEClass, DIMENSION_USAGE_TYPE__NAME);
    createEAttribute(dimensionUsageTypeEClass, DIMENSION_USAGE_TYPE__SOURCE);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__COLUMN);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CUBE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CUBE_GRANT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DIMENSION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DIMENSION_GRANT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__DIMENSION_USAGE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__HIERARCHY);
    createEReference(documentRootEClass, DOCUMENT_ROOT__HIERARCHY_GRANT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__JOIN);
    createEReference(documentRootEClass, DOCUMENT_ROOT__KEY_EXPRESSION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__LEVEL);
    createEReference(documentRootEClass, DOCUMENT_ROOT__MEASURE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__MEMBER_GRANT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__NAME_EXPRESSION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__ORDINAL_EXPRESSION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PARAMETER);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PARENT_EXPRESSION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);
    createEReference(documentRootEClass, DOCUMENT_ROOT__ROLE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEMA);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEMA_GRANT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SQL);
    createEReference(documentRootEClass, DOCUMENT_ROOT__TABLE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__VIEW);
    createEReference(documentRootEClass, DOCUMENT_ROOT__VIRTUAL_CUBE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__VIRTUAL_CUBE_DIMENSION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__VIRTUAL_CUBE_MEASURE);

    hierarchyGrantTypeEClass = createEClass(HIERARCHY_GRANT_TYPE);
    createEReference(hierarchyGrantTypeEClass, HIERARCHY_GRANT_TYPE__MEMBER_GRANT);
    createEAttribute(hierarchyGrantTypeEClass, HIERARCHY_GRANT_TYPE__ACCESS);
    createEAttribute(hierarchyGrantTypeEClass, HIERARCHY_GRANT_TYPE__BOTTOM_LEVEL);
    createEAttribute(hierarchyGrantTypeEClass, HIERARCHY_GRANT_TYPE__HIERARCHY);
    createEAttribute(hierarchyGrantTypeEClass, HIERARCHY_GRANT_TYPE__TOP_LEVEL);

    hierarchyTypeEClass = createEClass(HIERARCHY_TYPE);
    createEReference(hierarchyTypeEClass, HIERARCHY_TYPE__VIEW);
    createEReference(hierarchyTypeEClass, HIERARCHY_TYPE__JOIN);
    createEReference(hierarchyTypeEClass, HIERARCHY_TYPE__TABLE);
    createEReference(hierarchyTypeEClass, HIERARCHY_TYPE__LEVEL);
    createEReference(hierarchyTypeEClass, HIERARCHY_TYPE__PARAMETER);
    createEAttribute(hierarchyTypeEClass, HIERARCHY_TYPE__ALL_MEMBER_NAME);
    createEAttribute(hierarchyTypeEClass, HIERARCHY_TYPE__DEFAULT_MEMBER);
    createEAttribute(hierarchyTypeEClass, HIERARCHY_TYPE__HAS_ALL);
    createEAttribute(hierarchyTypeEClass, HIERARCHY_TYPE__MEMBER_READER_CLASS);
    createEAttribute(hierarchyTypeEClass, HIERARCHY_TYPE__NAME);
    createEAttribute(hierarchyTypeEClass, HIERARCHY_TYPE__PRIMARY_KEY);
    createEAttribute(hierarchyTypeEClass, HIERARCHY_TYPE__PRIMARY_KEY_TABLE);

    joinTypeEClass = createEClass(JOIN_TYPE);
    createEAttribute(joinTypeEClass, JOIN_TYPE__RELATION);
    createEReference(joinTypeEClass, JOIN_TYPE__VIEW);
    createEReference(joinTypeEClass, JOIN_TYPE__JOIN);
    createEReference(joinTypeEClass, JOIN_TYPE__TABLE);
    createEAttribute(joinTypeEClass, JOIN_TYPE__LEFT_ALIAS);
    createEAttribute(joinTypeEClass, JOIN_TYPE__LEFT_KEY);
    createEAttribute(joinTypeEClass, JOIN_TYPE__RIGHT_ALIAS);
    createEAttribute(joinTypeEClass, JOIN_TYPE__RIGHT_KEY);

    keyExpressionTypeEClass = createEClass(KEY_EXPRESSION_TYPE);
    createEReference(keyExpressionTypeEClass, KEY_EXPRESSION_TYPE__SQL);

    levelTypeEClass = createEClass(LEVEL_TYPE);
    createEReference(levelTypeEClass, LEVEL_TYPE__KEY_EXPRESSION);
    createEReference(levelTypeEClass, LEVEL_TYPE__NAME_EXPRESSION);
    createEReference(levelTypeEClass, LEVEL_TYPE__ORDINAL_EXPRESSION);
    createEReference(levelTypeEClass, LEVEL_TYPE__PARENT_EXPRESSION);
    createEReference(levelTypeEClass, LEVEL_TYPE__PROPERTY);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__COLUMN);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__HIDE_MEMBER_IF);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__LEVEL_TYPE);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__NAME);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__NAME_COLUMN);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__NULL_PARENT_VALUE);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__ORDINAL_COLUMN);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__PARENT_COLUMN);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__TABLE);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__TYPE);
    createEAttribute(levelTypeEClass, LEVEL_TYPE__UNIQUE_MEMBERS);

    measureTypeEClass = createEClass(MEASURE_TYPE);
    createEAttribute(measureTypeEClass, MEASURE_TYPE__AGGREGATOR);
    createEAttribute(measureTypeEClass, MEASURE_TYPE__COLUMN);
    createEAttribute(measureTypeEClass, MEASURE_TYPE__FORMAT_STRING);
    createEAttribute(measureTypeEClass, MEASURE_TYPE__NAME);

    memberGrantTypeEClass = createEClass(MEMBER_GRANT_TYPE);
    createEAttribute(memberGrantTypeEClass, MEMBER_GRANT_TYPE__ACCESS);
    createEAttribute(memberGrantTypeEClass, MEMBER_GRANT_TYPE__MEMBER);

    nameExpressionTypeEClass = createEClass(NAME_EXPRESSION_TYPE);
    createEReference(nameExpressionTypeEClass, NAME_EXPRESSION_TYPE__SQL);

    ordinalExpressionTypeEClass = createEClass(ORDINAL_EXPRESSION_TYPE);
    createEReference(ordinalExpressionTypeEClass, ORDINAL_EXPRESSION_TYPE__SQL);

    parameterTypeEClass = createEClass(PARAMETER_TYPE);
    createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NAME);
    createEAttribute(parameterTypeEClass, PARAMETER_TYPE__VALUE);

    parentExpressionTypeEClass = createEClass(PARENT_EXPRESSION_TYPE);
    createEReference(parentExpressionTypeEClass, PARENT_EXPRESSION_TYPE__SQL);

    propertyTypeEClass = createEClass(PROPERTY_TYPE);
    createEAttribute(propertyTypeEClass, PROPERTY_TYPE__COLUMN);
    createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
    createEAttribute(propertyTypeEClass, PROPERTY_TYPE__TYPE);

    roleTypeEClass = createEClass(ROLE_TYPE);
    createEReference(roleTypeEClass, ROLE_TYPE__SCHEMA_GRANT);
    createEAttribute(roleTypeEClass, ROLE_TYPE__NAME);

    schemaGrantTypeEClass = createEClass(SCHEMA_GRANT_TYPE);
    createEReference(schemaGrantTypeEClass, SCHEMA_GRANT_TYPE__CUBE_GRANT);
    createEAttribute(schemaGrantTypeEClass, SCHEMA_GRANT_TYPE__ACCESS);

    schemaTypeEClass = createEClass(SCHEMA_TYPE);
    createEReference(schemaTypeEClass, SCHEMA_TYPE__DIMENSION);
    createEReference(schemaTypeEClass, SCHEMA_TYPE__CUBE);
    createEReference(schemaTypeEClass, SCHEMA_TYPE__VIRTUAL_CUBE);
    createEReference(schemaTypeEClass, SCHEMA_TYPE__ROLE);
    createEAttribute(schemaTypeEClass, SCHEMA_TYPE__DEFAULT_ROLE);
    createEAttribute(schemaTypeEClass, SCHEMA_TYPE__NAME);

    sqlTypeEClass = createEClass(SQL_TYPE);
    createEAttribute(sqlTypeEClass, SQL_TYPE__VALUE);
    createEAttribute(sqlTypeEClass, SQL_TYPE__DIALECT);

    tableTypeEClass = createEClass(TABLE_TYPE);
    createEAttribute(tableTypeEClass, TABLE_TYPE__ALIAS);
    createEAttribute(tableTypeEClass, TABLE_TYPE__NAME);
    createEAttribute(tableTypeEClass, TABLE_TYPE__SCHEMA);

    viewTypeEClass = createEClass(VIEW_TYPE);
    createEReference(viewTypeEClass, VIEW_TYPE__SQL);
    createEAttribute(viewTypeEClass, VIEW_TYPE__ALIAS);

    virtualCubeDimensionTypeEClass = createEClass(VIRTUAL_CUBE_DIMENSION_TYPE);
    createEAttribute(virtualCubeDimensionTypeEClass, VIRTUAL_CUBE_DIMENSION_TYPE__CUBE_NAME);
    createEAttribute(virtualCubeDimensionTypeEClass, VIRTUAL_CUBE_DIMENSION_TYPE__FOREIGN_KEY);
    createEAttribute(virtualCubeDimensionTypeEClass, VIRTUAL_CUBE_DIMENSION_TYPE__NAME);

    virtualCubeMeasureTypeEClass = createEClass(VIRTUAL_CUBE_MEASURE_TYPE);
    createEAttribute(virtualCubeMeasureTypeEClass, VIRTUAL_CUBE_MEASURE_TYPE__CUBE_NAME);
    createEAttribute(virtualCubeMeasureTypeEClass, VIRTUAL_CUBE_MEASURE_TYPE__NAME);

    virtualCubeTypeEClass = createEClass(VIRTUAL_CUBE_TYPE);
    createEReference(virtualCubeTypeEClass, VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_DIMENSION);
    createEReference(virtualCubeTypeEClass, VIRTUAL_CUBE_TYPE__VIRTUAL_CUBE_MEASURE);
    createEAttribute(virtualCubeTypeEClass, VIRTUAL_CUBE_TYPE__NAME);

    // Create enums
    accessTypeEEnum = createEEnum(ACCESS_TYPE);
    accessType1EEnum = createEEnum(ACCESS_TYPE1);
    accessType2EEnum = createEEnum(ACCESS_TYPE2);
    accessType3EEnum = createEEnum(ACCESS_TYPE3);
    accessType4EEnum = createEEnum(ACCESS_TYPE4);
    dialectTypeEEnum = createEEnum(DIALECT_TYPE);
    hasAllTypeEEnum = createEEnum(HAS_ALL_TYPE);
    hideMemberIfTypeEEnum = createEEnum(HIDE_MEMBER_IF_TYPE);
    levelTypeTypeEEnum = createEEnum(LEVEL_TYPE_TYPE);
    typeTypeEEnum = createEEnum(TYPE_TYPE);
    typeType1EEnum = createEEnum(TYPE_TYPE1);
    uniqueMembersTypeEEnum = createEEnum(UNIQUE_MEMBERS_TYPE);

    // Create data types
    accessTypeObjectEDataType = createEDataType(ACCESS_TYPE_OBJECT);
    accessTypeObject1EDataType = createEDataType(ACCESS_TYPE_OBJECT1);
    accessTypeObject2EDataType = createEDataType(ACCESS_TYPE_OBJECT2);
    accessTypeObject3EDataType = createEDataType(ACCESS_TYPE_OBJECT3);
    accessTypeObject4EDataType = createEDataType(ACCESS_TYPE_OBJECT4);
    aggregatorTypeEDataType = createEDataType(AGGREGATOR_TYPE);
    dialectTypeObjectEDataType = createEDataType(DIALECT_TYPE_OBJECT);
    hasAllTypeObjectEDataType = createEDataType(HAS_ALL_TYPE_OBJECT);
    hideMemberIfTypeObjectEDataType = createEDataType(HIDE_MEMBER_IF_TYPE_OBJECT);
    levelTypeTypeObjectEDataType = createEDataType(LEVEL_TYPE_TYPE_OBJECT);
    typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
    typeTypeObject1EDataType = createEDataType(TYPE_TYPE_OBJECT1);
    uniqueMembersTypeObjectEDataType = createEDataType(UNIQUE_MEMBERS_TYPE_OBJECT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XMLTypePackageImpl theXMLTypePackage = (XMLTypePackageImpl)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(columnTypeEClass, ColumnType.class, "ColumnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnType_Table(), theXMLTypePackage.getAnySimpleType(), "table", null, 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cubeGrantTypeEClass, CubeGrantType.class, "CubeGrantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCubeGrantType_DimensionGrant(), this.getDimensionGrantType(), null, "dimensionGrant", null, 0, -1, CubeGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCubeGrantType_HierarchyGrant(), this.getHierarchyGrantType(), null, "hierarchyGrant", null, 0, -1, CubeGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCubeGrantType_Access(), this.getAccessType1(), "access", "all", 1, 1, CubeGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCubeGrantType_Cube(), theXMLTypePackage.getAnySimpleType(), "cube", null, 1, 1, CubeGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cubeTypeEClass, CubeType.class, "CubeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCubeType_View(), this.getViewType(), null, "view", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCubeType_Join(), this.getJoinType(), null, "join", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCubeType_Table(), this.getTableType(), null, "table", null, 0, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCubeType_CubeDimension(), ecorePackage.getEFeatureMapEntry(), "cubeDimension", null, 0, -1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCubeType_VirtualCubeDimension(), this.getVirtualCubeDimensionType(), null, "virtualCubeDimension", null, 0, -1, CubeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getCubeType_DimensionUsage(), this.getDimensionUsageType(), null, "dimensionUsage", null, 0, -1, CubeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getCubeType_Dimension(), this.getDimensionType(), null, "dimension", null, 0, -1, CubeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getCubeType_Measure(), this.getMeasureType(), null, "measure", null, 0, -1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCubeType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, CubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionGrantTypeEClass, DimensionGrantType.class, "DimensionGrantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimensionGrantType_Access(), this.getAccessType4(), "access", "all", 1, 1, DimensionGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionGrantType_Dimension(), theXMLTypePackage.getAnySimpleType(), "dimension", null, 1, 1, DimensionGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionTypeEClass, DimensionType.class, "DimensionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDimensionType_Hierarchy(), this.getHierarchyType(), null, "hierarchy", null, 0, -1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionType_ForeignKey(), theXMLTypePackage.getAnySimpleType(), "foreignKey", null, 0, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dimensionUsageTypeEClass, DimensionUsageType.class, "DimensionUsageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDimensionUsageType_ForeignKey(), theXMLTypePackage.getAnySimpleType(), "foreignKey", null, 0, 1, DimensionUsageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionUsageType_Level(), theXMLTypePackage.getAnySimpleType(), "level", null, 0, 1, DimensionUsageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionUsageType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, DimensionUsageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDimensionUsageType_Source(), theXMLTypePackage.getAnySimpleType(), "source", null, 1, 1, DimensionUsageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Column(), this.getColumnType(), null, "column", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Cube(), this.getCubeType(), null, "cube", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CubeGrant(), this.getCubeGrantType(), null, "cubeGrant", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Dimension(), this.getDimensionType(), null, "dimension", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_DimensionGrant(), this.getDimensionGrantType(), null, "dimensionGrant", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_DimensionUsage(), this.getDimensionUsageType(), null, "dimensionUsage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Hierarchy(), this.getHierarchyType(), null, "hierarchy", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_HierarchyGrant(), this.getHierarchyGrantType(), null, "hierarchyGrant", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Join(), this.getJoinType(), null, "join", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_KeyExpression(), this.getKeyExpressionType(), null, "keyExpression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Level(), this.getLevelType(), null, "level", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Measure(), this.getMeasureType(), null, "measure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_MemberGrant(), this.getMemberGrantType(), null, "memberGrant", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_NameExpression(), this.getNameExpressionType(), null, "nameExpression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_OrdinalExpression(), this.getOrdinalExpressionType(), null, "ordinalExpression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Parameter(), this.getParameterType(), null, "parameter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ParentExpression(), this.getParentExpressionType(), null, "parentExpression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Property(), this.getPropertyType(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Role(), this.getRoleType(), null, "role", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Schema(), this.getSchemaType(), null, "schema", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SchemaGrant(), this.getSchemaGrantType(), null, "schemaGrant", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Sql(), this.getSQLType(), null, "sql", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Table(), this.getTableType(), null, "table", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_View(), this.getViewType(), null, "view", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_VirtualCube(), this.getVirtualCubeType(), null, "virtualCube", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_VirtualCubeDimension(), this.getVirtualCubeDimensionType(), null, "virtualCubeDimension", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_VirtualCubeMeasure(), this.getVirtualCubeMeasureType(), null, "virtualCubeMeasure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(hierarchyGrantTypeEClass, HierarchyGrantType.class, "HierarchyGrantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHierarchyGrantType_MemberGrant(), this.getMemberGrantType(), null, "memberGrant", null, 0, -1, HierarchyGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyGrantType_Access(), this.getAccessType3(), "access", "all", 1, 1, HierarchyGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyGrantType_BottomLevel(), theXMLTypePackage.getAnySimpleType(), "bottomLevel", null, 0, 1, HierarchyGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyGrantType_Hierarchy(), theXMLTypePackage.getAnySimpleType(), "hierarchy", null, 1, 1, HierarchyGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyGrantType_TopLevel(), theXMLTypePackage.getAnySimpleType(), "topLevel", null, 0, 1, HierarchyGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hierarchyTypeEClass, HierarchyType.class, "HierarchyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHierarchyType_View(), this.getViewType(), null, "view", null, 0, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHierarchyType_Join(), this.getJoinType(), null, "join", null, 0, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHierarchyType_Table(), this.getTableType(), null, "table", null, 0, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHierarchyType_Level(), this.getLevelType(), null, "level", null, 0, -1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHierarchyType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyType_AllMemberName(), theXMLTypePackage.getAnySimpleType(), "allMemberName", null, 0, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyType_DefaultMember(), theXMLTypePackage.getAnySimpleType(), "defaultMember", null, 0, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyType_HasAll(), this.getHasAllType(), "hasAll", "true", 1, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyType_MemberReaderClass(), theXMLTypePackage.getAnySimpleType(), "memberReaderClass", null, 0, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyType_PrimaryKey(), theXMLTypePackage.getAnySimpleType(), "primaryKey", null, 0, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHierarchyType_PrimaryKeyTable(), theXMLTypePackage.getAnySimpleType(), "primaryKeyTable", null, 0, 1, HierarchyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinTypeEClass, JoinType.class, "JoinType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJoinType_Relation(), ecorePackage.getEFeatureMapEntry(), "relation", null, 0, -1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinType_View(), this.getViewType(), null, "view", null, 0, 2, JoinType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getJoinType_Join(), this.getJoinType(), null, "join", null, 0, 2, JoinType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getJoinType_Table(), this.getTableType(), null, "table", null, 0, 2, JoinType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinType_LeftAlias(), theXMLTypePackage.getAnySimpleType(), "leftAlias", null, 0, 1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinType_LeftKey(), theXMLTypePackage.getAnySimpleType(), "leftKey", null, 1, 1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinType_RightAlias(), theXMLTypePackage.getAnySimpleType(), "rightAlias", null, 0, 1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJoinType_RightKey(), theXMLTypePackage.getAnySimpleType(), "rightKey", null, 1, 1, JoinType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyExpressionTypeEClass, KeyExpressionType.class, "KeyExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKeyExpressionType_SQL(), this.getSQLType(), null, "sQL", null, 1, -1, KeyExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(levelTypeEClass, LevelType.class, "LevelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLevelType_KeyExpression(), this.getKeyExpressionType(), null, "keyExpression", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLevelType_NameExpression(), this.getNameExpressionType(), null, "nameExpression", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLevelType_OrdinalExpression(), this.getOrdinalExpressionType(), null, "ordinalExpression", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLevelType_ParentExpression(), this.getParentExpressionType(), null, "parentExpression", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLevelType_Property(), this.getPropertyType(), null, "property", null, 0, -1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_Column(), theXMLTypePackage.getAnySimpleType(), "column", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_HideMemberIf(), this.getHideMemberIfType(), "hideMemberIf", "Never", 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_LevelType(), this.getLevelTypeType(), "levelType", "Regular", 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_NameColumn(), theXMLTypePackage.getAnySimpleType(), "nameColumn", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_NullParentValue(), theXMLTypePackage.getAnySimpleType(), "nullParentValue", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_OrdinalColumn(), theXMLTypePackage.getAnySimpleType(), "ordinalColumn", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_ParentColumn(), theXMLTypePackage.getAnySimpleType(), "parentColumn", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_Table(), theXMLTypePackage.getAnySimpleType(), "table", null, 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_Type(), this.getTypeType(), "type", "String", 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLevelType_UniqueMembers(), this.getUniqueMembersType(), "uniqueMembers", "false", 0, 1, LevelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(measureTypeEClass, MeasureType.class, "MeasureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMeasureType_Aggregator(), this.getAggregatorType(), "aggregator", null, 1, 1, MeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasureType_Column(), theXMLTypePackage.getAnySimpleType(), "column", null, 1, 1, MeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasureType_FormatString(), theXMLTypePackage.getAnySimpleType(), "formatString", null, 0, 1, MeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMeasureType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, MeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberGrantTypeEClass, MemberGrantType.class, "MemberGrantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMemberGrantType_Access(), this.getAccessType(), "access", "all", 1, 1, MemberGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemberGrantType_Member(), theXMLTypePackage.getAnySimpleType(), "member", null, 1, 1, MemberGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameExpressionTypeEClass, NameExpressionType.class, "NameExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNameExpressionType_SQL(), this.getSQLType(), null, "sQL", null, 1, -1, NameExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ordinalExpressionTypeEClass, OrdinalExpressionType.class, "OrdinalExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrdinalExpressionType_SQL(), this.getSQLType(), null, "sQL", null, 1, -1, OrdinalExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterType_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parentExpressionTypeEClass, ParentExpressionType.class, "ParentExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParentExpressionType_SQL(), this.getSQLType(), null, "sQL", null, 1, -1, ParentExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyType_Column(), theXMLTypePackage.getAnySimpleType(), "column", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyType_Type(), this.getTypeType1(), "type", "String", 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleType_SchemaGrant(), this.getSchemaGrantType(), null, "schemaGrant", null, 0, -1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRoleType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaGrantTypeEClass, SchemaGrantType.class, "SchemaGrantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchemaGrantType_CubeGrant(), this.getCubeGrantType(), null, "cubeGrant", null, 0, -1, SchemaGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchemaGrantType_Access(), this.getAccessType2(), "access", "all", 1, 1, SchemaGrantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaTypeEClass, SchemaType.class, "SchemaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchemaType_Dimension(), this.getDimensionType(), null, "dimension", null, 0, -1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchemaType_Cube(), this.getCubeType(), null, "cube", null, 0, -1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchemaType_VirtualCube(), this.getVirtualCubeType(), null, "virtualCube", null, 0, -1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchemaType_Role(), this.getRoleType(), null, "role", null, 0, -1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchemaType_DefaultRole(), theXMLTypePackage.getAnySimpleType(), "defaultRole", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchemaType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sqlTypeEClass, SQLType.class, "SQLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSQLType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, SQLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSQLType_Dialect(), this.getDialectType(), "dialect", "generic", 0, 1, SQLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableType_Alias(), theXMLTypePackage.getAnySimpleType(), "alias", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableType_Schema(), theXMLTypePackage.getAnySimpleType(), "schema", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewTypeEClass, ViewType.class, "ViewType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewType_SQL(), this.getSQLType(), null, "sQL", null, 1, -1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewType_Alias(), theXMLTypePackage.getAnySimpleType(), "alias", null, 1, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualCubeDimensionTypeEClass, VirtualCubeDimensionType.class, "VirtualCubeDimensionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirtualCubeDimensionType_CubeName(), theXMLTypePackage.getAnySimpleType(), "cubeName", null, 0, 1, VirtualCubeDimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualCubeDimensionType_ForeignKey(), theXMLTypePackage.getAnySimpleType(), "foreignKey", null, 0, 1, VirtualCubeDimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualCubeDimensionType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, VirtualCubeDimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualCubeMeasureTypeEClass, VirtualCubeMeasureType.class, "VirtualCubeMeasureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirtualCubeMeasureType_CubeName(), theXMLTypePackage.getAnySimpleType(), "cubeName", null, 0, 1, VirtualCubeMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualCubeMeasureType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, VirtualCubeMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualCubeTypeEClass, VirtualCubeType.class, "VirtualCubeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVirtualCubeType_VirtualCubeDimension(), this.getVirtualCubeDimensionType(), null, "virtualCubeDimension", null, 0, -1, VirtualCubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVirtualCubeType_VirtualCubeMeasure(), this.getVirtualCubeMeasureType(), null, "virtualCubeMeasure", null, 0, -1, VirtualCubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualCubeType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, VirtualCubeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
    addEEnumLiteral(accessTypeEEnum, AccessType.ALL_LITERAL);
    addEEnumLiteral(accessTypeEEnum, AccessType.NONE_LITERAL);

    initEEnum(accessType1EEnum, AccessType1.class, "AccessType1");
    addEEnumLiteral(accessType1EEnum, AccessType1.ALL_LITERAL);
    addEEnumLiteral(accessType1EEnum, AccessType1.CUSTOM_LITERAL);
    addEEnumLiteral(accessType1EEnum, AccessType1.NONE_LITERAL);
    addEEnumLiteral(accessType1EEnum, AccessType1.ALL_DIMENSIONS_LITERAL);

    initEEnum(accessType2EEnum, AccessType2.class, "AccessType2");
    addEEnumLiteral(accessType2EEnum, AccessType2.ALL_LITERAL);
    addEEnumLiteral(accessType2EEnum, AccessType2.CUSTOM_LITERAL);
    addEEnumLiteral(accessType2EEnum, AccessType2.NONE_LITERAL);
    addEEnumLiteral(accessType2EEnum, AccessType2.ALL_DIMENSIONS_LITERAL);

    initEEnum(accessType3EEnum, AccessType3.class, "AccessType3");
    addEEnumLiteral(accessType3EEnum, AccessType3.ALL_LITERAL);
    addEEnumLiteral(accessType3EEnum, AccessType3.CUSTOM_LITERAL);
    addEEnumLiteral(accessType3EEnum, AccessType3.NONE_LITERAL);
    addEEnumLiteral(accessType3EEnum, AccessType3.ALL_DIMENSIONS_LITERAL);

    initEEnum(accessType4EEnum, AccessType4.class, "AccessType4");
    addEEnumLiteral(accessType4EEnum, AccessType4.ALL_LITERAL);
    addEEnumLiteral(accessType4EEnum, AccessType4.CUSTOM_LITERAL);
    addEEnumLiteral(accessType4EEnum, AccessType4.NONE_LITERAL);
    addEEnumLiteral(accessType4EEnum, AccessType4.ALL_DIMENSIONS_LITERAL);

    initEEnum(dialectTypeEEnum, DialectType.class, "DialectType");
    addEEnumLiteral(dialectTypeEEnum, DialectType.GENERIC_LITERAL);
    addEEnumLiteral(dialectTypeEEnum, DialectType.ORACLE_LITERAL);
    addEEnumLiteral(dialectTypeEEnum, DialectType.MYSQL_LITERAL);
    addEEnumLiteral(dialectTypeEEnum, DialectType.ACCESS_LITERAL);
    addEEnumLiteral(dialectTypeEEnum, DialectType.POSTGRES_LITERAL);
    addEEnumLiteral(dialectTypeEEnum, DialectType.HSQLDB_LITERAL);
    addEEnumLiteral(dialectTypeEEnum, DialectType.MSSQL_LITERAL);

    initEEnum(hasAllTypeEEnum, HasAllType.class, "HasAllType");
    addEEnumLiteral(hasAllTypeEEnum, HasAllType.TRUE_LITERAL);
    addEEnumLiteral(hasAllTypeEEnum, HasAllType.FALSE_LITERAL);

    initEEnum(hideMemberIfTypeEEnum, HideMemberIfType.class, "HideMemberIfType");
    addEEnumLiteral(hideMemberIfTypeEEnum, HideMemberIfType.NEVER_LITERAL);
    addEEnumLiteral(hideMemberIfTypeEEnum, HideMemberIfType.IF_BLANK_NAME_LITERAL);
    addEEnumLiteral(hideMemberIfTypeEEnum, HideMemberIfType.IF_PARENTS_NAME_LITERAL);

    initEEnum(levelTypeTypeEEnum, LevelTypeType.class, "LevelTypeType");
    addEEnumLiteral(levelTypeTypeEEnum, LevelTypeType.REGULAR_LITERAL);
    addEEnumLiteral(levelTypeTypeEEnum, LevelTypeType.TIME_YEARS_LITERAL);
    addEEnumLiteral(levelTypeTypeEEnum, LevelTypeType.TIME_QUARTERS_LITERAL);
    addEEnumLiteral(levelTypeTypeEEnum, LevelTypeType.TIME_MONTHS_LITERAL);
    addEEnumLiteral(levelTypeTypeEEnum, LevelTypeType.TIME_WEEKS_LITERAL);
    addEEnumLiteral(levelTypeTypeEEnum, LevelTypeType.TIME_DAYS_LITERAL);

    initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
    addEEnumLiteral(typeTypeEEnum, TypeType.STRING_LITERAL);
    addEEnumLiteral(typeTypeEEnum, TypeType.NUMERIC_LITERAL);

    initEEnum(typeType1EEnum, TypeType1.class, "TypeType1");
    addEEnumLiteral(typeType1EEnum, TypeType1.STRING_LITERAL);
    addEEnumLiteral(typeType1EEnum, TypeType1.NUMERIC_LITERAL);
    addEEnumLiteral(typeType1EEnum, TypeType1.BOOLEAN_LITERAL);

    initEEnum(uniqueMembersTypeEEnum, UniqueMembersType.class, "UniqueMembersType");
    addEEnumLiteral(uniqueMembersTypeEEnum, UniqueMembersType.TRUE_LITERAL);
    addEEnumLiteral(uniqueMembersTypeEEnum, UniqueMembersType.FALSE_LITERAL);

    // Initialize data types
    initEDataType(accessTypeObjectEDataType, AccessType.class, "AccessTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(accessTypeObject1EDataType, AccessType.class, "AccessTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(accessTypeObject2EDataType, AccessType.class, "AccessTypeObject2", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(accessTypeObject3EDataType, AccessType.class, "AccessTypeObject3", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(accessTypeObject4EDataType, AccessType.class, "AccessTypeObject4", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(aggregatorTypeEDataType, String.class, "AggregatorType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(dialectTypeObjectEDataType, DialectType.class, "DialectTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(hasAllTypeObjectEDataType, HasAllType.class, "HasAllTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(hideMemberIfTypeObjectEDataType, HideMemberIfType.class, "HideMemberIfTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(levelTypeTypeObjectEDataType, LevelTypeType.class, "LevelTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(typeTypeObject1EDataType, TypeType.class, "TypeTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(uniqueMembersTypeObjectEDataType, UniqueMembersType.class, "UniqueMembersTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations() {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
    addAnnotation
      (this, 
       source, 
       new String[] {
       "qualified", "false"
       });		
    addAnnotation
      (accessTypeEEnum, 
       source, 
       new String[] {
       "name", "access_._type"
       });		
    addAnnotation
      (accessType1EEnum, 
       source, 
       new String[] {
       "name", "access_._1_._type"
       });		
    addAnnotation
      (accessType2EEnum, 
       source, 
       new String[] {
       "name", "access_._2_._type"
       });		
    addAnnotation
      (accessType3EEnum, 
       source, 
       new String[] {
       "name", "access_._3_._type"
       });		
    addAnnotation
      (accessType4EEnum, 
       source, 
       new String[] {
       "name", "access_._4_._type"
       });		
    addAnnotation
      (accessTypeObjectEDataType, 
       source, 
       new String[] {
       "name", "access_._type:Object",
       "baseType", "access_._type"
       });		
    addAnnotation
      (accessTypeObject1EDataType, 
       source, 
       new String[] {
       "name", "access_._type:Object",
       "baseType", "access_._type"
       });		
    addAnnotation
      (accessTypeObject2EDataType, 
       source, 
       new String[] {
       "name", "access_._type:Object",
       "baseType", "access_._type"
       });		
    addAnnotation
      (accessTypeObject3EDataType, 
       source, 
       new String[] {
       "name", "access_._type:Object",
       "baseType", "access_._type"
       });		
    addAnnotation
      (accessTypeObject4EDataType, 
       source, 
       new String[] {
       "name", "access_._type:Object",
       "baseType", "access_._type"
       });		
    addAnnotation
      (aggregatorTypeEDataType, 
       source, 
       new String[] {
       "name", "aggregator_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
       "enumeration", "sum count min max avg distinct%20count"
       });		
    addAnnotation
      (columnTypeEClass, 
       source, 
       new String[] {
       "name", "Column_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getColumnType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getColumnType_Table(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "table",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (cubeGrantTypeEClass, 
       source, 
       new String[] {
       "name", "CubeGrant_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getCubeGrantType_DimensionGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "DimensionGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getCubeGrantType_HierarchyGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "HierarchyGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getCubeGrantType_Access(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "access",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getCubeGrantType_Cube(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "cube",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (cubeTypeEClass, 
       source, 
       new String[] {
       "name", "Cube_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getCubeType_View(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "View",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getCubeType_Join(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Join",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getCubeType_Table(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Table",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getCubeType_CubeDimension(), 
       source, 
       new String[] {
       "kind", "group",
       "name", "CubeDimension:3"
       });		
    addAnnotation
      (getCubeType_VirtualCubeDimension(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "VirtualCubeDimension",
       "namespace", "##targetNamespace",
       "group", "CubeDimension:3"
       });		
    addAnnotation
      (getCubeType_DimensionUsage(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "DimensionUsage",
       "namespace", "##targetNamespace",
       "group", "CubeDimension:3"
       });		
    addAnnotation
      (getCubeType_Dimension(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Dimension",
       "namespace", "##targetNamespace",
       "group", "CubeDimension:3"
       });		
    addAnnotation
      (getCubeType_Measure(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Measure",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getCubeType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (dialectTypeEEnum, 
       source, 
       new String[] {
       "name", "dialect_._type"
       });		
    addAnnotation
      (dialectTypeObjectEDataType, 
       source, 
       new String[] {
       "name", "dialect_._type:Object",
       "baseType", "dialect_._type"
       });		
    addAnnotation
      (dimensionGrantTypeEClass, 
       source, 
       new String[] {
       "name", "DimensionGrant_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getDimensionGrantType_Access(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "access",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDimensionGrantType_Dimension(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "dimension",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (dimensionTypeEClass, 
       source, 
       new String[] {
       "name", "Dimension_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getDimensionType_Hierarchy(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Hierarchy",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDimensionType_ForeignKey(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "foreignKey",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDimensionType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (dimensionUsageTypeEClass, 
       source, 
       new String[] {
       "name", "DimensionUsage_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getDimensionUsageType_ForeignKey(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "foreignKey",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDimensionUsageType_Level(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "level",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDimensionUsageType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDimensionUsageType_Source(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "source",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (documentRootEClass, 
       source, 
       new String[] {
       "name", "",
       "kind", "mixed"
       });		
    addAnnotation
      (getDocumentRoot_Mixed(), 
       source, 
       new String[] {
       "kind", "elementWildcard",
       "name", ":mixed"
       });		
    addAnnotation
      (getDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });		
    addAnnotation
      (getDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });		
    addAnnotation
      (getDocumentRoot_Column(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Column",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Cube(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Cube",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CubeGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "CubeGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Dimension(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Dimension",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_DimensionGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "DimensionGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_DimensionUsage(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "DimensionUsage",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Hierarchy(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Hierarchy",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_HierarchyGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "HierarchyGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Join(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Join",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_KeyExpression(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "KeyExpression",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Level(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Level",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Measure(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Measure",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_MemberGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "MemberGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_NameExpression(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "NameExpression",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_OrdinalExpression(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "OrdinalExpression",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Parameter(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Parameter",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ParentExpression(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "ParentExpression",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Property(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Property",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Role(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Role",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Schema(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Schema",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SchemaGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "SchemaGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Sql(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Table(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Table",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_View(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "View",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_VirtualCube(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "VirtualCube",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_VirtualCubeDimension(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "VirtualCubeDimension",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_VirtualCubeMeasure(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "VirtualCubeMeasure",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (hasAllTypeEEnum, 
       source, 
       new String[] {
       "name", "hasAll_._type"
       });		
    addAnnotation
      (hasAllTypeObjectEDataType, 
       source, 
       new String[] {
       "name", "hasAll_._type:Object",
       "baseType", "hasAll_._type"
       });		
    addAnnotation
      (hideMemberIfTypeEEnum, 
       source, 
       new String[] {
       "name", "hideMemberIf_._type"
       });		
    addAnnotation
      (hideMemberIfTypeObjectEDataType, 
       source, 
       new String[] {
       "name", "hideMemberIf_._type:Object",
       "baseType", "hideMemberIf_._type"
       });		
    addAnnotation
      (hierarchyGrantTypeEClass, 
       source, 
       new String[] {
       "name", "HierarchyGrant_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getHierarchyGrantType_MemberGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "MemberGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyGrantType_Access(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "access",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyGrantType_BottomLevel(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "bottomLevel",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyGrantType_Hierarchy(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "hierarchy",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyGrantType_TopLevel(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "topLevel",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (hierarchyTypeEClass, 
       source, 
       new String[] {
       "name", "Hierarchy_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getHierarchyType_View(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "View",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_Join(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Join",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_Table(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Table",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_Level(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Level",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_Parameter(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Parameter",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_AllMemberName(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "allMemberName",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_DefaultMember(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "defaultMember",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_HasAll(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "hasAll",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_MemberReaderClass(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "memberReaderClass",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_PrimaryKey(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "primaryKey",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getHierarchyType_PrimaryKeyTable(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "primaryKeyTable",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (joinTypeEClass, 
       source, 
       new String[] {
       "name", "Join_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getJoinType_Relation(), 
       source, 
       new String[] {
       "kind", "group",
       "name", "Relation:0"
       });		
    addAnnotation
      (getJoinType_View(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "View",
       "namespace", "##targetNamespace",
       "group", "Relation:0"
       });		
    addAnnotation
      (getJoinType_Join(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Join",
       "namespace", "##targetNamespace",
       "group", "Relation:0"
       });		
    addAnnotation
      (getJoinType_Table(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Table",
       "namespace", "##targetNamespace",
       "group", "Relation:0"
       });		
    addAnnotation
      (getJoinType_LeftAlias(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "leftAlias",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getJoinType_LeftKey(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "leftKey",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getJoinType_RightAlias(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "rightAlias",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getJoinType_RightKey(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "rightKey",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (keyExpressionTypeEClass, 
       source, 
       new String[] {
       "name", "KeyExpression_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getKeyExpressionType_SQL(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (levelTypeEClass, 
       source, 
       new String[] {
       "name", "Level_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getLevelType_KeyExpression(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "KeyExpression",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_NameExpression(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "NameExpression",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_OrdinalExpression(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "OrdinalExpression",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_ParentExpression(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "ParentExpression",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_Property(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Property",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_Column(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "column",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_HideMemberIf(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "hideMemberIf",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_LevelType(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "levelType",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_NameColumn(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "nameColumn",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_NullParentValue(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "nullParentValue",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_OrdinalColumn(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "ordinalColumn",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_ParentColumn(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "parentColumn",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_Table(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "table",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_Type(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getLevelType_UniqueMembers(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "uniqueMembers",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (levelTypeTypeEEnum, 
       source, 
       new String[] {
       "name", "levelType_._type"
       });		
    addAnnotation
      (levelTypeTypeObjectEDataType, 
       source, 
       new String[] {
       "name", "levelType_._type:Object",
       "baseType", "levelType_._type"
       });		
    addAnnotation
      (measureTypeEClass, 
       source, 
       new String[] {
       "name", "Measure_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getMeasureType_Aggregator(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "aggregator",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getMeasureType_Column(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "column",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getMeasureType_FormatString(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "formatString",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getMeasureType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (memberGrantTypeEClass, 
       source, 
       new String[] {
       "name", "MemberGrant_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getMemberGrantType_Access(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "access",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getMemberGrantType_Member(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "member",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (nameExpressionTypeEClass, 
       source, 
       new String[] {
       "name", "NameExpression_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getNameExpressionType_SQL(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (ordinalExpressionTypeEClass, 
       source, 
       new String[] {
       "name", "OrdinalExpression_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getOrdinalExpressionType_SQL(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (parameterTypeEClass, 
       source, 
       new String[] {
       "name", "Parameter_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getParameterType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getParameterType_Value(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "value",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (parentExpressionTypeEClass, 
       source, 
       new String[] {
       "name", "ParentExpression_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getParentExpressionType_SQL(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (propertyTypeEClass, 
       source, 
       new String[] {
       "name", "Property_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getPropertyType_Column(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "column",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getPropertyType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getPropertyType_Type(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (roleTypeEClass, 
       source, 
       new String[] {
       "name", "Role_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getRoleType_SchemaGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "SchemaGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getRoleType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (schemaGrantTypeEClass, 
       source, 
       new String[] {
       "name", "SchemaGrant_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getSchemaGrantType_CubeGrant(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "CubeGrant",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getSchemaGrantType_Access(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "access",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (schemaTypeEClass, 
       source, 
       new String[] {
       "name", "Schema_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getSchemaType_Dimension(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Dimension",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getSchemaType_Cube(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Cube",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getSchemaType_VirtualCube(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "VirtualCube",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getSchemaType_Role(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "Role",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getSchemaType_DefaultRole(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "defaultRole",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getSchemaType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (sqlTypeEClass, 
       source, 
       new String[] {
       "name", "SQL_._type",
       "kind", "simple"
       });		
    addAnnotation
      (getSQLType_Value(), 
       source, 
       new String[] {
       "name", ":0",
       "kind", "simple"
       });		
    addAnnotation
      (getSQLType_Dialect(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "dialect",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (tableTypeEClass, 
       source, 
       new String[] {
       "name", "Table_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getTableType_Alias(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "alias",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTableType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getTableType_Schema(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "schema",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (typeTypeEEnum, 
       source, 
       new String[] {
       "name", "type_._type"
       });		
    addAnnotation
      (typeType1EEnum, 
       source, 
       new String[] {
       "name", "type_._1_._type"
       });		
    addAnnotation
      (typeTypeObjectEDataType, 
       source, 
       new String[] {
       "name", "type_._type:Object",
       "baseType", "type_._type"
       });		
    addAnnotation
      (typeTypeObject1EDataType, 
       source, 
       new String[] {
       "name", "type_._type:Object",
       "baseType", "type_._type"
       });		
    addAnnotation
      (uniqueMembersTypeEEnum, 
       source, 
       new String[] {
       "name", "uniqueMembers_._type"
       });		
    addAnnotation
      (uniqueMembersTypeObjectEDataType, 
       source, 
       new String[] {
       "name", "uniqueMembers_._type:Object",
       "baseType", "uniqueMembers_._type"
       });		
    addAnnotation
      (viewTypeEClass, 
       source, 
       new String[] {
       "name", "View_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getViewType_SQL(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "SQL",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getViewType_Alias(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "alias",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (virtualCubeDimensionTypeEClass, 
       source, 
       new String[] {
       "name", "VirtualCubeDimension_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getVirtualCubeDimensionType_CubeName(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "cubeName",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getVirtualCubeDimensionType_ForeignKey(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "foreignKey",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getVirtualCubeDimensionType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (virtualCubeMeasureTypeEClass, 
       source, 
       new String[] {
       "name", "VirtualCubeMeasure_._type",
       "kind", "empty"
       });		
    addAnnotation
      (getVirtualCubeMeasureType_CubeName(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "cubeName",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getVirtualCubeMeasureType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (virtualCubeTypeEClass, 
       source, 
       new String[] {
       "name", "VirtualCube_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getVirtualCubeType_VirtualCubeDimension(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "VirtualCubeDimension",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getVirtualCubeType_VirtualCubeMeasure(), 
       source, 
       new String[] {
       "kind", "element",
       "name", "VirtualCubeMeasure",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getVirtualCubeType_Name(), 
       source, 
       new String[] {
       "kind", "attribute",
       "name", "name",
       "namespace", "##targetNamespace"
       });
  }

} //MondrianPackageImpl
