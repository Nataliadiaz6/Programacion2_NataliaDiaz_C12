/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej11;

/**
 *
 * @author Natalia
 */
public class Main {
     public static void main(String[] args){
        Artista a = new Artista("La Renga","Rock");
        Cancion c = new Cancion("Motoralmaysangre");
        Reproductor r = new Reproductor();
        c.setArtista(a);
        r.reproducir(c);
    }
}
