/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nataliadiaztp6c12.Ej3;

/**
 *
 * @author Natalia
 */
public class Main {
    public static void main(String[] args) {
        
        Universidad miUniversidad = new Universidad("UTN");
        System.out.println("Universidad creada: "+ miUniversidad.getNombre());

        // 1. Crear al menos 3 profesores y 5 cursos.
        System.out.println("\n====== TAREA 1 y 2: CREACION Y AGREGAR ENTIDADES ======");
        
        Profesor p1 = new Profesor("P001", "Dr. Alan Turing", "Ciencias de la Computacion");
        Profesor p2 = new Profesor("P002", "Dra. Marie Curie", "Fisica Nuclear");
        Profesor p3 = new Profesor("P003", "Prof. Noam Chomsky", "Lingüistica");

        Curso c1 = new Curso("CS101", "Introduccion a la Programacion");
        Curso c2 = new Curso("CS205", "Bases de Datos Avanzadas");
        Curso c3 = new Curso("FN101", "Termodinamica");
        Curso c4 = new Curso("LG301", "Sintaxis Generativa");
        Curso c5 = new Curso("CS301", "Ciberseguridad");

        // 2. Agregar profesores y cursos a la universidad.
        miUniversidad.agregarProfesor(p1);
        miUniversidad.agregarProfesor(p2);
        miUniversidad.agregarProfesor(p3);
        
        miUniversidad.agregarCurso(c1);
        miUniversidad.agregarCurso(c2);
        miUniversidad.agregarCurso(c3);
        miUniversidad.agregarCurso(c4);
        miUniversidad.agregarCurso(c5);
        
        // 3. Asignar profesores a cursos.
        System.out.println("\n====== TAREA 3: ASIGNACION DE PROFESORES A CURSOS ======");
        miUniversidad.asignarProfesorACurso(c1.getCodigo(), p1.getId()); 
        miUniversidad.asignarProfesorACurso(c2.getCodigo(), p1.getId()); 
        miUniversidad.asignarProfesorACurso(c3.getCodigo(), p2.getId()); 
        miUniversidad.asignarProfesorACurso(c4.getCodigo(), p3.getId()); 
        
        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n====== TAREA 4: LISTADO DETALLADO (Verificacion de Bidireccionalidad) ======");
        miUniversidad.listarCursos();
        miUniversidad.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\n====== TAREA 5: CAMBIO DE PROFESOR (Sincronizacion) ======");
        System.out.println("Cambiando CS101 de Turing a Curie...");
        miUniversidad.asignarProfesorACurso(c1.getCodigo(), p2.getId());
        
        System.out.println("\n  --- Verificacion despues del cambio: ---");
        p1.mostrarInfo();
        p1.listarCursos(); 
        p2.mostrarInfo();
        p2.listarCursos(); 
        c1.mostrarInfo(); 
        
        // 6. Remover un curso (CS205) y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n====== TAREA 6: REMOVER CURSO (CS205) Y VERIFICAR SINCRONIZACION ======");
        miUniversidad.asignarProfesorACurso(c2.getCodigo(), p3.getId());
        
        // Profesor P3 (Chomsky) antes de la eliminación:
        System.out.println("\n  --- Profesor P3 antes de la eliminacion del curso CS205 ---");
        p3.mostrarInfo();
        p3.listarCursos();
        
        miUniversidad.eliminarCurso(c2.getCodigo()); 
        
        // Profesor P3 después de la eliminación:
        System.out.println("\n  --- Profesor P3 despues de la eliminacion del curso CS205 ---");
        p3.mostrarInfo();
        p3.listarCursos(); 

        // 7. Remover un profesor (P003) y dejar profesor = null en sus cursos.
        System.out.println("\n====== TAREA 7: REMOVER PROFESOR (P003 - Chomsky) Y DESVINCULAR CURSOS ======");
        
        // Profesor P3 (Chomsky) antes de la eliminación:
        System.out.println("\n  --- Profesor P3 antes de la eliminacion ---");
        p3.mostrarInfo();
        p3.listarCursos();
        
        miUniversidad.eliminarProfesor(p3.getId());
        
        // Verificación del curso que dictaba (LG301)
        System.out.println("\n  --- Verificacion del Curso LG301 despues de eliminar a P003 ---");
        c4.mostrarInfo();

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("\n====== TAREA 8: REPORTE DE CURSOS POR PROFESOR ======");
        miUniversidad.mostrarReporteCursosPorProfesor();
    }
}


