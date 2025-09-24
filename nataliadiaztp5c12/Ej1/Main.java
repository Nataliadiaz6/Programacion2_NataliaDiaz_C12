/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej1;

/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("img001.jpg", "JPEG");
        Titular t = new Titular("Ana Perez", "23123456");
        Pasaporte p = new Pasaporte("AR-0001", "2025-01-01", foto, t);
        System.out.println("PASAPORTE: " + p.getNumero() + ", Titular: " + p.getTitular().getNombre());
}
}
