/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.ejercicio4;

/**
 *
 * @author DAW125
 */
public class Operaciones {

    private int num1;
    private int num2;

    public Operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 > num2 ? num1 - num2 : num2 - num1;
    }

    public int multiplicacion() {
        return num1 * num2;
    }

    public int division() {
        int result=0;
        if(num1==0 || num2==0){
            System.out.println("Error, no se puede dividir entre 0");
            result=0;
        }else{
            if(num1>num2){
                result=num1/num2;
            }else{
                result= num2/num1;
            }
        }
        return result;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void imprimir() {
        System.out.printf("----Operaciones---- \nNumero1: %d Número2: %d \nSuma: %d \nResta: %d "
                + "\nMultiplicacion: %d \nDivisión: %d", getNum1(), getNum2(), suma(), resta(), multiplicacion(), division());
    }

    public static void main(String[] args) {
        int aux = args.length;
        int num1 = Integer.parseInt(args[0]), num2 = 0;
        if (aux > 0) {
            Operaciones ope = new Operaciones(num1, num2);
            ope.imprimir();
        }
    }
}
