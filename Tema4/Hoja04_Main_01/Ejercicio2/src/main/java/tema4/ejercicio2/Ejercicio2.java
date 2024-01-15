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
        int aux = args.length;
        if (aux > 0) {
            Persona persona1 = new Persona(args[0], Integer.parseInt(args[1]));
            persona1.imprimir();
            String mensaje = persona1.esMayorEdad() ? "Es mayor de edad" : "No es mayor de edad";
            System.out.println(mensaje);
        }
    }
}
