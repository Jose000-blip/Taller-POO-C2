public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int añoPublicacion;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroPaginas = 0;
        this.añoPublicacion = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numeroPaginas, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.añoPublicacion = añoPublicacion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean esAntiguo() {
        int añoActual = 2025;
        return (añoActual - añoPublicacion) > 20;
    }

    @Override
    public String toString() {
        return "Libro {" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numero de paginas=" + numeroPaginas +
                ", año de publicacion=" + añoPublicacion +
                '}';
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471, 1967);
        Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 489, 2003);

        System.out.println(libro1);
        System.out.println("Es viejo? ");
        System.out.println(libro1.esAntiguo() ? "Si" : "No");
        System.out.println();

        System.out.println(libro2);
        System.out.println("Es viejo? ");
        System.out.println(libro2.esAntiguo() ? "Si" : "No");
    }
}