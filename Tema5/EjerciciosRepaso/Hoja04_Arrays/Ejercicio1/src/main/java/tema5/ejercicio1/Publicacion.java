/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public abstract class Publicacion {

    private String titulo;
    private String autor;
    private Calendar fecha;

    public Publicacion(String titulo1, String autor1, int dia, int mes, int anio) {
        this.titulo = titulo1;
        this.autor = autor1;
        this.fecha=Calendar.getInstance();
        fecha.set(anio, mes, dia);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    @Override
    public abstract String toString();

}
