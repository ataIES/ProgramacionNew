/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.excepciones1;

/**
 *
 * @author cic
 */
public class Excepciones1 {

    public static void main(String[] args) {
       // Primer ejemplo
        System.out.println("Primer ejemplo");
        try {
            String name = null;
            System.out.println(name);
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Error " + e.toString());
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //Segundo ejemplo
        System.out.println("Segundo ejemplo");
        boolean indiceNoValido=true; 
	int i; //Entero que tomara nos aleatorios de 0 a 9 
	String texto[]={"Uno","Dos","Tres","Cuatro","Cinco"}; 
	while(indiceNoValido){ 
		try{ 
			i=(int)(Math.round(Math.random()*9)); 
			System.out.println(texto[i]); 
			indiceNoValido=false; 
		}catch(ArrayIndexOutOfBoundsException exc){ 
			System.out.println("Fallo en el Ã­ndice"); 
		}	 
	} 

        //Tercer ejemplo
        System.out.println("Tercer ejemplo");
        try{
           division(3,0);
        }catch(ArithmeticException e){
            System.out.println("Division entre 0");
        }
        
        //Cuarto ejemplo
        System.out.println("Cuarto ejemplo");
        try{
            int a=3;
            int b=5;
            if(a<b){
                throw new Exception("a es menor que b");
            }
        }catch(Exception e){
            System.out.println("error"+ e.getMessage());
        }
        
        //Quinto ejemplo
        System.out.println("Quinto ejemplo");
        try{
            
            throw new ExcepcionPersonalizada();
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.toString());
        }
    }
    
    public static int division(int a,int b) throws ArithmeticException{
        return a/b;
    }
}
