/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema4.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       Invierno centigrado=new Invierno(5);
        System.out.println("Temperatura media: "+centigrado.tempMedia());
        System.out.println("Temperatura en centigrados: "+centigrado.mostrarTemperatura());
        int fahrenheit[]=centigrado.fahrenheit();
        System.out.println("Temperatura en fahrenheit: ");
        for(int i=0;i<fahrenheit.length;i++){
            System.out.print(fahrenheit[i]+" ");
        }
    }
}
