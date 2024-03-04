/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemploAlumnos;

import ejemploHash.Pintor;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //voy a crear un array de 10 artistas. introduzco en él 4 pintores
        Artista[] pintores = new Artista[6];
        
        pintores[0] = new Artista("Goya", "Fuendetodos", 1746);
        pintores[1] = new Artista("Picasso", "Málaga", 1881);
        pintores[2] = new Artista("Dalí", "Figueras", 1904);
        pintores[3] = new Artista("Velázaquez", "Sevilla", 1599);
        pintores[4] = pintores[0];
        pintores[5] = new Artista("Goya", "Fuendetodos", 1746);
        //veo qué se han creado
        for(Artista a : pintores){
            if(a!=null)
            System.out.println(a.toString());
        }
        System.out.println();
        //comprobamos cómo funciona hasCode()
        for(Artista a : pintores){
            if(a!=null)
            System.out.println(a.toString() + " HashCode:" + a.hashCode());
        }
        
        //comprobamos equals.
            System.out.println();
        System.out.println(pintores[0].equals(pintores[1]));
        System.out.println(pintores[0].equals(pintores[4]));
        System.out.println(pintores[0].equals(pintores[5]));
        System.out.println(pintores[0].equals(pintores[2]));
        //System.out.println(pintores[0].equals(pintores[8]));
        
        System.out.println("Utilización de Compare");
        //comprobamos compareTo
        System.out.println(pintores[0].getNombre().compareTo(pintores[1].getNombre()));
        System.out.println(pintores[0].getNombre().compareTo(pintores[4].getNombre()));
        System.out.println(pintores[0].getNombre().compareTo(pintores[5].getNombre()));
        System.out.println(pintores[0].getNombre().compareTo(pintores[2].getNombre()));
        
        System.out.println();
        //ahora probamos sort
        //previamente debo implementar la interfaz Comparable en la clase Artista
        //además reduzco el tamaño del array a 6 y comento la línea
        //System.out.println(pintores[0].equals(pintores[8])); de más arriba
        
       Arrays.sort(pintores);
         System.out.println("Array de pintores en orden");
        for(Artista a : pintores){
            if(a!=null)
            System.out.println(a.toString() + " HashCode:" + a.hashCode());
        }
        
        //ahora voy a sobreescribir los métodos hasCode y equals
        
        
        
        
    }//fin del main
    
}
