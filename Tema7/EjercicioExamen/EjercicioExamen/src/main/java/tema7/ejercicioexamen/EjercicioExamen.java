/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema7.ejercicioexamen;

import java.io.File;

/**
 *
 * @author DAW125
 */
public class EjercicioExamen {

    public static void main(String[] args) {
        File fichero=new File(args[0]);
        MetodosFichero.crearFicheroDatos(fichero);
    }
}
