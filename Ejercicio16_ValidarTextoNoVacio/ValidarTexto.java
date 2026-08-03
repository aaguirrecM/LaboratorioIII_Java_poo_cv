package Ejercicio16_ValidarTextoNoVacio;

public class ValidarTexto {
    public static void asegurarTextoNoVacio(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El texto ingresado no puede estar vacío ni contener solo espacios.");
        }
    }
}