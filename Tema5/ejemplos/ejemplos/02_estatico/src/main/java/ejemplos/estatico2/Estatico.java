/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.estatico2;

/**
 *
 * @author cic
 */
public class Estatico {

    public static void main(String[] args) {
         Clase c1 = new Clase();

        c1.metodo();
        c1.metodoPorDefecto();

        Clase2 c2 = new Clase2();

        c2.metodo();
        c2.metodoPorDefecto();

        Interfaz.metodoEstatico();
    }
}
