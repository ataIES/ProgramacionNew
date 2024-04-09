# CADENAS DE TEXTO EN JAVA
## ***Introducción***
La clase String nos permitirá almacenar cadenas de caracteres. Es dinámica, por lo tanto le podemos asignar diferentes valores(cadenas)con diferente tamaño.

### ***Creación***
Podemos tratarla como un dato primitivo. Una vez asignado un valor este es inmodificable. Cada vez que se asigna un nuevo valor(nueva cadena), provoca una nueva instanciación interna pero transparentes para nosotros.

```java
public class usoString{
    public static void main(String[] args){
        String modulo="programación";
        String ciclo= new String();
        ciclo="Desarrollo de Aplicaciones Web";
    }
}
```
### ***Asignación de valores***
Se representa con comillas dobles. Las dobles comillas no forman parte de la cadena. Si queremos que la propia " sea un carácter en sí, y no el final de la cadena, hay que antepones la secuencia escape.

```java
System.out.println("*****ASIGNACION DE VALORES*****");
String introduccion;
introduccion="Trataremos inicialmente los 'String' para el manejo de cadenas. Son
muy \"IMPORTANTES\"");
```
### ***Extracción de un carácter individual***
Con el método charAt(posicion), podemos acceder al carácter que ocupa dicha posición.

```java
 for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
               frase_convertida+="o";
            }else{
                frase_convertida+=frase.charAt(i);
            }
        }
```
### ***Obtener la longitud de la cadena***
Nos proporciona la longitud de la cadena, incluyendo espacios en blanco ocupados dentro de la cadena. Para ello se hace el uso del método lenght().

```java
public static void main(String[] args) {
        String nombre = "Adrián", primerApellido = "Tresgallo", segundoApellido = "Arozamena";
        //Concateno los dos apellidos con mi nombre con nombre.concat
        nombre = nombre.concat(" " + primerApellido + " " + segundoApellido);
        //Muestro mi nombre completo y la longitu
        System.out.println("Mi nombre es: " + nombre + "\nLongitud: " + nombre.length());
    }
```
---
### ***Descomposición de una cadena***
Es un método que permite extraer una subcadena, indicando la posición inicial y final

```java
System.out.println("*****Extraccion de una subcadena*****");
System.out.println("Subcadena de la cadena ciclo de las cuatro primeras caracteres
que podemos nombrar como 0, 1, 2, 3 (el número de caracteres es cuatro). El
carácter final indicado en la llamada al método, el número 4, queda excluido del
substring.: "+ciclo.substring(0,4);
```
### ***Igualdad de dos cadenas***
Si queremos averigüar si dos cadenas son iguales, distingue si está en mayúsculas o minúsculas. Si necesitamos preguntar sin distinguir mayúsculas de mnúsculas, utilizamos equalsIgnoreCase().

```java
System.out.println("*****COMPARACIÓN ENTRE CADENAS*****);
String texto1="Buenos días";
String texto2=new String("Buenos días");
System.out.println("¿Las cadenas son iguales?: "+texto1.equals(texto2));
System.out.println("¿Las cadenas son iguales?: " + texto1==texto2); // El
resultado de esta instrucción puede ser incorrecto.
```
### ***Otras funciones***
* startsWith(subcadena) y endsWith(subcadena): Para comprobar si una cadena comienza o termina con la subcadena determinada.
```java
public static void main(String[] args)
{
	String cdn="Hola, me llamo adrian";
	String msj = "Valor devuelto: ";

	System.out.println(msj + cdn.startsWith("Hola"));
	System.out.println(msj + cdn.startsWith("llamo"));
	System.out.println(msj + cdn.endsWith("adrian",15));
}
```
* trim(): Elimina los espacios en blanco de una cadena que tenga por delante y por detrás. No elimina los espacios intermedios
```java
String sCadena = " Esto Es Una Cadena " ;
System.out.println(sCadena.trim());  //Devuelve "Esto Es Una Cadena"
```

* toUpperCase() y toLowerCase(): permite cambiar todos los caracteres por mayúsculas o minúsculas

```java
 public static void main(String[] args)
{
	String cdn="Hola, me llamo adrian";
	String msj = "Valor devuelto: ";

	System.out.println(msj + cdn.toUpperCase());
	System.out.println(msj + cdn.toLowerCase();
}
```
* indexOf(cadenaABuscar): permite buscar una cadena dentro de otra
```java
public static void main(String[] args)
{
	String cdn="Hola, me llamo adrian";
	String msj = "Valor devuelto: ";

	System.out.println(msj + cdn.indexOf("llamo"));
	System.out.println(msj + cdn.indexOf("Hola",0);
}
```

* replace(cadenaABuscar,cadenaSustituta):permite reemplazar una cadena por otra
```java
public static void main(String[] args)
{
	String cdn="Hola, me llamo adrian";
	String msj = "Valor devuelto: ";

	System.out.println(msj + cdn.replace("me","no me"));
}
```

* lastIndexOf(String cad): Retorna la posición de la ultima ocurrencia de la cadena

* lastIndexOf(String cadena, int ini): Retorna la posición de la ultima ocurrencia de la cadena dada como parámetro buscando en retroceso a partir de la posición dada como parámetro



