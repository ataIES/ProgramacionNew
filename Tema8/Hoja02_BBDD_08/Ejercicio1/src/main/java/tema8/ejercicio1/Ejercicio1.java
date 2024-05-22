/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema8.ejercicio1;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        do {
            menu();
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> {
                    try {
                        String dni = Teclado.introDNI("Introduce el dni: ");
                        Paciente nuevo = MetodosDB.buscarPorDNI(dni);
                        if (nuevo != null) {
                            throw new Exception("Error, ya existe un paciente con dni: " + dni);
                        } else {
                            MetodosDB.insertarPaciente(dni);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    String dni = Teclado.introDNI("Introduce el dni del paciente para la visita: ");
                    Paciente p = MetodosDB.buscarPorDNI(dni);
                    try {
                        if (p != null) {
                            MetodosDB.insertarVisita(dni);
                        } else {
                            throw new NullPointerException("Error, no existe el paciente con dni " + dni);
                        }
                    } catch (NullPointerException n) {
                        System.out.println(n.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        LocalDate fecha = Teclado.introFecha();
                        List<Visita> listaVisita = MetodosDB.listarVisitaPorFecha(fecha);
                        if (!listaVisita.isEmpty()) {
                            for (Visita v : listaVisita) {
                                System.out.println(v.toString());
                            }
                        } else {
                            throw new NullPointerException("Error, no existe ninguna visita");
                        }
                    }catch(NullPointerException n){
                        System.out.println(n.getMessage());
                    }
                }
                case 4->{
                    try{
                        String dni=Teclado.introDNI("Introduce el dni del paciente: ");
                        List<Visita>lista=MetodosDB.listarVisitasPaciente(dni);
                        if(!lista.isEmpty()){
                            for(Visita v: lista){
                                System.out.println(v.toString());
                            }
                        }else{
                            throw new NullPointerException("Error, no existe ni guna visita para el paciente con dni: "+dni);
                        }
                    }catch(NullPointerException n){
                        System.out.println(n.getMessage());
                    }
                }
            }
        } while (opc != 5);
    }

    public static void menu() {
        System.out.printf("\n\t---MENU DENTISTA---"
                + "\n\t1.Insertar Paciente"
                + "\n\t2.Crear Visita"
                + "\n\t3.Mostrar agenda de un dia específico"
                + "\n\t4.Visitas de un cliente"
                + "\n\t5.Salir"
                + "\n\tIntroduce una opcion: ");
    }
}
