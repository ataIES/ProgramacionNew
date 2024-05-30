# ***TEMA 7 FICHEROS***

## ***CLASE FILE***

* getName(): Obtiene el nombre del fichero
* getPath(): Obtiene la ruta del fichero
* getAbsolutePath(): Obtiene la ruta absoluta
* createNewFile():Crea un nuevo fichero
* delete():Borra el fichero
* exist():Mira si el fichero existe
* isDirectory():Mira si es un directorio
* isFile():Mira si es un fichero
* mkdir():Crea un directorio
* renameTo():Renombra un fichero
* listFiles():Lista todos los ficheros
  
```java
File fichero=new File("prueba.txt");
if(fichero.exists()){
    System.out.println("El fichero existe");
}else{
    System.out.println("El fichero no existe");
}
```

## ***FICHEROS DE TEXTO***

### ***Escribir byte a byte***

```java
public static void escribirByteAByte(File fichero){
int caracter;
FileOutputStream f = null;
System.out.println("escribe lo que quieras graba una línea");
try {
    f = new FileOutputStream(fichero);
    while ((caracter = System.in.read()) != '\n') {
        f.write((char) caracter);
    }
} catch (IOException e) {
    System.out.println(e.toString());
} finally {
    if (f != null) {
    try {
        f.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
}
```

### ***Leer byte a byte***

```java
public static void leerByteAByte(File fichero){
int caracter;
FileInputStream f = null;
try {
    f = new FileInputStream(fichero);
    while ((caracter = f.read()) != -1) {
        System.out.print((char) caracter);
    }
} catch (IOException e) {
    System.out.println(e.toString());
} finally {
    if (f != null){
        try {
            f.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero.");
            }
    }
}
}
```

---

### ***Escribir línea a línea***

```java
public static void escribirLineaALinea(File fichero) {
BufferedWriter br = null;
String frase;
Scanner e = new Scanner(System.in);
System.out.println("introduce la información que quieres grabar en el fichero");
frase = e.nextLine();
try {
    br = new BufferedWriter(new FileWriter(fichero, true));
    br.write(frase);
    br.write(System.lineSeparator());
} catch (IOException ex) {
    System.err.println(ex.toString());
} finally {
    if (br != null) {
        try {
            br.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar");
        }
    }
}
}
```

### ***Leer línea a línea***

```java
public static void leerLineaALinea(File fichero) {
BufferedReader br = null;
String linea;
try {
    br = new BufferedReader(new FileReader(fichero));
    while ((linea = br.readLine()) != null) {
        System.out.println(linea);
    }
} catch (IOException ex) {
    System.err.println(ex.toString());
} finally {
    if (br != null){
        try {
            br.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar");
        }
    }
}
}
```

## ***FICHEROS DE OBJETOS.SERIALIZACIÓN***

Para poder almacenar objetos de una clase en un fichero se necesita que la clase implemente la interfaz Serializable

### ***Escribir un objeto en un fichero***

```java
public static void Escribir(File fichero) {
ObjectOutputStream fo = null;
String marca="";
double velocidad;
int gasolina;
try {
    if(fichero.exists()){
        fo=new MiObjectOutputStream(new FileOutputStream(fichero,true));
    }else{
        fo = new ObjectOutputStream(new FileOutputStream(fichero));
    }
marca=Teclado.pedirMarca();
velocidad=Teclado.pedirVelocidad();
gasolina=Teclado.pedirGasolina();
Coche c = new Coche(marca,velocidad,gasolina);
fo.writeObject(c);
} catch (IOException ex) {
    System.err.println(ex.toString());
} finally {
    if (fo != null) {
    try {
        fo.close();
    } catch (IOException ex) {
        System.out.println("Error al cerrar el fichero");
    }
    }
}
}
```

### ***Leer los objetos de un fichero***

```java
public static void Leer(File fichero) {
ObjectInputStream os = null;
boolean fin = false;
try {
    os = new ObjectInputStream(new FileInputStream(fichero));
    Coche coche;
    while (!fin) {
        coche = (Coche) os.readObject();//Casting necesario
        System.out.println(coche.toString());
    }
} catch (EOFException e) {
    fin=true;
} catch (ClassNotFoundException e) {
    System.out.println("Error el tipo de objeto no es compatible");
} catch (FileNotFoundException e) {
    System.out.println("No se encontró el archivo");
} catch (IOException e) {
    System.out.println("Error " + e.getMessage());
} finally {
    if (os != null) {
        try {
            os.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar el fichero");
        }
    }
}
}
