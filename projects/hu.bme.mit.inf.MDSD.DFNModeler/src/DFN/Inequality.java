/**
 */
package DFN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inequality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.Inequality#getPort <em>Port</em>}</li>
 *   <li>{@link DFN.Inequality#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getInequality()
 * @model
 * @generated
 */
public interface Inequality extends InMapping, IntegerMapping {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(InPort)
	 * @see DFN.DFNPackage#getInequality_Port()
	 * @model required="true"
	 * @generated
	 */
	InPort getPort();

	/**
	 * Sets the value of the '{@link DFN.Inequality#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(InPort value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link DFN.RelationalSymbols}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see DFN.RelationalSymbols
	 * @see #setKind(RelationalSymbols)
	 * @see DFN.DFNPackage#getInequality_Kind()
	 * @model required="true"
	 * @generated
	 */
	RelationalSymbols getKind();

	/**
	 * Sets the value of the '{@link DFN.Inequality#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see DFN.RelationalSymbols
	 * @see #getKind()
	 * @generated
	 */
	void setKind(RelationalSymbols value);

} // Inequality
