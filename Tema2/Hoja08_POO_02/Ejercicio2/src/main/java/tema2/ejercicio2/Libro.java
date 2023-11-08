/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio2;

/**
 *
 * @author daw1
 */
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public boolean esEspaniol() {
        boolean esEspaniol = false;
        int nISBN = Integer.parseInt(isbn.substring(3, 5));
        if (nISBN == 84) {
            esEspaniol = true;
        }
        return esEspaniol;
    }

    public void mostrarLibro() {
        String nAutor = autor.substring(0, 1).toUpperCase() + autor.substring(1, autor.length()).toLowerCase();
        System.out.println("ISBN= " + isbn + "\nTítulo: " + titulo.toUpperCase() + "\nAutor: " + nAutor);
    }
}
