/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej5;

/**
 *
 * @author Natalia
 */
public class Reserva {
  private String fecha; 
  private String hora; 
  private Cliente cliente; 
  private Mesa mesa;
  
  public Reserva(String fecha, String hora, Mesa mesa){ 
        this.fecha=fecha; 
        this.hora=hora; 
        this.mesa=mesa; 
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public void mostrarMesa(){
        System.out.println("Hay una reserva el dia "+ fecha + " a la hora "+ hora + " en la mesa " + mesa.getNumero());
    }
}
