/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examentema3.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int caramelos = -1, caramelosVendidos = 0, envoltorios = 0, caramelosRegalados = 0;
        String rentable = "";
        //Bucle para ir sumando los caramelos vendidos hasta introducir 0
        while (caramelos != 0) {
            System.out.println("Introduce los caramelos vendidos: 0 para acabar");
            caramelos = teclado.nextInt();
            caramelosVendidos += caramelos;
        }
        //Caramelos regalados es igual al cociente de los vendidos/5
        caramelosRegalados = caramelosVendidos / 5;
        //Los envoltorios es el resto de vendidos/5
        envoltorios = caramelosVendidos % 5;
        //La condición de que sea rentable el resto de la división de  la suma de regalados y envolto /5 tiene que ser 0
        rentable = (caramelosRegalados + envoltorios) % 5 == 0 ? "Es rentable" : "No es rentable";
        System.out.println("\nCaramelos vendidos: " + caramelosVendidos + " \nCaramelos regalados: " + caramelosRegalados + "\nEnvoltorios: " + envoltorios + "\n" + rentable);

    }
}
