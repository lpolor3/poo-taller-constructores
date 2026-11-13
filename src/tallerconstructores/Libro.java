package tallerconstructores;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + "]";
    }
}