/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        AparatoElectrico bombilla = new AparatoElectrico(150);
        AparatoElectrico plancha = new AparatoElectrico(2000);

        System.out.println("---Imprimir el consumo total nada más crearlos---");
        System.out.printf("Consumo total: %.2f w\n", AparatoElectrico.getConsumoTotal());
        System.out.println("");
        
        System.out.println("---Enciende la bombilla--");
        bombilla.enciende();
        System.out.println(bombilla.toString());
        System.out.println("---Enciende la plancha---");
        plancha.enciende();
        System.out.println(plancha.toString());
        System.out.printf("Consumo total: %.2f w\n", AparatoElectrico.getConsumoTotal());
        System.out.println("");
        
        System.out.println("---Apago Bombilla---");
        bombilla.apaga();
        System.out.println(bombilla.toString());
        System.out.printf("Consumo total: %.2f w\n", AparatoElectrico.getConsumoTotal());
        System.out.println("---Apago Plancha---");
        plancha.apaga();
        System.out.printf("Consumo total: %.2f w\n",AparatoElectrico.getConsumoTotal());
    }
}
