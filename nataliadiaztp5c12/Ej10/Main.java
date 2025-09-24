/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej10;

/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args){
        ClaveSeguridad k = new ClaveSeguridad("1234","2025-01-01");
        Titular t = new Titular("Natalia Diaz","20344556");
        CuentaBancaria c = new CuentaBancaria("000111222333444555666",1000.0,k,t);
        System.out.println("Cuenta CBU: " + c.getCbu() + ", titular: " + c.getTitular().getNombre());
    }
}
