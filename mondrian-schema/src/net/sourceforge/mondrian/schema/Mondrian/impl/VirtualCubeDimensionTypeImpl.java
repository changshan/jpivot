/**
 * <copyright>
 * </copyright>
 *
 * $Id: VirtualCubeDimensionTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.VirtualCubeDimensionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Cube Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeDimensionTypeImpl#getCubeName <em>Cube Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeDimensionTypeImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.VirtualCubeDimensionTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualCubeDimensionTypeImpl extends EObjectImpl implements VirtualCubeDimensionType {
  /**
   * The default value of the '{@link #getCubeName() <em>Cube Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCubeName()
   * @generated
   * @ordered
   */
  protected static final Object CUBE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCubeName() <em>Cube Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCubeName()
   * @generated
   * @ordered
   */
  protected Object cubeName = CUBE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getForeignKey() <em>Foreign Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignKey()
   * @generated
   * @ordered
   */
  protected static final Object FOREIGN_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignKey()
   * @generated
   * @ordered
   */
  protected Object foreignKey = FOREIGN_KEY_EDEFAULT;

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
  protected VirtualCubeDimensionTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getVirtualCubeDimensionType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getCubeName() {
    return cubeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCubeName(Object newCubeName) {
    Object oldCubeName = cubeName;
    cubeName = newCubeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__CUBE_NAME, oldCubeName, cubeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getForeignKey() {
    return foreignKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeignKey(Object newForeignKey) {
    Object oldForeignKey = foreignKey;
    foreignKey = newForeignKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__FOREIGN_KEY, oldForeignKey, foreignKey));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__CUBE_NAME:
        return getCubeName();
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__FOREIGN_KEY:
        return getForeignKey();
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__NAME:
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
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__CUBE_NAME:
        setCubeName((Object)newValue);
        return;
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__FOREIGN_KEY:
        setForeignKey((Object)newValue);
        return;
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__NAME:
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
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__CUBE_NAME:
        setCubeName(CUBE_NAME_EDEFAULT);
        return;
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__FOREIGN_KEY:
        setForeignKey(FOREIGN_KEY_EDEFAULT);
        return;
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__NAME:
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
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__CUBE_NAME:
        return CUBE_NAME_EDEFAULT == null ? cubeName != null : !CUBE_NAME_EDEFAULT.equals(cubeName);
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__FOREIGN_KEY:
        return FOREIGN_KEY_EDEFAULT == null ? foreignKey != null : !FOREIGN_KEY_EDEFAULT.equals(foreignKey);
      case MondrianPackage.VIRTUAL_CUBE_DIMENSION_TYPE__NAME:
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
    result.append(" (cubeName: ");
    result.append(cubeName);
    result.append(", foreignKey: ");
    result.append(foreignKey);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VirtualCubeDimensionTypeImpl
