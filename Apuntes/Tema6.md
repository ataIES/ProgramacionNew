# ***TEMA6 ESTRUCTURAS DE ALMACENAMIENTO DINÁMICAS - COLECCIONES Y MAPAS

## ***Introducción***

* **Colecciones**: Interfaces que identifica una colección de objetos independientes.
* **Contenedores**: Implementan colecciones. Serán ArrayList, HashSet,LinkedList, et.
* **Algoritmos**: Trabajan sobre las colecciones.


|     Clase     | Map | Set | List |   Ordenados     | No Duplicados |
|    ---------- | --- | --- | ---- | --------------  | ------------- |
|   ArrayList   |     |     |   X  |                 |               |
|  LinkedList   |     |     |   X  |  Por insercción |               |
|    HashSet    |     |  X  |      |  Desordenados   |        X      |
| LinkedHashSet |     |  X  |      |  Por inserción  |        X      |
|    TreeSet    |     |  X  |      |  Orden natural  |        X      |
|    HashMap    |  X  |     |      |  Desordenados   |        X      |
| LinkedHashMap |  X  |     |      |  Por insercción |        X      |
|    TreeMap    |  X  |     |      |  Orden Natural  |        X      |

## ***Genéricos***

Es una clase contenedor que sirve para todo tipo de objeos y que a su vez permita en cada caso ese => **Una clase contenedor con tipo genérico T**

```java
public class Contenedor<T>{
// atributo
private T objeto;
// se inicializa a null contenedor vacío
public Contenedor(){
}
// agregar un objeto
public void guardar (T nuevo){
    objeto=nuevo;
}
// sacar el objeto
public T extraer(){
    T res=objeto;
// el contenedor vuelve a estar vacío
    objeto=null;
    return res;
}
}
```

En general, se usa la letra T para el tipo genérico, U para arrays, E para elementos de Colecciones, K para claves, V para valores o N para números

* Si claseLimite es un límite superior, definiremos

```java
class nombreClase <T extends claseLimite>
```

* Si clase límite es un límite inferior, definiremos

```java
class nombreClase <T super claseLimite>
```

### ***Comodines o WildCards***

Los comodines se usan en la declaracion de atributos, variables locales o parámetros pasados por métodos. **Un comodín representa un símbolo ? Significa cualquier tipo**

```java
Contenedor<?> contenedor
```

### ***Cosas que no se pueden hacer***

1. Los tipos genéricos nunca pueden ser primitivos. Cuando nos hagan falta, usaremos las clases envoltorio Integer, Character ...

2. No se pueden crear instancias de tipo Genérico, como en new T();

3. No se pueden crear arrays de tipos genéricos, como en new T[10]. Cuando se necesiten se pasan como argumento al método donde van a ser usadas.

4. Tampoco se pueden crear arrays de clases parametrizadas, como new Contenedor[5];

5. No se pueden usar expresiones genéricas

## ***Interfaz Collection***

Es la raíz del funcionamiento de las colecciones y representa objetos que tienen la capacidad de almacenar listas de otros objetos

### ***Métodos***

* Size: Devuelve el número de elementos

* add: Inserta un objeto. Devuelve true o false

* contains: Indica si un objeto pertenece a la colección

* remove: Elimina un objeto. Devuelve true o false

* clear: Limpia todas las referencias

* iterator: Devuelve un objeto iterado

* addAll: Añade todos los elementos de la colección pasada por argumentos

* containsAll: Indica si todos los objetos pertenecen a la colección

* removeAll: Elimina todos los objetos

* retainAll: Elimina todos los objetos que no estén pasados por parámetros

### ***Formas de recorrer colecciones***

* Bucle For-each

```java
for( String elemento:collection){
    system.out.println(elemento);
}
```

* Iteradores

```java
Iterator <String> it = collection.iterator();
while (iterator.hasNext()){
    String cadena=it.next();
    system.out.println(cadena);
}
```

## ***Interface List***

* Los elementos tienen posición

* Permite duplicados

* Permite buscar e iterar

* Si no sabemos cual escoger, utilizar ArrayList

* Inclusión de genéricos

* Permiten parametrizar el tipo

* Operador diamond

### ***Métodos List***

* set: Sustituye el elemento número indice por uno nuevo. Devuelve además el elemento antiguo

* get: Obtiene el elemento almacenado en la posicion que se indique

* indexOf: Devuelve posición del elemento. Si no existe, devuelve -1;

* lastIndexOf: Devuelve la posición del elemento comenzando por el final. Devuelve -1 si no existe

## ***Interfaz Queue***

* Una cola es una estructura del tipo FIFO(First input, First output)

* Está diseñada para que los elementos sean insertados al final de la cola y los elementos eliminados sean los del principio

* Se implementa con LinkedList

### ***Métodos Queue***

* peek: Devuelve el elemento anterior pero no borra la cabeza de cola

* element: Como la anterior pero lanza una excepcion si la cola está vacia

* poll: Devuelve y elimina la cabeza de cola

## ***Clase LinkedList***

### ***Métodos LinkedList***

* getFirst: Obtiene el primer elemento

* getLast: Obtiene el último elemento

* addFirst: añade el objeto al principio

* addLast: añade el objeto al final

* removeFirst: elimina el primer elemento

* removeLast: elimina el ultimo elemento

En caso de Implementar pilas, se añadirán mediante addLast, getLast, removeLast

En caso de implementar colas se añadirán mediante addFirst, getFirst,removeFirst

## ***Interfaz Set***

Representa una repetición de elementos que no pueden estar duplicados
Es el método equals el que se encarga de determinar si dos objetos son duplicados en la lista

### ***Clase HashSet***

Implementa listas sin duplicados. La naturaleza de las tablas hace que cuando se crean listas HashSet, no hay valores duplicados ni se garantiza orden.

* Utiliza el método equals para los duplicados

* También redefine el método hashCode

### ***Clase LinkedHashSet***

Se trata de una clase como la anterior pero mantiene el orden de insercción

### ***Interfaz SortedSet***

Es la encargada de definir una estructura en árbol

### ***Métodos SortedSet***

* first: Obtiene el primer elemento

* last: Obtiene el último elemento

* headSet: obtiene un sortedSet de todos los elementos menores que el objeto o

* tailset: Obtiene un sortedSet de todos los elementos mayores que el objeto o

* subSet: Devuelve la posición dentro del árbol (-1 si no existe)

### ***Clase TreeSet***

Se trata de una clase que utiliza para conseguir árboles ordenados ya que implementa la interfaz SortedSet
Se puede determinar el orden del árbol por lo que habrá que implementar Comparable. Esta interfaz define compareTo que utiliza como argumento un objeto y que devuelve 0 si son iguales, un número número positivo si el primero es mayor que el segundo y negativo en caso contrario.

## ***Interfaz Map***

Representa una extructura de datos para almacenar clave/valor

### ***Métodos Map***

* empty: devuelve true si no hay elementos en el map

* put(K clave, V valor): añade elementos al map

* get(K clave): devuelve el valor de la clave o null si no existe la clave

* clear: borra todos los componentes del map

* remove(K clave):  Borra el par clave/valor

* containsKey(K clave): Devuelve true si hay una clave que coincide con K

* containsValue(V valor): Devuelve true si hay una clave que coincide con V
  
* values: Devuelve una coleccion con los valores del Map
