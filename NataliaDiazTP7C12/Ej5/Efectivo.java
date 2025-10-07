/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

/**
 *
 * @author Natalia
 */
public class Efectivo implements Pagable {
    
    @Override
    public void pagar(double monto) {
        System.out.println("Monto: $" + monto + "\nPago con efectivo");
    }
}
