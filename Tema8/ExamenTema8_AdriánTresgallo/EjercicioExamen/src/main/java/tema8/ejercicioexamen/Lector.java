/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicioexamen;

import java.time.LocalDate;

/**
 * Clase que representa a la tabla lectores
 * @author Adrián Tresgallo Arozamena
 */
public class Lector {
    
    private int id;
    private String nombre;
    private Libro libro;
    private LocalDate fecha_prestamo;

    /**
     * Constructor por parámetros
     * @param id
     * @param nombreLibro
     * @param libro
     * @param fecha_prestamo 
     */
    public Lector(int id, String nombre, Libro libro, LocalDate fecha_prestamo) {
        this.id = id;
        this.nombre = nombre;
        this.libro = libro;
        this.fecha_prestamo = fecha_prestamo;
    }

    /**
     * Constructor que no pide por parámetros el id
     * @param nombre
     * @param libro
     * @param fecha_prestamo 
     */
    public Lector(String nombre, Libro libro, LocalDate fecha_prestamo) {
        this.nombre = nombre;
        this.libro = libro;
        this.fecha_prestamo = fecha_prestamo;
    }
    

    /**
     * Metodos get y Set
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(LocalDate fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    /**
     * Metodo que muestra informacion del lector
     * @return 
     */
    @Override
    public String toString() {
        return "Lector{" + "id=" + id + ", nombreLibro=" + nombre + ", libro=" + libro + ", fecha_prestamo=" + fecha_prestamo + '}';
    }
    
    
    
    
    
    
}
