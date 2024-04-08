# TEMA 2 UTILIZACIÓN DE OBJETOS Y DESARROLLO DE CLASES
## ***Java y la programación orientada a objetos(POO)***

Con la POO los problemas se dividen en objetos. Cada uno de ellos funcionan de forma totalmente independiente.

Un objeto es un elemento del programa que integra sus propios datos y su propio funcionamiento.
Una clase es lo que define a un tipo de objeto. Al definir una clase lo que se hace es indicar como funciona un determinado tipo de objetos.

### ***Elementos de la POO: clases y objetos***

Una clase es un tipo al cual pertenecen **objetos** o **instancias de la clase**.
* Atributos: Define sus propiedades (datos que almacena el objeto)
* Métodos: Define el código de sus métodos (comportamiento)

***Ejemplo***
```java
public class Pez {

    //Definimos atributos con su tipo y su nombre
    private String color;
    private String tipo;
    private int tamano;

    //contructores ->Permiten instanciar la clase y su nombre es el mismo
    //contructor por defecto
    public Pez() {

    }

    //constructor un parámtero del tipo int parámetros
    public Pez(int _tamano) {
        tamano = _tamano;
    }

    //constructor de tres parámetros
    public Pez(String miColor, String miTipo, int miTamano) {
        color = miColor;
        tipo = miTipo;
        tamano = miTamano;
    }

    //Definimos los métodos
    public void respirar() {
        //contenido del método
    }

    public void nadar() {
        //contenido del método
    }

    public void alimentarse() {
        //contenido del método
    }

    //Métodos get y set para obtener y modificar los atributos de la clase
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    
}
```
---

### ***Uso de clases y objetos***

Una vez tenemos creada la clase, vamos a proceder a crear un objetos. A la creación de un objeto se denomina instanciación del objeto, o crear una instancia de la clase

Para utilizar un objeto primero se debe definir una variable que lo referenciará
```java
Clase variable
```
Luego se crea el objeto
```java
variable=new Constructor(lista de parámetros);
```

Más ejemplos de creación de objetos de la clase Pez
```java
Pez carpa=new Pez();
Pez grande=new Pez(50);
Pez cometa= new Pez("Naranja","Cometa",8);
```

### ***Palabra reservada this***

Su utilidad es resolver ambigüedades cuando existen atributos con el mismo identificador que alguna variable local o parámetro.

```java
public class Pez
{
    private int tamano;
    public Pez(int tamano)
    {
        this.tamano=tamano;
    }
}
```

### ***Métodos get y set***

Sirve para obtener o modificar los atributos de una clase
 ```java
  //Método para obtener el radio del circulo
    public double getRadio() {
        return radio;
    }

    //Método para asignar el valor de radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
```
### ***Operador "."***

Se utiliza para acceder a los miembros de una clase

```java
//Introduzco la radio por teclado para c3
System.out.println("Introduce un radio para c3: ");
radio = teclado.nextDouble();
c3 = new Circulo(radio);

//Cambiamos el radio de c1 a 5
c1.setRadio(5);
System.out.printf("El radio de c1 es: %.2f", c1.getRadio());
```
### ***Modificadores de Acceso***

|           | La Misma Clase | Otra clase del mismo paquete | Subclase de otro paquete | Otra clase de otro paquete |
|-----------| -------------- | ---------------------------- | ------------------------ | -------------------------- |
| public    |       x        |              x               |              x           |               x            |
| protected |       x        |              x               |              x           |                            |
| default   |       x        |              x               |                          |                            |
| private   |       x        |                              |                          |                            |
---

### ***Definir Métodos***

Un **método** es una llamada a una operación de un determinado objeto. La mayoría de métodos devuelven un resultado (gracias a un return). Si el método no devuelve ningún resultado se indica como tipo de datos a devolver el tipo void.

Para construir un método necesitamos: 
1. Sus especificadores de alcance o visibilidad
2. El tipo de datos o de objeto que devuelve
3. El identificador del método
4. Los parámetros 
5. El cuerpo del método

```java
 public boolean esEquilatero() {
        boolean equilatero = false;
        if (lado1 == lado2 && lado2 == lado3) {
            equilatero = true;
        }
        return equilatero;
    }
```

### ***Constructores***
Es un método que se invoca cuando se crea un objeto y que sirve para iniciar los atributos del objeto

#### ***Constructor por defecto***
```java
public Rectangulo() {

    }
```

#### ***Constructor por parámetros***
```java
public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }
```
#### ***Constructor Copia***

```java
public class Noria
{
    private double radio;

public Noria(){
    this.radio = 55;
}
public Noria(double radio){
    this.radio = radio;
}
public Noria(Noria n){
    this.radio=n.radio;
}
}
```

### ***Métodos recursivos***
Es una técnica de escritura de métodos o funciones, pensada para problemas complejos. La idea parte de que un método puede invocarse a sí mismo.
```java
public class Matematicas
{
    	public double factorial(int n)
    {
        if(n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
```

