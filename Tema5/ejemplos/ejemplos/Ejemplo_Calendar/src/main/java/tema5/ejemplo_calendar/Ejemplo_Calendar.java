/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5.ejemplo_calendar;

import java.util.Calendar;

/**
 *
 * @author DAW125
 */
public class Ejemplo_Calendar {

    public static void main(String[] args) {
        //uso de calendar-> es abstracta
        Calendar hoy=Calendar.getInstance();
        System.out.println("Hoy es "+hoy);
        
        //de manera más legible
        System.out.println("Hoy es -pero un poco más claro- "+hoy.getTime());
        
        //algunos detalles
        System.out.println("Vivimos en el año: "+hoy.get(Calendar.YEAR));
        System.out.println("Vivimos en el mes: "+hoy.get(Calendar.MONTH));
        System.out.println("Vivimos en el dia: "+hoy.get(Calendar.DATE));
        
        //otro caso
        Calendar fecha1=Calendar.getInstance();
        fecha1.set(2024, 6, 7);
        System.out.println("Ese día será: "+fecha1.getTime());
        
        //otra manera más
        Calendar ponerDia=Calendar.getInstance();
        ponerDia.set(Calendar.YEAR, 2024);
        ponerDia.set(Calendar.MONTH, 3);
        ponerDia.set(Calendar.DATE, 23);
        System.out.println("El día de referencia es: "+ponerDia.getTime());
    }
}
