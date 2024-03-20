package tema6.ejercicio1;

import java.util.LinkedList;
import java.util.Iterator;

public class Academia {
    private LinkedList<Curso> listaCursos;

    public Academia() {
        this.listaCursos = new LinkedList<>();
    }

    public void insertarCursoAlFinal(Curso c) {
        listaCursos.addLast(c);
        c.setCodigo(listaCursos.lastIndexOf(c));
    }

    public void insertarCurso(Curso c, int posicion) {
        Curso cursoaux=listaCursos.get(posicion);
        try{
            if(cursoaux==null){
                c.setCodigo(posicion);
                listaCursos.add(posicion, c);
            }else{
                throw new ExcepcionPersonalizada("Error, ya existe un curso en esa posición.");
            }
        }catch(ExcepcionPersonalizada e){
            System.out.println(e.getMessage());
        }catch(IndexOutOfBoundsException a){
            System.out.println("Error");
        }
    }

    public Curso buscarCurso(int codigo) {
        Curso cursoaux = null;
        boolean encontrado = false;
        Iterator<Curso> it = listaCursos.iterator();
        while (it.hasNext()) {
            cursoaux = it.next();
            if (cursoaux.getCodigo() == codigo && !encontrado) {
                encontrado = true;
            }
        }
        return cursoaux;
    }

    public void borrarCurso(int codigo) {
        Curso cursoaux = buscarCurso(codigo);
        try {
            if (cursoaux != null) {
                if (listaCursos.remove(cursoaux)) {
                    System.out.println("Curso borrado correctamente");
                } else {
                    throw new ExcepcionPersonalizada("Error, no se pudo borrar el curso");
                }
            } else {
                throw new NullPointerException("Error, no existe el curso");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (ExcepcionPersonalizada e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarHoras(int codigo) {
        Curso cursoaux = buscarCurso(codigo);
        try {
            if (cursoaux != null) {
                cursoaux.setnHoras(Teclado.validarNúmeroHoras("Introduce las nuevas horas: "));
            } else {
                throw new NullPointerException("Error, no existe el curso");
            }
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        }
    }
    public String mostrarCurso(){
        String cadena="";
        for(Curso cursoaux:listaCursos){
            cadena+=cursoaux.mostrarCurso();
        }
        return cadena;
    }
}
