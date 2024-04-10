/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author DAW125
 */
public class Teclado {
    
    public static String introNombre(String mensaje){
        boolean valido = false;
        String descripcion ="";
        String cond = "^[A-ZÑÁÉÍÓÚ][a-zñáéíóú]*\s[A-ZÑÁÉÍÓÚ][a-zñáéíóú]*\s[A-ZÑÁÉÍÓÚ][a-zñáéíóú]*$";
        while (!valido) {
            try {
                System.out.println(mensaje);
                descripcion = new Scanner(System.in).nextLine();
                if (!descripcion.equalsIgnoreCase("")) {
                    if (descripcion.matches(cond)) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(descripcion, cond, -1);
                    }
                } else {
                    throw new Exception("Error, la descripción no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return descripcion;
    }
    
    public static float introEstatura(String mensaje){
        boolean valido=false;
        float estatura=0;
        while(!valido){
            try{
                System.out.println(mensaje);
                estatura=new Scanner(System.in).nextFloat();
                if(estatura>=1.50 && estatura<=2.40){
                    valido=true;
                }else{
                    throw new Exception("Error, la estatura errónea [1.50 - 2.40]");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        return estatura;
    }
}
