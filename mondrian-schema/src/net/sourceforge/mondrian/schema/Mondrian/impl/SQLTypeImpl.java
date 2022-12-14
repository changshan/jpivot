/**
 * <copyright>
 * </copyright>
 *
 * $Id: SQLTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import net.sourceforge.mondrian.schema.Mondrian.DialectType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.SQLType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SQL Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SQLTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.SQLTypeImpl#getDialect <em>Dialect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SQLTypeImpl extends EObjectImpl implements SQLType {
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDialect()
   * @generated
   * @ordered
   */
  protected static final DialectType DIALECT_EDEFAULT = DialectType.GENERIC_LITERAL;

  /**
   * The cached value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDialect()
   * @generated
   * @ordered
   */
  protected DialectType dialect = DIALECT_EDEFAULT;

  /**
   * This is true if the Dialect attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean dialectESet = false;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SQLTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getSQLType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue) {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.SQL_TYPE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialectType getDialect() {
    return dialect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDialect(DialectType newDialect) {
    DialectType oldDialect = dialect;
    dialect = newDialect == null ? DIALECT_EDEFAULT : newDialect;
    boolean oldDialectESet = dialectESet;
    dialectESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.SQL_TYPE__DIALECT, oldDialect, dialect, !oldDialectESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetDialect() {
    DialectType oldDialect = dialect;
    boolean oldDialectESet = dialectESet;
    dialect = DIALECT_EDEFAULT;
    dialectESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MondrianPackage.SQL_TYPE__DIALECT, oldDialect, DIALECT_EDEFAULT, oldDialectESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetDialect() {
    return dialectESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
    switch (eDerivedStructuralFeatureID(eFeature)) {
      case MondrianPackage.SQL_TYPE__VALUE:
        return getValue();
      case MondrianPackage.SQL_TYPE__DIALECT:
        return getDialect();
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
      case MondrianPackage.SQL_TYPE__VALUE:
        setValue((String)newValue);
        return;
      case MondrianPackage.SQL_TYPE__DIALECT:
        setDialect((DialectType)newValue);
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
      case MondrianPackage.SQL_TYPE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MondrianPackage.SQL_TYPE__DIALECT:
        unsetDialect();
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
      case MondrianPackage.SQL_TYPE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case MondrianPackage.SQL_TYPE__DIALECT:
        return isSetDialect();
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
    result.append(" (value: ");
    result.append(value);
    result.append(", dialect: ");
    if (dialectESet) result.append(dialect); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //SQLTypeImpl
