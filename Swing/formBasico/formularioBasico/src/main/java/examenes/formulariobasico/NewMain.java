/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenes.formulariobasico;

/**
 *
 * @author Admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario u = new Usuario("bernardo2","bbpp", "bernardo@ejemplo.es");
        MetodosBD.guardar(u);
//        String palabra="123nn456";
//        String cadena = Desconocida.hashPassword(palabra);
//        System.out.println(palabra);
//        System.out.println(cadena);
//        Usuario u2 = new Usuario("bernardo3",cadena, "bernardo@ejemplo.es");
//        MetodosBD.guardar(u2);
        
        
    }
    
}
