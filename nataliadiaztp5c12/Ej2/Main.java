/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej2;

/**
 *
 * @author Natalia
 */
public class Main {
     public static void main(String[] args) {
        Bateria bat = new Bateria("BT-100","3000mAh");
        Usuario u = new Usuario("Luca Lopez","40234567");
        Celular c = new Celular("356789012345678","XPhone","X1",bat);
        u.setCelular(c);
        System.out.println("Celular de " + c.getUsuario().getNombre() + " con bateria " + c.getBateria().getModelo());
    }
}
