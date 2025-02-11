package pagoOnlineEjercicio;

public class PagoPaypal implements Pago{

    @Override
    public void procesarPago(double monto) {
        // TODO Auto-generated method 
        
        System.out.println("Realizando pago de "+ monto+ " $ con Paypal");

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("Pago realizado correctamente");
        
    }

   

}
