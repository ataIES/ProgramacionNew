
package ejemplos.estatico2;

/**
 *
 * @author cic
 */
public interface Interfaz {
    
    public void metodo();
    
    default public void metodoPorDefecto(){
        System.out.println("Es un método por defecto");
    }
    
    public static void metodoEstatico(){
        System.out.println("Es un método estático");
    }
}
