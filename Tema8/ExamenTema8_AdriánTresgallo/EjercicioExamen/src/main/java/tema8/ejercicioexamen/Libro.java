/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicioexamen;

/**
 * Clase que representa a la tabla libros
 * @author Adrián Tresgallo Arozamena
 */
public class Libro {
    
     private String codLibro;
     private String titulo;
     private String autor;
     private int copias;

     /**
      * Constructor por parámetros
      * @param codLibro
      * @param titulo
      * @param autor
      * @param copias 
      */
    public Libro(String codLibro, String titulo, String autor, int copias) {
        this.codLibro = codLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.copias = copias;
    }

    /**
     * Metodos get y set
     * @return 
     */
    public String getCodLibro() {
        return codLibro;
    }

    public void setCodLibro(String codLibro) {
        this.codLibro = codLibro;
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

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    /**
     * Metodo que muestra información sobre el libro
     * @return 
     */
    @Override
    public String toString() {
        return "Libro{" + "codLibro=" + codLibro + ", titulo=" + titulo + ", autor=" + autor + ", copias=" + copias + '}';
    }
    
    
     
     
}
