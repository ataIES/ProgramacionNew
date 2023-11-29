/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio4;

/**
 *
 * @author DAW125
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Punto P1=new Punto(4,4);
        Punto P2=new Punto(1,1);
        Punto PFinal=new Punto();
        
        System.out.println(P1.toString());
        System.out.println(P1.cuadrante());
        System.out.println("");
        System.out.println(P2.toString());
        System.out.println(P2.cuadrante());
        System.out.println("");
        System.out.println("Distancia entre los dos puntos: "+String.format("%.2f", PFinal.distancia(P1, P2)));
        System.out.println("");
        PFinal=PFinal.puntoMedio(P1, P2);
        System.out.println("Punto medio\n"+PFinal.toString());
    }
}
