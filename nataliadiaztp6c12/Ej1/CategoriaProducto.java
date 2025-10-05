/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej1;

/**
 *
 * @author Natalia
 */
public enum 
CategoriaProducto {  
    ALIMENTOS("Productos comestibles"),  
    ELECTRONICA("Dispositivos electronicos"),  
    ROPA("Prendas de vestir"),     
    HOGAR("Articulos para el hogar");     
    
    private final String descripcion;     
    CategoriaProducto(String descripcion) {         
        this.descripcion = descripcion;  
    }  
    public String getDescripcion() {         
        return descripcion;  
    }  
}  

