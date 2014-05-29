/**
 */
package DFN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.InPort#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getInPort()
 * @model
 * @generated
 */
public interface InPort extends Port {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DFN.Channel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Channel)
	 * @see DFN.DFNPackage#getInPort_In()
	 * @see DFN.Channel#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	Channel getIn();

	/**
	 * Sets the value of the '{@link DFN.InPort#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Channel value);

} // InPort
