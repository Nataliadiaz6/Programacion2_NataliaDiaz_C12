/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

/**
 *
 * @author Natalia
 */
public class TarjetaCredito implements Pagable {
    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Monto: $" + monto + "\nPago con tarjeta de credito terminada en: " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
}
