/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej1;

/**
 *
 * @author Natalia
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;       // composicion
    private Titular titular; // asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero; this.fechaEmision = fechaEmision;
        this.foto = foto; this.titular = titular;
        if (this.titular != null) 
            this.titular.setPasaporte(this); // mantener bidireccional
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) { 
        this.titular = titular;
        if (titular != null) 
            titular.setPasaporte(this);
    }
}
