/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Natalia
 */
public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Implementa Notificable
    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("El cliente " + nombre + " recibio el siguiente mensaje: " + mensaje);
    }
}
