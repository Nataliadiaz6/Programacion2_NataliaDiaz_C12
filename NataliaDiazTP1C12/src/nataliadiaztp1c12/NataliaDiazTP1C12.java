/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nataliadiaztp1c12;

import java.util.Scanner;

/**
 *
 * @author Natalia
 */
public class NataliaDiazTP1C12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio2
        // Mosrar "Hola, Java!" por consola
        System.out.println("Hola, Java!");
        
        // Ejercicio3
        // Declarar y asignar valores a las variables
        String nombre = "Natalia Diaz";
        int edad = 24;
        double altura = 1.65;
        boolean estudiante = true;

        // Mostrar los valores por consola
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Es estudiante?: " + estudiante);
        
        // Ejercicio4
        Scanner input = new Scanner(System.in);
        
        // Pedir el nombre
        String nombre_usuario;
        System.out.print("Ingresa tu nombre: ");
        nombre_usuario = input.nextLine();
        // Pedir la edad
        int edad_usuario;
        System.out.print("Ingresa tu edad: ");
        edad_usuario = input.nextInt();
        // Mostrar en consola
        String saludo;
        saludo = "Tu nombre es " + nombre_usuario + " y tienes " + edad_usuario + " años.";
        System.out.println(saludo);
        
        // Ejercicio5
        // Definir variable division en double para poder dividir con decimales.
        int num_a, num_b, suma, resta, multiplicacion;
        double division;
        // Pedir los numeros al usuario
        System.out.print("Ingresa el primer numero: ");
        num_a = input.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num_b = input.nextInt();
        // Realizar operaciones
        suma = num_a + num_b;
        resta = num_a - num_b;
        multiplicacion = num_a * num_b;
        division = num_a * 1.0 / num_b; // con * 1.0 pasar una de las variables int a double.
        // Mostrar resultados por consola
        System.out.println("La suma entre " + num_a + " y " + num_b + " es igual a " + suma);
        System.out.println("La resta entre " + num_a + " y " + num_b + " es igual a " + resta);
        System.out.println("La multiplicacion entre " + num_a + " y " + num_b + " es igual a " + multiplicacion);
        System.out.println("La division entre " + num_a + " y " + num_b + " es igual a " + division);
        
        // Ejercicio6
        // \n para saltos de linea.
        // \"...\"Para escribir entre comillas.
        System.out.println("Nombre: Juan Pérez  \nEdad: 30 años  \nDirección: \"Calle Falsa 123\"  ");
        
        // Ejercicio8
        // Definir variable division en double para poder dividir con decimales.
        int num_c, num_d;
        double division_b;
        // Pedir los numeros al usuario
        System.out.print("Ingresa el primer numero: ");
        num_c = input.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num_d = input.nextInt();
        // Realizar operacion
        division_b = num_c * 1.0 / num_d; // con * 1.0 pasar una de las variables int a double.
        // Mostrar resultados por consola
        System.out.println("La division entre " + num_c + " y " + num_d + " es igual a " + division_b);
        
        // Ejercicio9
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        String nombre_z = scanner.nextLine(); // ERROR: se cambio nextInt por nextLine.
        System.out.println("Hola, " + nombre_z); 
        
        // Ejercicio10
        int a = 5;  
        int b = 2;  
        int resultado = a / b; 
        System.out.println("Resultado: " + resultado); 


    }

    private static void String(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
