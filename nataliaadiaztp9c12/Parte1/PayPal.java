/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Natalia
 */
public class PayPal implements Pago { 
//Solo implementa Pago porque pagar con PayPal no ofrece descuentos.
    private String emailUsuario;

    public PayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    // Implementa Pago
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Cuenta de PayPal: " + emailUsuario);
    }
}
