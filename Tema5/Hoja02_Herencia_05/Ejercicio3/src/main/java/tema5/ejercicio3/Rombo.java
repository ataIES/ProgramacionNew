/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Rombo extends Figura {

    public Rombo(int id) {
        super(id);
    }

    public Rombo() {
    }
    @Override
    public String toString(){
        return "Rombo-> id: "+super.getId();
    }
}
