package ejemplos.ejemploequalsycomparable;

/**
 *
 * @author cic
 */
public class EjemploEqualsYComparable {

    public static void main(String[] args) {
        /*Creamos cuatro personas
        Visualizamos el array
        Lo ordenamos por nombre
        Lo ordenamos por id
        Creamos otra persona y la buscamos.*/

        Persona p1 = new Persona(3, "Nuria", "Gomez");
        Persona p2 = new Persona(1, "Pepe", "Garcia");
        Persona p3 = new Persona(2, "Pepe", "Rodriguez");
        Persona p4 = new Persona(4, "Maria", "Salas");

        ListaPersona lista = new ListaPersona();

        System.out.println("Inserto datos");
        lista.insertar(p1);
        lista.insertar(p2);
        lista.insertar(p3);
        lista.insertar(p4);

        System.out.println("Visualizar");
        lista.mostrar();

        System.out.println("Ordeno");
        lista.ordenar();
        lista.mostrar();

        //Ejemplo del equals
        Persona p5 = new Persona(1, "Pepe", "Garcia");
        lista.buscar(p5);
    }
}
