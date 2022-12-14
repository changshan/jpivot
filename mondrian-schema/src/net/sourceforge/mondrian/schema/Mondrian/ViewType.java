/**
 * <copyright>
 * </copyright>
 *
 * $Id: ViewType.java,v 1.2 2004/06/30 13:45:52 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.ViewType#getSQL <em>SQL</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.ViewType#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getViewType()
 * @model 
 * @generated
 */
public interface ViewType extends EObject {
  /**
   * Returns the value of the '<em><b>SQL</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.SQLType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SQL</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SQL</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getViewType_SQL()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.SQLType" containment="true" resolveProxies="false" required="true"
   * @generated
   */
  EList getSQL();

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getViewType_Alias()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getAlias();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.ViewType#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(Object value);

} // ViewType
