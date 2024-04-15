/*
 * Ejemplo 1
 */
package bd.ejemplo01;

import java.sql.Connection;

/**
 *
 * @author pe
 */
public class Ejemplo01 {

    public static void main(String[] args) {

        FuncionesBD.crearTablas();
        FuncionesBD.insertarDatos();
        // utilizar la otra opcion de insertar
        FuncionesBD.insertarDatos2();
        FuncionesBD.mostrarDatos();
        // mostar datos con la otra opcion
        System.out.println("Mostramos de nuevo la información");
        FuncionesBD.mostrarDatos2();

        if (AccesoBaseDatos.getInstance().cerrar()) {
            System.out.println("BD cerrada");
        } else {
            System.out.println("BD no cerrada");
        }
    }
}
