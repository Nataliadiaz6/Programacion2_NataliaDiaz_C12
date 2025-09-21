
package natalia.diaz.c12.tp3;

public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void mostrarEstado() {
        System.out.println("Estado actual de la gallina: ");
        System.out.println("Numero identificador: " + idGallina);
        System.out.println("Edad: " + edad + " anio/s");
        System.out.println("Cantidad de huevos puestos: " + huevosPuestos + " huevos");
    }
    public void ponerHuevo(int huevos) {
        huevosPuestos += huevos;
        System.out.println("Cantidad actualizada de huevos puestos por gallina numero " + idGallina + ": " + huevosPuestos);
    }
    
    public void enejecer(int anios) {
       edad = anios; //Acumulador
       System.out.println("Ahora la gallina numero " + idGallina + " tiene " + edad + " anios.");
    }
}
