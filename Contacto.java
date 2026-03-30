
package examenFinal;

public class Contacto {
    private String nombre;
    private String cuentaDestino;
    private String banco;
    private boolean favorito;

    public Contacto(String nombre, String cuentaDestino, String banco) {
        this.nombre = nombre;
        this.cuentaDestino = cuentaDestino;
        this.banco = banco;
        this.favorito = false;
    }
}