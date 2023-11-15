/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int a, b, c, d, e, n, anio;
        anio = validarAnio("Introduce un año comprendido entre 2016 y 2030");

        a = anio % 19;
        b = anio % 4;
        c = anio % 7;
        d = (19 * a + 24) % 30;
        e = (2 * b + 4 * c + 6 * d + 5) % 7;
        n = (22 + d + e);
        
        if(n<=31){
            System.out.printf("%d de Marzo",n);
        }else{
            System.out.printf("%d de Abril",(n-31));
        }
    }

    public static int validarAnio(String texto) {
        Scanner teclado = new Scanner(System.in);
        int anio = 0;
        boolean valido = false;
        do {
            System.out.println(texto);
            anio = teclado.nextInt();
            if (anio > 0) {
                if (anio >= 2016 && anio <= 2030) {
                    valido = true;
                } else {
                    System.out.println("Error, has introducido un año fuera del rango (2016-2030)");
                }
            } else {
                System.out.println("Error, has introducido un año negativo");
            }
        } while (!valido);
        return anio;
    }
}
