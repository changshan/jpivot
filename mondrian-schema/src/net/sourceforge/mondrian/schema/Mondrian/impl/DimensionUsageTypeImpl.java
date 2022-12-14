/**
 * <copyright>
 * </copyright>
 *
 * $Id: DimensionUsageTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import net.sourceforge.mondrian.schema.Mondrian.DimensionUsageType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Usage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DimensionUsageTypeImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DimensionUsageTypeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DimensionUsageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.DimensionUsageTypeImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionUsageTypeImpl extends EObjectImpl implements DimensionUsageType {
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
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final Object LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected Object level = LEVEL_EDEFAULT;

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
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final Object SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Object source = SOURCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DimensionUsageTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getDimensionUsageType();
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
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.DIMENSION_USAGE_TYPE__FOREIGN_KEY, oldForeignKey, foreignKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getLevel() {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(Object newLevel) {
    Object oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.DIMENSION_USAGE_TYPE__LEVEL, oldLevel, level));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.DIMENSION_USAGE_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getSource() {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Object newSource) {
    Object oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.DIMENSION_USAGE_TYPE__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.DIMENSION_USAGE_TYPE__FOREIGN_KEY:
        return getForeignKey();
      case MondrianPackage.DIMENSION_USAGE_TYPE__LEVEL:
        return getLevel();
      case MondrianPackage.DIMENSION_USAGE_TYPE__NAME:
        return getName();
      case MondrianPackage.DIMENSION_USAGE_TYPE__SOURCE:
        return getSource();
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
      case MondrianPackage.DIMENSION_USAGE_TYPE__FOREIGN_KEY:
        setForeignKey((Object)newValue);
        return;
      case MondrianPackage.DIMENSION_USAGE_TYPE__LEVEL:
        setLevel((Object)newValue);
        return;
      case MondrianPackage.DIMENSION_USAGE_TYPE__NAME:
        setName((Object)newValue);
        return;
      case MondrianPackage.DIMENSION_USAGE_TYPE__SOURCE:
        setSource((Object)newValue);
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
      case MondrianPackage.DIMENSION_USAGE_TYPE__FOREIGN_KEY:
        setForeignKey(FOREIGN_KEY_EDEFAULT);
        return;
      case MondrianPackage.DIMENSION_USAGE_TYPE__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case MondrianPackage.DIMENSION_USAGE_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MondrianPackage.DIMENSION_USAGE_TYPE__SOURCE:
        setSource(SOURCE_EDEFAULT);
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
      case MondrianPackage.DIMENSION_USAGE_TYPE__FOREIGN_KEY:
        return FOREIGN_KEY_EDEFAULT == null ? foreignKey != null : !FOREIGN_KEY_EDEFAULT.equals(foreignKey);
      case MondrianPackage.DIMENSION_USAGE_TYPE__LEVEL:
        return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
      case MondrianPackage.DIMENSION_USAGE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MondrianPackage.DIMENSION_USAGE_TYPE__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
    result.append(" (foreignKey: ");
    result.append(foreignKey);
    result.append(", level: ");
    result.append(level);
    result.append(", name: ");
    result.append(name);
    result.append(", source: ");
    result.append(source);
    result.append(')');
    return result.toString();
  }

} //DimensionUsageTypeImpl
