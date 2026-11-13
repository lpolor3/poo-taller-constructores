package tallerconstructores;

public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "Estudiante Genérico";
        this.edad = 18;
        this.curso = "Sin asignar";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Programación Orientada a Objetos";
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso + "]";
    }
}