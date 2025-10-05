/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Natalia
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos(){
        return Collections.unmodifiableList(cursos);
    }
    
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c) && c.getProfesor()== this) {
                c.setProfesor(null);
            }
        }
    
    public void mostrarInfo() {
        System.out.printf("\nEl profesor "+nombre+", id "+id+" tiene asignados los siguientes cursos: \n");
        for (Curso c: cursos){
            System.out.println("Nombre del curso: "+c.getNombre()+"\nCodigo del curso: "+c.getCodigo());
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.printf("  > No dicta cursos actualmente.\n");
            return;
        }
        System.out.println("\nCursos dictados por el profesor "+nombre+":");
        for (Curso c : cursos) {
            System.out.println(c.getCodigo()+", "+c.getNombre());
        }
    }

}
