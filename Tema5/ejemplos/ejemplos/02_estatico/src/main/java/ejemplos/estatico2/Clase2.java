package ejemplos.estatico2;

/**
 *
 * @author cic
 */
public class Clase2 implements Interfaz {

    @Override
    public void metodo() {
        System.out.println("Otro método en Clase2");
    }

    @Override
    public void metodoPorDefecto() {
        System.out.println("Mi propia implementación del método por defecto");
    }
}
