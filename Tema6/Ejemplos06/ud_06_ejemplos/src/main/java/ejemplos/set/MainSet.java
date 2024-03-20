/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejemplos.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class MainSet {

    public static void main(String[] args) {
        /*
            La colección Set no puede contener elementos duplicados
            Solo tiene los métodos heredados de Collection
            Existen diferentes tipos de implementaciones

            HashSet: Es la que mejor rendimiento tiene, pero
                     Los elementos no tienen ningun un orden

            TreeSet : Tiene el peor rendimiento, pero
                      nos ordena los elementos de nuestra colección de
                      mayor a menor o alfabeticamente

            LinkedHashSet: Tiene un rendimiento menor que HashSet.
                           Nos guarda los elementos en el orden
                           que los agregamos
         */

        System.out.println("\n HashSet: \n");

        Set<String> frutas = new HashSet<>(); // Declaramos una nueva coleccion de tipo set
        frutas.add("Melón");                // con la implementación HashSet
        frutas.add("Manzana");
        frutas.add("Durazno");
        frutas.add("Pera");
        frutas.add("Cereza");
        frutas.add("Mandarina");
        frutas.add("Carambola");
        frutas.add("Maracuya");
        frutas.add("Platano");
        frutas.add("Melón");
        // La coleccion no puede contener elementos duplicados,
        // por lo que solo se guarda un solo "Melón"

        // Recorre los elementos String,
        // devolviendonos una fruta de nuestra colección
        // Imprimimos los elementos
        for (String fruta: frutas) {
            System.out.println(fruta);
        }

        System.out.println("\n Treeset: \n");

        Set<String> frutas2 = new TreeSet<>();
        frutas2.add("Melón");
        frutas2.add("Manzana");
        frutas2.add("Durazno");
        frutas2.add("Pera");
        frutas2.add("Cereza");
        frutas2.add("Mandarina");
        frutas2.add("Carambola");
        frutas2.add("Maracuya");
        frutas2.add("Platano");

        // Recorre los elementos String,
        // devolviendonos una fruta de nuestra colección
        // Imprimimos los elementos
        for (String fruta: frutas2) {
            System.out.println(fruta);
        }

        System.out.println("\n LinkedHashSet: \n");

        Set<String> frutas3 = new LinkedHashSet<>();
        frutas3.add("Melón");
        frutas3.add("Manzana");
        frutas3.add("Durazno");
        frutas3.add("Pera");
        frutas3.add("Cereza");
        frutas3.add("Mandarina");
        frutas3.add("Carambola");
        frutas3.add("Maracuya");
        frutas3.add("Platano");

        // Recorre los elementos String,
        // devolviendonos una fruta de nuestra colección
        // Imprimimos los elementos
        for (String fruta: frutas3) {
            System.out.println(fruta);
        }
        // El método size() nos da el numero de elementos de nuestra colección.
        System.out.println(frutas3.size());

        

       

       
        /*
            La interfaz Map asocia claves a valores .
            No puede contener claves duplicadas y
            cada clave solo puede contener asociado un valor

            Implementaciones:
            HashMap
            TreeMap
            LinkedHashMap
         */
        // HashMap: Tiene mejor rendimiento, pero no garantiza ningun orden a la hora de hacer iteraciones
        System.out.println("\n\nMap:\n");

        System.out.println("HashMap.\n");
        Map<String, String> diccionario = new HashMap<>();
        // nombreDeMap.put(clave, valor);
        diccionario.put("Sherpa1", "Carlos");
        diccionario.put("Sherpa2", "Rodrigo");
        diccionario.put("Sherpa3", "Magali");
        diccionario.put("Sherpa4", "Laura");


        System.out.println(diccionario.get("Sherpa1"));

        for (Map.Entry<String, String> entry : diccionario.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // TreeMap: Los guarda en orden de mayor a menor de acuerdo a las claves
        System.out.println("\nTreeMap.\n");
        Map<String, String> diccionario2 = new TreeMap<>();
        diccionario2.put("Sherpa_1", "Carlos");
        diccionario2.put("Sherpa_2", "Rodrigo");
        diccionario2.put("Sherpa_4", "Laura");
        diccionario2.put("Sherpa_3", "Magali");

        System.out.println(diccionario2.get("Sherpa_2"));

        for (Map.Entry<String, String> entry : diccionario2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // LinkedHashMap: Los guarda en el orden de inserción
        System.out.println("\nLinkedHashMap.\n");
        Map<String, String> diccionario3 = new LinkedHashMap<>();
        diccionario3.put("Sherpa_1", "Carlos");
        diccionario3.put("Sherpa_2", "Rodrigo");
        diccionario3.put("Sherpa_4", "Laura");
        diccionario3.put("Sherpa_3", "Magali");

        System.out.println(diccionario3.get("Sherpa_3"));

        for (Map.Entry<String, String> entry : diccionario3.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
