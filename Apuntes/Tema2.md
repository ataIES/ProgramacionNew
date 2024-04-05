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