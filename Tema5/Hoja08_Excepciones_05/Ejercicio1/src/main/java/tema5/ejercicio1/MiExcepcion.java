/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje){
        super(mensaje);
    }
    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
