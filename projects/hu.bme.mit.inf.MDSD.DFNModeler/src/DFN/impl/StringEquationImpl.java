/**
 */
package DFN.impl;

import DFN.DFNPackage;
import DFN.StringEquation;
import DFN.StringTokenLiteral;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DFN.impl.StringEquationImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringEquationImpl extends EquationImpl implements StringEquation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringEquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DFNPackage.Literals.STRING_EQUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringTokenLiteral getLiteral() {
		return (StringTokenLiteral)eGet(DFNPackage.Literals.STRING_EQUATION__LITERAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(StringTokenLiteral newLiteral) {
		eSet(DFNPackage.Literals.STRING_EQUATION__LITERAL, newLiteral);
	}

} //StringEquationImpl
