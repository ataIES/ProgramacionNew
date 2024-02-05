package ejemplos.ejemploequalsycomparable;

import java.util.Arrays;

/**
 *
 * @author cic
 */
public class ListaPersona {

    private Persona[] persona;
    private int contador;

    public ListaPersona() {
        persona = new Persona[10];
        contador = 0;
    }

    public void insertar(Persona persona) {
        if (contador < this.persona.length) {
            this.persona[contador] = persona;
            contador++;
        }
    }

    public void mostrar() {
        for (int i = 0; i < contador; i++) {
            System.out.println(persona[i].toString());
        }
    }

    public void ordenar() {
        Arrays.sort(persona, 0, contador);
    }

    public void buscar(Persona persona) {
        for (int i = 0; i < contador; i++) {
            if (this.persona[i].equals(persona)) {
                System.out.println("Encontrado en la posicion " + (i + 1));
            }
        }
    }
}
