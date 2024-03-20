/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicioexamen;

import java.util.Objects;

/**
 *
 * @author atres
 */
public abstract class Libro implements Identificable {
    
    
    //Atributos protected para que pueda acceder a ellos desde sus clases hijas
    protected String titulo;
    protected String autor;
    
//Constructor por defecto donde pido los datos por teclado
    public Libro() {
        this.titulo = Teclado.validarString("Introduce el título: ");
        this.autor = Teclado.validarString("Introduce el autor: ");
    }

    //Contructor por parámetros
    public Libro(String titulo1, String autor1) {
        this.titulo = titulo1;
        this.autor = autor1;
    }

    //Get y Set
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.titulo);
        hash = 11 * hash + Objects.hashCode(this.autor);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

     //Metodo que imprime los datos de los libros
    @Override
    public String imprime(){
        return "\nLibro: Titulo: "+getTitulo()+"\tAutor: "+getAutor();
    }
}
