/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author Natalia
 */
public class Auto extends Vehiculo { 
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Datos del vehiculo:\nModelo: " + this.modelo + "\nMarca: " + this.marca+"\nCantidad de puertas: " + cantidadPuertas);
    }
    
}
