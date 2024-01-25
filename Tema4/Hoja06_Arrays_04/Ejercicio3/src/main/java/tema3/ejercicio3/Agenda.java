/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Agenda {

    private Persona[] agenda;
    private int contPersonas;

    public Agenda(int nPersonas) {
        this.agenda = new Persona[nPersonas];
        this.contPersonas = 0;
    }

    public void insertar(Persona p) {
        if (contPersonas < agenda.length) {
            agenda[contPersonas] = p;
            contPersonas++;
            System.out.println(p.getNombre() + " Añadido correctamente");
        } else {
            System.out.println("Error, número máximo de personas alcanzado");
        }
    }

    public void mostrar() {
        for (int i = 0; i < contPersonas; i++) {
            System.out.println(agenda[i].toString());
        }
    }

    public String buscar(String nombre) {
        String cadena = "";
        boolean encontrado = false;
        for (int i = 0; i < contPersonas && !encontrado; i++) {
            if (agenda[i].getNombre().equalsIgnoreCase(nombre)) {
                cadena += agenda[i].toString() + "\n";
                encontrado = true;
            } else {
                cadena = "Error, no se encuentra a " + nombre + " en la agenda";
            }
        }
        return cadena;
    }

    public void modificar(String nombre) {
        Scanner teclado = new Scanner(System.in);
        String opc = "";
        boolean encontrado = false;
        for (int i = 0; i < contPersonas && !encontrado; i++) {
            if (agenda[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(nombre + " encontrado, con teléfono " + agenda[i].getTelefono()
                        + " ¿Quieres cambiar de teléfono?:");
                opc = new Scanner(System.in).nextLine();
                if (opc.equalsIgnoreCase("Si")) {
                    System.out.println("Introduce el nuevo número de teléfono: ");
                    agenda[i].setTelefono(teclado.nextInt());
                    System.out.println("Número modificado");
                    encontrado=true;
                } else if (opc.equalsIgnoreCase("No")) {
                    System.out.println("No se modificará el teléfono");
                    encontrado=true;
                }
            } else {
                System.out.println("Error, no existe " + nombre + " en la agenda");
            }
        }
    }

    public int getContPersonas() {
        return contPersonas;
    }
    

}
