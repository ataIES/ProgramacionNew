# TEMA 4 ESTRUCTURAS DE ALMACENAMIENTO ESTÁTICAS.ARRAYS

## ***Arrays Unidimensionales***

Declaración

```java
tipo[]nombre;
```

Ejemplo:

```java
double[]notas;
```

Tras la declaración del array, se tiene que inicializar. Eso lo realiza el operador new, que es el que realmente crea el array indicando un tamaño.

```java
double[]notas;//Declaración
notas= new Double[30];//Se crea el array con 30 valores de tipo double
```

También se puede hacer ambas operaciones

```java
double[]notas=new Double[30];
```

### ***Asignación***

Los valores del array se asignan utilizando el índice del mismo entre corchetes

```java
notas[18]=4.45;
```

También se pueden asignar valores al array en la propia declaración

```java
double[]notas={3.0,5.2,8,0.5}//Esto crerá un array de 4 elementos
```

### ***Longitud***

Los arrays poseen un método que permite determinar cuánto mide un array, es decir, cuántos elementos tiene el array

```java
int a[]=new int[17];
System.out.printl(a.lenght);//Escribe 17
```

### ***Inicialización***
```java
int notas[]=new notas[16];
...
notas=new notas[25];
```

### ***Recorrer un array***

* FOR

```java
for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Introduce el nombre del " + (i + 1) + "º alumno: ");
            alumnos[i] = teclado.nextLine();
        }
```
* FOR-EACH

```java
for(int numero:nums){
    sum+=numeros;
}
```
---
## ***ARRAYS MULTIDIMENSIONALES***


```java
int matriz1[][] = {{101, 102, 103, 104, 105}, {201, 202, 203, 204, 205},
        {301, 302, 303, 304, 305}, {401, 402, 403, 404, 405}, {501, 502, 503, 504, 505}};
```

## ***ARRAYS DE OBJETOS***

```java
public class Almacen {
    private Articulo[]articulos;
    private int cont;

    public Almacen(int nArticulos) {
        this.articulos=new Articulo[nArticulos];
        this.cont=0;
    }
```
## CLASE ARRAYS DE JAVA

* **fill**: Permite rellenar todo un array unidimensional con un valor

```java
int valores[]=new int[23];
Arrays.fill(valores,-1);//Todo el array vale -1
```

También se puede decidir desde que índice hasta que índice rellenamos

```java
int valores[]=new int[23];
Arrays.fill(valores,5,8,-1);//Desde el elemento 5 al 7 valdrán -1
```

* **sort**: Ordena el array de forma ascendente. Puede todo el array o desde un elemento a otro

```java
int x[]={5,4,2,7,12,6,5};
Arrays.sort(x,2,5); //Solo se ordena desde el elemento 2 al 5
Arrays.sort(x);//Se ordena totalmente
```

* **equals**: Compara dos arrays y devuelve true si son iguales

```java
int a[]= {2,3,4,5,6};
int b[]= {2,3,4,5,6};
int c[]=a;
System.out.println(a==b); //false
System.out.println(Arrays.equals(a,b)); //true
System.out.println(a==c); //true
System.out.println(Arrays.equals(a,c)); //true
```

* **binarySearch**: Busca de forma ultrarápida en un array ordenado. Devuelve el índice en el que está colocado el elemento.

```java
int numeros{1,5,6,712,2,432};
Arrays.sort(x);
System.out.println(Arrays.binarySearch(x,8));
```

* **Copy of**: Obtiene copia de un array

```java
int a[]={1,4,6,7,5,12};
int b[]=Arrays.copyOf(a,a.lenght)// es {1,4,6,7,5,12}
```

* **copyOfRange**: Copy el array desde un elemento hasta otro

```java
int a[]{4,4,7,66,22};
int b[]=Arrays.copyOfRange(a, 3,5);
```

## ***MÉTODO MAIN***

- Comprueba que java está instalado
![](/Imagenes/java%20version.png)

- Introducir parámetros desde netbeans
![](/Imagenes/argumentos.png)

-Ahora desde el propio main

```java
 public static void main(String[] args) {
        if (args.length == 1) {
            int numeroDigitos = args[0].length();
            int num = Integer.parseInt(args[0]);
            int primerDig = num / 100;
            int segundoDig = (num / 10) % 10;
            int tercerDig = num % 10;
```




