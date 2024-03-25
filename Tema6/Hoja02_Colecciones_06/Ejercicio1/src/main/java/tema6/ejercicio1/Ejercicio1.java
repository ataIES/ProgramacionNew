/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema6.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Academia academia1 = new Academia();
        int opc = 0;
        do {
            System.out.printf("\n\t...Menú de Opciones de la Academia... "
                    + "\n1.Añadir curso al final de la lista"
                    + "\n2.Insertar un nuevo curso en cualquier posición"
                    + "\n3.Borrar un curso dado su código"
                    + "\n4.Modificar el número de horas de un curso dado su código"
                    + "\n5.Mostrar todos los cursos"
                    + "\n6.Salir"
                    + "\n\nIntroduce una opcion:  ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.println("Insertando un curso al final...");
                    Curso curso = new Curso();
                    academia1.insertarCursoAlFinal(curso);
                }

                case 2 -> {
                    insertarCurso(academia1);
                }

                case 3 -> {
                    System.out.println("Borrar un curso...");
                    System.out.println("Introduce el codigo del curso a borrar: ");
                    int codigo = teclado.nextInt();
                    academia1.borrarCurso(codigo);
                }

                case 4 -> {
                    System.out.println("Modificar número de horas de un curso...");
                    System.out.println("Introduce el codigo del curso a borrar: ");
                    int codigo = teclado.nextInt();
                    academia1.modificarHoras(codigo);
                }

                case 5 -> {
                    System.out.println("Mostrando todos los cursos...");
                    System.out.println(academia1.mostrarCurso());
                }

                case 6 ->
                    System.out.println("Muchas Gracias!!");

                default ->
                    System.out.println("Error, opción incorrecta");
            }
        } while (opc != 6);

    }

    public static void insertarCurso(Academia a) {
        int nCursos = a.getListaCursos().size();
        int pos = 0;
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Insertando un curso en cualquier posición...");
            Curso curso = new Curso();
            System.out.println("Introduce la posición donde se insertará: ");
            pos = teclado.nextInt();
            if (pos <= nCursos) {
                a.insertarCurso(curso, pos-1);
            } else {
                throw new IndexOutOfBoundsException("Error, la posición excede con el número de cursos");
            }
        } catch (IndexOutOfBoundsException i) {
            System.out.println(i.getMessage());
        } 
    }
}
