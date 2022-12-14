/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchemaGrantTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.AccessType2;
import net.sourceforge.mondrian.schema.Mondrian.CubeGrantType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.SchemaGrantType;

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
 * An implementation of the model object '<em><b>Schema Grant Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaGrantTypeImpl#getCubeGrant <em>Cube Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SchemaGrantTypeImpl#getAccess <em>Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaGrantTypeImpl extends EObjectImpl implements SchemaGrantType {
  /**
   * The cached value of the '{@link #getCubeGrant() <em>Cube Grant</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCubeGrant()
   * @generated
   * @ordered
   */
  protected EList cubeGrant = null;

  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessType2 ACCESS_EDEFAULT = AccessType2.ALL_LITERAL;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessType2 access = ACCESS_EDEFAULT;

  /**
   * This is true if the Access attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean accessESet = false;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaGrantTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getSchemaGrantType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getCubeGrant() {
    if (cubeGrant == null) {
      cubeGrant = new EObjectContainmentEList(CubeGrantType.class, this, MondrianPackage.SCHEMA_GRANT_TYPE__CUBE_GRANT);
    }
    return cubeGrant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessType2 getAccess() {
    return access;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccess(AccessType2 newAccess) {
    AccessType2 oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.SCHEMA_GRANT_TYPE__ACCESS, oldAccess, access, !oldAccessESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetAccess() {
    AccessType2 oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MondrianPackage.SCHEMA_GRANT_TYPE__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.SCHEMA_GRANT_TYPE__CUBE_GRANT:
          return ((InternalEList)getCubeGrant()).basicRemove(otherEnd, msgs);
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
      case MondrianPackage.SCHEMA_GRANT_TYPE__CUBE_GRANT:
        return getCubeGrant();
      case MondrianPackage.SCHEMA_GRANT_TYPE__ACCESS:
        return getAccess();
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
      case MondrianPackage.SCHEMA_GRANT_TYPE__CUBE_GRANT:
        getCubeGrant().clear();
        getCubeGrant().addAll((Collection)newValue);
        return;
      case MondrianPackage.SCHEMA_GRANT_TYPE__ACCESS:
        setAccess((AccessType2)newValue);
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
      case MondrianPackage.SCHEMA_GRANT_TYPE__CUBE_GRANT:
        getCubeGrant().clear();
        return;
      case MondrianPackage.SCHEMA_GRANT_TYPE__ACCESS:
        unsetAccess();
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
      case MondrianPackage.SCHEMA_GRANT_TYPE__CUBE_GRANT:
        return cubeGrant != null && !cubeGrant.isEmpty();
      case MondrianPackage.SCHEMA_GRANT_TYPE__ACCESS:
        return isSetAccess();
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
    result.append(')');
    return result.toString();
  }

} //SchemaGrantTypeImpl
