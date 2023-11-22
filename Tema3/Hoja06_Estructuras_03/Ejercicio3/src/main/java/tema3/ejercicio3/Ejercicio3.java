/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio3;

/**
 *
 * @author daw1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        SintonizadorFM sintonizador1=new SintonizadorFM(107);
        sintonizador1.subir();
        sintonizador1.subir();
        sintonizador1.subir();
        sintonizador1.subir();
        
        System.out.println(sintonizador1.mostrarFrecuencia());
    }
}
