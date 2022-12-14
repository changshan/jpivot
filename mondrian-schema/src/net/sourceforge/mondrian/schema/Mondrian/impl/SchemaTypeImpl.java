/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchemaTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.CubeType;
import net.sourceforge.mondrian.schema.Mondrian.DimensionType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.RoleType;
import net.sourceforge.mondrian.schema.Mondrian.SchemaType;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaTypeImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaTypeImpl#getCube <em>Cube</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaTypeImpl#getVirtualCube <em>Virtual Cube</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaTypeImpl#getDefaultRole <em>Default Role</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaTypeImpl extends EObjectImpl implements SchemaType {
  /**
   * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimension()
   * @generated
   * @ordered
   */
  protected EList dimension = null;

  /**
   * The cached value of the '{@link #getCube() <em>Cube</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCube()
   * @generated
   * @ordered
   */
  protected EList cube = null;

  /**
   * The cached value of the '{@link #getVirtualCube() <em>Virtual Cube</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVirtualCube()
   * @generated
   * @ordered
   */
  protected EList virtualCube = null;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected EList role = null;

  /**
   * The default value of the '{@link #getDefaultRole() <em>Default Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultRole()
   * @generated
   * @ordered
   */
  protected static final Object DEFAULT_ROLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultRole() <em>Default Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultRole()
   * @generated
   * @ordered
   */
  protected Object defaultRole = DEFAULT_ROLE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final Object NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Object name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getSchemaType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDimension() {
    if (dimension == null) {
      dimension = new EObjectContainmentEList(DimensionType.class, this, MondrianPackage.SCHEMA_TYPE__DIMENSION);
    }
    return dimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getCube() {
    if (cube == null) {
      cube = new EObjectContainmentEList(CubeType.class, this, MondrianPackage.SCHEMA_TYPE__CUBE);
    }
    return cube;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getVirtualCube() {
    if (virtualCube == null) {
      virtualCube = new EObjectContainmentEList(VirtualCubeType.class, this, MondrianPackage.SCHEMA_TYPE__VIRTUAL_CUBE);
    }
    return virtualCube;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRole() {
    if (role == null) {
      role = new EObjectContainmentEList(RoleType.class, this, MondrianPackage.SCHEMA_TYPE__ROLE);
    }
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getDefaultRole() {
    return defaultRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultRole(Object newDefaultRole) {
    Object oldDefaultRole = defaultRole;
    defaultRole = newDefaultRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.SCHEMA_TYPE__DEFAULT_ROLE, oldDefaultRole, defaultRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Object newName) {
    Object oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.SCHEMA_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.SCHEMA_TYPE__DIMENSION:
          return ((InternalEList)getDimension()).basicRemove(otherEnd, msgs);
        case MondrianPackage.SCHEMA_TYPE__CUBE:
          return ((InternalEList)getCube()).basicRemove(otherEnd, msgs);
        case MondrianPackage.SCHEMA_TYPE__VIRTUAL_CUBE:
          return ((InternalEList)getVirtualCube()).basicRemove(otherEnd, msgs);
        case MondrianPackage.SCHEMA_TYPE__ROLE:
          return ((InternalEList)getRole()).basicRemove(otherEnd, msgs);
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
      case MondrianPackage.SCHEMA_TYPE__DIMENSION:
        return getDimension();
      case MondrianPackage.SCHEMA_TYPE__CUBE:
        return getCube();
      case MondrianPackage.SCHEMA_TYPE__VIRTUAL_CUBE:
        return getVirtualCube();
      case MondrianPackage.SCHEMA_TYPE__ROLE:
        return getRole();
      case MondrianPackage.SCHEMA_TYPE__DEFAULT_ROLE:
        return getDefaultRole();
      case MondrianPackage.SCHEMA_TYPE__NAME:
        return getName();
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
      case MondrianPackage.SCHEMA_TYPE__DIMENSION:
        getDimension().clear();
        getDimension().addAll((Collection)newValue);
        return;
      case MondrianPackage.SCHEMA_TYPE__CUBE:
        getCube().clear();
        getCube().addAll((Collection)newValue);
        return;
      case MondrianPackage.SCHEMA_TYPE__VIRTUAL_CUBE:
        getVirtualCube().clear();
        getVirtualCube().addAll((Collection)newValue);
        return;
      case MondrianPackage.SCHEMA_TYPE__ROLE:
        getRole().clear();
        getRole().addAll((Collection)newValue);
        return;
      case MondrianPackage.SCHEMA_TYPE__DEFAULT_ROLE:
        setDefaultRole((Object)newValue);
        return;
      case MondrianPackage.SCHEMA_TYPE__NAME:
        setName((Object)newValue);
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
      case MondrianPackage.SCHEMA_TYPE__DIMENSION:
        getDimension().clear();
        return;
      case MondrianPackage.SCHEMA_TYPE__CUBE:
        getCube().clear();
        return;
      case MondrianPackage.SCHEMA_TYPE__VIRTUAL_CUBE:
        getVirtualCube().clear();
        return;
      case MondrianPackage.SCHEMA_TYPE__ROLE:
        getRole().clear();
        return;
      case MondrianPackage.SCHEMA_TYPE__DEFAULT_ROLE:
        setDefaultRole(DEFAULT_ROLE_EDEFAULT);
        return;
      case MondrianPackage.SCHEMA_TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case MondrianPackage.SCHEMA_TYPE__DIMENSION:
        return dimension != null && !dimension.isEmpty();
      case MondrianPackage.SCHEMA_TYPE__CUBE:
        return cube != null && !cube.isEmpty();
      case MondrianPackage.SCHEMA_TYPE__VIRTUAL_CUBE:
        return virtualCube != null && !virtualCube.isEmpty();
      case MondrianPackage.SCHEMA_TYPE__ROLE:
        return role != null && !role.isEmpty();
      case MondrianPackage.SCHEMA_TYPE__DEFAULT_ROLE:
        return DEFAULT_ROLE_EDEFAULT == null ? defaultRole != null : !DEFAULT_ROLE_EDEFAULT.equals(defaultRole);
      case MondrianPackage.SCHEMA_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (defaultRole: ");
    result.append(defaultRole);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SchemaTypeImpl
