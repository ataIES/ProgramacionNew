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
        SintonizadorFM s = new SintonizadorFM(107);
        System.out.println("Subiendo 4 frecuencias");
        s.subir();
        s.subir();
        s.subir();
        s.subir();
        System.out.println(s.toString());
        System.out.println("Bajando 3 frecuencias");
        s.bajar();
        s.bajar();
        s.bajar();
        System.out.println(s.toString());
        System.out.println("");
        System.out.println("Segundo Sintonizador");
        SintonizadorFM s2 = new SintonizadorFM(200);
        System.out.println(s2.toString());
        System.out.println("Sintonizador Copia");
        SintonizadorFM s3 = new SintonizadorFM(s);
        s3.subir();
        s3.bajar();
        System.out.println(s3.toString());
    }
}
