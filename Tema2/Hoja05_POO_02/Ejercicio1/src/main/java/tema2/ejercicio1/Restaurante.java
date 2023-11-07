/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2.ejercicio1;

/**
 *
 * @author atres
 */
public class Restaurante {

    private int nDocenas;
    private double nKilos;
    private int nPlatos;

    public Restaurante(int nDocenas, double nKilos) {
        this.nDocenas = nDocenas;
        this.nKilos = nKilos;
    }

    public void addHuevos(int huevos) {
        nDocenas += huevos;
    }

    public void addChorizo(double chorizo) {
        nKilos += chorizo;
    }

    public int getnPlatos() {
        return nPlatos;
    }

    public void sirvePlato(){
           if (nDocenas >= 2 && nKilos >= 0.2) {
            nDocenas -= 2;
            nKilos -= 0.2;
            nPlatos++;
            System.out.println("Se ha servido un plato");
        }else{
            System.out.println("No puedes servir ningún plato más");
        }
    }

    public int getnDocenas() {
        return nDocenas;
    }

    public double getnKilos() {
        return nKilos;
    }
    
    public void mostraRestaurante(){
        System.out.printf("----DATOS RESTAURANTE----\n\tNúmero de Docenas de Huevos: %d \n\tNúmero de Kilos de "
                + "Chorizo: %.2f \n\tNúmero de Platos: %d \n",nDocenas,nKilos,nPlatos);
    }
    

}
