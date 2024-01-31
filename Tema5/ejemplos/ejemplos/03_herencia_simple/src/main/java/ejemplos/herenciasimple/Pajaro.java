
package ejemplos.herenciasimple;

/**
 *
 * @author cic
 */
public class Pajaro extends Animal{
    private String colorPlumaje;
    private boolean anillado;

    public Pajaro(String colorPlumaje, boolean anillado, String nombre, String especie, int tamanio) {
        super(nombre, especie, tamanio);
        this.colorPlumaje = colorPlumaje;
        this.anillado = anillado;
    }

    @Override
    public void comer() {
        System.out.println("Como como un pajaro, no como un animal");
    }

    @Override
    public void respirar() {
        super.respirar(); 
    }
    
    @Override
    public String toString() {
        
        return super.toString()+" Pajaro{" + "colorPlumaje=" + colorPlumaje + ", anillado=" + anillado + '}';
    }
    
    
}
