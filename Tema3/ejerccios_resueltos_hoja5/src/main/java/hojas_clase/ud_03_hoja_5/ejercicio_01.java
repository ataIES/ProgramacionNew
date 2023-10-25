/*el de la Pirámide pero hecho a pasos
 */
package hojas_clase.ud_03_hoja_5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in);
        
        System.out.println("número de filas");
        int numFilas = teclado.nextInt();
        
        //paso 1
        System.out.println("paso1: el número de filas");
        
        for(int lineas=1; lineas<=numFilas; lineas++){
            
            System.out.println("*");
        }
        
        //paso 2
        
        System.out.println("paso2: los asteriscos");
        
        for(int lineas=1; lineas<=numFilas; lineas++){
            
            //asteriscos
            for(int asteriscos=1; asteriscos<=(2*lineas)-1; asteriscos++){
                
                System.out.print("*");
            }
            System.out.println();
        }
        
        //paso 3
        
        System.out.println("paso3: coloco espacios en blanco");
        
         for(int lineas=1; lineas<=numFilas; lineas++){
            //blancos
            
            for(int blancos = 1; blancos<=numFilas-lineas; blancos++){
                System.out.print(" ");
            } 
             
            //asteriscos
            for(int asteriscos=1; asteriscos<=(2*lineas)-1; asteriscos++){
                
                System.out.print("*");
            }
            System.out.println();
        }
        
        

    }
    
}
