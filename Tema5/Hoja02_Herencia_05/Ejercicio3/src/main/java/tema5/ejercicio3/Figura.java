/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio3;

/**
 *
 * @author DAW125
 */
public abstract class Figura {
    private int id;

    public Figura(int id) {
        this.id = id;
    }

    public Figura() {
        this.id++;
    }

    public int getId() {
        return id;
    }
    
    @Override
   public abstract String toString();
      
}
