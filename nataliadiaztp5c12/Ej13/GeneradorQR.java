/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej13;

/**
 *
 * @author Natalia
 */
public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario){ // dependencia de creación
        CodigoQR codigo = new CodigoQR(valor);
        return codigo;
    }
}
