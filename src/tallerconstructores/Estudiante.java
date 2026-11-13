package tallerconstructores;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // 1. Constructor por defecto que asigna valores genéricos
    public Estudiante() {
        this.nombre = "Estudiante Genérico";
        this.edad = 18;
        this.curso = "Sin asignar";
    }

    // 2. Constructor que acepta como parámetros el nombre y la edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Programación Orientada a Objetos"; // Valor por defecto para el curso
    }

    // 3. Constructor que acepta todos los parámetros y utiliza this() para llamar al constructor anterior
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llamada al constructor de dos parámetros usando this()
        this.curso = curso; // Asignamos el tercer parámetro restante
    }

    // Método para mostrar los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.println("-----------------------------------");
    }
}