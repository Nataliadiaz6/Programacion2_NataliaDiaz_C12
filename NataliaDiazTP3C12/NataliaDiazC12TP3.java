
package natalia.diaz.c12.tp3;



public class NataliaDiazC12TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Ejercicio1    
    Estudiante estudiante1=new Estudiante();
    estudiante1.setNombre("Natalia");
    estudiante1.setApellido("Diaz");
    estudiante1.setCurso("Programacion");
    estudiante1.setCalificacion(7);
    
    estudiante1.mostrarInfo();
        System.out.println("");
    
    System.out.println("Subir la calificacion 1.5 puntos:");
    estudiante1.subirCalificacion(1.5);
    
    System.out.println("Subir la calificacion 5 puntos:");
    estudiante1.subirCalificacion(5);
        System.out.println("");
    
    System.out.println("Bajar la calificacion 5 puntos:");
    estudiante1.bajarCalificacion(5);
    
    System.out.println("Bajar la calificacion 8 puntos:");
    estudiante1.bajarCalificacion(8);
        System.out.println("");
    
    System.out.println("Datos finales: ");
    estudiante1.mostrarInfo();
        System.out.println("");
    
    //Ejercicio2
    Mascota mascota1 = new Mascota();
    mascota1.setNombre("Otilia");
    mascota1.setEspecie("Gata");
    mascota1.setEdad(2);
    
    mascota1.mostrarInfo();
        System.out.println("");
    
    System.out.println("Han pasado 5 anios: ");
    mascota1.cumplirAnios(5);
        System.out.println("");
    
    System.out.println("Datos actualizados: ");
    mascota1.mostrarInfo();
        System.out.println("");
    
    //Ejercicio3
    Libro miLibro = new Libro();
    miLibro.setTitulo("Como programar en java");
    miLibro.setAutor("Deitel");
    miLibro.setAñoPublicacion(2017);
    System.out.println("Informacion inicial:");
    miLibro.mostrarInfo();
        System.out.println("");
    
    //Modificar el año de publicacion con un valor valido
        System.out.println("Intentando cambiar el anio con valor valido: ");
        miLibro.setAñoPublicacion(2000);
        System.out.println("");
        
    //Modificar el año de publicacion con un valor invalido viejo
        System.out.println("Intentando cambiar el anio con valor viejo:");
        miLibro.setAñoPublicacion(1800);
        System.out.println("");
        
    //Modificar el año de publicacion con un valor invalido futuro
        System.out.println("Intentando cambiar el anio con valor futuro:");
        miLibro.setAñoPublicacion(2030);
        System.out.println("");
        
    Gallina Gallina1 = new Gallina();
    Gallina1.setIdGallina(1);
    Gallina1.setEdad(2);
    Gallina1.setHuevosPuestos(32);
    Gallina1.mostrarEstado();
        System.out.println("");
    
    Gallina Gallina2 = new Gallina();
    Gallina2.setIdGallina(2);
    Gallina2.setEdad(5);
    Gallina2.setHuevosPuestos(123);
    Gallina2.mostrarEstado();
        System.out.println("");
        
    System.out.println("Gallina 1 puso 5 huevos:");
    Gallina1.ponerHuevo(5);
        System.out.println("");
     
    System.out.println("Gallina 2 puso 2 huevos:");
    Gallina2.ponerHuevo(2);
        System.out.println("");   
        
    System.out.println("Gallina 1 cumplio 3 anios:"); 
    Gallina1.enejecer(3);
        System.out.println("");
    
    System.out.println("Gallina 2 cumplio 6 anios:"); 
    Gallina2.enejecer(6);
        System.out.println("");   
        
    Gallina1.mostrarEstado();
        System.out.println("");
    Gallina2.mostrarEstado();
        System.out.println("");
    
    //Ejercicio5
    NaveEspacial nave1=new NaveEspacial();
    nave1.setNombre("APOLO 11");
    nave1.setCombustible(50);
    
    System.out.println("Estado Inicial de la nave:");
    nave1.mostrarEstado();
        System.out.println("");
    
    System.out.println("Avanzaremos 60 unidades sin recargar: ");
    nave1.avanzar(60);
        System.out.println("");
    
    System.out.println("Regargar 40 unidades de combustible: ");
    nave1.recargarCombustible(40);
        System.out.println("");
        
    System.out.println("Avanzaremos 60 unidades nuevamente");
    nave1.avanzar(60);
        System.out.println("");
        
    System.out.println("Estado actual de la nave: ");
    nave1.mostrarEstado();
        
    }
    
}
