/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema4.ejerciciopropuesto;

/**
 *
 * @author DAW125
 */
public class EjercicioPropuesto {

    public static void main(String[] args) {
       int matriz[][]=new int[2][2];
       int num=1;
       for(int i=0;i<matriz.length;i++){
           for(int j=0;j<matriz[i].length;j++){
               matriz[i][j]=num;
               num*=2;
               System.out.print(matriz[i][j]+" ");
           }
           System.out.println("");
       }
    }
}
