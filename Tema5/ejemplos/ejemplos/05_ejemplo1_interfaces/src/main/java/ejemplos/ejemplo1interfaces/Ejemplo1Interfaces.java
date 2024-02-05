package ejemplos.ejemplo1interfaces;

/**
 *
 * @author cic
 */
public class Ejemplo1Interfaces {

    public static void main(String[] args) {
        Clase c = new Clase();
        c.hagoAlgo(55);
        c.hagoAlgoMas("Hola");
        c.imprime();
        c.mostrar();
        c.metodoDeClase();

        //defino una variable de Interface y guardo el objeto c en esa variable
        Interface1 inter = c;
        inter.imprime();
        //Solo me deja llamar al método de esa interface

        if (inter instanceof Clase) {
            Clase aux = (Clase) inter;
            System.out.println("inter guarda un objeto de clase");
            aux.imprime();
        }

        // otra forma de realizar el instance
        if (inter instanceof Clase aux) {
            System.out.println("Otra forma del instance - inter guarda un objeto de clase");
            aux.imprime();
        }

    }
}
