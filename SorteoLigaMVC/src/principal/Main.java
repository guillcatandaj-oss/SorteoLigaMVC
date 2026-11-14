package principal;

import controlador.TorneoControlador;
import excepciones.NumeroEquiposInvalidoException;
import excepciones.SorteoInvalidoException;
import modelo.Equipo;
import modelo.Partido;
import modelo.Torneo;
import vista.ConsolaVista;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Torneo torneo = new Torneo();
		
		torneo.agregarEquipo(new Equipo("Richmond"));
		torneo.agregarEquipo(new Equipo("Ajax"));
		torneo.agregarEquipo(new Equipo("Chelsea"));
		torneo.agregarEquipo(new Equipo("Inter"));
		torneo.agregarEquipo(new Equipo("Juventus"));
		torneo.agregarEquipo(new Equipo("Manchester City"));
		torneo.agregarEquipo(new Equipo("Bayern"));
		torneo.agregarEquipo(new Equipo("Brentford"));
		torneo.agregarEquipo(new Equipo("Tottenham"));
		torneo.agregarEquipo(new Equipo("Leeds United"));
		torneo.agregarEquipo(new Equipo("West Ham"));
		torneo.agregarEquipo(new Equipo("Crystal Palace"));
		torneo.agregarEquipo(new Equipo("Everton"));
		torneo.agregarEquipo(new Equipo("Brighton"));
		torneo.agregarEquipo(new Equipo("Dortmund"));
		torneo.agregarEquipo(new Equipo("Arsenal"));
		
		TorneoControlador controlador= new TorneoControlador(torneo);
		
		ConsolaVista vista = new ConsolaVista();
		try {
			List <Partido> octavos = controlador.realizarSorteo();
			
			vista.mostrarPartidos("🏆 Octavos de Final 🏆", octavos);
		
			controlador.guardar("torneo.ser");
			System.out.println("\n Torneo guardado correctamente.");
		
		}

catch (NumeroEquiposInvalidoException e) {
	
	System.out.println("Error de equipos:"+e.getMessage());
}

catch (SorteoInvalidoException e) {
System.out.println("Error en el sorteo:"+ e.getMessage());

}

catch (IOException e) {
	System.out.println("Error de archivo:"+ e.getMessage());
}

}

}
