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
        Scanner teclado=new Scanner(System.in);
        int opc=0;
        GestorSeries gestor=new GestorSeries();
        do{
            menu();
            opc=teclado.nextInt();
            switch(opc){
                case 1->{
                    gestor.crearSerie();
                }
                case 2->{
                    String serieBuscar=Teclado.introCadena("Introduce la serie a eliminar: ");
                    gestor.eliminarSerie(serieBuscar);
                }
                case 3-> gestor.verSeries();
                
                case 4->{
                    String serieBuscar=Teclado.introCadena("Introduce la serie a buscar: ");
                    gestor.crearCapitulo(serieBuscar);
                }
                case 5->{
                    String serieEliminar=Teclado.introCadena("Introduce la serie a eliminar: ");
                    gestor.eliminarCapitulo(serieEliminar);
                }
                case 6->{
                    String cadena=Teclado.introCadena("Introduce la serie para visualizar sus capitulos: ");
                    System.out.println(gestor.visualizarCapitulos(cadena));
                }
                case 7->System.out.println("Muchas Gracias!!");
                
                default-> System.out.println("Error, opción incorrecta");
            }
        }while(opc!=7);
    }
    public static void menu(){
        System.out.printf("\n\t---Gestión de Series---"
                + "\n1.Añadir Serie"
                + "\n2.Eliminar Serie"
                + "\n3.Mostrar Series"
                + "\n4.Añadir capitulo a una serie"
                + "\n5.Borrar capitulo de una serie"
                + "\n6.Ver capitulos de una serie"
                +" \n7.Salir"
                + "\nIntroduce una opción: ");
    }
}
