/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.Objects;

/**
 *
 * @author DAW125
 */
public class Capitulo {
    private int nTemporada;
    private int nCapitulo;
    private String descripcion;
    
    //Constructor que paso por parámetro la serie a la que está relacionada y  que pide datos por teclado
    public Capitulo(Serie s){
        this.nTemporada=Teclado.validarTemporada(s);
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.nTemporada;
        hash = 73 * hash + this.nCapitulo;
        hash = 73 * hash + Objects.hashCode(this.descripcion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Capitulo other = (Capitulo) obj;
        if (this.nTemporada != other.nTemporada) {
            return false;
        }
        if (this.nCapitulo != other.nCapitulo) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

  
    
    
}
