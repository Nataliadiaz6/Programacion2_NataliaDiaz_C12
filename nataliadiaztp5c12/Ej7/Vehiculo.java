/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej7;

/**
 *
 * @author Natalia
 */
public class Vehiculo {
    private String patente; 
    private String modelo; 
    private Motor motor; 
    private Conductor conductor;
    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor){
        this.patente = patente; 
        this.modelo = modelo; 
        this.motor = motor; 
        this.conductor = conductor;
        if(this.conductor != null) 
            this.conductor.setVehiculo(this);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
