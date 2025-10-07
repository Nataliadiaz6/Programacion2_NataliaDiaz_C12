/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

/**
 *
 * @author Natalia
 */
public abstract class Empleado {
    protected String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSueldo();
    
    public void mostrarInfo() {
        double sueldo = this.calcularSueldo();
        if (this instanceof EmpleadoPlanta) {
            System.out.println(this.getNombre() + " es Empleado de Planta y su sueldo es $" + sueldo);
        } else if (this instanceof EmpleadoTemporal) {
            EmpleadoTemporal temporal = (EmpleadoTemporal) this;
            System.out.println(this.getNombre() +  " es Empleado Temporal, trabajo " + temporal.getDiasTrabajados() + 
                    " dias y su sueldo es $" + sueldo);
        } else {
             System.out.println(this.getNombre() + " tiene un tipo de empleado desconocido.");
        }
    }
}
