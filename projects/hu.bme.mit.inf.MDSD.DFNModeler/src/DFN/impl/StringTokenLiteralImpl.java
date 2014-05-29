/**
 */
package DFN.impl;

import DFN.DFNPackage;
import DFN.StringToken;
import DFN.StringTokenLiteral;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Token Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DFN.impl.StringTokenLiteralImpl#getStringtoken <em>Stringtoken</em>}</li>
 *   <li>{@link DFN.impl.StringTokenLiteralImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringTokenLiteralImpl extends CDOObjectImpl implements StringTokenLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringTokenLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFNPackage.Literals.STRING_TOKEN_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToken getStringtoken() {
		return (StringToken)eGet(DFNPackage.Literals.STRING_TOKEN_LITERAL__STRINGTOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringtoken(StringToken newStringtoken) {
		eSet(DFNPackage.Literals.STRING_TOKEN_LITERAL__STRINGTOKEN, newStringtoken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(DFNPackage.Literals.STRING_TOKEN_LITERAL__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(DFNPackage.Literals.STRING_TOKEN_LITERAL__VALUE, newValue);
	}

} //StringTokenLiteralImpl
