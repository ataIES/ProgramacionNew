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


