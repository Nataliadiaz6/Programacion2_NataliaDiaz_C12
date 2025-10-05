/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Natalia
 */
public class Inventario {
    private final ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public boolean agregarProducto(Producto p){
// Evita agregar productos con ID duplicado
    if (buscarProductoPorId(p.getId()) != null) {
        System.out.printf("Error: Ya existe un producto con ese ID. No se agrego.", p.getId());
        return false;}
        productos.add(p);
        System.out.println("Producto id "+ p.getId()+ " agregado al inventario exitosamente.");
        return true;
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio.");
            return;
        }
        System.out.println("\n--- LISTADO COMPLETO DE PRODUCTOS ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                p.mostrarInfo();
            return p;
            }
        }
    return null;
    }


    public boolean eliminarProducto(String id) {
    for (Producto p: productos){
        if (p.getId().equals(id)){
            productos.remove(p);
            System.out.println("Producto id "+id+" eliminado.");
            return true;
        }
    }
        System.out.println("Producto no encontrado, no se elimino.");
        return false;
    }    

    public boolean actualizarStock(String id, int nuevaCantidad) {
    for (Producto p: productos){
        if (p.getId().equals(id)){
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado.\nNuevo stock del producto "+id+": "+nuevaCantidad);
            return true;
        }
}
        System.out.println("No se pudo actualizar el stock.");
        return false;
    }    

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoriaProducto() == categoria) {
                System.out.println("Productos de la categoria "+categoria);
            p.mostrarInfo();
            }
        }
        return null;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        return Collections.max(productos, Comparator.comparingInt(Producto::getCantidad));
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORIAS DISPONIBLES ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name()+ ": "+ cat.getDescripcion());
        }
    }
    
    
    
    
    
}
