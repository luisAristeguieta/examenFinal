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
    
}
