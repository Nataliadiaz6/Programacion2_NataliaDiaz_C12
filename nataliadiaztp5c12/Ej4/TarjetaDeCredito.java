/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej4;

/**
 *
 * @author Natalia
 */
public class TarjetaDeCredito {
    private String numero; 
    private String fechaVencimiento; 
    private Banco banco; 
    private Cliente cliente;
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente){
        this.numero = numero; 
        this.fechaVencimiento = fechaVencimiento; 
        this.banco = banco; 
        this.cliente = cliente;
        if(this.cliente != null) 
            this.cliente.setTarjeta(this);
}

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
