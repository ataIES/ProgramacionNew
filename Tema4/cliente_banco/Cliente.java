/*
 * Diseñar una clase llamada Cliente formada por los atributos: código, nombre, apellidos, teléfono y saldo 
junto con los métodos necesarios para su manipulación. 
Otra clase, denominada Banco estará formada por un array de usuarios del banco y un contador de usuarios de banco.  
Un constructor que introduce por parámetro el número máximo de clientes de un banco inicializando a ese número los usuarios del banco. 
Métodos que permitan ingresar un usuario (tendremos en cuenta que el código de usuario corresponde con el número del usuario del banco) 
y el resto de los datos se piden por teclado, 
buscar un usuario devuelve una cadena de texto con la información del usuario, 
eliminar un usuario y mostrar que nos muestra la relación de los usuarios del banco. 
En los dos últimos métodos tendrán como parámetro de entrada él código de usuario. 
Siempre controlando que no podemos sobrepasar el número de usuarios del banco.
Crea en la clase principal un menú repetitivo con las siguientes opciones 
1. Ingresar un cliente, 
2. Mostrar los usuarios del banco, 
3. Buscar un cliente – pediremos por teclado el código del cliente a buscar, 
4. Eliminar un cliente- pediremos por teclado el código del cliente a eliminar, 
5. Salir.

 */
package ejercicios_clase.unidad_04.hoja_06;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Cliente {
    
    private int codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private double saldo;
    
    public Cliente(){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Alta de Cliente en el banco");
        
        System.out.println("Introduce el código de cliente");
        int codigo1 = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("Introduce el nombre de tu cliente: ");
        String nombre1 = teclado.nextLine();
        
        System.out.println("Introduce los apellidos de tu cliente:");
        String apellidos1 = teclado.nextLine();
        
        System.out.println("Introduce el teléfono del cliente: ");
        String telefono1 = teclado.nextLine();
        
        System.out.println("Introduce el saldo de la cuenta:");
        double saldo1 = teclado.nextDouble();
        
        this.codigo = codigo1;
        this.nombre = nombre1;
        this.apellidos = apellidos1;
        this.telefono = telefono1;
        this.saldo = saldo1;
        
        
    }
    public Cliente(int codigo1, String nombre1, String apellidos1, String telefono1, double saldo1){
        this.codigo = codigo1;
        this.nombre = nombre1;
        this.apellidos = apellidos1;
        this.telefono = telefono1;
        this.saldo = saldo1;
        
        
    }
    //metodos get y set

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //mostrar cliente
    
    public String mostrarCliente(){
        
        return "Nombre del cliente: " + getNombre() +"\n" + 
        "Apellidos del cliente: " + getApellidos() + "\n" +
        "Código de cliente: " + getCodigo() + "\n" +
        "Número de teléfono: " + getTelefono() + "\n" +
        "Saldo de la cuenta: " + getSaldo()+"\n";
        
    }
    
    
}//fin de la clase
