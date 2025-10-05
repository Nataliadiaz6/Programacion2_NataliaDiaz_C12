/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej2;


/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args) {
        
    // 1. Creamos una biblioteca.
        System.out.println("====== TAREA 1: CREAR BIBLIOTECA ======");
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Universitaria");
        System.out.println("Biblioteca creada: "+ miBiblioteca.getNombre());

    // 2. Crear al menos tres autores
        System.out.println("\n====== TAREA 2: CREAR AUTORES ======");
        Autor autor1 = new Autor("AUT001", "Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("AUT002", "Jane Austen", "Britanica");
        Autor autor3 = new Autor("AUT003", "Jorge Luis Borges", "Argentina");
        
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();

    // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        System.out.println("\n====== TAREA 3: AGREGAR 5 LIBROS ======");
        miBiblioteca.agregarLibro("978-0123", "Cien anios de soledad", 1967, autor1);
        miBiblioteca.agregarLibro("978-0124", "Orgullo y Prejuicio", 1813, autor2);
        miBiblioteca.agregarLibro("978-0125", "Ficciones", 1944, autor3);
        miBiblioteca.agregarLibro("978-0126", "Amor en los tiempos del colera", 1985, autor1); 
        miBiblioteca.agregarLibro("978-0127", "Persuasion", 1817, autor2);
        miBiblioteca.agregarLibro("978-0128", "Los Watson", 1805, autor2);

    // 4. Listar todos los libros con su información y la del autor.
        System.out.println("\n====== TAREA 4: LISTAR TODOS LOS LIBROS ======");
        miBiblioteca.listarLibros();

    // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\n====== TAREA 5: BUSCAR LIBRO POR ISBN (978-0125) ======");
        miBiblioteca.buscarLibroPorIsbn("978-0128");

    // 6. Filtrar y mostrar los libros publicados en un año específico (1813).
        System.out.println("\n====== TAREA 6: FILTRAR LIBROS POR ANIO (1813) ======");
        miBiblioteca.filtrarLibrosPorAnio(1813);


     // 7. Eliminar un libro por su ISBN (978-0128) y listar los libros restantes.
        System.out.println("\n====== TAREA 7: ELIMINAR LIBRO (978-0128) Y LISTAR RESTANTES ======");
        miBiblioteca.eliminarLibro("978-0128");

        miBiblioteca.listarLibros();

    // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\n====== TAREA 8: MOSTRAR CANTIDAD TOTAL DE LIBROS ======");
        miBiblioteca.obtenerCantidadLibros();

    // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\n====== TAREA 9: LISTAR AUTORES DISPONIBLES ======");
        miBiblioteca.mostrarAutoresDisponibles();
}
}
