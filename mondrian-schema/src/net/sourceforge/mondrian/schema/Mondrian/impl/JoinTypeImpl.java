/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinTypeImpl.java,v 1.3 2004/06/30 18:27:29 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.JoinType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl#getView <em>View</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl#getLeftAlias <em>Left Alias</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl#getLeftKey <em>Left Key</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl#getRightAlias <em>Right Alias</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.JoinTypeImpl#getRightKey <em>Right Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinTypeImpl extends EObjectImpl implements JoinType {
  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected FeatureMap relation = null;

  /**
   * The default value of the '{@link #getLeftAlias() <em>Left Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftAlias()
   * @generated
   * @ordered
   */
  protected static final Object LEFT_ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftAlias() <em>Left Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftAlias()
   * @generated
   * @ordered
   */
  protected Object leftAlias = LEFT_ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getLeftKey() <em>Left Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftKey()
   * @generated
   * @ordered
   */
  protected static final Object LEFT_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftKey() <em>Left Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftKey()
   * @generated
   * @ordered
   */
  protected Object leftKey = LEFT_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getRightAlias() <em>Right Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightAlias()
   * @generated
   * @ordered
   */
  protected static final Object RIGHT_ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightAlias() <em>Right Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightAlias()
   * @generated
   * @ordered
   */
  protected Object rightAlias = RIGHT_ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getRightKey() <em>Right Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightKey()
   * @generated
   * @ordered
   */
  protected static final Object RIGHT_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightKey() <em>Right Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightKey()
   * @generated
   * @ordered
   */
  protected Object rightKey = RIGHT_KEY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoinTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getJoinType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getRelation() {
    if (relation == null) {
      relation = new BasicFeatureMap(this, MondrianPackage.JOIN_TYPE__RELATION);
    }
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getView() {
    return ((FeatureMap)getRelation()).list(MondrianPackage.eINSTANCE.getJoinType_View());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getJoin() {
    return ((FeatureMap)getRelation()).list(MondrianPackage.eINSTANCE.getJoinType_Join());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getTable() {
    return ((FeatureMap)getRelation()).list(MondrianPackage.eINSTANCE.getJoinType_Table());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getLeftAlias() {
    return leftAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftAlias(Object newLeftAlias) {
    Object oldLeftAlias = leftAlias;
    leftAlias = newLeftAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.JOIN_TYPE__LEFT_ALIAS, oldLeftAlias, leftAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getLeftKey() {
    return leftKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftKey(Object newLeftKey) {
    Object oldLeftKey = leftKey;
    leftKey = newLeftKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.JOIN_TYPE__LEFT_KEY, oldLeftKey, leftKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getRightAlias() {
    return rightAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightAlias(Object newRightAlias) {
    Object oldRightAlias = rightAlias;
    rightAlias = newRightAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.JOIN_TYPE__RIGHT_ALIAS, oldRightAlias, rightAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getRightKey() {
    return rightKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightKey(Object newRightKey) {
    Object oldRightKey = rightKey;
    rightKey = newRightKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.JOIN_TYPE__RIGHT_KEY, oldRightKey, rightKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.JOIN_TYPE__RELATION:
          return ((InternalEList)getRelation()).basicRemove(otherEnd, msgs);
        case MondrianPackage.JOIN_TYPE__VIEW:
          return ((InternalEList)getView()).basicRemove(otherEnd, msgs);
        case MondrianPackage.JOIN_TYPE__JOIN:
          return ((InternalEList)getJoin()).basicRemove(otherEnd, msgs);
        case MondrianPackage.JOIN_TYPE__TABLE:
          return ((InternalEList)getTable()).basicRemove(otherEnd, msgs);
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
      case MondrianPackage.JOIN_TYPE__RELATION:
        return getRelation();
      case MondrianPackage.JOIN_TYPE__VIEW:
        return getView();
      case MondrianPackage.JOIN_TYPE__JOIN:
        return getJoin();
      case MondrianPackage.JOIN_TYPE__TABLE:
        return getTable();
      case MondrianPackage.JOIN_TYPE__LEFT_ALIAS:
        return getLeftAlias();
      case MondrianPackage.JOIN_TYPE__LEFT_KEY:
        return getLeftKey();
      case MondrianPackage.JOIN_TYPE__RIGHT_ALIAS:
        return getRightAlias();
      case MondrianPackage.JOIN_TYPE__RIGHT_KEY:
        return getRightKey();
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
      case MondrianPackage.JOIN_TYPE__RELATION:
        getRelation().clear();
        getRelation().addAll((Collection)newValue);
        return;
      case MondrianPackage.JOIN_TYPE__VIEW:
        getView().clear();
        getView().addAll((Collection)newValue);
        return;
      case MondrianPackage.JOIN_TYPE__JOIN:
        getJoin().clear();
        getJoin().addAll((Collection)newValue);
        return;
      case MondrianPackage.JOIN_TYPE__TABLE:
        getTable().clear();
        getTable().addAll((Collection)newValue);
        return;
      case MondrianPackage.JOIN_TYPE__LEFT_ALIAS:
        setLeftAlias((Object)newValue);
        return;
      case MondrianPackage.JOIN_TYPE__LEFT_KEY:
        setLeftKey((Object)newValue);
        return;
      case MondrianPackage.JOIN_TYPE__RIGHT_ALIAS:
        setRightAlias((Object)newValue);
        return;
      case MondrianPackage.JOIN_TYPE__RIGHT_KEY:
        setRightKey((Object)newValue);
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
      case MondrianPackage.JOIN_TYPE__RELATION:
        getRelation().clear();
        return;
      case MondrianPackage.JOIN_TYPE__VIEW:
        getView().clear();
        return;
      case MondrianPackage.JOIN_TYPE__JOIN:
        getJoin().clear();
        return;
      case MondrianPackage.JOIN_TYPE__TABLE:
        getTable().clear();
        return;
      case MondrianPackage.JOIN_TYPE__LEFT_ALIAS:
        setLeftAlias(LEFT_ALIAS_EDEFAULT);
        return;
      case MondrianPackage.JOIN_TYPE__LEFT_KEY:
        setLeftKey(LEFT_KEY_EDEFAULT);
        return;
      case MondrianPackage.JOIN_TYPE__RIGHT_ALIAS:
        setRightAlias(RIGHT_ALIAS_EDEFAULT);
        return;
      case MondrianPackage.JOIN_TYPE__RIGHT_KEY:
        setRightKey(RIGHT_KEY_EDEFAULT);
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
      case MondrianPackage.JOIN_TYPE__RELATION:
        return relation != null && !relation.isEmpty();
      case MondrianPackage.JOIN_TYPE__VIEW:
        return !getView().isEmpty();
      case MondrianPackage.JOIN_TYPE__JOIN:
        return !getJoin().isEmpty();
      case MondrianPackage.JOIN_TYPE__TABLE:
        return !getTable().isEmpty();
      case MondrianPackage.JOIN_TYPE__LEFT_ALIAS:
        return LEFT_ALIAS_EDEFAULT == null ? leftAlias != null : !LEFT_ALIAS_EDEFAULT.equals(leftAlias);
      case MondrianPackage.JOIN_TYPE__LEFT_KEY:
        return LEFT_KEY_EDEFAULT == null ? leftKey != null : !LEFT_KEY_EDEFAULT.equals(leftKey);
      case MondrianPackage.JOIN_TYPE__RIGHT_ALIAS:
        return RIGHT_ALIAS_EDEFAULT == null ? rightAlias != null : !RIGHT_ALIAS_EDEFAULT.equals(rightAlias);
      case MondrianPackage.JOIN_TYPE__RIGHT_KEY:
        return RIGHT_KEY_EDEFAULT == null ? rightKey != null : !RIGHT_KEY_EDEFAULT.equals(rightKey);
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
    result.append(" (relation: ");
    result.append(relation);
    result.append(", leftAlias: ");
    result.append(leftAlias);
    result.append(", leftKey: ");
    result.append(leftKey);
    result.append(", rightAlias: ");
    result.append(rightAlias);
    result.append(", rightKey: ");
    result.append(rightKey);
    result.append(')');
    return result.toString();
  }

} //JoinTypeImpl
