/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author DAW125
 */
public class Teclado {

    //Método que valida la descripcion
    public static String validarDescripcion(String mensaje) {
        Scanner teclado=new Scanner(System.in);
        String descripcion = "";
        boolean valido = false;
        Pattern condicion1=Pattern.compile("[a-zA-záéíóúÁÉÍÓÚ]",Pattern.UNICODE_CASE);
        Pattern condicion = Pattern.compile("[a-zA-záéíóúÁÉÍÓÚ][\s]{1}[a-zA-záéíóúÁÉÍÓÚ]", Pattern.UNICODE_CASE);
        Matcher matcher = null;
        Matcher matcher1=null;
        while (!valido) {
            try {
                System.out.println(mensaje);
                descripcion =teclado.nextLine();
                matcher = condicion.matcher(descripcion);
                matcher1=condicion1.matcher(descripcion);
                if (matcher.find() || matcher1.find()) {
                    System.out.println("Descripcion válida");
                    valido = true;
                } else {
                    throw new PatternSyntaxException(descripcion, condicion.pattern(), -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
                teclado.close();
            }
        }
        return descripcion;
    }

    //Metodo que valida el número de horas
    public static int validarNúmeroHoras(String mensaje) {
        Scanner teclado=new Scanner(System.in);
        int nHoras = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                nHoras = teclado.nextInt();
                if (nHoras > 0) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, solo admite números positivos");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
                teclado.close();
            } catch (InputMismatchException i) {
                System.out.println("Error, solo admite número enteros");
                teclado.close();
            }
        }
        return nHoras;
    }

}
