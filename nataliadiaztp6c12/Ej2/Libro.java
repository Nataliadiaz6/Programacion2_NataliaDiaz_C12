/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej2;

/**
 *
 * @author Natalia
 */
public class Libro {
    private final String isbn; // Identificador único (no editable)
    private String titulo;
    private int anioPublicacion;
    private Autor autor; 


public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.anioPublicacion = anioPublicacion;
    this.autor = autor; 
}

public String getIsbn() { 
    return isbn; 
}
public String getTitulo() { 
    return titulo; 
}
public int getAnioPublicacion() { 
    return anioPublicacion; 
}
public Autor getAutor() { 
    return autor; 
}

public void setTitulo(String titulo) { 
    this.titulo = titulo; 
}
public void setAnioPublicacion(int anioPublicacion) { 
    this.anioPublicacion = anioPublicacion; 
}
public void setAutor(Autor autor) { 
    this.autor = autor; 
}

public void mostrarInfo() {
    System.out.println("\nISBN: "+isbn+ "\nTitulo: "+titulo+
            "\nAnio: "+anioPublicacion+ "\nAutor: "+autor.getNombre()+
            "\nNacionalidad: "+autor.getNacionalidad());
}   
}
