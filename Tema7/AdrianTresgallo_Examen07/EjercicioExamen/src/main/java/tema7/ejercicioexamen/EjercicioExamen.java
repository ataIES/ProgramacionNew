/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema7.ejercicioexamen;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Adrian Tresgallo DAW125
 */
public class EjercicioExamen {

    public static void main(String[] args) {
        Set<Profesor> listaProfesores=new LinkedHashSet<>();
        Set<Departamento>listaDepartamentos;
        String nombreFicheroProfesor = "";
        String nombreFicheroDepartamento = "";
        File ficheroProfesor;
        File ficheroDepartamento;
        File profesoresDEP=new File("ProfesoresDEP.dat");
        int opc=0;
        
        try {
            if (args.length == 2) {
                nombreFicheroProfesor = args[0];
                nombreFicheroDepartamento = args[1];
                ficheroProfesor = new File(nombreFicheroProfesor);
                ficheroDepartamento = new File(nombreFicheroDepartamento);
                listaProfesores=Funciones.leerProfesores(ficheroProfesor, ficheroDepartamento);
                do{
                    menu();
                    opc=new Scanner(System.in).nextInt();
                    switch(opc){
                        case 1->{
                            Funciones.listarProfesores(listaProfesores);
                        }
                        case 2->{
                            Funciones.guardarProfDep(listaProfesores, "INF");
                            Funciones.leerProfDep(profesoresDEP);
                        }
                        case 3->{
                            
                        }
                        case 4->{
                            
                        }
                        case 5->{
                            Departamento d=Funciones.buscarDepartamento(17, ficheroDepartamento);
                            Profesor p=new Profesor("Tresgallo Arozamena","Adrian","77765432T","adrian.tresgallo@educantabria.es",d);
                            Funciones.insertarProfesor(p,d, ficheroProfesor);
                        }
                    }
                }while(opc!=0);
            } else {
                throw new ExcepcionPersonalizada("Error, debes introducir dos ficheros");
            }
         
          
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }
    public static void menu(){
        System.out.printf("\n\t---Menú de Opciones---"
                + "\n1.Listar Profesores"
                + "\n2.Guardar Profesores"
                + "\n3.Guardar en el fichero de texto datos de los profesores"
                + "\n5.Guardar en formato csv"
                + "\n0.Salir"
                + "\nIntroduce una opcion:  ");
    }
}
