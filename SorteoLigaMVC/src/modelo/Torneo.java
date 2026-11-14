package modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import excepciones.NumeroEquiposInvalidoException;
import excepciones.SorteoInvalidoException;

public class Torneo implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Equipo> equipos;

    public Torneo() {

        equipos = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {

        equipos.add(equipo);
    }

    public List<Equipo> getEquipos() {

        return equipos;
    }

    private boolean esPotenciaDeDos(int n) {

        return n > 0 && (n & (n - 1)) == 0;
    }

    public List<Partido> sortearEtapa()
            throws NumeroEquiposInvalidoException,
            SorteoInvalidoException {

        if (!esPotenciaDeDos(equipos.size())) {

            throw new NumeroEquiposInvalidoException(
                    "La cantidad de equipos debe ser potencia de 2.");
        }

        List<Equipo> copia =
                new ArrayList<>(equipos);

        Collections.shuffle(copia);

        List<Partido> partidos =
                new ArrayList<>();

        sorteoRecursivo(copia, partidos);

        return partidos;
    }

    private void sorteoRecursivo(
            List<Equipo> equipos,
            List<Partido> partidos)
            throws SorteoInvalidoException {

        if (equipos.size() == 0) {

            return;
        }

        if (equipos.size() < 2) {

            throw new SorteoInvalidoException(
                    "No existen equipos suficientes para completar el sorteo.");
        }

        Equipo equipo1 = equipos.remove(0);
        Equipo equipo2 = equipos.remove(0);

        if (equipo1.equals(equipo2)) {

            throw new SorteoInvalidoException(
                    "Un equipo no puede enfrentarse contra sí mismo.");
        }

        Partido partido =
                new Partido(equipo1, equipo2);

        partidos.add(partido);

        sorteoRecursivo(equipos, partidos);
    }

    public void guardarTorneo(String archivo)
            throws IOException {

        ObjectOutputStream salida =
                new ObjectOutputStream(
                        new FileOutputStream(archivo));

        salida.writeObject(this);

        salida.close();
    }


    public static Torneo cargarTorneo(String archivo)
            throws IOException,
            ClassNotFoundException {

        ObjectInputStream entrada =
                new ObjectInputStream(
                        new FileInputStream(archivo));

        Torneo torneo =
                (Torneo) entrada.readObject();

        entrada.close();

        return torneo;
    }
}