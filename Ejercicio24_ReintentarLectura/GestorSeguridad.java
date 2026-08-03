package Ejercicio24_ReintentarLectura;

public class GestorSeguridad {
    public static int validarPin(String entrada) {
        int pin = Integer.parseInt(entrada); // Puede lanzar NumberFormatException

        if (entrada.length() != 4) {
            throw new IllegalArgumentException("El PIN debe constar de exactamente 4 dígitos.");
        }
        return pin;
    }
}