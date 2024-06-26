# TEMA 1 Elementos de un Programa Informático
## ***Crear nuestro Primer Programa***

Los pasos a realizar son: 
1. Abrir el entorno de netbeans
2. Seleccionar la opción de crear un proyecto nuevo con la categoría "Java with Maven" y proyecto "Java Aplication"
![](/Imagenes/JavaAplicattion.png)

3. Una vez seleccionado daremos nombre al proyecto y asignaremos un directorio donde se guardará el proyecto
![](/Imagenes/CreacionProyecto.png)

4. Y se nos genera un código
![](/Imagenes/Finalizarproyecto.png)

---

## ***Variables en Java***

Las variables son contenedores que sirven para almacenar los datos que utiliza un programa. Tienen un nombre (identificador) que solo contiene letras y números y el caracter de subrayado

```java
tipo nombreVariable;
```

## ***Ejemplos***

```java
int dias; // días es un número entero, sin decimales
boolean decision; //solo puede ser true o false
```
Se puede hacer que una variable tome un valor inicial
```java
int dias=365;
```
Y se puede declarar más de una variable a la vez del mismo tipo 
```java
int dias=365, anio=23, semanas=12;
```
## ***Tipos de Datos***

|  Tipo   | Tamaño |     Dato      |
| ------  | ------ | ------------- |
| Byte    |    8   |    Entero     |
| Short   |   16   |    Entero     |
| Int     |   32   |    Entero     |
| Long    |   64   |    Entero     |
| Float   |   32   | Coma Flotante |
| Double  |   64   | Coma Flotante |
| Boolean |   16   | Booleanos     |
| Char    |   8    | Carácter      |
---
## ***Caracteres Especiales***

| Caracter |    Significado   |
| -------- | ---------------  |
|   \b     |    Retroceso     |
|   \t     |    Tabulador     |
|   \n     |    Nueva Línea   |
|   \r     | Retorno de Carro |
|    "     | Dobles comillas  |
|    '     | Comillas Simples |
|    \     | Barra Inclinada  |

## ***Conversión entre tipos (Casting)***

```java
int a;
byte b;
b=(byte) a;
```
Otro ejemplo
```java
byte n1=100, n2=100, n3;
n3=(byte)(n1 * n2 / 100);
```

## ***Operadores***

| Operador | Descripción |
| -------- | ----------- |
|   +      | Suma dos operandos |
|   -      | Resta dos operandos |
|   *      | Multiplica dos operandos |
|   /      | Divide dos operandos |
|   %      | Calcula el resto de dividir el Operador1 entre el operador2 |

<<<<<<< HEAD
## ***Incrementales o unarios
=======
---

## ***Incrementales o unarios***

| Operador | Uso |           Descripción              | 
| ---------| ----| -----------------------------------|            
|    ++    | x++ |  Incrementa x en 1. Evalúa antes   |
|    ++    | ++x |  Incrementa x en 1. Evalúa después |
|    --    | x-- |  Decrementa x en 1. Evalúa antes   |
|    --    | --x |  Decrementa x en 1. Evalúa después |

```java
int x=5, y=5
System.out.println(++x); //Imprime 6
System.out.println(x);   //Imprime 6
System.out.println(y++)  //Imprime 5
System.out.println(y)    //Imprime 6
```

## ***Relacionales***

| Operador |  Uso  |     Devuelve Verdadero   |
|----------| ------| -------------------------|
|     >    |  x>y  | x es mayor que y         |
|     >=   |  x>=y | x es mayor o igual que y |
|     <    |  x<y  | x es menor que y         |
|     <=   |  x<=y | x es menor o igual que y |
|     ==   |  x==y | x es igual a y           |
|     !=   |  x!=y | x es distinto de y       |

## ***Lógicos***

| Operador |           Uso            |         Devuelve verdadero         |
| -------- | -------------------------| -----------------------------------|
| && (and) | Condicion1 && Condicion2 | Condicion1 y Condicion2 verdaderas |
| "||(or)" | "Condicion1||Condicion2" | Condicion1 o Condicion2 verdaderas |
| !( not)  | !Condicion               | Condicion falsa                    |

## ***Asignación***

| Operador | Uso      |       Descripcion        |
| ---------| ---------| -------------------------|
|     =    | x=y      | Asigna a x el valor de y |
|     +=   | x+=valor | Equivalente a x=x+valor  |
|     -=   | x-=valor | Equivalente a x=x-valor  |
|     *=   | x*=valor | Equivalente a x=x*valor  |
|     /=   | x/=valor | Equivalente a x=x/=valor |

## ***Ternario***

Este operador devuelve un valor que se selecciona de dos posibles. Puede tomar dos valores verdadero o falso
```java
expresioncondicional ? valor1 : valor2
```
En caso de que se devuelva verdadero, devuelve valor1, y cuando resulte false, devuelve valor2
```java
int num=11;
int valorAbs=num>0?num:-num;

System.out.println("El valor absoluto de "+num+" es: "+valorAbs);
```
## ***Constantes***

Es una variable de sólo lectura. Es un valor que no puede variar (por lo tanto no es una variable). 
Las constantes deberían en mayúsculas.
```java
final int MAXIMO=999999;
```
---
## ***Escritura por pantalla***

### ***Orden Printf***

Utiliza códigos de conversión para indicar de qué tipo es el contenido a mostrar. Se caracterizan porque llevan delante el simbolo %.

* %c: Escribe un carácter
* %s: Escribe una cadena de texto
* %d: Escribe un entero
* %f: Escribe un número en punto flotante
* %e: Escribe un núemro en punto flotante en notación científica

```java
System.out.printf("%,.2f\n",12345.1684);
```

### ***Lectura por Teclado***

Se hace de tres formas distintas:
1. Visualizando una caja por pantalla
* Hay que incluir el paquete javax.swing y utilizar la clase JOptionPane:
```java
import javax.swing.JOptionPane;

String texto; 
int num;

texto= JOptionPane.showInoutDialog("Escribe un número");
num=Integer.parseInt(texto);
System.out.println("Has introducido el número "+num);

//Mostrando el resultado en un cuadro de diálogo
JOptionPane.showMessageDialog(null,"Has introducio el número "+num);

//Mensaje de advertencia
JOptionPane.showMessageDialog(null, "Advertencia","Peligro",JOptionPane.Warning_Message);

//Mensaje de Error
JOptionPane.showMessageDialog(null,"Error","Fatal Error",JOptionPane.Error_Message);

//Mensaje de pregunta
JOptionPane.showMessageDialog(null,"Pregunta","Mensaje de Pregunta",JOptionPane.Question_Message);
```

2. Usando la clase System

Con esta opción, se va a capturar el contenido de System.in, mediante el uso de dos clases que se encuentran dentro del paquete java.io(import java.io.*)

* InputStreamReader: Captura los bytes del buffer y los convierte a caracteres
* BufferedReader: Clase que proporciona un método que permite leer hasta el final de la línea

```java
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(isr);

System.out.println("Introduce un número:m ");
String cad= br.readLine();

//Conversión de la variable cad a el tipo de dato que quiero
int num1=Integer.parseInt;
System.out.println(num1);
```

3. Usando la clase Scanner
```java
int edad;
String nombre,apellido;
Scanner teclado=new Scanner(System.in);
       
System.out.println("Introduce tu nombre: ");
nombre=teclado.nextLine();
        
System.out.println("Introduce tus apellidos: ");
apellido=teclado.nextLine();
        
System.out.println("Introduce tu edad: ");
edad=teclado.nextInt();
        
System.out.println("Nombre: "+nombre+"\nApellidos: "+apellido+"\nEdad: "+edad);
```
## ***Enumerados***
Son una forma de declarar una variable con un conjunto restringido de valores
```java
enum TamanoDeCafe{PEQUEÑO,MEDIANO,GRANDE};
```
O creando una clase aparte
```java
public class Ejemplo_Enumerados {
    public enum nivel{
        BAJO,MEDIO,ALTO;
    }
```

 






