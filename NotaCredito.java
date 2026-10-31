package Ejercicio16_ComprobantesFiscales;

public class NotaCredito implements ComprobanteFiscal {
    private static final double IVA = 0.21;

    @Override
    public void emitirComprobante(double montoNeto) {
        double iva = montoNeto * IVA;
        System.out.println("NOTA DE CRÉDITO (revierte la venta)");
        System.out.printf("  Neto: -%,.2f | IVA: -%,.2f | TOTAL A FAVOR DEL CLIENTE: -%,.2f%n",
                montoNeto, iva, montoNeto + iva);
    }
}
