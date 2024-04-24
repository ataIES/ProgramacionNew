/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author DAW125
 */
public class Teclado {

    public static int introId(String mensaje) {
        int id = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                id = new Scanner(System.in).nextInt();
                if (id > 0) {
                    valido = true;
                } else {
                    throw new Exception("Error, el id no puede ser negativo");
                }
            } catch (InputMismatchException i) {
                System.out.println("Error, introduce números enteros");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return id;
    }

    public static String introUsername(String mensaje) {
        boolean valido = false;
        String cadena = "";
        String cond = "^[a-zA-Z0-9_-]+$";
        while (!valido) {
            try {
                System.out.println(mensaje);
                cadena = new Scanner(System.in).nextLine();
                if (!cadena.equalsIgnoreCase("")) {
                    if (cadena.matches(cond)) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(cadena, cond, -1);
                    }
                } else {
                    throw new Exception("Error, no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return cadena;
    }
    public static String introPassword(String mensaje) {
        boolean valido = false;
        String cadena = "";
        String cond = "^[a-zA-Z0-9_-]+$";
        while (!valido) {
            try {
                System.out.println(mensaje);
                cadena = new Scanner(System.in).nextLine();
                if (!cadena.equalsIgnoreCase("")) {
                    if (cadena.matches(cond)) {
                        valido = true;
                    } else {
                        throw new PatternSyntaxException(cadena, cond, -1);
                    }
                } else {
                    throw new Exception("Error, no puede estar vacío");
                }

            } catch (PatternSyntaxException p) {
                System.out.println("Error, formato erróneo");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return cadena;
    }
    public static String introCorreoElectronico(String mensaje) {
        String correoElectronico = "";
        String condicion = "^[A-Za-z0-9Ññ_.-]+@[a-zA-Z0-9-_]+.[a-z]{2,4}$";
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println(mensaje);
                correoElectronico = new Scanner(System.in, "ISO-8859-1").nextLine();
                if (correoElectronico.matches(condicion)) {
                    valido = true;
                } else {
                    throw new PatternSyntaxException(correoElectronico, condicion, -1);
                }
            } catch (PatternSyntaxException p) {
                System.out.println(p.getMessage());
            }
        }
        return correoElectronico;
    }
    
}
