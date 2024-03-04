/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int num1=0,num2=0,num3=0;
        num1=Validacion.validarNumero("Introduce el primer número: ");
        num2=Validacion.validarNumero("Introduce el segundo número: ");
        num3=Validacion.validarNumero("Introduce el tercer número: ");
        
        Double resultEcuacion=Math.pow(num1, 2)+num2+num3;
        System.out.println(resultEcuacion);
        
    }
}
