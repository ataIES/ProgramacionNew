/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Triangulo extends Figura{

    public Triangulo(int id) {
        super(id);
    }

    public Triangulo() {
        super();
    }
    @Override
    public String toString(){
        return "Triángulo-> id: "+super.getId();
    }
}
