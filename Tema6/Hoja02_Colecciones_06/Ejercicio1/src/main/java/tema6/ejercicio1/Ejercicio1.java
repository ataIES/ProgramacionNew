/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema6.ejercicio1;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
      Academia a=new Academia();
      Curso curso1=new Curso();
      Curso curso2=new Curso();
      Curso curso3=new Curso();
     
      System.out.println("---Insertando cursos---");
      a.insertarCursoAlFinal(curso1);
      a.insertarCursoAlFinal(curso2);
      a.insertarCurso(curso3, 1);

      System.out.println("---Mostrar cursos---");
      System.out.println(a.mostrarCurso());

    }
}
