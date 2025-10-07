/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

/**
 *
 * @author Natalia
 */
public class Transferencia implements Pagable {
    private String cuentaOrigen;

    public Transferencia(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Monto: $" + monto + "\nPago con transferencia bancaria desde cuenta: " + cuentaOrigen);
    }
}
