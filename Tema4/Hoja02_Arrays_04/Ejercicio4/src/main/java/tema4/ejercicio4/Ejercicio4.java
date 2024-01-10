/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejercicio4;

/**
 *
 * @author DAW125
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       Alumno alumno=new Alumno("Adrian");
        System.out.println("Nota más alta: "+alumno.mayor());
        System.out.println("Nota más baja: "+alumno.menor());
        System.out.println("Lista de notas: "+alumno.mostrar());
    }
}
