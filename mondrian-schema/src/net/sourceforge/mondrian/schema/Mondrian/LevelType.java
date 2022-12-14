/**
 * <copyright>
 * </copyright>
 *
 * $Id: LevelType.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getKeyExpression <em>Key Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getOrdinalExpression <em>Ordinal Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getParentExpression <em>Parent Expression</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getProperty <em>Property</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getColumn <em>Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getHideMemberIf <em>Hide Member If</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getLevelType <em>Level Type</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getName <em>Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getNameColumn <em>Name Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getNullParentValue <em>Null Parent Value</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getOrdinalColumn <em>Ordinal Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getParentColumn <em>Parent Column</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getTable <em>Table</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getType <em>Type</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getUniqueMembers <em>Unique Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType()
 * @model 
 * @generated
 */
public interface LevelType extends EObject {
  /**
   * Returns the value of the '<em><b>Key Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Expression</em>' containment reference.
   * @see #setKeyExpression(KeyExpressionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_KeyExpression()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  KeyExpressionType getKeyExpression();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getKeyExpression <em>Key Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Expression</em>' containment reference.
   * @see #getKeyExpression()
   * @generated
   */
  void setKeyExpression(KeyExpressionType value);

  /**
   * Returns the value of the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Expression</em>' containment reference.
   * @see #setNameExpression(NameExpressionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_NameExpression()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  NameExpressionType getNameExpression();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getNameExpression <em>Name Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Expression</em>' containment reference.
   * @see #getNameExpression()
   * @generated
   */
  void setNameExpression(NameExpressionType value);

  /**
   * Returns the value of the '<em><b>Ordinal Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordinal Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordinal Expression</em>' containment reference.
   * @see #setOrdinalExpression(OrdinalExpressionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_OrdinalExpression()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  OrdinalExpressionType getOrdinalExpression();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getOrdinalExpression <em>Ordinal Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordinal Expression</em>' containment reference.
   * @see #getOrdinalExpression()
   * @generated
   */
  void setOrdinalExpression(OrdinalExpressionType value);

  /**
   * Returns the value of the '<em><b>Parent Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Expression</em>' containment reference.
   * @see #setParentExpression(ParentExpressionType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_ParentExpression()
   * @model containment="true" resolveProxies="false"
   * @generated
   */
  ParentExpressionType getParentExpression();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getParentExpression <em>Parent Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Expression</em>' containment reference.
   * @see #getParentExpression()
   * @generated
   */
  void setParentExpression(ParentExpressionType value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.PropertyType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_Property()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.PropertyType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getProperty();

  /**
   * Returns the value of the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' attribute.
   * @see #setColumn(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_Column()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getColumn();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getColumn <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' attribute.
   * @see #getColumn()
   * @generated
   */
  void setColumn(Object value);

  /**
   * Returns the value of the '<em><b>Hide Member If</b></em>' attribute.
   * The default value is <code>"Never"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hide Member If</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hide Member If</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType
   * @see #isSetHideMemberIf()
   * @see #unsetHideMemberIf()
   * @see #setHideMemberIf(HideMemberIfType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_HideMemberIf()
   * @model default="Never" unique="false" unsettable="true"
   * @generated
   */
  HideMemberIfType getHideMemberIf();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getHideMemberIf <em>Hide Member If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hide Member If</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.HideMemberIfType
   * @see #isSetHideMemberIf()
   * @see #unsetHideMemberIf()
   * @see #getHideMemberIf()
   * @generated
   */
  void setHideMemberIf(HideMemberIfType value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getHideMemberIf <em>Hide Member If</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetHideMemberIf()
   * @see #getHideMemberIf()
   * @see #setHideMemberIf(HideMemberIfType)
   * @generated
   */
  void unsetHideMemberIf();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getHideMemberIf <em>Hide Member If</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Hide Member If</em>' attribute is set.
   * @see #unsetHideMemberIf()
   * @see #getHideMemberIf()
   * @see #setHideMemberIf(HideMemberIfType)
   * @generated
   */
  boolean isSetHideMemberIf();

  /**
   * Returns the value of the '<em><b>Level Type</b></em>' attribute.
   * The default value is <code>"Regular"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.LevelTypeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level Type</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelTypeType
   * @see #isSetLevelType()
   * @see #unsetLevelType()
   * @see #setLevelType(LevelTypeType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_LevelType()
   * @model default="Regular" unique="false" unsettable="true"
   * @generated
   */
  LevelTypeType getLevelType();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getLevelType <em>Level Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level Type</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.LevelTypeType
   * @see #isSetLevelType()
   * @see #unsetLevelType()
   * @see #getLevelType()
   * @generated
   */
  void setLevelType(LevelTypeType value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getLevelType <em>Level Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetLevelType()
   * @see #getLevelType()
   * @see #setLevelType(LevelTypeType)
   * @generated
   */
  void unsetLevelType();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getLevelType <em>Level Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Level Type</em>' attribute is set.
   * @see #unsetLevelType()
   * @see #getLevelType()
   * @see #setLevelType(LevelTypeType)
   * @generated
   */
  boolean isSetLevelType();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

  /**
   * Returns the value of the '<em><b>Name Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Column</em>' attribute.
   * @see #setNameColumn(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_NameColumn()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getNameColumn();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getNameColumn <em>Name Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Column</em>' attribute.
   * @see #getNameColumn()
   * @generated
   */
  void setNameColumn(Object value);

  /**
   * Returns the value of the '<em><b>Null Parent Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null Parent Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null Parent Value</em>' attribute.
   * @see #setNullParentValue(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_NullParentValue()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getNullParentValue();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getNullParentValue <em>Null Parent Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null Parent Value</em>' attribute.
   * @see #getNullParentValue()
   * @generated
   */
  void setNullParentValue(Object value);

  /**
   * Returns the value of the '<em><b>Ordinal Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordinal Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordinal Column</em>' attribute.
   * @see #setOrdinalColumn(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_OrdinalColumn()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getOrdinalColumn();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getOrdinalColumn <em>Ordinal Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordinal Column</em>' attribute.
   * @see #getOrdinalColumn()
   * @generated
   */
  void setOrdinalColumn(Object value);

  /**
   * Returns the value of the '<em><b>Parent Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Column</em>' attribute.
   * @see #setParentColumn(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_ParentColumn()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getParentColumn();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getParentColumn <em>Parent Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Column</em>' attribute.
   * @see #getParentColumn()
   * @generated
   */
  void setParentColumn(Object value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' attribute.
   * @see #setTable(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_Table()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getTable();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getTable <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' attribute.
   * @see #getTable()
   * @generated
   */
  void setTable(Object value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The default value is <code>"String"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.TypeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType
   * @see #isSetType()
   * @see #unsetType()
   * @see #setType(TypeType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_Type()
   * @model default="String" unique="false" unsettable="true"
   * @generated
   */
  TypeType getType();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.TypeType
   * @see #isSetType()
   * @see #unsetType()
   * @see #getType()
   * @generated
   */
  void setType(TypeType value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetType()
   * @see #getType()
   * @see #setType(TypeType)
   * @generated
   */
  void unsetType();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getType <em>Type</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Type</em>' attribute is set.
   * @see #unsetType()
   * @see #getType()
   * @see #setType(TypeType)
   * @generated
   */
  boolean isSetType();

  /**
   * Returns the value of the '<em><b>Unique Members</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique Members</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Members</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType
   * @see #isSetUniqueMembers()
   * @see #unsetUniqueMembers()
   * @see #setUniqueMembers(UniqueMembersType)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getLevelType_UniqueMembers()
   * @model default="false" unique="false" unsettable="true"
   * @generated
   */
  UniqueMembersType getUniqueMembers();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getUniqueMembers <em>Unique Members</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique Members</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.UniqueMembersType
   * @see #isSetUniqueMembers()
   * @see #unsetUniqueMembers()
   * @see #getUniqueMembers()
   * @generated
   */
  void setUniqueMembers(UniqueMembersType value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getUniqueMembers <em>Unique Members</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetUniqueMembers()
   * @see #getUniqueMembers()
   * @see #setUniqueMembers(UniqueMembersType)
   * @generated
   */
  void unsetUniqueMembers();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.LevelType#getUniqueMembers <em>Unique Members</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Unique Members</em>' attribute is set.
   * @see #unsetUniqueMembers()
   * @see #getUniqueMembers()
   * @see #setUniqueMembers(UniqueMembersType)
   * @generated
   */
  boolean isSetUniqueMembers();

} // LevelType
