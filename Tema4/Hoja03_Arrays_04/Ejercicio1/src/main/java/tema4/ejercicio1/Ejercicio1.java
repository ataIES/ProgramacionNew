/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Triatlon t1=new Triatlon();
        System.out.println(t1.mostrar());
        String cadena=t1.esSeleccionado()?"Sí":"No";
        System.out.println("¿Puntuación superior a 10 en alguna prueba? "+cadena);
    }
}
