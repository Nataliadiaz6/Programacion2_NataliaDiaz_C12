
package nataliadiaztp4c12;


public class NataliaDiazTP4C12 {


    public static void main(String[] args) {

        // Crear empleados usando el primer constructor (todos los parámetros)
        Empleado emp1 = new Empleado("Natalia Diaz", "Gerente de Proyectos", 75000.0);
        Empleado emp2 = new Empleado("Nicolas Tampanelli", "Analista de Datos", 50000.0);

        // Crear un empleado usando el segundo constructor (nombre y puesto)
        Empleado emp3 = new Empleado("Nehemias Tampanelli", "Desarrollador Junior");
        
        System.out.println("\nInformacion inicial de los empleados");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("\nAumentando salarios");
        // Aplicar aumento por porcentaje a Natalia
        System.out.println("Salario de Natalia antes del aumento: $" + emp1.getSalario());
        emp1.actualizarSalario(10.0); // Aumento del 10%
        System.out.println("Salario de Natalia despues del aumento del 10%: $" + emp1.getSalario());

        // Aplicar aumento por cantidad fija a Nicolas
        System.out.println("\nSalario de Nicolas antes del aumento: $" + emp2.getSalario());
        emp2.actualizarSalario(2000); // Aumento de 2000
        System.out.println("Salario de Nicolas despues del aumento de $2000: $" + emp2.getSalario());

        // Aplicar aumento por porcentaje a Nehemias
        System.out.println("\nSalario de Nehemias antes del aumento: $" + emp3.getSalario());
        emp3.actualizarSalario(15.0); // Aumento del 15%
        System.out.println("Salario de Nehemias despues del aumento del 15%: $" + emp3.getSalario());

        System.out.println("\nInformacion final de los empleados");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
        // Mostrar el total de empleados creados usando el método estático
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    
    }
    
}
