/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicioexamen;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class MetodosEstaticos {

    //Metodo que pide un valor de potencia y lo valida en un rango
    public static int pedirPotencia(String mensaje) throws ExcepcionPersonalizada, InputMismatchException {
        boolean valido = false;
        int potencia = 0;
        while (!valido) {
            System.out.println(mensaje);
            potencia = new Scanner(System.in).nextInt();
            if (potencia >= 60 && potencia <= 1200) {
                System.out.println("Potencia válida");
                valido = true;
            } else {
                throw new ExcepcionPersonalizada("Error, introduce una potencia entre 60W y 120W");
            }
        }
        return potencia;
    }

    //Metodo que pide cilindrada y lo valida
    public static int pedirCilindrada(String mensaje) throws ExcepcionPersonalizada, InputMismatchException {
        int cilindrada = 0;
        boolean valido = false;
        while (!valido) {
            System.out.println(mensaje);
            cilindrada = new Scanner(System.in).nextInt();
            switch (cilindrada) {
                case 50 -> {
                    System.out.println("Potencia 50 válida");
                    valido = true;
                }
                case 125 -> {
                    System.out.println("Potencia 150 válida");
                    valido = true;
                }
                case 250 -> {
                    System.out.println("Potencia 250 válida");
                    valido = true;
                }
                case 500 -> {
                    System.out.println("Potencia 500 válida");
                    valido = true;
                }
                default ->
                    throw new ExcepcionPersonalizada("Error, debe ser la potencia 50-150-250-500");
            }
        }
        return cilindrada;
    }

    //Método que pide una fecha y la valida
    public static LocalDate pedirFecha() throws ExcepcionPersonalizada, DateTimeException, InputMismatchException {
        LocalDate fecha = null;
        int dia = 0, mes = 0, anio = 0;
        anio = validarAnio("Introduce el año de carnet: ");
        mes = validarMes("Introduce el mes de carnet: ");
        dia = validarDia(mes, anio);
       

        fecha = LocalDate.of(anio, mes, dia);
        return fecha;
    }
    
    //Metodo que valida matricula
    public static String validarMatricula(String mensaje){
        boolean valido=false;
        String condicion="^([0-9]{4}[\s]{1}[^AEIOUÑ]{3}){1}$";
        String matricula="";
        while(!valido){
            try{
                System.out.println(mensaje);
                matricula=new Scanner(System.in).nextLine();
                if(matricula.matches(condicion)){
                    valido=true;
                }else{
                    throw new PatternSyntaxException(matricula,condicion,-1);
                }
            }catch(PatternSyntaxException p){
                System.out.println("Error, formato 4 números, espacio, tres letras mayúsculas que no sea vocales");
            }
        }
        return matricula;
    }
    //Metodo que muestra los datos
    public static String mostrarDatos(Map<String,String>lista){
        String cadena="";
        for(Map.Entry<String,String>listar:lista.entrySet()){
            cadena=listar.getKey()+listar.getValue();
        }
        return cadena;
    }
    public static String introModelo(String mensaje){
        boolean valido=false;
        String condicion="^[A-Za-z]*$";
        String modelo="";
        while(!valido){
            try{
                System.out.println(mensaje);
                modelo=new Scanner(System.in).nextLine();
                if(modelo.matches(condicion)){
                    valido=true;
                }else{
                    throw new PatternSyntaxException(modelo,condicion,-1);
                }
            }catch(PatternSyntaxException p){
                System.out.println("Error, introduce letras");
            }
        }
        return modelo;
    }
    public static String introNombre(String mensaje){
        boolean valido=false;
        String condicion="^([A-ZÁÉÍÓÚ]{1}[a-záéíóúñ]+[\s]?){3,4}$";
        String nombre="";
        while(!valido){
            try{
                System.out.println(mensaje);
                nombre=new Scanner(System.in,"ISO-8859-1").nextLine();
                if(nombre.matches(condicion)){
                    valido=true;
                }else{
                    throw new PatternSyntaxException(nombre,condicion,-1);
                }
            }catch(PatternSyntaxException p){
                System.out.println("Error, formato de nombre erróneo");
            }
        }
        return nombre;
    }

    //Metodo que valida los años
    private static int validarAnio(String mensaje) throws ExcepcionPersonalizada, InputMismatchException {
        int anio = 0;
        int anioHoy = LocalDate.now().getYear();
        boolean valido = false;
        while (!valido) {
            System.out.println(mensaje);
            anio = new Scanner(System.in).nextInt();
            if (anio >= 1940 && anio <= anioHoy) {
                valido = true;
            } else {
                throw new ExcepcionPersonalizada("Error, el año debe ser entre 1940 y " + anioHoy);
            }
        }
        return anio;
    }

    //Metodo que valida los mes
    private static int validarMes(String mensaje) throws DateTimeException, InputMismatchException {
        int mes = 0;
        boolean valido = false;
        while (!valido) {
            System.out.println(mensaje);
            mes = new Scanner(System.in).nextInt();
            if (mes > 0 && mes <= 12) {
                valido = true;
            } else {
                throw new DateTimeException("Error, el mes debe ser entre 1 y 12");
            }
        }
        return mes;
    }

    //Metodo que valida el dia
    private static int validarDia(int mes, int anio) {
        int dia = 0;
        boolean valido = false;
        while (!valido) {
            switch (mes % 2) {
                case 0 -> {
                    if (mes == 2) {
                        if (esBisiesto(anio)) {
                            System.out.println("Introduce el dia entre 1-29: ");
                            dia = new Scanner(System.in).nextInt();
                            if (dia >= 1 && dia <= 29) {
                                valido = true;
                            } else {
                                throw new DateTimeException("Error, en año bisiesto, debe ser entre 1 y 29");
                            }
                        } else {
                            System.out.println("Introduce el dia entre 1-28: ");
                            dia = new Scanner(System.in).nextInt();
                            if (dia >= 1 && dia <= 28) {
                                valido = true;
                            } else {
                                throw new DateTimeException("Error, no es año bisiesto, debe ser entre 1 y 28");
                            }
                        }
                    } else {
                        System.out.println("Introduce un dia entre 1-30");
                        dia = new Scanner(System.in).nextInt();
                        if (dia >= 1 && dia <= 30) {
                            valido = true;
                        } else {
                            throw new DateTimeException("Error, el dia de debe ser entre 1 y 31");
                        }
                    }
                }
                default -> {
                    System.out.println("Introduce un dia entre 1-31");
                    dia = new Scanner(System.in).nextInt();
                    if (dia >= 1 && dia <= 31) {
                        valido = true;
                    } else {
                        throw new DateTimeException("Error, el dia de debe ser entre 1 y 31");
                    }
                }
            }
        }
        return dia;
    }

    //Metodo que nos dice si un año es bisiesto
    private static boolean esBisiesto(int anio) {
        boolean bisiesto = false;
        if ((anio % 4 == 0 && anio % 100 == 0) || anio % 400 != 0) {
            bisiesto = true;
        }
        return bisiesto;
    }

    //Metodo estatico que formatea la fecha
    public static String formatoFecha(LocalDate fecha) {
        String fechaFormateada = "";

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        fechaFormateada = fecha.format(formato);

        return fechaFormateada;
    }
}
