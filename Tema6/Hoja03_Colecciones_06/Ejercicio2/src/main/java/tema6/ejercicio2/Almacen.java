/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

/**
 *
 * @author DAW125
 */
public class Almacen {

    private LinkedHashSet<Articulo> listaArticulos;

    public Almacen() {
        this.listaArticulos = new LinkedHashSet<>();
    }

    public void insertarArticulos(Articulo articuloNuevo) {
        String codigoArticulo = articuloNuevo.getCodigo();
        try {
            if (listaArticulos.add(articuloNuevo)) {
                System.out.println("Art�culo " + codigoArticulo + " a�adido correctamente");
            } else {
                throw new ExcepcionPersonalizada("Error, no se pudo a�adir el articulo " + codigoArticulo);
            }
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    private Articulo buscarArticuloPorCodigo(String codigo) {
        Iterator<Articulo> it = listaArticulos.iterator();
        Articulo articuloEncontrado = null;
        boolean encontrado = false;
        while (it.hasNext()) {
            Articulo articulo = it.next();
            if (articulo.getCodigo().equalsIgnoreCase(codigo) && !encontrado) {
                encontrado = true;
                articuloEncontrado=articulo;
            }
        }
        return articuloEncontrado;
    }

    public void mostrarArticuloPorCodigo() {
        String codigo = "";
        Articulo a = null;
        try {
            codigo = Teclado.introCodigo("Introduce el c�digo a buscar: ");
            a = buscarArticuloPorCodigo(codigo);
            if (a != null) {
                System.out.println(a.mostrarArticulo());
            } else {
                throw new NoSuchElementException();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Error, el articulo " + codigo + " no existe");
        }
    }

    public String pedidos() {
        String cadena = String.format("\n\t---Art�culos en el almac�n---");
        for (Articulo a : listaArticulos) {
            if (a.getExistencias() <= 5) {
                cadena += a.mostrarArticulo() + "\n";
            }
        }
        return cadena;
    }
}
