/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Número de pájaros: "+Pajaro.getNumPajaros());
        Pajaro pajaro1=new Pajaro("Azul",12);
        Pajaro.nuevoPajaro();
        Pajaro pajaro2=new Pajaro("Rojo",10);
        Pajaro.nuevoPajaro();
        Pajaro pajaro3=new Pajaro("Verde",5);
        Pajaro.nuevoPajaro();
        System.out.println(pajaro1.muestraPajaro()+"\n"+pajaro2.muestraPajaro()+"\n"+pajaro3.muestraPajaro());
        System.out.println("Número de pájaros: "+Pajaro.getNumPajaros());
    }
}
