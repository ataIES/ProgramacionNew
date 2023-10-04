/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio_propuesto_empresapintura;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Ejercicio_Propuesto_EmpresaPintura {

    public enum altura {
        ALTO, BAJO
    }

    public enum trabajo {
        PINTURA, TEJADO
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcTrabajo, opcEdificio;
        trabajo trabajo1 = null;
        altura altura1 = null;
        boolean contrata;

        System.out.println("Introduce el tipo de trabajo: 1.Pintura 2.Tejado");
        opcTrabajo = teclado.nextInt();
        trabajo1 = (opcTrabajo == 1 ? trabajo1.PINTURA : (opcTrabajo == 2 ? trabajo1.TEJADO : null));

        System.out.println("Introduce el tipo de Edificio: 1.Alto 2.Bajo");
        opcEdificio = teclado.nextInt();
        altura1 = (opcEdificio == 1 ? altura1.ALTO : (opcEdificio == 2 ? altura1.BAJO : null));

        contrata = (altura1 == altura1.ALTO) ? true : (trabajo1 == trabajo1.TEJADO ? true : false);

        System.out.println("Se puede contratar?: " + contrata);

        /*
        boolean contrata, pintura, reparacionTejados, altura;

        pintura = true;
        reparacionTejados = false;
        altura = false;

        contrata = (altura) || (reparacionTejados && !altura && !pintura);
        System.out.println("¿Contrata? " + contrata);
         */
    }
}
