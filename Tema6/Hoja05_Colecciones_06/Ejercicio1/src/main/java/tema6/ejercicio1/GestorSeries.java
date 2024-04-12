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

    //Metodo que elimina una serie pasada su nombre como parámetro
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

    //Metodo que muestra la series por una tematica concreta, nacionalidad,o todas
    public void verSeries() {
        int opc = 0;
        do {
            System.out.printf("\n\t---Ver Serie---"
                    + "\n1.Por nacionalidad"
                    + "\n2.Por temática"
                    + "\n3.Todas las series"
                    + "\n4.Salir");
            opc = Teclado.introEntero("Introduce una opción: ");
            switch (opc) {
                case 1 -> {
                    Tematica tematicaBuscar = Teclado.pedirTematica();
                    verSeriesPorTematica(tematicaBuscar);
                }
                case 2 -> {
                    String nacionalidad = Teclado.introCadena("Introduce la nacionalidad: ");
                    verSeriesPorNacionalidad(nacionalidad);
                }
                case 3 ->
                    verTodasSeries();

                case 4 ->
                    System.out.println("Saliendo!!");

                default ->
                    System.out.println("Error, opción incorrecta");
            }

        } while (opc != 4);
    }

    //Metodo que comprueba si existe la serie y crea un capitulo
    public void crearCapitulo(String nombreSerie) {
        Serie serieEncontrada = null;
        Capitulo capituloNuevo = null;
        String codigoCapitulo = "";
        try {
            serieEncontrada = existeSerie(nombreSerie);
            if (serieEncontrada != null) {
                capituloNuevo = new Capitulo();
                codigoCapitulo = Serie.generaClaveCapitulo(capituloNuevo.getDescripcion(), capituloNuevo.getnTemporada(), capituloNuevo.getnCapitulo());
                serieEncontrada.insertarCapitulo(codigoCapitulo, capituloNuevo);
            } else {
                throw new NullPointerException("Error, la serie no existe");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }
    }

    public void eliminarCapitulo(String nombreSerie) {
        Serie serieEncontrada = null;
        Capitulo capituloEncontrado = null;
        int nTemporada = 0, nCapitulo = 0;
        try {
            serieEncontrada = existeSerie(nombreSerie);
            if (serieEncontrada != null) {
                nTemporada = Teclado.introEntero("Introduce el número de temporada del capítulo: ");
                nCapitulo = Teclado.introCapitulo("Introduce el número del capítulo: ");
                capituloEncontrado = serieEncontrada.existeCapitulo(nTemporada, nCapitulo);
                if (capituloEncontrado != null) {
                    String clave = Serie.generaClaveCapitulo(capituloEncontrado.getDescripcion(), nTemporada, nCapitulo);
                    serieEncontrada.eliminarCapitulo(clave);
                } else {
                    throw new NullPointerException("Error, el capitulo no existe");
                }
            } else {
                throw new NullPointerException("Error, la serie " + nombreSerie + " no existe");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }
    }

    public String visualizarCapitulos(String nombreSerie) {
        Serie serieEncontrada = null;
        String cadena="";
        try {
            if (serieEncontrada != null) {
                cadena=serieEncontrada.visualizarCapitulos();
            }else{
                throw new NullPointerException("Error, la serie "+nombreSerie+" no existe");
            }
        }catch(NullPointerException n){
            System.out.println(n.getMessage());
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

    //Metodo que muestra las series de la temática pasada por parámetro
    private void verSeriesPorTematica(Tematica tematicaBuscar) {
        for (Serie s : listaSeries) {
            if (s.getTematica().equals(tematicaBuscar)) {
                System.out.println(s.toString());
            }
        }
    }

    private void verSeriesPorNacionalidad(String nacionalidadBuscar) {
        for (Serie s : listaSeries) {
            if (s.getNacionalidad().equalsIgnoreCase(nacionalidadBuscar)) {
                System.out.println(s.toString());
            }
        }
    }

    private void verTodasSeries() {
        for (Serie s : listaSeries) {
            System.out.println(s.toString());
        }
    }

}
