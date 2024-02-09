/*
 * Otra clase, denominada Banco estará formada por un array de usuarios del banco y un contador de usuarios de banco.  
Un constructor que introduce por parámetro el número máximo de clientes de un banco inicializando a ese número los usuarios del banco. 
Métodos que permitan ingresar un usuario (tendremos en cuenta que el código de usuario corresponde con el número del usuario del banco) 
y el resto de los datos se piden por teclado, 
buscar un usuario devuelve una cadena de texto con la información del usuario, 
eliminar un usuario y mostrar que nos muestra la relación de los usuarios del banco. 
En los dos últimos métodos tendrán como parámetro de entrada él código de usuario. 
Siempre controlando que no podemos sobrepasar el número de usuarios del banco.
 */
package ejercicios_clase.unidad_04.hoja_06;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Banco {
    
    private int clientes;
    private Cliente[] clientesBanco;
    
    public Banco(int nummax){
        
        clientes = 0;
        clientesBanco = new Cliente[nummax];
        
    }
    
    public void insertarCliente(){
        int inicio = 100;//código inicial
        int codigo1 = 0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Alta de Cliente en el banco");
        
       
        System.out.println("Introduce el nombre de tu cliente: ");
        String nombre1 = teclado.nextLine();
        
        System.out.println("Introduce los apellidos de tu cliente:");
        String apellidos1 = teclado.nextLine();
        
        System.out.println("Introduce el teléfono del cliente: ");
        String telefono1 = teclado.nextLine();
        
        System.out.println("Introduce el saldo de la cuenta:");
        double saldo1 = teclado.nextDouble();
        
       if(this.clientes==0){
        codigo1 = inicio;    
       }
       else{
           
           codigo1= clientesBanco[this.clientes-1].getCodigo()+1;
       }
     
        
        clientesBanco[this.clientes] = new Cliente(codigo1, nombre1, apellidos1, telefono1, saldo1);
        this.clientes++;
    }
    
    
    //buscar un usuario devuelve una cadena de texto con la información del usuario, 
    //busca según el código
    
    public String buscar(int codigo1){
        String mensajeNoHay="El cliente no existe", mensaje="";
        boolean encontrado=false;
        
        for(int i=0; i<this.clientes; i++){
            if(clientesBanco[i].getCodigo()==codigo1){
                mensaje=clientesBanco[i].mostrarCliente();
                encontrado = true;
            }
            
        }
        
        if(encontrado==true){
            return mensaje;
        
        }
    else{
    return mensajeNoHay;
    }
    }
    
    //método para mostrar los clientes del banco
    public void mostrarClientes(){
        for(int i=0; i<this.clientes; i++){
            System.out.println(clientesBanco[i].mostrarCliente());
        }
        
    }
    
    
    public void darBaja(int codigo1){
       boolean resultado= false;
    for(int i=0; i<this.clientes; i++){
    
        if(clientesBanco[i].getCodigo() == codigo1){
            
            for(int j=i; j<this.clientes-1; j++){
                clientesBanco[j].setApellidos(clientesBanco[j+1].getApellidos()) ;
                clientesBanco[j].setCodigo(clientesBanco[j+1].getCodigo());
                clientesBanco[j].setNombre(clientesBanco[j+1].getNombre());
                clientesBanco[j].setSaldo(clientesBanco[j+1].getSaldo());
                clientesBanco[j].setTelefono(clientesBanco[j+1].getTelefono());
            }
            //vaciamos el último elemento
            clientesBanco[this.clientes-1].setApellidos("");
            clientesBanco[this.clientes-1].setNombre("");
            clientesBanco[this.clientes-1].setTelefono("");
            clientesBanco[this.clientes-1].setSaldo(0);
            clientesBanco[this.clientes-1].setCodigo(0);
            resultado=true;
            this.clientes--;
        }
        
        
        
        
    }
    if(resultado){
        System.out.println("cliente dado de baja");
    }else
    {System.out.println("El cliente no existe");
    }
    }
    
}//fin de la clase
