/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.Enumerator#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.Enumerator#getImplParameterList <em>Impl Parameter List</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.Enumerator#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.oil.oil.OilPackage#getEnumerator()
 * @model
 * @generated
 */
public interface Enumerator extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.oil.oil.OilPackage#getEnumerator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.Enumerator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Impl Parameter List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.oil.oil.ImplementationDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Impl Parameter List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Impl Parameter List</em>' containment reference list.
   * @see org.xtext.example.oil.oil.OilPackage#getEnumerator_ImplParameterList()
   * @model containment="true"
   * @generated
   */
  EList<ImplementationDef> getImplParameterList();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.example.oil.oil.OilPackage#getEnumerator_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.Enumerator#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Enumerator
