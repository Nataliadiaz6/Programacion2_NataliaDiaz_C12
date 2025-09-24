/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej12;

/**
 *
 * @author Natalia
 */
public class Calculadora {
    public void calcular(Impuesto impuesto){ // dependencia de uso
        System.out.println("Calculando impuesto para " + impuesto.getContribuyente().getNombre() + ": $" + impuesto.getMonto());
    }
}
