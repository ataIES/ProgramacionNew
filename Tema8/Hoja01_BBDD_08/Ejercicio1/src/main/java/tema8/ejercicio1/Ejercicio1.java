/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema8.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAW125
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        UsuarioDAOImp metodos=new UsuarioDAOImp();
       int opc=0;
       do{
           menu();
           opc=new Scanner(System.in).nextInt();
           switch(opc){
               case 1->{
                   int id=Teclado.introId("Introduce el id del usuario a actualizar: ");
                   Usuario usuEncontrado=metodos.porId(id);
                   if(usuEncontrado!=null){
                       metodos.guardar(usuEncontrado);
                   }else{
                       System.out.println("Error, el usuario con id "+id+" no existe");
                   }
                   
               }case 2->{
                   int id=Teclado.introId("Introduce el id del usuario a eliminar: ");
                   metodos.eliminar(id);
               }
               case 3->{
                  Usuario nuevoUsuario=metodos.nuevoUsuario();
                  metodos.guardar(nuevoUsuario);
               }
               case 4->{
                   List<Usuario>listaUsuarios=new ArrayList<>();
                   metodos.listarUsuario(listaUsuarios);
               }
           }
       }while(opc!=5);
    }
    public static void menu(){
        System.out.printf("\n\t---MENÚ DE USUARIOS---"
                + "\n1.Actualizar"
                + "\n2.Eliminar"
                + "\n3.Agregar"
                + "\n4.Listar"
                + "\nSalir"
                + "\nIntroduce una opción: ");
    }
}
