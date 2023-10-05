/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package evaluacion.ejercicio2;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class Ejercicio2 {
//Faltan los corchete inicial para el método main

    public static void main(String[] args) {
        float x = 4.5f;
        float y = 3.0f;
        int i = 2;
        /*La variable j esta como int, estamos multiplicando dos variables del tipo float que nos llevará decimales.
        Podemos simplemente castear par convertir el resultado de la operación a int o  cambiar de tipo a la variable j*/
        int j = (int) (i * x);
        double dx = 2.0;
        double dz = dx * y;

        byte bx = 5;
        byte by = 2;
        //Aquí en la variable bz al realizar el casteo debemos de meter entre paréntesis nuestra operacion
        byte bz = (byte) (bx - by);
        short sx = 10;
        short sy = 1;
        short sz = (short) (sx - sy);
        
        sx = 32767;
        sy = 1;
        //Aqui en la variable sz tenemos que castearla a short porque nos dará un valor del tipo int
        sz = (short) (sx + sy);

        //En nuestra variable cx tenemos que poner bien el nombre de la variable que este caso sería char
        char cx = 65;
        char cy = 70;
        //Aquí, en la variable z, nos falta el ;
        int z = cx - cy;

        //Muestro por pantalla
        System.out.printf("Estas líneas están impresas con printf \nProducto de int por float: j= i*x= %d \nProducto de float por double: dz=dx*y= %.2f \n", j, dz);
        System.out.println("Estas líneas están impresas con println \nEl resultado de bz es: " + bz + " \nEl resultado de sz es: " + sz + "\nEl resultado de sz es: " + sz + "\nEl valor de z es: " + z);
    }
}
