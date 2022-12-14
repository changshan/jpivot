/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterType.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.ParameterType#getName <em>Name</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.ParameterType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getParameterType()
 * @model 
 * @generated
 */
public interface ParameterType extends EObject {
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
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getParameterType_Name()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getName();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.ParameterType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(Object value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getParameterType_Value()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getValue();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.ParameterType#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(Object value);

} // ParameterType
