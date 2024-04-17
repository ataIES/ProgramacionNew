/*Crea una lista con 40 números enteros aleatorios entre -20 y 20. 
A partir de ella crear dos Stream, uno con los números positivos y otro con los números negativos, todos ellos sin repetir.
Muestra por pantalla el número de elementos de cada Stream. 
Crea otro Stream para contar los números que están comprendidos entre -10 y 10 incluidos, sin repeticiones

 */

package UD06HOSTREAM1EJ02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author pe
 */
public class Ejercicio2 {

    public static void main(String[] args) {
          List<Integer> listaEnteros= new ArrayList<>();
        for( int i=0; i<40;i++){
            /*entre -20 y 20 inclusive, hay 41 números*/
            Integer n= (int) (Math.random()*41 - 20);
            listaEnteros.add(n);
            
        }
        // para visualizarlo mejor la ordeno
        Collections.sort(listaEnteros);
        System.out.println("\nVisualizo los elementos creados ordenados");
        System.out.println(listaEnteros);
         // que muestre la lista de enteros positivos
        System.out.println("\nLista de enteros positivos");
        listaEnteros.stream()//flujo de datos
                    .filter(n->n>0)
                    .distinct()
                    .forEach(System.out::println); 
        //los dos puntos que aparecen dos veces son el operador de referencia al método
        // println en este caso
        
        //numeros positivos
        
        //filter y distinct son muy habituales en las expresiones lambda
        //filter se utiliza para seleccionar solo los elementos del flujo de datos que cumplen con una condición específica. 
        //La condición se define como una expresión lambda.
        //distinct se utiliza para eliminar los duplicados del flujo de datos.
        
        long numPositivos=listaEnteros.stream()
                .filter(n -> n>0)
                .distinct() // elimina repetidos
                .count();
        System.out.println("\nNúmeros positivos: "+numPositivos);
          //que devuelva una lista de negativos
        List<Integer> listaNegativa=listaEnteros.stream()
                .filter(n->n<0)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("lista negativa" +listaNegativa);      
        //numeros negativos
        long numNegativos=listaEnteros.stream()
                .filter(n -> n<0)
                .distinct()
                .count();     
        System.out.println("\nNúmeros negativos: "+numNegativos);
        //entre -10 y 10
        long numeros=listaEnteros.stream()
                .filter(n-> n<=10 && n>=-10)
                .distinct()
                .count();
        System.out.println("\nNúmeros entre -10 y 10: "+numeros);
    }
}
