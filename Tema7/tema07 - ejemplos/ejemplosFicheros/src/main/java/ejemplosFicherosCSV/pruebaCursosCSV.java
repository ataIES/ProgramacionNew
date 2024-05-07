/*
 *programa de prueba para ver el funcionamiento de lo que lee del fichero CSV
 */
package ejemplosFicherosCSV;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class pruebaCursosCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreFicheroCSVLeer="cursos.csv";
         String nombreFicheroCSVEscribir="cursos3.csv";
         ArrayList<Curso> cursos = new ArrayList<Curso>();
         
        FicheroCursoCSV f = new FicheroCursoCSV(nombreFicheroCSVLeer, nombreFicheroCSVEscribir, cursos);
        
        f.leerFicheroCursosCSV();
        
        f.mostrarCursos();
        Curso c = new Curso(99, "Especializado","espe", "FP", 1);
        Curso d = new Curso(999, "Espevvvvcializado","espe", "FP", 1);
        //esto funciona
        f.anadirCurso(c);
        
        System.out.println("Curso ultimo " + c);
       f.anadirCurso(d);
       try {
            f.escribirFicheroCursoCSV();
        } catch (Exception e) {
            System.err.println("Error al escribir fichero CSV: " + e.getMessage());
            e.printStackTrace();
        }
        
        f.mostrarCursos();
    }
    
}
