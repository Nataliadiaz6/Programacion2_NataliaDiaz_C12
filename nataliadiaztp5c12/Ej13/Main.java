/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej13;

/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args){
        Usuario u = new Usuario("Nati","nati@mail.com");
        GeneradorQR g = new GeneradorQR();
        CodigoQR qr = g.generar("https://ejemplo.com", u);
        qr.setUsuario(u);
        System.out.println("QR creado para " + qr.getUsuario().getNombre() + ": " + qr.getValor());
    }
}
