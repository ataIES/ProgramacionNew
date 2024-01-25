/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema3.ejercicio3;

/**
 *
 * @author atres
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Agenda a=new Agenda(2);
        Persona p1=new Persona("Adrian",654321345);
        Persona p2= new Persona("Juan",987004433);
        Persona p3=new Persona("María",111234566);
        System.out.println("---INSERTANDO DATOS---");
        a.insertar(p1);
        a.insertar(p3);
        a.insertar(p2);
        System.out.println(" ");
        System.out.println("---MOSTRAR AGENDA---");
        a.mostrar();
        System.out.println("Numero de contactos: "+a.getContPersonas());
        System.out.println("");
        System.out.println("--BUSCAR A ADRIAN---");
        System.out.println(a.buscar("Adrian"));
        System.out.println("---BUSCAR A MANUEL---");
        System.out.println(a.buscar("Manuel"));
        System.out.println("---MODIFICAR EL TELÉFONO A ADRIAN---");
        a.modificar("Adrian");
        System.out.println("");
        System.out.println(a.buscar("Adrian"));
    }
}
