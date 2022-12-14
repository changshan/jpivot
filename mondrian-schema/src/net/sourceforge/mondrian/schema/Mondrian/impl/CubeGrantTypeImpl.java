/**
 * <copyright>
 * </copyright>
 *
 * $Id: CubeGrantTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.AccessType1;
import net.sourceforge.mondrian.schema.Mondrian.CubeGrantType;
import net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType;
import net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;

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
 * An implementation of the model object '<em><b>Cube Grant Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeGrantTypeImpl#getDimensionGrant <em>Dimension Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeGrantTypeImpl#getHierarchyGrant <em>Hierarchy Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeGrantTypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.CubeGrantTypeImpl#getCube <em>Cube</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CubeGrantTypeImpl extends EObjectImpl implements CubeGrantType {
  /**
   * The cached value of the '{@link #getDimensionGrant() <em>Dimension Grant</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensionGrant()
   * @generated
   * @ordered
   */
  protected EList dimensionGrant = null;

  /**
   * The cached value of the '{@link #getHierarchyGrant() <em>Hierarchy Grant</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchyGrant()
   * @generated
   * @ordered
   */
  protected EList hierarchyGrant = null;

  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessType1 ACCESS_EDEFAULT = AccessType1.ALL_LITERAL;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessType1 access = ACCESS_EDEFAULT;

  /**
   * This is true if the Access attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean accessESet = false;

  /**
   * The default value of the '{@link #getCube() <em>Cube</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCube()
   * @generated
   * @ordered
   */
  protected static final Object CUBE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCube() <em>Cube</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCube()
   * @generated
   * @ordered
   */
  protected Object cube = CUBE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CubeGrantTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getCubeGrantType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDimensionGrant() {
    if (dimensionGrant == null) {
      dimensionGrant = new EObjectContainmentEList(DimensionGrantType.class, this, MondrianPackage.CUBE_GRANT_TYPE__DIMENSION_GRANT);
    }
    return dimensionGrant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getHierarchyGrant() {
    if (hierarchyGrant == null) {
      hierarchyGrant = new EObjectContainmentEList(HierarchyGrantType.class, this, MondrianPackage.CUBE_GRANT_TYPE__HIERARCHY_GRANT);
    }
    return hierarchyGrant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType1 getAccess() {
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(AccessType1 newAccess) {
    AccessType1 oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.CUBE_GRANT_TYPE__ACCESS, oldAccess, access, !oldAccessESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetAccess() {
    AccessType1 oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MondrianPackage.CUBE_GRANT_TYPE__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAccess() {
    return accessESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getCube() {
    return cube;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCube(Object newCube) {
    Object oldCube = cube;
    cube = newCube;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.CUBE_GRANT_TYPE__CUBE, oldCube, cube));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.CUBE_GRANT_TYPE__DIMENSION_GRANT:
          return ((InternalEList)getDimensionGrant()).basicRemove(otherEnd, msgs);
        case MondrianPackage.CUBE_GRANT_TYPE__HIERARCHY_GRANT:
          return ((InternalEList)getHierarchyGrant()).basicRemove(otherEnd, msgs);
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
      case MondrianPackage.CUBE_GRANT_TYPE__DIMENSION_GRANT:
        return getDimensionGrant();
      case MondrianPackage.CUBE_GRANT_TYPE__HIERARCHY_GRANT:
        return getHierarchyGrant();
      case MondrianPackage.CUBE_GRANT_TYPE__ACCESS:
        return getAccess();
      case MondrianPackage.CUBE_GRANT_TYPE__CUBE:
        return getCube();
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
      case MondrianPackage.CUBE_GRANT_TYPE__DIMENSION_GRANT:
        getDimensionGrant().clear();
        getDimensionGrant().addAll((Collection)newValue);
        return;
      case MondrianPackage.CUBE_GRANT_TYPE__HIERARCHY_GRANT:
        getHierarchyGrant().clear();
        getHierarchyGrant().addAll((Collection)newValue);
        return;
      case MondrianPackage.CUBE_GRANT_TYPE__ACCESS:
        setAccess((AccessType1)newValue);
        return;
      case MondrianPackage.CUBE_GRANT_TYPE__CUBE:
        setCube((Object)newValue);
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
      case MondrianPackage.CUBE_GRANT_TYPE__DIMENSION_GRANT:
        getDimensionGrant().clear();
        return;
      case MondrianPackage.CUBE_GRANT_TYPE__HIERARCHY_GRANT:
        getHierarchyGrant().clear();
        return;
      case MondrianPackage.CUBE_GRANT_TYPE__ACCESS:
        unsetAccess();
        return;
      case MondrianPackage.CUBE_GRANT_TYPE__CUBE:
        setCube(CUBE_EDEFAULT);
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
      case MondrianPackage.CUBE_GRANT_TYPE__DIMENSION_GRANT:
        return dimensionGrant != null && !dimensionGrant.isEmpty();
      case MondrianPackage.CUBE_GRANT_TYPE__HIERARCHY_GRANT:
        return hierarchyGrant != null && !hierarchyGrant.isEmpty();
      case MondrianPackage.CUBE_GRANT_TYPE__ACCESS:
        return isSetAccess();
      case MondrianPackage.CUBE_GRANT_TYPE__CUBE:
        return CUBE_EDEFAULT == null ? cube != null : !CUBE_EDEFAULT.equals(cube);
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
    result.append(" (access: ");
    if (accessESet) result.append(access); else result.append("<unset>");
    result.append(", cube: ");
    result.append(cube);
    result.append(')');
    return result.toString();
  }

} //CubeGrantTypeImpl
