/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natalia.diaz.c12.tp3;

/**
 *
 * @author Natalia
 */
public class Mascota {
    // Atributos de la clase
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;  
    }
    
//Método para mostrar info de la mascota
    public void mostrarInfo() {
        System.out.println("Informacion de la mascota: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
    }
    public void cumplirAnios(int anios) {
       edad += anios; //Acumulador
       System.out.println("Ahora " + nombre + " tiene " + edad + " anios.");
    }
}
