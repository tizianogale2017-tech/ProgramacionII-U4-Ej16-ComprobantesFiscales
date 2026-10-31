package Ejercicio16_ComprobantesFiscales;

public class FacturaA implements ComprobanteFiscal {
    private static final double IVA = 0.21;
    private static final double RETENCION = 0.03;

    @Override
    public void emitirComprobante(double montoNeto) {
        double iva = montoNeto * IVA;
        double retencion = montoNeto * RETENCION;
        System.out.println("FACTURA A (responsable inscripto)");
        System.out.printf("  Neto: %,.2f | IVA 21%%: %,.2f | Retención 3%%: %,.2f | TOTAL: %,.2f%n",
                montoNeto, iva, retencion, montoNeto + iva - retencion);
    }
}
