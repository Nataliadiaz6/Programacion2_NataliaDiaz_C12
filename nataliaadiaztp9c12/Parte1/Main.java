/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Natalia
 */
public class Main {
    // Método para gestionar pagos con descuento
    public static void pagarconDescuento(PagoconDescuento metodoPago, double totalInicial) {
        System.out.println("Procesando Pago con: " + metodoPago.getClass().getSimpleName() + "\nVa a recibir un descuento!");
        
        double totalConDescuento = metodoPago.aplicarDescuento(totalInicial);
        metodoPago.procesarPago(totalConDescuento);
    }
    
    // Mtodo para gestionar pagos SIN descuento
    public static void pagarsinDescuento(Pago metodoPago, double totalInicial) {
        System.out.println("Procesando Pago con: " + metodoPago.getClass().getSimpleName());
        
        // Procesa el pago con el total inicial
        metodoPago.procesarPago(totalInicial); 
    }
    
    public static void main(String[] args) {
        //Crear productos
        Producto p1 = new Producto("Laptop Gamer", 1850.00);
        Producto p2 = new Producto("Monitor 32\"", 450.00);
        Producto p3 = new Producto("Teclado RGB", 120.00);
        Producto p4 = new Producto("Mouse", 65.00);
        Producto p5 = new Producto("Webcam 4K", 90.00);
        Producto p6 = new Producto("Cable HDMI Premium", 25.00);
        Producto p7 = new Producto("Licencia de Software Antivirus", 40.00);

        //Crear clientes
        Cliente c1 = new Cliente("Ana Rodriguez");
        Cliente c2 = new Cliente("Franco Juarez");
        Cliente c3= new Cliente("Natalia Diaz");

        //Pedido con tarjeta de credito
        System.out.println("\nPedido 1: Tarjeta de Cradito");
        
        Pedido pedido1 = new Pedido(c3); 
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p7);
        pedido1.agregarProducto(p3);

        double totalPedido1 = pedido1.calcularTotal(); // Total: 1850 + 40 + 120 = 2010.00
        System.out.println("Total del pedido: $" + totalPedido1);

        // Pago
        PagoconDescuento TC1 = new TarjetaCredito(); 
        pagarconDescuento(TC1, totalPedido1); 
        
        // Notificación
        pedido1.cambiarEstado("PAGADO");
        pedido1.cambiarEstado("ENVIADO");
        

        // Pedido con Paypal
        System.out.println("\nPedido 2: PayPal");

        Pedido pedido2 = new Pedido(c1);
        pedido2.agregarProducto(p4);
        pedido2.agregarProducto(p5);
        pedido2.agregarProducto(p6);
        pedido2.agregarProducto(p7);

        double totalPedido2 = pedido2.calcularTotal(); // Total: 65 + 90 + 25 + 40 = 220.00
        System.out.println("Total del pedido: $" + totalPedido2);

        // Pago
        Pago PP1 = new PayPal("ana.rodriguez@email.com"); 
        pagarsinDescuento(PP1, totalPedido2); 

        // Notificación
        pedido2.cambiarEstado("PAGADO");

        // Pedido con efectivo
        System.out.println("\nPedido 3: Efectivo");

        Pedido pedido3 = new Pedido(c2);
        pedido3.agregarProducto(p7);
        pedido3.agregarProducto(p6);
        
        double totalPedido3 = pedido3.calcularTotal(); // Total: 40 + 25 = 65.00
        System.out.println("Total del pedido: $" + totalPedido3);

        // Pago: Efectivo (Con descuento)
        PagoconDescuento pagoEfectivo = new Efectivo();
        pagarconDescuento(pagoEfectivo, totalPedido3); 
        
        // Notificación
        pedido3.cambiarEstado("CANCELADO"); 
    }
}


