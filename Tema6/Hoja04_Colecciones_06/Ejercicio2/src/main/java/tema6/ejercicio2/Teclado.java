/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author DAW125
 */
public class Teclado {
    
     public static String introNombre(String mensaje) {
        boolean valido = false;
        String nombre = "";
        String cond = "^[A-ZÑÁÉÍÓU][a-zñáéíóú]*$";
        Pattern patron = Pattern.compile(cond, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = null;
        while (!valido) {
            try {
                System.out.println(mensaje);
                nombre = new Scanner(System.in).nextLine();
                matcher = patron.matcher(nombre);
                if (!nombre.equalsIgnoreCase("")) {
                    if (matcher.find()) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(nombre, patron.pattern(), -1);
                    }
                } else {
                    throw new Exception("Error, el nombre no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return nombre;
    }
     
     public static String introApellidos(String mensaje) {
        boolean valido = false;
        String apellido = "";
        String cond = "^[A-ZÑÁÉÍÓU][a-zñáéíóú]*[\s][A-ZÑÁÉÍÓU][a-zñáéíóú]*$";
        Pattern patron = Pattern.compile(cond, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = null;
        while (!valido) {
            try {
                System.out.println(mensaje);
                apellido = new Scanner(System.in).nextLine();
                matcher = patron.matcher(apellido);
                if (!apellido.equalsIgnoreCase("")) {
                    if (matcher.find()) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(apellido, patron.pattern(), -1);
                    }
                } else {
                    throw new Exception("Error, los apellidos no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return apellido;
    }
     public static String introDni(String mensaje){
         boolean valido=false;
         String dni="";
         String condicion="[0-9]{7,8}[A-Z a-z]";
         while(!valido){
             try{
                 System.out.println(mensaje);
                 dni=new Scanner(System.in).nextLine();
                 if(dni.matches(condicion)){
                     valido=true;
                 }else{
                     throw new PatternSyntaxException(dni,condicion,-1);
                 }
             }catch(PatternSyntaxException p){
                 System.out.println(p.getMessage());
             }
         }
         return dni;
     }
}
