package ejemplos.ejemploobject;

/**
 *
 * @author cic
 */
public class EjemploObject {

    public static void main(String[] args) {
        //prueba de un método estático con argumento de tipo Object
        Clase.metodo(3);
        Clase.metodo(new String("Hola caracola"));
        Clase.metodo(args);
        //prueba del equals sin implementar e implementado
        Clase c1 = new Clase("Renault", "Megane", "1234abc");
        Clase c2 = c1;

        if (c1 == c2) {
            System.out.println("Son iguales");
        }

        if (c1.equals(c2)) {
            System.out.println("Son iguales");
        }
        c2 = new Clase("Renault", "Megane", "1234abc");
        if (c1 == c2) {
            System.out.println("Son iguales");
        }

        if (c1.equals(c2)) {
            System.out.println("Son iguales");
        }

        //prueba del compareTo implementando la interfa Comparable
    }
}
