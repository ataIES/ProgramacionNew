/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float temperatura = 0;

        System.out.println("Introduce la temperatura: ");
        temperatura=teclado.nextFloat();
        
        Alarma alarma1 = new Alarma(temperatura);
        System.out.println("ALARMA ANTES DE COMPROBAR");
        alarma1.mostrarAlarma();
        alarma1.comprueba();
        System.out.println("ALARMA DESPUÉS DE COMPROBAR");
        alarma1.mostrarAlarma();
        
        controlar(alarma1);
        System.out.println("ALARMA DESPUÉS DE CONTROLAR");
        alarma1.mostrarAlarma();
    }
    public static void controlar(Alarma alarma){
         if(alarma.getTimbre()==Timbre.ENCENDIDO){
            alarma.normaliza();
        }else{
            System.out.println("La alarma ya está apagada");
        }
    }
}
