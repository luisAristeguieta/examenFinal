package examenFinal;

public class Transaccion {
    private String tipo;
    private double monto;
    private String descripcion;
    private boolean exitosa;

    public Transaccion(String tipo, double monto, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        this.exitosa = true;
    }

    public void mostrarDetalle() {
        System.out.println("--- Detalle de Transacción ---");
        System.out.println("Tipo: " + tipo);
        System.out.printf("Monto: $%.2f%n", monto);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Estado: " + (exitosa ? "Exitosa" : "Fallida"));
    }

    public void aplicarComision(double porcentaje) {
        if (porcentaje < 0) {
        System.out.println("Invalid commission percentage.");
        return;
        }
        double comision = monto * (porcentaje / 100);
        double total = monto + comision;
        System.out.printf("Comisión (%.1f%%): $%.2f%n", porcentaje, comision);
        System.out.printf("Monto total con comisión: $%.2f%n", total);
    }

    --Agrego comentario para marcar la transacción como fallida--

    public void marcarFallida() {
        exitosa = false;
        System.out.println("Transaction marked as failed.");
        System.out.printf("Monto afectado: $%.2f%n", monto);
    }

}
