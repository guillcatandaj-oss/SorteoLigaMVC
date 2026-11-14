package controlador;

import java.io.IOException;
import java.util.List;

import excepciones.NumeroEquiposInvalidoException;
import excepciones.SorteoInvalidoException;
import modelo.Partido;
import modelo.Torneo;

public class TorneoControlador {

    private Torneo torneo;

    public TorneoControlador (Torneo torneo) {
        this.torneo = torneo;
    }

    public List<Partido> realizarSorteo()
            throws NumeroEquiposInvalidoException,
                   SorteoInvalidoException {

        return torneo.sortearEtapa();
    }

    public void guardar (String archivo)
            throws IOException {

        torneo.guardarTorneo(archivo);
    }

    public void cargar (String archivo)
            throws IOException,
                   ClassNotFoundException {

        torneo = Torneo.cargarTorneo(archivo);
    }
}