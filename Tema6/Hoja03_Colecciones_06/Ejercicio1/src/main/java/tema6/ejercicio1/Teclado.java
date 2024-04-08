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

    public static String introPais(String mensaje) {
        boolean valido = false;
        String pais = "";
        String cond = "([A-ZÁÉÍÓÚÑ][a-záéíóúñ]*)|([A-ZÁÉÍÓÚÑ][a-záéíóúñ]*[\s]?+)";
        Pattern patron = Pattern.compile(cond, Pattern.CASE_INSENSITIVE);
        Matcher matcher = null;
        while (!valido) {
            try {
                System.out.println(mensaje);
                pais = new Scanner(System.in).nextLine();
                matcher = patron.matcher(pais);
                if (!pais.equalsIgnoreCase("")) {
                    if (matcher.find()) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(pais, patron.pattern(), -1);
                    }
                } else {
                    throw new ExcepcionPersonalizada("Error, el nombre no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return pais;
    }
}
