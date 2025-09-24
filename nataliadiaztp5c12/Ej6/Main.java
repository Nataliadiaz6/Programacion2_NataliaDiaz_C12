/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej6;

//EL ARCHIVO EJ6 ES EL EJERCICIO 5 Y VICEVERSA.
public class Main {
  public static void main(String[] args){
        PlacaMadre pm = new PlacaMadre("GigaX","Z690");
        Propietario p = new Propietario("Ramiro Lopez","20333444");
        Computadora c = new Computadora("CompCorp","SN-001",pm,p);
        System.out.println("Propietario: " + c.getPropietario().getNombre() + ", Placa: " + c.getPlaca().getModelo());
  }  
}
