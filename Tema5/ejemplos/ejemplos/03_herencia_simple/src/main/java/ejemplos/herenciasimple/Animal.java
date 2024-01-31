
package ejemplos.herenciasimple;

/**
 *
 * @author cic
 */
public class Animal {
    private String nombre;
    private String especie;
    private int tamanio;

    public Animal(String nombre, String especie, int tamanio) {
        this.nombre = nombre;
        this.especie = especie;
        this.tamanio = tamanio;
    }

    public void comer(){
        System.out.println("Como como un animal");
    }
    
    public void respirar(){
        System.out.println("Respiro como un animal");
    }
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", especie=" + especie + ", tamanio=" + tamanio + '}';
    }
    
    
}
