/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioarraylist;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author atres
 */
public class Teclado {
    
    public static String introEquipo(String mensaje){
        Scanner teclado=new Scanner(System.in);
        String equipo="";
        String condicion="^([A-ZÁÉÍÚÓ]{1}[a-zñáéíóú]+[\s]?){1,2}$";
        Pattern patron=Pattern.compile(condicion,Pattern.CASE_INSENSITIVE);
        Matcher match=null;
        boolean valido=false;
        while(!valido){
            try{
                System.out.println(mensaje);
                equipo=teclado.nextLine();
                match=patron.matcher(equipo);
                boolean formato=match.find();
                if(formato){
                    valido=true;
                }else{
                    throw new PatternSyntaxException(equipo,condicion,-1);
                }
            }catch(PatternSyntaxException p){
                System.out.println("Error, formato del nombre del equipo erróneo");
            }
        }
        return equipo;
    }
    public static int introGoles(String mensaje){
        int gol=0;
        boolean valido=true;
        while(!valido){
            try{
                System.out.println(mensaje);
                gol=new Scanner(System.in).nextInt();
                if(gol>0 && gol<10){
                    valido=true;
                }else{
                    throw new Exception("Error, los goles deben ser entre 1 y 9");
                }
            }catch(InputMismatchException i){
                System.out.println("Error, introduce números enteros");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        return gol;
    }
}
