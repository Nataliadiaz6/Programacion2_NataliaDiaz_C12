/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej4;

/**
 *
 * @author Natalia
 */
public class Main {
     public static void main(String[] args){
        Banco b = new Banco("HSBC","30-12345678-9");
        Cliente c = new Cliente("María Ramirez","20123456");
        TarjetaDeCredito t = new TarjetaDeCredito("4111222233334444","12/27",b);
        t.setCliente(c);
        System.out.println("Tarjeta de: " + t.getCliente().getNombre() + ", Banco: " + t.getBanco().getNombre());
    }
}
