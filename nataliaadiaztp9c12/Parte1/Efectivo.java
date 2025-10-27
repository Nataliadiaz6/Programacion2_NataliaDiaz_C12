/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Natalia
 */
public class Efectivo implements PagoconDescuento {

    // Implementa Pago
    @Override
    public void procesarPago(double cantidad) {
    }

    // Implementa PagoConDescuento
    @Override
    public double aplicarDescuento(double total) {
        double descuento = 0.20; // 20% de descuento por pagar en efectivo
        double nuevoTotal = total * (1 - descuento);
        System.out.println("Descuento del 20% aplicado.\nMonto a pagar: $" + nuevoTotal);
        return nuevoTotal;
    }
}
