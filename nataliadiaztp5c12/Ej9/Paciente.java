/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej9;

/**
 *
 * @author Natalia
 */
public class Paciente {
    private String nombre; 
    private String obraSocial;
    public Paciente(String nombre, String obraSocial){ 
        this.nombre=nombre; 
        this.obraSocial=obraSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    
    @Override
    public String toString(){
        return ("Paciente: "+nombre+ "\nObra Social: "+ obraSocial);
    }
}
