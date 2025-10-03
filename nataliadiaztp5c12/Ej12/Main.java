/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej12;

/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args){
        Contribuyente c = new Contribuyente("Empresa X","30-11111-9");
        Impuesto i = new Impuesto(10000.0);
        Calculadora calc = new Calculadora();
        i.setContribuyente(c);
        calc.calcular(i);
    }
}
