/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej11;

/**
 *
 * @author Natalia
 */
public class Reproductor {
    public void reproducir(Cancion cancion){ // dependencia de uso: recibe Cancion
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " - " + cancion.getArtista().getNombre());
    }
}
