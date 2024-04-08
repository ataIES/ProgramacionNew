/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.util.Objects;

/**
 *
 * @author DAW125
 */
public class Articulo {
    private String codigo;
    private String descripcion;
    private int existencias;
    
    public Articulo(){
        this.codigo=Teclado.introCodigo("Introduce el código del artículo: ");
        this.descripcion=Teclado.introDescripcion("Introduce su descripción: ");
        this.existencias=Teclado.introExistencias("Introduce sus existencias: ");
    }

    public Articulo(String codigo, String descripcion, int existencias) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.existencias = existencias;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencias() {
        return existencias;
    }
    public String mostrarArticulo(){
        String cadena="";
        
        cadena=String.format("\nCódigo de Artículo: %s\nDescripción: %s\nExistencias:%d"
                , getCodigo(),getDescripcion(),getExistencias());
        
        return cadena;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codigo);
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
        final Articulo other = (Articulo) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
}
