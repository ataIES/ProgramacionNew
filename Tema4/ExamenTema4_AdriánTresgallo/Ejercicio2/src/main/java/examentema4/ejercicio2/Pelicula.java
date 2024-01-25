/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examentema4.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author
 * Adrián Tresgallo Arozamena
 * DAW125
 */
public class Pelicula {
    private String nombre;
    private String director;
    private LocalDate fechaLanzamiento;

    public Pelicula(String nombre, String director, LocalDate fechaLanzamiento) {
        this.nombre = nombre;
        this.director = director;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    @Override
    public String toString() {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MMMM-yyyy").withLocale(new Locale("es","ES"));
        
        return "Pelicula{" + "nombre=" + nombre + ", director=" + director + ", fechaLanzamiento=" + fechaLanzamiento.format(f) + '}';
    }
    
    
}
