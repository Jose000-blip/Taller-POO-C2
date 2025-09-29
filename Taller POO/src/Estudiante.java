public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
        this.nombre = "";
        this.edad = 0;
        this.carrera = "";
        this.promedio = 0.0;
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean aprobo() {
        return promedio >= 3.0;
    }

    public boolean esMayorEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Estudiante {" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juanito Mendoza", 20, "Ingeniería de Sistemas", 3.8);

        System.out.println(estudiante1);
        System.out.println("¿Aprobó? " + (estudiante1.aprobo() ? "Sí" : "No"));
        System.out.println("¿Es mayor de edad? " + (estudiante1.esMayorEdad() ? "Sí" : "No"));
    }
}