/**
 */
package DFN;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Token Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.StringTokenLiteral#getStringtoken <em>Stringtoken</em>}</li>
 *   <li>{@link DFN.StringTokenLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getStringTokenLiteral()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface StringTokenLiteral extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Stringtoken</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DFN.StringToken#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stringtoken</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringtoken</em>' container reference.
	 * @see #setStringtoken(StringToken)
	 * @see DFN.DFNPackage#getStringTokenLiteral_Stringtoken()
	 * @see DFN.StringToken#getLiterals
	 * @model opposite="literals" required="true" transient="false"
	 * @generated
	 */
	StringToken getStringtoken();

	/**
	 * Sets the value of the '{@link DFN.StringTokenLiteral#getStringtoken <em>Stringtoken</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringtoken</em>' container reference.
	 * @see #getStringtoken()
	 * @generated
	 */
	void setStringtoken(StringToken value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see DFN.DFNPackage#getStringTokenLiteral_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link DFN.StringTokenLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringTokenLiteral
