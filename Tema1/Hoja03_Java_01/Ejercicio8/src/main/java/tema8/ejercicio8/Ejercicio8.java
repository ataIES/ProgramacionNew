/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema8.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int nEntradasInfantiles, nEntradasAdultas;
        final float INFANTILES, ADULTOS,BONO_DESCUENTO;
        float importe,importeTotal;
        //Asigno valores a las constantes
        INFANTILES=15.50f;
        ADULTOS=20f;
        BONO_DESCUENTO=0.05f;
        
        //Pido los datos por teclado
        System.out.println("Introduce el número de entradas infantiles: ");
        nEntradasInfantiles=teclado.nextInt();
        System.out.println("Introduce el número de entradas adultas: ");
        nEntradasAdultas=teclado.nextInt();
        
        //Calculo el importe de todas las entradas
        importe=(nEntradasInfantiles*INFANTILES)+(nEntradasAdultas*ADULTOS);
        
        //Calculo el importeTotal aplicando ternario cuando el importe sea mayor o igual que 100, aplicar un 5% de descuento
        importeTotal=importe>=100?importe-(importe*BONO_DESCUENTO):importe;
        
        //Muestro los datos 
        System.out.printf("Número de entradas infantiles: %d \nNúmero de Entradas adultas: %d "
                + "\nImporte sin aplicar descuentos: %.2f \nImporte Total: %.2f",nEntradasInfantiles,nEntradasAdultas,importe,importeTotal);
    }
}
