/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicioexamen;

import java.time.LocalDate;

/**
 *
 * @author atres
 */
public class Prestamo {
      private Libro libro;
    private Usuarios usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    //Constructor con parámetros
    public Prestamo(Libro libro1, Usuarios usuario1, LocalDate fechaPrestamo1,LocalDate fechaDevolucion1) {
        this.libro = libro1;
        this.usuario = usuario1;
        this.fechaPrestamo = fechaPrestamo1;
        this.fechaDevolucion =fechaDevolucion1;
    }

    //Get y set
    public Libro getLibro() {
        return libro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    //Metodo toString para mostrar datos de Prestamo, he creado una clase static en la clase teclado
    @Override
    public String toString(){
        return "\nPrestamo: Libro: "+libro.imprime()+" \n\tUsuario: "+usuario.toString()+"\tFecha de Prestamo: "+Teclado.formatearFechas(fechaPrestamo)+"\tFecha de devolución: "+Teclado.formatearFechas(fechaDevolucion);
    }
}
