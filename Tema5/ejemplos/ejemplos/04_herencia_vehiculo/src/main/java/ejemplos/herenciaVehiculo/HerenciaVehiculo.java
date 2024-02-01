/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.herenciaVehiculo;

/**
 *
 * @author cic
 */
public class HerenciaVehiculo {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Coche cocheDePepe = new Coche();
        v1 = cocheDePepe;     //Esto sí se permite
//        cocheDePepe=v1;    //ERROR Tipos incompatibles
        cocheDePepe = (Coche) v1;    //Ahora sí se permite, pero sólo porque realmente es un coche 

        if (v1 instanceof Vehiculo) {
            System.out.println("v1 es un Vehiculo");
        }
        if (v1 instanceof Coche) {
            System.out.println("v1 es un Coche");
        }
        if (cocheDePepe instanceof Vehiculo) {
            System.out.println("cocheDePepe es un Vehiculo");
        }
        if (cocheDePepe instanceof Coche) {
            System.out.println("cocheDePepe es un Coche");
        }
        //si quisiéramos probar con otra clase, Camión por ejemplo, deberemos tener el archivo correspondiente.
    }
}
