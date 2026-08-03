package Ejercicio21_ValidarEmailSimple;

public class ValidadorEmail {
    public static void validarFormatoEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("El correo debe contener '@' y punto '.'. Entrada recibida: '" + email + "'");
        }
    }
}