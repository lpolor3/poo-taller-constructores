package tallerconstructores;

public class MainLibro {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRUEBA - CONSTRUCTORES (EJERCICIO 1)");
        System.out.println("==========================================");

        // Probando el constructor por defecto
        Libro libroPorDefecto = new Libro();
        System.out.println("Libro con Constructor por Defecto:");
        System.out.println(libroPorDefecto); // Usando toString() automáticamente

        // Probando el constructor parametrizado
        Libro libroParametrizado = new Libro("Clean Code", "Robert C. Martin", 464);
        System.out.println("Libro con Constructor Parametrizado:");
        System.out.println(libroParametrizado); // Usando toString() automáticamente
    }
}
