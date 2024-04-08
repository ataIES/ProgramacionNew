/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.ejercicio2;

import java.util.Iterator;
import java.util.LinkedHashSet;

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
                System.out.println("Artículo " + codigoArticulo + " añadido correctamente");
            } else {
                throw new ExcepcionPersonalizada("Error, no se pudo añadir el articulo " + codigoArticulo);
            }
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    public Articulo buscarArticuloPorCodigo(String codigo) {
        Iterator<Articulo> it = listaArticulos.iterator();
        Articulo articulo = null;
        boolean encontrado = false;
        while (it.hasNext() || !encontrado) {
            articulo = it.next();
            if (articulo.getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = true;
            }
        }
        return articulo;
    }

    public void mostrarArticuloPorCódigo() {
        Articulo articuloAMostrar = null;
        String codigo = "";
        try {
            codigo = Teclado.introCodigo("Introduce el código a buscar: ");
            articuloAMostrar = buscarArticuloPorCodigo(codigo);
            if (articuloAMostrar!=null) {
                System.out.println(articuloAMostrar.mostrarArticulo());
            }else{
                throw new ExcepcionPersonalizada("Error, no existe el artículo "+articuloAMostrar.getCodigo());
            }
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.getMessage());
        }
    }

    public String pedidos() {
        String cadena = "";
        for (Articulo a : listaArticulos) {
            if (a.getExistencias() <= 5) {
                cadena += a.mostrarArticulo();
            }
        }
        return cadena;
    }
}
