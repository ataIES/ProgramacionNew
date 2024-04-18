/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tema6.ejercicioexamen;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Adrián Tresgallo Arozamena
 */
public class EjercicioExamen {

    public static void main(String[] args) {
        AgenciaAseguradora agencia = new AgenciaAseguradora();
        int opc = 0;
        do {
            menu();
            opc = new Scanner(System.in).nextInt();
            switch (opc) {
                case 1 -> {
                    eleccionInsertar(agencia);
                }
                case 2 -> {
                    String matriculaEliminar = MetodosEstaticos.validarMatricula("Introduce la matricula a eliminar: ");
                    agencia.eliminarVehiculo(matriculaEliminar);
                }
                case 3 -> {
                    double prima = new Scanner(System.in).nextDouble();
                    System.out.println(agencia.listarMotosPrima(prima));
                }
                case 4 -> {
                    ArrayList<Conductor> listar = new ArrayList<>();
                    for (Conductor c : listar) {
                        System.out.println(MetodosEstaticos.mostrarDatos(c.datosObjeto()));
                    }
                }
                case 5 -> {
                    System.out.println("Vehículos creados: " + agencia.obtenerNumeroVehiculo());
                }
            }

        } while (opc != 7);

    }

    public static void eleccionInsertar(AgenciaAseguradora agencia) {
        boolean insercion = false;
        while (!insercion) {
            System.out.println("¿Qué tipo de vehiculo, coche o moto?");
            String opcion = new Scanner(System.in).nextLine();
            if (opcion.equalsIgnoreCase("Coche")) {
                Coche cocheNuevo = crearCoche();
                agencia.aniadirVehiculo(cocheNuevo);
            } else {
                Moto motoNueva = crearMoto();
                agencia.aniadirVehiculo(motoNueva);
            }
        }
    }

    //Metodo estatico que crea el menú
    public static void menu() {
        System.out.printf("\n\t---Menú Agencia Aseguradora---"
                + "\n1.Añadir Vehículo"
                + "\n2.Eliminar Vehículo"
                + "\n3.Listar las motos segun su prima"
                + "\n4.Guardar y mostrar en una colección los conductores que se tiene asegurados por fecha"
                + "\n5.Visualización del número total de vehículos creados"
                + "\n6.Visualización del coche de mayor potencia"
                + "\n7.Salir"
                + "\nIntroduce una opción: ");
    }

    public static Conductor crearConductor() {
        Conductor c = null;
        boolean valido = false;
        while (!valido) {
            try {
                String nombre = MetodosEstaticos.introNombre("Introduce nombre y dos apellidos: ");
                LocalDate fecha = MetodosEstaticos.pedirFecha();
                c = new Conductor(nombre, fecha);
                valido = true;
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            } catch (DateTimeException d) {
                System.out.println(d.getMessage());
            } catch (InputMismatchException i) {
                System.out.println(i.getMessage());
            }
        }
        return c;
    }

    public static Coche crearCoche() {
        Coche c = null;
        boolean valido = false;
        while (!valido) {
            try {
                String matricula = MetodosEstaticos.validarMatricula("Introduce la matricula del coche: ");
                String modelo = MetodosEstaticos.introModelo("Introduce el modelo del coche: ");
                Conductor conductor = crearConductor();
                int potencia = MetodosEstaticos.pedirPotencia("Introduce la potencia: ");

            } catch (InputMismatchException i) {
                System.out.println(i.getMessage());
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return c;
    }

    public static Moto crearMoto() {
        Moto m = null;
        boolean valido = false;
        while (!valido) {
            try {
                String matricula = MetodosEstaticos.validarMatricula("Introduce la matricula de la moto: ");
                String modelo = MetodosEstaticos.introModelo("Introduce el modelo de la moto: ");
                Conductor conductor = crearConductor();
                int potencia = MetodosEstaticos.pedirCilindrada("Introduce la cilindrada: ");

            } catch (InputMismatchException i) {
                System.out.println(i.getMessage());
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
        return m;
    }

}
