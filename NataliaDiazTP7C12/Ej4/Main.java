/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

import java.util.ArrayList;

/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Chicho"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
        }
    }
}