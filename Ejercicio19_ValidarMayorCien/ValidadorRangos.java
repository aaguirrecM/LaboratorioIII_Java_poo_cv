package Ejercicio19_ValidarMayorCien;

public class ValidadorRangos {
    public static void validarMayorQueCien(int numero) {
        if (numero <= 100) {
            throw new IllegalArgumentException("El valor " + numero + " no es válido. Debe ser estrictamente mayor a 100.");
        }
    }
}