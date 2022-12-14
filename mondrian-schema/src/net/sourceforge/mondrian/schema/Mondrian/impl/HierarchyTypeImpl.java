/**
 * <copyright>
 * </copyright>
 *
 * $Id: HierarchyTypeImpl.java,v 1.2 2004/06/30 13:45:49 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.impl;

import java.util.Collection;

import net.sourceforge.mondrian.schema.Mondrian.HasAllType;
import net.sourceforge.mondrian.schema.Mondrian.HierarchyType;
import net.sourceforge.mondrian.schema.Mondrian.JoinType;
import net.sourceforge.mondrian.schema.Mondrian.LevelType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;
import net.sourceforge.mondrian.schema.Mondrian.ParameterType;
import net.sourceforge.mondrian.schema.Mondrian.TableType;
import net.sourceforge.mondrian.schema.Mondrian.ViewType;

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
 * An implementation of the model object '<em><b>Hierarchy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getView <em>View</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getAllMemberName <em>All Member Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getDefaultMember <em>Default Member</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getHasAll <em>Has All</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getMemberReaderClass <em>Member Reader Class</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.impl.HierarchyTypeImpl#getPrimaryKeyTable <em>Primary Key Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierarchyTypeImpl extends EObjectImpl implements HierarchyType {
  /**
   * The cached value of the '{@link #getView() <em>View</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView()
   * @generated
   * @ordered
   */
  protected ViewType view = null;

  /**
   * The cached value of the '{@link #getJoin() <em>Join</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoin()
   * @generated
   * @ordered
   */
  protected JoinType join = null;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected TableType table = null;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected EList level = null;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList parameter = null;

  /**
   * The default value of the '{@link #getAllMemberName() <em>All Member Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllMemberName()
   * @generated
   * @ordered
   */
  protected static final Object ALL_MEMBER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAllMemberName() <em>All Member Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllMemberName()
   * @generated
   * @ordered
   */
  protected Object allMemberName = ALL_MEMBER_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultMember() <em>Default Member</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultMember()
   * @generated
   * @ordered
   */
  protected static final Object DEFAULT_MEMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultMember() <em>Default Member</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultMember()
   * @generated
   * @ordered
   */
  protected Object defaultMember = DEFAULT_MEMBER_EDEFAULT;

  /**
   * The default value of the '{@link #getHasAll() <em>Has All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasAll()
   * @generated
   * @ordered
   */
  protected static final HasAllType HAS_ALL_EDEFAULT = HasAllType.TRUE_LITERAL;

  /**
   * The cached value of the '{@link #getHasAll() <em>Has All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHasAll()
   * @generated
   * @ordered
   */
  protected HasAllType hasAll = HAS_ALL_EDEFAULT;

  /**
   * This is true if the Has All attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean hasAllESet = false;

  /**
   * The default value of the '{@link #getMemberReaderClass() <em>Member Reader Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberReaderClass()
   * @generated
   * @ordered
   */
  protected static final Object MEMBER_READER_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMemberReaderClass() <em>Member Reader Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberReaderClass()
   * @generated
   * @ordered
   */
  protected Object memberReaderClass = MEMBER_READER_CLASS_EDEFAULT;

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
   * The default value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryKey()
   * @generated
   * @ordered
   */
  protected static final Object PRIMARY_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryKey()
   * @generated
   * @ordered
   */
  protected Object primaryKey = PRIMARY_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #getPrimaryKeyTable() <em>Primary Key Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryKeyTable()
   * @generated
   * @ordered
   */
  protected static final Object PRIMARY_KEY_TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimaryKeyTable() <em>Primary Key Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryKeyTable()
   * @generated
   * @ordered
   */
  protected Object primaryKeyTable = PRIMARY_KEY_TABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HierarchyTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass() {
    return MondrianPackage.eINSTANCE.getHierarchyType();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewType getView() {
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetView(ViewType newView, NotificationChain msgs) {
    ViewType oldView = view;
    view = newView;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__VIEW, oldView, newView);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView(ViewType newView) {
    if (newView != view) {
      NotificationChain msgs = null;
      if (view != null)
        msgs = ((InternalEObject)view).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.HIERARCHY_TYPE__VIEW, null, msgs);
      if (newView != null)
        msgs = ((InternalEObject)newView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.HIERARCHY_TYPE__VIEW, null, msgs);
      msgs = basicSetView(newView, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__VIEW, newView, newView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinType getJoin() {
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoin(JoinType newJoin, NotificationChain msgs) {
    JoinType oldJoin = join;
    join = newJoin;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__JOIN, oldJoin, newJoin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoin(JoinType newJoin) {
    if (newJoin != join) {
      NotificationChain msgs = null;
      if (join != null)
        msgs = ((InternalEObject)join).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.HIERARCHY_TYPE__JOIN, null, msgs);
      if (newJoin != null)
        msgs = ((InternalEObject)newJoin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.HIERARCHY_TYPE__JOIN, null, msgs);
      msgs = basicSetJoin(newJoin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__JOIN, newJoin, newJoin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableType getTable() {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTable(TableType newTable, NotificationChain msgs) {
    TableType oldTable = table;
    table = newTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__TABLE, oldTable, newTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(TableType newTable) {
    if (newTable != table) {
      NotificationChain msgs = null;
      if (table != null)
        msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.HIERARCHY_TYPE__TABLE, null, msgs);
      if (newTable != null)
        msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MondrianPackage.HIERARCHY_TYPE__TABLE, null, msgs);
      msgs = basicSetTable(newTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__TABLE, newTable, newTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getLevel() {
    if (level == null) {
      level = new EObjectContainmentEList(LevelType.class, this, MondrianPackage.HIERARCHY_TYPE__LEVEL);
    }
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getParameter() {
    if (parameter == null) {
      parameter = new EObjectContainmentEList(ParameterType.class, this, MondrianPackage.HIERARCHY_TYPE__PARAMETER);
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getAllMemberName() {
    return allMemberName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllMemberName(Object newAllMemberName) {
    Object oldAllMemberName = allMemberName;
    allMemberName = newAllMemberName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__ALL_MEMBER_NAME, oldAllMemberName, allMemberName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getDefaultMember() {
    return defaultMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultMember(Object newDefaultMember) {
    Object oldDefaultMember = defaultMember;
    defaultMember = newDefaultMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__DEFAULT_MEMBER, oldDefaultMember, defaultMember));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasAllType getHasAll() {
    return hasAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasAll(HasAllType newHasAll) {
    HasAllType oldHasAll = hasAll;
    hasAll = newHasAll == null ? HAS_ALL_EDEFAULT : newHasAll;
    boolean oldHasAllESet = hasAllESet;
    hasAllESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__HAS_ALL, oldHasAll, hasAll, !oldHasAllESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetHasAll() {
    HasAllType oldHasAll = hasAll;
    boolean oldHasAllESet = hasAllESet;
    hasAll = HAS_ALL_EDEFAULT;
    hasAllESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, MondrianPackage.HIERARCHY_TYPE__HAS_ALL, oldHasAll, HAS_ALL_EDEFAULT, oldHasAllESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetHasAll() {
    return hasAllESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getMemberReaderClass() {
    return memberReaderClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemberReaderClass(Object newMemberReaderClass) {
    Object oldMemberReaderClass = memberReaderClass;
    memberReaderClass = newMemberReaderClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__MEMBER_READER_CLASS, oldMemberReaderClass, memberReaderClass));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getPrimaryKey() {
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryKey(Object newPrimaryKey) {
    Object oldPrimaryKey = primaryKey;
    primaryKey = newPrimaryKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getPrimaryKeyTable() {
    return primaryKeyTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryKeyTable(Object newPrimaryKeyTable) {
    Object oldPrimaryKeyTable = primaryKeyTable;
    primaryKeyTable = newPrimaryKeyTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY_TABLE, oldPrimaryKeyTable, primaryKeyTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
    if (featureID >= 0) {
      switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
        case MondrianPackage.HIERARCHY_TYPE__VIEW:
          return basicSetView(null, msgs);
        case MondrianPackage.HIERARCHY_TYPE__JOIN:
          return basicSetJoin(null, msgs);
        case MondrianPackage.HIERARCHY_TYPE__TABLE:
          return basicSetTable(null, msgs);
        case MondrianPackage.HIERARCHY_TYPE__LEVEL:
          return ((InternalEList)getLevel()).basicRemove(otherEnd, msgs);
        case MondrianPackage.HIERARCHY_TYPE__PARAMETER:
          return ((InternalEList)getParameter()).basicRemove(otherEnd, msgs);
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
      case MondrianPackage.HIERARCHY_TYPE__VIEW:
        return getView();
      case MondrianPackage.HIERARCHY_TYPE__JOIN:
        return getJoin();
      case MondrianPackage.HIERARCHY_TYPE__TABLE:
        return getTable();
      case MondrianPackage.HIERARCHY_TYPE__LEVEL:
        return getLevel();
      case MondrianPackage.HIERARCHY_TYPE__PARAMETER:
        return getParameter();
      case MondrianPackage.HIERARCHY_TYPE__ALL_MEMBER_NAME:
        return getAllMemberName();
      case MondrianPackage.HIERARCHY_TYPE__DEFAULT_MEMBER:
        return getDefaultMember();
      case MondrianPackage.HIERARCHY_TYPE__HAS_ALL:
        return getHasAll();
      case MondrianPackage.HIERARCHY_TYPE__MEMBER_READER_CLASS:
        return getMemberReaderClass();
      case MondrianPackage.HIERARCHY_TYPE__NAME:
        return getName();
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY:
        return getPrimaryKey();
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY_TABLE:
        return getPrimaryKeyTable();
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
      case MondrianPackage.HIERARCHY_TYPE__VIEW:
        setView((ViewType)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__JOIN:
        setJoin((JoinType)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__TABLE:
        setTable((TableType)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__LEVEL:
        getLevel().clear();
        getLevel().addAll((Collection)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__ALL_MEMBER_NAME:
        setAllMemberName((Object)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__DEFAULT_MEMBER:
        setDefaultMember((Object)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__HAS_ALL:
        setHasAll((HasAllType)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__MEMBER_READER_CLASS:
        setMemberReaderClass((Object)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__NAME:
        setName((Object)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY:
        setPrimaryKey((Object)newValue);
        return;
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY_TABLE:
        setPrimaryKeyTable((Object)newValue);
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
      case MondrianPackage.HIERARCHY_TYPE__VIEW:
        setView((ViewType)null);
        return;
      case MondrianPackage.HIERARCHY_TYPE__JOIN:
        setJoin((JoinType)null);
        return;
      case MondrianPackage.HIERARCHY_TYPE__TABLE:
        setTable((TableType)null);
        return;
      case MondrianPackage.HIERARCHY_TYPE__LEVEL:
        getLevel().clear();
        return;
      case MondrianPackage.HIERARCHY_TYPE__PARAMETER:
        getParameter().clear();
        return;
      case MondrianPackage.HIERARCHY_TYPE__ALL_MEMBER_NAME:
        setAllMemberName(ALL_MEMBER_NAME_EDEFAULT);
        return;
      case MondrianPackage.HIERARCHY_TYPE__DEFAULT_MEMBER:
        setDefaultMember(DEFAULT_MEMBER_EDEFAULT);
        return;
      case MondrianPackage.HIERARCHY_TYPE__HAS_ALL:
        unsetHasAll();
        return;
      case MondrianPackage.HIERARCHY_TYPE__MEMBER_READER_CLASS:
        setMemberReaderClass(MEMBER_READER_CLASS_EDEFAULT);
        return;
      case MondrianPackage.HIERARCHY_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY:
        setPrimaryKey(PRIMARY_KEY_EDEFAULT);
        return;
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY_TABLE:
        setPrimaryKeyTable(PRIMARY_KEY_TABLE_EDEFAULT);
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
      case MondrianPackage.HIERARCHY_TYPE__VIEW:
        return view != null;
      case MondrianPackage.HIERARCHY_TYPE__JOIN:
        return join != null;
      case MondrianPackage.HIERARCHY_TYPE__TABLE:
        return table != null;
      case MondrianPackage.HIERARCHY_TYPE__LEVEL:
        return level != null && !level.isEmpty();
      case MondrianPackage.HIERARCHY_TYPE__PARAMETER:
        return parameter != null && !parameter.isEmpty();
      case MondrianPackage.HIERARCHY_TYPE__ALL_MEMBER_NAME:
        return ALL_MEMBER_NAME_EDEFAULT == null ? allMemberName != null : !ALL_MEMBER_NAME_EDEFAULT.equals(allMemberName);
      case MondrianPackage.HIERARCHY_TYPE__DEFAULT_MEMBER:
        return DEFAULT_MEMBER_EDEFAULT == null ? defaultMember != null : !DEFAULT_MEMBER_EDEFAULT.equals(defaultMember);
      case MondrianPackage.HIERARCHY_TYPE__HAS_ALL:
        return isSetHasAll();
      case MondrianPackage.HIERARCHY_TYPE__MEMBER_READER_CLASS:
        return MEMBER_READER_CLASS_EDEFAULT == null ? memberReaderClass != null : !MEMBER_READER_CLASS_EDEFAULT.equals(memberReaderClass);
      case MondrianPackage.HIERARCHY_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY:
        return PRIMARY_KEY_EDEFAULT == null ? primaryKey != null : !PRIMARY_KEY_EDEFAULT.equals(primaryKey);
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY_TABLE:
        return PRIMARY_KEY_TABLE_EDEFAULT == null ? primaryKeyTable != null : !PRIMARY_KEY_TABLE_EDEFAULT.equals(primaryKeyTable);
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
    result.append(" (allMemberName: ");
    result.append(allMemberName);
    result.append(", defaultMember: ");
    result.append(defaultMember);
    result.append(", hasAll: ");
    if (hasAllESet) result.append(hasAll); else result.append("<unset>");
    result.append(", memberReaderClass: ");
    result.append(memberReaderClass);
    result.append(", name: ");
    result.append(name);
    result.append(", primaryKey: ");
    result.append(primaryKey);
    result.append(", primaryKeyTable: ");
    result.append(primaryKeyTable);
    result.append(')');
    return result.toString();
  }

} //HierarchyTypeImpl
