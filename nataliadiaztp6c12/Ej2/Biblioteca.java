/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Natalia
 */
public class Biblioteca {
    private String nombre;
    private final List<Libro> libros;  // Colección de libros de la biblioteca

    public Biblioteca(String nombre) {
        this.libros = new ArrayList<>();
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public List<Libro> getLibros(){
        return Collections.unmodifiableList(libros);
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
    for (Libro libro : libros) {
        if (libro.getIsbn().equals(isbn) && isbn != null) {
            System.out.println("Libro isbn "+isbn+" encontrado");
            libro.mostrarInfo();
            return libro;
            }
        }
    return null;
    }
        
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
    if (buscarLibroPorIsbn(isbn) != null) {
        System.out.println("Error: El libro con ISBN " +isbn+ " ya existe en la biblioteca. No se agrego.");
    return;}
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
        System.out.println("Libro isbn "+isbn+" agregado correctamente." );
    }
    
    public void listarLibros() {
    if (libros.isEmpty()) {
        System.out.println("La biblioteca no contiene libros.");
        return;
    }
    System.out.println("\n--- LISTADO DE LIBROS EN "+ nombre.toUpperCase()+"---");
    for (Libro libro:libros) {
            libro.mostrarInfo();
        }
    }

    public boolean eliminarLibro(String isbn) {
        for (Libro libro: libros){
            if (libro.getIsbn().equals(isbn)){
                libros.remove(libro);
                System.out.println("Libro isbn "+isbn+" eliminado.");
                return true;
            }
        }
        System.out.println("Libro no encontrado, no se elimino.");
        return false;
    }
   
    public void obtenerCantidadLibros() {
        System.out.println("Cantidad total de libros en la biblioteca: "+ libros.size());   
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                System.out.println("Libros encontrados del anio "+anio+":");
                libro.mostrarInfo();
            }
        }
        return null;
    }

    public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros, por lo tanto no hay autores para mostrar.");
            return;
        }
        
        Set<Autor> autores = new HashSet<>();
        for (Libro libro : libros) {
            autores.add(libro.getAutor());
        }

        System.out.println("\n--- AUTORES DISPONIBLES EN LA BIBLIOTECA ---");
        for (Autor autor : autores) {
            autor.mostrarInfo();
        }
    }

}


