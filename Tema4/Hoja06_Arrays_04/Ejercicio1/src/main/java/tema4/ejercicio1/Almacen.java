/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Almacen {
    private Articulo[]articulos;
    private int cont;

    public Almacen(int nArticulos) {
        this.articulos=new Articulo[nArticulos];
        this.cont=0;
    }
    public void llenar(Articulo articulo){
        if(cont<articulos.length){
            articulo.setCodigo(cont+1);
            articulos[cont]=articulo;
            cont++;
            System.out.println("Artículo añadido correctamente");
        }else{
            System.out.println("Error, articulos llenos");
        }
    }
    public String mostrar(){
        String cadena="";
        for(int i=0;i<cont;i++){
            cadena+=articulos[i].mostrar();
        }
        return cadena;
    }
    public String mostrarMenos10(){
        String cadena="";
        for(int i=0;i<cont;i++){
            if(articulos[i].getExistencias()<10){
                cadena+=articulos[i].mostrar();
            }
        }
        return cadena;
    }
    
}
