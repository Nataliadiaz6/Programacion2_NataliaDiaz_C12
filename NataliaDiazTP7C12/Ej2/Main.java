/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

import java.util.ArrayList;

/**
 *
 * @author Natalia
 */
public class Main {
        public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Circulo circulo1 = new Circulo(5.0, "C1");
        Rectangulo rectangulo1 = new Rectangulo(7.5,  6.24, "R1");
        Circulo circulo2 = new Circulo(3.0, "C2");
        Circulo circulo3 = new Circulo(4.5, "C3");
        Rectangulo rectangulo2 = new Rectangulo(8.0,  3.0, "R2");
        
        figuras.add(circulo1);
        figuras.add(rectangulo1);
        figuras.add(circulo2);
        figuras.add(circulo3);
        figuras.add(rectangulo2);
    
        for(Figura figura : figuras){
            figura.calcularArea();
        }
        
    }
}
