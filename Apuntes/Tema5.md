# *** TEMA 5 USO AVANZADO DE CLASES***
## ***Miembros Estáticos o de Clase en Java***

Se trata de un atributo de la propia clase más que de un atributo de cada objeto de la clase

```java
public class Pajaro {

    private String color;
    private int edad;
    //Inicializo a 0 el atributo estático
    private static int numPajaros = 0;

      public static void nuevoPajaro() {
        numPajaros++;
    }
    public static int getNumPajaros() {
        return numPajaros;
    }

}
```

## ***Herencia de Clase***

Define una relación entre clases en la cual una clase posee características (métodos y propiedades) que proceden de otra. Para que una clase herede las características de otra hay que utilizar la palabra clave extends tras el nombre de la clase.

```java
//Clase padre
public class Animal {
    private String nombre;
    private String especie;
    private int tamanio;

    public Animal(String nombre, String especie, int tamanio) {
        this.nombre = nombre;
        this.especie = especie;
        this.tamanio = tamanio;
    }

    public void comer(){
        System.out.println("Como como un animal");
    }
    
    public void respirar(){
        System.out.println("Respiro como un animal");
    }
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", especie=" + especie + ", tamanio=" + tamanio + '}';
    }
    
    //Clase hija
    public class Pajaro extends Animal{
    private String colorPlumaje;
    private boolean anillado;

    public Pajaro(String colorPlumaje, boolean anillado, String nombre, String especie, int tamanio) {
        super(nombre, especie, tamanio);
        this.colorPlumaje = colorPlumaje;
        this.anillado = anillado;
    }

    @Override
    public void comer() {
        System.out.println("Como como un pajaro, no como un animal");
    }

    @Override
    public void respirar() {
        super.respirar(); 
    }
    
    @Override
    public String toString() {
        
        return super.toString()+" Pajaro{" + "colorPlumaje=" + colorPlumaje + ", anillado=" + anillado + '}';
    }
    
}
```

|           | La misma clase | Otra clase del mismo paquete | Subclase de otro paquete | Otra clase de otro paquete |
| --------- | ---------------| ---------------------------- | ------------------------ | -------------------------- |
|   public  |       x        |             x                |              x           |               x            |
| protected |       x        |             x                |              x           |                            |
|  default  |       x        |             x                |                          |                            |
|  private  |       x        |                              |                          |                            |

## ***Casting de Clases***

Es posible realizar un casting de objetos para convertir entre clases distintas. No se puede convertir objetos de una clase a otra, pero sí se utiliza el casting para convertir referencias para indicar la subclase concreta a la que pertenece la misma.

```java
Vehiculo v1=new Vehiculo();
Coche cocheAdrian = new Coche();
v1=cocheAdrian; //Esto si se permite
cocheAdrian=v1; //Error, tipos incompatibles
cocheAdrian=(Coche)v1; //Aquí tiene lugar el casting. Ahora si se permite, porque realmente v1 hace referencia a un coche
```

Para comprobar si el objeto pertenece a una clase, es con instanceOf y nos devolverá true o false

```java
if(empleados[i]instanceof Programador programaaux){
    lista[i]=programaaux;
}
```

## ***Clases abstractas***

Son clases bases para herencia, plantillas de clases. Estas clases no pueden ser instanciadas (no se pueden crear objetos pertenecientes a clases abstractas). Deberá ser marcada con la palabra clave abstract como cada método de la clase.

```java
public abstract class Figura {

    private double radio;
    private double altura;

    public Figura(double radio1, double altura1) {
        this.radio = radio1;
        this.altura = altura1;
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    public abstract double area();

    public abstract double volumen();
    
    public abstract void mostrar();
}
```

## ***Interfaces***

Es un contrato de compromiso. La clase que la implemente, tendrá que implementar dichos métodos abstractos que tenga esa interfaz

```java
public interface Interface1 {
    public void imprime();
}
public interface Interface2 {
    public void mostrar();
}
public interface GrupoInterfaces extends Interface1, Interface2{
    final double x=34;
    public void hagoAlgo(int y);
    public void hagoAlgoMas(String s);
       
}
```

## ***Tipos de Métodos***

* **Métodos por defecto:** Es un método que ya tiene implementación por defecto.

```java
public interface Interfaz {

    default public void metodoPorDefecto() {
        System.out.println("Este es método por defecto");   
    }
}
```

* **Métodos estáticos:** Funciona como un método estático, se puede llamar sin haber implementado la interfaz

```java
public interface Interfaz{
    public static void metodoEstatico(){
        System.out.println("Es un método estático");
    }
}
```

## ***Excepciones En Java***

Se denomina excepción a un hecho que podría provocar la detención del programa, es decir, una condición de error en tiempo de ejecución pero que puede ser controlable.

```java
try{
    instrucciones que se ejecutan salvo que haya un error
}catch(ClaseExcepcion objetoQueCaptura){
    instrucciones que se ejecutan si hay error
}
```

### ***Throws y throw***

* **Throws**

 ```java
 void usarArchivo (String archivo) throws IOException, InterruptedException {
...
}
```

* **Throw**

```java
try{
    	...
} catch(ArrayIndexOutOfBoundsException exc){
    throw new IOException();
} catch(IOException){
    ...
}
```

### ***Excepciones de Usuario***

```java
public class ExcepcionPersonalizada extends Exception {
    
    public ExcepcionPersonalizada(String mensaje){
        super(mensaje);
    }
}
```

## ***Finally***

Está pensada para limpiar el código

```java
try{
    ...
}catch (FileNotFoundException fnfe){
    ...
}catch(IOException ioe){
    ...
}catch(Exception e){
    ...
}finally{
    ...//Instrucciones de limpieza
}
```




