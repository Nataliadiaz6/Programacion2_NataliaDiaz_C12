/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej6;

/**
 *
 * @author Natalia
 */
public class Computadora {
    private String marca; 
    private String numeroSerie; 
    private PlacaMadre placa; 
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset){
    this.marca=marca; 
    this.numeroSerie=numeroSerie; 
    this.placa= new PlacaMadre(modelo, chipset); 
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
        propietario.setComputadora(this);
        }
    }
    public void mostrarPlaca(){
        System.out.println("La computadora marca "+ marca + " nro. de serie "+ numeroSerie+ " contiene una placa madre modelo " + placa.getModelo() + " con chipset "+ placa.getChipset());
    }
}
 

