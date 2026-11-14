package excepciones;



/**
 * Excepción personalizada utilizada para validar
 * que la cantidad de equipos sea adecuada para
 * un torneo de eliminación directa.
 */
public class NumeroEquiposInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;
	public NumeroEquiposInvalidoException(String mensaje) { // Constructor que recibe el mensaje
		super (mensaje);
	}
}
