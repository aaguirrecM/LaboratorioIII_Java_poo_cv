package Ejercicio23_ControlarEntradaUsuario;

public class ProcesadorPedidos {
    public static void registrarCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad comprada debe ser mayor a cero.");
        }
        System.out.println("Procesando pedido para " + cantidad + " unidades.");
    }
}