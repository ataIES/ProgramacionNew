/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema6.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Mundo mundo=new Mundo();
        //Inserto 4 países
        mundo.aniadirPaises();
        mundo.aniadirPaises();
        mundo.aniadirPaises();
        mundo.aniadirPaises();
        
        //Listo los países
        System.out.println(mundo.mostrarPaises());
        
        //Borro un país
        mundo.borrarPais("Portugal");
        
        //Listo los paises de nuevo
        System.out.println(mundo.mostrarPaises());
        
    }
}
