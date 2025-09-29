public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor vacío
    public CuentaBancaria() {
        this.numeroCuenta = "";
        this.titular = "";
        this.saldo = 0.0;
    }

    // Constructor con parámetros
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de $" + monto);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0");
        }
    }


    public void retirar(double monto) {
        if (monto > 0) {
            if (saldo >= monto) {
                saldo -= monto;
                System.out.println("Retiro exitoso de $" + monto);
            } else {
                System.out.println("ERROR: Fondos insuficientes. Saldo actual: $" + saldo);
            }
        } else {
            System.out.println("El monto a retirar debe ser mayor a 0");
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria {" +
                "numero de cuenta='" + numeroCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=$" + saldo +
                '}';
    }


    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.println("=== CREAR CUENTA BANCARIA ===");
        System.out.print("Ingrese número de cuenta: ");
        String numeroCuenta = scanner.nextLine();

        System.out.print("Ingrese nombre del titular: ");
        String titular = scanner.nextLine();

        System.out.print("Ingrese saldo inicial: $");
        double saldoInicial = scanner.nextDouble();


        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, titular, saldoInicial);

        System.out.println("\nEstado inicial:");
        System.out.println(cuenta);
        System.out.println();


        System.out.print("Ingrese monto a depositar: $");
        double montoDeposito = scanner.nextDouble();
        cuenta.depositar(montoDeposito);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        System.out.println();


        System.out.print("Ingrese monto a retirar: $");
        double montoRetiro = scanner.nextDouble();
        cuenta.retirar(montoRetiro);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        System.out.println();

        System.out.println("Estado final:");
        System.out.println(cuenta);

        scanner.close();
    }
}