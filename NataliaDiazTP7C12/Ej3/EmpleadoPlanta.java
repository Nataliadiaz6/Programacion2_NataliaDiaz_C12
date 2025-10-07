/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

/**
 *
 * @author Natalia
 */
public class EmpleadoPlanta extends Empleado {
    public EmpleadoPlanta(String nombre) {
    super(nombre);
    }

    @Override
    public double calcularSueldo() {
        return 1350000.00; 
    }
}
