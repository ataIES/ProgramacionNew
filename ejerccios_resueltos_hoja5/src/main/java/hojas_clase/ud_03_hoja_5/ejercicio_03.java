/*
 * 3.- 	Programa que permite simular el funcionamiento de un reloj digital y ponerlo en hora. 
Este nos calcula todas las horas desde la introducida hasta llegar a las 23:59:59 del día actual.
 */
package hojas_clase.ud_03_hoja_5;

/**
 *
 * @author Admin
 */
public class ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    
        // Esta es la hora de partida
        int horaDeseada = 23;
        int minutoDeseado = 58;
        int segundoDeseado = 23;

        //Vamos contando los segundos hasta alcanzar las 23:59:59
        for (int hora = horaDeseada; hora <= 23; hora++) {
            
            for (int minuto = (hora == horaDeseada ? minutoDeseado : 0); minuto < 60; minuto++) {
                
                for (int segundo = (hora == horaDeseada && minuto == minutoDeseado ? segundoDeseado : 0); segundo < 60; segundo++) {
                    
                    System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
                }
            }
        }
    }
}

       

