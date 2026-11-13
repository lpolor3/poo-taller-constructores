package tallerconstructores;

public class MainEstudiante {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   PRUEBA - ESTUDIANTE (EJERCICIO 3)");
        System.out.println("========================================");

        Estudiante est1 = new Estudiante();
        System.out.println("Estudiante 1 (Por defecto):");
        System.out.println(est1);

        Estudiante est2 = new Estudiante("Luis Polo", 20);
        System.out.println("Estudiante 2 (Nombre y Edad):");
        System.out.println(est2);

        Estudiante est3 = new Estudiante("Carlos Pérez", 22, "Ingeniería de Software");
        System.out.println("Estudiante 3 (Todos los parámetros con this()):");
        System.out.println(est3);
    }
}
