/**
 */
package DFN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.StringEquation#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getStringEquation()
 * @model
 * @generated
 */
public interface StringEquation extends Equation {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' reference.
	 * @see #setLiteral(StringTokenLiteral)
	 * @see DFN.DFNPackage#getStringEquation_Literal()
	 * @model required="true"
	 * @generated
	 */
	StringTokenLiteral getLiteral();

	/**
	 * Sets the value of the '{@link DFN.StringEquation#getLiteral <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(StringTokenLiteral value);

} // StringEquation
