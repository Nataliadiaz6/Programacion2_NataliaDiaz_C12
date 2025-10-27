/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Natalia
 */
public class TarjetaCredito implements PagoconDescuento {

    // Implementa Pago
    @Override
    public void procesarPago(double cantidad) {
    }

    // Implementa PagoconDescuento
    @Override
    public double aplicarDescuento(double total) {
        double descuento = 0.10; // 10% de descuento
        double nuevoTotal = total * (1 - descuento);
        System.out.println("Descuento del 10% aplicado.\nMonto a pagar: $" + nuevoTotal);
        return nuevoTotal;
    }
}
