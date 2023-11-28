/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema3.ejercicio3;

/**
 *
 * @author DAW125
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Complejo complejo1=new Complejo(3,6);
        Complejo complejo2=new Complejo(1,4);
        System.out.println(complejo1.toString());
        System.out.println(complejo2.toString());
        
        System.out.println("---Suma de complejos---");
        Complejo complejoSuma = new Complejo();
        complejoSuma=complejoSuma.sumar(complejo1, complejo2);
        System.out.println(complejoSuma.toString());
        
        System.out.println("---Resta de Complejos---");
        Complejo complejoResta= new Complejo();
        complejoResta=complejoResta.restar(complejo1, complejo2);
        System.out.println(complejoResta.toString());
        
        System.out.println("---Multiplicar dos complejos---");
        Complejo complejoMulti=new Complejo();
        complejoMulti=complejoMulti.multiplicarComplejos(complejo1, complejo2);
        System.out.println(complejoMulti.toString());
        
        System.out.println("---Multiplicar complejo por un número");
        Complejo complejoMultiNumero=new Complejo();
        complejoMultiNumero=complejoMultiNumero.multiplicarNumero(complejo1);
        System.out.println(complejoMultiNumero.toString());
       
        
    }
}
