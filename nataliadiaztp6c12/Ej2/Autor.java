/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej2;

/**
 *
 * @author Natalia
 */
public class Autor {
    private final String id; 
    private String nombre;
    private String nacionalidad;

public Autor(String id, String nombre, String nacionalidad) {
    this.id = id;
    this.nombre = nombre;
    this.nacionalidad = nacionalidad;
}
    
public String getId() { 
    return id; 
}
public String getNombre() { 
    return nombre; 
}
public String getNacionalidad() { 
    return nacionalidad; 
}

public void setNombre(String nombre) { 
    this.nombre = nombre; 
}
public void setNacionalidad(String nacionalidad) { 
    this.nacionalidad = nacionalidad; 
}

public void mostrarInfo() {
    System.out.println("\nAutor ID: "+ id+"\nNombre: "+nombre+ "\nNacionalidad: "+nacionalidad);
    }
}
