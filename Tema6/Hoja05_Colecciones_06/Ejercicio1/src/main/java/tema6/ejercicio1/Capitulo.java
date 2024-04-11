/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Capitulo {
    private int nTemporada;
    private int nCapitulo;
    private String descripcion;
    
    //Constructor por defecto que pide datos por teclado
    public Capitulo(){
        this.nTemporada=Teclado.introTemporada("Introduce el número de Temporada: ");
        this.nCapitulo=Teclado.introCapitulo("Introduce el número de capítulo: ");
        this.descripcion=Teclado.introCadena("Introduce una descripción para el capítulo: ");
    }

    //Constructor por parámetros
    public Capitulo(int nTemporada, int nCapitulo, String descripcion) {
        this.nTemporada = nTemporada;
        this.nCapitulo = nCapitulo;
        this.descripcion = descripcion;
    }

    //Metodos get
    public int getnTemporada() {
        return nTemporada;
    }

    public int getnCapitulo() {
        return nCapitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Metodo que muestra el capitlo
    @Override
    public String toString() {
        String cadena="";
        
        cadena="\nTemporada: "+getnTemporada()+"\nCapitulo: "+getnCapitulo()+"\nDescripción: "+getDescripcion();
        
        return cadena;
    }
    
    
}
