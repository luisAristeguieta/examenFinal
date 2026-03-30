package examenFinal;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Billetera Digital =====");
        System.out.println();

        Billetera billetera = new Billetera("Carlos Mendoza", "BW-00123", 500.00);
        billetera.mostrarInfo();
        System.out.println();
        billetera.depositar(150.00);
        System.out.println();
        billetera.retirar(200.00);

        System.out.println();

        Transaccion transaccion = new Transaccion("TRANSFERENCIA", 75.00, "Pago de servicio");
        transaccion.mostrarDetalle();
        System.out.println();
        transaccion.aplicarComision(2.5);
        System.out.println();
        transaccion.marcarFallida();

        System.out.println();

        Contacto contacto = new Contacto("Laura Torres", "BW-00456", "BilleteraXYZ");
        contacto.mostrarContacto();
        System.out.println();
        contacto.marcarFavorito();
        System.out.println();
        contacto.enviarDinero(120.00);

        System.out.println();
        System.out.println("===== Fin del sistema =====");
    }
}