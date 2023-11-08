/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author paguirrei
 */
public class Mavenproject2 {

    public static void main(String[] args) {
       
//        finanzas f = new finanzas();
//        finanzas f2 = new finanzas(0.99);
//        
//        double cambiado = f.dolaresToEuros(1000);
//        
//        System.out.println("dolares a euros : " + f2.dolaresToEuros(2000));
//        System.out.println("euros a dólare : " + f2.eurostoDolares(2000));
        
//        Numero n = new Numero(1830);
//        
//        System.out.println ("suma " + n.Suma(23));
//        System.out.println("rest " + n.Resta(8));
//        System.out.println("valor " + n.getNumero());
//        System.out.println ("el doble " + n.Doble());
        
        
//        Coche c = new Coche("1234GJM", 60);
//        
//        System.out.println("la velocidad es " + c.getVelocidad());
//        
//        c.acelera(100);
//        
//        System.out.println("la velocidad es " + c.getVelocidad());
//        
//        
//        System.out.println ("las letras de la matrícula son : " + c.letrasMatricula());
        
        
        Monedero m = new Monedero(20);
        System.out.println ("Creo mi monedero con  " + m.getSaldo());
        double ahorro=10.4;
        System.out.println("Añado al monedero " + ahorro + " euros");
        
        m.ahorrar(ahorro);
       
        System.out.printf("Tengo %.2f euros\n" ,m.getSaldo());
        
        double gasto=50;
        System.out.printf("intento sacar %.2f euros \n", gasto);
       
        
        System.out.println(m.gastar(gasto));
        
        System.out.printf("Tengo %.2f euros\n" ,m.getSaldo());
        
        gasto=20;
        System.out.printf("intento sacar %.2f euros \n", gasto);
       
        
        System.out.println(m.gastar(gasto));
         System.out.printf("Tengo %.2f euros\n" ,m.getSaldo());
        
    }
}
