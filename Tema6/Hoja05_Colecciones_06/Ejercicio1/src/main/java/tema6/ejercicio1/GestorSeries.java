/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DAW125
 */
public class GestorSeries {

    private List<Serie> listaSeries;

    //Constructor por defecto
    public GestorSeries() {
        this.listaSeries = new ArrayList<>();
    }

    //Metodo que comprueba si existe una serie
    public Serie existeSerie(String nombreABuscar) {
        Serie encontrada = null;
        Iterator<Serie> it = listaSeries.iterator();
        while (it.hasNext()) {
            Serie aux = it.next();
            if (aux.getNombreSerie().equalsIgnoreCase(nombreABuscar)) {
                encontrada = aux;
            }
        }
        return encontrada;
    }

    //Metodo que crea una serie
    public void crearSerie() {
        String nombreSerie = "", nacionalidad = "";
        Tematica tematica = null;
        boolean finalizada = false;
        int temporadas = 0;
        try {
            nombreSerie = Teclado.introCadena("Introduce el nombre de la serie: ");
            Serie serieExiste = existeSerie(nombreSerie);
            if (serieExiste == null) {
                tematica = Teclado.pedirTematica();
                nacionalidad = Teclado.introCadena("Introduce la nacionalidad: ");
                finalizada = Teclado.introFinalizada("¿Finalizada?: ");
                temporadas = Teclado.introTemporada("Introduce el número de temporadas: ");
                Serie serieNueva = new Serie(nombreSerie, tematica, nacionalidad, finalizada, temporadas);

                insertarSerie(serieNueva);
            } else {
                throw new ExcepcionPersonalizada("Error, la serie " + serieExiste.getNombreSerie() + " ya existe");
            }

        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarSerie(String nombreABuscar) {
        Serie encontrado = existeSerie(nombreABuscar);
        try {
            if (encontrado != null) {
                if (listaSeries.remove(encontrado)) {
                    System.out.println("Serie " + encontrado.getNombreSerie() + " borrada correctamente");
                } else {
                    throw new ExcepcionPersonalizada("Error, no se pudo borrar la serie " + encontrado.getNombreSerie());
                }
            } else {
                throw new NullPointerException("Error, no existe la serie " + nombreABuscar);
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo que inserta una serie
    private void insertarSerie(Serie serieNueva) throws ExcepcionPersonalizada {
        if (listaSeries.add(serieNueva)) {
            System.out.println("Serie " + serieNueva.getNombreSerie() + " insertada correctamente");
        } else {
            throw new ExcepcionPersonalizada("Error, no se pudo añadir la serie " + serieNueva.getNombreSerie());
        }
    }

}
