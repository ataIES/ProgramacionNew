package ejemplos.ejemploequalsycomparable;

import java.util.Objects;

/**
 *
 * @author cic
 */
public class Persona implements Comparable<Persona> {

    private int id;
    private String nombre;
    private String apellido;

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    @Override
    public int compareTo(Persona o) {
        return this.id - o.id;
    }
    //todas las clases implementan un método hashcode que permite recueprar el código que por defecto
    //asigna Object
    //Normalmente se sobrescribe el método para que se comporte de forma acorde a la que lo hace .equals(), es decir, 
    //si el método .equals() nos dice que dos objetos son iguales, estos han de tener el mismo valor hash.
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
