/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

/**
 *
 * @author Natalia
 */
public class EmpleadoTemporal extends Empleado {
    private int diasTrabajados; 
    private final double pagoPorDia = 30000.0;
    
    public EmpleadoTemporal(int diasTrabajados, String nombre) {
    super(nombre);
    this.diasTrabajados = diasTrabajados;

    }

    @Override
    public double calcularSueldo() {
        return this.pagoPorDia * this.diasTrabajados;
    }

    public int getDiasTrabajados() {
        return this.diasTrabajados;
    }    
}
