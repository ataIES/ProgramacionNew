/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema5.ejercicio1;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Publicacion[]publicaciones=new Publicacion[3];
       if(MetodosPublicacion.insertarPublicaciones(publicaciones)){
           System.out.println("Gracias!!!");
       }
        System.out.println(MetodosPublicacion.mostrarPublicaciones(publicaciones));
    }
}
