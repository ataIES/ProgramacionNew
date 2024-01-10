/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio1;

import java.time.LocalDate;
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

    public boolean vencida() {
        return LocalDate.now().isBefore(fechaVencimiento);
    }
    public void demora(int dias){
        fechaVencimiento.plusDays(dias);
    }
    public int diasFaltan(){
        int diasFaltan=0;
        if(vencida()){
            diasFaltan=0;
        }else{
            diasFaltan=
        }
        
    }

}
