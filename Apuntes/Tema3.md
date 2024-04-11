# Tema 3 Estructuras De Control

## ***IF - Sentencia Condicional Simple***

Se trata de una sentencia que, tras evaluar una expresión lógica, ejecuta una serie de instrucciones en caso de que la expresión lógica sea verdadera.

```java
if(expresión lógica){
    instrucciones 
    .....
}

//Ejemplo
if(nota>=5){
    System.out.println("Aprobado");
    aprobados++;
}
```
También se puede crear el if sin llaves

```java
if(expresión logica) sentencia;
//Ejemplo
if(notas<5)
    System.out.println("Suspenso");
```

## ***IF - Sentencia Condicional Compuesta***

```java
if(expresión lógica){
    instrucciones
    ....
}else{
    instrucciones
    .....
}
//Ejemplo

if(nota>=5){
    System.out.println("Aprobado");
    aprobados+++;
}else{
    System.out.println("Suspensos");
    suspensos++;
}
```

## ***IF - Anidación***

Dentro de una sentencia if se puede colocar otra sentencia if. Permite crear programas donde se valoren expresiones complejas.

```java
if(x==1){
    instrucciones
    ...
}else{
    if(x==2){
        instrucciones
        .....
    }else{
        if(x==3){
            instrucciones
            ...
        }
    }
}
```

Una forma más elegible de escribir sería con la instruccion if-else-if

```java
if(x==1){
    instrucciones
    ...
}else if(x==2){
    instrucciones
    ...
}else if(x==3){
    instrucciones
    ....
}
```

## ***Switch***

Se llama estructura condicional compleja porque permite evaluar varios valores a la vez. Sirve como sustituta de algunas expresiones del tipo if-else-if

```java
switch(expresiónEntera){
    case valor1:
        instrucciones del valor 1
        break;
    case valor2:
        instrucciones del valor2
        break;
    ...
    default:
        /*instrucciones que se ejecutan si la expresión 
        no toma ningun de los valores anteriores*/
}
```

Otra sintaxis de la expresión es: 

```java
switch (expresiónEntera){
    case valor1-> instrucciones del valor1;
    case valor2-> instrucciones del valor2;
    ....
    default-> instrucciones que se ejecutan si la expresión no toma ninguno de los valores anteriores
}
```

## ***While - Sentencia repetitiva mientras***

Permite crear bucles. Es un conjunto de sentencias que se repiten mientras se cumpla una determinada condición.

```java
while(expresión lógica){
    sentencias que se ejecutan si la condición es true;
}
```

El programa se ejecuta siguiendo: 

1. Se evalúa la expresión lógica
2. Si la expresión es verdadera ejecuta las sentencias, sino el programa abandona la sentencia
3. Tras ejecutar, volvemos al paso 1;

```java
int i=1;
while (i<=100){
    System.out.println(i);
    i++;
}
```

---

### ***Bucles con contador***

Se llaman así a los bucles que se repiten una serie determinada de veces. El contador es una variable que va variando su valor (de uno en uno, de dos en dos...) en cada vuelta del bucle

En todos los bucles de contador necesitamos saber:

1. Lo que vale la variable contadora al principio. Antes de entrar en el bucle
2. Lo que varía (lo que se incrementa o decrementa) el contador en cada vuelta
3. Las acciones a realizar en cada vuelta de bucle
4. El valor final del contador. En cuanto se rebase el bucle termina

```java
for(int lineas=1; lineas<=numFilas; lineas++){
            
            
            for(int asteriscos=1; asteriscos<=(2*lineas)-1; asteriscos++){
                
                System.out.print("*");
            }
            System.out.println();
        }
```

### ***Bucle con centinela***

Se trata de preguntar a cada ciclo del bucle por una condición lógica. Si esta condición se cumple, continuamos otro ciclo más en el bucle. Cuando la condición lógica deja de cumplirse, se sale del bucle.

```java
boolean salir=false; /* En este caso el centinela es una variable booleana que
inicialmente vale falso */

int n;
while(salir==false) // Condición de repetición: que salir siga siendo falso. Ese es el centinela.
    { //También se podía haber escrito simplemente: while(!salir)
        n=(int)Math.floor(Math.random()*499+1); // Lo que se repite en el bucle:
        System.out.println(i); // calcular un número aletorio de 1 a 500 y escribirlo
        salir=(i%7==0); //El centinela vale verdadero si el número es múltiplo de 7
    }
```

## ***DO WHILE - Sentencia repetitiva hacer mientras***

La única diferencia respecto a la anterior está en que la expresión lógica se evalúa después de haber ejecutado las sentencias. Es decir el bucle al menos se ejecuta una vez

1. Ejecutar sentencias
2. Evaluar expresión lógica
3. Si la expresión es verdadera volver al paso1, sino continuar fuera del while

```java
do{
    instrucciones
}while(expresión lógica);
```

Ejemplo

```java
int i=o;
do{
    i++;
    System.out.println(i);
}while(i<1000);
```

## ***FOR - Sentencia repetitiva para***

Es un bucle más complejo especialmente pensado para rellenar arrays o para ejecutar instrucciones controladas por un contador

```java
for(inicialización;condición;incremento){
    sentencias
}
```

1. Se ejecuta la instrucción de inicialización
2. Se comprueba la condición
3. Si la condición es cierta, entonces se ejecutan las sentencias. Si la condición es falsa, abandonamos el bloque for
4. Tras ejecutar las sentencias, se ejecutan la instrucción de incremento y se vuelve al paso 2

```java
for(int i=0;i<=1000;i++){
    System.out.println(i);
}
```

La ventaja es que el código se reduce.

```java
int i=0;/*Sentencia de inicialización*/
while(i<=1000)/*Condición*/{
    System.out.println(i);
    i++; //incremento
}
```

## ***Bucles anidados***

Se trata de usar estructuras de bucle dentro de otra ya existente

* While
* Do
* For

```java
Scanner entrada = new Scanner(System.in);
int numAsteriscosLado;
System.out.print("Introduce el número de astericos por lado: ");
numAsteriscosLado=entrada.nextInt();
//Dibujamos la parte de arriba del cuadrado

for(int cont=0;numAsteriscosLado>cont;cont++){
    System.out.print("*");
}
System.out.println("");
//Usamos un bucle anidado para dibujar los asteriscos del medio
//Calcula las filas intermedias poniendo un * al inicio y final de llas.
for(int cont=1;(numAsteriscosLado-2)>=cont;cont++){
    System.out.print("*");
    //Este bucle dibuja los espacio entre el primer y ultimo asterisco
    //de cada una de las filas.
for (int i=0;(numAsteriscosLado-2)>i;i++){
    System.out.print(" ");
}
System.out.print("*");
System.out.println("");
}
//Dibujamos la parte de abajo del cuadrado 
for(int cont=0;numAsteriscosLado>cont;cont++){
    System.out.print("*");
}
System.out.println("");
```
