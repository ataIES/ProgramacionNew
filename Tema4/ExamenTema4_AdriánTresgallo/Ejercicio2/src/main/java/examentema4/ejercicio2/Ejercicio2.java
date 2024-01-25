/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examentema4.ejercicio2;

import java.time.LocalDate;

/**
 *Adrian Tresgallo Arozamena
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Videoteca v=new Videoteca(500);
        Pelicula p1=new Pelicula("Titanic","James Cameron",LocalDate.parse("1997-12-19"));
        Pelicula p2=new Pelicula("Avatar","James Cameron",LocalDate.parse("2009-12-18"));
        Pelicula p3=new Pelicula("Inception","Christopher Nolan",LocalDate.parse("2010-07-08"));
        Pelicula p4=new Pelicula("Los Otros","Alejando Amenabar",LocalDate.parse("2001-09-07"));
        System.out.println("---Agregar peliculas---");
        System.out.println(agregarPeli(v,p1));
        System.out.println(agregarPeli(v,p2));
        System.out.println(agregarPeli(v,p3));
        System.out.println(agregarPeli(v,p4));
        System.out.println("---Prueba consultarPelicula con Titanic---");
        v.consultarPelicula("Titanic");
        System.out.println("---Prueba consultarDirector con James Cameron---");
        v.consultarDirector("James Cameron");
        System.out.println("---Prueba consultarLanzamiento en 2010 y 2003");
        System.out.println("---Año 2010---");
        v.consultarLanzamiento(2010);
        System.out.println("---Año 2003---");
        v.consultarLanzamiento(2003);
        System.out.println("---Eliminar Avatar---");
        v.eliminarPelicula(p2);
        System.out.println("---Mostrar videoteca---");
        System.out.println(v.mostrarVideoteca());
        
        
        
        
    }
    public static String agregarPeli(Videoteca v1,Pelicula p2){
        String cadena="";
        if(v1.agregarPelicula(p2)){
            cadena="Pelicula "+p2.getNombre()+ " agregada correctamente";
        }else{
            cadena="Error, no se pudo agregar la pelicula "+p2.getNombre();
        }
        return cadena;
    }
    
}
