
package ejemplos.herenciaVehiculo;

/**
 *
 * @author cic
 */
public class Vehiculo {
    protected double velocidad;

    public Vehiculo() {
    }
    
    public Vehiculo(double kmh){
        velocidad=kmh;
    }
    public void acelerar(double kmh){
        velocidad=velocidad+kmh;
    }
}
