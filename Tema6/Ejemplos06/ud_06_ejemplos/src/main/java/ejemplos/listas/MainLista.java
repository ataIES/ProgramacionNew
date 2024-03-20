/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MainLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /*
            La interfaz List define una sucesión de elementos.
            - Si admite elementos duplicados.
            - Añade nuevos metodos que podemos usar

            Acceso posicional a elementos: manipula elementos en función de su posición en la lista.
            Busqueda de elementos: busca un elemento concreto de la lista y devuelve su posición.
            Rango de operación: permite realizar ciertas operaciones sobre ragos de elementos dentro de la propia lista.

            Implementaciones:
            - ArrayList: Los elementos tienen su posición(un indice)
            Al insertar o remover un elemento en medio, cambia completamente el indice de los elementos

            - LinkedList: Los elementos tienen un enlace a los elementos anteriores y siguientes, ademas del indice
            Saben que elemento es el anterior y el siguiente, por lo que
            Al insertar o remover un elemento en medio, solo se modifican los enlaces correspondientes
         */
        System.out.println("\n\nList:");

        System.out.println("\nArrayList.\n");

        List<String> animalesList = new ArrayList<>();
        animalesList.add("Perro");
        animalesList.add("Gato");
        animalesList.add("Vaca");
        animalesList.add("Caballo");
        animalesList.add("Gallo");
        animalesList.add("Pato");
        animalesList.add("Oveja");
        animalesList.add("Cabra");
        animalesList.add("Gato");
        // Nos volvera a guardar otro "Gato", ya que admite elementos repetidos:
        animalesList.add("Toro");

        for (String animal: animalesList) {
            System.out.println(animal);
        }
        int perro = animalesList.indexOf("Perro");
        System.out.println("\n" + animalesList.get(perro));

        // int = dato primitivo
        // Integer = objeto
        System.out.println("\nList de tipo Integer:");
        List<Integer> agenda = new ArrayList<>();
        agenda.add(230);
        agenda.add(217);
        agenda.add(320);

        for (Integer a: agenda) {
            System.out.println(a);
        }

        System.out.println("\nLinkedList.\n");

        List<String> ciudades = new LinkedList<>();
        ciudades.add("Torrelavega");
        ciudades.add("Santander");
        ciudades.add("Suances");
        ciudades.add("Comillas");
        ciudades.add("Renedo");
        ciudades.add("Cuenca");

        for (String ciudad: ciudades) {
            System.out.println(ciudad);
        }

       

       

      

    }
    
}
