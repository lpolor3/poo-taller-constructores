package tallerconstructores;

import java.util.Scanner;

public class ProyectoIntegradorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("     PROYECTO INTEGRADOR - CONSTRUCTORES EN JAVA");
        System.out.println("==================================================");

        // 1. Creación de objetos utilizando diferentes constructores (Predefinidos)
        System.out.println("\n--- 1. Objetos creados con diferentes constructores ---");
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        CuentaBancaria cuenta1 = new CuentaBancaria("1029384756", 250000.0, "Ahorros");
        Estudiante estudiante1 = new Estudiante("Luis Polo", 20, "Ingeniería de Software");

        System.out.println(libro1);
        System.out.println(cuenta1);
        System.out.println(estudiante1);

        // 2. Ingresar datos por consola para inicializar objetos
        System.out.println("\n--- 2. Ingreso de datos por consola para nuevos objetos ---");

        // Ingreso para Libro
        System.out.println("\n[Registro de Libro]");
        System.out.print("Ingrese el título del libro: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autorLibro = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        int paginasLibro = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Libro libroUsuario = new Libro(tituloLibro, autorLibro, paginasLibro);

        // Ingreso para Cuenta Bancaria
        System.out.println("\n[Registro de Cuenta Bancaria]");
        System.out.print("Ingrese el número de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoCuenta = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese el tipo de cuenta (Ahorros/Corriente): ");
        String tipoCuenta = scanner.nextLine();

        CuentaBancaria cuentaUsuario = new CuentaBancaria(numCuenta, saldoCuenta, tipoCuenta);

        // Ingreso para Estudiante
        System.out.println("\n[Registro de Estudiante]");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEst = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edadEst = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese el curso: ");
        String cursoEst = scanner.nextLine();

        Estudiante estudianteUsuario = new Estudiante(nombreEst, edadEst, cursoEst);

        // 3. Mostrar los detalles utilizando el método toString()
        System.out.println("\n==================================================");
        System.out.println("   RESULTADOS FINALES (Usando toString())");
        System.out.println("==================================================");
        System.out.println(libroUsuario);
        System.out.println(cuentaUsuario);
        System.out.println(estudianteUsuario);

        scanner.close();
    }
}