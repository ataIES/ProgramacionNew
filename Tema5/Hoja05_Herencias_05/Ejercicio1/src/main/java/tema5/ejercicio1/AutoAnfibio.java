/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

/**
 *
 * @author atres
 */
public class AutoAnfibio implements TransporteMaritimo,TransporteTerrestre {
    
    private String marca;
    private String modelo;

    
    @Override
    public void nadar(){
        System.out.println("Estoy nadando");
    }
    @Override
    public void andar(){
        System.out.println("Estoy andando");
    }
}
