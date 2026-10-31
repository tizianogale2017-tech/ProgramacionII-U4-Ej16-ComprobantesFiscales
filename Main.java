package Ejercicio16_ComprobantesFiscales;

public class Main {
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();
        caja.agregar(new FacturaA());
        caja.agregar(new FacturaB());
        caja.agregar(new NotaCredito());

        caja.emitirTodos(100000);
    }
}
