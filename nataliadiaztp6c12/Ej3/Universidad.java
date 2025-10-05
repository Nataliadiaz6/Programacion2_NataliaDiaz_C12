/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Natalia
 */
public class Universidad {
    
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) {
            profesores.add(p);
            System.out.println("Profesor " + p.getNombre()+" agregado");
        } else {
            System.out.println("Profesor con ID "+p.getNombre()+" ya existe");
        }
    }

    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) {
            cursos.add(c);
            System.out.println("Curso "+c.getNombre()+" agregado.");
        } else {
            System.out.println("Curso con codigo "+c.getCodigo()+" ya existe");
        }
    }

    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Curso con codigo "+codigoCurso+" no encontrado.");
            return false;
        }
        if (profesor == null) {
            System.out.println("Profesor con ID "+idProfesor+" no encontrado");
            return false;
        }

        curso.setProfesor(profesor);
        System.out.println("El profesor "+profesor.getNombre()+" fue asignado al curso "+curso.getNombre());
        return true;
    }

    public void listarProfesores() {
        System.out.println("\n*** LISTADO DE PROFESORES EN "+nombre.toUpperCase()+" ***");
        if (profesores.isEmpty()) {
            System.out.println("  No hay profesores registrados.");
            return;
        }
        for (Profesor p : profesores) {
         
            p.listarCursos();
        }
    }

    public void listarCursos() {
        System.out.printf("*** LISTADO DE CURSOS EN "+nombre.toUpperCase()+" ***\n");
        if (cursos.isEmpty()) {
            System.out.println("  No hay cursos registrados.");
            return;
        }
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public boolean eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar != null) {
            cursoAEliminar.setProfesor(null); 
            cursos.remove(cursoAEliminar);
            System.out.println("Curso codigo "+codigo+" eliminado.");
            return true;
        }
        System.out.println("Error: Curso codigo "+codigo+" no encontrado");
        return false;
    }

    public boolean eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        if (profesorAEliminar != null) {
            List<Curso> cursosADesvincular = new ArrayList<>(profesorAEliminar.getCursos());
            for (Curso c : cursosADesvincular) {
                c.setProfesor(null); 
            }
            
            profesores.remove(profesorAEliminar);
            System.out.println("Profesor con ID "+id+" eliminado.");
            return true;
        }
        System.out.println("Error: Profesor con ID "+id+" no encontrado para eliminar.");
        return false;
    }

    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n*** REPORTE: Cantidad de Cursos por Profesor ***");
        if (profesores.isEmpty()) {
            System.out.println("  No hay profesores registrados para generar el reporte.");
            return;
        }

        for (Profesor p : profesores) {
            int cantidad = p.getCursos().size();
            System.out.printf("Cantidad de cursos del profesor "+p.getNombre()+": "+ cantidad+"\n");
        }
    }
}
