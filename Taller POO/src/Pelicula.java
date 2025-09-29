
public class Pelicula {
    private String titulo;
    private String director;
    private int duracionMinutos;
    private int añoEstreno;

    // Constructor vacío
    public Pelicula() {
        this.titulo = "";
        this.director = "";
        this.duracionMinutos = 0;
        this.añoEstreno = 0;
    }

    // Constructor con parámetros
    public Pelicula(String titulo, String director, int duracionMinutos, int añoEstreno) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
        this.añoEstreno = añoEstreno;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public boolean esLarga() {
        return duracionMinutos > 120;
    }

    public int antiguedad() {
        int añoActual =2025;
        return añoActual - añoEstreno;
    }

    @Override
    public String toString() {
        return "Pelicula {" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion en minutos=" + duracionMinutos +
                ", año de estreno=" + añoEstreno +
                '}';
    }

    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("El Señor de los Anillos: El Retorno del Rey",
                "Peter Jackson", 201 , 2003);

        System.out.println(pelicula1);
        System.out.println("Es larga? ");
        System.out.println(pelicula1.esLarga() ? "Si" : "No");
        System.out.println("Antiguedad: " + pelicula1.antiguedad() + " años");
    }
}