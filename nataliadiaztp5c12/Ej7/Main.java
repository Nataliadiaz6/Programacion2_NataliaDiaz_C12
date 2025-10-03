/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej7;

/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args){
        Motor m = new Motor("V6","MTR-9988");
        Conductor c = new Conductor("Nico","LIC-54321");
        Vehiculo v = new Vehiculo("ABC123","Sedan", m);
        v.setConductor(c);
        System.out.println("Vehiculo patente: " + v.getPatente() + ", conductor: " + v.getConductor().getNombre());
        v.mostrarMotor();
    }
}
