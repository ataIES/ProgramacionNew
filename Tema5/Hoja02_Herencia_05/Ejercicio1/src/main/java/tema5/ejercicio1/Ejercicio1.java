/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Empleado e1=new Empleado("Adrian","Tresgallo",1200.50);
        Encargado encargado1=new Encargado("Juan","Rivero",1300.65);
        System.out.println(e1.mostrarEmpleado());
        System.out.println("");
        System.out.println(encargado1.mostrarEmpleado());
    }
}
