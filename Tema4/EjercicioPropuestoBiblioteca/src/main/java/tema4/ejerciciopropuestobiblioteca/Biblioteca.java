/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejerciciopropuestobiblioteca;

import java.util.Arrays;



/**
 *
 * @author DAW125
 */
public class Biblioteca {

    private Libro[] libros;
    private int contLibros;

    public Biblioteca(int nLibros) {
        this.libros = new Libro[nLibros];
        this.contLibros = 0;
    }

    public boolean agregarLibros(Libro libro1) {
        boolean agregado = false;
        if (contLibros < libros.length) {
            libros[contLibros] = libro1;
            contLibros++;
            agregado = true;
        } else {
            System.out.println("Error, límite máximo de libros");
        }
        return agregado;
    }

    public boolean buscarLibro(Libro libro1) {
        boolean encontrado = false;
        for (int i = 0; i < contLibros; i++) {
            if (libros[i].getTitulo() == libro1.getTitulo()) {
                System.out.println(libros[i].toString());
                encontrado = true;
            }
        }
        return encontrado;
    }

    public void eliminarLibro(Libro libro1) {
        boolean encontrado=false;
        for (int i = 0; i < contLibros; i++) {
            if (buscarLibro(libro1)) {
                for (int a = i; a < contLibros - 1 &&!encontrado; a++) {
                    libros[a] = libros[a + 1];
                    encontrado=true;
                }
                libros[contLibros - 1] = null;
                contLibros--;
                System.out.println("Libro " + libro1.getTitulo() + " borrado correctamente");
            } else {
                System.out.println("Error, libro " + libro1.getTitulo() + " no existe");
            }
        }
    }
    public String consultarLibro(String titulo){
        String cadena="";
        boolean encontrado=false;
        for(int i=0;i<contLibros&&!encontrado;i++){
            if(libros[i].getTitulo().equalsIgnoreCase(titulo)){
                cadena+=libros[i].toString()+"\n"; 
                encontrado=true;
            }else{
                cadena="Error, no existe el libro "+titulo+"\n";
            }
        }
        return cadena;
    }
   public String consultarAutor(String autor){
       String cadena="";
       boolean encontrado=false;
       Libro aux[]=new Libro[libros.length];
       Arrays.sort(libros);
       for(int i=0;i<contLibros&&!encontrado;i++){
           if(libros[i].getAutor().equalsIgnoreCase(autor)){
               aux[i]=libros[i];
               cadena+=aux[i].toString()+"\n";
               encontrado=true;
           }else{
               cadena="Error, no existe el autor "+autor+"\n";
           }
          
       }
       return cadena;
   }
   public String consultarPublicacion(int anio){
       String cadena="";
       boolean encontrado=false;
       for(int i=0;i<contLibros &&!encontrado;i++){
           if(libros[i].getFecha_publicacion().getYear()==anio){
               cadena+=libros[i].toString()+"\n";
               encontrado=true;
           }else{
               cadena="Error, no existe la publicacion en la fecha "+anio+"\n";
           }
       }
       return cadena;
   }

   public String consultarEditorial(String editorial){
       String cadena="";
       boolean encontrado=false;
       for(int i=0;i<contLibros&&!encontrado;i++){
           if(libros[i].getEditorial().equalsIgnoreCase(editorial)){
               cadena+=libros[i].toString()+"\n";
               encontrado=true;
           }else{
               cadena="Error, no existe la editorial "+editorial+"\n";
           }
       }
       return cadena;
   }
   public void mostrarBiblioteca(){
       for(int i=0;i<contLibros;i++){
           System.out.println(libros[i].toString());
       }
   }
}
