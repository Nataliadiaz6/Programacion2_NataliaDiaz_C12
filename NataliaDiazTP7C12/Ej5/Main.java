/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args) {
        
        List<Pagable> formasDePago = new ArrayList<>();
        formasDePago.add(new TarjetaCredito("4567-XXXX-XXXX-1234", "Juan Diaz"));
        formasDePago.add(new Transferencia("001-987654"));
        formasDePago.add(new Efectivo());
        
        double montoTransaccion = 0.0;
        
        for (Pagable p : formasDePago) {
            procesarPago(p, 350);
        }
    }
    public static void procesarPago(Pagable medio, double monto) {
        medio.pagar(monto);
    }
}

