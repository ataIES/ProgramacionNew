/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package reto.retofinal;

import baseDatos.MetodosBD;
import baseDatos.MetodosFicheros;
import java.io.File;

/**
 *
 * @author Admin
 */
public class RetoFinal {

    public static void main(String[] args) {
        File fichero=new File("D:\\Usuarios\\DAW125\\Documents\\Programacion\\Swing\\AdrianTresgallo_ExamenSwing\\script_reto\\materiales_reto\\profesores.csv");
        MetodosBD.insertarProfesor(fichero);
    }
}
