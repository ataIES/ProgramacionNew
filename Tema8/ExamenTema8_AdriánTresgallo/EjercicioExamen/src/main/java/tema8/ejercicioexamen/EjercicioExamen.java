/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema8.ejercicioexamen;

import java.time.LocalDate;
import java.util.List;

/**
 * MAIN donde se ejecuta el programa
 *
 * @author DAW125
 */
public class EjercicioExamen {

    public static void main(String[] args) {
        LibroDAOImp metodosLibro = new LibroDAOImp();
        LectorImp metodosLector = new LectorImp();
        Libro libroaux = null;
        List<Lector>listaLectores=null;
        boolean eliminado=false;
        
        System.out.println("---Mostrar lectores y libros---");
        listaLectores=metodosLector.listar();
        LectorImp.listarLector(listaLectores);
        System.out.println("");
        System.out.println("---Crear e insertar un Libro---");
        Libro libro1=new Libro("9788432207822","Sin Noticias de Grub","Eduardo Mendoza",100);
        metodosLibro.insertar(libro1);
        System.out.println("---Muestro que exista---");
        libroaux=metodosLibro.porCod("9788432207822");
        System.out.println(libroaux.toString());
        System.out.println("");
        System.out.println("---Crear dos lectore e insertarlos---");
        libroaux=metodosLibro.porTitulo("Sin Noticias de Grub");
        Lector lector1=new Lector("Alicia Blanco",libroaux,LocalDate.of(2024, 5, 25));
        Lector lector2=new Lector("Bernardo Rojo",libroaux,LocalDate.of(2024, 5, 26));
        metodosLector.insertar(lector1);
        metodosLector.insertar(lector2);
        System.out.println("");
        System.out.println("---Modificar los datos del libro en la opción 1 para que tenga la mitad de copias---");
        metodosLibro.modificar("9788432207822");
        System.out.println("");
        System.out.println("---Modificar datos del lector 1 para que ya no tenga libros---");
        metodosLector.modificar("Alicia Blanco");
        System.out.println("");
        System.out.println("---Mostrar datos  del libro creado apartado 2");
        libroaux = metodosLibro.porTitulo("Sin Noticias de Grub");
        mostrarLibro(libroaux);
        System.out.println("");
        System.out.println("---Mostrar datos lectores del libro creado en el apartado2---");
        listaLectores=metodosLector.listarLectores("9788432207822");
        LectorImp.listarLector(listaLectores);
        System.out.println("");
        System.out.println("---Mostrar datos de los lectores por fecha de prestamo");
        listaLectores=metodosLector.listarFechaPrestamo();
        LectorImp.listarLector(listaLectores);
        System.out.println("");
        System.out.println("---Eliminar el lector 1---");
        eliminado=metodosLector.eliminar("Alicia Blanco");
        mostrarEliminado(eliminado);
        System.out.println("");
        System.out.println("---Eliminar libro creado apartado 2---");
        eliminado=metodosLibro.eliminar("9788432207822");
        mostrarEliminado(eliminado);
        System.out.println("---Cerrando conexion---");
        AccesoBaseDatos.getInstance().cerrar();
        
    }

    /**
     * Metodo que muestra si un libro existe o no 
     * @param l 
     */
    public static void mostrarLibro(Libro l) {
        try {
            if (l != null) {
                System.out.println(l.toString());
            } else {
                throw new NullPointerException("Error, el libro no existe");
            }
        }catch(NullPointerException n){
            System.out.println(n.getMessage());
        }
    }
    /**
     * Metodo si se acaba eliminado o no
     * @param eliminado 
     */
    public static void mostrarEliminado(boolean eliminado){
        try{
            if(eliminado){
                System.out.println("Eliminado Correctamente");
            }else{
                throw new Exception("No se ha eliminado");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
