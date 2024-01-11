/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Letra {

    private int numLetra;
    private String titular;
    private float importe;
    private LocalDate fechaVencimiento;

    public Letra() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de letra: ");
        this.numLetra = teclado.nextInt();
        System.out.println("Introduce el titular: ");
        this.titular = new Scanner(System.in).nextLine();
        System.out.println("Introduce el importe: ");
        this.importe = teclado.nextFloat();
        System.out.println("Introduce la fecha en formato dd-mm-yyyy: ");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaVencimiento = LocalDate.parse(new Scanner(System.in).nextLine(), f);
    }

    //Método que devuelve un boolean para saber si una letra está vencida
    public boolean vencida() {
        return fechaVencimiento.isBefore(LocalDate.now());
    }

    //Metodo que demora el vencimiento hasta n diás
    public void demora(int dias) {
        if (dias > 0) {
            this.fechaVencimiento.plusDays(dias);
        } else {
            System.out.println("Error, no puedes demorar dias negativos");
            this.fechaVencimiento.plusDays(0);
        }
    }

    //Método que devuelve un int para avergüar los dias que faltan
    public int diasFaltan() {
        int diasFaltan = Period.between(fechaVencimiento, LocalDate.now()).getDays();
        if (diasFaltan < 0) {
            diasFaltan = 0;
        }
        return diasFaltan;
    }

    //Método que muestra los datos de una letra
    public void mostrar() {
        String vencida = vencida() ? "Sí" : "No";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.printf("\n---DATOS DE LA LETRA--- \n\tNúmero de letra: %d "
                + "\n\tTitular: %s \n\tImporte: %.2f \n\tVencida: %s \n\tFecha de Vencimiento: %s", numLetra, getTitular(), importe, vencida, this.fechaVencimiento.format(f));
    }
//Metdodo que devuelve el titular

    public String getTitular() {
        return titular;
    }

}
