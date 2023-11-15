/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Operaciones {   
    
    public Operaciones() {
    }
    
    public void metodo1(){
        int num=validarNumero("Introduce un número");
        //Bucle for para sacar todos los números desde el 1 hasta el número que introduzcamos por teclado
        for(int i=1;i<num;i++){
            //Condición para mostrar los divisores del número introducido por teclado, su resto tiene que ser 0
            if(num%i==0){
                System.out.print(i+" ");
            }
        }  
    }
    public void metodo2(){
        Scanner teclado=new Scanner(System.in);
        int numero1=0,numero2=0, suma=0;
        System.out.println("Introduce el primer número");
        numero1=teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2=teclado.nextInt();
        
        //Creo una condición que dice si el número 1 es mayor que el numero 2, me haga un bucle y si no es mayor me haga otro bucle
        if(numero1<numero2){
            for(int i=numero1; i<numero2;i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                    suma+=i;
                } 
            }
            System.out.println("\nLa suma total es: "+suma);
        }else{
            for(int i=numero2; i<numero1;i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                    suma+=i;
                }
            }
            System.out.println("\nLa suma total es: "+suma);
        }
        
        
    }
    public void metodo3(){
        int num=0;
        num=validarNumero("Introduce un número entero positivo: ");
        System.out.println("----TABLA DE MULTIPLICAR DEL "+num+"----");
        for(int i=1;i<11;i++){
            System.out.println("\t"+num+" x "+i+"= "+(num*i));
        }
    }
    public void metodo4(){
        int numero1=0,numero2=0;
        numero1=validarNumero("Introduce un valor para el número1:");
        numero2=validarNumero("Introduce un valor para el número2: ");
        
        //Le doy al resto el valor del divisor
        int resto=numero1;
        for(int i=0;i<numero1/numero2;i++){
            System.out.println("El resto es: "+resto+" el cociente es: "+i);
            //Resto al divisor, el dividendo, para dar el resto
            resto-=numero2;
        }
        
    }
    public static int validarNumero(String texto) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println(texto);
            numero = teclado.nextInt();
            if (numero >0) {
                valido = true;
            } else {
                System.out.println("Error, has introducido un número negativo");
            }
        } while (!valido);
        return numero;
    }
}
