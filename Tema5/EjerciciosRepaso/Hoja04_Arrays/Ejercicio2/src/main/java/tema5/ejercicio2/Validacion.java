/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Validacion {

    public static int validarEdad() {
        int edad = 0;
        String f=String.valueOf(edad);
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Introduce su edad: ");
                edad = new Scanner(System.in).nextInt();
                if (edad >= 0) {
                    valido = true;
                }else {
                    throw new IOException("Error, has introducido números negativos");
                }
            } catch (IOException io) {
                System.out.println(io.getMessage());
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }
        }
        return edad;
    }
    public static boolean validarCasado(){
        boolean casado=false;
        boolean valido=false;
        String opc="";
        while(!valido){
            try{
                System.out.println("¿Está casado?");
                opc=new Scanner(System.in).nextLine();
                if(opc.equalsIgnoreCase("si")){
                    casado=true;
                    valido=true;
                }else if(opc.equalsIgnoreCase("no")){
                    valido=true;
                }else{
                    throw new IOException("Error, no has introducido si está casado o no");
                }
            }catch(IOException io){
                System.out.println(io.getMessage());
            }catch(InputMismatchException i){
                System.out.println("Error,Has introducido números");
            }
        }
        return casado;
    }
    public static double validarSalario(){
        double salario=0;
        boolean valido=false;
        while(!valido){
            try{
                System.out.println("Introduce su salario: ");
                salario=new Scanner(System.in).nextDouble();
                if(salario>0){
                    valido=true;
                }else{
                    throw new IOException("Error, has introducido salario negativo");
                }
            }catch(IOException io){
                System.out.println(io.getMessage());
            }catch(InputMismatchException i){
                System.out.println("Error, has introducido caracteres");
            }
        }
        return salario;
    }
}
