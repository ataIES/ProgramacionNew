/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author DAW125
 */
public class Serie {

    private String nombreSerie;
    private Tematica tematica;
    private String nacionalidad;
    private boolean finalizada;
    private int nTemporadas;
    private HashMap<String, Capitulo> listaCapitulos;

    

    //Contructor por parámetros
    public Serie(String nombreSerie, Tematica tematica, String nacionalidad, boolean finalizada, int nTemporadas) {
        this.nombreSerie = nombreSerie;
        this.tematica = tematica;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.nTemporadas = nTemporadas;
        this.listaCapitulos = listaCapitulos;
        this.listaCapitulos=new HashMap<>();
    }

    //Metodos get
    public String getNombreSerie() {
        return nombreSerie;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public HashMap<String, Capitulo> getListaCapitulos() {
        return listaCapitulos;
    }

    //Metodo que formatea un boolean
    private String formatoFinalizada() {
        return isFinalizada() ? "Sí" : "No";
    }

    //Metodo que muestra la serie
    @Override
    public String toString() {
        String cadena = "\n\t---Serie---";

        cadena += "\nNombre de la Serie: " + getNombreSerie() + "\nTemática: " + getTematica()
                + "\nNacionalidad: " + getNacionalidad() + "\nFinalizada: "+formatoFinalizada()
                        +"\nTemporadas: "+getnTemporadas();
        
        return cadena;
    }
    
    //Metodo que genera la clave dle Capitulo
    public static String generaClaveCapitulo(String nombreCapitulo, int temporada, int capitulo){
        String claveCapitulo="";
        String formatoTemporada=temporada<10?"0"+temporada:String.valueOf(temporada);
        String formatoCapitulo=capitulo<10?"0"+capitulo:String.valueOf(capitulo);
        
        claveCapitulo=nombreCapitulo.substring(0,4)+formatoTemporada+"X"+formatoCapitulo;
        
        return claveCapitulo;
    }
    
    //Metodo que inserta un capitulo
    public void insertarCapitulo(String clave,Capitulo capitulo){
        boolean insertado=false;
        try{
            if(!listaCapitulos.containsKey(clave)){
                listaCapitulos.put(clave, capitulo);
                insertado=true;
                System.out.println("Capitulo "+capitulo.getDescripcion()+" insertado correctamente");
            }
            
            if(!insertado){
                throw new ExcepcionPersonalizada("Error, el capitulo ya existe");
            }
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.getMessage());
        }
    }
    
    //Metodo que elimina un capitulo
    public void eliminarCapitulo(String clave){
        boolean eliminar=false;
        try{
            if(listaCapitulos.containsKey(clave)){
                listaCapitulos.remove(clave);
                eliminar=true;
                System.out.println("Capitulo "+clave+" eliminado correctamente");
            }
            
            if(!eliminar){
                throw new ExcepcionPersonalizada("Error, el capitulo no existe");
            }
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.getMessage());
        }
    }
    
    //Metodo que muestra los capitulos de la serie
    public String visualizarCapitulos(){
        String cadena="\n\t---Lista de Capitulos---";
        for(Map.Entry<String,Capitulo>entry : listaCapitulos.entrySet()){
            cadena+="\nCodigo del Capitulo: "+entry.getKey()+entry.getValue().toString();
        }
        return cadena;
    }
    public Capitulo existeCapitulo(int nTemporada,int nCapitulo){
        Capitulo capituloEncontrado=null;
        Iterator<Capitulo>it=listaCapitulos.values().iterator();
        while(it.hasNext()){
            Capitulo c=it.next();
            if(c.getnTemporada()==nTemporada && c.getnCapitulo()==nCapitulo){
                capituloEncontrado=c;
            }
        }
        return capituloEncontrado;
    }

}
