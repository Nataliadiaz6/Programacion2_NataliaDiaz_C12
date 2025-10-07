/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

/**
 *
 * @author Natalia
 */
public class Animal {
    
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void hacerSonido(){
    }
    public void describirAnimal(){
        System.out.println("Animal llamado " + nombre);
    }
}
