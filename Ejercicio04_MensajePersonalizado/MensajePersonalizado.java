package Ejercicio04_MensajePersonalizado;

import java.util.Scanner;

public class MensajePersonalizado {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu edad: ");
        String entrada = lectorTeclado.nextLine();

        try {
            int edad = Integer.parseInt(entrada);
            System.out.println("Gracias. Tu edad registrada es: " + edad + " años.");

        } catch (NumberFormatException e) {
            System.out.println("Lo sentimos, '" + entrada + "' no es un número válido. Por favor intenta de nuevo ingresando solo dígitos.");
        } finally {
            lectorTeclado.close();
        }
    }
}