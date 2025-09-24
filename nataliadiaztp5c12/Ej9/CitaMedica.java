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
    private Paciente paciente; 
    private Profecional profecional;
    public CitaMedica(String fecha, String hora, Paciente paciente, Profecional profecional){
        this.fecha = fecha; 
        this.hora = hora; 
        this.paciente = paciente; 
        this.profecional = profecional;
    }
}
