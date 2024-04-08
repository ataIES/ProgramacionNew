/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.HashSet;

/**
 *
 * @author DAW125
 */
public class Mundo {

    private HashSet<String> listaPaises;

    public Mundo() {
        this.listaPaises = new HashSet<>();
    }

    //Metodo que añade un pais
    public void aniadirPaises() {
        String pais = "";
        try {
            pais = Teclado.introPais("Introduce el nombre del país: ");
            if (listaPaises.add(pais)) {
                System.out.println("País " + pais + " introducido correctamente");
            } else {
                throw new ExcepcionPersonalizada("Error, no se pudo guardar el país " + pais);
            }
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Metodo que borra un pais
    public void borrarPais(String nombrePais){
        try{
            if(listaPaises.remove(nombrePais)){
                System.out.println("País "+nombrePais+" borrado correctamente");
            }else{
                throw new ExcepcionPersonalizada("Error, no se ha borrado el país "+nombrePais);
            }
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.getMessage());
        }
    }
  
    //Metodo que lista los paises
    public String mostrarPaises(){
        String cadena="";
        for(String pais: listaPaises){
            cadena+=String.format("%s ", pais);
        }
        return cadena;
    }
}
