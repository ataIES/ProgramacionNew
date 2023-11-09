/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio1;

/**
 *
 * @author daw1
 */
public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    public String clave() {

        return nombre.charAt(0) + apellido1.substring(0, 3) + apellido2.charAt(apellido2.length() - 1);

    }

    public int posicionLetra() {
        int resto = 0;
        String numeroDNI = " ";

        numeroDNI = dni.substring(0, dni.length() - 1);
        resto = Integer.parseInt(numeroDNI) % 23;
        return resto;
    }

    public boolean dniValido() {
        boolean valido = false;
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (dni.length() == 9) {
            if (dni.charAt(dni.length() - 1) == cadena.charAt(posicionLetra())) {
                valido = true;
            } else {
                System.out.println("Error, letra errónea");
            }
        } else {
            System.out.println("Error, la longitud del dni es errónea");
        }
        return valido;
    }

    public void validarDNI() {
        if (dniValido() == true) {
            System.out.println("DNI válido");
        }
    }
}
