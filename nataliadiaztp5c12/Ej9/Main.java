/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej9;

/**
 *
 * @author Natalia
 */
public class Main {
     public static void main(String[] args){
        Paciente p = new Paciente("Carla","OSDE");
        Profecional pr = new Profecional("Dr. Ruiz","Cardiologia");
        CitaMedica c = new CitaMedica("2025-07-01","10:00",p,pr);
        System.out.println("Cita para " + c.getPaciente().getNombre() + " con " + c.getProfecional().getNombre());
    }
}
