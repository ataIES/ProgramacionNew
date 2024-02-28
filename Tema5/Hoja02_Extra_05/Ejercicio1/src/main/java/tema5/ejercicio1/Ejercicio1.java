/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int hora=0, minuto=0;
        hora=Validacion.validarHora();
        minuto=Validacion.validarMinuto();
        Hora hora1=new Hora(hora,minuto);
        System.out.println("---Mostrar hora---");
        System.out.println(hora1.toString());
        System.out.println("---Comprobar si se ha modificado los minutos---");
        System.out.println(setMinutos(hora1));
        System.out.println("---Vuelvo a mostrar la hora---");
        System.out.println(hora1.toString());
        
    }
    public static String setMinutos(Hora h){
        System.out.println("Introduce los nuevos minutos: ");
        int nMinutos=new Scanner(System.in).nextInt();
        return h.setMinutos(nMinutos)?"Se ha modificado los minutos":"No se ha modificado los minutos";
    }
}
