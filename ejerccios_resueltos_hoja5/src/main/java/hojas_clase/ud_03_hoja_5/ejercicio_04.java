/*
 * 4.- 	Programa que te muestra los números del 1 al 100, pero haciendo grupos de 10 en diez. 
 */
package hojas_clase.ud_03_hoja_5;

/**
 *
 * @author Admin
 */
public class ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Vamos a escribir los números del 1 al 100 de un modo particular");
        for (int i=1; i<=10; i++){
            
            System.out.print("Ciclo número " + (1+(10*(i-1))) + "\n");
            
            for(int j=1; j<=10; j++){
                System.out.println((10*(i-1)+j));
            }
            
            
        }
        
        
    }//main
    
}//clase
