/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrdinalExpressionTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.SQLType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordinal Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.OrdinalExpressionTypeImpl#getSQL <em>SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrdinalExpressionTypeImpl extends EObjectImpl implements OrdinalExpressionType {
  /**
   * The cached value of the '{@link #getSQL() <em>SQL</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSQL()
   * @generated
   * @ordered
   */
  protected EList sQL = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrdinalExpressionTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getOrdinalExpressionType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getSQL() {
    if (sQL == null) {
      sQL = new EObjectContainmentEList(SQLType.class, this, MondrianPackage.ORDINAL_EXPRESSION_TYPE__SQL);
    }
    return sQL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.ORDINAL_EXPRESSION_TYPE__SQL:
          return ((InternalEList)getSQL()).basicRemove(otherEnd, msgs);
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
      case MondrianPackage.ORDINAL_EXPRESSION_TYPE__SQL:
        return getSQL();
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
      case MondrianPackage.ORDINAL_EXPRESSION_TYPE__SQL:
        getSQL().clear();
        getSQL().addAll((Collection)newValue);
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
      case MondrianPackage.ORDINAL_EXPRESSION_TYPE__SQL:
        getSQL().clear();
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
      case MondrianPackage.ORDINAL_EXPRESSION_TYPE__SQL:
        return sQL != null && !sQL.isEmpty();
    }
    return eDynamicIsSet(eFeature);
  }

} //OrdinalExpressionTypeImpl
