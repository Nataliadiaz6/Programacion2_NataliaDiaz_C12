/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej2.Ej3;

/**
 *
 * @author Natalia
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; // asociación unidireccional
    private Editorial editorial; // agregación
    
    public Libro(String titulo, String isbn, Editorial editorial){
        this.titulo = titulo; 
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    public void mostrarEditorial(){
        System.out.println("El libro "+titulo+ " fue publicado por la editorial "+ editorial.getNombre());
    }
}
