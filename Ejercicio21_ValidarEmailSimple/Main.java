package Ejercicio21_ValidarEmailSimple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu correo electrónico: ");
        String correo = scanner.nextLine();

        try {
            ValidadorEmail.validarFormatoEmail(correo);
            System.out.println("¡Correo electrónico validado y guardado!: " + correo);

        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}