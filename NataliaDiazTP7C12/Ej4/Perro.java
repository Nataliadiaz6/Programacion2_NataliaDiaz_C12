/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

/**
 *
 * @author Natalia
 */
public class Perro extends Animal { 
    
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerSonido(){
        System.out.println(nombre + " hace guau");
    }
    
}
