/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

import java.util.ArrayList;

/**
 *
 * @author Natalia
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoTemporal(23, "Ana Gomez"));
        empleados.add(new EmpleadoPlanta("Juan Perez"));
        empleados.add(new EmpleadoPlanta("Maria Lopez"));
        empleados.add(new EmpleadoTemporal(13, "Carlos Ruiz"));

        for(Empleado emp : empleados) {
            emp.mostrarInfo(); 
        }
    }
    
}