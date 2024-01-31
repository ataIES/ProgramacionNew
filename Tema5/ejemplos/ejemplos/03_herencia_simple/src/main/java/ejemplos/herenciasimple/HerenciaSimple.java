/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.herenciasimple;

/**
 *
 * @author cic
 */
public class HerenciaSimple {

    public static void main(String[] args) {
        Animal animal1=new Animal("Animal","Mamifero",20);
        System.out.println(animal1.toString());
        animal1.comer();
        animal1.respirar();
        
        Pajaro pajaro1=new Pajaro("Marron",true,"Pajaro","Ave",3);
        System.out.println(pajaro1.toString());
        pajaro1.comer();
        pajaro1.respirar();
       
    }
}
