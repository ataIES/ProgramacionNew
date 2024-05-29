/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicioexamen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DAW125
 */
public class MetodosFichero {
    
    public static void crearFicheroDatos(File fichero){
        File ficheroNuevo=new File("datos.txt");
        int caracter;
        FileInputStream f=null;
        BufferedWriter br=null;
        try{
            f=new FileInputStream(fichero);
            br=new BufferedWriter(new FileWriter(ficheroNuevo,true));
            while((caracter=f.read())!=-1){
                br.write(caracter);
            }
            if(fichero.delete()){
                if(ficheroNuevo.renameTo(fichero)){
                    System.out.println("Cambiado de nombre datos.txt a poema.txt");
                    System.out.println("Borrado poema.txt");
                }
                else{
                    System.out.println("No se pudo renombrar datos.txt");
                }
            }else{
                System.out.println("No se pudo borrar poema.txt");
            }
        }catch(IOException io){
            System.out.println(io.getMessage());
        }finally{
            if(br!=null && f!=null){
                try{
                    br.close();
                    f.close();
                }catch(IOException io){
                    System.out.println("Error al cerrar");
                }
            }
        }
    }
}
