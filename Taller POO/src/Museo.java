public class Museo {
    private String nombre;
    private String ciudad;
    private int añoInauguracion;
    private int capacidadVisitantes;
    private double costoEntrada;
    private int colecciones;
    private int visitantesAnuales;

    // Constructor con todos los parámetros
    public Museo(String nombre, String ciudad, int añoInauguracion,
                 int capacidadVisitantes, double costoEntrada,
                 int colecciones, int visitantesAnuales) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.añoInauguracion = añoInauguracion;
        this.capacidadVisitantes = capacidadVisitantes;
        this.costoEntrada = costoEntrada;
        this.colecciones = colecciones;
        this.visitantesAnuales = visitantesAnuales;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getAñoInauguracion() {
        return añoInauguracion;
    }

    public int getCapacidadVisitantes() {
        return capacidadVisitantes;
    }

    public double getCostoEntrada() {
        return costoEntrada;
    }

    public int getColecciones() {
        return colecciones;
    }

    public int getVisitantesAnuales() {
        return visitantesAnuales;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setAñoInauguracion(int añoInauguracion) {
        this.añoInauguracion = añoInauguracion;
    }

    public void setCapacidadVisitantes(int capacidadVisitantes) {
        this.capacidadVisitantes = capacidadVisitantes;
    }

    public void setCostoEntrada(double costoEntrada) {
        this.costoEntrada = costoEntrada;
    }

    public void setColecciones(int colecciones) {
        this.colecciones = colecciones;
    }

    public void setVisitantesAnuales(int visitantesAnuales) {
        this.visitantesAnuales = visitantesAnuales;
    }

    public int antiguedad() {
        int añoActual = 2025;
        return añoActual - añoInauguracion;
    }

    public double ingresosAnuales() {
        return visitantesAnuales * costoEntrada;
    }

    public double promedioVisitantesPorColeccion() {
        if (colecciones > 0) {
            return (double) visitantesAnuales / colecciones;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "=========================================\n" +
                "           INFORMACIÓN DEL MUSEO         \n" +
                "=========================================\n" +
                "Nombre: " + nombre + "\n" +
                "Ciudad: " + ciudad + "\n" +
                "Año de Inauguración: " + añoInauguracion + "\n" +
                "Capacidad de Visitantes: " + capacidadVisitantes + " personas\n" +
                "Costo de Entrada: $" + costoEntrada + "\n" +
                "Colecciones Permanentes: " + colecciones + "\n" +
                "Visitantes Anuales: " + visitantesAnuales + "\n" +
                "=========================================";
    }

    public static void main(String[] args) {
        Museo museoPrado = new Museo("Museo del Prado", "Madrid", 1819,
                5000, 120000, 12, 2000000);

        System.out.println(museoPrado);
        System.out.println();
        System.out.println("Antiguedad: " + museoPrado.antiguedad() + " años");
        System.out.println("Ingresos Anuales: $" + String.format("%.2f", museoPrado.ingresosAnuales()));
        System.out.println("Promedio de Visitantes por Colección: " +
                String.format("%.2f", museoPrado.promedioVisitantesPorColeccion()) + " visitantes");
    }
}