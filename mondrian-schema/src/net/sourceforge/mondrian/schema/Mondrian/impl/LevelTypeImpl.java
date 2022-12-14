/**
 * <copyright>
 * </copyright>
 *
 * $Id: LevelTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType;
import net.sourceforge.mondrian.schema.Mondrian.KeyExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.LevelType;
import net.sourceforge.mondrian.schema.Mondrian.LevelTypeType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.NameExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.ParentExpressionType;
import net.sourceforge.mondrian.schema.Mondrian.PropertyType;
import net.sourceforge.mondrian.schema.Mondrian.TypeType;
import net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType;

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
 * An implementation of the model object '<em><b>Level Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getKeyExpression <em>Key Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getOrdinalExpression <em>Ordinal Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getParentExpression <em>Parent Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getHideMemberIf <em>Hide Member If</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getLevelType <em>Level Type</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getNameColumn <em>Name Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getNullParentValue <em>Null Parent Value</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getOrdinalColumn <em>Ordinal Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getParentColumn <em>Parent Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.LevelTypeImpl#getUniqueMembers <em>Unique Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LevelTypeImpl extends EObjectImpl implements LevelType {
  /**
   * The cached value of the '{@link #getKeyExpression() <em>Key Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyExpression()
   * @generated
   * @ordered
   */
  protected KeyExpressionType keyExpression = null;

  /**
   * The cached value of the '{@link #getNameExpression() <em>Name Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameExpression()
   * @generated
   * @ordered
   */
  protected NameExpressionType nameExpression = null;

  /**
   * The cached value of the '{@link #getOrdinalExpression() <em>Ordinal Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdinalExpression()
   * @generated
   * @ordered
   */
  protected OrdinalExpressionType ordinalExpression = null;

  /**
   * The cached value of the '{@link #getParentExpression() <em>Parent Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentExpression()
   * @generated
   * @ordered
   */
  protected ParentExpressionType parentExpression = null;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList property = null;

  /**
   * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected static final Object COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected Object column = COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getHideMemberIf() <em>Hide Member If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHideMemberIf()
   * @generated
   * @ordered
   */
  protected static final HideMemberIfType HIDE_MEMBER_IF_EDEFAULT = HideMemberIfType.NEVER_LITERAL;

  /**
   * The cached value of the '{@link #getHideMemberIf() <em>Hide Member If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHideMemberIf()
   * @generated
   * @ordered
   */
  protected HideMemberIfType hideMemberIf = HIDE_MEMBER_IF_EDEFAULT;

  /**
   * This is true if the Hide Member If attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean hideMemberIfESet = false;

  /**
   * The default value of the '{@link #getLevelType() <em>Level Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevelType()
   * @generated
   * @ordered
   */
  protected static final LevelTypeType LEVEL_TYPE_EDEFAULT = LevelTypeType.REGULAR_LITERAL;

  /**
   * The cached value of the '{@link #getLevelType() <em>Level Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevelType()
   * @generated
   * @ordered
   */
  protected LevelTypeType levelType = LEVEL_TYPE_EDEFAULT;

  /**
   * This is true if the Level Type attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean levelTypeESet = false;

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
   * The default value of the '{@link #getNameColumn() <em>Name Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameColumn()
   * @generated
   * @ordered
   */
  protected static final Object NAME_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameColumn() <em>Name Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameColumn()
   * @generated
   * @ordered
   */
  protected Object nameColumn = NAME_COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getNullParentValue() <em>Null Parent Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullParentValue()
   * @generated
   * @ordered
   */
  protected static final Object NULL_PARENT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNullParentValue() <em>Null Parent Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullParentValue()
   * @generated
   * @ordered
   */
  protected Object nullParentValue = NULL_PARENT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getOrdinalColumn() <em>Ordinal Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdinalColumn()
   * @generated
   * @ordered
   */
  protected static final Object ORDINAL_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrdinalColumn() <em>Ordinal Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdinalColumn()
   * @generated
   * @ordered
   */
  protected Object ordinalColumn = ORDINAL_COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getParentColumn() <em>Parent Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentColumn()
   * @generated
   * @ordered
   */
  protected static final Object PARENT_COLUMN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParentColumn() <em>Parent Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParentColumn()
   * @generated
   * @ordered
   */
  protected Object parentColumn = PARENT_COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected static final Object TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected Object table = TABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final TypeType TYPE_EDEFAULT = TypeType.STRING_LITERAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeType type = TYPE_EDEFAULT;

  /**
   * This is true if the Type attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean typeESet = false;

  /**
   * The default value of the '{@link #getUniqueMembers() <em>Unique Members</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniqueMembers()
   * @generated
   * @ordered
   */
  protected static final UniqueMembersType UNIQUE_MEMBERS_EDEFAULT = UniqueMembersType.FALSE_LITERAL;

  /**
   * The cached value of the '{@link #getUniqueMembers() <em>Unique Members</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniqueMembers()
   * @generated
   * @ordered
   */
  protected UniqueMembersType uniqueMembers = UNIQUE_MEMBERS_EDEFAULT;

  /**
   * This is true if the Unique Members attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean uniqueMembersESet = false;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LevelTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getLevelType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyExpressionType getKeyExpression() {
    return keyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyExpression(KeyExpressionType newKeyExpression, NotificationChain msgs) {
    KeyExpressionType oldKeyExpression = keyExpression;
    keyExpression = newKeyExpression;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION, oldKeyExpression, newKeyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyExpression(KeyExpressionType newKeyExpression) {
    if (newKeyExpression != keyExpression) {
      NotificationChain msgs = null;
      if (keyExpression != null)
        msgs = ((InternalEObject)keyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION, null, msgs);
      if (newKeyExpression != null)
        msgs = ((InternalEObject)newKeyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION, null, msgs);
      msgs = basicSetKeyExpression(newKeyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION, newKeyExpression, newKeyExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameExpressionType getNameExpression() {
    return nameExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameExpression(NameExpressionType newNameExpression, NotificationChain msgs) {
    NameExpressionType oldNameExpression = nameExpression;
    nameExpression = newNameExpression;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION, oldNameExpression, newNameExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameExpression(NameExpressionType newNameExpression) {
    if (newNameExpression != nameExpression) {
      NotificationChain msgs = null;
      if (nameExpression != null)
        msgs = ((InternalEObject)nameExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION, null, msgs);
      if (newNameExpression != null)
        msgs = ((InternalEObject)newNameExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION, null, msgs);
      msgs = basicSetNameExpression(newNameExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION, newNameExpression, newNameExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrdinalExpressionType getOrdinalExpression() {
    return ordinalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrdinalExpression(OrdinalExpressionType newOrdinalExpression, NotificationChain msgs) {
    OrdinalExpressionType oldOrdinalExpression = ordinalExpression;
    ordinalExpression = newOrdinalExpression;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION, oldOrdinalExpression, newOrdinalExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrdinalExpression(OrdinalExpressionType newOrdinalExpression) {
    if (newOrdinalExpression != ordinalExpression) {
      NotificationChain msgs = null;
      if (ordinalExpression != null)
        msgs = ((InternalEObject)ordinalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION, null, msgs);
      if (newOrdinalExpression != null)
        msgs = ((InternalEObject)newOrdinalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION, null, msgs);
      msgs = basicSetOrdinalExpression(newOrdinalExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION, newOrdinalExpression, newOrdinalExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentExpressionType getParentExpression() {
    return parentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentExpression(ParentExpressionType newParentExpression, NotificationChain msgs) {
    ParentExpressionType oldParentExpression = parentExpression;
    parentExpression = newParentExpression;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION, oldParentExpression, newParentExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentExpression(ParentExpressionType newParentExpression) {
    if (newParentExpression != parentExpression) {
      NotificationChain msgs = null;
      if (parentExpression != null)
        msgs = ((InternalEObject)parentExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION, null, msgs);
      if (newParentExpression != null)
        msgs = ((InternalEObject)newParentExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION, null, msgs);
      msgs = basicSetParentExpression(newParentExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION, newParentExpression, newParentExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList(PropertyType.class, this, MondrianPackage.LEVEL_TYPE__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getColumn() {
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(Object newColumn) {
    Object oldColumn = column;
    column = newColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__COLUMN, oldColumn, column));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HideMemberIfType getHideMemberIf() {
    return hideMemberIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHideMemberIf(HideMemberIfType newHideMemberIf) {
    HideMemberIfType oldHideMemberIf = hideMemberIf;
    hideMemberIf = newHideMemberIf == null ? HIDE_MEMBER_IF_EDEFAULT : newHideMemberIf;
    boolean oldHideMemberIfESet = hideMemberIfESet;
    hideMemberIfESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__HIDE_MEMBER_IF, oldHideMemberIf, hideMemberIf, !oldHideMemberIfESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetHideMemberIf() {
    HideMemberIfType oldHideMemberIf = hideMemberIf;
    boolean oldHideMemberIfESet = hideMemberIfESet;
    hideMemberIf = HIDE_MEMBER_IF_EDEFAULT;
    hideMemberIfESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MondrianPackage.LEVEL_TYPE__HIDE_MEMBER_IF, oldHideMemberIf, HIDE_MEMBER_IF_EDEFAULT, oldHideMemberIfESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetHideMemberIf() {
    return hideMemberIfESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LevelTypeType getLevelType() {
    return levelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevelType(LevelTypeType newLevelType) {
    LevelTypeType oldLevelType = levelType;
    levelType = newLevelType == null ? LEVEL_TYPE_EDEFAULT : newLevelType;
    boolean oldLevelTypeESet = levelTypeESet;
    levelTypeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__LEVEL_TYPE, oldLevelType, levelType, !oldLevelTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetLevelType() {
    LevelTypeType oldLevelType = levelType;
    boolean oldLevelTypeESet = levelTypeESet;
    levelType = LEVEL_TYPE_EDEFAULT;
    levelTypeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MondrianPackage.LEVEL_TYPE__LEVEL_TYPE, oldLevelType, LEVEL_TYPE_EDEFAULT, oldLevelTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetLevelType() {
    return levelTypeESet;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getNameColumn() {
    return nameColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameColumn(Object newNameColumn) {
    Object oldNameColumn = nameColumn;
    nameColumn = newNameColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__NAME_COLUMN, oldNameColumn, nameColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getNullParentValue() {
    return nullParentValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullParentValue(Object newNullParentValue) {
    Object oldNullParentValue = nullParentValue;
    nullParentValue = newNullParentValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__NULL_PARENT_VALUE, oldNullParentValue, nullParentValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getOrdinalColumn() {
    return ordinalColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrdinalColumn(Object newOrdinalColumn) {
    Object oldOrdinalColumn = ordinalColumn;
    ordinalColumn = newOrdinalColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__ORDINAL_COLUMN, oldOrdinalColumn, ordinalColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getParentColumn() {
    return parentColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentColumn(Object newParentColumn) {
    Object oldParentColumn = parentColumn;
    parentColumn = newParentColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__PARENT_COLUMN, oldParentColumn, parentColumn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getTable() {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(Object newTable) {
    Object oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeType getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeType newType) {
    TypeType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    boolean oldTypeESet = typeESet;
    typeESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__TYPE, oldType, type, !oldTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetType() {
    TypeType oldType = type;
    boolean oldTypeESet = typeESet;
    type = TYPE_EDEFAULT;
    typeESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MondrianPackage.LEVEL_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetType() {
    return typeESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueMembersType getUniqueMembers() {
    return uniqueMembers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUniqueMembers(UniqueMembersType newUniqueMembers) {
    UniqueMembersType oldUniqueMembers = uniqueMembers;
    uniqueMembers = newUniqueMembers == null ? UNIQUE_MEMBERS_EDEFAULT : newUniqueMembers;
    boolean oldUniqueMembersESet = uniqueMembersESet;
    uniqueMembersESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.LEVEL_TYPE__UNIQUE_MEMBERS, oldUniqueMembers, uniqueMembers, !oldUniqueMembersESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetUniqueMembers() {
    UniqueMembersType oldUniqueMembers = uniqueMembers;
    boolean oldUniqueMembersESet = uniqueMembersESet;
    uniqueMembers = UNIQUE_MEMBERS_EDEFAULT;
    uniqueMembersESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MondrianPackage.LEVEL_TYPE__UNIQUE_MEMBERS, oldUniqueMembers, UNIQUE_MEMBERS_EDEFAULT, oldUniqueMembersESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetUniqueMembers() {
    return uniqueMembersESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION:
          return basicSetKeyExpression(null, msgs);
        case MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION:
          return basicSetNameExpression(null, msgs);
        case MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION:
          return basicSetOrdinalExpression(null, msgs);
        case MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION:
          return basicSetParentExpression(null, msgs);
        case MondrianPackage.LEVEL_TYPE__PROPERTY:
          return ((InternalEList)getProperty()).basicRemove(otherEnd, msgs);
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
      case MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION:
        return getKeyExpression();
      case MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION:
        return getNameExpression();
      case MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION:
        return getOrdinalExpression();
      case MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION:
        return getParentExpression();
      case MondrianPackage.LEVEL_TYPE__PROPERTY:
        return getProperty();
      case MondrianPackage.LEVEL_TYPE__COLUMN:
        return getColumn();
      case MondrianPackage.LEVEL_TYPE__HIDE_MEMBER_IF:
        return getHideMemberIf();
      case MondrianPackage.LEVEL_TYPE__LEVEL_TYPE:
        return getLevelType();
      case MondrianPackage.LEVEL_TYPE__NAME:
        return getName();
      case MondrianPackage.LEVEL_TYPE__NAME_COLUMN:
        return getNameColumn();
      case MondrianPackage.LEVEL_TYPE__NULL_PARENT_VALUE:
        return getNullParentValue();
      case MondrianPackage.LEVEL_TYPE__ORDINAL_COLUMN:
        return getOrdinalColumn();
      case MondrianPackage.LEVEL_TYPE__PARENT_COLUMN:
        return getParentColumn();
      case MondrianPackage.LEVEL_TYPE__TABLE:
        return getTable();
      case MondrianPackage.LEVEL_TYPE__TYPE:
        return getType();
      case MondrianPackage.LEVEL_TYPE__UNIQUE_MEMBERS:
        return getUniqueMembers();
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
      case MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION:
        setKeyExpression((KeyExpressionType)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION:
        setNameExpression((NameExpressionType)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION:
        setOrdinalExpression((OrdinalExpressionType)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION:
        setParentExpression((ParentExpressionType)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__COLUMN:
        setColumn((Object)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__HIDE_MEMBER_IF:
        setHideMemberIf((HideMemberIfType)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__LEVEL_TYPE:
        setLevelType((LevelTypeType)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__NAME:
        setName((Object)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__NAME_COLUMN:
        setNameColumn((Object)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__NULL_PARENT_VALUE:
        setNullParentValue((Object)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__ORDINAL_COLUMN:
        setOrdinalColumn((Object)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__PARENT_COLUMN:
        setParentColumn((Object)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__TABLE:
        setTable((Object)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__TYPE:
        setType((TypeType)newValue);
        return;
      case MondrianPackage.LEVEL_TYPE__UNIQUE_MEMBERS:
        setUniqueMembers((UniqueMembersType)newValue);
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
      case MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION:
        setKeyExpression((KeyExpressionType)null);
        return;
      case MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION:
        setNameExpression((NameExpressionType)null);
        return;
      case MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION:
        setOrdinalExpression((OrdinalExpressionType)null);
        return;
      case MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION:
        setParentExpression((ParentExpressionType)null);
        return;
      case MondrianPackage.LEVEL_TYPE__PROPERTY:
        getProperty().clear();
        return;
      case MondrianPackage.LEVEL_TYPE__COLUMN:
        setColumn(COLUMN_EDEFAULT);
        return;
      case MondrianPackage.LEVEL_TYPE__HIDE_MEMBER_IF:
        unsetHideMemberIf();
        return;
      case MondrianPackage.LEVEL_TYPE__LEVEL_TYPE:
        unsetLevelType();
        return;
      case MondrianPackage.LEVEL_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MondrianPackage.LEVEL_TYPE__NAME_COLUMN:
        setNameColumn(NAME_COLUMN_EDEFAULT);
        return;
      case MondrianPackage.LEVEL_TYPE__NULL_PARENT_VALUE:
        setNullParentValue(NULL_PARENT_VALUE_EDEFAULT);
        return;
      case MondrianPackage.LEVEL_TYPE__ORDINAL_COLUMN:
        setOrdinalColumn(ORDINAL_COLUMN_EDEFAULT);
        return;
      case MondrianPackage.LEVEL_TYPE__PARENT_COLUMN:
        setParentColumn(PARENT_COLUMN_EDEFAULT);
        return;
      case MondrianPackage.LEVEL_TYPE__TABLE:
        setTable(TABLE_EDEFAULT);
        return;
      case MondrianPackage.LEVEL_TYPE__TYPE:
        unsetType();
        return;
      case MondrianPackage.LEVEL_TYPE__UNIQUE_MEMBERS:
        unsetUniqueMembers();
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
      case MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION:
        return keyExpression != null;
      case MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION:
        return nameExpression != null;
      case MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION:
        return ordinalExpression != null;
      case MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION:
        return parentExpression != null;
      case MondrianPackage.LEVEL_TYPE__PROPERTY:
        return property != null && !property.isEmpty();
      case MondrianPackage.LEVEL_TYPE__COLUMN:
        return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
      case MondrianPackage.LEVEL_TYPE__HIDE_MEMBER_IF:
        return isSetHideMemberIf();
      case MondrianPackage.LEVEL_TYPE__LEVEL_TYPE:
        return isSetLevelType();
      case MondrianPackage.LEVEL_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MondrianPackage.LEVEL_TYPE__NAME_COLUMN:
        return NAME_COLUMN_EDEFAULT == null ? nameColumn != null : !NAME_COLUMN_EDEFAULT.equals(nameColumn);
      case MondrianPackage.LEVEL_TYPE__NULL_PARENT_VALUE:
        return NULL_PARENT_VALUE_EDEFAULT == null ? nullParentValue != null : !NULL_PARENT_VALUE_EDEFAULT.equals(nullParentValue);
      case MondrianPackage.LEVEL_TYPE__ORDINAL_COLUMN:
        return ORDINAL_COLUMN_EDEFAULT == null ? ordinalColumn != null : !ORDINAL_COLUMN_EDEFAULT.equals(ordinalColumn);
      case MondrianPackage.LEVEL_TYPE__PARENT_COLUMN:
        return PARENT_COLUMN_EDEFAULT == null ? parentColumn != null : !PARENT_COLUMN_EDEFAULT.equals(parentColumn);
      case MondrianPackage.LEVEL_TYPE__TABLE:
        return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
      case MondrianPackage.LEVEL_TYPE__TYPE:
        return isSetType();
      case MondrianPackage.LEVEL_TYPE__UNIQUE_MEMBERS:
        return isSetUniqueMembers();
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
    result.append(" (column: ");
    result.append(column);
    result.append(", hideMemberIf: ");
    if (hideMemberIfESet) result.append(hideMemberIf); else result.append("<unset>");
    result.append(", levelType: ");
    if (levelTypeESet) result.append(levelType); else result.append("<unset>");
    result.append(", name: ");
    result.append(name);
    result.append(", nameColumn: ");
    result.append(nameColumn);
    result.append(", nullParentValue: ");
    result.append(nullParentValue);
    result.append(", ordinalColumn: ");
    result.append(ordinalColumn);
    result.append(", parentColumn: ");
    result.append(parentColumn);
    result.append(", table: ");
    result.append(table);
    result.append(", type: ");
    if (typeESet) result.append(type); else result.append("<unset>");
    result.append(", uniqueMembers: ");
    if (uniqueMembersESet) result.append(uniqueMembers); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //LevelTypeImpl
