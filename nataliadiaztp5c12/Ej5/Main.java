/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej5;

//EL ARCHIVO EJ6 ES EL EJERCICIO 5 Y VICEVERSA.
public class Main {
     public static void main(String[] args){
        Cliente c = new Cliente("Natalia","115667788");
        Mesa m = new Mesa(5,4);
        Reserva r = new Reserva("2025-06-01","20:00",m);
        r.setCliente(c);
        r.mostrarMesa();
        System.out.println("Reserva para " + r.getCliente().getNombre() + " en la mesa " + r.getMesa().getNumero());
    }
}
