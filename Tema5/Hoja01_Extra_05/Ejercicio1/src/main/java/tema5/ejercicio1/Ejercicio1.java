/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema5.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Trabajos t = new Trabajos(4);
        Pintura pintura1 = new Pintura(50, 20.54, "Adrian Tresgallo", LocalDate.parse("2001-12-12"), "Carlos Martinez");
        Pintura pintura2 = new Pintura(29, 120.54, "Juan Pérez", LocalDate.parse("2010-06-20"), "Carlos Martinez");
        Alarma alarma1 = new Alarma(12, LocalDate.parse("2012-05-20"), "Maria Gutierrez");
        Alarma alarma2 = new Alarma(20, LocalDate.parse("2020-03-10"), "Gustavo Ruiz");
        Pintura pintura3 = new Pintura(50, 20.54, "Adrian Tresgallo", LocalDate.parse("2001-12-12"), "Carlos Martinez");
        
        System.out.println("---Inserto pintura1---");
        insertar(pintura1);
        System.out.println("---Insertar alarma1---");
        insertar(alarma1);
        System.out.println("---Insertar pintura2---");
        insertar(pintura2);
        System.out.println("---Insertar alarma2---");
        insertar(alarma2);
        System.out.println("---Insertar pintura3---");
        insertar(pintura3);
        System.out.println("---Mostrar todos los trabajos---");
        Trabajos.mostrarTrabajos();
        
    }

    public static void insertar(Servicio s) {
        if (Trabajos.insertarTrabajos(s)) {
            System.out.println("Trabajo insertado correctamente");
        } else {
            System.out.println("Error, límite máximo alcanzado");
        }
    }
}
