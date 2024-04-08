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

    public static String introCodigo(String mensaje) {
        String codigo = "";
        boolean valido = false;
        String cond = "[A-Z]{3}[0-9]{3}";
        while (!valido) {
            try {
                System.out.println(mensaje);
                codigo = new Scanner(System.in).nextLine();
                if (!codigo.equalsIgnoreCase("")) {
                    if (codigo.matches(cond)) {
                        valido = true;
                    } else {
                        throw new ExcepcionPersonalizada("Error, formato erróneo 3 letras mayúsculas y 3 números");
                    }
                } else {
                    throw new ExcepcionPersonalizada("Error, no puedes dejar el código vacío");
                }
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return codigo;
    }

    public static String introDescripcion(String mensaje) {
        boolean valido = false;
        String descripcion = "";
        String cond = "([A-ZÁÉÍÓÚÑ][a-záéíóúñ]*)|([A-ZÁÉÍÓÚÑ][a-záéíóúñ]*[\s]?+)";
        Pattern patron = Pattern.compile(cond, Pattern.CASE_INSENSITIVE);
        Matcher matcher = null;
        while (!valido) {
            try {
                System.out.println(mensaje);
                descripcion = new Scanner(System.in).nextLine();
                matcher = patron.matcher(descripcion);
                if (!descripcion.equalsIgnoreCase("")) {
                    if (matcher.find()) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(descripcion, patron.pattern(), -1);
                    }
                } else {
                    throw new ExcepcionPersonalizada("Error, la descripción no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return descripcion;
    }

    public static int introExistencias(String mensaje) {
        boolean valido = false;
        int existencias = 0;
        while (!valido) {
            try {
                System.out.println(mensaje);
                existencias = new Scanner(System.in).nextInt();
                if (existencias >= 0) {
                    valido = true;
                } else {
                    throw new ExcepcionPersonalizada("Error, no puede haber existencias negativas");
                }

            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return existencias;
    }
}
