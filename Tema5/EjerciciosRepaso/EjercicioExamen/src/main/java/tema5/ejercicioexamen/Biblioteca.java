/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicioexamen;

/**
 *
 * @author atres
 */
public class Biblioteca {

    private String nombreBiblioteca;
    private Libro[] libros;
    private Usuarios[] usuarios;
    private Prestamo[] prestamos;
    private static int contLibros;
    private static int contUsuarios;
    private static int contPrestamos;

    public Biblioteca(String nombreBiblioteca1, int nMaximo) {
        this.nombreBiblioteca = nombreBiblioteca1;
        this.libros = new Libro[nMaximo];
        this.usuarios = new Usuarios[nMaximo];
        this.prestamos = new Prestamo[nMaximo];
        contLibros = 0;
        contUsuarios = 0;
        contPrestamos = 0;
    }
//Metodo que agrega Libros al array libros
    public boolean agregarLibros(Libro l) throws MiExcepcionAdrian {
        boolean agregado = false;
        if (contLibros < libros.length) {
            libros[contLibros] = l;
            contLibros++;
            agregado = true;
        } else {
            throw new MiExcepcionAdrian("Error, se ha alcanzado el límite de libros");
        }
        return agregado;
    }

    //Metodo que agrega Usuarios al array usuarios
    public boolean agregarUsuario(Usuarios u) throws MiExcepcionAdrian {
        boolean agregado = false;
        if (contUsuarios < usuarios.length) {
            usuarios[contUsuarios] = u;
            contUsuarios++;
            agregado = true;
        } else {
            throw new MiExcepcionAdrian("Error, se ha alcanzado el límite de Usuarios");
        }
        return agregado;
    }

    //Metodo que agrega Prestamos al array Prestamos
    public boolean agregarPrestamo(Prestamo p) throws MiExcepcionAdrian {
        boolean agregado = false;
        if (contPrestamos < prestamos.length) {
            prestamos[contPrestamos] = p;
            contPrestamos++;
            agregado = true;
        } else {
            throw new MiExcepcionAdrian("Error, se ha alcanzado el límite de Prestamos");
        }
        return agregado;
    }
    
    public boolean buscarLibro(Libro l){
        boolean encontrado=false;
        for(Libro libro:libros){
            if(libro!=null){
                if(libro.equals(l)){
                    encontrado=true;
                }
            }
        }
        return encontrado;
    }

}
