package vista;

import java.util.List;

import modelo.Partido;

public class ConsolaVista {

    public void mostrarPartidos(
            String etapa,
            List<Partido> partidos) {

        System.out.println("==================================");
        System.out.println("       COPA ELITE 2026 ");
        System.out.println("==================================");
        System.out.println("    " + etapa);
        System.out.println("==================================");
        
        int contador = 1;

        for (Partido p : partidos) {

            System.out.println("Partido" +  contador + ": " + p);
            
            contador++;
           
        }
        
        System.out.print("==================================");
    }
}
