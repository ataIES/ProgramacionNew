/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema6.ejercicio1;

import java.util.Scanner;
import java.util.SortedSet;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        String nombre=Teclado.introNombre("Introduce el nombre y dos apellidos: ");
        System.out.println(nombre);
        /*
        Scanner teclado=new Scanner(System.in);
        int opc=0;
        Equipo equipo=new Equipo();
        do{
            menu();
            opc=teclado.nextInt();
            switch(opc){
                case 1->equipo.insertarJugador();
                
                case 2->{
                    String nombre=Teclado.introNombre("Introduce nombre y dos apellidos del jugador a borrar: ");
                    equipo.borrarJugador(nombre);
                }
                
                case 3->System.out.println(equipo.mostrarTodosJugadores());
                
                case 4->{
                    Jugador masBajo=equipo.masBajo();
                    System.out.println(masBajo.mostrarJugador());
                }
                
                case 5->{
                    Jugador masAlto=equipo.masAlto();
                    System.out.println(masAlto.mostrarJugador());
                }
                
                case 6->System.out.println(mostrarLista(equipo.jugadores2Metros()));
                
                case 7->System.out.println("Muchas Gracias!!");
                
                default->System.out.println("Error, opción incorrecta");
            }
        }while(opc!=7);
*/
    }
    public static void menu(){
        System.out.printf("\n\t---Menu del Equipo---"
                + "\n1.Insertar un jugador"
                + "\n2.Borrar un jugador"
                + "\n3.Mostrar Equipo"
                + "\n4.Jugador más bajo"
                + "\n5.Jugador más alto"
                + "\n6.Mostrar jugadores de más de 2 metros"
                + "\n7.Salir"
                + "\nIntroduce una opción: ");
    }
    public static String mostrarLista(SortedSet<Jugador>lista){
        String cadena="\n\t---Jugadores de más de 2 metros---";
        for(Jugador j:lista){
            cadena+=j.mostrarJugador();
        }
        return cadena;
    }
}
