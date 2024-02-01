/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Cuadrado extends Figura {

    public Cuadrado() {
        super();
    }

    public Cuadrado(int id) {
        super(id);
    }
    @Override
    public String toString(){
        return "Cuadrado-> id: "+super.getId();
    }
    
}
