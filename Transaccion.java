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
}
