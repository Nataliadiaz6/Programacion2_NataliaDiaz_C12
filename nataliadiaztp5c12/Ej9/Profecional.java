/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej9;

/**
 *
 * @author Natalia
 */
public class Profecional {
    private String nombre;
    private String especialidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Profecional(String nombre, String especialidad){ 
        this.nombre=nombre; 
        this.especialidad = especialidad;
    }
    @Override
    public String toString(){
        return ("Profecional: "+ nombre + "\nEspecialidad: "+ especialidad);
    }
}
