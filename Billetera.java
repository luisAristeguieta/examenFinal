package examenFinal;

public class Billetera {
    private String propietario;
    private String numeroCuenta;
    private double saldo;
    private boolean activa;

    public Billetera(String propietario, String numeroCuenta, double saldoInicial) {
        this.propietario = propietario;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.activa = true;
    }
    public void mostrarInfo() {
        System.out.println("=== Billetera Digital ===");
        System.out.println("Propietario: " + propietario);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.printf("Saldo: $%.2f%n", saldo);
        System.out.println("Estado: " + (activa ? "Activa" : "Inactiva"));
    }
}
