package modelo;
import java.io.Serializable;
public class Equipo implements Serializable {
	private static final long serialVersionUID = 1L;
	//Identificador de version para la serializacion
	
	private String nombre; // Nombre del equipo
	public Equipo (String nombre) { // Recibe el nombre del equipo
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	// Devuelve el nombre del equipo en formato texto 

}
