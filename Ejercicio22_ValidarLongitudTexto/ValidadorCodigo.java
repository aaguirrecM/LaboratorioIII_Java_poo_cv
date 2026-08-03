package Ejercicio22_ValidarLongitudTexto;

public class ValidadorCodigo {
    private static final int LONGITUD_REQUERIDA = 6;

    public static void validarLongitudExacta(String codigo) {
        if (codigo == null || codigo.length() != LONGITUD_REQUERIDA) {
            int longitudActual = (codigo == null) ? 0 : codigo.length();
            throw new IllegalArgumentException("El código debe tener exactamente " + LONGITUD_REQUERIDA + 
                                               " caracteres. Se recibieron " + longitudActual + ".");
        }
    }
}