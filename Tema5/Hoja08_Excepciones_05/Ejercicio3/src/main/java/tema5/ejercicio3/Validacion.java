/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Validacion {
    
    public static int validarNumero(String mensaje){
        boolean valido=false;
        int num=0;
        while(!valido){
            try{
                System.out.println(mensaje);
                num=new Scanner(System.in).nextInt();
                valido=true;
            }catch(InputMismatchException i){
                System.err.println("Error has introducido caracteres");
            }
        }
        return num;
    }
}
