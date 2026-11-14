package modelo;
import java.io.Serializable;
public class Partido
implements Serializable {

private static final long serialVersionUID = 1L;
// Identificador de version para la serializacion

private Equipo local;
private Equipo visitante;

public Partido(
Equipo local,
Equipo visitante) {

this.local = local;
this.visitante = visitante;
}

public Equipo getLocal() {
return local;
}

public Equipo getVisitante() {
return visitante;
}

@Override
public String toString() {
/* Sobreescribe el metodo toString para mostrar 
 * los equipos que participan en el partido
 */

return local + " VS " + visitante;
}

}