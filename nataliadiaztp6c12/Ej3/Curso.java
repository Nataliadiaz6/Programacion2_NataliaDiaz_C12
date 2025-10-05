/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej3;

import java.util.Objects;

/**
 *
 * @author Natalia
 */
public class Curso {
    
    private String codigo;
    private String nombre;
    private Profesor profesor; // Referencia al Profesor responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) return;
       
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this); 
        }

        this.profesor = p;

        if (profesor != null && !this.profesor.getCursos().contains(this)) {
           profesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "SIN ASIGNAR";
        System.out.println("\nCurso: "+codigo +", "+ nombre+"\nProfesor: "+ nombreProfesor);
    }
}
     