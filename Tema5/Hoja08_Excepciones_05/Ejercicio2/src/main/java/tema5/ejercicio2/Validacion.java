/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Validacion {
    
//Metodo que valida la edad
    public static int validarEdad(String mensaje) {
        int edad = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                edad = new Scanner(System.in).nextInt();
                if(edad>=0 && edad<=90){
                    System.out.println("Edad introducida correctamente");
                    valido = true;
                }else{
                    throw new PersonaException("Error, edad tiene que estar en el intervalo [0-90]");
                }
            } catch (InputMismatchException i) {
                System.out.println("Error, has introducido caracteres");
            }catch(PersonaException p){
                System.out.println(p.getMessage());
            }
        }
        return edad;
    }

    //Metodo que valida el estado civil
    public static EstadoCivil validarEstadoCivil(String mensaje) {
        boolean valido = false;
        EstadoCivil estado = null;
        String opc = "";
        while (!valido) {
            try {
                System.out.println(mensaje);
                opc = new Scanner(System.in).nextLine();
                if(opc.equalsIgnoreCase("Soltero")){
                   estado=EstadoCivil.SOLTERO;
                   valido=true;
                }else if(opc.equalsIgnoreCase("Casado")){
                    estado=EstadoCivil.CASADO;
                    valido=true;
                }else{
                    throw new PersonaException("Error, no has introducido si está casado o soltero");
                }
            }catch (PersonaException e) {
                System.err.println(e.getMessage());
            }
        }
        return estado;
    }
}
