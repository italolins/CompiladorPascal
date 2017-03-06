/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ufcg.compiladores.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>identifier list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.identifier_list#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getidentifier_list()
 * @model
 * @generated
 */
public interface identifier_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Ids</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ids</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' attribute list.
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getidentifier_list_Ids()
   * @model unique="false"
   * @generated
   */
  EList<String> getIds();

} // identifier_list
