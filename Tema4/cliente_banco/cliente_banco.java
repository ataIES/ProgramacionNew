import java.util.Scanner;

class Cliente {
    private int codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private double saldo;

    // Constructor
    public Cliente(int codigo, String nombre, String apellidos, String telefono, double saldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    // Métodos de acceso
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    // Otros métodos según necesidades
}

class Banco {
    private Cliente[] usuarios;
    private int contadorUsuarios;

    // Constructor
    public Banco(int maxUsuarios) {
        usuarios = new Cliente[maxUsuarios];
        contadorUsuarios = 0;
    }

    // Método para ingresar un usuario al banco
    public void ingresarUsuario(Cliente nuevoCliente) {
        if (contadorUsuarios < usuarios.length) {
            usuarios[contadorUsuarios] = nuevoCliente;
            contadorUsuarios++;
            System.out.println("Cliente ingresado correctamente.");
        } else {
            System.out.println("Error: No se pueden agregar más usuarios. Cupo máximo alcanzado.");
        }
    }

    // Método para buscar un usuario por código
    public String buscarUsuario(int codigo) {
        for (Cliente usuario : usuarios) {
            if (usuario != null && usuario.getCodigo() == codigo) {
                return "Cliente encontrado:\n" + "Código: " + usuario.getCodigo() +
                       "\nNombre: " + usuario.getNombre() +
                       "\nApellidos: " + usuario.getApellidos() +
                       "\nTeléfono: " + usuario.getTelefono() +
                       "\nSaldo: " + usuario.getSaldo();
            }
        }
        return "Cliente no encontrado.";
    }

    // Método para eliminar un usuario por código
    public void eliminarUsuario(int codigo) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i] != null && usuarios[i].getCodigo() == codigo) {
                System.out.println("Cliente eliminado:\n" + "Código: " + usuarios[i].getCodigo() +
                                   "\nNombre: " + usuarios[i].getNombre());
                // Mover los elementos siguientes hacia atrás para llenar el espacio eliminado
                for (int j = i; j < contadorUsuarios - 1; j++) {
                    usuarios[j] = usuarios[j + 1];
                }
                usuarios[contadorUsuarios - 1] = null; // Eliminar la última referencia duplicada
                contadorUsuarios--;
                return;
            }
        }
        System.out.println("Cliente no encontrado. No se ha eliminado ningún cliente.");
    }

    // Método para mostrar la lista de usuarios
    public void mostrarUsuarios() {
        if (contadorUsuarios > 0) {
            System.out.println("Usuarios del banco:");
            for (int i = 0; i < contadorUsuarios; i++) {
                Cliente usuario = usuarios[i];
                System.out.println("Código: " + usuario.getCodigo() +
                                   "\nNombre: " + usuario.getNombre() +
                                   "\nApellidos: " + usuario.getApellidos() +
                                   "\nTeléfono: " + usuario.getTelefono() +
                                   "\nSaldo: " + usuario.getSaldo() + "\n");
            }
        } else {
            System.out.println("No hay usuarios registrados en el banco.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número máximo de clientes del banco: ");
        int maxClientes = scanner.nextInt();

        Banco banco = new Banco(maxClientes);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar un cliente");
            System.out.println("2. Mostrar los usuarios del banco");
            System.out.println("3. Buscar un cliente");
            System.out.println("4. Eliminar un cliente");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Ingresar un cliente
                    System.out.print("Ingrese el código del cliente: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese los apellidos del cliente: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del cliente: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el saldo del cliente: ");
                    double saldo = scanner.nextDouble();

                    Cliente nuevoCliente = new Cliente(codigo, nombre, apellidos, telefono, saldo);
                    banco.ingresarUsuario(nuevoCliente);
                    break;

                case 2:
                    // Mostrar los usuarios del banco
                    banco.mostrarUsuarios();
                    break;

                case 3:
                    // Buscar un cliente
                    System.out.print("Ingrese el código del cliente a buscar: ");
                    int codigoBuscar = scanner.nextInt();
                    String resultadoBusqueda = banco.buscarUsuario(codigoBuscar);
                    System.out.println(resultadoBusqueda);
                    break;

                case 4:
                    // Eliminar un cliente
                    System.out.print("Ingrese el código del cliente a eliminar: ");
                    int codigoEliminar = scanner.nextInt();
                    banco.eliminarUsuario(codigoEliminar);
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
