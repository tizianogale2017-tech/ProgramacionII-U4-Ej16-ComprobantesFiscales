package Ejercicio16_ComprobantesFiscales;

import java.util.ArrayList;
import java.util.List;

public class CajaRegistradora {
    private final List<ComprobanteFiscal> comprobantes = new ArrayList<>();

    public void agregar(ComprobanteFiscal comprobante) {
        comprobantes.add(comprobante);
    }

    public void emitirTodos(double montoNeto) {
        if (montoNeto <= 0) {
            throw new IllegalArgumentException("El monto neto debe ser positivo");
        }
        for (ComprobanteFiscal c : comprobantes) {
            c.emitirComprobante(montoNeto);
        }
    }
}
