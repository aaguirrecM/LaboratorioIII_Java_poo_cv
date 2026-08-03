package Ejercicio22_ValidarLongitudTexto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un código promocional (6 caracteres): ");
        String codigo = scanner.nextLine();

        try {
            ValidadorCodigo.validarLongitudExacta(codigo);
            System.out.println("Código '" + codigo + "' aceptado correctamente");

        } catch (IllegalArgumentException e) {
            System.out.println("Error de formato: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}