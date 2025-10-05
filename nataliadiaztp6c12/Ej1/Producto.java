/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej1;

/**
 *
 * @author Natalia
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio; 
    private int cantidad;
    private CategoriaProducto categoria;
  
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
    this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoria;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
    if (precio >= 0) {
        this.precio = precio;
    } else {
        System.err.println("Error: El precio no puede ser negativo.");
    }
    }
    
    public void setCantidad(int nuevaCantidad) {
    if (nuevaCantidad >= 0) {
        this.cantidad = nuevaCantidad;
    } else {
        System.err.println("Error: La cantidad en stock no puede ser negativa.");
    }
    }
        
    public void mostrarInfo() {
        System.out.printf("\nDatos del producto:\nId: "+id+"\nNombre: "+nombre+
                "\nPrecio: $"+precio+ "\nCantidad: "+cantidad+"\nCategoria: "+categoria.name()+
                "\nDescripcion de la categoria: "+categoria.getDescripcion()+"\n");
    }

}


