/*Creamos 4 jugadores y los insertamos en una Lista de jugadores. Realizar las siguientes operaciones utilizando las funciones de Stream:
•	Listar a todos los jugadores
•	Listar a los jugadores que tengan la letra N en su nombre.
•	Listamos a los jugadores sin repeticiones
•	Listamos los dos más bajos
•	Listamos los dos más altos
•	Ordenamos por altura descendente
•	Listamos el nombre en mayúsculas
•	Listamos el nombre en mayúsculas y su altura
•	Contamos los jugadores
•	Listamos el jugador con máximo de altura

 */

package UD06HOSTREAM1EJ03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author pe
 */
public class Ejercicio3 {

    public static void main(String[] args) {
         List<Jugador> jugadores = new ArrayList<>();
        Jugador j2 = new Jugador("Amaya Valdemoro", 1.82F);
        Jugador j3 = new Jugador("Maite Cazorla", 1.78F);
        Jugador j4 = new Jugador("Laura Nicholls", 1.90F);
        Jugador j5 = new Jugador("Laura Gil", 2.03F);
        if (jugadores.add(j5)) {
            System.out.println("insertado correctamente");
        }
        if (jugadores.add(j4)) {
            System.out.println("insertado correctamente");
        }
        if (jugadores.add(j3)) {
            System.out.println("insertado correctamente");
        }
        
        if (jugadores.add(j2)) {
            System.out.println("insertado correctamente");
        }
        //
        System.out.println("\n Listar todos los jugadores");
        jugadores.stream()
                .sorted()
               // .sorted((a,b) ->(a.getNombre().compareTo(b.getNombre())))
                .forEach(System.out::println);
        //
        System.out.println("\nListar a los jugadores que tengan la letra N en su nombre");
        jugadores.stream()
                .filter(s -> s.getNombre().toUpperCase().contains("N"))
        //la función de .filter es retornar un nuevo Stream que contiene solo aquellos elementos que cumplen una determinada condición
                .forEach(System.out::println);
        //
         if (jugadores.add(j2)) {
            System.out.println("insertado correctamente");
        }
        System.out.println("\nListamos a los jugadores sin repeticiones");
        jugadores.stream()
                .distinct()
                .forEach(System.out::println);
        //
        System.out.println("\nListamos los dos más bajos");
        jugadores.stream()
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        //
        System.out.println("\nListamos los dos más altos");
        jugadores.stream()
                .sorted((a,b)-> -(int)(100*a.getAltura()-100*b.getAltura()))
                .limit(2)
                .forEach(System.out::println);
        //
         System.out.println("\nOrdenamos por altura descendente");
        jugadores.stream()
                .sorted((a,b)-> (int)(100*b.getAltura()-100*a.getAltura()))
                .forEach(System.out::println);
        //
         System.out.println("\nListamos el nombre en mayúsculas");
         jugadores.stream()
                 .map(a -> a.getNombre().toUpperCase())
        // Esta función se utiliza para transformar los elementos de un Stream o una colección. aquí se pasan nombres a mayúsculas
                 .forEach(System.out::println);
        //
        System.out.println("\nListamos el nombre en mayúsculas y su altura");
         jugadores.stream()
                 .forEach(a-> System.out.println("Nombre "+a.getNombre().toUpperCase()+" Altura "+a.getAltura()));
        // 
        long contador=jugadores.stream()
                .distinct()
                .count();
        System.out.println("\nContamos los jugadores " +contador);   
        //
        System.out.println("\nListamos el jugador con máximo de altura");
        jugadores.stream()
                 .sorted()
                 .skip(jugadores.size()-1)
          .forEach(System.out::println);
                
                /*
                skip(n) se utiliza para omitir los primeros elementos de un flujo. 
                Es un método intermedio que no produce ningún resultado hasta que se combina con otro método terminal.
                no debe confundirse con limit. 
                skip(n): Omite los primeros n elementos del flujo.
                limit(n): Devuelve un flujo que contiene solo los primeros n elementos.
                */
               
        
        //Ejercicio2
        //Creamos 4 personas y las insertamos en una colección sin duplicados
        /*
        Realizamos las siguientes operaciones utilizando la Api Stream de Java:
•	Listamos todas las personas
•	Ordenamos por dni.
•	Ordenamos por apellidos.
•	Ordenamos por nombre
•	Listamos solo las personas con la letra A en el DNI.
•	Contamos las personas
•	Listamos el nombre en mayúsculas y el apellido en minúsculas.

        */
         Persona p1= new Persona("Isabel","Gutierrez Felix","72131019Y");
         Persona p2= new Persona("Luis","Rodriguez Alvarez","13933428M");
         Persona p3= new Persona("Maria","Jimenez Ruiz","13911593C");
         Persona p4= new Persona("Lucia","Alvarez Ruiz","13914517T");
         Set<Persona> personas = new HashSet<>();
         personas.add(p1);
         personas.add(p2);
         personas.add(p3);
         personas.add(p4);
         
        // 
        System.out.println("\n Listar todas las personas");
        personas.stream()
                .forEach(System.out::println);
        
        // 
        System.out.println("\n Listar todas las personas Ordenamos por dni.");
        personas.stream()
                .sorted()
                .forEach(System.out::println); 
        // 
        System.out.println("\n Listar todas las personas Ordenamos por apellidos.");
        personas.stream()
                .sorted((a,b)->(a.getApellidos().compareTo(b.getApellidos())))
                .forEach(System.out::println); 
        // 
        System.out.println("\n Listar todas las personas Ordenamos por nombre.");
        personas.stream()
                .sorted((a,b)->(a.getNombre().compareTo(b.getNombre())))
                .forEach(System.out::println); 
        //
        System.out.println("\n Listamos solo las personas con la letra C en el DNI.");
        personas.stream()
                .filter(a->a.getDni().substring(8).toUpperCase().equals("C"))
                .forEach(System.out::println);
        //
        long contador1=personas.stream()
                .count();
        System.out.println("\nContamos los personas " +contador1); 
        //
        System.out.println("\nListamos el nombre en mayúsculas y el apellido en minúsculas.");
        personas.stream()
                .forEach(a-> System.out.println("Nombre "+a.getNombre().toUpperCase()+" Apellido "+a.getApellidos().toLowerCase()));
    }
}
