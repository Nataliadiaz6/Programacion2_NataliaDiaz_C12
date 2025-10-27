/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Natalia
 */
public class Pedido implements Pagable {
    private List<Producto> productos;
    private Notificable clienteNotificable; // Usa la interfaz Notificable
    private String estado;

    public Pedido(Notificable cliente) {
        this.productos = new ArrayList<>();
        this.clienteNotificable = cliente;
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    // Implementación de Pagable: suma los totales de todos los productos
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    // Método para cambiar el estado y notificar al cliente
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        String mensaje = "El estado de tu pedido ha cambiado a: " + nuevoEstado;
        clienteNotificable.recibirNotificacion(mensaje);
    }

    public String getEstado() {
        return estado;
    }
}
