/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej1;

import java.util.List;

/**
 *
 * @author Natalia
 */
public class Main {
public static void main(String[] args) {
    Inventario inventario = new Inventario();

// 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
    System.out.println("====== TAREA 1: AGREGAR PRODUCTOS ======");
    inventario.agregarProducto(new Producto("A001", "Celular iPhone 40", 2500.0, 50, CategoriaProducto.ELECTRONICA));
    inventario.agregarProducto(new Producto("A002", "Remera Algodon", 850.50, 200, CategoriaProducto.ROPA));        
    inventario.agregarProducto(new Producto("A003", "Pan Integral", 150.0, 10, CategoriaProducto.ALIMENTOS));
    inventario.agregarProducto(new Producto("A004", "Licuadora Portatil", 2800.0, 25, CategoriaProducto.HOGAR));
    inventario.agregarProducto(new Producto("A005", "Computadora Z500", 4500.0, 15, CategoriaProducto.ELECTRONICA));
    inventario.agregarProducto(new Producto("A006", "Manzanas", 250.0, 75, CategoriaProducto.ALIMENTOS));
    inventario.agregarProducto(new Producto("A007", "Freidora Electrica", 2200.0, 15, CategoriaProducto.HOGAR));

// 2. Listar todos los productos mostrando su información y categoría.
    System.out.println("\n====== TAREA 2: LISTAR TODOS LOS PRODUCTOS ======");
    inventario.listarProductos();

// 3. Buscar un producto por ID y mostrar su información.
    System.out.println("\n====== TAREA 3: BUSCAR PRODUCTO POR ID (A002) ======");
    inventario.buscarProductoPorId("A002");

// 4. Filtrar y mostrar productos que pertenezcan a una categoría específica (ELECTRONICA).
    System.out.println("\n====== TAREA 4: FILTRAR POR CATEGORIA (ELECTRONICA) ======");
    inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);


// 5. Eliminar un producto por su ID (A003) y listar los productos restantes.
    System.out.println("\n====== TAREA 5: ELIMINAR PRODUCTO (A003) Y LISTAR RESTANTES ======");
    inventario.eliminarProducto("A003");
    inventario.listarProductos();

// 6. Actualizar el stock de un producto existente (A004).
    System.out.println("\n====== TAREA 6: ACTUALIZAR STOCK (A004) ======");
    inventario.actualizarStock("A004", 60);


// 7. Mostrar el total de stock disponible.
    System.out.println("\n====== TAREA 7: MOSTRAR TOTAL DE STOCK DISPONIBLE ======");   
    int totalStock = inventario.obtenerTotalStock();
    System.out.println("Stock Total del Inventario: "+ totalStock);

//8. Obtener y mostrar el producto con mayor stock.
    System.out.println("\n====== TAREA 8: OBTENER PRODUCTO CON MAYOR STOCK ======");
    Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.print("Producto con Mayor Stock: ");
            mayorStock.mostrarInfo();
        }

// 9. Filtrar productos con precios entre $1000 y $3000.
    System.out.println("\n====== TAREA 9: FILTRAR PRODUCTOS POR PRECIO ($1000 a $3000) ======");
    List<Producto> filtradosPrecio = inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        if (!filtradosPrecio.isEmpty()) {
            for (Producto p : filtradosPrecio) {
                p.mostrarInfo();
            }
        } else {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }

// 10. Mostrar las categorías disponibles con sus descripciones.
    System.out.println("\n====== TAREA 10: MOSTRAR CATEGORIAS DISPONIBLES ======");
    inventario.mostrarCategoriasDisponibles();
    }
}

