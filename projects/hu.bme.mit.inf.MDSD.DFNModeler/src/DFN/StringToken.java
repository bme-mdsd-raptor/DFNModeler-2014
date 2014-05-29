/**
 */
package DFN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.StringToken#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getStringToken()
 * @model
 * @generated
 */
public interface StringToken extends Token {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.StringTokenLiteral}.
	 * It is bidirectional and its opposite is '{@link DFN.StringTokenLiteral#getStringtoken <em>Stringtoken</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see DFN.DFNPackage#getStringToken_Literals()
	 * @see DFN.StringTokenLiteral#getStringtoken
	 * @model opposite="stringtoken" containment="true" required="true"
	 * @generated
	 */
	EList<StringTokenLiteral> getLiterals();

} // StringToken
