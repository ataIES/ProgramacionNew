/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema5.ejercicio3;

import java.time.LocalDate;

/**
 *
 * @author atres
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Agenda agenda=new Agenda(4);
        Contacto c1=new Contacto("Adrian","Tresgallo Arozamena",628616766,LocalDate.parse("2001-11-06"));
        Contacto c2=new Contacto("María","Gomez Gomez",654123211,LocalDate.parse("2002-12-12"));
        Contacto c3= new Contacto("Juan","Garcia Lopez",666788899,LocalDate.parse("2000-02-21"));
        Contacto c4= new Contacto("Lucas","Perez Torres",722321122,LocalDate.parse("2005-04-04"));
        Contacto c5= new Contacto("Pedro","CantaLaPiedra Suarez",722345678,LocalDate.parse("2010-03-03"));
        System.out.println("---Añadir contactos---");
        agenda.insertar(c1);
        agenda.insertar(c2);
        agenda.insertar(c3);
        agenda.insertar(c4);
        agenda.insertar(c5);
        
        System.out.println("---Mostrar agenda---");
        System.out.println(agenda.toString());
        System.out.println("---Buscar contacto con el nombre Juan---");
        agenda.buscar("Juan");
        System.out.println("---Eliminar a Lucas---");
        agenda.eliminar("Lucas");
        System.out.println(agenda.toString());
        System.out.println("---Agenda ordenada alfabeticamente---");
        agenda.ordenar();
        System.out.println(agenda.toString());
    }
}
