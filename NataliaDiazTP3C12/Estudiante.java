
package natalia.diaz.c12.tp3;

public class Estudiante {
    // Atributos de la clase
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }
    //Trabajamos sobre este metodos setter
    public void setCalificacion(double calificacion) {
        if(calificacion < 0){
        this.calificacion = 0; //Evita valores negativos
        }else if(calificacion > 10){
           this.calificacion = 10; //Evita valores mayores a 10
        }else{
           this.calificacion = calificacion;
        }
    }
//Método para mostrar info del estudiante
    public void mostrarInfo() {
        System.out.println("Informacion del Estudiante ");
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    //Metodo para subir calificacion
    //Verificar que la nueva calificacion no sea mayor a 10
    public void subirCalificacion(double puntos) {
    if(calificacion + puntos <=10){ //Si no supera el maximo, suma
        calificacion += puntos; //acumulador
        System.out.println ("La calificacion aumento a: " + calificacion);
    }else{
        System.out.println ("ERROR. La calificacion  no puede ser mayor a 10.");
    }
    }
    //Metodo para bajar calificacion
     public void bajarCalificacion(double puntos) {
    if(calificacion - puntos >=0){ //Si no es menor que 0, resta
        calificacion = calificacion - puntos; //resta
        System.out.println ("La calificacion bajo a: " + calificacion);
    }else{
        System.out.println ("ERROR. La calificacion  no puede ser negativa.");
    }
     }
}
