/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosFicherosCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FicheroCursoCSV {
    private String nombreFicheroCSVLeer;
    private String nombreFicheroEscribir;
    private ArrayList<Curso> cursos;

    public FicheroCursoCSV(String nombreFicheroCSVLeer, String nombreFicheroEscribir, ArrayList<Curso> cursos) {
        this.nombreFicheroCSVLeer = nombreFicheroCSVLeer;
        this.nombreFicheroEscribir = nombreFicheroEscribir;
        if(cursos == null){
            this.cursos = new ArrayList<Curso>();
        }else{
        this.cursos = cursos;}
    }
            
    //recuperar los datos
    
    public void leerFicheroCursosCSV(){
        FileReader fr;
        try { 
            fr = new FileReader(this.nombreFicheroCSVLeer);
            String linea ="";
            BufferedReader br = new BufferedReader(fr);
            while((linea = br.readLine()) !=null){
                String[] datoslinea =linea.split(";"); //le decimos que va separado por puntos y comas
                int idcurso = Integer.parseInt(datoslinea[0]);
                String codcurso = datoslinea[1]; //ver uso de trim()-> elimina espacios en blanco iniciales y finales
                String descurso = datoslinea[2];
                String etapa = datoslinea[3];
                int activo = Integer.parseInt(datoslinea[4]);// esto es una línea
                Curso c = new Curso(idcurso, codcurso, descurso, etapa, activo);
                this.cursos.add(c); //voy añadiendo los cursos
                
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
    
    //mostrar los cursos
    
    public void mostrarCursos(){
        for(Curso c : this.cursos){
            System.out.println(c.toString());
        }
    }
    //escribimos en el fichero
    public void escribirFicheroCursoCSV(){
        FileWriter fw;
        try {
            fw = new FileWriter(this.nombreFicheroEscribir);
            BufferedWriter bw = new BufferedWriter(fw);
            String lineaTexto = "";
            for(Curso c : this.cursos){
                String textoidcurso = Integer.toString(c.getIdcurso());
                String textocodcurso= c.getCodcurso();
                String textodescurso = c.getDescurso();
                String textoetapa = c.getEtapa();
                String textoactivo = Integer.toString(c.getActivo());
                
                lineaTexto = textoidcurso+";"+textocodcurso+";"+textodescurso+";"+textoetapa+";"+textoactivo+"\n";
                bw.write(lineaTexto);
                
                
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<Curso> getCursos() {
        return new ArrayList<>(cursos); // Devolver una copia de la lista
    }
    
    public void anadirCurso(Curso c){
        cursos.add(c);
    }
}
