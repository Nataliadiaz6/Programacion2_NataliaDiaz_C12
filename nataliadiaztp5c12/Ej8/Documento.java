/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej8;

/**
 *
 * @author Natalia
 */
public class Documento {
    private String titulo; 
    private String contenido; 
    private FirmaDigital firma; // composicion
    public Documento(String titulo, String contenido, FirmaDigital firma){ 
        this.titulo=titulo; 
        this.contenido=contenido; 
        this.firma = firma; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }
    
}
