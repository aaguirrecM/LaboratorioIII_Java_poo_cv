package Ejercicio17_ErrorCharAt;

public class Lector {
    public static char obtenerCaracterEnPosicion(String texto, int indice) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo.");
        }
        return texto.charAt(indice); // Lanza StringIndexOutOfBoundsException si el índice es inválido
    }
}