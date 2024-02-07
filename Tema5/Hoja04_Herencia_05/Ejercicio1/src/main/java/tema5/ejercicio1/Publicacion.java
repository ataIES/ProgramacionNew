/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author DAW125
 */
public abstract class Publicacion {

    private String titulo;
    private String autor;
    private LocalDate fecha;
    private int id;

    public Publicacion(String titulo1, String autor1, int dia, int mes, int anio) {
        this.titulo=titulo1;
        this.autor=autor1;
        this.fecha=LocalDate.of(anio, mes, dia);
        this.id++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    @Override
    public abstract String toString();
    
}
