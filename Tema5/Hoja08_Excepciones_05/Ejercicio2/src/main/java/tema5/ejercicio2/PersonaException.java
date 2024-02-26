/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.util.InputMismatchException;

/**
 *
 * @author DAW125
 */
public class PersonaException extends InputMismatchException {
    
    @Override
    public String getMessage(){
        return "Error, has introducido caracteres" ;
    }
    
}
