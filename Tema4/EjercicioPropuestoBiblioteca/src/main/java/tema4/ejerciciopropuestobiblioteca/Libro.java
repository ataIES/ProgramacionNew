/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejerciciopropuestobiblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author DAW125
 */
public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private LocalDate fecha_publicacion;

    public Libro(String titulo, String autor, String editorial, String fecha_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fecha_publicacion = LocalDate.parse(fecha_publicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public LocalDate getFecha_publicacion() {
        return fecha_publicacion;
    }

    @Override
    public String toString() {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MMMM-yyyy").withLocale(new Locale("es","ES"));
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", fecha_publicacion=" + fecha_publicacion.format(f) + '}';
    }
    
    
    
}
