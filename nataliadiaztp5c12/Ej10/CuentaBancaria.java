/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej10;

/**
 *
 * @author Natalia
 */
public class CuentaBancaria {
    private String cbu; 
    private double saldo; 
    private ClaveSeguridad clave; 
    private Titular titular;
    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular){
        this.cbu = cbu; 
        this.saldo = saldo; 
        this.clave = clave; 
        this.titular = titular;
        if(this.titular != null) 
            this.titular.setCuenta(this);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
}
