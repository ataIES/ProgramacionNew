/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.ejercicio7;

/**
 *
 * @author daw1
 */
public class Operaciones {

    private int num;

    //Constructor con parámetros
    public Operaciones(int num) {
        this.num = num;
    }
    //Método que sirve para contar cuantas cifras tiene el número
    public int contarCifras() {
        return String.valueOf(num).length();
    }
    //Método que calcula los 10 primeros multiplos de número
    public void multiplos() {
        System.out.println("--- 10 Múltiplos de " + num + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.print(num * (i + 1) + " ");
        }
    }
    //Método que calcula si un número es perfecto
    public boolean perfecto() {
        boolean perfecto = false;
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        if (suma == num) {
            perfecto = true;
        }
        return perfecto;
    }
}
