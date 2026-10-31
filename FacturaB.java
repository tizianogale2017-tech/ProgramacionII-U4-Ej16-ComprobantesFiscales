package Ejercicio16_ComprobantesFiscales;

public class FacturaB implements ComprobanteFiscal {
    private static final double IVA = 0.21;

    @Override
    public void emitirComprobante(double montoNeto) {
        double total = montoNeto * (1 + IVA);
        System.out.println("FACTURA B (consumidor final, IVA incluido)");
        System.out.printf("  TOTAL: %,.2f (IVA contenido: %,.2f)%n", total, total - montoNeto);
    }
}
