package ejemplos.ejemplo1interfaces;

/**
 *
 * @author cic
 */
public class Clase implements GrupoInterfaces {

    @Override
    public void hagoAlgo(int y) {
        System.out.println("Hago Algo con " + x + " " + y);
    }

    @Override
    public void hagoAlgoMas(String s) {
        System.out.println("Hago algo mas: " + s);
    }

    @Override
    public void imprime() {
        System.out.println("Imprimo");
    }

    @Override
    public void mostrar() {
        System.out.println("Muestro");
    }

    public void metodoDeClase() {
        System.out.println("Es un método de la clase");
    }
}
