/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Circulo extends Figura {

    public Circulo(int id) {
        super(id);
    }

    public Circulo() {
        super();
    }

    
    @Override
    public String toString() {
       return "Círculo-> id: "+super.getId();
    }
    
}
