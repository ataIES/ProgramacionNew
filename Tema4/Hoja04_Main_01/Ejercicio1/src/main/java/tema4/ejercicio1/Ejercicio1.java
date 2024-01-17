/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {
//Averigüar si un número pasado por argumentos es armstrong

    public static void main(String[] args) {
        if (args.length == 1) {
            int numeroDigitos = args[0].length();
            int num = Integer.parseInt(args[0]);
            int primerDig = num / 100;
            int segundoDig = (num / 10) % 10;
            int tercerDig = num % 10;
            if (args[0].length() == 3) {
                int armstrong = (int) (Math.pow(primerDig, numeroDigitos) + Math.pow(segundoDig, numeroDigitos) + Math.pow(tercerDig, numeroDigitos));
                if (armstrong == num) {
                    System.out.println("Es un número Armstrong");
                } else {
                    System.out.println("No es un número Armstrong");
                }
            } else {
                System.out.println("El argumento no tiene 3 cifras");
            }
        } else {
            System.out.println("No hay ningún argumento");
        }
    }
}
