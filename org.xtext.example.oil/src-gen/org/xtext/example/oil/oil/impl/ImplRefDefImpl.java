/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.oil.oil.AttributeName;
import org.xtext.example.oil.oil.ImplRefDef;
import org.xtext.example.oil.oil.ObjectRefTypeEnum;
import org.xtext.example.oil.oil.OilPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impl Ref Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplRefDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplRefDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplRefDefImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplRefDefImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplRefDefImpl extends ImplementationDefImpl implements ImplRefDef
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ObjectRefTypeEnum TYPE_EDEFAULT = ObjectRefTypeEnum.OS_TYPE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ObjectRefTypeEnum type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected AttributeName name;

  /**
   * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected static final boolean MULTIPLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected boolean multiple = MULTIPLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplRefDefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OilPackage.eINSTANCE.getImplRefDef();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectRefTypeEnum getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ObjectRefTypeEnum newType)
  {
    ObjectRefTypeEnum oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_REF_DEF__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(AttributeName newName, NotificationChain msgs)
  {
    AttributeName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_REF_DEF__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(AttributeName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OilPackage.IMPL_REF_DEF__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OilPackage.IMPL_REF_DEF__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_REF_DEF__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiple()
  {
    return multiple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiple(boolean newMultiple)
  {
    boolean oldMultiple = multiple;
    multiple = newMultiple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_REF_DEF__MULTIPLE, oldMultiple, multiple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPL_REF_DEF__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_REF_DEF__NAME:
        return basicSetName(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_REF_DEF__TYPE:
        return getType();
      case OilPackage.IMPL_REF_DEF__NAME:
        return getName();
      case OilPackage.IMPL_REF_DEF__MULTIPLE:
        return isMultiple();
      case OilPackage.IMPL_REF_DEF__DESCRIPTION:
        return getDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_REF_DEF__TYPE:
        setType((ObjectRefTypeEnum)newValue);
        return;
      case OilPackage.IMPL_REF_DEF__NAME:
        setName((AttributeName)newValue);
        return;
      case OilPackage.IMPL_REF_DEF__MULTIPLE:
        setMultiple((Boolean)newValue);
        return;
      case OilPackage.IMPL_REF_DEF__DESCRIPTION:
        setDescription((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_REF_DEF__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case OilPackage.IMPL_REF_DEF__NAME:
        setName((AttributeName)null);
        return;
      case OilPackage.IMPL_REF_DEF__MULTIPLE:
        setMultiple(MULTIPLE_EDEFAULT);
        return;
      case OilPackage.IMPL_REF_DEF__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OilPackage.IMPL_REF_DEF__TYPE:
        return type != TYPE_EDEFAULT;
      case OilPackage.IMPL_REF_DEF__NAME:
        return name != null;
      case OilPackage.IMPL_REF_DEF__MULTIPLE:
        return multiple != MULTIPLE_EDEFAULT;
      case OilPackage.IMPL_REF_DEF__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", multiple: ");
    result.append(multiple);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ImplRefDefImpl
