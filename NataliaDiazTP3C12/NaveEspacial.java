/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natalia.diaz.c12.tp3;

/**
 *
 * @author Natalia
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private static final int MAX_COMBUSTIBLE=100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    public void mostrarEstado(){
        System.out.println("Nave nombre: " + nombre);
        System.out.println("Combstible disponible: " + combustible + " unidades");
    }
    
    public void despegar() {
        if (combustible >= 10){
            combustible -= 10;
            System.out.println("Nave nombre "+ nombre + " a despegado ");
            System.out.println("Combustible restante: "+ combustible);
        }else{
            System.out.println("No se puede despegar con menos de 10 unidades de combustible");
        }
    }
    
    public void avanzar(int distancia) {
    if (combustible >= distancia){
            combustible -= 10;
            System.out.println("Nave nombre "+ nombre + " a avanzado " + distancia + " unidades");
            System.out.println("Combustible restante: "+ combustible);
        }else{
            System.out.println("No se puede avanzar con menos de 10 unidades de combustible");
        }
    }
    
    public void recargarCombustible(int cantidad) {
    if (cantidad <=0 ){
        System.out.println("No se puede agregar cantidad negativa de combustible");
        return;
    }
    if(combustible + cantidad > MAX_COMBUSTIBLE){
        combustible= MAX_COMBUSTIBLE;
        System.out.println("Combustible recargado al maximo: 100 unidades");
    }else{
        combustible += cantidad;
        System.out.println("La nave " + nombre + " a recargado " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }
   
}
