/**
 * <copyright>
 * </copyright>
 *
 * $Id: HierarchyGrantTypeImpl.java,v 1.3 2004/06/30 18:27:29 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.AccessType3;
import net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType;
import net.sourceforge.mondrian.schema.Mondrian.MemberGrantType;
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
 * An implementation of the model object '<em><b>Hierarchy Grant Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyGrantTypeImpl#getMemberGrant <em>Member Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyGrantTypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyGrantTypeImpl#getBottomLevel <em>Bottom Level</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyGrantTypeImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyGrantTypeImpl#getTopLevel <em>Top Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierarchyGrantTypeImpl extends EObjectImpl implements HierarchyGrantType {
  /**
   * The cached value of the '{@link #getMemberGrant() <em>Member Grant</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberGrant()
   * @generated
   * @ordered
   */
  protected EList memberGrant = null;

  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessType3 ACCESS_EDEFAULT = AccessType3.ALL_LITERAL;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessType3 access = ACCESS_EDEFAULT;

  /**
   * This is true if the Access attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean accessESet = false;

  /**
   * The default value of the '{@link #getBottomLevel() <em>Bottom Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottomLevel()
   * @generated
   * @ordered
   */
  protected static final Object BOTTOM_LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBottomLevel() <em>Bottom Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottomLevel()
   * @generated
   * @ordered
   */
  protected Object bottomLevel = BOTTOM_LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchy()
   * @generated
   * @ordered
   */
  protected static final Object HIERARCHY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHierarchy()
   * @generated
   * @ordered
   */
  protected Object hierarchy = HIERARCHY_EDEFAULT;

  /**
   * The default value of the '{@link #getTopLevel() <em>Top Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopLevel()
   * @generated
   * @ordered
   */
  protected static final Object TOP_LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTopLevel() <em>Top Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopLevel()
   * @generated
   * @ordered
   */
  protected Object topLevel = TOP_LEVEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HierarchyGrantTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getHierarchyGrantType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getMemberGrant() {
    if (memberGrant == null) {
      memberGrant = new EObjectContainmentEList(MemberGrantType.class, this, MondrianPackage.HIERARCHY_GRANT_TYPE__MEMBER_GRANT);
    }
    return memberGrant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType3 getAccess() {
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(AccessType3 newAccess) {
    AccessType3 oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_GRANT_TYPE__ACCESS, oldAccess, access, !oldAccessESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetAccess() {
    AccessType3 oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MondrianPackage.HIERARCHY_GRANT_TYPE__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
  public Object getBottomLevel() {
    return bottomLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setBottomLevel(Object newBottomLevel) {
    if ("".equals(newBottomLevel))
      newBottomLevel = null;
    Object oldBottomLevel = bottomLevel;
    bottomLevel = newBottomLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_GRANT_TYPE__BOTTOM_LEVEL, oldBottomLevel, bottomLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getHierarchy() {
    return hierarchy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHierarchy(Object newHierarchy) {
    Object oldHierarchy = hierarchy;
    hierarchy = newHierarchy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_GRANT_TYPE__HIERARCHY, oldHierarchy, hierarchy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getTopLevel() {
    return topLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setTopLevel(Object newTopLevel) {
    if ("".equals(newTopLevel))
      newTopLevel= null;
    Object oldTopLevel = topLevel;
    topLevel = newTopLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_GRANT_TYPE__TOP_LEVEL, oldTopLevel, topLevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.HIERARCHY_GRANT_TYPE__MEMBER_GRANT:
          return ((InternalEList)getMemberGrant()).basicRemove(otherEnd, msgs);
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
      case MondrianPackage.HIERARCHY_GRANT_TYPE__MEMBER_GRANT:
        return getMemberGrant();
      case MondrianPackage.HIERARCHY_GRANT_TYPE__ACCESS:
        return getAccess();
      case MondrianPackage.HIERARCHY_GRANT_TYPE__BOTTOM_LEVEL:
        return getBottomLevel();
      case MondrianPackage.HIERARCHY_GRANT_TYPE__HIERARCHY:
        return getHierarchy();
      case MondrianPackage.HIERARCHY_GRANT_TYPE__TOP_LEVEL:
        return getTopLevel();
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
      case MondrianPackage.HIERARCHY_GRANT_TYPE__MEMBER_GRANT:
        getMemberGrant().clear();
        getMemberGrant().addAll((Collection)newValue);
        return;
      case MondrianPackage.HIERARCHY_GRANT_TYPE__ACCESS:
        setAccess((AccessType3)newValue);
        return;
      case MondrianPackage.HIERARCHY_GRANT_TYPE__BOTTOM_LEVEL:
        setBottomLevel((Object)newValue);
        return;
      case MondrianPackage.HIERARCHY_GRANT_TYPE__HIERARCHY:
        setHierarchy((Object)newValue);
        return;
      case MondrianPackage.HIERARCHY_GRANT_TYPE__TOP_LEVEL:
        setTopLevel((Object)newValue);
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
      case MondrianPackage.HIERARCHY_GRANT_TYPE__MEMBER_GRANT:
        getMemberGrant().clear();
        return;
      case MondrianPackage.HIERARCHY_GRANT_TYPE__ACCESS:
        unsetAccess();
        return;
      case MondrianPackage.HIERARCHY_GRANT_TYPE__BOTTOM_LEVEL:
        setBottomLevel(BOTTOM_LEVEL_EDEFAULT);
        return;
      case MondrianPackage.HIERARCHY_GRANT_TYPE__HIERARCHY:
        setHierarchy(HIERARCHY_EDEFAULT);
        return;
      case MondrianPackage.HIERARCHY_GRANT_TYPE__TOP_LEVEL:
        setTopLevel(TOP_LEVEL_EDEFAULT);
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
      case MondrianPackage.HIERARCHY_GRANT_TYPE__MEMBER_GRANT:
        return memberGrant != null && !memberGrant.isEmpty();
      case MondrianPackage.HIERARCHY_GRANT_TYPE__ACCESS:
        return isSetAccess();
      case MondrianPackage.HIERARCHY_GRANT_TYPE__BOTTOM_LEVEL:
        return BOTTOM_LEVEL_EDEFAULT == null ? bottomLevel != null : !BOTTOM_LEVEL_EDEFAULT.equals(bottomLevel);
      case MondrianPackage.HIERARCHY_GRANT_TYPE__HIERARCHY:
        return HIERARCHY_EDEFAULT == null ? hierarchy != null : !HIERARCHY_EDEFAULT.equals(hierarchy);
      case MondrianPackage.HIERARCHY_GRANT_TYPE__TOP_LEVEL:
        return TOP_LEVEL_EDEFAULT == null ? topLevel != null : !TOP_LEVEL_EDEFAULT.equals(topLevel);
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
    result.append(", bottomLevel: ");
    result.append(bottomLevel);
    result.append(", hierarchy: ");
    result.append(hierarchy);
    result.append(", topLevel: ");
    result.append(topLevel);
    result.append(')');
    return result.toString();
  }

} //HierarchyGrantTypeImpl
