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
        int hora = 0, minuto = 0, segundo = 0;
        int hora1 = 0, minuto1 = 0, segundo1 = 0;
        System.out.println("---Introdución de datos de la primera hora---");
        hora = Validacion.validarHora();
        minuto = Validacion.validarMinuto();
        segundo = Validacion.validarSegundos();
        HoraExacta horaExacta1 = new HoraExacta(hora, minuto, segundo);

        System.out.println("---Introdución de datos de la segunda hora---");
        hora1 = Validacion.validarHora();
        minuto1 = Validacion.validarMinuto();
        segundo1 = Validacion.validarSegundos();
        HoraExacta horaExacta2 = new HoraExacta(hora1, minuto1, segundo1);

        System.out.println("---Mostrar hora1---");
        System.out.println(horaExacta1.toString());
        System.out.println("---Mostrar hora2---");
        System.out.println(horaExacta2.toString());
        /*
        System.out.println("---Comprobar si se ha modificado los minutos---");
        System.out.println(setMinutos(horaExacta1));
        System.out.println(horaExacta1.toString());
        
        System.out.println("---Comprobar si se ha modificado la hora---");
        System.out.println(setHora(horaExacta1));
        System.out.println(horaExacta1.toString());
        System.out.println("---Comprobar si se ha modificado los segundos---");
        System.out.println(setSegundo(horaExacta1));
        
        System.out.println("---Vuelvo a mostrar la hora---");
        System.out.println(horaExacta1.toString());
        
        System.out.println("---Incrementar en un minuto---");
        horaExacta1.inc();
        
        System.out.println("---Mostrar después de incrementar---");
        System.out.println(horaExacta1.toString());
*/
        System.out.println("---Comprobar si hora1 y hora2 son iguales--");
       compararHoras(horaExacta1,horaExacta2);
    }

    //Metodo que muestra un mensaje si se ha modificado o no los minutos
    public static String setMinutos(Hora h) {
        System.out.println("Introduce los nuevos minutos: ");
        int nMinutos = new Scanner(System.in).nextInt();
        return h.setMinutos(nMinutos) ? "Se ha modificado los minutos" : "No se ha modificado los minutos";
    }

    //Metodo que muestra un mensaje si se ha modificado o no la hora
    public static String setHora(Hora h) {
        System.out.println("Introduce la nueva hora: ");
        int nHora = new Scanner(System.in).nextInt();
        return h.setHora(nHora) ? "Se ha modificado la hora" : "No se ha modificado la hora";
    }
    
     public static String setSegundo(HoraExacta h) {
        System.out.println("Introduce los nuevos segundos: ");
        int nSegundo = new Scanner(System.in).nextInt();
        return h.setSegundos(nSegundo) ? "Se ha modificado los segundos" : "No se ha modificado los segundos";
    }
     public static void compararHoras(HoraExacta h1,HoraExacta h2){
         if(h1.equals(h2)){
             System.out.println("Son iguales");
         }else{
             System.out.println("No son iguales");
         }
     }
}
