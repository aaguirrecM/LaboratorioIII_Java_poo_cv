package Ejercicio24_ReintentarLectura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean pinValido = false;
        int pinGuardado = 0;

        while (!pinValido) {
            System.out.print("Ingresa tu PIN de seguridad (4 dígitos): ");
            String entrada = scanner.nextLine();

            try {
                pinGuardado = GestorSeguridad.validarPin(entrada);
                pinValido = true; // Si no hubo excepciones, salimos del ciclo

            } catch (NumberFormatException e) {
                System.out.println("-> Error. Debe ingresar únicamente números enteros.\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Error. " + e.getMessage() + "\n");
            }
        }

        System.out.println("\nPIN guardado con éxito: " + pinGuardado);
        scanner.close();
    }
}