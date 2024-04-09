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
