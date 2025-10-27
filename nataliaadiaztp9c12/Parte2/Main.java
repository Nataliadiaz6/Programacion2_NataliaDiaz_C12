/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Natalia
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    //Ej. 1
    public static void divisionSegura() {
        System.out.println("\nEj. 1:");
        try {
            System.out.print("Ingrese el numerador: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese el denominador: ");
            int num2 = scanner.nextInt();
            int resultado = num1 / num2;
            System.out.println("Resultado de la division: " + resultado);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Debe ingresar numeros enteros validos.");
            scanner.next(); // Limpia el buffer del scanner
        } catch (ArithmeticException e) {
            // Captura específica para la división por cero
            System.out.println("No se puede dividir por cero.");
        }
    }

    //Ej. 2
    public static void conversionSegura() {
        System.out.println("\nEj. 2");
        System.out.print("Ingrese un texto para convertir a entero: ");
        String texto = scanner.next(); 
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversion exitosa. El numero es: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error de formato: La cadena '" + texto + "' no es un numero entero valido.");
        }
    }

    //Ej. 3
    public static void lecturaArchivo() {
        System.out.println("\nEj. 3");
        String nombreArchivo = "datos.txt"; 
        
        try {
            File archivo = new File(nombreArchivo);
            Scanner lectorArchivo = new Scanner(archivo);
            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            while (lectorArchivo.hasNextLine()) {
                System.out.println(" > " + lectorArchivo.nextLine());
            }
            System.out.println("Lectura de archivo finalizada.");
            lectorArchivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo '" + nombreArchivo + "' no fue encontrado.");
        }
    }

    //Ej. 4
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            // Lanzamos la excepción personalizada si la edad viola la regla de negocio
            throw new EdadInvalidaException("La edad ingresada esta fuera del rango valido (0 a 120).");
        }
        System.out.println("Edad validada correctamente: " + edad);
    }
    
    public static void demoExcepcionPersonalizada() {       
        System.out.println("\nEj. 4");
        // Caso de prueba 1: Edad válida
        try {
            validarEdad(30); 
        } catch (EdadInvalidaException e) {
            System.out.println("Error de Validacion: " + e.getMessage());
        }
        
        // Caso de prueba 2: Edad inválida
        try {
            System.out.print("Intentando validar edad 150... ");
            validarEdad(150); 
        } catch (EdadInvalidaException e) {
            System.out.println("Error de Validacion: " + e.getMessage());
        }
    }

    //Ej. 5
    public static void lecturaTryWithResources() {
        System.out.println("\nEj. 5");
        String nombreArchivo = "datos.txt";
        
        // La sentencia try-with-resources declara el recurso (BufferedReader)
        // y garantiza que el método close() se llame automáticamente.
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido de '" + nombreArchivo + "' (T-W-R):");
            while ((linea = br.readLine()) != null) {
                System.out.println("  > " + linea);
            }
            System.out.println("Archivo leido y recurso cerrado automaticamente.");
            
        } catch (FileNotFoundException e) {
             System.out.println("Error TWR: El archivo '" + nombreArchivo + "' no fue encontrado.");
        } catch (IOException e) {
            System.out.println("Error de IO: Ocurrio un error al leer el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Ejecución de todos los ejercicios
        divisionSegura();
        conversionSegura();
        lecturaArchivo();
        demoExcepcionPersonalizada();
        lecturaTryWithResources();
        
        scanner.close();
    }
}
