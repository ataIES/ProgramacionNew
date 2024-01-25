/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema3.ejercicio2;

/**
 *
 * @author atres
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        rellenar0(array);
        mostrar(array);
        System.out.println("---Multiplicar---");
        multiplica(array);
        mostrar(array);
        int[]vector=valoresAspa(array);
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i]+" ");
        }
        
    }

    public static void rellenar0(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int b = 0; b < array[i].length; b++) {
                if (i == 0 || b == 0) {
                    array[i][0] = i;
                    array[0][i] = i;
                } else {
                    array[i][b] = 0;
                }
            }
        }
    }
    public static void mostrar(int array[][]){
        for(int i=0;i<array.length;i++){
            for(int a=0;a<array.length;a++){
                System.out.print(array[i][a]+" ");
            }
            System.out.println(" ");
        } 
    }
    public static void multiplica(int array[][]) {
        for (int i = 1; i < array.length; i++) {
            for (int a = 1; a < array[i].length; a++) {
                if (i != 0 || a != 0) {
                    array[i][a] = i * a;
                } else {
                    array[i][0] = i;
                    array[0][i] = i;
                }
            }
        }
    }
    public static int[] valoresAspa(int array[][]) {
        int[]vector=new int[21];
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                if (i == a) {
                    System.out.print(array[i][a] + " ");
                    vector[i]=array[i][a];
                } else {
                    System.out.print(" ");
                }
                if (i + a == array.length - 1) {
                    System.out.print(array[i][a]);
                    vector[i]=array[i][a];
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }
        return vector;
    }
}
