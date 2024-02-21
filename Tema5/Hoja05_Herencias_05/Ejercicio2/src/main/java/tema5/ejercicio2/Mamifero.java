/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

/**
 *
 * @author atres
 */
public class Mamifero {
    private String raza;
    private int npatas;
    private String alimento;

    public Mamifero(String raza, int npatas, String alimento) {
        this.raza = raza;
        this.npatas = npatas;
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public int getNpatas() {
        return npatas;
    }

    public String getAlimento() {
        return alimento;
    }
    

    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + ", npatas=" + npatas + ", alimento=" + alimento + '}';
    }
    
    
}
