/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos.regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Main_Regulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pattern pattern = Pattern.compile("prueba", Pattern.CASE_INSENSITIVE); //este es el patrón que buscamos
       Matcher matcher = pattern.matcher("es una Prueba!"); //aquí buscamos el match (coincidencia)
       
       boolean matchFound = matcher.find();
       if(matchFound){
           System.out.println("Hay coincidencia");
       }else {
           System.out.println("No hay coincidencia");
       }
       //Cuando se determina que un carácter cumple con el patrón este carácter ya no vuelve a intervenir en la comprobación.
       String DNI="12345678Z";
       String regex ="^[0-9]{7,8}[a-zA-z]$";
       Pattern patron = Pattern.compile(regex);
       
       Matcher matcher2 = patron.matcher(DNI);
       boolean esCoincidente = matcher2.find();
       if(esCoincidente){
           System.out.println("Tiene forma de un DNI");
       }
       
       //código postal español va de 01 a 52 en los dos primeros y luego 3 cifras de 0 a 9
       String postal="82300";
       String regex2 ="^[0-5]{2}[0-9]{3}$";
       Pattern patron2 = Pattern.compile(regex2);
       
       Matcher matcher3 = patron2.matcher(postal);
       boolean esCoincidente2 = matcher3.find();
       if(esCoincidente2){
           System.out.println("Tiene forma de un Codigo postal");
       }else{
           System.out.println("No parece un Codigo Postal");
       }
       
    }
    
}
