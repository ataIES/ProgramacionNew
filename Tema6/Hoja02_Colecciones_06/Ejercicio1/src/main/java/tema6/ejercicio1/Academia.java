package tema6.ejercicio1;

import java.util.LinkedList;

public class Academia {
    
    private LinkedList<Curso> listaCursos;
    
    public Academia() {
        this.listaCursos = new LinkedList<>();
    }
    
    public LinkedList<Curso> getListaCursos() {
        return listaCursos;
    }

    //Metodo que inserta un curso al final
    public void insertarCursoAlFinal(Curso c) {
        int pos = 1;
        listaCursos.addLast(c);
        pos += listaCursos.indexOf(c);
        listaCursos.getLast().setCodigo(pos);
        
    }

    //Metodo que inserto un curso en una posicion cualquiera
    public void insertarCurso(Curso c, int posicion) {
        listaCursos.add(posicion, c);
    }

    //Metodo que busca un curso por codigo
    public Curso buscarCurso(int codigo) {
        Curso cursoaux = null;
        boolean encontrado = false;
        for (Curso curso : listaCursos) {
            if (curso.getCodigo() == codigo && !encontrado) {
                cursoaux = curso;
                encontrado = true;
            }
        }
        return cursoaux;
    }

    //Metodo que borra un curso mediante por codigo
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

    //Metodo que modifica las horas mediante el código
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

    //Muestra el curso
    public String mostrarCurso() {
        String cadena = "";
        for (Curso cursoaux : listaCursos) {
            cadena += cursoaux.mostrarCurso();
        }
        return cadena;
    }
}
