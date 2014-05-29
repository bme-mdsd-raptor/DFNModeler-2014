/**
 */
package DFN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.Port#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DFN.EndPoint#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' container reference.
	 * @see #setEndpoint(EndPoint)
	 * @see DFN.DFNPackage#getPort_Endpoint()
	 * @see DFN.EndPoint#getPorts
	 * @model opposite="ports" required="true" transient="false"
	 * @generated
	 */
	EndPoint getEndpoint();

	/**
	 * Sets the value of the '{@link DFN.Port#getEndpoint <em>Endpoint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' container reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(EndPoint value);

} // Port
