/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp5c12.Ej14;

/**
 *
 * @author Natalia
 */
public class Main {
     public static void main(String[] args){
        Proyecto p = new Proyecto("VideoDeVentas", 12);
        EditorVideo editor = new EditorVideo();
        Render r = editor.exportar("MP4", p);
        System.out.println("Render creado: formato " + r.getFormato() + ", proyecto " + r.getProyecto().getNombre());
    }
}
