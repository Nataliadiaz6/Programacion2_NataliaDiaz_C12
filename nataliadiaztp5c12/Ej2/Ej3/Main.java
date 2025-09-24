/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej2.Ej3;

/**
 *
 * @author Natalia
 */
public class Main {
     public static void main(String[] args){
        Autor a = new Autor("Gabriela Mistral","Chile");
        Editorial e = new Editorial("Ediciones Sol","Gral Valle 123");
        Libro l = new Libro("Poemas", "978-1-2345", a, e);
        System.out.println("Libro: " + l.getTitulo() + ", Autor: " + l.getAutor().getNombre());
    }
}
