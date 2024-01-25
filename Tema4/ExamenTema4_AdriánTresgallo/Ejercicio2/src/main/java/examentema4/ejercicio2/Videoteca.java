/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema4.ejercicio2;

/**
 * Adrián Tresgallo Arozamena
 *
 * @author DAW125
 */
public class Videoteca {

    private Pelicula[] peliculas;
    private int contPelicula;

    public Videoteca(int nPelicula) {
        this.peliculas = new Pelicula[nPelicula];
        this.contPelicula = 0;
    }

    public boolean agregarPelicula(Pelicula p) {
        boolean agregado = false;
        if (contPelicula < peliculas.length) {
            peliculas[contPelicula] = p;
            contPelicula++;
            agregado = true;
        } else {
            System.out.println("Error, número máximo de películas alcanzado");
        }
        return agregado;
    }

    public void eliminarPelicula(Pelicula p) {
        boolean encontrado = false;
        for (int i = 0; i < contPelicula && !encontrado; i++) {
            if (peliculas[i] == p) {
                for (int a = i; a < contPelicula - 1; a++) {
                    peliculas[a] = peliculas[a + 1];
                    System.out.println("Se ha borrado correctamente");
                }
            } else {
                System.out.println("No existe la pelicula");
                return;
            }
            encontrado = true;
            peliculas[contPelicula - 1] = null;
            contPelicula -= 1;
        }
    }

    public void consultarPelicula(String titulo) {
        String cadena = "";
        for (int i = 0; i < contPelicula ; i++) {
            if (peliculas[i].getNombre().equalsIgnoreCase(titulo)) {
                cadena+=peliculas[i].toString() + "\n";
                System.out.println(cadena);

            } else {
                System.out.println("Error, no existe ninguna pelicula llamada " + titulo);
                return;
            }
        }
        
    }

    public void consultarDirector(String nombreDirector) {
        String cadena="";
        for (int i = 0; i < contPelicula; i++) {
            if (peliculas[i].getDirector().equalsIgnoreCase(nombreDirector)) {
                cadena+=peliculas[i].toString()+"\n";
                System.out.println(cadena);
            } else {
                cadena="No existe ningun directos con el nombre de "+nombreDirector;
                System.out.println(cadena);
                return;
            }
        }
    }
    public void consultarLanzamiento(int anioLanzamiento){
         String cadena="";
         boolean encontrado=false;
        for (int i = 0; i < contPelicula&& !encontrado; i++) {
            if (peliculas[i].getFechaLanzamiento().getYear()==anioLanzamiento) {
                encontrado=true;
                cadena+=peliculas[i].toString()+"\n";
                System.out.println(cadena);
                
                return;
            } else {
                cadena="No existe ninguna película en el año "+anioLanzamiento;
                System.out.println(cadena);
                
                
            }
        }
    }

    public String mostrarVideoteca() {
        String cadena = "";
        for (int i = 0; i < contPelicula; i++) {
            cadena += peliculas[i].toString() + "\n";
        }
        return cadena;
    }

}
