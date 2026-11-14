package excepciones;



/**
 * Excepción personalizada utilizada cuando ocurre
 * un error durante el sorteo de equipos o cuando
 * se detecta una asignación inválida de partidos.
 */
public class SorteoInvalidoException extends Exception { 
	private static final long serialVersionUID = 1L;
	public SorteoInvalidoException(String mensaje) { // Constructor que recibe el mensaje de error
		super(mensaje);
	}

}
