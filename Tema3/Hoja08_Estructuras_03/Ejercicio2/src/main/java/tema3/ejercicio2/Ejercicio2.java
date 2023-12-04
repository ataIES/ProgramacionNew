/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int dia = 0, mes = 0, anio = 0;
        dia = validarDia("Introduce el dia: ");
        mes = validarMes();
        anio = validarAnio();
        validarFecha(dia, mes, anio);

    }
//Metodo para validar el dia entre 1 y 31
    public static int validarDia(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        int dia = 0;
        do {
            System.out.println(mensaje);
            dia = teclado.nextInt();
            if (dia > 0 && dia <= 31) {
                valido = true;
            } else {
                System.out.println("Error, el dia debe ser entre 1 y 31");
            }
        } while (!valido);
        return dia;
    }
//Método para validar el mes entre 1 y 12
    public static int validarMes() {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        int mes = 0;
        do {
            System.out.println("Introduce el mes: ");
            mes = teclado.nextInt();
            if (mes > 0 && mes <= 12) {
                valido = true;
            } else {
                System.out.println("Error, el mes debe ser entre 1 y 12");
            }
        } while (!valido);
        return mes;
    }
//Método para validar el anio entre 1 y 3000
    public static int validarAnio() {
        Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        int anio = 0;
        do {
            System.out.println("Introduce el anio: ");
            anio = teclado.nextInt();
            if (anio>0 && anio<3000) {
                valido = true;
            } else {
                System.out.println("Error, el año debe ser entre 1 y 3000");
            }
        } while (!valido);
        return anio;
    }
//Método para mostrar los meses
    public static String mes(int mes) {
        String nombreMes = "";
        switch (mes) {
            case 1 ->
                nombreMes = "Enero";
            case 2 ->
                nombreMes = "Febrero";
            case 3 ->
                nombreMes = "Marzo";
            case 4 ->
                nombreMes = "Abril";
            case 5 ->
                nombreMes = "Mayo";
            case 6 ->
                nombreMes = "Junio";
            case 7 ->
                nombreMes = "Julio";
            case 8 ->
                nombreMes = "Agosto";
            case 9 ->
                nombreMes = "Septiembre";
            case 10 ->
                nombreMes = "Octubre";
            case 11 ->
                nombreMes = "Noviembre";
            case 12 ->
                nombreMes = "Diciembre";
        }
        return nombreMes;
    }
/* Método que valida la fecha introducida, los meses pares, son los meses que son de 30 días, pudiendo luego cambiar a un dia correcto
    Tenemos otra condición única para febrero que sería dias hasta 28
    */
    
    public static void validarFecha(int dia, int mes, int anio) {
        boolean valido = false;
            if (mes==4 && mes==6 & mes==9 && mes==11) {
                if (dia <= 31) {
                    System.out.println("Error, el mes de " + mes(mes) + " tiene 30 días");
                    dia=validarDia("Introduce el dia entre 1 y 30");
                }
            } else if (mes == 2) {
                System.out.println("Error, el mes de " + mes(mes) + " tiene 28 días");
                dia=validarDia("Introduce el dia entre 1 y 28");
            }else{
                System.out.println("Fecha correcta");
            }
            System.out.println(dia+" de "+mes(mes)+" del "+anio);
        
    }
}
