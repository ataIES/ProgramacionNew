/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema6.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int opc = 0;
        Agenda agenda1 = new Agenda();
        do {
            menu();
            opc = new Scanner(System.in).nextInt();
            switch (opc) {
                case 1 -> {
                    Persona p = new Persona();
                    agenda1.insertarPersona(p);
                }
                case 2 -> {
                    System.out.println("Introduce un dni a buscar: ");
                    String dni = new Scanner(System.in).nextLine();
                    agenda1.eliminarPersona(dni);
                }
                case 3 ->
                    System.out.println(agenda1.mostrarAgenda());

                case 4 -> {
                    System.out.println("Introduce un dni a buscar: ");
                    String dni = new Scanner(System.in).nextLine();

                    agenda1.mostrarPersonaPorDni(dni);
                }
                case 5 -> {
                    System.out.println("Introduce un dni a modificar: ");
                    String dni = new Scanner(System.in).nextLine();
                    agenda1.modificarPersona(dni);
                }
                case 6 ->
                    System.out.println("Hasta Luego!!!");

                default ->
                    System.out.println("Error, opción incorrecta");
            }
        } while (opc != 6);

    }

    public static void menu() {

        System.out.println(" ---MENÚ DE LA AGENDA---");
        System.out.println(" \t1.Insertar contactos");
        System.out.println("\t2.Borrar una persona por dni");
        System.out.println("\t3.Mostrar agenda ");
        System.out.println("\t4.Buscar una persona por dni");
        System.out.println("\t5.Modificar los datos de una persona");
        System.out.println("\t6.Salir");
        System.out.print("\tIntroduce una opción: ");
    }
}
