/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema3.ejercicio10;

/**
 *
 * @author DAW125
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        numeroRamanujan();
    }
//Metodo que nos saca los numeroRamanujan

    public static void numeroRamanujan() {
        int primerSum = 0, segundoSum = 0;

        for (int a = 1; a <= 50; a++) {
            int a3 = a * a * a;

            for (int b = a; b <= 50; b++) {
                int b3 = b * b * b;
                primerSum = a3 + b3;
                for (int c = a + 1; c <= 50; c++) {
                    int c3 = c * c * c;

                    for (int d = c; d <= 50; d++) {
                        int d3 = d * d * d;
                        segundoSum = c3 + d3;
                        if (primerSum == segundoSum) {
                            System.out.println(primerSum);
                        }
                    }
                }
            }

        }

    }

}
