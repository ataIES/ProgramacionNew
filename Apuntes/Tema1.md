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

## ***Relacionales ***
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
| || (or)  | Condicion1 || Condicion2 | Condicion1 o Condicion2 verdaderas |
| !( not)  | !Condicion               | Condicion falsa                    |

## ***Asignación***
| Operador | Uso      |       Descripcion        |
| ---------| ---------| -------------------------|
|     =    | x=y      | Asigna a x el valor de y |
|     +=   | x+=valor | Equivalente a x=x+valor  |
|     -=   | x-=valor | Equivalente a x=x-valor  |
|     *=   | x*=valor | Equivalente a x=x*valor  |
|     /=   | x/=valor | Equivalente a x=x/=valor |






