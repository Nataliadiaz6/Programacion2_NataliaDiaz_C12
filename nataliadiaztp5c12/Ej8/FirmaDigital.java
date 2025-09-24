/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej8;

/**
 *
 * @author Natalia
 */
public class FirmaDigital {
    private String codigoHash; 
    private String fecha; 
    private Usuario usuario; // agregación
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario){ 
        this.codigoHash=codigoHash; 
        this.fecha=fecha; 
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
