/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej9;

/**
 *
 * @author Natalia
 */
public class CitaMedica {
    private String fecha; 
    private String hora;
    private Paciente paciente;
    private Profecional profecional;
    
    public CitaMedica(String fecha, String hora){
    this.fecha = fecha; 
    this.hora = hora; 
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profecional getProfecional() {
        return profecional;
    }

    public void setProfecional(Profecional profecional) {
        this.profecional = profecional;
    }

    public void mostrarDatos(){
        if (paciente != null && profecional != null){
           System.out.println("Datos de la cita medica:");
           System.out.println(paciente.toString()+ "\n"+ profecional.toString());
           System.out.println("Fecha: "+ fecha +"\nHora: "+ hora);
    } else {
            System.out.println("Faltan datos para la cita medica.");
    }
    }

}
