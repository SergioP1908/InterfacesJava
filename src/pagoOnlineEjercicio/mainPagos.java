package pagoOnlineEjercicio;

import funcionesUtilidades.Utilidades;

public class mainPagos {

    public static void main(String[] args) {
        
        PagoPaypal pagoPaypal = new PagoPaypal();
        pagoTarjetaCredito pagoTarjeta = new pagoTarjetaCredito();
        PagoCriptomonedas pagoTransferencia = new PagoCriptomonedas();

        mainPagos mp = new mainPagos();
        mp.metodoPago(new Pago[]{pagoPaypal,pagoTarjeta,pagoTransferencia});
    }

    private void metodoPago(Pago[]pagos){
        for (Pago pago : pagos) {
            int cantidad = Utilidades.pideDatoNumerico("Introduce cantidad a pagar: ");

            procesadorPagos.realizarPago(pago, cantidad);
        }
    }

}
