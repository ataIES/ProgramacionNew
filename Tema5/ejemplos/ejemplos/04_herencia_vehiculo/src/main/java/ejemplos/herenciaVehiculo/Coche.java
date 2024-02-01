package ejemplos.herenciaVehiculo;

/**
 *
 * @author cic
 */
public class Coche extends Vehiculo {

    private int gasolina;

    public Coche() {
    }

    public Coche(int kmh, int g) {
        super(kmh);
        gasolina = g;

    }

    @Override
    public void acelerar(double kmh) {
        super.acelerar(kmh);
        gasolina = (int) (gasolina * 0.9);
    }
}
