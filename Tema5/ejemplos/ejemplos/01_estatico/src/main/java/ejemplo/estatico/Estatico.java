

package ejemplo.estatico;

/**
 *
 * @author cic
 */
public class Estatico {

    public static void main(String[] args) {
         // podemos llamar a la funcion estática sin crear ningún objeto
        System.out.println(Bicicleta.getNumeroDeBicicletas());

        Bicicleta bici1 = new Bicicleta(21, 27, 0);
        Bicicleta bici2 = new Bicicleta(18, 24, 0);

        System.out.println(bici1);
        System.out.println(bici2);

        // podemos también desde el objeto llamar al método estatico NO Recomendable
        System.out.println("llamando al objeto bici1 "+bici1.getNumeroDeBicicletas());
        // es mas correcto no realizarlo dependiendo del objeto. Depende de la clase
        System.out.println("llamando a la clase "+ Bicicleta.getNumeroDeBicicletas());
    }
}
