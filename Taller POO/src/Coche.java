public class Coche {
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private int velocidadMaxima;

    // Constructor vacío
    public Coche() {
        this.marca = "";
        this.modelo = "";
        this.añoFabricacion = 0;
        this.velocidadMaxima = 0;
    }

    // Constructor con parámetros
    public Coche(String marca, String modelo, int añoFabricacion, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int edadCoche() {
        int añoActual = 2025;
        return añoActual - añoFabricacion;
    }

    public boolean esRapido() {
        return velocidadMaxima > 200;
    }

    @Override
    public String toString() {
        return "Coche {" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año de fabricacion=" + añoFabricacion +
                ", velocidad maxima=" + velocidadMaxima + " km/h" +
                '}';
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Ferrari", "F8 Tributo", 2020, 340);
        Coche coche2 = new Coche("Toyota", "Corolla", 2018, 180);

        System.out.println(coche1);
        System.out.println("Edad: " + coche1.edadCoche() + " años");
        System.out.println("Corre duro? ");
        System.out.println(coche1.esRapido() ? "Si" : "No");
        System.out.println();

        System.out.println(coche2);
        System.out.println("Edad: " + coche2.edadCoche() + " años");
        System.out.println("Corre duro? ");
        System.out.println(coche2.esRapido() ? "Si" : "No");
    }
}