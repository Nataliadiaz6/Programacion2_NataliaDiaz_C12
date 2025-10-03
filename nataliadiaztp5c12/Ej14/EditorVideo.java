/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej14;

/**
 *
 * @author Natalia
 */
public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto){ // dependencia de creación
        Render r = new Render(formato);
        return r;
    }
}
