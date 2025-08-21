/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Natalia
 */
public class NataliaDiazTP2C12 {

    //Ejercicio8
    /**
     * Calcula el precio final de un producto aplicando un impuesto y un descuento.
     *
     * @param precioBase El precio inicial del producto.
     * @param impuesto   El porcentaje de impuesto a aplicar.
     * @param descuento  El porcentaje de descuento a aplicar.
     * @return El precio final del producto.
     */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertir porcentajes a su forma decimal
        double valorImpuesto = precioBase * (impuesto / 100);
        double valorDescuento = precioBase * (descuento / 100);
        
        // Aplicar la fórmula
        return precioBase + valorImpuesto - valorDescuento;
    }
    //Ejercicio9
    /**
     * Calcula el costo de envío basado en el peso y la zona.
     * @param peso El peso del paquete en kg.
     * @param zona La zona de envío ("Nacional" o "Internacional").
     * @return El costo de envío calculado.
     */
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona de envío no válida. El costo de envío será 0.");
            return 0.0;
        }
    }

    /**
     * Calcula el total de la compra sumando el precio del producto y el costo de envío.
     * @param precioProducto El precio del producto.
     * @param costoEnvio El costo de envío.
     * @return El total a pagar.
     */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    //Ejercicio10
    /**
     * Calcula el total de la compra sumando el precio del producto y el costo de envío.
     * @param stockActual El stock inicial del producto.
     * @param cantVendida La cantidad vendida de producto.
     * @param cantRecibida La cantidad recibida de producto.
     * @return El stock final
     */
    public static int actualizarStock(int stockActual, int cantVendida, int cantRecibida) {
        int nuevoStock = stockActual - cantVendida + cantRecibida;
        return nuevoStock;
    }
    // Ejercicio 11
    public static final double descuentoEspecial = 0.10;

    /**
     * Calcula y muestra el precio final con un descuento del 10%.
     * @param precioD El precio del producto a descontar.
     */
    public static void calcularDescuentoEspecial(double precioD) {
        // Variable para almacenar el valor del descuento
        double descuentoAplicado = precioD * descuentoEspecial;
        double precioFinal = precioD - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    //Ejercicio13
     /**
     * Función recursiva para imprimir los elementos de un array.
     * @param arr El array de doubles a imprimir.
     * @param index El índice actual del array.
     */
    public static void imprimirArrayRecursivo(double[] arr, int index) {
        // Caso base: La recursión termina cuando el índice es igual a la longitud del array
        if (index >= arr.length) {
            return;
        }
 
        // Acción de la recursión: Imprimir el elemento actual
        System.out.println("Precio: $" + arr[index]);
        
        // Llamada recursiva: Llama a la misma función para el siguiente elemento
        imprimirArrayRecursivo(arr, index + 1);
    }   
    public static void main(String[] args) {
        
        //Condicionales

        //Ejercicio1
        Scanner input = new Scanner(System.in);

        // Solicitar al usuario que ingrese un año
        System.out.print("Ingrese un anio: ");
        int anio = input.nextInt();

        // Evaluar si el año es bisiesto
        boolean esBisiesto = false;

        if (anio % 4 == 0) {
            if (anio % 100 != 0) {
                esBisiesto = true;
            } else if (anio % 400 == 0) {
                esBisiesto = true;
            }
        }

        // Mostrar el resultado por consola
        if (esBisiesto) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
        
        //Ejercicio2
        
        //Pedir al usuario que ingrese los números
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        
        System.out.print("Ingrese el tercer numero: ");
        int num3 = input.nextInt();
        
        // Determinar el número mayor 
        int mayor;
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        
        //Mostrar el resultado
        System.out.println("El mayor es: " + mayor);
        
        //Ejercicio3
        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        
        // Clasificar la etapa de vida
        String etapaVida;
        
        if (edad < 12) {
            etapaVida = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            etapaVida = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapaVida = "Adulto";
        } else { // Si no es ninguna de las anteriores, debe ser 60 o más
            etapaVida = "Adulto mayor";
        }
        
        // Mostrar el resultado
        System.out.println("Eres un " + etapaVida + ".");
        
        //Ejercicio4
        // Solicitar al usuario que ingrese el precio y su categoria
        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        input.nextLine();
        String cat = input.nextLine();
        
        // Mostrar el precio original
        System.out.println("El precio original del producto es: " + precio);
        
        // Aplicar descuento según categoría
        if (cat.equalsIgnoreCase("A")) {
            precio = precio * 0.9;
            System.out.println("El descuento aplicado es del 10%");
        } else if (cat.equalsIgnoreCase("B")) {
            precio = precio * 0.85;
             System.out.println("El descuento aplicado es del 15%");
        } else if (cat.equalsIgnoreCase("C")) {
            precio = precio * 0.8;
             System.out.println("El descuento aplicado es del 20%");
        } else {
            System.out.println("Para la categoria ingresada no hay descuentos.");
        }

        // Mostrar el precio final
        System.out.println("El precio final del producto es " + precio);
        
        // Repetición
        
        // Ejercicio5
        // Inicializar la variable suma y el número de entrada
        int suma = 0;
        int num;

        // Iniciar el bucle
        System.out.println("Ingrese un número (0 para terminar): ");
        num = input.nextInt(); 
        
        while (num != 0) {
            // Verificar si el número es par
            if (num % 2 == 0) {
                suma += num; 
            }
            // Solicitar y leer el siguiente número
            System.out.println("Ingrese un número (0 para terminar): ");
            num = input.nextInt();
        } 
        // Mostrar el resultado final
        System.out.println("La suma de los números pares es: " + suma);
        
        //Ejercicio6
        // Inicializar las variables
        int pos = 0;
        int neg = 0;
        int ceros = 0;

        System.out.println("Ingresa 10 números enteros: ");

        // Usar un bucle for para pedir los números restantes
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = input.nextInt();

            // Clasificar el número e incrementar el contador correspondiente
            if (numero > 0) {
                pos++;
            } else if (numero < 0) {
                neg++;
            } else {
                ceros++;
            }
        }
        // Mostrar los resultados finales
        System.out.println("\nResultados:");
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + ceros);
        
        //Ejercicio7
        // Inicializar la variable nota
        int nota;

        // Usar un bucle do-while para validar la entrada
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextInt();

            // Mensaje de error si la nota está fuera del rango
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10); // La condición se evalúa al final

        // Mostrar el mensaje de éxito una vez que la nota es válida
        System.out.println("Nota guardada correctamente.");
        
        // Funciones
        
        // Ejercicio8
        // Solicitar y leer los datos del usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();
        
        // Llamar a la función y guardar el resultado
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        // Mostrar el precio final
        System.out.println("El precio final del producto es: " + precioFinal);
        
        // Ejercicio9
        // Solicitar y leer los datos del usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = input.nextDouble();

        input.nextLine();
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();
        
        // Calcular el costo de envío usando la primera función
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        // Calcular el total de la compra usando la segunda función
        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);
        
        // Mostrar los resultados
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar);
        
        // Ejercicio10
        // Solicitar los datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = input.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantRecibida = input.nextInt();
        
        //Llamar a la funcion para calcular el nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantVendida, cantRecibida);
        
        //Mostrar el resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        // Ejercicio11
        // Solicitar el precio del producto al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precioP = input.nextDouble();
        
        // Llamar al método que calcula y muestra el descuento
        calcularDescuentoEspecial(precioP);
        
        // Arrays y Recursividad
        
        // Ejercicio12
        // Inicializar un array con precios
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // Mostrar los valores originales por consola
        System.out.println("Precios originales:");
        for (double precioN : precios) {
            System.out.println("Precio: $" + precioN);
        }
        System.out.println(); 

        // Modificar el precio de un producto
        int indiceAModificar = 2; 
        double nuevoPrecio = 119.99;
        precios[indiceAModificar] = nuevoPrecio;
        
        // Mostrar por consola los valores modificados
        System.out.println("Precios modificados:");
        for (double precioN : precios) {
            System.out.println("Precio: $" + precioN);
        }
        
        //Ejercicio13
        // Inicializar un array con precios
        double[] preciosI = {199.99, 299.50, 149.75, 399.00, 89.99};

        // Usar la función recursiva para mostrar los precios originales
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(preciosI, 0);
        
        // Modificar el precio de un producto
        int indiceModificar = 2; 
        double nuevoPrecio13 = 129.99;
        preciosI[indiceModificar] = nuevoPrecio13;
        
        // Usar la misma función recursiva para mostrar los valores modificados
        System.out.println("\nPrecios modificados:");
        imprimirArrayRecursivo(preciosI, 0);
        
        
    }
    
}
