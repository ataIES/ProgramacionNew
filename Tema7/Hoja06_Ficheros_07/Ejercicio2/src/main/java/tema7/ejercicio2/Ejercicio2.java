/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema7.ejercicio2;

import java.io.File;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File fichero = new File("agenda.dat");
        int opc = 0;
        do {
            menu();
            opc = new Scanner(System.in).nextInt();
            switch (opc) {
                case 1 -> {
                    Agenda a = crearAgenda();
                    Fichero.aniadirFichero(fichero, a);
                }

                case 2 ->
                    Fichero.leerFichero(fichero);

                case 3 -> {
                    String nombre = Teclado.introNombre("Introduce el nombre a buscar: ");
                    List<Agenda> lista = Fichero.aniadirLista(fichero);
                    Fichero.buscarEnAgenda(lista, nombre);
                }

                case 4 -> {

                }
            }
        } while (opc != 6);

    }

    public static void menu() {
        System.out.printf("\n\t---Menú de Opciones Agenda---"
                + "\n1.Añadir entrada"
                + "\n2.Listar entradas a la agenda"
                + "\n3.Buscar en la agenda"
                + "\n4.Borrar entrada en la agenda"
                + "\n5.Borrar fichero "
                + "\n6.Salir"
                + "\nIntroduce una opción: ");
    }

    private static Agenda crearAgenda() {
        String nombre = Teclado.introNombre("Introduce el nombre: ");
        int tlf = Integer.parseInt(Teclado.introTelefono("Introduce el telefono: "));
        String direccion = Teclado.introDireccion("Introduce su dirección: ");
        int codigoPostal = Integer.parseInt(Teclado.introCodigoPostal("Introduce el código postal_ "));

        return new Agenda(nombre, tlf, direccion, codigoPostal);
    }

}
