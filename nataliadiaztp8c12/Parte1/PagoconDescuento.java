/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Parte1;

/**
 *
 * @author Natalia
 */
public interface PagoconDescuento extends Pago {
    // Aplica un descuento al total y retorna el nuevo monto
    double aplicarDescuento(double total);
}