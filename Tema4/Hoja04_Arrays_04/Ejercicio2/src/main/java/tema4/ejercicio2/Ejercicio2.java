/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio2;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Tabla tabla=new Tabla();
        tabla.mostrar();
        System.out.println("Mayor de la fila 1 es: "+tabla.mayorF(1));
        System.out.println("Mayor de la columna 2 es: "+tabla.mayorC(2));
        System.out.println("La media es: "+tabla.media());
        
    }
}
