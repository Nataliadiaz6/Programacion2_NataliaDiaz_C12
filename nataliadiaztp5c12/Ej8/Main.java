/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej8;

/**
 *
 * @author Natalia
 */
public class Main {
  public static void main(String[] args){
        Usuario u = new Usuario("Laura", "laura@mail.com");
        FirmaDigital f = new FirmaDigital("hash123", "2025-04-01", u);
        Documento d = new Documento("Contrato","Contenido del contrato...", f);
        System.out.println("Documento: " + d.getTitulo() + ", firmado por: " + d.getFirma().getUsuario().getNombre());
    }  
}
