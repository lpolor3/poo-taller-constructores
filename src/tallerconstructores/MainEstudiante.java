package tallerconstructores;

public class MainEstudiante {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   PRUEBA - ESTUDIANTE (EJERCICIO 3)");
        System.out.println("========================================");

        // 1. Probando el constructor por defecto
        Estudiante est1 = new Estudiante();
        System.out.println("Estudiante 1 (Por defecto):");
        est1.mostrarDetalles();

        // 2. Probando el constructor con nombre y edad
        Estudiante est2 = new Estudiante("Luis Polo", 20);
        System.out.println("Estudiante 2 (Nombre y Edad):");
        est2.mostrarDetalles();

        // 3. Probando el constructor con todos los parámetros usando this()
        Estudiante est3 = new Estudiante("Carlos Pérez", 22, "Ingeniería de Software");
        System.out.println("Estudiante 3 (Todos los parámetros con this()):");
        est3.mostrarDetalles();
    }
}
